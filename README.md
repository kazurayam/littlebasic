# BASIC言語のインタープレタをJavaで作る話

このweb記事を読んだ。

- ["Easy intro to writing a BASIC interpreter (with ANTLR)" by Matei, Nov_2017](
  https://mateiw.github.io/antlr-intro/)

この記事は[BASIC](https://ja.wikipedia.org/wiki/BASIC)言語のインタープレターをJava言語で実装した事例である。
BASIC言語の文法を記述したファイルをパーサー・ジェネレータ[ANTLR](https://www.antlr.org/)に与える。
ANTLRがパーサを構成するJavaコードを生成する。
自動生成されたコードを利用する形でインタープレタをJava言語で実装している。ビルドツールGradleを用いている。 

わたしはこの記事が紹介するJavaコードを写経して動かしてみた。
そのコードはよくできていてほとんど修正不要だった。
しかし細かいところで問題がいくつかあった。
わたしが見つけた解決方法を記述し公開しようと思う。

## 前提条件

わたしは下記の環境で作業した。

- macOS 14.5
- openjdk version 17.0.11
- Gradle 8.5
- IntelliJ IDEA 2023.3.2

あなたがJava開発環境を持っていて、Javaプログラミングに習熟しており、Gradleによるビルドを実行できると前提する。入門的な解説はしない。

## BASICインタープレターの動かし方

わたしが今回作ったコード一式を下記URLで公開している。

- https://github.com/kazurayam/littlebasic

下記のURLからレポジトリのコード一式をまとめたzipファイルがダウンロードできる。

- https://github.com/kazurayam/littlebasic/releases

zipをダウンロードして `~/tmp/littlebasic` ディレクトリに解凍したと仮定する。

次のコマンドによってビルドが実行される。

```
$ cd ~/tmp/littlebasic
$ gradle generateGrammarSource
...
$ gradle jar
...
```

jarファイルができたらBASICインタープレターを実行する用意が完了する。

サンプルとしてのBASICプログラムがひとつzipの中に含まれている。

- [littlebasic/app/src/test/fixtures/RunGCD.bas](https://github.com/kazurayam/littlebasic/blob/master/app/src/test/fixtures/RunGCD.bas)

```
REM Greatest common divisor
INPUT "A=" ain
INPUT "B=" bin
a = VAL(ain)
b = VAL(bin)

WHILE b > 0
    t = a MOD b
    a = b
    b = t
END

PRINT "GCD=" + a
```

このBASICプログラムを起動すると、変数Aに数値を指定してねと要求してくる。Aに数値を指定すると、続いて変数Bにも数値を指定してねと要求してくる。Bに数値を指定すると演算が実行され、Greatest Common Divisor
すなわちAとBの最大公約数が表示される。

ターミナルのウインドウで実際にどういう操作をすれば、どういう結果が返ってくるか、いくつか実例を示そう。

```
:~/tmp/littlebasic
$ java -jar app/build/libs/app.jar app/src/test/fixtures/runGCD.bas
A= 128
B= 32
GCD=32
```

```
:~/tmp/littlebasic
$ java -jar app/build/libs/app.jar app/src/test/fixtures/runGCD.bas
A= 78
B= 49
GCD=1
```

```
:~/tmp/littlebasic
$ java -jar app/build/libs/app.jar app/src/test/fixtures/runGCD.bas
A= 3120
B= 45
GCD=15
```

>BASIC、どうですか？ 40年ぐらい前、NEC PC-8000シリーズのパソコンを初めて触った時のことをわたしは思い出しました。まさにこんなBASICを打ち込んだら、動いた。おおお！とか、あああ？とか、呟きながら没頭したっけなあ。

### ANTLR Grammarファイル

BASIC言語の文法が下記3つの `.g4` ファイルに記述されています。本家 [https://github.com/mateiw/littlebasic](https://github.com/mateiw/littlebasic/tree/master/src/main/antlr4/basic) が公開しているファイルをコピーしました。１文字も書き換えていません。

- [basic/LBExpression.g4](https://github.com/kazurayam/littlebasic/blob/master/app/src/main/antlr/basic/LBExpression.g4)
- [basic/LBTokens.g4](https://github.com/kazurayam/littlebasic/blob/master/app/src/main/antlr/basic/LBTokens.g4)
- [basic/LittleBasic.g4](https://github.com/kazurayam/littlebasic/blob/master/app/src/main/antlr/basic/LittleBasic.g4)

ANTLRに関してここでは説明しません。他の書籍やweb記事を参照してください。

### BASICインタープレターのJavaコード

BASICインタープレターの入り口となるJavaクラスのソースは下記のようなものです。

- [demo.App](https://github.com/kazurayam/littlebasic/blob/develop/app/src/main/java/demo/App.java)

```
package demo;

import org.littlebasic.Interpreter;
import org.littlebasic.Value;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.newInputStream;

public class App {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            throw new IllegalArgumentException(
                    "Usage: java -jar app/build/libs/app.jar " +
                            "app/src/test/fixtures/runGCD.bas");
        }
        Path bas = Paths.get(args[0]);
        assert Files.exists(bas);
        InputStream basicCode = newInputStream(bas);

        // create the Interpreter instance
        Interpreter interpreter =
                new Interpreter(System.in, System.out, System.err);
        //
        Value value = interpreter.run(basicCode);
    }
}
```

見ての通り、`org.littlebasic.Interpreter`クラスの中にすべての秘密が隠されています。
このコードも本家 [https://github.com/mateiw/littlebasic](https://github.com/mateiw/littlebasic/tree/master/src/main/java/org/littlebasic) が公開したものを
そのまま拝借しました。

## 疑問点と解消法

今回、わたしが遭遇した疑問点とその解消法を説明しましょう。それは
Gradleビルドファイル [app/build.gradle](https://github.com/kazurayam/littlebasic/blob/develop/app/build.gradle) のなかの
次の記述に集約されています。

```
plugins {
    id 'antlr'
}
...
generateGrammarSource {
    arguments += [
            "-lib", "src/main/antlr/basic",
            "-package", "basic",
            "-visitor",
            "-long-messages"]
    maxHeapSize = "64m"
}
```

Gradleプラグイン [antlr](https://docs.gradle.org/current/userguide/antlr_plugin.html) を使いました。
このプラグインを適用すると `generateGrammarSource` タスクが追加されます。`generateGrammarSource`タスクが間接的にANTLRを実行して、文法記述ファイル `.g4` からJavaソース群を生成してくれます。

### `-lib`オプションを指定する必要があった

ものは試し、`build.gradle`ファイルをちょっと変更してみましょう。

```
generateGrammarSource {
    arguments += [
            /* "-lib", "src/main/antlr/basic", */
            "-package", "basic",
            ...
```
つまり`-lib`オプションを指定しなかったらどうなるか？を試してみよう。

```
$ cd ~/tmp/littlebasic
$ gradle clean generateGrammarSource

> Task :app:generateGrammarSource
error(110): basic/LBExpression.g4:2:7: can't find or load grammar LBTokens
...
```

エラーが発生しました。[`basic/LBExpression.g4`](https://github.com/kazurayam/littlebasic/blob/develop/app/src/main/antlr/basic/LBExpression.g4) ファイルの2行目で、`LBTokens`を探したが見つからなかった、と。ANTLRのドキュメント [ANTLR Tool Commandline Options](https://chromium.googlesource.com/external/github.com/antlr/antlr4/+/15720d1e33d7e03b2ca22f65f9260cfefae46505/doc/tool-options.md)の
`-lib` オプションに関する説明を参照しましょう。

>When looking for tokens files and imported grammars, ANTLR normally looks in the current directory. This option specifies which directory to look in instead.

ANTLRが `base/LBExpression.g4` ファイルを処理しようとしたところ2行目に `import LBTokens;` と書いてあった。
だからANTLRはLBTokensを探し出す必要があるのだが、LBTokensがどこのディレクトリにあるのか？もしも`-lib`オプションの指定が無ければANTLRはカレントディレクトリだけを探す。見つからなければエラーになる。このエラーを回避するには `-lib`オプションで `LBTokens.g4` が配置されたディレクトリのパスを指定する必要があった。

### `-package`オプションを指定する必要があった

ものは試し、`build.gradle`ファイルをちょっと変更してみましょう。

```
generateGrammarSource {
    arguments += [
            "-lib", "src/main/antlr/basic",
            /* "-package", "basic", */
            ...
```
つまり`-package`オプションを指定しなかったらどうなるか？を試してみよう。

```
$ gradle clean generateGrammarSource compileJava

> Task :app:compileJava
/Users/kazuakiurayama/github/littlebasic/app/src/main/java/org/littlebasic/LittleBasicVisitor.java:3: エラー: パッケージbasicは存在しません
import basic.LBExpressionParser;
            ^
/Users/kazuakiurayama/github/littlebasic/app/src/main/java/org/littlebasic/LittleBasicVisitor.java:4: エラー: パッケージbasicは存在しません
import basic.LittleBasicBaseVisitor;
            ^
/Users/kazuakiurayama/github/littlebasic/app/src/main/java/org/littlebasic/LittleBasicVisitor.java:5: エラー: パッケージbasicは存在しません
import basic.LittleBasicParser;
            ^
...
```

ANTLRが文法からJavaコードを生成する処理は静かに完了したが、Javaコードをコンパイルするところで「パッケージbasicは存在しません」というエラーが大量に吐き出されました。なぜか？

ANTLRが `app/build/generated-src/antlr/main/basic/LBExpressionParser.java`ファイルを生成していたので、そのソースコードの冒頭を見てみました。

```
// Generated from basic/LBExpression.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antl1.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LBExpressionParser extends Parser {
    ...
```

本来ならば冒頭にパッケージ宣言文 `package basic;` があるべきだが、無い。ANTLRが生成した
全ての `*.java` ファイルに同じ問題が発生してしまいました。

ANTLRコマンドのオプション `-package ____` を指定することによってこの問題を解消することができました。

### `-visitor`オプションを指定する必要があった

ものは試し、`build.gradle`ファイルをちょっと変更してみましょう。

```
generateGrammarSource {
    arguments += [
            "-lib", "src/main/antlr/basic",
            "-package", "basic",
            /* "-visitor", */
            ...
```
つまり`-visitor`オプションを指定しなかったらどうなるか？を試してみよう。

```
$ gradle clean generateGrammarSource compileJava

> Task :app:compileJava FAILED
/Users/kazuakiurayama/github/littlebasic/app/src/main/java/org/littlebasic/LittleBasicVisitor.java:4: エラー: シンボルを見つけられません
import basic.LittleBasicBaseVisitor;
            ^
  シンボル:   クラス LittleBasicBaseVisitor
  場所: パッケージ basic
...
```

ANTLRが文法からJavaコードを生成する処理は静かに完了したが、Javaコードをコンパイルするところで「basic.LittleBasicBaseVisitorクラスが見つかりません」というエラーが吐き出されました。なぜか？

ANTLRがJavaコードを生成したはずのディレクトリを覗いてみると確かに `basic/LittleBasicBaseVisitor.java` ファイルがありません。

<img src="https://kazurayam.github.io/littlebasic/images/generatedGrammarSource_without_visitor.png" alt="without_visitor" width="264" height="379">

公式ドキュメント [ANTLR Tool Command Line Options](https://chromium.googlesource.com/external/github.com/antlr/antlr4/+/15720d1e33d7e03b2ca22f65f9260cfefae46505/doc/tool-options.md) にこう書いてありました。

>-visitor
>ANTLR does not generate parse tree visitors by default. This option turns that feature on. ANTLR can generate both parse tree listeners and visitors; this option and -listener aren’t mutually exclusive.

ANTLRに`basic/LittleBasicBaseVisitor.java`ファイルを生成させたければ `-visitor` オプションを明示的に指定する必要がある、のでした。

## 結論

ANTLRを使ってBASIC言語の処理系をJavaで作ることができました。わたしは次にVBAすなわちMicrosoft ExcelのVisual Basic for Applicationのソースコードを解析するプログラムをJavaで作ってみようと思う。Excel VBAで仕事していて困り果てたことが多々ある。VBAパーサとそれに基づく解析ツールを作れば解決できる課題もあると考えているから。さてどこまでできるやら。




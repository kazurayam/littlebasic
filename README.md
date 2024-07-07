# ANTLRとGradleを使って　Basic言語のインタープレタをJavaで作る話

このweb記事を読んだ。

- ["Easy intro to writing a BASIC interpreter (with ANTLR)" by Matei, Nov_2017](
  https://mateiw.github.io/antlr-intro/)

この記事は[BASIC](https://ja.wikipedia.org/wiki/BASIC)言語のインタープレターをJava言語で実装した事例である。
Basic言語の文法をBNF記法で記述したファイルをパーサー・ジェネレータ[ANTLR](https://www.antlr.org/)に与える。
ANTLRがパーサのJavaコードを自動生成する。
自動生成されたコードを利用する形でインタープレタをJava言語で実装している。
ビルドツールとしてはGradleを用いている。 

わたしはこの記事が紹介するJavaコードを写経して動かしてみた。
そのコードはよくできていて修正はほとんど不要だった。
しかし細かい問題がいくつかあった。
わたしが見つけた情報を記述し公開しようと思う。

## 前提条件

あなたがJava開発環境を持っていて、Javaプログラミングに習熟しており、Gradleによるビルドを
実行できると前提する。わたしは下記の環境で作業した。

- macOS 14.5
- openjdk version 17.0.11
- Gradle 8.5
- IntelliJ IDEA 2023.3.2

## BASICインタープレターの動かし方

わたしが開発したコード一式を下記URLで公開している。

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

BASICプログラムのサンプルがzipの中に含まれている。

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

このBASICプログラムは変数Aに数値を指定してねと要求してくる。Aに数値を指定すると、
変数Bにも数値を指定してねと要求してくる。Bに数値を指定すると、Greatest Common Divisor
すなわち最大公約数を演算で求めて表示する。

Terminalのウインドウで実際にどういう操作をすれば、どういう結果が返ってくるか、いくつか例をしめそう。

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

>BASIC、どうですか？ 40年ぐらい前、NEC PC-8000シリーズのパソコンを触った時のことをわたしは思い出しました。まさにこんなBASICを打ち込んだら動いた。おおお！とか、あああ？とか、呟きながら没頭したっけなあ。

### ANTLR Grammarファイル

BASIC言語の文法は下記3つの `.g4` ファイルに記述されています。これは本家[https://github.com/mateiw/littlebasic](https://github.com/mateiw/littlebasic/tree/master/src/main/antlr4/basic)が公開しているファイルのコピーです。１文字も書き換えていません。

- [basic/LBExpression.g4](https://github.com/kazurayam/littlebasic/blob/master/app/src/main/antlr/basic/LBExpression.g4)
- [basic/LBTokens.g4](https://github.com/kazurayam/littlebasic/blob/master/app/src/main/antlr/basic/LBTokens.g4)
- [basic/LittleBasic.g4](https://github.com/kazurayam/littlebasic/blob/master/app/src/main/antlr/basic/LittleBasic.g4)

ANTLRに関してここでは説明しません。他の書籍やweb記事を参照してください。

# ANTLRとGradleを使って　Basic言語のインタープレタをJavaで作る話

## 
このweb記事を読んだ。

- ["Easy intro to writing a BASIC interpreter (with ANTLR)" by Matei, Nov_2017](
  https://mateiw.github.io/antlr-intro/)

この記事はBasic言語のインタープレターをJava言語で実装することを目標としている。
Basic言語の文法を記述した`.g4`ファイルをパーサー・ジェネレータ[ANTLR](https://www.antlr.org/)に与えて、
パーサのJavaコードを自動生成する。 ビルドツールとしてはGradleを用いている。 
なお、この記事が紹介するコード一式は下記のGitHubレポジトリで公開されている。

- https://github.com/mateiw/littlebasic

わたしはこの記事を写経して動かすことを試みた。この記事はよくできていていて、公開されたコードはほぼそのままで動作した。
しかし説明が漏れているところがいくつかあって、疑問を解決するのに土日まるまる費やした。
わたしが見つけた補足情報を記録して公開することにした。

```
:~/github/littlebasic (master *+)
$ java -jar app/build/libs/app.jar app/src/test/fixtures/runGCD.bas
A= 128
B= 32
GCD=32
```

```
:~/github/littlebasic (master *+)
$ java -jar app/build/libs/app.jar app/src/test/fixtures/runGCD.bas
A= 78
B= 49
GCD=1
```

```
:~/github/littlebasic (master *+)
$ java -jar app/build/libs/app.jar app/src/test/fixtures/runGCD.bas
A= 3120
B= 45
GCD=15
```
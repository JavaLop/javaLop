# 第一节-JAVASE概述
```
    1.计算机语言的发展史
    2.Java的发展历史
    3.Java的特性
    4.JDK的安装与环境变量的配置
    5.第一个Java程序
```

## 1.计算机语言的发展史
```
1.计算机语言总的来说分为机器语言，汇编语言，高级语言三大类。而这三种语言也恰恰是计算机语言发展历史的三个阶段。

2.机器语言：机器语言是第一代计算机语言。这种语言本质上是计算机能识别的唯一语言，人类很难理解。

3.汇编语言：汇编语言用助记符代替了操作码。用地址符号或标号代替地址码。这样就用符号代替了机器语言的二进制码。汇编语言也称为符号语言。 比起机器语言，汇编大大进步了。

4.高级语言：高级语言是一种接近于人们使用习惯的程序设计语言。它允许用英文写计算程序，程序中得符号和式子也与日常用的数学式子差不多。
```

## 2.JAVA的发展历史
![Alt text](/img/1.png "Optional title")
```
1.Java的历史要追溯到1991年，由James Gosling（Java之父）领导的Sun Microsystems公司的工程师小组想要设计一种用于消费类电子产品的小型的计算机语言。


2.Gosling把这种语言称为“Oak”（大概是因为他非常喜欢Sun公司办公室外的橡树）。Sun公司的人后来发现Oak是一种已有的计算机语言的名字，在重新更名的时候看到某个小组成员正端着一杯爪哇咖啡，所以于1995年将其更名为Java。

```

## 3.JAVA的特性
```
Java是一种简单、跨平台、面向对象、
健壮、的高级编程语言
```

## 4.JDK的安装与环境变量的设置

![Alt text](/img/3.png)
![Alt text](/img/2.png)

```
1、下载安装JDK

2、右键我的电脑--属性，win7系统打开我的电脑后点击高级系统设置，选择环境变量

3、点击新建系统变量，变量名为JAVA_HOME,变量值为JDK的安装目录

4、在系统变量中找到path，在变量值中加入%JAVA_HOME%\bin,点击确定

5、运行CMD，输入java -version，即可看到环境配置成功


1.JDK1.7的下载
    -1.打开IE浏览器
    -2.输入Java JDK下载地址：http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    -2.选择 "downloads"  然后往下看，查找到"Java SE Development Kit 8u91"
    -3.选择"Accept License Agreement"
    -4.找到"Windows x64	187.4 MB  	jdk-8u91-windows-x64.exe"
    -5.点击：jdk-8u91-windows-x64.exe 就下载了

2.JDK1.7的安装
    -1.下载完成后，打开"jdk-8u45-windows-i586_8.0.450.14.1429092020.exe" 文件
    -2.然后进行安装，说明：路径最好安装到D盘
            如：D:\Develop\Java
                D:\Develop\Java\jdk1.8.0_91
                D:\Develop\Java\jre1.8.0_91
2.java JDK1.7 系统环境变量的配置
    -1.选择我的电脑、鼠标右键--->属性
    -2.选择高级系统设置
    -3.选择高级--->环境变量
    -4.找到系统变量
        1). 添加一个：JAVA_HOME的变量
            变量名：JAVA_HOME
            变量值: D:\Develop\Java\jdk1.8.0_91

            查看Java JDK安装后的版本：
            输入命令：java -version  回车
                     java version "1.8.0_91"
                     Java(TM) SE Runtime Environment (build 1.8.0_91-b14)
                     Java HotSpot(TM) 64-Bit Server VM (build 25.91-b14, mixed mode)

        2).配置：Path
                变量名：Path
                变量值：;%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin

            输入：javac  它就会在 %JAVA_HOME% 这个目录下去查找
            C:\ProgramData\Oracle\Java\javapath;%SystemRoot%\system32;%SystemRoot%;%SystemRoot%\System32\Wbem;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\;%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;D:\Develop\nodejs\;D:\Develop\Git\cmd;D:\Develop\Git\mingw64\bin;D:\Develop\Git\usr\bin

        3).配置：CLASSPATH
                变量名：CLASSPATH
                变量值：.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
        4). 运行查看安装成功的状态
            输入命令：javac -version     回车，然后就会看到安装后的一个版本号 javac 1.8.0_91    
```
### 4.第一个java程序
```
    1.第一个java程序

    /*
        public  公共的(它是一个修饰符)
        class   类
        Test    类名(这个类名必须与文件相同)
    */
    public class Test{
        /*
            static  静态的(它是一个修饰符)
            void    无返回值
            main    方法名, 也是一个java程序的入口程序，主方法，主线程
            String  字符串,    String[] 字符串数组
            args    变量名，    ----->是可以修改的
        */
        public static void main(String[] args){
            System.out.println("第一个java程序 Hello World！");
        }
    }    
```
```
    /*
    2.第二个java程序
    */
    public class Test2{
        public static void main(String[] args){
            System.oug.println("欢迎大家来到中国深圳！！");
        }
    }
```

### 5.课后做作业业
```
    1.安装好 JDK 并配置好环境变量
    2.写一个程序，在控制台打印 "Hello World"
```

### 6.预习知识点
```
    1.public class 与 class 的区别
    2.环境变量 classpath 对 java 命令的影响
    3.java 程序易错点讲解
    4.java中注释的使用
    5.使用javadoc工具生成类的描述文档
    6.转义符的使用
```

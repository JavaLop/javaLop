### 1.Java JDK的安装
```
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
### 2.第一个java程序
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

### 课后做作业业
```
    1.安装好 JDK 并配置好环境变量
    2.写一个程序，在控制台打印 "Hello World"
```

### 预习知识点
```
    1.public class 与 class 的区别
    2.环境变量 classpath 对 java 命令的影响
    3.java 程序易错点讲解
    4.java中注释的使用
    5.使用javadoc工具生成类的描述文档
    6.转义符的使用
```

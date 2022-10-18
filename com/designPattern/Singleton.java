
/*
        单例模式（Singleton Design Pattern）保证一个类只能有一个实例，并提供一个全局访问点。

        单例模式的实现需要三个必要的条件：

        单例类的构造函数必须是私有的，这样才能将类的创建权控制在类的内部，从而使得类的外部不能创建类的实例。
        单例类通过一个私有的静态变量来存储其唯一实例。
        单例类通过提供一个公开的静态方法，使得外部使用者可以访问类的唯一实例。
 */


//饿汉式的单例实现比较简单，其在类加载的时候，静态实例instance 就已创建并初始化好了。
package designPattern;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
  /*  饿汉式单例优缺点：

    优点：
    单例对象的创建是线程安全的；
    获取单例对象时不需要加锁。
    缺点：单例对象的创建，不是延时加载。
    一般认为延时加载可以节省内存资源。但是延时加载是不是真正的好，要看实际的应用场景，而不一定所有的应用场景都需要延时加载。*/
}
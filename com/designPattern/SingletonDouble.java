package designPattern;

//饿汉式和懒汉式的单例都有缺点，双重检测的实现方式解决了这两者的缺点
public class SingletonDouble {

    private static SingletonDouble instance;

    private SingletonDouble() {

    }

    private SingletonDouble getInstance() {
        synchronized (SingletonDouble.class) {
            if (instance == null) {
                instance = new SingletonDouble();
            }
        }
        return instance;
    }
/*    双重检测单例优点：

    对象的创建是线程安全的。
    支持延时加载。
    获取对象时不需要加锁。*/
}



/*静态内部类
        用静态内部类的方式实现单例类，利用了Java 静态内部类的特性：

        Java 加载外部类的时候，不会创建内部类的实例，只有在外部类使用到内部类的时候才会创建内部类实例。
        SingletonInner 是一个静态内部类，当外部类 Singleton 被加载的时候，并不会创建 SingletonInner 实例对象。
        只有当调用 getInstance() 方法时，SingletonInner 才会被加载，这个时候才会创建 instance。instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。
        静态内部类单例优点：对象的创建是线程安全的。支持延时加载。
        */
class SingletonIn{
    private SingletonIn(){

    }

    private static class SingletonInner{
        private static final SingletonIn instatance=new SingletonIn();
    }

    private static SingletonIn getInstance(){
        return SingletonInner.instatance;
    }
}


/*枚举
        用枚举来实现单例，是最简单的方式。这种实现方式通过 Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性。

public enum Singleton {
    INSTANCE; // 该对象全局唯一
}*/



/*与饿汉式对应的是懒汉式，懒汉式为了支持延时加载，将对象的创建延迟到了获取对象的时候，但为了线程安全，不得不为获取对象的操作加锁，这就导致了低性能。
并且这把锁只有在第一次创建对象时有用，而之后每次获取对象，这把锁都是一个累赘（双重检测对此进行了改进）。*/
package designPattern;
public class SingletonE {

    private static  SingletonE instance ;

    private SingletonE() {

    }

    public static synchronized SingletonE getInstance() {
        if (instance == null) {
            instance = new SingletonE();
        }
        return instance;
    }
    /*懒汉式单例优缺点：

    优点：
    对象的创建是线程安全的。
    支持延时加载。
    缺点：获取对象的操作被加上了锁，影响了并发度。
    如果单例对象需要频繁使用，那这个缺点就是无法接受的。
    如果单例对象不需要频繁使用，那这个缺点也无伤大雅。*/
}
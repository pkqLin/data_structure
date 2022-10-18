package designPattern;


import java.util.HashMap;
import java.util.Map;

/*上面介绍了5 种单例模式的实现方式，下面作为对单例模式的扩展，再来介绍一下多例模式以及线程间唯一的单例模式。先来看下多例模式。

        单例模式是指，一个类只能创建一个对象。那么多例模式就是，一个类可以创建多个对象，但是对象个数可以控制。

        对于多例模式，我们可以将类的实例都编上号，然后将实例存放在一个 Map 中。*/
public class MultiInstance {

    private long instance;

    private static final Map<Long,MultiInstance> ins =new HashMap<>();

    static {
        ins.put(1L,new MultiInstance(1));
        ins.put(2L, new MultiInstance(2));
        ins.put(3L, new MultiInstance(3));
    }

    private MultiInstance(long n){}
    public MultiInstance getInstance(long n){
        return ins.get(n);
    }
}

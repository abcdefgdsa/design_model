package singleton.type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}


//饿汉式（静态变量）
class Singleton{
    private Singleton(){

    }

    private final static Singleton instance=new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
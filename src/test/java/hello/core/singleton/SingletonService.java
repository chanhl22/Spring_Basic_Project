package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

//    //아래 코드는 같은 클래스가 아닌 다른 클래스에서 생성해야 안되는 것을 확인할 수 있음. (private는 자기 자신을 호출할 수 있음)
//    public static void main(String[] args) {
//        SingletonService singletonService1 = new SingletonService();
//        SingletonService singletonService2 = new SingletonService();
//    }

}

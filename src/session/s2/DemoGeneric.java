package session.s2;

public class DemoGeneric<K,V> {
    K name;
    V age;
    // khai bao dang generic
    public <E> void sendMessage(E msg){
        System.out.println(msg);
    }

    public static <N> void tinhTong(N a,N b){
        if(a instanceof Integer){
            System.out.println((Integer)a+(Integer)b);
        }else if(a instanceof Double){
            System.out.println((Double)a+ (Double)b);
        }
    }
}

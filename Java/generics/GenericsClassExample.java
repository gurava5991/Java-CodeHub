package generics;
class Box<T>{
    T val;
    Box(T val){
        this.val = val;
    }
    public T getVal(){
        return val;
    }
    public void setVal(T val){
        this.val = val;
    }
}
public class GenericsClassExample {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(12);
        System.out.println(box.getVal());
    }
}

@FunctionalInterface
interface myLamda{
    public int add(int x, int y);
}

public class LamdaClass{
    public static void main(String[] args){
        myLamda m = (x,y)-> x+y;
        int res = m.add(3,5);
        System.out.print(res);
    }
}

// output : 8 

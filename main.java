import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Set<Integer> hashSet2 = HashSetRiempito();
        hashSet2.add(6);

        for(Integer pippo : hashSet2){
            if(alfredons.equals(6)){
                hashSet2.remove(pippo);
            }
        }
        System.out.println(hashSet2);
        hashSet2.clear();
        System.out.println(hashSet2);
    }
    public static Set<Integer> HashSetRiempito(){
        Set<Integer> setInteger = new HashSet<Integer>();
        setInteger.add(1);
        setInteger.add(5);
        setInteger.add(3);

        return setInteger;
    }

}

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

//        zad 1
        UnaryOperator<Integer> liczba = x -> x*x ;
        System.out.println(liczba.apply(2));

//        zad 2

        Predicate<Integer> liczba2 = y -> {
            if (y%5==0){
                System.out.println("Jest Podzielny przez 5");
                return true;
            }
            else{
                System.out.println("Nie jest podzielny przez 5");
                return false;
            }
        };
        System.out.println(liczba2.test(2));



//        zad 3
        BiConsumer<String,Integer> zad3 = (String x, Integer y) ->{
          for (int z = 0; z<y;z++){
              System.out.println(x);
          }
        };
        zad3.accept("wow",2);

    }
}
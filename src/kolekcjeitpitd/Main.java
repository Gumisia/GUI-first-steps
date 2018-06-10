package kolekcjeitpitd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Collection a;
        ArrayList<String> b = new ArrayList();

        b.add(new String("lala0"));
        b.add(new String("lala1"));
        b.add(new String("lala2"));
        b.add(new String("lala3"));
        b.add(new String("lala4"));
        b.add(new String("lala5"));

        b.add(new String("lala"));
//        b.add(new Integer(4));

//        for(int i=0; i<b.size(); i++)
//            System.out.println((String)b.get(i));

        for( String stringus : b)
            System.out.println(stringus);

        Zwykla<String> nazwaZmiennej = new Zwykla();
        nazwaZmiennej.nadajWartosc("cosik");
        System.out.println(nazwaZmiennej.zwroc());

        /*

            FF12    FF13    FF14
            get(0)  get(1)  get(2)


            A={1,1,1,1}
            B={1}
            A=B


            A={2,3,4}
            B={4,3,2}
            A=B

            mapping - przyporządkowanie
            KEY - VALUE

         */

        Map c;
    }

}
class Zwykla <COKOLWIEK>{
    public void nadajWartosc(COKOLWIEK wartosc){
        this.nazwaZniennejCOKOL = wartosc;
    }
    public COKOLWIEK zwroc(){
        return this.nazwaZniennejCOKOL;
    }
    COKOLWIEK nazwaZniennejCOKOL;

}

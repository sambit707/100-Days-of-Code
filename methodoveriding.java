import other.tool.advcalc;
import other.tool.calc;

class calc{
    public int add(int n1 , int n2){
        return  n1 + n2;
    }
}

class advcalc extends calc{
    public int add(int n1 , int n2){
        return  n1 + n2 + 1;
    }
}

public class methodoveriding {

    public static void main(String[] args) {
        advcalc obj = new advcalc();
        int r1 = obj.add(4, 5);
        System.out.println(r1);
    }
}
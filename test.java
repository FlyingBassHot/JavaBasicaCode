package day6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    operator oper=new operator();
    bean demo=new bean();
        Scanner sc=new Scanner(System.in);
        System.out.println("which operator do you want to use?");
        System.out.println("1:let bean1 jump");
        System.out.println("2:let bean2 jump");
    while(true){
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                oper.operating(demo.bean1());
                break;
                case 2:
                    oper.operating(demo.bean2());
                    break;
        }
    }
    }
}

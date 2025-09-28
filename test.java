package day5;

import day5.media;
import day5.player;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        media m = new media();

        System.out.println("----------------");
        System.out.println("welcome to media player!");
        System.out.println("select your choice");
        System.out.println("1.listen music");
        System.out.println("2.listen story");

        int choice =sc.nextInt();
        switch (choice) {
            case 1:
                player p=m.musicPlayer();

                System.out.println("1.添加音乐");
                System.out.println("2.播放音乐");
                System.out.println("3.停止播放");
                System.out.println("4.退出");
                while(true){
                int choice2 = sc.nextInt();
                switch(choice2){
                    case 1: p.add(); break;
                    case 2: p.playAppoint(); break;
                    case 3: p.stop(); break;
                    case 4: return; // 退出循环
                    default: System.out.println("invalid choice");
                }
            }
        case 2:
            p = m.storyMedia();
            System.out.println("1.add story");
            System.out.println("2.start story");
            System.out.println("3.stop story");
            System.out.println("4.退出"); // 注意这里应该是 storyPlayer
            while(true){
                int choice2 = sc.nextInt();
                switch(choice2){
                    case 1: p.add(); break;
                    case 2: p.playAppoint(); break;
                    case 3: p.stop(); break;
                    case 4: return;
                    default: System.out.println("invalid choice");
                }
            }
            default : System.out.println("invalid choice");
            break;
        }

    }
}
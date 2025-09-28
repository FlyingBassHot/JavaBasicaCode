package day5;

import java.util.Scanner;

public class media {
    Scanner sc = new Scanner(System.in);
    /*
    music
     */
    public player musicPlayer()
    {
        return new player() {
            private int index=1;
            private music[] musics=new music[10];
            @Override
            public void playAppoint() {
                System.out.println("说出你要听的歌的序号");
                int number=sc.nextInt();
                if(index>=0&&number<index)
                {
                    System.out.println(musics[number].getSongName()+"正在播放");
                }
                else
                {
                    System.out.println("播放列表没有此音乐，换首歌吧");
                }

            }

            @Override
            public void stop() {
                System.out.println("music已经停止播放了");
            }

            @Override
            public void add() {
                System.out.println("请输入要添加歌曲的名字 歌曲时长：");
                String musicName = sc.next();
                int duration = sc.nextInt();
                musics[index] = new music(musicName, duration);
                System.out.println("成功添加 " + musics[index].getSongName() + " 首歌曲！");
                index++;
            }

        };
    }
    public player storyMedia()
    {
        return new player() {
            public int index=1;
            private storyTelling[] story=new storyTelling[10];

            @Override
            public void add() {
                System.out.println("please enter the bookname and the name of the telling man ");
                String bookName = sc.nextLine();
                String personName = sc.nextLine();
                story[index]=new storyTelling(bookName,personName);
                System.out.println("the name called"+story[index].getStoryName()+"has added!");

            }

            @Override
            public void playAppoint() {
                System.out.println("please enter the bookname that you would like to play ");
                String bookName = sc.nextLine();
                for(int i=0; i<=index; i++)
                {
                    if(story[i].getStoryName().equals(bookName))
                    {
                        System.out.println(story[i].getStoryName()+"is working"+"the reader is"+story[i].getTellPeopleName());
                        return;
                    }
                }
                System.out.println("there don't have the book called "+bookName);
            }

            @Override
            public void stop() {
                System.out.println(story[index-1].getStoryName()+"has stopped");
            }
        };
    }
}


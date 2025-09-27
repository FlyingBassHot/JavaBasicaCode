package day6;

public class bean {
    public jumpKill bean1()
    {
        return new jumpKill(){
            @Override
            public void jump() {
                System.out.println("demo1 can jump now");
            }

    };
    }
    public jumpKill bean2()
    {
        return new jumpKill(){
            @Override
            public void jump() {
                System.out.println("demo2 can jump now!");
            }
        };
    }
}

import java.util.Random;
import java.util.Scanner;



public class 打地鼠 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("欢迎来到‘打地鼠’游戏   -99 会重新开始游戏  -88会退出游戏");
        char arr[]=new char [random.nextInt(2,9)];
        for (int i = 0; i < arr.length; i++) {
            arr[i]='0';
        }
        int flag=5;
        int score=0;
        int ok=0;
        int notok=0;
        while (flag!=0)
        {
            System.out.println("第"+(6-flag)+"次打地鼠");
            for (int i = 0; i < arr.length; i++) {
                System.out.print((i+1)+" ");
            }

            int rand_num=random.nextInt(0,arr.length);
            arr[rand_num]='X';

            System.out.println();
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            flag--;
            System.out.println("玩家请击打");
            int num=scanner.nextInt();
            if (num==99)
            {
                flag=5;
                System.out.println("您重新开始了游戏");

            } else if (num==88) {
                flag=0;
                System.out.println("您退出了游戏");

            }

            if (num==rand_num+1&&num!=88&num!=99)
            {
                System.out.println("打中啦");
                score+=2;
                ok++;
            }else if(num!=rand_num+1&&num!=88&num!=99)
            {
                System.out.println("没有打中哦");
                score-=1;
                notok++;
            }

            System.out.println();
            arr[rand_num]='0';
        }
        System.out.println("score="+score);
        System.out.println("打中了"+ok+"次");
        System.out.println("没打中"+notok+"次");
    }
}

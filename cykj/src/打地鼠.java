import java.util.Random;
import java.util.Scanner;

public class 打地鼠 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("欢迎来到‘打地鼠’游戏   -99 会重新开始游戏  -88会退出游戏");

        int rdnum=random.nextInt(2,9);
        char arr[][]=new char [rdnum][rdnum];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                arr[i][j]='0';
            }
        }
        int flag=5;
        int score=0;
        int ok=0;
        int notok=0;
        while (flag!=0)
        {
            System.out.println("第"+(6-flag)+"次打地鼠");
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(i+" ");
            }

            int rand_num_y=random.nextInt(0,arr.length);
            int rand_num_x=random.nextInt(0,arr.length);
            arr[rand_num_x][rand_num_y]='X';

            System.out.println();
            for (int i = 0; i <arr.length ; i++) {
                System.out.print((i+1)+" ");
                for (int j = 0; j <arr.length ; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();

            flag--;
            System.out.println("玩家请击打 X,Y");
            int num_x=scanner.nextInt();
            int num_y=scanner.nextInt();
            if (num_x==99||num_y==99)
            {
                flag=5;
                System.out.println("您重新开始了游戏");

            } else if (num_x==88||num_y==88) {
                flag=0;
                System.out.println("您退出了游戏");

            }

            if (num_x==rand_num_x+1&&num_x!=88&num_x!=99&&num_y==rand_num_y+1&&num_y!=99&&num_y!=88)
            {
                System.out.println("打中啦");
                score+=2;
                ok++;
            }else if(num_x!=rand_num_x+1&&num_x!=88&num_x!=99||num_y!=rand_num_y+1&&num_y!=88&num_y!=99)
            {
                System.out.println("没有打中哦");
                score-=1;
                notok++;
            }

            System.out.println();
            arr[rand_num_x][rand_num_y]='0';
        }
        System.out.println("score="+score);
        System.out.println("打中了"+ok+"次");
        System.out.println("没打中"+notok+"次");
    }
}

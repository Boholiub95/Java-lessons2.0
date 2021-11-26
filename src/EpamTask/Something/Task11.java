package EpamTask.Something;

import java.util.Scanner;

class Task11
{
    public static void main(String arg[])

    {

        int n;double res=0;

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        int a[]=new int[n];


        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            res =res+a[i];


        System.out.println(Math.ceil(res/n));

    }

}
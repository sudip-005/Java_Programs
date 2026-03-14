import java.util.*;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Students: ");
        int n=sc.nextInt();
        int[] m=new int[n];
        int sum=0, max=0, min=100;

        for(int i=0;i<n;i++){
            m[i]=sc.nextInt();
            if(m[i]<0||m[i]>100){ i--; continue; }
            sum+=m[i];
            if(m[i]>max) max=m[i];
            if(m[i]<min) min=m[i];
        }

        System.out.println("Total: "+sum);
        System.out.println("Average: "+(sum/n));
        System.out.println("Highest: "+max+" Lowest: "+min);

        for(int i=0;i<n;i++)
            System.out.println("Student "+(i+1)+": "+m[i]+
            (m[i]>=40?" Pass":" Fail"));
    }
}
import java.util.*;
class TextEditor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        StringBuffer sb=new StringBuffer(sc.nextLine());

        System.out.println("Text: "+sb);
        System.out.println("Length: "+sb.length());
        System.out.println("Capacity: "+sb.capacity());

        sb.append(" Added");
        System.out.println("After append: "+sb);

        sb.insert(2,"NEW");
        System.out.println("After insert: "+sb);
    }
}
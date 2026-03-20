import java.util.*;
class DocumentSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        StringBuffer doc=new StringBuffer(sc.nextLine());
        doc.append(" Added");
        System.out.println("Updated: "+doc);
        System.out.print("Search word: ");
        String w=sc.nextLine();
        System.out.println("Position: "+doc.indexOf(w));
        System.out.println("Final Document: "+doc.toString());
    }
}
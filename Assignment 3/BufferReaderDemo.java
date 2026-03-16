import java.io.*;

class BufferedReaderDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter name: ");
        String name = br.readLine();
        System.out.println("Hello " + name);
    }
}

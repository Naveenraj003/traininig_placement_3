import java.io.*;

class FileStudent {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Name: Naveen\n");
            fw.write("Department: AIML\n");
            fw.write("Year: 3\n");
            fw.close();

            FileReader fr = new FileReader("student.txt");
            int ch;
            System.out.println("Student Details:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}

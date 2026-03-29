import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int index = fileName.lastIndexOf('.');
        String extension = fileName.substring(index + 1);

        System.out.println("File Extension: " + extension);
    }
}
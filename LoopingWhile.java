import java.util.Scanner;

class LoopingWhile{
    public static void main(String[] args) {
        boolean runApp = true;
        while(runApp==true){
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih 1 untuk lanjut run aplikasi : ");
            System.out.println("Pilih 2 untuk lanjut run aplikasi : ");
            System.out.println("Pilih 3 untuk stop aplikasi : ");

            int x=input.nextInt();
            switch(x){
                case 1 : 
                    System.out.println("kamu pilih 1");
                    break;
                case 2 :
                    System.out.println("kamu pilih 2");
                    break;
                default :
                    runApp = false;
                    break;
            }
            
        }
    }
}
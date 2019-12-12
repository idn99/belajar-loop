class IsPrima{
    public static void main(String[] args) {

        int[] angka ={3,10,7,11,15,16,23,50};

        for(int j=0;j<angka.length;j++){
            
            int a = angka[j];
            boolean isPrime = true;
            for(int i=2;i<a;i++){
                if(a%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println(a);
            }
        }
            

    }
}
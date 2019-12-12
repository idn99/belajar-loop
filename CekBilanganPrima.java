class CekBilanganPrima{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int i ;
        boolean isPrime = true;
        for(i=2;i<a;i++){
            if(a%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println("Bilangan Prima");
        }else{
            System.out.println("Bukan Bilangan Prima");
        }
        
    }
}
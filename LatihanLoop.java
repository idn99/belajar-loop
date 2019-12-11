class LatihanLoop{
    
    public static void Cetak(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        
        int[] data = {10,34,5,23,6,7,55,20,260,273,333};
        

        for(int i=0;i<data.length;i++){

            if(data[i]%2 != 0){
                Cetak(data[i]);
            }

        }

    }
}
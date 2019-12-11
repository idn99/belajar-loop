class LatihanData{
    
    public static void Cetak(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        
        int[] data = {10,2,5,23,6,7,55,20,260,273,333};

        int indexTerkecil = 0;

        for(int i=0;i<data.length;i++){

            if(data[indexTerkecil] > data[i]){
                indexTerkecil = i;
            }
        }
        Cetak(data[indexTerkecil]);

    }
}
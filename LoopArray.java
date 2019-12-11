class LoopArray{
    
    public static void Cetak(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        
        int[] ganjil = {1,3,5,7,9,11};

        for(int i=0;i<ganjil.length;i++){
            try{
                Cetak(ganjil[i]);
            }catch(Exception e){
                Cetak("Index ke - "+e.getMessage()+" Tidak ada");
            }
        }
    }
}
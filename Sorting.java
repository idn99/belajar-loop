class Sorting{
    public static void main(String[] args) {

        int[] data = {3,10,5,50,51,2,4,-2,6};

        for(int index = 0;index<data.length;index++){

            int indexTerkecil = index;

            for(int i=indexTerkecil;i<data.length;i++){

                if(data[indexTerkecil] > data[i]){

                    indexTerkecil = i;

                }

            }
            int temp = data[index];
            data[index] = data[indexTerkecil];
            data[indexTerkecil] = temp;
        }

        // for each , khusus array
        for(int j : data){
            System.out.println(j);
        }

    }
}
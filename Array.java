public class Array{

	public static void main(String[] args) {
		
		//deklarasi array
		int[] usia = new int[10];

		usia[0] = 20;
        usia[1] = 30;
        usia[2] = 10;
        usia[3] = 20;
        usia[4] = 30;
        usia[5] = 10;

        //mencetak isi array
        for(int i=0; i<usia.length; i++){
            System.out.println(usia[i]);
        }
 	}
}
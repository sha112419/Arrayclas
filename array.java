package array;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]shahid=new int[7];
		shahid[0]=78;
		shahid[1]=45;
		shahid[2]=23;
		shahid[3]=12;
		shahid[4]=90;
		shahid[5]=56;
		shahid[6]=76;
		System.out.println(shahid[2]);
		int[]mani= {56,78,3,4,5,6,7,8,6,0};
		System.out.println(mani.length);
		System.out.println("1st element:"+mani[0]);
		System.out.println("2nd element:"+mani[1]);
		System.out.println("3rd element:"+mani[2]);
		System.out.println("4th element:"+mani[3]);
		System.out.println("5th element:"+mani[4]);
		System.out.println("6th element:"+mani[5]);
		System.out.println("7th element:"+mani[6]);
		System.out.println("8th element:"+mani[7]);
		System.out.println("9th element:"+mani[8]);
		
		
		int[]age= {6,5,6,7,8,9,2,3,4};
		System.out.println("using for loop condition:");
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		int[]age1= {67,5,6,34,22,33,44,55,66,77,88,99};
		System.out.println("using for each loop:");
		for(int a:age1) {
			System.out.println(a);
		}

	}

}

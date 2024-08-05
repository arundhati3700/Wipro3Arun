package corejava_30Jul;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j;
		for(;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if(i==j)
					System.out.println(" " + 1);
				else
					System.out.println(" " + 0);
			}
			System.out.println();
		}

	}

}

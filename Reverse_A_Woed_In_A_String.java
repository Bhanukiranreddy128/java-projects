package java11_6_2025;

public class Reverse_A_Woed_In_A_String {

	public static void main(String[] args) {
				String st= "Hi i am BhanuKiranReddy";
				String[] w=st.split(" ");
				for(int i=w.length-1;i>=0;i--) {
					System.out.print(w[i]+"  ");
				}
			}

	}

import java.util.Arrays;

public class Challenge01 {

	public static void main(String[] args) {

		
		String str = "My name is Avatar";
		
		String[] result = str.split(" ");
		
		for(String i: result) {
			System.out.print(i + ", ");
		}
		
		System.out.println(Arrays.toString(result));
		
		System.out.println(result[2]);
		
	}

}

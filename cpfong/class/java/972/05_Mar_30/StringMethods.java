public class StringMethods{
	public static void main(String args[]){
		String x="this", y="This", z=" This      ";	
		String v="this is a test"; // t h i s  i s  a  t e s t 
		String w="My best friend is John who is a student";

		// 比較
		if (x.equals(y)) { System.out.println("equal"); }
		if (x.equalsIgnoreCase(y)) { System.out.println("EQuaL"); }

		// 修改
		System.out.println(y.toUpperCase());
		System.out.println(z.trim());

		// 分析
		System.out.println("" + "Java Programming".length());
		System.out.println("" + "C Language".substring(2));
		System.out.println("" + "vb script".charAt(3));
		System.out.println("" + "php".indexOf("p", 1));

		for (int i=0; i<v.length(); i++){
			System.out.print(v.charAt(i) + " ");
		}
		System.out.print("\n");

		int k = w.indexOf("John");
		System.out.println(w.substring(0,k) + "Tom who is a student");
	}
}


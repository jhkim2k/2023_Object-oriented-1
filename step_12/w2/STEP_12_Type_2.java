class Type_21 {
	void type_test() {
		Boolean	Bl = false;
		Byte 		Bt = 65;
		Short 	St = 0x41;
		Character	Ch = 'A';
		Integer	It = 0101;
		Long		Lg = 65L;
		Float		Ft = 1e-2f;
		Double 	Db = 0.01;
		String 	Sg = "Java";

		System.out.println("Type_21...");
		System.out.println(Bl);
		System.out.println(Bt);
		System.out.println(St);
		System.out.println(Ch);
		System.out.println(It);
		System.out.println(Lg);
		System.out.println(Ft);
		System.out.println(Db);
		System.out.printf("%d, %d, %d, %c, %d, %d, %f, %f\n",
							Bl, Bt, St, Ch, It, Lg, Ft, Db);
	}
}
/*
class Type_22 {
	void type_test() {
		Boolen	Bl = new Boolean(flase);
		Byte 		Bt = new Byte((byte)65);
		Short 	St = new Short((short)0x41);
		Character	Ch = new Character('A');
		Integer	It = new Integer(0101);
		Long		Lg = new Long(65L);
		Float		Ft = new Float(le-2f);
		Double 	Db = new Double(0.01);
		String 	Sg = new String("Java");

		System.out.println("Type_22...");
		System.out.println(Bl);
		System.out.println(Bt);
		System.out.println(St);
		System.out.println(Ch);
		System.out.println(It);
		System.out.println(Lg);
		System.out.println(Ft);
		System.out.println(Db);
		System.out.printf("%d, %d, %d, %c, %d, %d, %f, %f\n",
							Bl, Bt, St, Ch, It, Lg, Ft, Db);
	}
}
*/
public class STEP_12_Type_2 {
	public static void main(String[] args)
	{
		new Type_21().type_test();
		// new Type_22().type_test();
	}
}					// STEP_12/w2/STEP_12_Type_2.java
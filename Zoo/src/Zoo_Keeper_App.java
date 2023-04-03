import java.util.Date;
public class Zoo_Keeper_App {

	public Zoo_Keeper_App() {
		// no house keeping items yet
	}

	public static void main(String[] args) {
		
		try {
		Animal a1 = new Animal ();
		Animal a2 = new Animal ((float) 10.5, "12-31-2022");
		Animal a3 = new Animal ((float) 10.5, new Date(2022, 12, 31));;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}

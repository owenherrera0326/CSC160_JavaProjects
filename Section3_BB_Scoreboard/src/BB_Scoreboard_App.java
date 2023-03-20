
public class BB_Scoreboard_App {

	public BB_Scoreboard_App() {
		
	}

	public static void main(String[] args) throws Exception {
		Player p1 = new Player();
		
		try {
		p1.setName("Owen");
		p1.setJersey(-11);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getJersey());
		
		p1.setName("Owen");
		p1.setJersey(22);
		
		System.out.println(p1.getName());
		System.out.println(p1.getJersey());
	}

}

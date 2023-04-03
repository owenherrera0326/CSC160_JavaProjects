import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	private List players;
	
	public Team() {
		this.name = "unknown";
		this.players = new ArrayList<Player>();
	}

	public Team(String name) {
		
	}
	
	public void addPlayer(String name, int jersey) throws Exception {
		Player dup = this.getPlayer(jersey);
		
		if (dup == null)
			this.players.add(new Player(name, jersey));
		else
			throw new Exception("Jersey #" + jersey + " already assigned to " + dup.getName());
		
		
		
	}
	
	public Player getPlayer(int jersey) throws Exception {
		
		int index = this.players.indexOf(new Player(jersey));
		
		if (index == -1)
			return null;
		else
			return this.players.get(index);
		
	}
	
	public int getTeamFouls() {
		
		int teamFouls = 0;
		
		for (int i =0; i < this.players.size(); i++) {
			teamFouls += this.players.get(i).getFouls();
		}
		
		return teamFouls;
	}
	
	public void displayDetailStats() {
		for (int i = 0; i <this.players.size(); i++) {
			String name = this.players.get(i).getName();
			int jersey = this.players.get(i).getJersey();
			
			//Printf for when the field is complete.
			//System.out.println("%2d %15s %5d ", jersey, name, foul);
		}
	}
	
	public void displayTeamStat() {
		//sysout "Team " + this.name + " Fouls" + this.getTeamFouls;
	}
	
}

package 备忘录模式例子;

public class Main {
	
	public static void main(String[] args) {
		
		GameRole role = new GameRole();
		role.getInitState();
		role.stateDisplay();
		
		RoleStateCretaker stateAdmin = new RoleStateCretaker();
		stateAdmin.setMemento(role.saveState());
		
		role.fight();
		role.stateDisplay();
		
		role.recoveryState(stateAdmin.getMemento());
		role.stateDisplay();
	}
	
}

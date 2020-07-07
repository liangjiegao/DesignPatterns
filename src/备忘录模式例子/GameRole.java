package 备忘录模式例子;

public class GameRole {
	
	private int vit;
	private int atk;
	private int def;
	
	public void stateDisplay() {
		System.out.println("当前角色状态：");
		System.out.println("体力：" + this.vit);
		System.out.println("攻击力：" + this.atk);
		System.out.println("防御：" + this.def);
	}
	
	public void getInitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	public void fight() {
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def);
	}
	
	public void recoveryState(RoleStateMemento role) {
		
		this.vit = role.getVit();
		this.atk = role.getAtk();
		this.def = role.getDef();
	}
	
	
}

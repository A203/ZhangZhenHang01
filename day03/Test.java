
public class Test {

		public static void main(String[] args){
			Army a = new Army(4);
			a.addWeapon(new Tank());
			a.addWeapon(new Flighter());
			a.addWeapon(new Warship());
			a.addWeapon(new Warship());
			a.addWeapon(new Warship());
			a.moveAll();
			a.attackAll();		
		}
	

}

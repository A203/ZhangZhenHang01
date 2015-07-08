
public class Weapon implements Assaultable,Mobile{

	public void attack() {
		// TODO Auto-generated method stub
		
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}
	

}
class Tank extends Weapon{
	public void attack(){
		System.out.println("开炮");
	}
	public void move(){
		System.out.println("碾压");
	}
}
class Flighter extends Weapon{
	public void attack(){
		System.out.println("投弹");
	}
	public void move(){
		System.out.println("飞行");
	}
}
class Warship extends Weapon{
	public void attack(){
		System.out.println("放飞机");
	}
	public void move(){
		System.out.println("航行");
	}
}


class Army{
	Weapon[] w;
	int max;
	int j=0;
	public int getMax() {
		return max;
	}
	public void setMax(int max){
		this.max=max;
	}
	public Army(int max){
		w=new Weapon[max];
		this.max=max;
		System.out.println("武器上限是"+max);
	}
	public void addWeapon(Weapon wa){
		if(j<getMax()){
			System.out.println("武器库足够！"+"已增加"+(j+1)+"个武器");
			w[j]=wa;
			j++;
		}
		else{
			System.out.println("警告：武器库已满！！！不能增加武器！！！");
		}
		
	}
	public void attackAll(){
		System.out.println("全体攻击");
		for(int i =0;i<w.length;i++){
			System.out.println((i+1)+"号");
			w[i].attack();
		}
	}
	public void moveAll(){
		System.out.println("全体移动");
		for(int i =0;i<w.length;i++){
			System.out.println((i+1)+"号");
			w[i].move();
	}
	}
	
}

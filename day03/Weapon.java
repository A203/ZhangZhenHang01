
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
		System.out.println("����");
	}
	public void move(){
		System.out.println("��ѹ");
	}
}
class Flighter extends Weapon{
	public void attack(){
		System.out.println("Ͷ��");
	}
	public void move(){
		System.out.println("����");
	}
}
class Warship extends Weapon{
	public void attack(){
		System.out.println("�ŷɻ�");
	}
	public void move(){
		System.out.println("����");
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
		System.out.println("����������"+max);
	}
	public void addWeapon(Weapon wa){
		if(j<getMax()){
			System.out.println("�������㹻��"+"������"+(j+1)+"������");
			w[j]=wa;
			j++;
		}
		else{
			System.out.println("���棺����������������������������������");
		}
		
	}
	public void attackAll(){
		System.out.println("ȫ�幥��");
		for(int i =0;i<w.length;i++){
			System.out.println((i+1)+"��");
			w[i].attack();
		}
	}
	public void moveAll(){
		System.out.println("ȫ���ƶ�");
		for(int i =0;i<w.length;i++){
			System.out.println((i+1)+"��");
			w[i].move();
	}
	}
	
}

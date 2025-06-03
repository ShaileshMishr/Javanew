package day1;

class Computer{
	
	public void playMusic(){
		
		System.out.println("Music Playing");
}
	
	public String getMeAPen(int cost) {
		if(cost>=10) 
			return "Pen";
		else
			return "Nothing";
}
}

public class Methods {

	public static void main(String[] args) {

		Computer c = new Computer();
		c.playMusic();
		String str= c.getMeAPen(5);
		System.out.println(str);
	}

}

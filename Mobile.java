package week1.day1;

public class Mobile {
	
	public void makecall () {
		String mobileModel = "POCO X2";
		float mobileWeight = 153.52f;
		System.out.println("mobileModel :" +mobileModel);
		System.out.println("mobileWeight: " +mobileWeight);
	}

	public void sendMsg () {
		boolean isFullCharged = true;
		int mobileCost =19522;
		System.out.println("isFullCharged :" +isFullCharged);
		System.out.println("mobileCost: " +mobileCost);
	}
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makecall();
		mob.sendMsg();
		System.out.println("This my browser");
		
	}
}

package tv;

public class WatchTV {

	public static void main(String[] args) {

		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		tv.Power(true);
		tv.Volume(120);
		tv.status();
		
		tv.Volume(false);
		tv.status();
		
		tv.Channel(0);
		tv.status();
		
		tv.Channel(true);
		tv.Channel(true);
		tv.Channel(true);
		tv.status();
		
		tv.Power(false);
		tv.status();

	}

}

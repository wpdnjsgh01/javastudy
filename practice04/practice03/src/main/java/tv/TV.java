package tv;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void Power(boolean on) {
		this.power = on;
	}

	public void Channel(int channel) {
		this.channel = channel;
	}

	public void Channel(boolean up) {
		this.channel = channel + 1;
	}

	public void Volume(int volume) {
		this.volume = volume;
	}

	public void Volume(boolean up) {
		this.volume = volume + 1;
	}

	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

}

package oops;
interface Tvremote
{
	public void volumeup();
	public void volumedown();
	public void channelup();
	public void channeldown();
	
}
interface Smarttvremote extends Tvremote
{
	public void musicchange();
	public void bluetooth();
}

class tv implements Smarttvremote
{

	@Override
	public void musicchange() {
		System.out.println("smart tv music change");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("smart tv bluetooth");
		
	}

	@Override
	public void volumeup() {
		System.out.println("volume up");
		
	}

	@Override
	public void volumedown() {
		System.out.println("volume down");
		
	}

	@Override
	public void channelup() {
		System.out.println("channel up");
		
	}

	@Override
	public void channeldown() {
		System.out.println("channel down");
		
	}
	
	
	
}

public class Tvinterfacepgm {

	public static void main(String[] args) {
		System.out.println();
	}

}

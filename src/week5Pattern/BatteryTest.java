package week5Pattern;

public class BatteryTest {

	public static void main(String[] args) {
		
		CarRemoteControl carControlCtx = new CarRemoteControl();
		State carStartState = new CarBatteryStart();
		
		System.out.println("*************************");
		carControlCtx.setState(carStartState);
		carControlCtx.Operation();
		
		System.out.println("*************************");
		
		State carStopState = new CarBatteryStop();
		carControlCtx.setState(carStopState);
		
	
		carControlCtx.Operation();
	    System.out.println("*************************");

		State CarBatteryReset = new CarBatteryReset();
		carControlCtx.setState(CarBatteryReset);
		
		carControlCtx.Operation();
        System.out.println("*************************");
	}

}

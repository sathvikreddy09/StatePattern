package week5Pattern;

public class CarRemoteControl implements State {
private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	@Override
	public void Operation() {
		state.Operation();
	}
}

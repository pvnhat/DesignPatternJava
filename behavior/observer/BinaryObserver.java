package observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		mSubject = subject;
		mSubject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(mSubject.getState()));

	}

}

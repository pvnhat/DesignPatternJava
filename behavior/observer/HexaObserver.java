package observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		mSubject = subject;
		mSubject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa String: " + Integer.toHexString(mSubject.getState()).toUpperCase());

	}

}

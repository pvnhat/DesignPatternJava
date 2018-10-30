package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> mObserverList = new ArrayList<Observer>();
	   private int mState;

	   public int getState() {
	      return mState;
	   }

	public void setState(int state) {
		   mState = state;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
		   mObserverList.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : mObserverList) {
	         observer.update();
	      }
	   } 	
}

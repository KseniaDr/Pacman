package timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;


	public class MyTimer implements ActionListener {
		
		private static MyTimer instance;
		private Timer timer;
		ArrayList<TimerListener> listeners;
		
		private MyTimer(){
			timer = new Timer(1000,this);
			listeners = new ArrayList<TimerListener>();
			timer.start();
		}
		
		public static MyTimer getInstance(){
			if(instance==null)
				instance=new MyTimer();
			return instance;
		}
			
		public void addListener(TimerListener listener){
			listeners.add(listener);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i=0; i<listeners.size(); i++)
				 listeners.get(i).action();
		}
	}



package cn.chuanz.operator.creating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rx.Observable;
import rx.Observer;

public class Just {

	private Logger logger = LoggerFactory.getLogger(Just.class);
	
	public static void main(String[] args) {
		new Just().just();
	}
	
	private void just() {
		Observable.just("hello", "word").subscribe(new Observer<String>() {

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				logger.info("oncompleted");
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				logger.error("error: {}", e);
			}

			@Override
			public void onNext(String t) {
				// TODO Auto-generated method stub
				logger.info(t);
			}
		});
	}
	
}

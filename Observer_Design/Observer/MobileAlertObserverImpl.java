package Observer_Design.Observer;

import Observer_Design.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserverImpl {

    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String emailId, StockObservable stockObservable)
    {
        this.userName=emailId;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update()
    {
        sendMsgOnMobile(userName,"Product is in stock hurry upp!!");
    }
    public void sendMsgOnMobile(String userName,String msg)
    {
        System.out.println("msg sent to :"+userName);
    }
}

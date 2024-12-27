package Observer_Design.Main;

import Observer_Design.Observable.IphoneObservableImpl;
import Observer_Design.Observable.StockObservable;
import Observer_Design.Observer.EmailAlertObserverImpl;
import Observer_Design.Observer.NotificationAlertObserverImpl;

public class Main {
    public static void main(String[] args)
    {
        StockObservable iPhonestockObservable=new IphoneObservableImpl();
        NotificationAlertObserverImpl observer1=new EmailAlertObserverImpl("abc@gmail.com", iPhonestockObservable);
        NotificationAlertObserverImpl observer2=new EmailAlertObserverImpl("xyz@gmail.com",iPhonestockObservable);
        NotificationAlertObserverImpl observer3=new EmailAlertObserverImpl("abc_username",iPhonestockObservable);

        iPhonestockObservable.add(observer1);
        iPhonestockObservable.add(observer2);
        iPhonestockObservable.add(observer3);

        iPhonestockObservable.setStockCount(10);
    }
}

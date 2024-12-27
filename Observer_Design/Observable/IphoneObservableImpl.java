package Observer_Design.Observable;
import java.util.ArrayList;
import java.util.List;
import Observer_Design.Observer.NotificationAlertObserverImpl;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserverImpl> observerList=new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserverImpl observer)
    {
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserverImpl observer)
    {
        observerList.remove(observer);
    }
    @Override
    public void notifySubscriber()
    {
        for(NotificationAlertObserverImpl observer:observerList)
        {
            observer.update();
        }
    }
    @Override
    public void setStockCount(int newStockAdded)
    {
        if(stockCount==0)
        {
            notifySubscriber();
        }
        stockCount=stockCount+newStockAdded;
    }
    @Override
    public int getStockCount()
    {
        return stockCount;
    }
}

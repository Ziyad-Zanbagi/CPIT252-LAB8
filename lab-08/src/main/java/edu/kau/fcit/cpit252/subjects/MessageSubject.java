package edu.kau.fcit.cpit252.subjects;
 
import java.util.ArrayList;
import java.util.List;

import edu.kau.fcit.cpit252.observers.Observer;

 
public class MessageSubject implements Subject {
     private ArrayList<Observer> list = new ArrayList<>();

    @Override
    public void subscribe(Observer o) {
        list.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyUpdate(String m) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).update(m);
        }        
    }
 
}

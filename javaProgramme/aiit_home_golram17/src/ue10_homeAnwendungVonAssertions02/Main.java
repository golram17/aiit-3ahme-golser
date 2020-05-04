package ue10_homeAnwendungVonAssertions02;


/**
 *
 * @author raphael
 */
public class Main {
    
    private int[] data;
    private int len;
    
    public void SimpleIntList(int size){
        this.data = new int[size];
        this.len = 0;
    }
    
    public void add(int value){
        //Precondition als RuntimeException
        if(full()){
            throw new RuntimeException("Liste voll");
        }
        //Implementierung
        data[len++] = value;
        //Postcondition
        assert !empty();
    }
    
    public void bubblesort(){
        if(!empty()){
            int cnt = 0;
            while(true){
                //Schleifeninvariante
                assert cnt++ < len: "Zu viele Iterationen";
                //Implementierung...
                boolean sorted = true;
                for(int i = 1; i < len; ++i){
                    if(sortTwoElements(i - 1, i)){
                        sorted = false;
                    }
                }
                if(sorted){
                    break;
                }
            }
        }
    }
    
    public boolean empty(){
        return len <= 0;
    }
    
    public boolean full(){
        return len >= data.length;
    }
    
    private boolean sortTwoElements(int pos1, int pos2){
        //Private Preconditions
        assert(pos1 >= 0 && pos1 < len);
        assert(pos2 >= 0 && pos2 < len);
        //Implementierungen...
        boolean ret = false;
        if(data[pos1] > data[pos2]){
            int tmp = data[pos1];
            data[pos1] = data[pos2];
            data[pos2] = tmp;
            ret = true;
        }
        //Postcondition
        assert data[pos1] <= data[pos2]: "Sortierfehler";
        return ret;
    }
}

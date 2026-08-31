import java.util.ArrayList;

public class GameTicker{
    private ArrayList<String> updates;

    public GameTicker(){
        updates = new ArrayList<>();
    }
    public void addUpdate(String update){
        updates.add(update);
    }
    public String getLatestUpdate(){
        if (updates.isEmpty()){
            return "";
        }
        return updates.get(updates.size()-1);
    }
}
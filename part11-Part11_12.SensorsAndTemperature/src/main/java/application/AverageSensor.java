
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AverageSensor implements Sensor{


    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn(){
        
        return this.sensors.stream().allMatch(sensor -> sensor.isOn() == true);
    }

    @Override
    public void setOn(){        
        this.sensors.stream().forEach(sensor -> sensor.setOn());
        
    }
    
    @Override
    public void setOff(){        
        this.sensors.stream().forEach(sensor -> sensor.setOff());
        
    }  
    
    @Override
    public int read(){
        
        if (isOn() == true) {
            int sum = this.sensors.stream().map(sensor -> sensor.read())
                    .reduce(0, (previousSum, value) -> previousSum + value);
            readings.add(sum/sensors.size());
            return sum/sensors.size();
            }
                        
         else {        
            throw new IllegalStateException();
        }        
    }
    
    public List<Integer> readings(){
        return readings;
    }
}

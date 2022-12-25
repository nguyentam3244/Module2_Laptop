package class_and_oop;
import java.time.LocalDateTime;

import static java.lang.System.currentTimeMillis;


public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // constructor k tham số
    public StopWatch(){
        this.startTime = LocalDateTime.now();
    }

    // cns có tham số
    public StopWatch(LocalDateTime startTime, LocalDateTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    //Method
    public  LocalDateTime start(){
        return startTime = LocalDateTime.now();
    }
    public LocalDateTime stop(){
        return endTime = LocalDateTime.now();
    }
    public long getElapsedTime(){
        long time = currentTimeMillis();
        return time;
    }

}

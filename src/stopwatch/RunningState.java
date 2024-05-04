package stopwatch;

public class RunningState implements State {
    private Stopwatch stopwatch;

    //add a constructor to initialize stopwatch variable
    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        stopwatch.setCurrentState(new StoppedState(stopwatch));
        System.out.println("Stopped");

    }
}

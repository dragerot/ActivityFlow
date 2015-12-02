package pakke.process;

public class Input<T> {
    private T t;

    public Input(T t){
        this.t=t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}

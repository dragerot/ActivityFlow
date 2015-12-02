package pakke.process;

public class Output<T> {
    private T t;

    public Output(T t){
        this.t=t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}


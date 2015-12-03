package pakke.process;


public class Activities<T, U> {

    private Input<T> input;
    private Output<U> output;

    public Activities(T t) {
        input = new Input<T>(t);
    }

    public Input<T> getInput() {
        return input;
    }

    public void setInput(Input<T> input) {
        this.input = input;
    }

    public Output<U> getOutput() {
        return output;
    }

    public void setOutput(Output<U> output) {
        this.output = output;
    }
}

package pakke.process;

import java.util.ArrayList;

/**
 E - Element (used extensively by the Java Collections Framework)
 K - Key
 N - Number
 T - Type
 V - Value
 S,U,V etc. - 2nd, 3rd, 4th types
 */
public class Activities<T,U> {

    Input<T> input;
    Output<U> output;

    public Activities(T t){
        input= new Input<T>(t);
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

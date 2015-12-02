package pakke.process;

import java.util.ArrayList;

public class RegistreringActivities extends Activities<Request,Response> {
    ArrayList<String> activitylog = new  ArrayList<String>();

    public ArrayList<String> getActivitylog() {
        return activitylog;
    }

    public RegistreringActivities(Request request){
        super(request);
    }

    public RegistreringActivities doStart(String arg){
        activitylog.add(arg);
        return this;
    }
    public RegistreringActivities doA(String arg){
        activitylog.add(arg);
        return this;
    }

    public RegistreringActivities doB(String arg){
        activitylog.add(arg);
        return this;
    }

    public RegistreringActivities doEnd(String arg){
        activitylog.add(arg);
        Response response = new Response();
        response.setResultat(activitylog.get(0)+activitylog.get(1)+activitylog.get(2)+activitylog.get(3));
        Output<Response> output = new Output<Response>(response);
        setOutput(output);
        return this;
    }
}

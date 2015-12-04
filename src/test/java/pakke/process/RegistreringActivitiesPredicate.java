package pakke.process;


import java.util.ArrayList;

public class RegistreringActivitiesPredicate extends Activities<Request,Response> {
    ArrayList<String> activitylog = new  ArrayList<String>();

    public ArrayList<String> getActivitylog() {
        return activitylog;
    }

    public RegistreringActivitiesPredicate(Request request){
        super(request);
    }

    public RegistreringActivitiesPredicate doStart(String arg){
        activitylog.add(arg);
        return this;
    }

    public RegistreringActivitiesPredicate doA(String arg){
        activitylog.add(arg);
        return this;
    }

    public boolean doPredicate(Predicate<Request> predicateImpl){
       return predicateImpl.matches(this.getInput().get());
    }

    public RegistreringActivitiesPredicate doB(String arg){
        activitylog.add(arg);
        return this;
    }

    public RegistreringActivitiesPredicate doEnd(String arg){
        activitylog.add(arg);
        Response response = new Response();
        StringBuffer buffer= new StringBuffer(activitylog.size());
        for(String item : activitylog) {buffer.append(item);}
        response.setResultat(buffer.toString());
        Output<Response> output = new Output<Response>(response);
        setOutput(output);
        return this;
    }
}

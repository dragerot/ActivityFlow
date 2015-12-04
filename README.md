# ActivityFlow

A simple framework to write activities in java.

Keep it simple. That's the main goal.

Inspired by Apache Camel route, I needed a simpler framework to describe an activity flow written in javacode. 

Using a common framework to express a activity flow, javacode may be easer to read and a flow change easer communicated.

From unit test:

public class ActivitiesTest {

Example 1 :

    @Test
    public void OutputTest() {
        RegistreringActivities aktivities = new RegistreringActivities(createRequest());
        aktivities.doStart("Start").
                doA("AA").
                doB("BB").
                doEnd("End");
        Output<Response> result=aktivities.getOutput();
        assertEquals("StartAABBEnd", result.get().getResultat());
    }
    

Example 2 :    
    @Test
    public void OutputRequestnameStartWithATest() {
        if(activities.doStart("Start").doPredicate(new RequestNameStartWithAPredicateImpl())){
            activities.doA("AA");
        }else
        {
            activities.doB("BB");
        }
        activities.doEnd("End");
        Output<Response> result = activities.getOutput();
        assertEquals("StartAAEnd", result.get().getResultat());
    }

    public static Request createRequest() {
        Request request = new Request();
        request.setSsn("22033445229555");
        request.setName("Dude");
        request.setAddress("Road");
        return request;
    }
}


The framework has basically 4 classes:


class Activities<T,U> 

Input<T> input

Predicate<T>

 Output<U> output





# ActivityFlow

A simple framework to write activities in java.

Keep it simple. That's the main goal.

Inspired by Apache Camel route, I needed a simpler framework to describe an activity flow written in javacode. 

Using a common framework to express a activity flow, javacode may be easer to read and a flow change easer communicated.

From unit test:

public class ActivitiesTest {

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

    public static Request createRequest() {
        Request request = new Request();
        request.setSsn("22033445229555");
        request.setName("Dude");
        request.setAddress("Road");
        return request;
    }
}


The framework has basically 3 classes:


public class Activities<T,U> 

Public Input<T> input

Public Output<U> output





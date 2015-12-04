package pakke.process;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PredicateTest {
    private RegistreringActivitiesPredicate activities;

    @Before
    public void initialize() {
        activities = new RegistreringActivitiesPredicate(Helpers.createRequest());
    }

    @Test public void remove() {
        activities=null;
    }

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

    @Test
    public void createRequestNameStartWithA() {
        activities = new RegistreringActivitiesPredicate(createRequestNameStartWithB());
        if(activities.doStart("Start").doPredicate(new RequestNameStartWithBPredicateImpl())){
            activities.doA("BB");
        }else
        {
            activities.doB("AA");
        }
        activities.doEnd("End");
        Output<Response> result = activities.getOutput();
        assertEquals("StartBBEnd", result.get().getResultat());
    }

    public static Request createRequestNameStartWithB() {
        Request request = new Request();
        request.setSsn("030865229520");
        request.setName("Bore Gard");
        request.setAddress("Øvre Movei 23");
        return request;
    }
}

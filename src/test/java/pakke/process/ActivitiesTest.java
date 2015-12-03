package pakke.process;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ActivitiesTest {

    @Test
    public void OutputTest1() {
        RegistreringActivities aktivities = new RegistreringActivities(createRequest());
        aktivities.doStart("Start").
                doA("AA").
                doB("BB").
                doEnd("End");
        Output<Response> result = aktivities.getOutput();
        assertEquals("StartAABBEnd", result.get().getResultat());
    }


    @Test
    public void OutputTest2() {
        RegistreringActivities aktivities = new RegistreringActivities(createRequest());
        aktivities.doStart("Start").
                doB("BB").
                doA("AA").
                doEnd("End");
        Output<Response> result = aktivities.getOutput();
        assertEquals("StartBBAAEnd", result.get().getResultat());
    }

    public static Request createRequest() {
        Request request = new Request();
        request.setSsn("030865229520");
        request.setName("Tore Gard");
        request.setAddress("Øvre Movei 23");
        return request;
    }
}

package pakke.process;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ActivitiesTest {

    @Test
    public void OutputTest() {
        RegistreringActivities aktivities = new RegistreringActivities(createRequest());
        aktivities.doStart("AA").
                doA("BB").
                doB("CC").
                doEnd("DD");
        Output<Response> result=aktivities.getOutput();
        assertEquals("AABBCCDD", result.get().getResultat());
    }

    public static Request createRequest() {
        Request request = new Request();
        request.setSsn("030865229520");
        request.setName("Tore Gard");
        request.setAddress("Øvre Movei 23");
        return request;
    }
}

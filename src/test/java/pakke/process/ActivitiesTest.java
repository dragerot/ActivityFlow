package pakke.process;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ActivitiesTest {

   @Test
    public void AA(){
        RegistreringActivities aktivities = new RegistreringActivities(createRequest());
        aktivities.doA("AA").
                doB("BB").
                doC("CC");
        //aktivities.getResult();
       String d=aktivities.getActivitylog().toString();
       System.out.println(aktivities.getActivitylog().toString());
       assertEquals("AA",aktivities.getActivitylog().get(0));
       assertEquals("BB",aktivities.getActivitylog().get(1));
       assertEquals("CC",aktivities.getActivitylog().get(2));

    }

    public static Request createRequest(){
        Request request = new Request();
        request.setSsn("030865229520");
        request.setName("Tore Gard");
        request.setAddress("Øvre Movei 23");
        return request;
    }
}

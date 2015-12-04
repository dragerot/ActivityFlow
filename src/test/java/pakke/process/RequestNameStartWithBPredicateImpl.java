package pakke.process;

public class RequestNameStartWithBPredicateImpl implements Predicate<Request> {

    @Override
    public boolean matches(Request request) {
        return request.getName().startsWith("B");
    }
}

package pakke.process;

public class RequestNameStartWithAPredicateImpl implements Predicate<Request> {

    @Override
    public boolean matches(Request request) {
        return request.getName().startsWith("A");
    }
}

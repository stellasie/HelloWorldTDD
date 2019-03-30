public class HelloWorld {
    public static String getMessage(final String name) {
        if (name == null || name.isEmpty()) {
            throw new UnsupportedOperationException();
        } else {
            return "Hello " + name;
        }
    }
}

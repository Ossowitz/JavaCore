package logging;

import java.util.logging.Logger;

public class UserServlet {
    private static final Logger logger1 = Logger.getGlobal();
    private static final Logger logger2 = Logger.getLogger(UserServlet.class.getName());

    public static void main(String[] args) {
    }
}

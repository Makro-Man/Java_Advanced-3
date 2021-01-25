package ua.lviv.lgs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Application {
    private static Logger LOG = Logger.getLogger(Application.class);

    public static void main(String[] args) {

        logWithDomConfigurator();
        logWithBasicConfigurator();

    }

    public static void logWithDomConfigurator() {

        DOMConfigurator.configure("LoggerConfig.xml");
        LOG.debug("DEBUG Logger message");
        LOG.info("INFO Logger message");
        LOG.warn("WARN Logger message");

        LOG.error("ERROR Logger message in project");
    }

    public static void logWithBasicConfigurator() {

        BasicConfigurator.configure();
        LOG.debug("DEBUG Logger message of project");
        LOG.info("INFO Logger message of project");
        LOG.warn("WARN Logger message of project");

        LOG.error("ERROR Logger message");
    }
}

package hellopay.test.listener;

import hellopay.test.report.ReportManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IExecutionListener;

public class CustomListener implements IExecutionListener {
    private static final Logger logger = LogManager.getLogger(CustomListener.class);

    @Override
    public void onExecutionStart() {
        logger.info("Start the execution");
    }

    @Override
    public void onExecutionFinish() {
        logger.info("Generating the Report");
        ReportManager.generateReport();
        logger.info("Finished the execution");
    }
}

package hellopay.test.report;

import hellopay.test.common.Constants;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportManager {

    private static final String JSON_RESULT_FILE = "sample.json";

    private static final String BUILD_NUMBER = "1";

    private static final String PROJECT_NAME = "HelloPay Sample Test";

    private static final String TARGET_DIR = "target";

    public static void generateReport() {
        File reportOutputDirectory = new File(TARGET_DIR);
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(TARGET_DIR + "/" + JSON_RESULT_FILE);

        Configuration configuration = new Configuration(reportOutputDirectory, PROJECT_NAME);

        configuration.setBuildNumber(BUILD_NUMBER);

        configuration.addClassifications("Browser", Constants.CHROME);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }

    private ReportManager() {
    }
}


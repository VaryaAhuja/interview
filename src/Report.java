
public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public ExtentHtmlReporter HtmlReporter;
		public ExtentReports extent;
		public ExtentTest logger;
		
		public void CreateReport()
		{
			HtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/");
			HtmlReporter.config.setDocumentTitle("Automation Report");
			HtmlReporter.config.setReportName("FunctionalReport");
			HtmlReported.config.setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			extent.attachReporter(HtmlReporter);
			
			extent.setSystemInfo("");
			
			
			
		}

	}

}

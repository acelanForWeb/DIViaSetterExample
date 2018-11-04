package tw.acelan.output;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	
	//Spring 將會透過setter方法將實作類別進行注入
	//也就是本範例的DI via Setter的主角
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}

	public void generateOutput(){
		//output的generateOutput方法會依照其實作類別不同而不同
		outputGenerator.generateOutput();
	}
}

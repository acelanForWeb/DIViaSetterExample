package tw.acelan.output;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	
	//Spring �N�|�z�Lsetter��k�N��@���O�i��`�J
	//�]�N�O���d�Ҫ�DI via Setter���D��
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}

	public void generateOutput(){
		//output��generateOutput��k�|�̷Ө��@���O���P�Ӥ��P
		outputGenerator.generateOutput();
	}
}

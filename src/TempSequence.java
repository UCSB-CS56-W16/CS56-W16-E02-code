import java.util.ArrayList;

public class TempSequence extends ArrayList<Integer> {

    public double averageTemp() {
	int sum=0;
	int length=this.size();
	for (int i=0; i<this.size(); i++) {
	    sum+=this.get(i);
	}
	return ((double)(sum))/length;
    }

    public TempSequence aboveAverage() {
	TempSequence result = new TempSequence();
	double avg = this.averageTemp();
	for (int thisTemp:this) {
	    if (thisTemp> avg)
		result.add(thisTemp);
	}
	return result;	
    }
	
}

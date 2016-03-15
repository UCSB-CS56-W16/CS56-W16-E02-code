public class TempSequenceTry {

    public static void main(String [] args) {
	TempSequence t = new TempSequence();
	t.add(20); t.add(32); t.add(40);

	System.out.println("t=" + t);
	System.out.println("t.averageTemp=" + t.averageTemp());
	TempSequence aa = t.aboveAverage();
	System.out.println("aa=" + aa);
	
    }

}

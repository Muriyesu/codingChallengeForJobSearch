package problem1;

/*
 * 
 * This a custom class that implements comparable and it's used
 * to compare counts and sort
 * 
 * @author Ferdis
 * 
 * */
public class Pair implements Comparable<Pair>{

	private String word;
	private Integer count;
	
	public Pair(String word, Integer count) {
		this.word = word;
		this.count = count;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public Integer getCount() {
		return this.count;
	}
	
	//this method will compare elements and print results in descending
	@Override
	public int compareTo(Pair o) {
		return o.getCount().compareTo(this.getCount());
	}
	
	//printing results
	@Override
	public String toString() {
		return this.word+" ------------- "+this.count;
	} 
}

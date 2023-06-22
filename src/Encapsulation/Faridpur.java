package Encapsulation;

public class Faridpur {
	// create private encapsulation variable
	
	private String vote_area;
	private int vote_no;
	
	public void set_vote_are(String vote_area,int vote_no) {
		this.vote_area = vote_area;
		this.vote_no = vote_no;
	}
	public String  get_votearea() {
		return vote_area;
	}
	public int get_vote_no() {
		return vote_no;
	}
	void display() {
		System.out.println("Vote area : "+vote_area);
		System.out.println("Vote No : "+vote_no);

	}
	

}

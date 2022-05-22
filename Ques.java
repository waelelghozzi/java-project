package projet;
import java.io.Serializable;
public class Ques implements Serializable{
	private String q,r1,r2,r3,r4,rc;
	private int score,p;
	
	public Ques(String q,String r1,String r2,String r3,String r4,String rc,int s,int p )throws empty {
		if((q=="")||(r1=="")||(r2=="")||(r3=="")||(r4=="")||(rc=="")||(s==0)) {
			throw new empty("les champs sont null");}
		else {this.q=q;this.r1=r1;this.r2=r2;this.r3=r3;this.r4=r4;this.rc=rc;this.score=s;this.p=p;}}

	public String getq() {return q;}
	public void setq(String q) {this.q = q;}
	
	public String getR4() {return r4;}
	public void setR4(String r4) {this.r4 = r4;}

	public String getR1() {return r1;}
	public void setR1(String r1) {this.r1 = r1;}
	
	public String getR2() {return r2;}
	public void setR2(String r2) {this.r2 = r2;}

	public String getRc() {return rc;}
	public void setRc(String rc) {this.rc = rc;}

	public String getR3() {return r3;}
	public void setR3(String r3) {this.r3 = r3;}

	public int getP() {return p;}
	public void setP(int p) {this.p = p;}

	public int getScore() {return score;}
	public void setScore(int score) {this.score = score;}

}

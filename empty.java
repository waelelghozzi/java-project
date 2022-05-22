package projet;

class empty extends Exception {
	private static final long serialVersionUID = 1L;
String msg;
public empty(String msg) {
	this.msg = msg;
}
public String get_msg() {
		return msg;
	}

}

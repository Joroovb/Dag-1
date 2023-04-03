class Demo{       // BM
	public static void main(String[] ebc){
	   System.out.println("S");
	   R r = new R();
	   r.t();
	   System.out.println("E");
	}
}

class R {
    void t() {
        System.out.println("T");
        throw new Exception();
    }
}

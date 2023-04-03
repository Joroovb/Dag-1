class Demo{       // BO
	public static void main(String[] ebc){
	   System.out.println("S");
	   R r = new R();
	   try {
			r.t();	
		} catch (Exception e) {
			System.out.println("F");
		}
	   System.out.println("E");
	}
}

class R {
    void t() throws Exception {
        System.out.println("T");
        throw new Exception();
    }
}

class Demo{       // EW
	public static void main(String[] args) {
	   new Letters();
	   new Letters();
	}
}

class Letters {
    static {
        System.out.println("c");
    }
    {
        System.out.println("b");
    }
    Letters() {
        System.out.println("a");
    }
    {
        System.out.println("d");
    }
    static {
        System.out.println("e");
    }
}

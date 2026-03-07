class L3p1{
	static int view;
	public static void display(){
	System.out.println(view);
	}
	public int show(){
		int view=10;
	    return(view);
	}
}
class Lab3p1  {
    public static void main(String[] args) {
        L3p1 ob = new L3p1();
        
        System.out.println(ob.show());  // prints 10
        ob.display();                  // prints 0
    }
}

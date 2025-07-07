package day4;

public interface Bachan {
	
	    public static final int a=15;
		public abstract void home();
		default void car(){System.out.println("Family Car");}
		default void office() {System.out.println("Family Office");}
		void gold();
}

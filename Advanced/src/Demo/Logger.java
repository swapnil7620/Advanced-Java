package com.Demo;

 public class Logger {
	
	    private static Logger instanceLogger;
	 
		private Logger() {
		  System.out.println("Logger is initialise");	
		}

		
		public static Logger getInstance() {
			
			
			if (instanceLogger == null) {
				instanceLogger = new Logger();
				
			}
			return instanceLogger;
		}


}

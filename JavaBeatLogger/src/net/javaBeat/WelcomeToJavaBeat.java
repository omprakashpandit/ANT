package net.javaBeat;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class WelcomeToJavaBeat {
	static Logger logger = Logger.getLogger(WelcomeToJavaBeat.class);

	public static void main(String[] args) {
      //  System.out.println("Welcome To JavaBeat..!!!");
        BasicConfigurator.configure();
        logger.info("Welcome To JavaBeat Logger..!!!");// the old System Out-statement
    }
}


//E:\workspace.ANT\WelcomeToJavaBeatLogger>ant
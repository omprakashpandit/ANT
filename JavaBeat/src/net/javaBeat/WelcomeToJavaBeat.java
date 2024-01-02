package net.javaBeat;

public class WelcomeToJavaBeat {
	public static void main(String[] args) {
        System.out.println("Welcome To JavaBeat..!!!");
    }
}


//ant compile jar run
//OR
//ant compile
//ant jar run


//javac -sourcepath src -d build\classes src\net\javaBeat\WelcomeToJavaBeat.java
//java -cp build\classes net.javaBeat.WelcomeToJavaBeat

//Create the JAR. (Don’t miss the “dot” at the end of the command.)
//jar cfm build\jar\WelcomeToJavaBeat.jar myManifest -C build\classes .
//java -jar build\jar\WelcomeToJavaBeat.jar
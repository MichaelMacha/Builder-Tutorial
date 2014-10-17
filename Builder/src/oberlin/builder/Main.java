package oberlin.builder;

/*
 * © Michael Eric Oberlin, October 11, 2014
 * 
 * This program is free for educational usage, and free to be modified in any manner; however
 * its creator cannot be held responsible for any damage done to end-users' computers from it
 * or any alteration of it.
 */
import java.io.*;
import java.util.*;

import oberlin.algebra.builder.AlgebraBuilder;

public class Main {
	
//	private Builder oberlin.builder = new NullaryBuilder();
	private Builder builder = new AlgebraBuilder();
	
	public static void main(String...args) throws IOException {
		new Main();
	}
	
	public Main() throws IOException {
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));) {
			
			out.write("Type \"!exit\" to exit the program\n");
			while(true) {
				out.write("Enter text: ");
				out.flush();
				String input = in.readLine();
				
				if(input.trim().toLowerCase().equals("!exit")) {
					break;
				}
				
				Object built = builder.build(input);
				out.write("Builds to: " + built);
				out.newLine();
				out.flush();
			}
		}
	}
}
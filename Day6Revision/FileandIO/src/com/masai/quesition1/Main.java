package com.masai.que1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		Path path= Paths.get("D:\\Input");
		
		
		try (Stream<Path> subpath = Files.walk(path)) {
			subpath.forEach(s -> System.out.println(s));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

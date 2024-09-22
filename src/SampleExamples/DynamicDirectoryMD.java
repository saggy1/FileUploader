package SampleExamples;

import java.io.File;
import java.util.Optional;

public class DynamicDirectoryMD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directoryPath="C:\\Personal\\Graduation\\OPT\\Module";
		File directory = new File(directoryPath);
		File finaldirectory;
		for (int i=3;i < 12; i++) {
			finaldirectory= new File(directory.toString() +i);
		
		//Optional is used to handle null values like NVL
		Optional<File> optionalDirectory = Optional.of(finaldirectory);
		optionalDirectory.filter(dir -> !dir.exists())
		.map(File::mkdirs)
		.ifPresentOrElse(			
				
				success -> System.out.println("Directory succesfully created at:"+ directoryPath),
				() -> System.out.println("Directory already exist or failed to create.")
				
				);

	}
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFile implements OutputFileInterface {
	private PrintWriter out;
	@Override
	public void open(String outputFileName) {
		// TODO Auto-generated method stub
		//File file = new File("/Users/saikathika/eclipse-workspace/Music Library/srcresources/artist.txt");
		///Users/saikathika/documents/cs56/lab04 
		//File file = new File("/Users/saikathika/documents/cs56/lab04/artistOutput.txt");
		// File dir = file.getParentFile();
		// if (!dir.isDirectory() && !dir.mkdirs()) {
  //   // handle could not create directory
  //  	 		System.out.println("Could not create target directory '" + dir + "'");
		// }
		//File fileName = new File(outputFileName);
		// FileWriter writer = new FileWriter(fileName, true);
		// try {
		// 	PrintWriter out = new PrintWriter(file);
		// 	//out = new PrintWriter("Absolute path:" + file.getAbsolutePath());
		// } catch (FileNotFoundException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// 	System.out.println("Could not");
		// } 
				Scanner out = new Scanner(System.in);
		File file = new File("artistOutput.txt");
		String line = out.nextLine();
		System.out.println(line);
		//out.println("TITLE                                   ARTIST                                  ALBUM                                   LENGTH YEAR ADDITIONAL_INFORMATION");
		//out.println("dkshajcbrywhfldskj");
		out.close();
	}

	@Override
	public void writeItem(MusicTrack trackToWrite) {
		// TODO Auto-generated method stub
//		The Track Title field will be left-justified with 40 spaces.
//		The Artist field will be left-justified with 40 spaces.
//		The Album field will be left-justified with 40 spaces.
//		The Track Length field will be left-justified with 7 spaces.
//		The year field will be left-justified with 5 spaces.
//		The specific additional Track format information will be left-justified with 40 spaces.
		out.println("dkshajcbrywhfldskj");
		// out.println(String.format("%-40s%-40s%-40s%-7s%-5s%-40s", trackToWrite.getTitle(),trackToWrite.getArtist(),trackToWrite.getAlbum(),
		// 		trackToWrite.getLength(),trackToWrite.getYear(),trackToWrite.getAdditionalInfo()));
		// year is int 
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		out.close();
	}

}

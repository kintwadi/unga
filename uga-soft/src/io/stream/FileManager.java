
package io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileManager {

	public void fileCopy(String sourceFile, String destinationFile) throws Exception {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {

			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destinationFile);
			int data = 0;

			// read() ==> returns the next byte or -1 if end of file

			while ((data = fis.read()) != -1) {

				fos.write(data);
				
			}

		} finally {

			if (fis != null) {
				fis.close();

			}
			if (fos != null) {

				fos.close();
			}
		}

	}

	public static void main(String[] args) throws Exception {
		
		String sourceFile = "./sourceFile";
		String destinationFile = "./destinationFile";
	
		FileManager fileManager = new FileManager();
		fileManager.fileCopy(sourceFile, destinationFile);

	}

}

// -------------------------------------------------------------------------
// end of class FileManager.java

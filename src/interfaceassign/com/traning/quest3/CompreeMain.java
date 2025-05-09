package interfaceassign.com.traning.quest3;

public class CompreeMain {
    public static void main(String[] args) {
        IFileCompressor iFileCompressor;

        iFileCompressor= new JarCompressor();
        iFileCompressor.compressFile("Jar");

        iFileCompressor= new RarCompressor();
        iFileCompressor.compressFile();

        iFileCompressor= new ZipCompressor();
        iFileCompressor.compressFile();
    }
}

package interfaceassign.com.traning.quest3;

public class JarCompressor implements IFileCompressor{

    @Override
    public void compressFile(String... files) {
        System.out.println("Jar comp");
    }
}

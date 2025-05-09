package interfaceassign.com.traning.quest3;

public class RarCompressor implements IFileCompressor{

    @Override
    public void compressFile(String... files) {
        System.out.println("RAR comp");
    }
}

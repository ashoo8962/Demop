package interfaceassign.com.traning.quest3;

public class ZipCompressor implements IFileCompressor{
    @Override
    public void compressFile(String... files) {
        System.out.println("Zip Comp");
    }
}

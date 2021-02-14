package cn.fall.thee.charming.legs.common;

import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-02-13
 */
public class XmlResourceResolver implements Resource {
    public boolean exists() {
        return false;
    }

    public URL getURL() throws IOException {
        return null;
    }

    public URI getURI() throws IOException {
        return null;
    }

    public File getFile() throws IOException {
        return null;
    }

    public long contentLength() throws IOException {
        return 0;
    }

    public long lastModified() throws IOException {
        return 0;
    }

    public Resource createRelative(String s) throws IOException {

        return null;
    }

    public String getFilename() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public InputStream getInputStream() throws IOException {
        return null;
    }


}

package io.imesh.file;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

@RestController
public class FileDownloadController {

    private final static Logger log = Logger.getLogger(FileDownloadController.class.getName());

    private String filePath;
    private String contentType;

    public FileDownloadController() {
        this.filePath = System.getenv("FILE_PATH");
        if(filePath == null || filePath.isEmpty()) {
            throw new RuntimeException("Environment variable FILE_PATH is not set");
        }
        log.info("FILE_PATH: " + filePath);

        this.contentType = System.getenv("CONTENT_TYPE");
        if(contentType == null || contentType.isEmpty()) {
            throw new RuntimeException("Environment variable CONTENT_TYPE is not set");
        }
        log.info("CONTENT_TYPE: " + contentType);
    }

    @RequestMapping(path = "/download", method = RequestMethod.GET)
    public void getDownload(HttpServletResponse response) {
        try {
            InputStream inputStream = new FileInputStream(filePath);
            response.setContentType(contentType);

            IOUtils.copy(inputStream, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

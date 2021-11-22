package com.amazonaws.services.s3.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;

/**
 * Test Model InitiateMultipartUploadRequest
 */
public class InitiateMultipartUploadRequestTest {

    /**
     * Test setting the content type of the metadata for the multipart upload request
     */
    @Test
    public void testWithObjectMetadataContentTypeFromFile(){
        InitiateMultipartUploadRequest request = new InitiateMultipartUploadRequest("bucketName", "key", new ObjectMetadata());
        File file = new File("textFile.txt");
        request = request.withObjectMetadataContentTypeFromFile(file);
        assertEquals("text/plain", request.getObjectMetadata().getContentType());
    }

    /**
     * Test setting the content type of the metadata for the multipart upload request
     * Creates the metadata object if it does not exist
     */
    @Test
    public void testWithObjectMetadataContentTypeFromFileCreatesMetadata(){
        InitiateMultipartUploadRequest request = new InitiateMultipartUploadRequest("bucketName", "key");
        File file = new File("textFile.txt");
        request = request.withObjectMetadataContentTypeFromFile(file);
        assertEquals("text/plain", request.getObjectMetadata().getContentType());
    }
}

package com.amazonaws.service.s3;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.transfer.Download;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;
import com.amazonaws.services.s3.transfer.Upload;
import com.amazonaws.services.s3.transfer.model.UploadResult;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LargeObjectTest {
    public static final long KB = 1024;
    public static final long MB = 1024 * KB;
    public static final long GB = 1024 * MB;

    String bucket = "olapplin-test-bucket";
    TransferManager tm;
    String testPath;
    String key;

    @Before
    public void init() {
        System.setProperty("com.amazonaws.sdk.disableCertChecking", "true");
        testPath = System.getProperty("testpath");
        key = System.getProperty("testkey");
        tm = TransferManagerBuilder.standard()
                .withMinimumUploadPartSize(5L * 1000L * 1000L * 1000L)
                .withS3Client(AmazonS3Client.builder()
                        .withRegion(Regions.US_EAST_2)
                        .build())
                .build();
    }

    @Test
    public void tm_upload() throws Exception {
        Path path = Paths.get(testPath);
        Upload upload = tm.upload(bucket, key, path.toFile());
        long start = System.currentTimeMillis();
        UploadResult result = upload.waitForUploadResult();
        long end = System.currentTimeMillis();
        System.out.println("Done - eTag=" + result.getETag() + ", took " + (end - start) + "ms");
        printOutResult((end - start), Files.size(path));
    }

    @Test
    public void tm_download() throws Exception {
        Path path = Paths.get(testPath);
        Download download = tm.download(bucket, key, path.toFile());
        long start = System.currentTimeMillis();
        download.waitForCompletion();
        long end = System.currentTimeMillis();
        System.out.println("Done!");
        printOutResult(end - start, Files.size(path));
    }

    public static void printOutResult(long latency, long contentLengthInByte) {
        double contentLengthInGigabit = (contentLengthInByte / (double) GB) * 8.0;
        System.out.printf("Content Length (Bytes): %d%n", contentLengthInByte);
        System.out.printf("Average latency (s): %d%n", latency);
        System.out.printf("Object size (Gigabit): %.4f%n", contentLengthInGigabit);
        System.out.printf("Average throughput (Gbps): %.4f%n", contentLengthInGigabit / latency);
        System.out.println("==========================================================");
    }
}

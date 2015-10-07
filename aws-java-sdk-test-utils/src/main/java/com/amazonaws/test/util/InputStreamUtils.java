package com.amazonaws.test.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.amazonaws.util.IOUtils;

public class InputStreamUtils {

    /**
     * Calculates the MD5 digest for the given input stream and returns it.
     */
    public static byte[] calculateMD5Digest(InputStream is) throws NoSuchAlgorithmException, IOException {
        int bytesRead = 0;
        byte[] buffer = new byte[2048];
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        while ((bytesRead = is.read(buffer)) != -1) {
            md5.update(buffer, 0, bytesRead);
        }
        return md5.digest();
    }

    /**
     * Reads to the end of the inputStream returning a byte array of the contents
     * 
     * @param inputStream
     *            InputStream to drain
     * @return Remaining data in stream as a byte array
     */
    public static byte[] drainInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            byte[] buffer = new byte[1024];
            long bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) > -1) {
                byteArrayOutputStream.write(buffer, 0, (int) bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(byteArrayOutputStream, null);
        }
    }
}

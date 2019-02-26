/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import org.apache.commons.io.IOUtils;

/**
 * Helper class that helps in creating and writing data to temporary files.
 * 
 */
public class FileUtils {
    static final int ASCII_LOW = 33; // '!', skipping space for readability
    static final int ASCII_HIGH = 126;
    // include a line break character
    static final int modulo = ASCII_HIGH - ASCII_LOW + 2;
    private static final Random rand = new Random();

    /**
     * Returns a reference to the file created with the given file name in the
     * System's temporary directory.
     * 
     * @param fileName
     * @return a reference to the file
     * @throws IOException
     */
    public static File createTempFileForTesting(String fileName) throws IOException {
        return File.createTempFile(String.valueOf(System.currentTimeMillis()),
                fileName);

    }

    /**
     * Creates a file with the given name in the System's temporary directory.
     * Adds the data to the given file and returns the reference to the file.
     * 
     * @param fileName
     * @param data
     * @return reference to the file.
     * @throws IOException
     */
    public static File createTempFileForTesting(String fileName, String data)
            throws IOException {
        return appendDataToTempFile(File.createTempFile(
                String.valueOf(System.currentTimeMillis()), fileName), data);

    }

    /**
     * Appends the given data to the file specified in the input and returns the
     * reference to the file.
     * 
     * @param file
     * @param dataToAppend
     * @return reference to the file.
     * @throws IOException
     */
    public static File appendDataToTempFile(File file, String dataToAppend)
            throws IOException {
        FileWriter outputWriter = new FileWriter(file);

        try {
            outputWriter.append(dataToAppend);
        } finally {
            outputWriter.close();
        }

        return file;
    }

    /**
     * Generate a random ASCII file of the specified number of bytes. The ASCII
     * characters ranges over all printable ASCII from 33 to 126 inclusive and
     * LF '\n', intentionally skipping space for readability.
     */
    public static File generateRandomAsciiFile(long byteSize)
            throws IOException {
        return generateRandomAsciiFile(byteSize, true);
    }

    public static File generateRandomAsciiFile(long byteSize,
            boolean deleteOnExit) throws IOException {
        File file = File.createTempFile("CryptoTestUtils", ".txt");
        System.out.println("Generating random ASCII file with size: "
                + byteSize + " at " + file);
        if (deleteOnExit)
            file.deleteOnExit();
        OutputStream out = new FileOutputStream(file);
        int BUFSIZE = 1024 * 8;
        byte[] buf = new byte[1024 * 8];
        long counts = byteSize / BUFSIZE;
        try {
            while (counts-- > 0) {
                IOUtils.write(fillRandomAscii(buf), out);
            }
            int remainder = (int) byteSize % BUFSIZE;
            if (remainder > 0) {
                buf = new byte[remainder];
                IOUtils.write(fillRandomAscii(buf), out);
            }
        } finally {
            out.close();
        }
        return file;
    }

    private static byte[] fillRandomAscii(byte[] bytes) {
        rand.nextBytes(bytes);
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            if (b < ASCII_LOW || b > ASCII_HIGH) {
                byte c = (byte) (b % modulo);
                if (c < 0)
                    c = (byte) (c + modulo);
                bytes[i] = (byte) (c + ASCII_LOW);
                if (bytes[i] > ASCII_HIGH)
                    bytes[i] = (byte) '\n';
            }
        }
        return bytes;
    }
}

/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.test.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Extension of File that creates a temporary file with a specified name in
 * Java's temporary directory, as declared in the JRE's system properties. The
 * file is immediately filled with a specified amount of random ASCII data.
 *
 * @author Jason Fulghum <fulghum@amazon.com>
 *
 * @see RandomInputStream
 */
public class RandomTempFile extends File {

    private static final long serialVersionUID = -8232143353692832238L;

    /** Java temp dir where all temp files will be created */
    private static final String TEMP_DIR = System.getProperty("java.io.tmpdir");

    /** Flag controlling whether binary or character data is used */
    private final boolean binaryData;


    /**
     * Creates, and fills, a temp file with the specified name and specified
     * size of random ASCII data.
     *
     * @param filename
     *            The name for the new temporary file, within the Java temp
     *            directory as declared in the JRE's system properties.
     * @param sizeInBytes
     *            The amount of random ASCII data, in bytes, for the new temp
     *            file.
     *
     * @throws IOException
     *             If any problems were encountered creating the new temp file.
     */
    public RandomTempFile(String filename, long sizeInBytes) throws IOException {
        this(filename, sizeInBytes, false);
    }

    /**
     * Creates, and fills, a temp file with the specified name and specified
     * size of random binary or character data.
     *
     * @param filename
     *            The name for the new temporary file, within the Java temp
     *            directory as declared in the JRE's system properties.
     * @param sizeInBytes
     *            The amount of random ASCII data, in bytes, for the new temp
     *            file.
     * @param binaryData Whether to fill the file with binary or character data.
     *
     * @throws IOException
     *             If any problems were encountered creating the new temp file.
     */
    public RandomTempFile(String filename, long sizeInBytes, boolean binaryData)
            throws IOException {
        super(TEMP_DIR + File.separator + System.currentTimeMillis() + "-"
                + filename);
        this.binaryData = binaryData;
        createFile(sizeInBytes);
        System.out.println("RandomTempFile " + this + " created.");
    }

    public RandomTempFile(File root, String filename, long sizeInBytes) throws IOException {
        super(root, filename);
        this.binaryData = false;
        createFile( sizeInBytes );
    }


    public void createFile(long sizeInBytes) throws IOException {
        deleteOnExit();

        FileOutputStream outputStream = new FileOutputStream(this);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        InputStream inputStream = new RandomInputStream(sizeInBytes, binaryData);

        try {
            byte[] buffer = new byte[1024];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) > -1) {
                bufferedOutputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            bufferedOutputStream.close();
            outputStream.close();
            inputStream.close();
        }
    }

}

/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * This implementation of FileProcessingActivities zips the file
 */
public class FileProcessingActivitiesZipImpl implements FileProcessingActivities {

    private final String localDirectory;

    public FileProcessingActivitiesZipImpl(String localDirectory) {
        this.localDirectory = localDirectory;
    }

    /**
     * This is the Activity implementation that does the zip of a file
     * 
     * @param localDirectory
     *            Path to the local directory containing the file to zip
     * @param fileName
     *            Name of file to zip
     * @param zipFileName
     *            Filename after zip
     */
    @Override
    public void processFile(String fileName, String zipFileName) throws Exception {
        String fileNameFullPath = localDirectory + fileName;
        String zipFileNameFullPath = localDirectory + zipFileName;

        System.out.println("processFile activity begin.  fileName= " + fileNameFullPath + ", zipFileName= " + zipFileNameFullPath);
        final int BUFFER = 1024;
        BufferedInputStream origin = null;
        ZipOutputStream out = null;

        try {
            FileOutputStream dest = new FileOutputStream(zipFileNameFullPath);
            out = new ZipOutputStream(new BufferedOutputStream(dest));
            byte data[] = new byte[BUFFER];

            FileInputStream fi = new FileInputStream(fileNameFullPath);
            origin = new BufferedInputStream(fi, BUFFER);
            ZipEntry entry = new ZipEntry(fileName);
            out.putNextEntry(entry);
            int count;
            while ((count = origin.read(data, 0, BUFFER)) != -1) {
                out.write(data, 0, count);
            }
        }
        finally {
            if (origin != null)
                origin.close();
            if (out != null)
                out.close();
        }

        System.out.println("zipFileActivity done.");
    }
}

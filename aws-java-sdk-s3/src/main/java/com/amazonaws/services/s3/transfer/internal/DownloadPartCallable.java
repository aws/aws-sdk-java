/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import java.io.File;
import java.util.concurrent.Callable;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;

/**
 * Helper class to get a part from s3,
 * write the part data to a temporary file and
 * return the temporary file.
 */
public class DownloadPartCallable implements Callable<File> {
    private final AmazonS3 s3;
    private final GetObjectRequest getPartRequest;
    private final String destinationFileName;
    private File tempFile;
    private static final String TEMP_FILE_MIDDLE_NAME = ".part.";

    public DownloadPartCallable(AmazonS3 s3, GetObjectRequest getPartRequest, String destinationFileName) {
        this.s3 = s3;
        this.getPartRequest = getPartRequest;
        this.destinationFileName = destinationFileName;
    }

    public File call() throws Exception {
        tempFile = File.createTempFile(destinationFileName,
                TEMP_FILE_MIDDLE_NAME + getPartRequest.getPartNumber().toString());
        tempFile.deleteOnExit();
        if (s3.getObject(getPartRequest, tempFile) == null) {
            throw new AmazonClientException(
                    "There is no object in S3 satisfying this request. The getObject method returned null");
        }
        return tempFile;
    }
}

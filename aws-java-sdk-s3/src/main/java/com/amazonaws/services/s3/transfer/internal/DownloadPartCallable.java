/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.util.StringUtils;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Callable;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Helper class to get a part from s3,
 * write the part data to a temporary file and
 * return the temporary file.
 */
public class DownloadPartCallable implements Callable<File> {
    private static final Log LOG = LogFactory.getLog(DownloadPartCallable.class);
    private static final String TEMP_FILE_MIDDLE_NAME = ".part.";

    private final AmazonS3 s3;
    private final GetObjectRequest getPartRequest;
    private final File destinationFile;
    private final String destinationFilePath;

    public DownloadPartCallable(AmazonS3 s3, GetObjectRequest getPartRequest, File destinationFile) {
        this.s3 = s3;
        this.getPartRequest = getPartRequest;
        this.destinationFile = destinationFile;
        this.destinationFilePath = destinationFile.getAbsolutePath();
    }

    public File call() throws Exception {
        final File partFile = File.createTempFile(
                UUID.nameUUIDFromBytes(destinationFile.getName().getBytes(StringUtils.UTF8)).toString(),
                TEMP_FILE_MIDDLE_NAME + getPartRequest.getPartNumber().toString(),
                new File(destinationFilePath.substring(0, destinationFilePath.lastIndexOf(File.separator))));
        try {
            partFile.deleteOnExit();
        } catch (SecurityException exception) {
            LOG.warn("SecurityException denied delete access to file " + partFile.getAbsolutePath());
        }

        if (s3.getObject(getPartRequest, partFile) == null) {
            throw new SdkClientException(
                    "There is no object in S3 satisfying this request. The getObject method returned null");
        }
        return partFile;
    }
}

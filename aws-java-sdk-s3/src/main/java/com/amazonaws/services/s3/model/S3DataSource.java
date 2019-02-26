/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import static com.amazonaws.util.IOUtils.release;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.logging.Log;

/**
 * Used to represent an S3 data source that either has a file or an input
 * stream.
 */
public interface S3DataSource {
    public File getFile();
    public void setFile(File file);
    public InputStream getInputStream();
    public void setInputStream(InputStream inputStream);

    /**
     * {@link S3DataSource} specific utilities.
     */
    public static enum Utils {
        ;
        /**
         * Clean up any temporary streams created during the execution,
         * and restore the original file and/or input stream.
         */
        public static void cleanupDataSource(S3DataSource req,
                final File fileOrig, final InputStream inputStreamOrig,
                InputStream inputStreamCurr, Log log) {
            if (fileOrig != null) {
                // We opened a file underneath so would need to release it
                release(inputStreamCurr, log);
            }
            // restore the original input stream so the caller could close
            // it if necessary
            req.setInputStream(inputStreamOrig);
            req.setFile(fileOrig);
        }
    }
}

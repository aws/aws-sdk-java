/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Portions copyright 2006-2009 James Murty. Please see LICENSE.txt
 * for applicable license terms and NOTICE.txt for applicable notices.
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

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

/**
 * Represents bucket logging configuration used to control bucket-based server
 * access logging in Amazon S3.
 * <p>
 * For logging to be enabled for a bucket both the destinationBucketName and
 * logFilePrefix must be non-null, and the named bucket must exist. When both
 * variables are non-null, this object represents an <b>enabled</b> logging
 * configuration (as indicated by {@link #isLoggingEnabled()}).
 * <p>
 * If either the targetBucketName or logfilePrefix are null, this object will
 * represent a <b>disabled</b> logging configuration (as indicated by
 * {@link #isLoggingEnabled()}).
 * <p>
 * Server access logging can be enabled or disabled with
 * {@link AmazonS3Client#setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest)}
 * and the current status of server access logging for a bucket can be retrieved
 * through {@link AmazonS3Client#getBucketLoggingConfiguration(String)}
 *
 * @see AmazonS3#getBucketLoggingConfiguration(String)
 * @see AmazonS3#setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest)
 */
public class BucketLoggingConfiguration {
    private String destinationBucketName = null;
    private String logFilePrefix = null;

    /**
     * Creates a new bucket logging configuration, which by default is
     * <b>disabled</b>.
     * <p>
     * Passing this new object directly to
     * {@link AmazonS3#setBucketLoggingConfiguration(SetBucketLoggingConfigurationRequest)}
     * will turn off bucket logging for the specified bucket.
     */
    public BucketLoggingConfiguration() {}

    /**
     * Creates a new bucket logging configuration which enables server access
     * logs to be collected and stored in the specified destination bucket with
     * the specified log file prefix.
     *
     * @param destinationBucketName
     *            The name of the bucket to which to delivery server access logs
     *            from the target bucket. This may be the same bucket for which
     *            logging is being configured.
     * @param logFilePrefix
     *            The optional prefix to append to server access logs when they
     *            are written to the destination bucket.
     */
    public BucketLoggingConfiguration(String destinationBucketName, String logFilePrefix) {
        setLogFilePrefix(logFilePrefix);
        setDestinationBucketName(destinationBucketName);
    }

    public boolean isLoggingEnabled() {
        return destinationBucketName != null
            && logFilePrefix != null;
    }

    public String getLogFilePrefix() {
        return logFilePrefix;
    }

    public void setLogFilePrefix(String logFilePrefix) {
        // Default log file prefix to the empty string if none is specified
        if (logFilePrefix == null)
            logFilePrefix = "";

        this.logFilePrefix = logFilePrefix;
    }

    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    public void setDestinationBucketName(String destinationBucketName) {
        this.destinationBucketName = destinationBucketName;
    }

    public String toString() {
        String result = "LoggingConfiguration enabled=" + isLoggingEnabled();
        if (isLoggingEnabled()) {
            result += ", destinationBucketName=" + getDestinationBucketName()
                + ", logFilePrefix=" + getLogFilePrefix();
        }
        return result;
    }

}

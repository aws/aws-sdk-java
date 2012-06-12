/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

/**
 * Utilities for working with Amazon S3 bucket names, such as validation and
 * checked to see if they are compatible with DNS addressing.
 */
public class BucketNameUtils {

    /**
     * Validates that the specified bucket name is valid for Amazon S3 V2 naming
     * (i.e. DNS addressable in virtual host style). Throws an
     * IllegalArgumentException if the bucket name is not valid.
     * <p>
     * S3 bucket naming guidelines are specified in <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/index.html?BucketRestrictions.html"
     * > http://docs.amazonwebservices.com/AmazonS3/latest/dev/index.html?
     * BucketRestrictions.html</a>
     *
     * @param bucketName
     *            The bucket name to validate.
     *
     * @throws IllegalArgumentException
     *             If the specified bucket name doesn't follow Amazon S3's
     *             guidelines.
     */
    public void validateBucketName(String bucketName) throws IllegalArgumentException {
        /*
         * From the Amazon S3 bucket naming guidelines in the Amazon S3 Developer Guide
         *
         * To conform with DNS requirements:
         *  - Bucket names should not contain underscores (_)
         *  - Bucket names should be between 3 and 63 characters long
         *  - Bucket names should not end with a dash or a period
         *  - Bucket names cannot contain two, adjacent periods
         *  - Bucket names cannot contain dashes next to periods
         *     - (e.g., "my-.bucket.com" and "my.-bucket" are invalid)
         */

        if (bucketName == null)
            throw new IllegalArgumentException("Bucket name cannot be null");

        if (!bucketName.toLowerCase().equals(bucketName))
            throw new IllegalArgumentException("Bucket name should not contain uppercase characters");

        if (bucketName.contains("_"))
            throw new IllegalArgumentException("Bucket name should not contain '_'");

        if (bucketName.contains("!") || bucketName.contains("@") || bucketName.contains("#"))
        	throw new IllegalArgumentException("Bucket name contains illegal characters");

        if (bucketName.length() < 3 || bucketName.length() > 63)
            throw new IllegalArgumentException("Bucket name should be between 3 and 63 characters long");

        if (bucketName.endsWith("-") || bucketName.endsWith("."))
            throw new IllegalArgumentException("Bucket name should not end with '-' or '.'");

        if (bucketName.contains(".."))
            throw new IllegalArgumentException("Bucket name should not contain two adjacent periods");

        if ( bucketName.contains("-.") ||
             bucketName.contains(".-") )
            throw new IllegalArgumentException("Bucket name should not contain dashes next to periods");

        if ( bucketName.contains(":") ||
             bucketName.contains(":;") )
            throw new IllegalArgumentException("Bucket name should not contain colons or semicolons");
    }

    /**
     * Returns true if the specified bucket name can be addressed using V2,
     * virtual host style, addressing. Otherwise, returns false indicating that
     * the bucket must be addressed using V1, path style, addressing.
     *
     * @param bucketName
     *            The name of the bucket to check.
     *
     * @return True if the specified bucket name can be addressed in V2, virtual
     *         host style, addressing otherwise false if V1, path style,
     *         addressing is required.
     */
    public boolean isValidV2BucketName(String bucketName) {
        if (bucketName == null) return false;

        try {
            validateBucketName(bucketName);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /**
     * Convience method that allows the DNS rules to be altered for different SDKs.
     */
    public boolean isDNSBucketName(String bucketName) {
        return isValidV2BucketName( bucketName );
    }
}

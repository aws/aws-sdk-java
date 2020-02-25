/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * An exception thrown when a request is attempted to be made against
 * a bucket name that is not compatible with DNS. New buckets MUST be
 * DNS compatible. Existing buckets created before enforcement of
 * bucket names can still be accessed but must be accessed through
 * setting {@link AmazonS3ClientBuilder#enablePathStyleAccess()}.
 */
public class IllegalBucketNameException extends IllegalArgumentException {
    /**
     * Constructs an <code>IllegalBucketNameException</code> with the
     * specified detail message. This exception is thrown to indicate
     * that a request was made against a bucket that has a DNS-incompatible
     * bucket name. Use {@link AmazonS3ClientBuilder#enablePathStyleAccess()}
     * to work with buckets that are not DNS compatible.
     *
     * For more details see:
     * https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html
     *
     * @param s The specific reason the bucket name is DNS-incompatible.
     */
    public IllegalBucketNameException(String s) {
        super(s);
    }
}

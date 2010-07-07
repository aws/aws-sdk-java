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

/**
 * Bucket policies provide access control management at the bucket level for
 * both the bucket resource and contained object resources. Only one policy may
 * be specified per-bucket.
 * <p>
 * Buckets have no policy text until one is explicitly specified. In other
 * words, requesting the bucket policy for a brand new bucket will return a
 * policy object with a null policy text.
 * <p>
 * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
 * Amazon S3 developer guide</a> for more information on forming bucket
 * polices.
 */
public class BucketPolicy {

    /** The raw, policy JSON text, as returned by Amazon S3 */
    private String policyText;

    /**
     * Returns the raw policy JSON text, as returned by Amazon S3. If no policy
     * has ever been applied to the associated bucket, its policy text will be
     * null.
     * 
     * @return The raw policy JSON text, possibly null if no policy has been
     *         specified for the associated bucket.
     */
    public String getPolicyText() {
        return policyText;
    }

    /**
     * Sets the raw policy JSON text.
     *
     * @param policyText
     *            The raw policy JSON text.
     */
    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }
}
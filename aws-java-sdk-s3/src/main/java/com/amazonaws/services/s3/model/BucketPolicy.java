/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

/**
 * <p>
 * Represents a Amazon S3 bucket policy.
 * Bucket policies provide access control management at the bucket level for
 * both the bucket resource and contained object resources. Only one policy may
 * be specified per bucket.
 * </p>
 * <p>
 * Buckets have no policy text until one is explicitly specified. 
 * Requesting the bucket policy for a newly created bucket will return a
 * policy object with <code>null</code> policy text.
 * </p>
 * <p>
 * See the <a href="http://docs.amazonwebservices.com/AmazonS3/latest/dev/">
 * Amazon S3 developer guide</a> for more information on forming bucket
 * polices.
 * </p>
 */
public class BucketPolicy implements Serializable {

    /** The raw, policy JSON text, as returned by Amazon S3 */
    private String policyText;

    /**
     * Gets the raw policy JSON text as returned by Amazon S3. If no policy
     * has been applied to the specified bucket, the policy text will be
     * null.
     * 
     * @return The raw policy JSON text as returned by Amazon S3.
     *         If no policy has been applied to the specified bucket, this method returns
     *         null policy text.
     *         
     * @see BucketPolicy#setPolicyText(String)
     */
    public String getPolicyText() {
        return policyText;
    }

    /**
     * Sets the raw policy JSON text. 
     * A bucket will have no policy text unless the policy text is explicitly
     * provided through this method.
     *
     * @param policyText
     *            The raw policy JSON text.
     *            
     * @see BucketPolicy#getPolicyText()           
     */
    public void setPolicyText(String policyText) {
        this.policyText = policyText;
    }
}

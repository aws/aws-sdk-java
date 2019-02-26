/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.AmazonS3;

/**
 * Request object for the parameters to delete a bucket's website configuration.
 * <p>
 * Bucket website configuration allows you to host your static websites entirely
 * out of Amazon S3. To host your website in Amazon S3, create a bucket, upload
 * your files, and configure it as a website. Once your bucket has been
 * configured as a website, you can access all your content via the Amazon S3
 * website endpoint. To ensure that the existing Amazon S3 REST API will
 * continue to behave the same, regardless of whether or not your bucket has
 * been configured to host a website, a new HTTP endpoint has been introduced
 * where you can access your content. The bucket content you want to make
 * available via the website must be publicly readable.
 * <p>
 * For more information on how to host a website on Amazon S3, see: <a href=
 * "http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.html"
 * >http://docs.amazonwebservices.com/AmazonS3/latest/dev/WebsiteHosting.
 * html</a>.
 * <p>
 * This operation requires the <code>S3:DeleteBucketWebsite</code> permission.
 * By default, only the bucket owner can delete the website configuration
 * attached to a bucket. However, bucket owners can grant other users permission
 * to delete the website configuration by writing a bucket policy granting them
 * the <code>S3:DeleteBucketWebsite</code> permission.
 *
 * @see AmazonS3#deleteBucketWebsiteConfiguration(DeleteBucketWebsiteConfigurationRequest)
 */
public class DeleteBucketWebsiteConfigurationRequest extends GenericBucketRequest implements Serializable {

    /**
     * Creates a new request object, ready to be executed to delete the website
     * configuration for the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket whose website configuration is being
     *            deleted.
     */
    public DeleteBucketWebsiteConfigurationRequest(String bucketName) {
        super(bucketName);
    }
}

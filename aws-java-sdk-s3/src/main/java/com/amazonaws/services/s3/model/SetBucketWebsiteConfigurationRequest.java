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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Request object for the parameters to set a bucket's website configuration.
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
 * This operation requires the <code>S3:PutBucketWebsite</code> permission. By
 * default, only the bucket owner can configure the website attached to a
 * bucket. However, bucket owners can allow other users to set the website
 * configuration by writing a bucket policy granting them the
 * <code>S3:PutBucketWebsite</code> permission.
 *
 * @see AmazonS3#setBucketWebsiteConfiguration(SetBucketWebsiteConfigurationRequest)
 */
public class SetBucketWebsiteConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

	/** The name of the bucket whose website configuration is being set. */
	private String bucketName;

	/** The new website configuration for the specified bucket. */
	private BucketWebsiteConfiguration configuration;


	/**
	 * Creates a new request object, ready to be executed to set the specified
	 * bucket's website configuration.
	 *
	 * @param bucketName
	 *            The name of the bucket whose website configuration is being
	 *            set.
	 * @param configuration
	 *            The new configuration for the specified bucket.
	 */
	public SetBucketWebsiteConfigurationRequest(String bucketName, BucketWebsiteConfiguration configuration) {
		this.bucketName = bucketName;
		this.configuration = configuration;
	}

	/**
	 * Sets the name of the bucket whose website configuration is to be updated.
	 *
	 * @param bucketName
	 *            The name of the bucket whose website configuration is being
	 *            set.
	 */
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	/**
	 * Returns the name of the bucket whose website configuration is being set.
	 *
	 * @return The name of the bucket whose website configuration is being set.
	 */
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * Sets the name of the bucket whose website configuration is being set and
	 * returns this updated request object so that additional method calls can
	 * be chained together.
	 *
	 * @param bucketName
	 *            The name of the bucket whose website configuration is being
	 *            set.
	 * @return This updated request object so that additional method calls can
	 *         be chained together.
	 */
	public SetBucketWebsiteConfigurationRequest withBucketName(String bucketName) {
		setBucketName(bucketName);
		return this;
	}

	/**
	 * Sets the website configuration to send as part of this request.
	 *
	 * @param configuration
	 *            The new website configuration to set for the specified bucket.
	 */
	public void setConfiguration(BucketWebsiteConfiguration configuration) {
		this.configuration = configuration;
	}

	/**
	 * Returns the website configuration to send as part of this request.
	 *
	 * @return The new website configuration to set for the specified bucket.
	 */
	public BucketWebsiteConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * Sets the website configuration to send as part of this request, and
	 * returns this updated request object so that additional method calls can
	 * be chained together.
	 *
	 * @param configuration
	 *            The new website configuration to set for the specified bucket.
	 *
	 * @return This updated request object so that additional method calls can
	 *         be chained together.
	 */
	public SetBucketWebsiteConfigurationRequest withConfiguration(BucketWebsiteConfiguration configuration) {
		setConfiguration(configuration);
		return this;
	}
}

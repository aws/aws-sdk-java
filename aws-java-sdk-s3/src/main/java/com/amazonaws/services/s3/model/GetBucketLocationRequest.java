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

/**
 * Provides options for requesting an Amazon S3 bucket's location.  You
 * can choose a bucket's location when creating it to ensure that the
 * data stored in your bucket is geographically close to the applications
 * or customers accessing your data.
 *
 * @see CreateBucketRequest
 */
public class GetBucketLocationRequest extends AmazonWebServiceRequest implements Serializable {

	/** The name of the bucket whose location is being requested. */
	private String bucketName;

	
	/**
	 * Constructs a new request object to create a new bucket with the specified
	 * name.
	 * <p>
	 * When choosing a bucket name, keep in mind that Amazon S3 bucket names are
	 * globally unique.
	 * 
	 * @param bucketName
	 *            The name for the new bucket.
	 */
	public GetBucketLocationRequest(String bucketName) {
		this.bucketName = bucketName;
	}

	
	/**
	 * Returns the name of the bucket whose location is being requested.
	 *
	 * @return The name of the bucket whose location is being requested.
	 */
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * Sets the name of the bucket whose location is being requested.
	 *
	 * @param bucketName
	 *            The name of the bucket whose location is being requested.
	 */
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	/**
	 * Sets the name of the bucket whose location is being requested, and
	 * returns this updated object so that additional method calls can be
	 * chained together.
	 *
	 * @param bucketName
	 *            The name of the bucket whose location is being requested.
	 *
	 * @return This updated object, so that additional method calls can be
	 *         chained together.
	 */
	public GetBucketLocationRequest withBucketName(String bucketName) {
		setBucketName(bucketName);
		return this;
	}
}

/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <p>
     * When using this API with an access point, you must direct requests
     * to the access point hostname. The access point hostname takes the form
     * <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com.
     * </p>
     * <p>
     * When using this operation using an access point through the AWS SDKs, you provide
     * the access point ARN in place of the bucket name. For more information about access point
     * ARNs, see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html\">
     * Using Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
	 * @param bucketName
	 *            The name for the new bucket or access point ARN.
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

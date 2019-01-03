/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.resources;

import com.amazonaws.auth.policy.Resource;
import com.amazonaws.auth.policy.actions.S3Actions;

/**
 * Represents a bucket resource involved in an AWS access control policy. This
 * resource <b>does not</b> include any of the objects stored in the bucket. It
 * represents <b>only the bucket itself</b>. This is the resource you want if
 * you're writing a policy that restricts access to listing the contents of a
 * bucket, deleting a bucket, setting bucket configuration options, or any other
 * action that operates directly against a bucket (as opposed to an object).
 * <p>
 * If you want to write a policy that controls access to objects stored in your
 * bucket, see {@link S3ObjectResource}.
 * <p>
 * Amazon S3 bucket resources can be used in policies with the following
 * actions:
 * <ul>
 * <li> {@link S3Actions#CreateBucket}
 * <li> {@link S3Actions#DeleteBucket}
 * <li> {@link S3Actions#ListObjects}
 * <li> {@link S3Actions#ListObjectVersions}
 * <li> {@link S3Actions#ListBuckets}
 * <li> {@link S3Actions#GetBucketAcl}
 * <li> {@link S3Actions#SetBucketAcl}
 * <li> {@link S3Actions#GetBucketVersioningConfiguration}
 * <li> {@link S3Actions#SetBucketVersioningConfiguration}
 * <li> {@link S3Actions#GetBucketRequesterPays}
 * <li> {@link S3Actions#SetBucketRequesterPays}
 * <li> {@link S3Actions#GetBucketLocation}
 * <li> {@link S3Actions#GetBucketPolicy}
 * <li> {@link S3Actions#SetBucketPolicy}
 * <li> {@link S3Actions#SetBucketNotificationConfiguration}
 * <li> {@link S3Actions#GetBucketNotificationConfiguration}
 * </ul>
 */
public class S3BucketResource extends Resource {
    /**
     * Constructs a new bucket resource that represents the the specified bucket
     * but <b>not any of the contained objects</b>.
     *
     * @param bucketName
     *            The name of the bucket represented by this AWS access control
     *            policy resource.
     */
    public S3BucketResource(String bucketName) {
        this("aws", bucketName);
    }

    /**
     * Constructs a new bucket resource that represents the the specified bucket
     * but <b>not any of the contained objects</b>.
     *
     * @param partitionName
     *            The name of the partition in which the specified bucket is located.
     * @param bucketName
     *            The name of the bucket represented by this AWS access control
     *            policy resource.
     */
    public S3BucketResource(String partitionName, String bucketName) {
        super(String.format("arn:%s:s3:::%s", partitionName, bucketName));
    }
}

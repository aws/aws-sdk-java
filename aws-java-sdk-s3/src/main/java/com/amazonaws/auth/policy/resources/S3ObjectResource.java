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
 * Represents one or more Amazon S3 objects involved in an AWS access control
 * policy. S3 object resources can be fully specified (i.e. the full key) or you
 * can use the '*' wildcard to match multiple objects.
 * <p>
 * For example, an object resource created for bucket 'mybucket' and key pattern
 * 'foo*' will match any object stored in 'mybucket' with a key that starts with
 * 'foo':
 * <pre class="brush: java">
 *    new S3ObjectResource("mybucket", "foo*");
 * </pre>
 * <p>
 * To match all objects in a bucket:
 * <pre class="brush: java">
 *    new S3ObjectResource("mybucket", "*");
 * </pre>
 * <p>
 * Amazon S3 object resources can be used in the following operations:
 * <ul>
 * <li> {@link S3Actions#GetObject}
 * <li> {@link S3Actions#GetObjectVersion}
 * <li> {@link S3Actions#PutObject}
 * <li> {@link S3Actions#GetObjectAcl}
 * <li> {@link S3Actions#GetObjectVersionAcl}
 * <li> {@link S3Actions#SetObjectAcl}
 * <li> {@link S3Actions#SetObjectVersionAcl}
 * <li> {@link S3Actions#DeleteObject}
 * <li> {@link S3Actions#DeleteObjectVersion}
 * </ul>
 */
public class S3ObjectResource extends Resource {

	/**
     * Constructs a new object resource that represents the specified objects.
     * This constructor defaults to aws partition. Use {@link #S3ObjectResource(String, String, String)}
     * to specify other partitions if needed.
     * The keyPattern argument may contain the '*' wildcard to match multiple
     * objects. For example, an object resource created for bucket 'mybucket'
     * and key pattern 'foo*' will match any object stored in 'mybucket' with a
     * key that starts with 'foo'.
     *
     * @param bucketName
     *            The name of the bucket containing the object or objects
     *            represented by this resource.
     * @param keyPattern
     *            The key or key pattern, which can optionally contain the '*'
     *            wildcard to include multiple objects in the resource.
     *
     * @see #S3ObjectResource(String, String, String)
     */
    public S3ObjectResource(String bucketName, String keyPattern) {
        this("aws", bucketName, keyPattern);
    }

    /**
     * Constructs a new object resource that represents the specified objects.
     * The keyPattern argument may contain the '*' wildcard to match multiple
     * objects. For example, an object resource created for bucket 'mybucket'
     * and key pattern 'foo*' will match any object stored in 'mybucket' with a
     * key that starts with 'foo'.
     *
     * @param partitionName
     *            The name of the partition in which the specified bucket is located.
     * @param bucketName
     *            The name of the bucket containing the object or objects
     *            represented by this resource.
     * @param keyPattern
     *            The key or key pattern, which can optionally contain the '*'
     *            wildcard to include multiple objects in the resource.
     */
    public S3ObjectResource(String partitionName, String bucketName, String keyPattern) {
        super(String.format("arn:%s:s3:::%s/%s", partitionName, bucketName, keyPattern));
    }
}

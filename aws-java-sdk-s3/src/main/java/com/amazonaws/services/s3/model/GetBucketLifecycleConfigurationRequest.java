/*
 * Copyright 2015-2020 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import com.amazonaws.services.s3.AmazonS3;

/**
 * Request object for the parameters to get a bucket's lifecycle configuration.
 *
 * @see AmazonS3#getBucketLifecycleConfiguration(GetBucketLifecycleConfigurationRequest)
 */
public class GetBucketLifecycleConfigurationRequest extends GenericBucketRequest implements Serializable {

    /**
     * Creates a request object, ready to be executed to fetch the lifecycle
     * configuration for the specified bucket.
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
     *            The name of the bucket, or access point ARN, whose lifecycle configuration is being
     *            fetched.
     */
    public GetBucketLifecycleConfigurationRequest(String bucketName) {
        super(bucketName);
    }

}

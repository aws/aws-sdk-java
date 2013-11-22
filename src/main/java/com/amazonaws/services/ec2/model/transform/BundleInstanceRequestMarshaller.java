/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Bundle Instance Request Marshaller
 */
public class BundleInstanceRequestMarshaller implements Marshaller<Request<BundleInstanceRequest>, BundleInstanceRequest> {

    public Request<BundleInstanceRequest> marshall(BundleInstanceRequest bundleInstanceRequest) {

        if (bundleInstanceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<BundleInstanceRequest> request = new DefaultRequest<BundleInstanceRequest>(bundleInstanceRequest, "AmazonEC2");
        request.addParameter("Action", "BundleInstance");
        request.addParameter("Version", "2013-10-15");

        if (bundleInstanceRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(bundleInstanceRequest.getInstanceId()));
        }
        Storage storageStorage = bundleInstanceRequest.getStorage();
        if (storageStorage != null) {
            S3Storage s3StorageS3 = storageStorage.getS3();
            if (s3StorageS3 != null) {
                if (s3StorageS3.getBucket() != null) {
                    request.addParameter("Storage.S3.Bucket", StringUtils.fromString(s3StorageS3.getBucket()));
                }
                if (s3StorageS3.getPrefix() != null) {
                    request.addParameter("Storage.S3.Prefix", StringUtils.fromString(s3StorageS3.getPrefix()));
                }
                if (s3StorageS3.getAWSAccessKeyId() != null) {
                    request.addParameter("Storage.S3.AWSAccessKeyId", StringUtils.fromString(s3StorageS3.getAWSAccessKeyId()));
                }
                if (s3StorageS3.getUploadPolicy() != null) {
                    request.addParameter("Storage.S3.UploadPolicy", StringUtils.fromString(s3StorageS3.getUploadPolicy()));
                }
                if (s3StorageS3.getUploadPolicySignature() != null) {
                    request.addParameter("Storage.S3.UploadPolicySignature", StringUtils.fromString(s3StorageS3.getUploadPolicySignature()));
                }
            }
        }


        return request;
    }
}

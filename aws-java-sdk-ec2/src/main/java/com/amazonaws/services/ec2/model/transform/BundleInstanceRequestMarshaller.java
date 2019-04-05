/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * BundleInstanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BundleInstanceRequestMarshaller implements Marshaller<Request<BundleInstanceRequest>, BundleInstanceRequest> {

    public Request<BundleInstanceRequest> marshall(BundleInstanceRequest bundleInstanceRequest) {

        if (bundleInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<BundleInstanceRequest> request = new DefaultRequest<BundleInstanceRequest>(bundleInstanceRequest, "AmazonEC2");
        request.addParameter("Action", "BundleInstance");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (bundleInstanceRequest.getInstanceId() != null) {
            request.addParameter("InstanceId", StringUtils.fromString(bundleInstanceRequest.getInstanceId()));
        }

        Storage storage = bundleInstanceRequest.getStorage();
        if (storage != null) {

            S3Storage s3 = storage.getS3();
            if (s3 != null) {

                if (s3.getAWSAccessKeyId() != null) {
                    request.addParameter("Storage.S3.AWSAccessKeyId", StringUtils.fromString(s3.getAWSAccessKeyId()));
                }

                if (s3.getBucket() != null) {
                    request.addParameter("Storage.S3.Bucket", StringUtils.fromString(s3.getBucket()));
                }

                if (s3.getPrefix() != null) {
                    request.addParameter("Storage.S3.Prefix", StringUtils.fromString(s3.getPrefix()));
                }

                if (s3.getUploadPolicy() != null) {
                    request.addParameter("Storage.S3.UploadPolicy", StringUtils.fromString(s3.getUploadPolicy()));
                }

                if (s3.getUploadPolicySignature() != null) {
                    request.addParameter("Storage.S3.UploadPolicySignature", StringUtils.fromString(s3.getUploadPolicySignature()));
                }
            }
        }

        return request;
    }

}

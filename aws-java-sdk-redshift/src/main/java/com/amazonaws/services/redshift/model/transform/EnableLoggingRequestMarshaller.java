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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * EnableLoggingRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableLoggingRequestMarshaller implements Marshaller<Request<EnableLoggingRequest>, EnableLoggingRequest> {

    public Request<EnableLoggingRequest> marshall(EnableLoggingRequest enableLoggingRequest) {

        if (enableLoggingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<EnableLoggingRequest> request = new DefaultRequest<EnableLoggingRequest>(enableLoggingRequest, "AmazonRedshift");
        request.addParameter("Action", "EnableLogging");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (enableLoggingRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(enableLoggingRequest.getClusterIdentifier()));
        }

        if (enableLoggingRequest.getBucketName() != null) {
            request.addParameter("BucketName", StringUtils.fromString(enableLoggingRequest.getBucketName()));
        }

        if (enableLoggingRequest.getS3KeyPrefix() != null) {
            request.addParameter("S3KeyPrefix", StringUtils.fromString(enableLoggingRequest.getS3KeyPrefix()));
        }

        return request;
    }

}

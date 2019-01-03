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
package com.amazonaws.services.s3control.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * DeletePublicAccessBlockRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePublicAccessBlockRequestMarshaller implements Marshaller<Request<DeletePublicAccessBlockRequest>, DeletePublicAccessBlockRequest> {

    public Request<DeletePublicAccessBlockRequest> marshall(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest) {

        if (deletePublicAccessBlockRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeletePublicAccessBlockRequest> request = new DefaultRequest<DeletePublicAccessBlockRequest>(deletePublicAccessBlockRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.DELETE);

        if (deletePublicAccessBlockRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(deletePublicAccessBlockRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/configuration/publicAccessBlock";

        request.setResourcePath(uriResourcePath);

        return request;
    }

}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DeleteJobTaggingRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteJobTaggingRequestMarshaller implements Marshaller<Request<DeleteJobTaggingRequest>, DeleteJobTaggingRequest> {

    public Request<DeleteJobTaggingRequest> marshall(DeleteJobTaggingRequest deleteJobTaggingRequest) {

        if (deleteJobTaggingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteJobTaggingRequest> request = new DefaultRequest<DeleteJobTaggingRequest>(deleteJobTaggingRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.DELETE);

        if (deleteJobTaggingRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(deleteJobTaggingRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/jobs/{id}/tagging";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "id", deleteJobTaggingRequest.getJobId());
        request.setResourcePath(uriResourcePath);

        return request;
    }

}

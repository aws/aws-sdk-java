/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * UpdateJobStatusRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobStatusRequestMarshaller implements Marshaller<Request<UpdateJobStatusRequest>, UpdateJobStatusRequest> {

    public Request<UpdateJobStatusRequest> marshall(UpdateJobStatusRequest updateJobStatusRequest) {

        if (updateJobStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateJobStatusRequest> request = new DefaultRequest<UpdateJobStatusRequest>(updateJobStatusRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.POST);

        if (updateJobStatusRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(updateJobStatusRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/jobs/{id}/status";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "id", updateJobStatusRequest.getJobId());
        request.setResourcePath(uriResourcePath);

        if (updateJobStatusRequest.getRequestedJobStatus() != null) {
            request.addParameter("requestedJobStatus", StringUtils.fromString(updateJobStatusRequest.getRequestedJobStatus()));
        }

        if (updateJobStatusRequest.getStatusUpdateReason() != null) {
            request.addParameter("statusUpdateReason", StringUtils.fromString(updateJobStatusRequest.getStatusUpdateReason()));
        }

        return request;
    }

}

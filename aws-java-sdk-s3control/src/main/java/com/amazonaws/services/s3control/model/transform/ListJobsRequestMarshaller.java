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
 * ListJobsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequestMarshaller implements Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {

        if (listJobsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest, "AWSS3Control");

        request.setHttpMethod(HttpMethodName.GET);

        if (listJobsRequest.getAccountId() != null) {
            request.addHeader("x-amz-account-id", StringUtils.fromString(listJobsRequest.getAccountId()));
        }

        String uriResourcePath = "/v20180820/jobs";

        request.setResourcePath(uriResourcePath);

        if (listJobsRequest.getJobStatuses() != null && !(listJobsRequest.getJobStatuses().isEmpty())) {
            for (String value : listJobsRequest.getJobStatuses()) {
                request.addParameter("jobStatuses", StringUtils.fromString(value));
            }
        }

        if (listJobsRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listJobsRequest.getNextToken()));
        }

        if (listJobsRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listJobsRequest.getMaxResults()));
        }

        return request;
    }

}

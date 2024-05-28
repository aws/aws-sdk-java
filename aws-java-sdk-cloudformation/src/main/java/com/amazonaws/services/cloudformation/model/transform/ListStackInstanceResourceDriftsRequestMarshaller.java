/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListStackInstanceResourceDriftsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstanceResourceDriftsRequestMarshaller implements
        Marshaller<Request<ListStackInstanceResourceDriftsRequest>, ListStackInstanceResourceDriftsRequest> {

    public Request<ListStackInstanceResourceDriftsRequest> marshall(ListStackInstanceResourceDriftsRequest listStackInstanceResourceDriftsRequest) {

        if (listStackInstanceResourceDriftsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListStackInstanceResourceDriftsRequest> request = new DefaultRequest<ListStackInstanceResourceDriftsRequest>(
                listStackInstanceResourceDriftsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListStackInstanceResourceDrifts");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listStackInstanceResourceDriftsRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(listStackInstanceResourceDriftsRequest.getStackSetName()));
        }

        if (listStackInstanceResourceDriftsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listStackInstanceResourceDriftsRequest.getNextToken()));
        }

        if (listStackInstanceResourceDriftsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listStackInstanceResourceDriftsRequest.getMaxResults()));
        }

        if (listStackInstanceResourceDriftsRequest.getStackInstanceResourceDriftStatuses().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) listStackInstanceResourceDriftsRequest.getStackInstanceResourceDriftStatuses())
                        .isAutoConstruct()) {
            request.addParameter("StackInstanceResourceDriftStatuses", "");
        }
        if (!listStackInstanceResourceDriftsRequest.getStackInstanceResourceDriftStatuses().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) listStackInstanceResourceDriftsRequest.getStackInstanceResourceDriftStatuses())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> stackInstanceResourceDriftStatusesList = (com.amazonaws.internal.SdkInternalList<String>) listStackInstanceResourceDriftsRequest
                    .getStackInstanceResourceDriftStatuses();
            int stackInstanceResourceDriftStatusesListIndex = 1;

            for (String stackInstanceResourceDriftStatusesListValue : stackInstanceResourceDriftStatusesList) {
                if (stackInstanceResourceDriftStatusesListValue != null) {
                    request.addParameter("StackInstanceResourceDriftStatuses.member." + stackInstanceResourceDriftStatusesListIndex,
                            StringUtils.fromString(stackInstanceResourceDriftStatusesListValue));
                }
                stackInstanceResourceDriftStatusesListIndex++;
            }
        }

        if (listStackInstanceResourceDriftsRequest.getStackInstanceAccount() != null) {
            request.addParameter("StackInstanceAccount", StringUtils.fromString(listStackInstanceResourceDriftsRequest.getStackInstanceAccount()));
        }

        if (listStackInstanceResourceDriftsRequest.getStackInstanceRegion() != null) {
            request.addParameter("StackInstanceRegion", StringUtils.fromString(listStackInstanceResourceDriftsRequest.getStackInstanceRegion()));
        }

        if (listStackInstanceResourceDriftsRequest.getOperationId() != null) {
            request.addParameter("OperationId", StringUtils.fromString(listStackInstanceResourceDriftsRequest.getOperationId()));
        }

        if (listStackInstanceResourceDriftsRequest.getCallAs() != null) {
            request.addParameter("CallAs", StringUtils.fromString(listStackInstanceResourceDriftsRequest.getCallAs()));
        }

        return request;
    }

}

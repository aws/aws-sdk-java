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
 * ListStacksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStacksRequestMarshaller implements Marshaller<Request<ListStacksRequest>, ListStacksRequest> {

    public Request<ListStacksRequest> marshall(ListStacksRequest listStacksRequest) {

        if (listStacksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListStacksRequest> request = new DefaultRequest<ListStacksRequest>(listStacksRequest, "AmazonCloudFormation");
        request.addParameter("Action", "ListStacks");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (listStacksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listStacksRequest.getNextToken()));
        }

        if (listStacksRequest.getStackStatusFilters().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) listStacksRequest.getStackStatusFilters()).isAutoConstruct()) {
            request.addParameter("StackStatusFilter", "");
        }
        if (!listStacksRequest.getStackStatusFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) listStacksRequest.getStackStatusFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> stackStatusFiltersList = (com.amazonaws.internal.SdkInternalList<String>) listStacksRequest
                    .getStackStatusFilters();
            int stackStatusFiltersListIndex = 1;

            for (String stackStatusFiltersListValue : stackStatusFiltersList) {
                if (stackStatusFiltersListValue != null) {
                    request.addParameter("StackStatusFilter.member." + stackStatusFiltersListIndex, StringUtils.fromString(stackStatusFiltersListValue));
                }
                stackStatusFiltersListIndex++;
            }
        }

        return request;
    }

}

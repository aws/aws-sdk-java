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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ListPlatformBranchesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformBranchesRequestMarshaller implements Marshaller<Request<ListPlatformBranchesRequest>, ListPlatformBranchesRequest> {

    public Request<ListPlatformBranchesRequest> marshall(ListPlatformBranchesRequest listPlatformBranchesRequest) {

        if (listPlatformBranchesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPlatformBranchesRequest> request = new DefaultRequest<ListPlatformBranchesRequest>(listPlatformBranchesRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "ListPlatformBranches");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!listPlatformBranchesRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<SearchFilter>) listPlatformBranchesRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<SearchFilter> filtersList = (com.amazonaws.internal.SdkInternalList<SearchFilter>) listPlatformBranchesRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (SearchFilter filtersListValue : filtersList) {
                if (filtersListValue != null) {

                    if (filtersListValue.getAttribute() != null) {
                        request.addParameter("Filters.member." + filtersListIndex + ".Attribute", StringUtils.fromString(filtersListValue.getAttribute()));
                    }

                    if (filtersListValue.getOperator() != null) {
                        request.addParameter("Filters.member." + filtersListIndex + ".Operator", StringUtils.fromString(filtersListValue.getOperator()));
                    }

                    if (!filtersListValue.getValues().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                                .getValues();
                        int valuesListIndex = 1;

                        for (String valuesListValue : valuesList) {
                            if (valuesListValue != null) {
                                request.addParameter("Filters.member." + filtersListIndex + ".Values.member." + valuesListIndex,
                                        StringUtils.fromString(valuesListValue));
                            }
                            valuesListIndex++;
                        }
                    }
                }
                filtersListIndex++;
            }
        }

        if (listPlatformBranchesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(listPlatformBranchesRequest.getMaxRecords()));
        }

        if (listPlatformBranchesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listPlatformBranchesRequest.getNextToken()));
        }

        return request;
    }

}

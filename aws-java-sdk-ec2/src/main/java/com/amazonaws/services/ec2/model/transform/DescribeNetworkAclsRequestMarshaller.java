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
 * DescribeNetworkAclsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkAclsRequestMarshaller implements Marshaller<Request<DescribeNetworkAclsRequest>, DescribeNetworkAclsRequest> {

    public Request<DescribeNetworkAclsRequest> marshall(DescribeNetworkAclsRequest describeNetworkAclsRequest) {

        if (describeNetworkAclsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkAclsRequest> request = new DefaultRequest<DescribeNetworkAclsRequest>(describeNetworkAclsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkAcls");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkAclsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkAclsRequest
                .getFilters();
        if (!describeNetworkAclsRequestFiltersList.isEmpty() || !describeNetworkAclsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkAclsRequestFiltersListValue : describeNetworkAclsRequestFiltersList) {

                if (describeNetworkAclsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeNetworkAclsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkAclsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeNetworkAclsRequestNetworkAclIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkAclsRequest
                .getNetworkAclIds();
        if (!describeNetworkAclsRequestNetworkAclIdsList.isEmpty() || !describeNetworkAclsRequestNetworkAclIdsList.isAutoConstruct()) {
            int networkAclIdsListIndex = 1;

            for (String describeNetworkAclsRequestNetworkAclIdsListValue : describeNetworkAclsRequestNetworkAclIdsList) {
                if (describeNetworkAclsRequestNetworkAclIdsListValue != null) {
                    request.addParameter("NetworkAclId." + networkAclIdsListIndex, StringUtils.fromString(describeNetworkAclsRequestNetworkAclIdsListValue));
                }
                networkAclIdsListIndex++;
            }
        }

        if (describeNetworkAclsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkAclsRequest.getNextToken()));
        }

        if (describeNetworkAclsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkAclsRequest.getMaxResults()));
        }

        return request;
    }

}

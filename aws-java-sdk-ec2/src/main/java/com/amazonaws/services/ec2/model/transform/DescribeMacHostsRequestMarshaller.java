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
 * DescribeMacHostsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMacHostsRequestMarshaller implements Marshaller<Request<DescribeMacHostsRequest>, DescribeMacHostsRequest> {

    public Request<DescribeMacHostsRequest> marshall(DescribeMacHostsRequest describeMacHostsRequest) {

        if (describeMacHostsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeMacHostsRequest> request = new DefaultRequest<DescribeMacHostsRequest>(describeMacHostsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeMacHosts");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeMacHostsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeMacHostsRequest
                .getFilters();
        if (!describeMacHostsRequestFiltersList.isEmpty() || !describeMacHostsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeMacHostsRequestFiltersListValue : describeMacHostsRequestFiltersList) {

                if (describeMacHostsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeMacHostsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeMacHostsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeMacHostsRequestHostIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeMacHostsRequest
                .getHostIds();
        if (!describeMacHostsRequestHostIdsList.isEmpty() || !describeMacHostsRequestHostIdsList.isAutoConstruct()) {
            int hostIdsListIndex = 1;

            for (String describeMacHostsRequestHostIdsListValue : describeMacHostsRequestHostIdsList) {
                if (describeMacHostsRequestHostIdsListValue != null) {
                    request.addParameter("HostId." + hostIdsListIndex, StringUtils.fromString(describeMacHostsRequestHostIdsListValue));
                }
                hostIdsListIndex++;
            }
        }

        if (describeMacHostsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeMacHostsRequest.getMaxResults()));
        }

        if (describeMacHostsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeMacHostsRequest.getNextToken()));
        }

        return request;
    }

}

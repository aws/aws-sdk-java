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
 * DescribeHostsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostsRequestMarshaller implements Marshaller<Request<DescribeHostsRequest>, DescribeHostsRequest> {

    public Request<DescribeHostsRequest> marshall(DescribeHostsRequest describeHostsRequest) {

        if (describeHostsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeHostsRequest> request = new DefaultRequest<DescribeHostsRequest>(describeHostsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeHosts");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeHostsRequestFilterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeHostsRequest
                .getFilter();
        if (!describeHostsRequestFilterList.isEmpty() || !describeHostsRequestFilterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (Filter describeHostsRequestFilterListValue : describeHostsRequestFilterList) {

                if (describeHostsRequestFilterListValue.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name", StringUtils.fromString(describeHostsRequestFilterListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeHostsRequestFilterListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filterListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filterListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeHostsRequestHostIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeHostsRequest
                .getHostIds();
        if (!describeHostsRequestHostIdsList.isEmpty() || !describeHostsRequestHostIdsList.isAutoConstruct()) {
            int hostIdsListIndex = 1;

            for (String describeHostsRequestHostIdsListValue : describeHostsRequestHostIdsList) {
                if (describeHostsRequestHostIdsListValue != null) {
                    request.addParameter("HostId." + hostIdsListIndex, StringUtils.fromString(describeHostsRequestHostIdsListValue));
                }
                hostIdsListIndex++;
            }
        }

        if (describeHostsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeHostsRequest.getMaxResults()));
        }

        if (describeHostsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeHostsRequest.getNextToken()));
        }

        return request;
    }

}

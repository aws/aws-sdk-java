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
 * DescribeFlowLogsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowLogsRequestMarshaller implements Marshaller<Request<DescribeFlowLogsRequest>, DescribeFlowLogsRequest> {

    public Request<DescribeFlowLogsRequest> marshall(DescribeFlowLogsRequest describeFlowLogsRequest) {

        if (describeFlowLogsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFlowLogsRequest> request = new DefaultRequest<DescribeFlowLogsRequest>(describeFlowLogsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFlowLogs");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeFlowLogsRequestFilterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeFlowLogsRequest
                .getFilter();
        if (!describeFlowLogsRequestFilterList.isEmpty() || !describeFlowLogsRequestFilterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (Filter describeFlowLogsRequestFilterListValue : describeFlowLogsRequestFilterList) {

                if (describeFlowLogsRequestFilterListValue.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name", StringUtils.fromString(describeFlowLogsRequestFilterListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeFlowLogsRequestFilterListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeFlowLogsRequestFlowLogIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeFlowLogsRequest
                .getFlowLogIds();
        if (!describeFlowLogsRequestFlowLogIdsList.isEmpty() || !describeFlowLogsRequestFlowLogIdsList.isAutoConstruct()) {
            int flowLogIdsListIndex = 1;

            for (String describeFlowLogsRequestFlowLogIdsListValue : describeFlowLogsRequestFlowLogIdsList) {
                if (describeFlowLogsRequestFlowLogIdsListValue != null) {
                    request.addParameter("FlowLogId." + flowLogIdsListIndex, StringUtils.fromString(describeFlowLogsRequestFlowLogIdsListValue));
                }
                flowLogIdsListIndex++;
            }
        }

        if (describeFlowLogsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeFlowLogsRequest.getMaxResults()));
        }

        if (describeFlowLogsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeFlowLogsRequest.getNextToken()));
        }

        return request;
    }

}

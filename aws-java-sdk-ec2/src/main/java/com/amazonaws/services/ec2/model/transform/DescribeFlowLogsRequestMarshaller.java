/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeFlowLogsRequest Marshaller
 */

public class DescribeFlowLogsRequestMarshaller implements
        Marshaller<Request<DescribeFlowLogsRequest>, DescribeFlowLogsRequest> {

    public Request<DescribeFlowLogsRequest> marshall(
            DescribeFlowLogsRequest describeFlowLogsRequest) {

        if (describeFlowLogsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeFlowLogsRequest> request = new DefaultRequest<DescribeFlowLogsRequest>(
                describeFlowLogsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFlowLogs");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> flowLogIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeFlowLogsRequest
                .getFlowLogIds();
        if (!flowLogIdsList.isEmpty() || !flowLogIdsList.isAutoConstruct()) {
            int flowLogIdsListIndex = 1;

            for (String flowLogIdsListValue : flowLogIdsList) {
                if (flowLogIdsListValue != null) {
                    request.addParameter("FlowLogId." + flowLogIdsListIndex,
                            StringUtils.fromString(flowLogIdsListValue));
                }
                flowLogIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeFlowLogsRequest
                .getFilter();
        if (!filterList.isEmpty() || !filterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (Filter filterListValue : filterList) {

                if (filterListValue.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name",
                            StringUtils.fromString(filterListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filterListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filterListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filterListIndex++;
            }
        }

        if (describeFlowLogsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeFlowLogsRequest.getNextToken()));
        }

        if (describeFlowLogsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeFlowLogsRequest.getMaxResults()));
        }

        return request;
    }

}

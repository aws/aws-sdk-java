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
 * DescribeFleetInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetInstancesRequestMarshaller implements Marshaller<Request<DescribeFleetInstancesRequest>, DescribeFleetInstancesRequest> {

    public Request<DescribeFleetInstancesRequest> marshall(DescribeFleetInstancesRequest describeFleetInstancesRequest) {

        if (describeFleetInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFleetInstancesRequest> request = new DefaultRequest<DescribeFleetInstancesRequest>(describeFleetInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFleetInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeFleetInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeFleetInstancesRequest.getMaxResults()));
        }

        if (describeFleetInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeFleetInstancesRequest.getNextToken()));
        }

        if (describeFleetInstancesRequest.getFleetId() != null) {
            request.addParameter("FleetId", StringUtils.fromString(describeFleetInstancesRequest.getFleetId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeFleetInstancesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeFleetInstancesRequest
                .getFilters();
        if (!describeFleetInstancesRequestFiltersList.isEmpty() || !describeFleetInstancesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeFleetInstancesRequestFiltersListValue : describeFleetInstancesRequestFiltersList) {

                if (describeFleetInstancesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeFleetInstancesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeFleetInstancesRequestFiltersListValue
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

        return request;
    }

}

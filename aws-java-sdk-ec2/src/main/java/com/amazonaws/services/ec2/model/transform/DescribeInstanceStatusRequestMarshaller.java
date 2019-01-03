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
 * DescribeInstanceStatusRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceStatusRequestMarshaller implements Marshaller<Request<DescribeInstanceStatusRequest>, DescribeInstanceStatusRequest> {

    public Request<DescribeInstanceStatusRequest> marshall(DescribeInstanceStatusRequest describeInstanceStatusRequest) {

        if (describeInstanceStatusRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceStatusRequest> request = new DefaultRequest<DescribeInstanceStatusRequest>(describeInstanceStatusRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstanceStatus");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeInstanceStatusRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstanceStatusRequest
                .getFilters();
        if (!describeInstanceStatusRequestFiltersList.isEmpty() || !describeInstanceStatusRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstanceStatusRequestFiltersListValue : describeInstanceStatusRequestFiltersList) {

                if (describeInstanceStatusRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeInstanceStatusRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceStatusRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeInstanceStatusRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceStatusRequest
                .getInstanceIds();
        if (!describeInstanceStatusRequestInstanceIdsList.isEmpty() || !describeInstanceStatusRequestInstanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String describeInstanceStatusRequestInstanceIdsListValue : describeInstanceStatusRequestInstanceIdsList) {
                if (describeInstanceStatusRequestInstanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex, StringUtils.fromString(describeInstanceStatusRequestInstanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        if (describeInstanceStatusRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstanceStatusRequest.getMaxResults()));
        }

        if (describeInstanceStatusRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstanceStatusRequest.getNextToken()));
        }

        if (describeInstanceStatusRequest.getIncludeAllInstances() != null) {
            request.addParameter("IncludeAllInstances", StringUtils.fromBoolean(describeInstanceStatusRequest.getIncludeAllInstances()));
        }

        return request;
    }

}

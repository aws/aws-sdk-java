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
 * DescribeVpcEndpointConnectionNotificationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointConnectionNotificationsRequestMarshaller implements
        Marshaller<Request<DescribeVpcEndpointConnectionNotificationsRequest>, DescribeVpcEndpointConnectionNotificationsRequest> {

    public Request<DescribeVpcEndpointConnectionNotificationsRequest> marshall(
            DescribeVpcEndpointConnectionNotificationsRequest describeVpcEndpointConnectionNotificationsRequest) {

        if (describeVpcEndpointConnectionNotificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcEndpointConnectionNotificationsRequest> request = new DefaultRequest<DescribeVpcEndpointConnectionNotificationsRequest>(
                describeVpcEndpointConnectionNotificationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcEndpointConnectionNotifications");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeVpcEndpointConnectionNotificationsRequest.getConnectionNotificationId() != null) {
            request.addParameter("ConnectionNotificationId",
                    StringUtils.fromString(describeVpcEndpointConnectionNotificationsRequest.getConnectionNotificationId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcEndpointConnectionNotificationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcEndpointConnectionNotificationsRequest
                .getFilters();
        if (!describeVpcEndpointConnectionNotificationsRequestFiltersList.isEmpty()
                || !describeVpcEndpointConnectionNotificationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcEndpointConnectionNotificationsRequestFiltersListValue : describeVpcEndpointConnectionNotificationsRequestFiltersList) {

                if (describeVpcEndpointConnectionNotificationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpcEndpointConnectionNotificationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointConnectionNotificationsRequestFiltersListValue
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

        if (describeVpcEndpointConnectionNotificationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcEndpointConnectionNotificationsRequest.getMaxResults()));
        }

        if (describeVpcEndpointConnectionNotificationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcEndpointConnectionNotificationsRequest.getNextToken()));
        }

        return request;
    }

}

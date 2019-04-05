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
 * DescribeNetworkInterfacePermissionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfacePermissionsRequestMarshaller implements
        Marshaller<Request<DescribeNetworkInterfacePermissionsRequest>, DescribeNetworkInterfacePermissionsRequest> {

    public Request<DescribeNetworkInterfacePermissionsRequest> marshall(DescribeNetworkInterfacePermissionsRequest describeNetworkInterfacePermissionsRequest) {

        if (describeNetworkInterfacePermissionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInterfacePermissionsRequest> request = new DefaultRequest<DescribeNetworkInterfacePermissionsRequest>(
                describeNetworkInterfacePermissionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInterfacePermissions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInterfacePermissionsRequest
                .getNetworkInterfacePermissionIds();
        if (!describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsList.isEmpty()
                || !describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsList.isAutoConstruct()) {
            int networkInterfacePermissionIdsListIndex = 1;

            for (String describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsListValue : describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsList) {
                if (describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsListValue != null) {
                    request.addParameter("NetworkInterfacePermissionId." + networkInterfacePermissionIdsListIndex,
                            StringUtils.fromString(describeNetworkInterfacePermissionsRequestNetworkInterfacePermissionIdsListValue));
                }
                networkInterfacePermissionIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkInterfacePermissionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInterfacePermissionsRequest
                .getFilters();
        if (!describeNetworkInterfacePermissionsRequestFiltersList.isEmpty() || !describeNetworkInterfacePermissionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkInterfacePermissionsRequestFiltersListValue : describeNetworkInterfacePermissionsRequestFiltersList) {

                if (describeNetworkInterfacePermissionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeNetworkInterfacePermissionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInterfacePermissionsRequestFiltersListValue
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

        if (describeNetworkInterfacePermissionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkInterfacePermissionsRequest.getNextToken()));
        }

        if (describeNetworkInterfacePermissionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkInterfacePermissionsRequest.getMaxResults()));
        }

        return request;
    }

}

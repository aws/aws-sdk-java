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
 * DescribeReservedInstancesModificationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesModificationsRequestMarshaller implements
        Marshaller<Request<DescribeReservedInstancesModificationsRequest>, DescribeReservedInstancesModificationsRequest> {

    public Request<DescribeReservedInstancesModificationsRequest> marshall(
            DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest) {

        if (describeReservedInstancesModificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReservedInstancesModificationsRequest> request = new DefaultRequest<DescribeReservedInstancesModificationsRequest>(
                describeReservedInstancesModificationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReservedInstancesModifications");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeReservedInstancesModificationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeReservedInstancesModificationsRequest
                .getFilters();
        if (!describeReservedInstancesModificationsRequestFiltersList.isEmpty() || !describeReservedInstancesModificationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeReservedInstancesModificationsRequestFiltersListValue : describeReservedInstancesModificationsRequestFiltersList) {

                if (describeReservedInstancesModificationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeReservedInstancesModificationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesModificationsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeReservedInstancesModificationsRequestReservedInstancesModificationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesModificationsRequest
                .getReservedInstancesModificationIds();
        if (!describeReservedInstancesModificationsRequestReservedInstancesModificationIdsList.isEmpty()
                || !describeReservedInstancesModificationsRequestReservedInstancesModificationIdsList.isAutoConstruct()) {
            int reservedInstancesModificationIdsListIndex = 1;

            for (String describeReservedInstancesModificationsRequestReservedInstancesModificationIdsListValue : describeReservedInstancesModificationsRequestReservedInstancesModificationIdsList) {
                if (describeReservedInstancesModificationsRequestReservedInstancesModificationIdsListValue != null) {
                    request.addParameter("ReservedInstancesModificationId." + reservedInstancesModificationIdsListIndex,
                            StringUtils.fromString(describeReservedInstancesModificationsRequestReservedInstancesModificationIdsListValue));
                }
                reservedInstancesModificationIdsListIndex++;
            }
        }

        if (describeReservedInstancesModificationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeReservedInstancesModificationsRequest.getNextToken()));
        }

        return request;
    }

}

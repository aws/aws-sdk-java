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
 * DescribeInstanceCreditSpecificationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceCreditSpecificationsRequestMarshaller implements
        Marshaller<Request<DescribeInstanceCreditSpecificationsRequest>, DescribeInstanceCreditSpecificationsRequest> {

    public Request<DescribeInstanceCreditSpecificationsRequest> marshall(DescribeInstanceCreditSpecificationsRequest describeInstanceCreditSpecificationsRequest) {

        if (describeInstanceCreditSpecificationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceCreditSpecificationsRequest> request = new DefaultRequest<DescribeInstanceCreditSpecificationsRequest>(
                describeInstanceCreditSpecificationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstanceCreditSpecifications");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeInstanceCreditSpecificationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstanceCreditSpecificationsRequest
                .getFilters();
        if (!describeInstanceCreditSpecificationsRequestFiltersList.isEmpty() || !describeInstanceCreditSpecificationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstanceCreditSpecificationsRequestFiltersListValue : describeInstanceCreditSpecificationsRequestFiltersList) {

                if (describeInstanceCreditSpecificationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeInstanceCreditSpecificationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceCreditSpecificationsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeInstanceCreditSpecificationsRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceCreditSpecificationsRequest
                .getInstanceIds();
        if (!describeInstanceCreditSpecificationsRequestInstanceIdsList.isEmpty()
                || !describeInstanceCreditSpecificationsRequestInstanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String describeInstanceCreditSpecificationsRequestInstanceIdsListValue : describeInstanceCreditSpecificationsRequestInstanceIdsList) {
                if (describeInstanceCreditSpecificationsRequestInstanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex,
                            StringUtils.fromString(describeInstanceCreditSpecificationsRequestInstanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        if (describeInstanceCreditSpecificationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstanceCreditSpecificationsRequest.getMaxResults()));
        }

        if (describeInstanceCreditSpecificationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstanceCreditSpecificationsRequest.getNextToken()));
        }

        return request;
    }

}

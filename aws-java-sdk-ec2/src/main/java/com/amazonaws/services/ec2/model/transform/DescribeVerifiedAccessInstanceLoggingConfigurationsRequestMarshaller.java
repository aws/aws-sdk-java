/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeVerifiedAccessInstanceLoggingConfigurationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessInstanceLoggingConfigurationsRequestMarshaller implements
        Marshaller<Request<DescribeVerifiedAccessInstanceLoggingConfigurationsRequest>, DescribeVerifiedAccessInstanceLoggingConfigurationsRequest> {

    public Request<DescribeVerifiedAccessInstanceLoggingConfigurationsRequest> marshall(
            DescribeVerifiedAccessInstanceLoggingConfigurationsRequest describeVerifiedAccessInstanceLoggingConfigurationsRequest) {

        if (describeVerifiedAccessInstanceLoggingConfigurationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVerifiedAccessInstanceLoggingConfigurationsRequest> request = new DefaultRequest<DescribeVerifiedAccessInstanceLoggingConfigurationsRequest>(
                describeVerifiedAccessInstanceLoggingConfigurationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVerifiedAccessInstanceLoggingConfigurations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessInstanceLoggingConfigurationsRequest
                .getVerifiedAccessInstanceIds();
        if (!describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsList.isEmpty()
                || !describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsList.isAutoConstruct()) {
            int verifiedAccessInstanceIdsListIndex = 1;

            for (String describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsListValue : describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsList) {
                if (describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsListValue != null) {
                    request.addParameter("VerifiedAccessInstanceId." + verifiedAccessInstanceIdsListIndex,
                            StringUtils.fromString(describeVerifiedAccessInstanceLoggingConfigurationsRequestVerifiedAccessInstanceIdsListValue));
                }
                verifiedAccessInstanceIdsListIndex++;
            }
        }

        if (describeVerifiedAccessInstanceLoggingConfigurationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVerifiedAccessInstanceLoggingConfigurationsRequest.getMaxResults()));
        }

        if (describeVerifiedAccessInstanceLoggingConfigurationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVerifiedAccessInstanceLoggingConfigurationsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVerifiedAccessInstanceLoggingConfigurationsRequest
                .getFilters();
        if (!describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersList.isEmpty()
                || !describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersListValue : describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersList) {

                if (describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessInstanceLoggingConfigurationsRequestFiltersListValue
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

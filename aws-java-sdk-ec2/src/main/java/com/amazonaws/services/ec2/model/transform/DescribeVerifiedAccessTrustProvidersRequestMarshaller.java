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
 * DescribeVerifiedAccessTrustProvidersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessTrustProvidersRequestMarshaller implements
        Marshaller<Request<DescribeVerifiedAccessTrustProvidersRequest>, DescribeVerifiedAccessTrustProvidersRequest> {

    public Request<DescribeVerifiedAccessTrustProvidersRequest> marshall(DescribeVerifiedAccessTrustProvidersRequest describeVerifiedAccessTrustProvidersRequest) {

        if (describeVerifiedAccessTrustProvidersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVerifiedAccessTrustProvidersRequest> request = new DefaultRequest<DescribeVerifiedAccessTrustProvidersRequest>(
                describeVerifiedAccessTrustProvidersRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVerifiedAccessTrustProviders");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessTrustProvidersRequest
                .getVerifiedAccessTrustProviderIds();
        if (!describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsList.isEmpty()
                || !describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsList.isAutoConstruct()) {
            int verifiedAccessTrustProviderIdsListIndex = 1;

            for (String describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsListValue : describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsList) {
                if (describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsListValue != null) {
                    request.addParameter("VerifiedAccessTrustProviderId." + verifiedAccessTrustProviderIdsListIndex,
                            StringUtils.fromString(describeVerifiedAccessTrustProvidersRequestVerifiedAccessTrustProviderIdsListValue));
                }
                verifiedAccessTrustProviderIdsListIndex++;
            }
        }

        if (describeVerifiedAccessTrustProvidersRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVerifiedAccessTrustProvidersRequest.getMaxResults()));
        }

        if (describeVerifiedAccessTrustProvidersRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVerifiedAccessTrustProvidersRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVerifiedAccessTrustProvidersRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVerifiedAccessTrustProvidersRequest
                .getFilters();
        if (!describeVerifiedAccessTrustProvidersRequestFiltersList.isEmpty() || !describeVerifiedAccessTrustProvidersRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVerifiedAccessTrustProvidersRequestFiltersListValue : describeVerifiedAccessTrustProvidersRequestFiltersList) {

                if (describeVerifiedAccessTrustProvidersRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVerifiedAccessTrustProvidersRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessTrustProvidersRequestFiltersListValue
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

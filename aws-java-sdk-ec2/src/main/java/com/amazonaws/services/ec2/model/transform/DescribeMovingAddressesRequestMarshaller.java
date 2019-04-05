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
 * DescribeMovingAddressesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMovingAddressesRequestMarshaller implements Marshaller<Request<DescribeMovingAddressesRequest>, DescribeMovingAddressesRequest> {

    public Request<DescribeMovingAddressesRequest> marshall(DescribeMovingAddressesRequest describeMovingAddressesRequest) {

        if (describeMovingAddressesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeMovingAddressesRequest> request = new DefaultRequest<DescribeMovingAddressesRequest>(describeMovingAddressesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeMovingAddresses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeMovingAddressesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeMovingAddressesRequest
                .getFilters();
        if (!describeMovingAddressesRequestFiltersList.isEmpty() || !describeMovingAddressesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeMovingAddressesRequestFiltersListValue : describeMovingAddressesRequestFiltersList) {

                if (describeMovingAddressesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeMovingAddressesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeMovingAddressesRequestFiltersListValue
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

        if (describeMovingAddressesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeMovingAddressesRequest.getMaxResults()));
        }

        if (describeMovingAddressesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeMovingAddressesRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeMovingAddressesRequestPublicIpsList = (com.amazonaws.internal.SdkInternalList<String>) describeMovingAddressesRequest
                .getPublicIps();
        if (!describeMovingAddressesRequestPublicIpsList.isEmpty() || !describeMovingAddressesRequestPublicIpsList.isAutoConstruct()) {
            int publicIpsListIndex = 1;

            for (String describeMovingAddressesRequestPublicIpsListValue : describeMovingAddressesRequestPublicIpsList) {
                if (describeMovingAddressesRequestPublicIpsListValue != null) {
                    request.addParameter("PublicIp." + publicIpsListIndex, StringUtils.fromString(describeMovingAddressesRequestPublicIpsListValue));
                }
                publicIpsListIndex++;
            }
        }

        return request;
    }

}

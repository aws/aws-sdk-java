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
 * DescribeAddressesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressesRequestMarshaller implements Marshaller<Request<DescribeAddressesRequest>, DescribeAddressesRequest> {

    public Request<DescribeAddressesRequest> marshall(DescribeAddressesRequest describeAddressesRequest) {

        if (describeAddressesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAddressesRequest> request = new DefaultRequest<DescribeAddressesRequest>(describeAddressesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeAddresses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeAddressesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeAddressesRequest
                .getFilters();
        if (!describeAddressesRequestFiltersList.isEmpty() || !describeAddressesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeAddressesRequestFiltersListValue : describeAddressesRequestFiltersList) {

                if (describeAddressesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeAddressesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeAddressesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeAddressesRequestPublicIpsList = (com.amazonaws.internal.SdkInternalList<String>) describeAddressesRequest
                .getPublicIps();
        if (!describeAddressesRequestPublicIpsList.isEmpty() || !describeAddressesRequestPublicIpsList.isAutoConstruct()) {
            int publicIpsListIndex = 1;

            for (String describeAddressesRequestPublicIpsListValue : describeAddressesRequestPublicIpsList) {
                if (describeAddressesRequestPublicIpsListValue != null) {
                    request.addParameter("PublicIp." + publicIpsListIndex, StringUtils.fromString(describeAddressesRequestPublicIpsListValue));
                }
                publicIpsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeAddressesRequestAllocationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeAddressesRequest
                .getAllocationIds();
        if (!describeAddressesRequestAllocationIdsList.isEmpty() || !describeAddressesRequestAllocationIdsList.isAutoConstruct()) {
            int allocationIdsListIndex = 1;

            for (String describeAddressesRequestAllocationIdsListValue : describeAddressesRequestAllocationIdsList) {
                if (describeAddressesRequestAllocationIdsListValue != null) {
                    request.addParameter("AllocationId." + allocationIdsListIndex, StringUtils.fromString(describeAddressesRequestAllocationIdsListValue));
                }
                allocationIdsListIndex++;
            }
        }

        return request;
    }

}

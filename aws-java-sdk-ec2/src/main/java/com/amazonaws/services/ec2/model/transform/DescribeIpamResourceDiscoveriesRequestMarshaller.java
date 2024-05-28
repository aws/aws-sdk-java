/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeIpamResourceDiscoveriesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamResourceDiscoveriesRequestMarshaller implements
        Marshaller<Request<DescribeIpamResourceDiscoveriesRequest>, DescribeIpamResourceDiscoveriesRequest> {

    public Request<DescribeIpamResourceDiscoveriesRequest> marshall(DescribeIpamResourceDiscoveriesRequest describeIpamResourceDiscoveriesRequest) {

        if (describeIpamResourceDiscoveriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIpamResourceDiscoveriesRequest> request = new DefaultRequest<DescribeIpamResourceDiscoveriesRequest>(
                describeIpamResourceDiscoveriesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIpamResourceDiscoveries");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamResourceDiscoveriesRequest
                .getIpamResourceDiscoveryIds();
        if (!describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsList.isEmpty()
                || !describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsList.isAutoConstruct()) {
            int ipamResourceDiscoveryIdsListIndex = 1;

            for (String describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsListValue : describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsList) {
                if (describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsListValue != null) {
                    request.addParameter("IpamResourceDiscoveryId." + ipamResourceDiscoveryIdsListIndex,
                            StringUtils.fromString(describeIpamResourceDiscoveriesRequestIpamResourceDiscoveryIdsListValue));
                }
                ipamResourceDiscoveryIdsListIndex++;
            }
        }

        if (describeIpamResourceDiscoveriesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIpamResourceDiscoveriesRequest.getNextToken()));
        }

        if (describeIpamResourceDiscoveriesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIpamResourceDiscoveriesRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeIpamResourceDiscoveriesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIpamResourceDiscoveriesRequest
                .getFilters();
        if (!describeIpamResourceDiscoveriesRequestFiltersList.isEmpty() || !describeIpamResourceDiscoveriesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIpamResourceDiscoveriesRequestFiltersListValue : describeIpamResourceDiscoveriesRequestFiltersList) {

                if (describeIpamResourceDiscoveriesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeIpamResourceDiscoveriesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamResourceDiscoveriesRequestFiltersListValue
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

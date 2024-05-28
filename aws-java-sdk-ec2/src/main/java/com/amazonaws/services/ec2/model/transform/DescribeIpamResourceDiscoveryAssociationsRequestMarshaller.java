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
 * DescribeIpamResourceDiscoveryAssociationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamResourceDiscoveryAssociationsRequestMarshaller implements
        Marshaller<Request<DescribeIpamResourceDiscoveryAssociationsRequest>, DescribeIpamResourceDiscoveryAssociationsRequest> {

    public Request<DescribeIpamResourceDiscoveryAssociationsRequest> marshall(
            DescribeIpamResourceDiscoveryAssociationsRequest describeIpamResourceDiscoveryAssociationsRequest) {

        if (describeIpamResourceDiscoveryAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIpamResourceDiscoveryAssociationsRequest> request = new DefaultRequest<DescribeIpamResourceDiscoveryAssociationsRequest>(
                describeIpamResourceDiscoveryAssociationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIpamResourceDiscoveryAssociations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamResourceDiscoveryAssociationsRequest
                .getIpamResourceDiscoveryAssociationIds();
        if (!describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsList.isEmpty()
                || !describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsList.isAutoConstruct()) {
            int ipamResourceDiscoveryAssociationIdsListIndex = 1;

            for (String describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsListValue : describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsList) {
                if (describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsListValue != null) {
                    request.addParameter("IpamResourceDiscoveryAssociationId." + ipamResourceDiscoveryAssociationIdsListIndex,
                            StringUtils.fromString(describeIpamResourceDiscoveryAssociationsRequestIpamResourceDiscoveryAssociationIdsListValue));
                }
                ipamResourceDiscoveryAssociationIdsListIndex++;
            }
        }

        if (describeIpamResourceDiscoveryAssociationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIpamResourceDiscoveryAssociationsRequest.getNextToken()));
        }

        if (describeIpamResourceDiscoveryAssociationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIpamResourceDiscoveryAssociationsRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeIpamResourceDiscoveryAssociationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIpamResourceDiscoveryAssociationsRequest
                .getFilters();
        if (!describeIpamResourceDiscoveryAssociationsRequestFiltersList.isEmpty()
                || !describeIpamResourceDiscoveryAssociationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIpamResourceDiscoveryAssociationsRequestFiltersListValue : describeIpamResourceDiscoveryAssociationsRequestFiltersList) {

                if (describeIpamResourceDiscoveryAssociationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeIpamResourceDiscoveryAssociationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamResourceDiscoveryAssociationsRequestFiltersListValue
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

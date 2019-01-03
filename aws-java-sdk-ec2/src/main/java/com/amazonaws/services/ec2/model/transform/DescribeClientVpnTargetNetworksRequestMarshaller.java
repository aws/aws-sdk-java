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
 * DescribeClientVpnTargetNetworksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientVpnTargetNetworksRequestMarshaller implements
        Marshaller<Request<DescribeClientVpnTargetNetworksRequest>, DescribeClientVpnTargetNetworksRequest> {

    public Request<DescribeClientVpnTargetNetworksRequest> marshall(DescribeClientVpnTargetNetworksRequest describeClientVpnTargetNetworksRequest) {

        if (describeClientVpnTargetNetworksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClientVpnTargetNetworksRequest> request = new DefaultRequest<DescribeClientVpnTargetNetworksRequest>(
                describeClientVpnTargetNetworksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeClientVpnTargetNetworks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClientVpnTargetNetworksRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(describeClientVpnTargetNetworksRequest.getClientVpnEndpointId()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeClientVpnTargetNetworksRequestAssociationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeClientVpnTargetNetworksRequest
                .getAssociationIds();
        if (!describeClientVpnTargetNetworksRequestAssociationIdsList.isEmpty() || !describeClientVpnTargetNetworksRequestAssociationIdsList.isAutoConstruct()) {
            int associationIdsListIndex = 1;

            for (String describeClientVpnTargetNetworksRequestAssociationIdsListValue : describeClientVpnTargetNetworksRequestAssociationIdsList) {
                if (describeClientVpnTargetNetworksRequestAssociationIdsListValue != null) {
                    request.addParameter("AssociationIds." + associationIdsListIndex,
                            StringUtils.fromString(describeClientVpnTargetNetworksRequestAssociationIdsListValue));
                }
                associationIdsListIndex++;
            }
        }

        if (describeClientVpnTargetNetworksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeClientVpnTargetNetworksRequest.getMaxResults()));
        }

        if (describeClientVpnTargetNetworksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeClientVpnTargetNetworksRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeClientVpnTargetNetworksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeClientVpnTargetNetworksRequest
                .getFilters();
        if (!describeClientVpnTargetNetworksRequestFiltersList.isEmpty() || !describeClientVpnTargetNetworksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeClientVpnTargetNetworksRequestFiltersListValue : describeClientVpnTargetNetworksRequestFiltersList) {

                if (describeClientVpnTargetNetworksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeClientVpnTargetNetworksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeClientVpnTargetNetworksRequestFiltersListValue
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

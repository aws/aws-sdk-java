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
 * GetIpamDiscoveredResourceCidrsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamDiscoveredResourceCidrsRequestMarshaller implements
        Marshaller<Request<GetIpamDiscoveredResourceCidrsRequest>, GetIpamDiscoveredResourceCidrsRequest> {

    public Request<GetIpamDiscoveredResourceCidrsRequest> marshall(GetIpamDiscoveredResourceCidrsRequest getIpamDiscoveredResourceCidrsRequest) {

        if (getIpamDiscoveredResourceCidrsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetIpamDiscoveredResourceCidrsRequest> request = new DefaultRequest<GetIpamDiscoveredResourceCidrsRequest>(
                getIpamDiscoveredResourceCidrsRequest, "AmazonEC2");
        request.addParameter("Action", "GetIpamDiscoveredResourceCidrs");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getIpamDiscoveredResourceCidrsRequest.getIpamResourceDiscoveryId() != null) {
            request.addParameter("IpamResourceDiscoveryId", StringUtils.fromString(getIpamDiscoveredResourceCidrsRequest.getIpamResourceDiscoveryId()));
        }

        if (getIpamDiscoveredResourceCidrsRequest.getResourceRegion() != null) {
            request.addParameter("ResourceRegion", StringUtils.fromString(getIpamDiscoveredResourceCidrsRequest.getResourceRegion()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getIpamDiscoveredResourceCidrsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getIpamDiscoveredResourceCidrsRequest
                .getFilters();
        if (!getIpamDiscoveredResourceCidrsRequestFiltersList.isEmpty() || !getIpamDiscoveredResourceCidrsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getIpamDiscoveredResourceCidrsRequestFiltersListValue : getIpamDiscoveredResourceCidrsRequestFiltersList) {

                if (getIpamDiscoveredResourceCidrsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getIpamDiscoveredResourceCidrsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getIpamDiscoveredResourceCidrsRequestFiltersListValue
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

        if (getIpamDiscoveredResourceCidrsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getIpamDiscoveredResourceCidrsRequest.getNextToken()));
        }

        if (getIpamDiscoveredResourceCidrsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getIpamDiscoveredResourceCidrsRequest.getMaxResults()));
        }

        return request;
    }

}

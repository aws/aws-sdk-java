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
 * GetIpamPoolAllocationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamPoolAllocationsRequestMarshaller implements Marshaller<Request<GetIpamPoolAllocationsRequest>, GetIpamPoolAllocationsRequest> {

    public Request<GetIpamPoolAllocationsRequest> marshall(GetIpamPoolAllocationsRequest getIpamPoolAllocationsRequest) {

        if (getIpamPoolAllocationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetIpamPoolAllocationsRequest> request = new DefaultRequest<GetIpamPoolAllocationsRequest>(getIpamPoolAllocationsRequest, "AmazonEC2");
        request.addParameter("Action", "GetIpamPoolAllocations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getIpamPoolAllocationsRequest.getIpamPoolId() != null) {
            request.addParameter("IpamPoolId", StringUtils.fromString(getIpamPoolAllocationsRequest.getIpamPoolId()));
        }

        if (getIpamPoolAllocationsRequest.getIpamPoolAllocationId() != null) {
            request.addParameter("IpamPoolAllocationId", StringUtils.fromString(getIpamPoolAllocationsRequest.getIpamPoolAllocationId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getIpamPoolAllocationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getIpamPoolAllocationsRequest
                .getFilters();
        if (!getIpamPoolAllocationsRequestFiltersList.isEmpty() || !getIpamPoolAllocationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getIpamPoolAllocationsRequestFiltersListValue : getIpamPoolAllocationsRequestFiltersList) {

                if (getIpamPoolAllocationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getIpamPoolAllocationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getIpamPoolAllocationsRequestFiltersListValue
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

        if (getIpamPoolAllocationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getIpamPoolAllocationsRequest.getMaxResults()));
        }

        if (getIpamPoolAllocationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getIpamPoolAllocationsRequest.getNextToken()));
        }

        return request;
    }

}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetCoipPoolUsageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoipPoolUsageRequestMarshaller implements Marshaller<Request<GetCoipPoolUsageRequest>, GetCoipPoolUsageRequest> {

    public Request<GetCoipPoolUsageRequest> marshall(GetCoipPoolUsageRequest getCoipPoolUsageRequest) {

        if (getCoipPoolUsageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetCoipPoolUsageRequest> request = new DefaultRequest<GetCoipPoolUsageRequest>(getCoipPoolUsageRequest, "AmazonEC2");
        request.addParameter("Action", "GetCoipPoolUsage");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getCoipPoolUsageRequest.getPoolId() != null) {
            request.addParameter("PoolId", StringUtils.fromString(getCoipPoolUsageRequest.getPoolId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getCoipPoolUsageRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getCoipPoolUsageRequest
                .getFilters();
        if (!getCoipPoolUsageRequestFiltersList.isEmpty() || !getCoipPoolUsageRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getCoipPoolUsageRequestFiltersListValue : getCoipPoolUsageRequestFiltersList) {

                if (getCoipPoolUsageRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(getCoipPoolUsageRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getCoipPoolUsageRequestFiltersListValue
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

        if (getCoipPoolUsageRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getCoipPoolUsageRequest.getMaxResults()));
        }

        if (getCoipPoolUsageRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getCoipPoolUsageRequest.getNextToken()));
        }

        return request;
    }

}

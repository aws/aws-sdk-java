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
 * DescribeFleetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetsRequestMarshaller implements Marshaller<Request<DescribeFleetsRequest>, DescribeFleetsRequest> {

    public Request<DescribeFleetsRequest> marshall(DescribeFleetsRequest describeFleetsRequest) {

        if (describeFleetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeFleetsRequest> request = new DefaultRequest<DescribeFleetsRequest>(describeFleetsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeFleets");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeFleetsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeFleetsRequest.getMaxResults()));
        }

        if (describeFleetsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeFleetsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeFleetsRequestFleetIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeFleetsRequest
                .getFleetIds();
        if (!describeFleetsRequestFleetIdsList.isEmpty() || !describeFleetsRequestFleetIdsList.isAutoConstruct()) {
            int fleetIdsListIndex = 1;

            for (String describeFleetsRequestFleetIdsListValue : describeFleetsRequestFleetIdsList) {
                if (describeFleetsRequestFleetIdsListValue != null) {
                    request.addParameter("FleetId." + fleetIdsListIndex, StringUtils.fromString(describeFleetsRequestFleetIdsListValue));
                }
                fleetIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeFleetsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeFleetsRequest
                .getFilters();
        if (!describeFleetsRequestFiltersList.isEmpty() || !describeFleetsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeFleetsRequestFiltersListValue : describeFleetsRequestFiltersList) {

                if (describeFleetsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeFleetsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeFleetsRequestFiltersListValue
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

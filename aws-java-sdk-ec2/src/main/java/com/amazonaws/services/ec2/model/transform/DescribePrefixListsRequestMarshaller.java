/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribePrefixListsRequest Marshaller
 */

public class DescribePrefixListsRequestMarshaller implements Marshaller<Request<DescribePrefixListsRequest>, DescribePrefixListsRequest> {

    public Request<DescribePrefixListsRequest> marshall(DescribePrefixListsRequest describePrefixListsRequest) {

        if (describePrefixListsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePrefixListsRequest> request = new DefaultRequest<DescribePrefixListsRequest>(describePrefixListsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribePrefixLists");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describePrefixListsRequestPrefixListIdsList = (com.amazonaws.internal.SdkInternalList<String>) describePrefixListsRequest
                .getPrefixListIds();
        if (!describePrefixListsRequestPrefixListIdsList.isEmpty() || !describePrefixListsRequestPrefixListIdsList.isAutoConstruct()) {
            int prefixListIdsListIndex = 1;

            for (String describePrefixListsRequestPrefixListIdsListValue : describePrefixListsRequestPrefixListIdsList) {
                if (describePrefixListsRequestPrefixListIdsListValue != null) {
                    request.addParameter("PrefixListId." + prefixListIdsListIndex, StringUtils.fromString(describePrefixListsRequestPrefixListIdsListValue));
                }
                prefixListIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describePrefixListsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describePrefixListsRequest
                .getFilters();
        if (!describePrefixListsRequestFiltersList.isEmpty() || !describePrefixListsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describePrefixListsRequestFiltersListValue : describePrefixListsRequestFiltersList) {

                if (describePrefixListsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describePrefixListsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describePrefixListsRequestFiltersListValue
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

        if (describePrefixListsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describePrefixListsRequest.getMaxResults()));
        }

        if (describePrefixListsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describePrefixListsRequest.getNextToken()));
        }

        return request;
    }

}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeManagedPrefixListsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedPrefixListsRequestMarshaller implements Marshaller<Request<DescribeManagedPrefixListsRequest>, DescribeManagedPrefixListsRequest> {

    public Request<DescribeManagedPrefixListsRequest> marshall(DescribeManagedPrefixListsRequest describeManagedPrefixListsRequest) {

        if (describeManagedPrefixListsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeManagedPrefixListsRequest> request = new DefaultRequest<DescribeManagedPrefixListsRequest>(describeManagedPrefixListsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeManagedPrefixLists");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeManagedPrefixListsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeManagedPrefixListsRequest
                .getFilters();
        if (!describeManagedPrefixListsRequestFiltersList.isEmpty() || !describeManagedPrefixListsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeManagedPrefixListsRequestFiltersListValue : describeManagedPrefixListsRequestFiltersList) {

                if (describeManagedPrefixListsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeManagedPrefixListsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeManagedPrefixListsRequestFiltersListValue
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

        if (describeManagedPrefixListsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeManagedPrefixListsRequest.getMaxResults()));
        }

        if (describeManagedPrefixListsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeManagedPrefixListsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeManagedPrefixListsRequestPrefixListIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeManagedPrefixListsRequest
                .getPrefixListIds();
        if (!describeManagedPrefixListsRequestPrefixListIdsList.isEmpty() || !describeManagedPrefixListsRequestPrefixListIdsList.isAutoConstruct()) {
            int prefixListIdsListIndex = 1;

            for (String describeManagedPrefixListsRequestPrefixListIdsListValue : describeManagedPrefixListsRequestPrefixListIdsList) {
                if (describeManagedPrefixListsRequestPrefixListIdsListValue != null) {
                    request.addParameter("PrefixListId." + prefixListIdsListIndex,
                            StringUtils.fromString(describeManagedPrefixListsRequestPrefixListIdsListValue));
                }
                prefixListIdsListIndex++;
            }
        }

        return request;
    }

}

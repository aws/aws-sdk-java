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
 * DescribePlacementGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePlacementGroupsRequestMarshaller implements Marshaller<Request<DescribePlacementGroupsRequest>, DescribePlacementGroupsRequest> {

    public Request<DescribePlacementGroupsRequest> marshall(DescribePlacementGroupsRequest describePlacementGroupsRequest) {

        if (describePlacementGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribePlacementGroupsRequest> request = new DefaultRequest<DescribePlacementGroupsRequest>(describePlacementGroupsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribePlacementGroups");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describePlacementGroupsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describePlacementGroupsRequest
                .getFilters();
        if (!describePlacementGroupsRequestFiltersList.isEmpty() || !describePlacementGroupsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describePlacementGroupsRequestFiltersListValue : describePlacementGroupsRequestFiltersList) {

                if (describePlacementGroupsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describePlacementGroupsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describePlacementGroupsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describePlacementGroupsRequestGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) describePlacementGroupsRequest
                .getGroupNames();
        if (!describePlacementGroupsRequestGroupNamesList.isEmpty() || !describePlacementGroupsRequestGroupNamesList.isAutoConstruct()) {
            int groupNamesListIndex = 1;

            for (String describePlacementGroupsRequestGroupNamesListValue : describePlacementGroupsRequestGroupNamesList) {
                if (describePlacementGroupsRequestGroupNamesListValue != null) {
                    request.addParameter("GroupName." + groupNamesListIndex, StringUtils.fromString(describePlacementGroupsRequestGroupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }

        return request;
    }

}

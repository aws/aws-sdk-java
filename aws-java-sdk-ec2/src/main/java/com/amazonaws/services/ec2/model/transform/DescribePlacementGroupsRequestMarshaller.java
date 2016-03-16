/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
 * DescribePlacementGroupsRequest Marshaller
 */

public class DescribePlacementGroupsRequestMarshaller
        implements
        Marshaller<Request<DescribePlacementGroupsRequest>, DescribePlacementGroupsRequest> {

    public Request<DescribePlacementGroupsRequest> marshall(
            DescribePlacementGroupsRequest describePlacementGroupsRequest) {

        if (describePlacementGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribePlacementGroupsRequest> request = new DefaultRequest<DescribePlacementGroupsRequest>(
                describePlacementGroupsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribePlacementGroups");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> groupNamesList = (com.amazonaws.internal.SdkInternalList<String>) describePlacementGroupsRequest
                .getGroupNames();
        if (!groupNamesList.isEmpty() || !groupNamesList.isAutoConstruct()) {
            int groupNamesListIndex = 1;

            for (String groupNamesListValue : groupNamesList) {
                if (groupNamesListValue != null) {
                    request.addParameter("GroupName." + groupNamesListIndex,
                            StringUtils.fromString(groupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describePlacementGroupsRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
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

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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeDBClusterParameterGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterParameterGroupsRequestMarshaller implements
        Marshaller<Request<DescribeDBClusterParameterGroupsRequest>, DescribeDBClusterParameterGroupsRequest> {

    public Request<DescribeDBClusterParameterGroupsRequest> marshall(DescribeDBClusterParameterGroupsRequest describeDBClusterParameterGroupsRequest) {

        if (describeDBClusterParameterGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBClusterParameterGroupsRequest> request = new DefaultRequest<DescribeDBClusterParameterGroupsRequest>(
                describeDBClusterParameterGroupsRequest, "AmazonNeptune");
        request.addParameter("Action", "DescribeDBClusterParameterGroups");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBClusterParameterGroupsRequest.getDBClusterParameterGroupName() != null) {
            request.addParameter("DBClusterParameterGroupName",
                    StringUtils.fromString(describeDBClusterParameterGroupsRequest.getDBClusterParameterGroupName()));
        }

        if (describeDBClusterParameterGroupsRequest.getFilters() != null) {
            java.util.List<Filter> filtersList = describeDBClusterParameterGroupsRequest.getFilters();
            if (filtersList.isEmpty()) {
                request.addParameter("Filters", "");
            } else {
                int filtersListIndex = 1;

                for (Filter filtersListValue : filtersList) {

                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }

                    if (filtersListValue.getValues() != null) {
                        java.util.List<String> valuesList = filtersListValue.getValues();
                        if (valuesList.isEmpty()) {
                            request.addParameter("Filters.Filter." + filtersListIndex + ".Values", "");
                        } else {
                            int valuesListIndex = 1;

                            for (String valuesListValue : valuesList) {
                                if (valuesListValue != null) {
                                    request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                            StringUtils.fromString(valuesListValue));
                                }
                                valuesListIndex++;
                            }
                        }
                    }
                    filtersListIndex++;
                }
            }
        }

        if (describeDBClusterParameterGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBClusterParameterGroupsRequest.getMaxRecords()));
        }

        if (describeDBClusterParameterGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBClusterParameterGroupsRequest.getMarker()));
        }

        return request;
    }

}

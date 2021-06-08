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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeUsersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUsersRequestMarshaller implements Marshaller<Request<DescribeUsersRequest>, DescribeUsersRequest> {

    public Request<DescribeUsersRequest> marshall(DescribeUsersRequest describeUsersRequest) {

        if (describeUsersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeUsersRequest> request = new DefaultRequest<DescribeUsersRequest>(describeUsersRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeUsers");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeUsersRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(describeUsersRequest.getEngine()));
        }

        if (describeUsersRequest.getUserId() != null) {
            request.addParameter("UserId", StringUtils.fromString(describeUsersRequest.getUserId()));
        }

        if (!describeUsersRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Filter>) describeUsersRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeUsersRequest.getFilters();
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {
                if (filtersListValue != null) {

                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filters.member." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }

                    if (!filtersListValue.getValues().isEmpty()
                            || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                        com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                                .getValues();
                        int valuesListIndex = 1;

                        for (String valuesListValue : valuesList) {
                            if (valuesListValue != null) {
                                request.addParameter("Filters.member." + filtersListIndex + ".Values.member." + valuesListIndex,
                                        StringUtils.fromString(valuesListValue));
                            }
                            valuesListIndex++;
                        }
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeUsersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeUsersRequest.getMaxRecords()));
        }

        if (describeUsersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeUsersRequest.getMarker()));
        }

        return request;
    }

}

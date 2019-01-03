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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeDBClusterBacktracksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterBacktracksRequestMarshaller implements
        Marshaller<Request<DescribeDBClusterBacktracksRequest>, DescribeDBClusterBacktracksRequest> {

    public Request<DescribeDBClusterBacktracksRequest> marshall(DescribeDBClusterBacktracksRequest describeDBClusterBacktracksRequest) {

        if (describeDBClusterBacktracksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeDBClusterBacktracksRequest> request = new DefaultRequest<DescribeDBClusterBacktracksRequest>(describeDBClusterBacktracksRequest,
                "AmazonRDS");
        request.addParameter("Action", "DescribeDBClusterBacktracks");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeDBClusterBacktracksRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils.fromString(describeDBClusterBacktracksRequest.getDBClusterIdentifier()));
        }

        if (describeDBClusterBacktracksRequest.getBacktrackIdentifier() != null) {
            request.addParameter("BacktrackIdentifier", StringUtils.fromString(describeDBClusterBacktracksRequest.getBacktrackIdentifier()));
        }

        if (!describeDBClusterBacktracksRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Filter>) describeDBClusterBacktracksRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeDBClusterBacktracksRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                if (!filtersListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeDBClusterBacktracksRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBClusterBacktracksRequest.getMaxRecords()));
        }

        if (describeDBClusterBacktracksRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBClusterBacktracksRequest.getMarker()));
        }

        return request;
    }

}

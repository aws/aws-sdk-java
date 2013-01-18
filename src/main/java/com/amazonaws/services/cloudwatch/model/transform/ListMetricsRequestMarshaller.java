/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Metrics Request Marshaller
 */
public class ListMetricsRequestMarshaller implements Marshaller<Request<ListMetricsRequest>, ListMetricsRequest> {

    public Request<ListMetricsRequest> marshall(ListMetricsRequest listMetricsRequest) {

        if (listMetricsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ListMetricsRequest> request = new DefaultRequest<ListMetricsRequest>(listMetricsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "ListMetrics");
        request.addParameter("Version", "2010-08-01");

        if (listMetricsRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(listMetricsRequest.getNamespace()));
        }
        if (listMetricsRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(listMetricsRequest.getMetricName()));
        }

        java.util.List<DimensionFilter> dimensionsList = listMetricsRequest.getDimensions();
        int dimensionsListIndex = 1;

        for (DimensionFilter dimensionsListValue : dimensionsList) {
            DimensionFilter dimensionFilterMember = dimensionsListValue;
            if (dimensionFilterMember != null) {
                if (dimensionFilterMember.getName() != null) {
                    request.addParameter("Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionFilterMember.getName()));
                }
                if (dimensionFilterMember.getValue() != null) {
                    request.addParameter("Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionFilterMember.getValue()));
                }
            }

            dimensionsListIndex++;
        }
        if (listMetricsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listMetricsRequest.getNextToken()));
        }


        return request;
    }
}

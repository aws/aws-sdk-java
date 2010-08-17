/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Get Metric Statistics Request Marshaller
 */
public class GetMetricStatisticsRequestMarshaller implements Marshaller<Request<GetMetricStatisticsRequest>, GetMetricStatisticsRequest> {

    public Request<GetMetricStatisticsRequest> marshall(GetMetricStatisticsRequest getMetricStatisticsRequest) {
        Request<GetMetricStatisticsRequest> request = new DefaultRequest<GetMetricStatisticsRequest>(getMetricStatisticsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "GetMetricStatistics");
        request.addParameter("Version", "2009-05-15");
        if (getMetricStatisticsRequest != null) {
            java.util.List<String> statisticsList = getMetricStatisticsRequest.getStatistics();
            int statisticsListIndex = 1;
            for (String statisticsListValue : statisticsList) {
                if (statisticsListValue != null) {
                    request.addParameter("Statistics.member." + statisticsListIndex, StringUtils.fromString(statisticsListValue));
                }
                statisticsListIndex++;
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getPeriod() != null) {
                request.addParameter("Period", StringUtils.fromInteger(getMetricStatisticsRequest.getPeriod()));
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getMeasureName() != null) {
                request.addParameter("MeasureName", StringUtils.fromString(getMetricStatisticsRequest.getMeasureName()));
            }
        }

        if (getMetricStatisticsRequest != null) {
            java.util.List<Dimension> dimensionsList = getMetricStatisticsRequest.getDimensions();
            int dimensionsListIndex = 1;
            for (Dimension dimensionsListValue : dimensionsList) {
                if (dimensionsListValue != null) {
                    if (dimensionsListValue.getName() != null) {
                        request.addParameter("Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                    }
                }
                if (dimensionsListValue != null) {
                    if (dimensionsListValue.getValue() != null) {
                        request.addParameter("Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                    }
                }

                dimensionsListIndex++;
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getStartTime() != null) {
                request.addParameter("StartTime", StringUtils.fromDate(getMetricStatisticsRequest.getStartTime()));
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getEndTime() != null) {
                request.addParameter("EndTime", StringUtils.fromDate(getMetricStatisticsRequest.getEndTime()));
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getUnit() != null) {
                request.addParameter("Unit", StringUtils.fromString(getMetricStatisticsRequest.getUnit()));
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getCustomUnit() != null) {
                request.addParameter("CustomUnit", StringUtils.fromString(getMetricStatisticsRequest.getCustomUnit()));
            }
        }
        if (getMetricStatisticsRequest != null) {
            if (getMetricStatisticsRequest.getNamespace() != null) {
                request.addParameter("Namespace", StringUtils.fromString(getMetricStatisticsRequest.getNamespace()));
            }
        }


        return request;
    }
}

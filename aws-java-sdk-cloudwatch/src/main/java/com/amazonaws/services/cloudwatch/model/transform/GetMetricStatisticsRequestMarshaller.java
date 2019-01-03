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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetMetricStatisticsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricStatisticsRequestMarshaller implements Marshaller<Request<GetMetricStatisticsRequest>, GetMetricStatisticsRequest> {

    public Request<GetMetricStatisticsRequest> marshall(GetMetricStatisticsRequest getMetricStatisticsRequest) {

        if (getMetricStatisticsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetMetricStatisticsRequest> request = new DefaultRequest<GetMetricStatisticsRequest>(getMetricStatisticsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "GetMetricStatistics");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (getMetricStatisticsRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(getMetricStatisticsRequest.getNamespace()));
        }

        if (getMetricStatisticsRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(getMetricStatisticsRequest.getMetricName()));
        }

        if (!getMetricStatisticsRequest.getDimensions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Dimension>) getMetricStatisticsRequest.getDimensions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) getMetricStatisticsRequest
                    .getDimensions();
            int dimensionsListIndex = 1;

            for (Dimension dimensionsListValue : dimensionsList) {

                if (dimensionsListValue.getName() != null) {
                    request.addParameter("Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                }

                if (dimensionsListValue.getValue() != null) {
                    request.addParameter("Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                }
                dimensionsListIndex++;
            }
        }

        if (getMetricStatisticsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(getMetricStatisticsRequest.getStartTime()));
        }

        if (getMetricStatisticsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(getMetricStatisticsRequest.getEndTime()));
        }

        if (getMetricStatisticsRequest.getPeriod() != null) {
            request.addParameter("Period", StringUtils.fromInteger(getMetricStatisticsRequest.getPeriod()));
        }

        if (!getMetricStatisticsRequest.getStatistics().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getMetricStatisticsRequest.getStatistics()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> statisticsList = (com.amazonaws.internal.SdkInternalList<String>) getMetricStatisticsRequest
                    .getStatistics();
            int statisticsListIndex = 1;

            for (String statisticsListValue : statisticsList) {
                if (statisticsListValue != null) {
                    request.addParameter("Statistics.member." + statisticsListIndex, StringUtils.fromString(statisticsListValue));
                }
                statisticsListIndex++;
            }
        }

        if (!getMetricStatisticsRequest.getExtendedStatistics().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) getMetricStatisticsRequest.getExtendedStatistics()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> extendedStatisticsList = (com.amazonaws.internal.SdkInternalList<String>) getMetricStatisticsRequest
                    .getExtendedStatistics();
            int extendedStatisticsListIndex = 1;

            for (String extendedStatisticsListValue : extendedStatisticsList) {
                if (extendedStatisticsListValue != null) {
                    request.addParameter("ExtendedStatistics.member." + extendedStatisticsListIndex, StringUtils.fromString(extendedStatisticsListValue));
                }
                extendedStatisticsListIndex++;
            }
        }

        if (getMetricStatisticsRequest.getUnit() != null) {
            request.addParameter("Unit", StringUtils.fromString(getMetricStatisticsRequest.getUnit()));
        }

        return request;
    }

}

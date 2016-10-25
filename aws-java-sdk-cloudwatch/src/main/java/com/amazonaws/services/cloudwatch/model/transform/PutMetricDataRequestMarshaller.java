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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * PutMetricDataRequest Marshaller
 */

public class PutMetricDataRequestMarshaller implements Marshaller<Request<PutMetricDataRequest>, PutMetricDataRequest> {

    public Request<PutMetricDataRequest> marshall(PutMetricDataRequest putMetricDataRequest) {

        if (putMetricDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutMetricDataRequest> request = new DefaultRequest<PutMetricDataRequest>(putMetricDataRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricData");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putMetricDataRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(putMetricDataRequest.getNamespace()));
        }

        com.amazonaws.internal.SdkInternalList<MetricDatum> metricDataList = (com.amazonaws.internal.SdkInternalList<MetricDatum>) putMetricDataRequest
                .getMetricData();
        if (!metricDataList.isEmpty() || !metricDataList.isAutoConstruct()) {
            int metricDataListIndex = 1;

            for (MetricDatum metricDataListValue : metricDataList) {

                if (metricDataListValue.getMetricName() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".MetricName",
                            StringUtils.fromString(metricDataListValue.getMetricName()));
                }

                com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) metricDataListValue
                        .getDimensions();
                if (!dimensionsList.isEmpty() || !dimensionsList.isAutoConstruct()) {
                    int dimensionsListIndex = 1;

                    for (Dimension dimensionsListValue : dimensionsList) {

                        if (dimensionsListValue.getName() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".Dimensions.member." + dimensionsListIndex + ".Name",
                                    StringUtils.fromString(dimensionsListValue.getName()));
                        }

                        if (dimensionsListValue.getValue() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".Dimensions.member." + dimensionsListIndex + ".Value",
                                    StringUtils.fromString(dimensionsListValue.getValue()));
                        }
                        dimensionsListIndex++;
                    }
                }

                if (metricDataListValue.getTimestamp() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Timestamp", StringUtils.fromDate(metricDataListValue.getTimestamp()));
                }

                if (metricDataListValue.getValue() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Value", StringUtils.fromDouble(metricDataListValue.getValue()));
                }

                StatisticSet statisticValues = metricDataListValue.getStatisticValues();
                if (statisticValues != null) {

                    if (statisticValues.getSampleCount() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.SampleCount",
                                StringUtils.fromDouble(statisticValues.getSampleCount()));
                    }

                    if (statisticValues.getSum() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Sum",
                                StringUtils.fromDouble(statisticValues.getSum()));
                    }

                    if (statisticValues.getMinimum() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Minimum",
                                StringUtils.fromDouble(statisticValues.getMinimum()));
                    }

                    if (statisticValues.getMaximum() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Maximum",
                                StringUtils.fromDouble(statisticValues.getMaximum()));
                    }
                }

                if (metricDataListValue.getUnit() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Unit", StringUtils.fromString(metricDataListValue.getUnit()));
                }
                metricDataListIndex++;
            }
        }

        return request;
    }

}

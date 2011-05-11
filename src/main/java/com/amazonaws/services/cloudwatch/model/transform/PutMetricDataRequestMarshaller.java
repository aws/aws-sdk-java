/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Put Metric Data Request Marshaller
 */
public class PutMetricDataRequestMarshaller implements Marshaller<Request<PutMetricDataRequest>, PutMetricDataRequest> {

    public Request<PutMetricDataRequest> marshall(PutMetricDataRequest putMetricDataRequest) {
        Request<PutMetricDataRequest> request = new DefaultRequest<PutMetricDataRequest>(putMetricDataRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricData");
        request.addParameter("Version", "2010-08-01");
        if (putMetricDataRequest != null) {
            if (putMetricDataRequest.getNamespace() != null) {
                request.addParameter("Namespace", StringUtils.fromString(putMetricDataRequest.getNamespace()));
            }
        }

        if (putMetricDataRequest != null) {
            java.util.List<MetricDatum> metricDataList = putMetricDataRequest.getMetricData();
            int metricDataListIndex = 1;
            for (MetricDatum metricDataListValue : metricDataList) {
                if (metricDataListValue != null) {
                    if (metricDataListValue.getMetricName() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".MetricName", StringUtils.fromString(metricDataListValue.getMetricName()));
                    }
                }

                if (metricDataListValue != null) {
                    java.util.List<Dimension> dimensionsList = metricDataListValue.getDimensions();
                    int dimensionsListIndex = 1;
                    for (Dimension dimensionsListValue : dimensionsList) {
                        if (dimensionsListValue != null) {
                            if (dimensionsListValue.getName() != null) {
                                request.addParameter("MetricData.member." + metricDataListIndex + ".Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                            }
                        }
                        if (dimensionsListValue != null) {
                            if (dimensionsListValue.getValue() != null) {
                                request.addParameter("MetricData.member." + metricDataListIndex + ".Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                            }
                        }

                        dimensionsListIndex++;
                    }
                }
                if (metricDataListValue != null) {
                    if (metricDataListValue.getTimestamp() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".Timestamp", StringUtils.fromDate(metricDataListValue.getTimestamp()));
                    }
                }
                if (metricDataListValue != null) {
                    if (metricDataListValue.getValue() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".Value", StringUtils.fromDouble(metricDataListValue.getValue()));
                    }
                }
                if (metricDataListValue != null) {
                    StatisticSet statisticValues = metricDataListValue.getStatisticValues();
                    if (statisticValues != null) {
                        if (statisticValues.getSampleCount() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.SampleCount", StringUtils.fromDouble(statisticValues.getSampleCount()));
                        }
                    }
                    if (statisticValues != null) {
                        if (statisticValues.getSum() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Sum", StringUtils.fromDouble(statisticValues.getSum()));
                        }
                    }
                    if (statisticValues != null) {
                        if (statisticValues.getMinimum() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Minimum", StringUtils.fromDouble(statisticValues.getMinimum()));
                        }
                    }
                    if (statisticValues != null) {
                        if (statisticValues.getMaximum() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Maximum", StringUtils.fromDouble(statisticValues.getMaximum()));
                        }
                    }
                }
                if (metricDataListValue != null) {
                    if (metricDataListValue.getUnit() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".Unit", StringUtils.fromString(metricDataListValue.getUnit()));
                    }
                }

                metricDataListIndex++;
            }
        }


        return request;
    }
}

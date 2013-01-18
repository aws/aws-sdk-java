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
 * Put Metric Data Request Marshaller
 */
public class PutMetricDataRequestMarshaller implements Marshaller<Request<PutMetricDataRequest>, PutMetricDataRequest> {

    public Request<PutMetricDataRequest> marshall(PutMetricDataRequest putMetricDataRequest) {

        if (putMetricDataRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<PutMetricDataRequest> request = new DefaultRequest<PutMetricDataRequest>(putMetricDataRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricData");
        request.addParameter("Version", "2010-08-01");

        if (putMetricDataRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(putMetricDataRequest.getNamespace()));
        }

        java.util.List<MetricDatum> metricDataList = putMetricDataRequest.getMetricData();
        int metricDataListIndex = 1;

        for (MetricDatum metricDataListValue : metricDataList) {
            MetricDatum metricDatumMember = metricDataListValue;
            if (metricDatumMember != null) {
                if (metricDatumMember.getMetricName() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".MetricName", StringUtils.fromString(metricDatumMember.getMetricName()));
                }

                java.util.List<Dimension> dimensionsList = metricDatumMember.getDimensions();
                int dimensionsListIndex = 1;

                for (Dimension dimensionsListValue : dimensionsList) {
                    Dimension dimensionMember = dimensionsListValue;
                    if (dimensionMember != null) {
                        if (dimensionMember.getName() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionMember.getName()));
                        }
                        if (dimensionMember.getValue() != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionMember.getValue()));
                        }
                    }

                    dimensionsListIndex++;
                }
                if (metricDatumMember.getTimestamp() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Timestamp", StringUtils.fromDate(metricDatumMember.getTimestamp()));
                }
                if (metricDatumMember.getValue() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Value", StringUtils.fromDouble(metricDatumMember.getValue()));
                }
                StatisticSet statisticSetStatisticValues = metricDatumMember.getStatisticValues();
                if (statisticSetStatisticValues != null) {
                    if (statisticSetStatisticValues.getSampleCount() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.SampleCount", StringUtils.fromDouble(statisticSetStatisticValues.getSampleCount()));
                    }
                    if (statisticSetStatisticValues.getSum() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Sum", StringUtils.fromDouble(statisticSetStatisticValues.getSum()));
                    }
                    if (statisticSetStatisticValues.getMinimum() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Minimum", StringUtils.fromDouble(statisticSetStatisticValues.getMinimum()));
                    }
                    if (statisticSetStatisticValues.getMaximum() != null) {
                        request.addParameter("MetricData.member." + metricDataListIndex + ".StatisticValues.Maximum", StringUtils.fromDouble(statisticSetStatisticValues.getMaximum()));
                    }
                }
                if (metricDatumMember.getUnit() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Unit", StringUtils.fromString(metricDatumMember.getUnit()));
                }
            }

            metricDataListIndex++;
        }


        return request;
    }
}

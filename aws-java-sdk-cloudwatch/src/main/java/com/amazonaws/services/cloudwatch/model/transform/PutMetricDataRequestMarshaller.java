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
 * PutMetricDataRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
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

        if (!putMetricDataRequest.getMetricData().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<MetricDatum>) putMetricDataRequest.getMetricData()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MetricDatum> metricDataList = (com.amazonaws.internal.SdkInternalList<MetricDatum>) putMetricDataRequest
                    .getMetricData();
            int metricDataListIndex = 1;

            for (MetricDatum metricDataListValue : metricDataList) {

                if (metricDataListValue.getMetricName() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".MetricName",
                            StringUtils.fromString(metricDataListValue.getMetricName()));
                }

                if (!metricDataListValue.getDimensions().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Dimension>) metricDataListValue.getDimensions()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) metricDataListValue
                            .getDimensions();
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

                {
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
                }

                if (!metricDataListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Double>) metricDataListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Double> valuesList = (com.amazonaws.internal.SdkInternalList<Double>) metricDataListValue
                            .getValues();
                    int valuesListIndex = 1;

                    for (Double valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".Values.member." + valuesListIndex,
                                    StringUtils.fromDouble(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }

                if (!metricDataListValue.getCounts().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Double>) metricDataListValue.getCounts()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Double> countsList = (com.amazonaws.internal.SdkInternalList<Double>) metricDataListValue
                            .getCounts();
                    int countsListIndex = 1;

                    for (Double countsListValue : countsList) {
                        if (countsListValue != null) {
                            request.addParameter("MetricData.member." + metricDataListIndex + ".Counts.member." + countsListIndex,
                                    StringUtils.fromDouble(countsListValue));
                        }
                        countsListIndex++;
                    }
                }

                if (metricDataListValue.getUnit() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".Unit", StringUtils.fromString(metricDataListValue.getUnit()));
                }

                if (metricDataListValue.getStorageResolution() != null) {
                    request.addParameter("MetricData.member." + metricDataListIndex + ".StorageResolution",
                            StringUtils.fromInteger(metricDataListValue.getStorageResolution()));
                }
                metricDataListIndex++;
            }
        }

        return request;
    }

}

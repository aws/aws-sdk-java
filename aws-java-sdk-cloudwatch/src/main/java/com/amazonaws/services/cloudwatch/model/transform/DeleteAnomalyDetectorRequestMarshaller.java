/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DeleteAnomalyDetectorRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAnomalyDetectorRequestMarshaller implements Marshaller<Request<DeleteAnomalyDetectorRequest>, DeleteAnomalyDetectorRequest> {

    public Request<DeleteAnomalyDetectorRequest> marshall(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest) {

        if (deleteAnomalyDetectorRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteAnomalyDetectorRequest> request = new DefaultRequest<DeleteAnomalyDetectorRequest>(deleteAnomalyDetectorRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DeleteAnomalyDetector");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteAnomalyDetectorRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(deleteAnomalyDetectorRequest.getNamespace()));
        }

        if (deleteAnomalyDetectorRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(deleteAnomalyDetectorRequest.getMetricName()));
        }

        if (!deleteAnomalyDetectorRequest.getDimensions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Dimension>) deleteAnomalyDetectorRequest.getDimensions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) deleteAnomalyDetectorRequest
                    .getDimensions();
            int dimensionsListIndex = 1;

            for (Dimension dimensionsListValue : dimensionsList) {
                if (dimensionsListValue != null) {

                    if (dimensionsListValue.getName() != null) {
                        request.addParameter("Dimensions.member." + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                    }

                    if (dimensionsListValue.getValue() != null) {
                        request.addParameter("Dimensions.member." + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                    }
                }
                dimensionsListIndex++;
            }
        }

        if (deleteAnomalyDetectorRequest.getStat() != null) {
            request.addParameter("Stat", StringUtils.fromString(deleteAnomalyDetectorRequest.getStat()));
        }

        {
            SingleMetricAnomalyDetector singleMetricAnomalyDetector = deleteAnomalyDetectorRequest.getSingleMetricAnomalyDetector();
            if (singleMetricAnomalyDetector != null) {

                if (singleMetricAnomalyDetector.getAccountId() != null) {
                    request.addParameter("SingleMetricAnomalyDetector.AccountId", StringUtils.fromString(singleMetricAnomalyDetector.getAccountId()));
                }

                if (singleMetricAnomalyDetector.getNamespace() != null) {
                    request.addParameter("SingleMetricAnomalyDetector.Namespace", StringUtils.fromString(singleMetricAnomalyDetector.getNamespace()));
                }

                if (singleMetricAnomalyDetector.getMetricName() != null) {
                    request.addParameter("SingleMetricAnomalyDetector.MetricName", StringUtils.fromString(singleMetricAnomalyDetector.getMetricName()));
                }

                if (!singleMetricAnomalyDetector.getDimensions().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Dimension>) singleMetricAnomalyDetector.getDimensions()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) singleMetricAnomalyDetector
                            .getDimensions();
                    int dimensionsListIndex = 1;

                    for (Dimension dimensionsListValue : dimensionsList) {
                        if (dimensionsListValue != null) {

                            if (dimensionsListValue.getName() != null) {
                                request.addParameter("SingleMetricAnomalyDetector.Dimensions.member." + dimensionsListIndex + ".Name",
                                        StringUtils.fromString(dimensionsListValue.getName()));
                            }

                            if (dimensionsListValue.getValue() != null) {
                                request.addParameter("SingleMetricAnomalyDetector.Dimensions.member." + dimensionsListIndex + ".Value",
                                        StringUtils.fromString(dimensionsListValue.getValue()));
                            }
                        }
                        dimensionsListIndex++;
                    }
                }

                if (singleMetricAnomalyDetector.getStat() != null) {
                    request.addParameter("SingleMetricAnomalyDetector.Stat", StringUtils.fromString(singleMetricAnomalyDetector.getStat()));
                }
            }
        }

        {
            MetricMathAnomalyDetector metricMathAnomalyDetector = deleteAnomalyDetectorRequest.getMetricMathAnomalyDetector();
            if (metricMathAnomalyDetector != null) {

                if (!metricMathAnomalyDetector.getMetricDataQueries().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<MetricDataQuery>) metricMathAnomalyDetector.getMetricDataQueries()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<MetricDataQuery> metricDataQueriesList = (com.amazonaws.internal.SdkInternalList<MetricDataQuery>) metricMathAnomalyDetector
                            .getMetricDataQueries();
                    int metricDataQueriesListIndex = 1;

                    for (MetricDataQuery metricDataQueriesListValue : metricDataQueriesList) {
                        if (metricDataQueriesListValue != null) {

                            if (metricDataQueriesListValue.getId() != null) {
                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex + ".Id",
                                        StringUtils.fromString(metricDataQueriesListValue.getId()));
                            }

                            {
                                MetricStat metricStat = metricDataQueriesListValue.getMetricStat();
                                if (metricStat != null) {

                                    {
                                        Metric metric = metricStat.getMetric();
                                        if (metric != null) {

                                            if (metric.getNamespace() != null) {
                                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex
                                                        + ".MetricStat.Metric.Namespace", StringUtils.fromString(metric.getNamespace()));
                                            }

                                            if (metric.getMetricName() != null) {
                                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex
                                                        + ".MetricStat.Metric.MetricName", StringUtils.fromString(metric.getMetricName()));
                                            }

                                            if (!metric.getDimensions().isEmpty()
                                                    || !((com.amazonaws.internal.SdkInternalList<Dimension>) metric.getDimensions()).isAutoConstruct()) {
                                                com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) metric
                                                        .getDimensions();
                                                int dimensionsListIndex = 1;

                                                for (Dimension dimensionsListValue : dimensionsList) {
                                                    if (dimensionsListValue != null) {

                                                        if (dimensionsListValue.getName() != null) {
                                                            request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member."
                                                                    + metricDataQueriesListIndex + ".MetricStat.Metric.Dimensions.member."
                                                                    + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                                                        }

                                                        if (dimensionsListValue.getValue() != null) {
                                                            request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member."
                                                                    + metricDataQueriesListIndex + ".MetricStat.Metric.Dimensions.member."
                                                                    + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                                                        }
                                                    }
                                                    dimensionsListIndex++;
                                                }
                                            }
                                        }
                                    }

                                    if (metricStat.getPeriod() != null) {
                                        request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex
                                                + ".MetricStat.Period", StringUtils.fromInteger(metricStat.getPeriod()));
                                    }

                                    if (metricStat.getStat() != null) {
                                        request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex
                                                + ".MetricStat.Stat", StringUtils.fromString(metricStat.getStat()));
                                    }

                                    if (metricStat.getUnit() != null) {
                                        request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex
                                                + ".MetricStat.Unit", StringUtils.fromString(metricStat.getUnit()));
                                    }
                                }
                            }

                            if (metricDataQueriesListValue.getExpression() != null) {
                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex + ".Expression",
                                        StringUtils.fromString(metricDataQueriesListValue.getExpression()));
                            }

                            if (metricDataQueriesListValue.getLabel() != null) {
                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex + ".Label",
                                        StringUtils.fromString(metricDataQueriesListValue.getLabel()));
                            }

                            if (metricDataQueriesListValue.getReturnData() != null) {
                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex + ".ReturnData",
                                        StringUtils.fromBoolean(metricDataQueriesListValue.getReturnData()));
                            }

                            if (metricDataQueriesListValue.getPeriod() != null) {
                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex + ".Period",
                                        StringUtils.fromInteger(metricDataQueriesListValue.getPeriod()));
                            }

                            if (metricDataQueriesListValue.getAccountId() != null) {
                                request.addParameter("MetricMathAnomalyDetector.MetricDataQueries.member." + metricDataQueriesListIndex + ".AccountId",
                                        StringUtils.fromString(metricDataQueriesListValue.getAccountId()));
                            }
                        }
                        metricDataQueriesListIndex++;
                    }
                }
            }
        }

        return request;
    }

}

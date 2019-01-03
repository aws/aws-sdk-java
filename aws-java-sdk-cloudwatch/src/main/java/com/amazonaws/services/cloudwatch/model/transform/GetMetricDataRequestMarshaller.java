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
 * GetMetricDataRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricDataRequestMarshaller implements Marshaller<Request<GetMetricDataRequest>, GetMetricDataRequest> {

    public Request<GetMetricDataRequest> marshall(GetMetricDataRequest getMetricDataRequest) {

        if (getMetricDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetMetricDataRequest> request = new DefaultRequest<GetMetricDataRequest>(getMetricDataRequest, "AmazonCloudWatch");
        request.addParameter("Action", "GetMetricData");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!getMetricDataRequest.getMetricDataQueries().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<MetricDataQuery>) getMetricDataRequest.getMetricDataQueries()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<MetricDataQuery> metricDataQueriesList = (com.amazonaws.internal.SdkInternalList<MetricDataQuery>) getMetricDataRequest
                    .getMetricDataQueries();
            int metricDataQueriesListIndex = 1;

            for (MetricDataQuery metricDataQueriesListValue : metricDataQueriesList) {

                if (metricDataQueriesListValue.getId() != null) {
                    request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".Id",
                            StringUtils.fromString(metricDataQueriesListValue.getId()));
                }

                {
                    MetricStat metricStat = metricDataQueriesListValue.getMetricStat();
                    if (metricStat != null) {

                        {
                            Metric metric = metricStat.getMetric();
                            if (metric != null) {

                                if (metric.getNamespace() != null) {
                                    request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".MetricStat.Metric.Namespace",
                                            StringUtils.fromString(metric.getNamespace()));
                                }

                                if (metric.getMetricName() != null) {
                                    request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".MetricStat.Metric.MetricName",
                                            StringUtils.fromString(metric.getMetricName()));
                                }

                                if (!metric.getDimensions().isEmpty()
                                        || !((com.amazonaws.internal.SdkInternalList<Dimension>) metric.getDimensions()).isAutoConstruct()) {
                                    com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) metric
                                            .getDimensions();
                                    int dimensionsListIndex = 1;

                                    for (Dimension dimensionsListValue : dimensionsList) {

                                        if (dimensionsListValue.getName() != null) {
                                            request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex
                                                    + ".MetricStat.Metric.Dimensions.member." + dimensionsListIndex + ".Name",
                                                    StringUtils.fromString(dimensionsListValue.getName()));
                                        }

                                        if (dimensionsListValue.getValue() != null) {
                                            request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex
                                                    + ".MetricStat.Metric.Dimensions.member." + dimensionsListIndex + ".Value",
                                                    StringUtils.fromString(dimensionsListValue.getValue()));
                                        }
                                        dimensionsListIndex++;
                                    }
                                }
                            }
                        }

                        if (metricStat.getPeriod() != null) {
                            request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".MetricStat.Period",
                                    StringUtils.fromInteger(metricStat.getPeriod()));
                        }

                        if (metricStat.getStat() != null) {
                            request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".MetricStat.Stat",
                                    StringUtils.fromString(metricStat.getStat()));
                        }

                        if (metricStat.getUnit() != null) {
                            request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".MetricStat.Unit",
                                    StringUtils.fromString(metricStat.getUnit()));
                        }
                    }
                }

                if (metricDataQueriesListValue.getExpression() != null) {
                    request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".Expression",
                            StringUtils.fromString(metricDataQueriesListValue.getExpression()));
                }

                if (metricDataQueriesListValue.getLabel() != null) {
                    request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".Label",
                            StringUtils.fromString(metricDataQueriesListValue.getLabel()));
                }

                if (metricDataQueriesListValue.getReturnData() != null) {
                    request.addParameter("MetricDataQueries.member." + metricDataQueriesListIndex + ".ReturnData",
                            StringUtils.fromBoolean(metricDataQueriesListValue.getReturnData()));
                }
                metricDataQueriesListIndex++;
            }
        }

        if (getMetricDataRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(getMetricDataRequest.getStartTime()));
        }

        if (getMetricDataRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(getMetricDataRequest.getEndTime()));
        }

        if (getMetricDataRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getMetricDataRequest.getNextToken()));
        }

        if (getMetricDataRequest.getScanBy() != null) {
            request.addParameter("ScanBy", StringUtils.fromString(getMetricDataRequest.getScanBy()));
        }

        if (getMetricDataRequest.getMaxDatapoints() != null) {
            request.addParameter("MaxDatapoints", StringUtils.fromInteger(getMetricDataRequest.getMaxDatapoints()));
        }

        return request;
    }

}

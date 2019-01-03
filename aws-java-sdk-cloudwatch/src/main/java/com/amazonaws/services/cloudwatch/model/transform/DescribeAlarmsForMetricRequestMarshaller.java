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
 * DescribeAlarmsForMetricRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmsForMetricRequestMarshaller implements Marshaller<Request<DescribeAlarmsForMetricRequest>, DescribeAlarmsForMetricRequest> {

    public Request<DescribeAlarmsForMetricRequest> marshall(DescribeAlarmsForMetricRequest describeAlarmsForMetricRequest) {

        if (describeAlarmsForMetricRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAlarmsForMetricRequest> request = new DefaultRequest<DescribeAlarmsForMetricRequest>(describeAlarmsForMetricRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DescribeAlarmsForMetric");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeAlarmsForMetricRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(describeAlarmsForMetricRequest.getMetricName()));
        }

        if (describeAlarmsForMetricRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(describeAlarmsForMetricRequest.getNamespace()));
        }

        if (describeAlarmsForMetricRequest.getStatistic() != null) {
            request.addParameter("Statistic", StringUtils.fromString(describeAlarmsForMetricRequest.getStatistic()));
        }

        if (describeAlarmsForMetricRequest.getExtendedStatistic() != null) {
            request.addParameter("ExtendedStatistic", StringUtils.fromString(describeAlarmsForMetricRequest.getExtendedStatistic()));
        }

        if (!describeAlarmsForMetricRequest.getDimensions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Dimension>) describeAlarmsForMetricRequest.getDimensions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) describeAlarmsForMetricRequest
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

        if (describeAlarmsForMetricRequest.getPeriod() != null) {
            request.addParameter("Period", StringUtils.fromInteger(describeAlarmsForMetricRequest.getPeriod()));
        }

        if (describeAlarmsForMetricRequest.getUnit() != null) {
            request.addParameter("Unit", StringUtils.fromString(describeAlarmsForMetricRequest.getUnit()));
        }

        return request;
    }

}

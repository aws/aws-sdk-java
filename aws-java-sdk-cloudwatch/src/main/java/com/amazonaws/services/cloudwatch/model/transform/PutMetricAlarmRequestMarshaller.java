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
 * PutMetricAlarmRequest Marshaller
 */

public class PutMetricAlarmRequestMarshaller implements Marshaller<Request<PutMetricAlarmRequest>, PutMetricAlarmRequest> {

    public Request<PutMetricAlarmRequest> marshall(PutMetricAlarmRequest putMetricAlarmRequest) {

        if (putMetricAlarmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutMetricAlarmRequest> request = new DefaultRequest<PutMetricAlarmRequest>(putMetricAlarmRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutMetricAlarm");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putMetricAlarmRequest.getAlarmName() != null) {
            request.addParameter("AlarmName", StringUtils.fromString(putMetricAlarmRequest.getAlarmName()));
        }

        if (putMetricAlarmRequest.getAlarmDescription() != null) {
            request.addParameter("AlarmDescription", StringUtils.fromString(putMetricAlarmRequest.getAlarmDescription()));
        }

        if (putMetricAlarmRequest.getActionsEnabled() != null) {
            request.addParameter("ActionsEnabled", StringUtils.fromBoolean(putMetricAlarmRequest.getActionsEnabled()));
        }

        com.amazonaws.internal.SdkInternalList<String> oKActionsList = (com.amazonaws.internal.SdkInternalList<String>) putMetricAlarmRequest.getOKActions();
        if (!oKActionsList.isEmpty() || !oKActionsList.isAutoConstruct()) {
            int oKActionsListIndex = 1;

            for (String oKActionsListValue : oKActionsList) {
                if (oKActionsListValue != null) {
                    request.addParameter("OKActions.member." + oKActionsListIndex, StringUtils.fromString(oKActionsListValue));
                }
                oKActionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> alarmActionsList = (com.amazonaws.internal.SdkInternalList<String>) putMetricAlarmRequest
                .getAlarmActions();
        if (!alarmActionsList.isEmpty() || !alarmActionsList.isAutoConstruct()) {
            int alarmActionsListIndex = 1;

            for (String alarmActionsListValue : alarmActionsList) {
                if (alarmActionsListValue != null) {
                    request.addParameter("AlarmActions.member." + alarmActionsListIndex, StringUtils.fromString(alarmActionsListValue));
                }
                alarmActionsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> insufficientDataActionsList = (com.amazonaws.internal.SdkInternalList<String>) putMetricAlarmRequest
                .getInsufficientDataActions();
        if (!insufficientDataActionsList.isEmpty() || !insufficientDataActionsList.isAutoConstruct()) {
            int insufficientDataActionsListIndex = 1;

            for (String insufficientDataActionsListValue : insufficientDataActionsList) {
                if (insufficientDataActionsListValue != null) {
                    request.addParameter("InsufficientDataActions.member." + insufficientDataActionsListIndex,
                            StringUtils.fromString(insufficientDataActionsListValue));
                }
                insufficientDataActionsListIndex++;
            }
        }

        if (putMetricAlarmRequest.getMetricName() != null) {
            request.addParameter("MetricName", StringUtils.fromString(putMetricAlarmRequest.getMetricName()));
        }

        if (putMetricAlarmRequest.getNamespace() != null) {
            request.addParameter("Namespace", StringUtils.fromString(putMetricAlarmRequest.getNamespace()));
        }

        if (putMetricAlarmRequest.getStatistic() != null) {
            request.addParameter("Statistic", StringUtils.fromString(putMetricAlarmRequest.getStatistic()));
        }

        if (putMetricAlarmRequest.getExtendedStatistic() != null) {
            request.addParameter("ExtendedStatistic", StringUtils.fromString(putMetricAlarmRequest.getExtendedStatistic()));
        }

        com.amazonaws.internal.SdkInternalList<Dimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<Dimension>) putMetricAlarmRequest
                .getDimensions();
        if (!dimensionsList.isEmpty() || !dimensionsList.isAutoConstruct()) {
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

        if (putMetricAlarmRequest.getPeriod() != null) {
            request.addParameter("Period", StringUtils.fromInteger(putMetricAlarmRequest.getPeriod()));
        }

        if (putMetricAlarmRequest.getUnit() != null) {
            request.addParameter("Unit", StringUtils.fromString(putMetricAlarmRequest.getUnit()));
        }

        if (putMetricAlarmRequest.getEvaluationPeriods() != null) {
            request.addParameter("EvaluationPeriods", StringUtils.fromInteger(putMetricAlarmRequest.getEvaluationPeriods()));
        }

        if (putMetricAlarmRequest.getThreshold() != null) {
            request.addParameter("Threshold", StringUtils.fromDouble(putMetricAlarmRequest.getThreshold()));
        }

        if (putMetricAlarmRequest.getComparisonOperator() != null) {
            request.addParameter("ComparisonOperator", StringUtils.fromString(putMetricAlarmRequest.getComparisonOperator()));
        }

        return request;
    }

}

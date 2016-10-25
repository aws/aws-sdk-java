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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * PutScalingPolicyRequest Marshaller
 */

public class PutScalingPolicyRequestMarshaller implements Marshaller<Request<PutScalingPolicyRequest>, PutScalingPolicyRequest> {

    public Request<PutScalingPolicyRequest> marshall(PutScalingPolicyRequest putScalingPolicyRequest) {

        if (putScalingPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutScalingPolicyRequest> request = new DefaultRequest<PutScalingPolicyRequest>(putScalingPolicyRequest, "AmazonAutoScaling");
        request.addParameter("Action", "PutScalingPolicy");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putScalingPolicyRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(putScalingPolicyRequest.getAutoScalingGroupName()));
        }

        if (putScalingPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(putScalingPolicyRequest.getPolicyName()));
        }

        if (putScalingPolicyRequest.getPolicyType() != null) {
            request.addParameter("PolicyType", StringUtils.fromString(putScalingPolicyRequest.getPolicyType()));
        }

        if (putScalingPolicyRequest.getAdjustmentType() != null) {
            request.addParameter("AdjustmentType", StringUtils.fromString(putScalingPolicyRequest.getAdjustmentType()));
        }

        if (putScalingPolicyRequest.getMinAdjustmentStep() != null) {
            request.addParameter("MinAdjustmentStep", StringUtils.fromInteger(putScalingPolicyRequest.getMinAdjustmentStep()));
        }

        if (putScalingPolicyRequest.getMinAdjustmentMagnitude() != null) {
            request.addParameter("MinAdjustmentMagnitude", StringUtils.fromInteger(putScalingPolicyRequest.getMinAdjustmentMagnitude()));
        }

        if (putScalingPolicyRequest.getScalingAdjustment() != null) {
            request.addParameter("ScalingAdjustment", StringUtils.fromInteger(putScalingPolicyRequest.getScalingAdjustment()));
        }

        if (putScalingPolicyRequest.getCooldown() != null) {
            request.addParameter("Cooldown", StringUtils.fromInteger(putScalingPolicyRequest.getCooldown()));
        }

        if (putScalingPolicyRequest.getMetricAggregationType() != null) {
            request.addParameter("MetricAggregationType", StringUtils.fromString(putScalingPolicyRequest.getMetricAggregationType()));
        }

        com.amazonaws.internal.SdkInternalList<StepAdjustment> stepAdjustmentsList = (com.amazonaws.internal.SdkInternalList<StepAdjustment>) putScalingPolicyRequest
                .getStepAdjustments();
        if (!stepAdjustmentsList.isEmpty() || !stepAdjustmentsList.isAutoConstruct()) {
            int stepAdjustmentsListIndex = 1;

            for (StepAdjustment stepAdjustmentsListValue : stepAdjustmentsList) {

                if (stepAdjustmentsListValue.getMetricIntervalLowerBound() != null) {
                    request.addParameter("StepAdjustments.member." + stepAdjustmentsListIndex + ".MetricIntervalLowerBound",
                            StringUtils.fromDouble(stepAdjustmentsListValue.getMetricIntervalLowerBound()));
                }

                if (stepAdjustmentsListValue.getMetricIntervalUpperBound() != null) {
                    request.addParameter("StepAdjustments.member." + stepAdjustmentsListIndex + ".MetricIntervalUpperBound",
                            StringUtils.fromDouble(stepAdjustmentsListValue.getMetricIntervalUpperBound()));
                }

                if (stepAdjustmentsListValue.getScalingAdjustment() != null) {
                    request.addParameter("StepAdjustments.member." + stepAdjustmentsListIndex + ".ScalingAdjustment",
                            StringUtils.fromInteger(stepAdjustmentsListValue.getScalingAdjustment()));
                }
                stepAdjustmentsListIndex++;
            }
        }

        if (putScalingPolicyRequest.getEstimatedInstanceWarmup() != null) {
            request.addParameter("EstimatedInstanceWarmup", StringUtils.fromInteger(putScalingPolicyRequest.getEstimatedInstanceWarmup()));
        }

        return request;
    }

}

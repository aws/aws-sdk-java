/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Put Scaling Policy Request Marshaller
 */
public class PutScalingPolicyRequestMarshaller implements Marshaller<Request<PutScalingPolicyRequest>, PutScalingPolicyRequest> {

    public Request<PutScalingPolicyRequest> marshall(PutScalingPolicyRequest putScalingPolicyRequest) {

        if (putScalingPolicyRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutScalingPolicyRequest> request = new DefaultRequest<PutScalingPolicyRequest>(putScalingPolicyRequest, "AmazonAutoScaling");
        request.addParameter("Action", "PutScalingPolicy");
        request.addParameter("Version", "2011-01-01");

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

        java.util.List<StepAdjustment> stepAdjustmentsList = putScalingPolicyRequest.getStepAdjustments();
        int stepAdjustmentsListIndex = 1;

        for (StepAdjustment stepAdjustmentsListValue : stepAdjustmentsList) {
            StepAdjustment stepAdjustmentMember = stepAdjustmentsListValue;
            if (stepAdjustmentMember != null) {
                if (stepAdjustmentMember.getMetricIntervalLowerBound() != null) {
                    request.addParameter("StepAdjustments.member." + stepAdjustmentsListIndex + ".MetricIntervalLowerBound", StringUtils.fromDouble(stepAdjustmentMember.getMetricIntervalLowerBound()));
                }
                if (stepAdjustmentMember.getMetricIntervalUpperBound() != null) {
                    request.addParameter("StepAdjustments.member." + stepAdjustmentsListIndex + ".MetricIntervalUpperBound", StringUtils.fromDouble(stepAdjustmentMember.getMetricIntervalUpperBound()));
                }
                if (stepAdjustmentMember.getScalingAdjustment() != null) {
                    request.addParameter("StepAdjustments.member." + stepAdjustmentsListIndex + ".ScalingAdjustment", StringUtils.fromInteger(stepAdjustmentMember.getScalingAdjustment()));
                }
            }

            stepAdjustmentsListIndex++;
        }
        if (putScalingPolicyRequest.getEstimatedInstanceWarmup() != null) {
            request.addParameter("EstimatedInstanceWarmup", StringUtils.fromInteger(putScalingPolicyRequest.getEstimatedInstanceWarmup()));
        }

        return request;
    }
}

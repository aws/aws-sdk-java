/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutScalingPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
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

        if (!putScalingPolicyRequest.getStepAdjustments().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<StepAdjustment>) putScalingPolicyRequest.getStepAdjustments()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<StepAdjustment> stepAdjustmentsList = (com.amazonaws.internal.SdkInternalList<StepAdjustment>) putScalingPolicyRequest
                    .getStepAdjustments();
            int stepAdjustmentsListIndex = 1;

            for (StepAdjustment stepAdjustmentsListValue : stepAdjustmentsList) {
                if (stepAdjustmentsListValue != null) {

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
                }
                stepAdjustmentsListIndex++;
            }
        }

        if (putScalingPolicyRequest.getEstimatedInstanceWarmup() != null) {
            request.addParameter("EstimatedInstanceWarmup", StringUtils.fromInteger(putScalingPolicyRequest.getEstimatedInstanceWarmup()));
        }

        {
            TargetTrackingConfiguration targetTrackingConfiguration = putScalingPolicyRequest.getTargetTrackingConfiguration();
            if (targetTrackingConfiguration != null) {

                {
                    PredefinedMetricSpecification predefinedMetricSpecification = targetTrackingConfiguration.getPredefinedMetricSpecification();
                    if (predefinedMetricSpecification != null) {

                        if (predefinedMetricSpecification.getPredefinedMetricType() != null) {
                            request.addParameter("TargetTrackingConfiguration.PredefinedMetricSpecification.PredefinedMetricType",
                                    StringUtils.fromString(predefinedMetricSpecification.getPredefinedMetricType()));
                        }

                        if (predefinedMetricSpecification.getResourceLabel() != null) {
                            request.addParameter("TargetTrackingConfiguration.PredefinedMetricSpecification.ResourceLabel",
                                    StringUtils.fromString(predefinedMetricSpecification.getResourceLabel()));
                        }
                    }
                }

                {
                    CustomizedMetricSpecification customizedMetricSpecification = targetTrackingConfiguration.getCustomizedMetricSpecification();
                    if (customizedMetricSpecification != null) {

                        if (customizedMetricSpecification.getMetricName() != null) {
                            request.addParameter("TargetTrackingConfiguration.CustomizedMetricSpecification.MetricName",
                                    StringUtils.fromString(customizedMetricSpecification.getMetricName()));
                        }

                        if (customizedMetricSpecification.getNamespace() != null) {
                            request.addParameter("TargetTrackingConfiguration.CustomizedMetricSpecification.Namespace",
                                    StringUtils.fromString(customizedMetricSpecification.getNamespace()));
                        }

                        if (!customizedMetricSpecification.getDimensions().isEmpty()
                                || !((com.amazonaws.internal.SdkInternalList<MetricDimension>) customizedMetricSpecification.getDimensions()).isAutoConstruct()) {
                            com.amazonaws.internal.SdkInternalList<MetricDimension> dimensionsList = (com.amazonaws.internal.SdkInternalList<MetricDimension>) customizedMetricSpecification
                                    .getDimensions();
                            int dimensionsListIndex = 1;

                            for (MetricDimension dimensionsListValue : dimensionsList) {
                                if (dimensionsListValue != null) {

                                    if (dimensionsListValue.getName() != null) {
                                        request.addParameter("TargetTrackingConfiguration.CustomizedMetricSpecification.Dimensions.member."
                                                + dimensionsListIndex + ".Name", StringUtils.fromString(dimensionsListValue.getName()));
                                    }

                                    if (dimensionsListValue.getValue() != null) {
                                        request.addParameter("TargetTrackingConfiguration.CustomizedMetricSpecification.Dimensions.member."
                                                + dimensionsListIndex + ".Value", StringUtils.fromString(dimensionsListValue.getValue()));
                                    }
                                }
                                dimensionsListIndex++;
                            }
                        }

                        if (customizedMetricSpecification.getStatistic() != null) {
                            request.addParameter("TargetTrackingConfiguration.CustomizedMetricSpecification.Statistic",
                                    StringUtils.fromString(customizedMetricSpecification.getStatistic()));
                        }

                        if (customizedMetricSpecification.getUnit() != null) {
                            request.addParameter("TargetTrackingConfiguration.CustomizedMetricSpecification.Unit",
                                    StringUtils.fromString(customizedMetricSpecification.getUnit()));
                        }
                    }
                }

                if (targetTrackingConfiguration.getTargetValue() != null) {
                    request.addParameter("TargetTrackingConfiguration.TargetValue", StringUtils.fromDouble(targetTrackingConfiguration.getTargetValue()));
                }

                if (targetTrackingConfiguration.getDisableScaleIn() != null) {
                    request.addParameter("TargetTrackingConfiguration.DisableScaleIn", StringUtils.fromBoolean(targetTrackingConfiguration.getDisableScaleIn()));
                }
            }
        }

        if (putScalingPolicyRequest.getEnabled() != null) {
            request.addParameter("Enabled", StringUtils.fromBoolean(putScalingPolicyRequest.getEnabled()));
        }

        {
            PredictiveScalingConfiguration predictiveScalingConfiguration = putScalingPolicyRequest.getPredictiveScalingConfiguration();
            if (predictiveScalingConfiguration != null) {

                if (!predictiveScalingConfiguration.getMetricSpecifications().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification>) predictiveScalingConfiguration
                                .getMetricSpecifications()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification> metricSpecificationsList = (com.amazonaws.internal.SdkInternalList<PredictiveScalingMetricSpecification>) predictiveScalingConfiguration
                            .getMetricSpecifications();
                    int metricSpecificationsListIndex = 1;

                    for (PredictiveScalingMetricSpecification metricSpecificationsListValue : metricSpecificationsList) {
                        if (metricSpecificationsListValue != null) {

                            if (metricSpecificationsListValue.getTargetValue() != null) {
                                request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                        + ".TargetValue", StringUtils.fromDouble(metricSpecificationsListValue.getTargetValue()));
                            }

                            {
                                PredictiveScalingPredefinedMetricPair predefinedMetricPairSpecification = metricSpecificationsListValue
                                        .getPredefinedMetricPairSpecification();
                                if (predefinedMetricPairSpecification != null) {

                                    if (predefinedMetricPairSpecification.getPredefinedMetricType() != null) {
                                        request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                                + ".PredefinedMetricPairSpecification.PredefinedMetricType",
                                                StringUtils.fromString(predefinedMetricPairSpecification.getPredefinedMetricType()));
                                    }

                                    if (predefinedMetricPairSpecification.getResourceLabel() != null) {
                                        request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                                + ".PredefinedMetricPairSpecification.ResourceLabel",
                                                StringUtils.fromString(predefinedMetricPairSpecification.getResourceLabel()));
                                    }
                                }
                            }

                            {
                                PredictiveScalingPredefinedScalingMetric predefinedScalingMetricSpecification = metricSpecificationsListValue
                                        .getPredefinedScalingMetricSpecification();
                                if (predefinedScalingMetricSpecification != null) {

                                    if (predefinedScalingMetricSpecification.getPredefinedMetricType() != null) {
                                        request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                                + ".PredefinedScalingMetricSpecification.PredefinedMetricType",
                                                StringUtils.fromString(predefinedScalingMetricSpecification.getPredefinedMetricType()));
                                    }

                                    if (predefinedScalingMetricSpecification.getResourceLabel() != null) {
                                        request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                                + ".PredefinedScalingMetricSpecification.ResourceLabel",
                                                StringUtils.fromString(predefinedScalingMetricSpecification.getResourceLabel()));
                                    }
                                }
                            }

                            {
                                PredictiveScalingPredefinedLoadMetric predefinedLoadMetricSpecification = metricSpecificationsListValue
                                        .getPredefinedLoadMetricSpecification();
                                if (predefinedLoadMetricSpecification != null) {

                                    if (predefinedLoadMetricSpecification.getPredefinedMetricType() != null) {
                                        request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                                + ".PredefinedLoadMetricSpecification.PredefinedMetricType",
                                                StringUtils.fromString(predefinedLoadMetricSpecification.getPredefinedMetricType()));
                                    }

                                    if (predefinedLoadMetricSpecification.getResourceLabel() != null) {
                                        request.addParameter("PredictiveScalingConfiguration.MetricSpecifications.member." + metricSpecificationsListIndex
                                                + ".PredefinedLoadMetricSpecification.ResourceLabel",
                                                StringUtils.fromString(predefinedLoadMetricSpecification.getResourceLabel()));
                                    }
                                }
                            }
                        }
                        metricSpecificationsListIndex++;
                    }
                }

                if (predictiveScalingConfiguration.getMode() != null) {
                    request.addParameter("PredictiveScalingConfiguration.Mode", StringUtils.fromString(predictiveScalingConfiguration.getMode()));
                }

                if (predictiveScalingConfiguration.getSchedulingBufferTime() != null) {
                    request.addParameter("PredictiveScalingConfiguration.SchedulingBufferTime",
                            StringUtils.fromInteger(predictiveScalingConfiguration.getSchedulingBufferTime()));
                }

                if (predictiveScalingConfiguration.getMaxCapacityBreachBehavior() != null) {
                    request.addParameter("PredictiveScalingConfiguration.MaxCapacityBreachBehavior",
                            StringUtils.fromString(predictiveScalingConfiguration.getMaxCapacityBreachBehavior()));
                }

                if (predictiveScalingConfiguration.getMaxCapacityBuffer() != null) {
                    request.addParameter("PredictiveScalingConfiguration.MaxCapacityBuffer",
                            StringUtils.fromInteger(predictiveScalingConfiguration.getMaxCapacityBuffer()));
                }
            }
        }

        return request;
    }

}

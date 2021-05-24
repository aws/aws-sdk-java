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
package com.amazonaws.services.computeoptimizer.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ExportableAutoScalingGroupField {

    AccountId("AccountId"),
    AutoScalingGroupArn("AutoScalingGroupArn"),
    AutoScalingGroupName("AutoScalingGroupName"),
    Finding("Finding"),
    UtilizationMetricsCpuMaximum("UtilizationMetricsCpuMaximum"),
    UtilizationMetricsMemoryMaximum("UtilizationMetricsMemoryMaximum"),
    UtilizationMetricsEbsReadOpsPerSecondMaximum("UtilizationMetricsEbsReadOpsPerSecondMaximum"),
    UtilizationMetricsEbsWriteOpsPerSecondMaximum("UtilizationMetricsEbsWriteOpsPerSecondMaximum"),
    UtilizationMetricsEbsReadBytesPerSecondMaximum("UtilizationMetricsEbsReadBytesPerSecondMaximum"),
    UtilizationMetricsEbsWriteBytesPerSecondMaximum("UtilizationMetricsEbsWriteBytesPerSecondMaximum"),
    UtilizationMetricsDiskReadOpsPerSecondMaximum("UtilizationMetricsDiskReadOpsPerSecondMaximum"),
    UtilizationMetricsDiskWriteOpsPerSecondMaximum("UtilizationMetricsDiskWriteOpsPerSecondMaximum"),
    UtilizationMetricsDiskReadBytesPerSecondMaximum("UtilizationMetricsDiskReadBytesPerSecondMaximum"),
    UtilizationMetricsDiskWriteBytesPerSecondMaximum("UtilizationMetricsDiskWriteBytesPerSecondMaximum"),
    UtilizationMetricsNetworkInBytesPerSecondMaximum("UtilizationMetricsNetworkInBytesPerSecondMaximum"),
    UtilizationMetricsNetworkOutBytesPerSecondMaximum("UtilizationMetricsNetworkOutBytesPerSecondMaximum"),
    UtilizationMetricsNetworkPacketsInPerSecondMaximum("UtilizationMetricsNetworkPacketsInPerSecondMaximum"),
    UtilizationMetricsNetworkPacketsOutPerSecondMaximum("UtilizationMetricsNetworkPacketsOutPerSecondMaximum"),
    LookbackPeriodInDays("LookbackPeriodInDays"),
    CurrentConfigurationInstanceType("CurrentConfigurationInstanceType"),
    CurrentConfigurationDesiredCapacity("CurrentConfigurationDesiredCapacity"),
    CurrentConfigurationMinSize("CurrentConfigurationMinSize"),
    CurrentConfigurationMaxSize("CurrentConfigurationMaxSize"),
    CurrentOnDemandPrice("CurrentOnDemandPrice"),
    CurrentStandardOneYearNoUpfrontReservedPrice("CurrentStandardOneYearNoUpfrontReservedPrice"),
    CurrentStandardThreeYearNoUpfrontReservedPrice("CurrentStandardThreeYearNoUpfrontReservedPrice"),
    CurrentVCpus("CurrentVCpus"),
    CurrentMemory("CurrentMemory"),
    CurrentStorage("CurrentStorage"),
    CurrentNetwork("CurrentNetwork"),
    RecommendationOptionsConfigurationInstanceType("RecommendationOptionsConfigurationInstanceType"),
    RecommendationOptionsConfigurationDesiredCapacity("RecommendationOptionsConfigurationDesiredCapacity"),
    RecommendationOptionsConfigurationMinSize("RecommendationOptionsConfigurationMinSize"),
    RecommendationOptionsConfigurationMaxSize("RecommendationOptionsConfigurationMaxSize"),
    RecommendationOptionsProjectedUtilizationMetricsCpuMaximum("RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"),
    RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum("RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"),
    RecommendationOptionsPerformanceRisk("RecommendationOptionsPerformanceRisk"),
    RecommendationOptionsOnDemandPrice("RecommendationOptionsOnDemandPrice"),
    RecommendationOptionsStandardOneYearNoUpfrontReservedPrice("RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"),
    RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice("RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"),
    RecommendationOptionsVcpus("RecommendationOptionsVcpus"),
    RecommendationOptionsMemory("RecommendationOptionsMemory"),
    RecommendationOptionsStorage("RecommendationOptionsStorage"),
    RecommendationOptionsNetwork("RecommendationOptionsNetwork"),
    LastRefreshTimestamp("LastRefreshTimestamp");

    private String value;

    private ExportableAutoScalingGroupField(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ExportableAutoScalingGroupField corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExportableAutoScalingGroupField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExportableAutoScalingGroupField enumEntry : ExportableAutoScalingGroupField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public enum ExportableECSServiceField {

    AccountId("AccountId"),
    ServiceArn("ServiceArn"),
    LookbackPeriodInDays("LookbackPeriodInDays"),
    LastRefreshTimestamp("LastRefreshTimestamp"),
    LaunchType("LaunchType"),
    CurrentPerformanceRisk("CurrentPerformanceRisk"),
    CurrentServiceConfigurationMemory("CurrentServiceConfigurationMemory"),
    CurrentServiceConfigurationCpu("CurrentServiceConfigurationCpu"),
    CurrentServiceConfigurationTaskDefinitionArn("CurrentServiceConfigurationTaskDefinitionArn"),
    CurrentServiceConfigurationAutoScalingConfiguration("CurrentServiceConfigurationAutoScalingConfiguration"),
    CurrentServiceContainerConfigurations("CurrentServiceContainerConfigurations"),
    UtilizationMetricsCpuMaximum("UtilizationMetricsCpuMaximum"),
    UtilizationMetricsMemoryMaximum("UtilizationMetricsMemoryMaximum"),
    Finding("Finding"),
    FindingReasonCodes("FindingReasonCodes"),
    RecommendationOptionsMemory("RecommendationOptionsMemory"),
    RecommendationOptionsCpu("RecommendationOptionsCpu"),
    RecommendationOptionsSavingsOpportunityPercentage("RecommendationOptionsSavingsOpportunityPercentage"),
    RecommendationOptionsEstimatedMonthlySavingsCurrency("RecommendationOptionsEstimatedMonthlySavingsCurrency"),
    RecommendationOptionsEstimatedMonthlySavingsValue("RecommendationOptionsEstimatedMonthlySavingsValue"),
    RecommendationOptionsContainerRecommendations("RecommendationOptionsContainerRecommendations"),
    RecommendationOptionsProjectedUtilizationMetricsCpuMaximum("RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"),
    RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum("RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum");

    private String value;

    private ExportableECSServiceField(String value) {
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
     * @return ExportableECSServiceField corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExportableECSServiceField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExportableECSServiceField enumEntry : ExportableECSServiceField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

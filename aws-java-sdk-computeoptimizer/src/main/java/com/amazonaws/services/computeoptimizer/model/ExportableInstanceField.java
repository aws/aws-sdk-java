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
public enum ExportableInstanceField {

    AccountId("AccountId"),
    InstanceArn("InstanceArn"),
    InstanceName("InstanceName"),
    Finding("Finding"),
    FindingReasonCodes("FindingReasonCodes"),
    LookbackPeriodInDays("LookbackPeriodInDays"),
    CurrentInstanceType("CurrentInstanceType"),
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
    CurrentOnDemandPrice("CurrentOnDemandPrice"),
    CurrentStandardOneYearNoUpfrontReservedPrice("CurrentStandardOneYearNoUpfrontReservedPrice"),
    CurrentStandardThreeYearNoUpfrontReservedPrice("CurrentStandardThreeYearNoUpfrontReservedPrice"),
    CurrentVCpus("CurrentVCpus"),
    CurrentMemory("CurrentMemory"),
    CurrentStorage("CurrentStorage"),
    CurrentNetwork("CurrentNetwork"),
    RecommendationOptionsInstanceType("RecommendationOptionsInstanceType"),
    RecommendationOptionsProjectedUtilizationMetricsCpuMaximum("RecommendationOptionsProjectedUtilizationMetricsCpuMaximum"),
    RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum("RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum"),
    RecommendationOptionsPlatformDifferences("RecommendationOptionsPlatformDifferences"),
    RecommendationOptionsPerformanceRisk("RecommendationOptionsPerformanceRisk"),
    RecommendationOptionsVcpus("RecommendationOptionsVcpus"),
    RecommendationOptionsMemory("RecommendationOptionsMemory"),
    RecommendationOptionsStorage("RecommendationOptionsStorage"),
    RecommendationOptionsNetwork("RecommendationOptionsNetwork"),
    RecommendationOptionsOnDemandPrice("RecommendationOptionsOnDemandPrice"),
    RecommendationOptionsStandardOneYearNoUpfrontReservedPrice("RecommendationOptionsStandardOneYearNoUpfrontReservedPrice"),
    RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice("RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice"),
    RecommendationsSourcesRecommendationSourceArn("RecommendationsSourcesRecommendationSourceArn"),
    RecommendationsSourcesRecommendationSourceType("RecommendationsSourcesRecommendationSourceType"),
    LastRefreshTimestamp("LastRefreshTimestamp");

    private String value;

    private ExportableInstanceField(String value) {
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
     * @return ExportableInstanceField corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ExportableInstanceField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ExportableInstanceField enumEntry : ExportableInstanceField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}

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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchAlarmDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchAlarmDefinitionMarshaller {

    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComparisonOperator").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationPeriods").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Period").build();
    private static final MarshallingInfo<String> STATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statistic").build();
    private static final MarshallingInfo<Double> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Threshold").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();

    private static final CloudWatchAlarmDefinitionMarshaller instance = new CloudWatchAlarmDefinitionMarshaller();

    public static CloudWatchAlarmDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchAlarmDefinition cloudWatchAlarmDefinition, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchAlarmDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getUnit(), UNIT_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmDefinition.getDimensions(), DIMENSIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

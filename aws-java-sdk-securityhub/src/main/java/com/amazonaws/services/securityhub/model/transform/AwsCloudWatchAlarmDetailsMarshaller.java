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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsCloudWatchAlarmDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsCloudWatchAlarmDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ACTIONSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsEnabled").build();
    private static final MarshallingInfo<List> ALARMACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmActions").build();
    private static final MarshallingInfo<String> ALARMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmArn").build();
    private static final MarshallingInfo<String> ALARMCONFIGURATIONUPDATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmConfigurationUpdatedTimestamp").build();
    private static final MarshallingInfo<String> ALARMDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlarmDescription").build();
    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlarmName").build();
    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComparisonOperator").build();
    private static final MarshallingInfo<Integer> DATAPOINTSTOALARM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatapointsToAlarm").build();
    private static final MarshallingInfo<List> DIMENSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dimensions").build();
    private static final MarshallingInfo<String> EVALUATELOWSAMPLECOUNTPERCENTILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluateLowSampleCountPercentile").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationPeriods").build();
    private static final MarshallingInfo<String> EXTENDEDSTATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtendedStatistic").build();
    private static final MarshallingInfo<List> INSUFFICIENTDATAACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsufficientDataActions").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetricName").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Namespace").build();
    private static final MarshallingInfo<List> OKACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OkActions").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Period").build();
    private static final MarshallingInfo<String> STATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Statistic").build();
    private static final MarshallingInfo<Double> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Threshold").build();
    private static final MarshallingInfo<String> THRESHOLDMETRICID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThresholdMetricId").build();
    private static final MarshallingInfo<String> TREATMISSINGDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreatMissingData").build();
    private static final MarshallingInfo<String> UNIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unit").build();

    private static final AwsCloudWatchAlarmDetailsMarshaller instance = new AwsCloudWatchAlarmDetailsMarshaller();

    public static AwsCloudWatchAlarmDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsCloudWatchAlarmDetails awsCloudWatchAlarmDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsCloudWatchAlarmDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getActionsEnabled(), ACTIONSENABLED_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getAlarmActions(), ALARMACTIONS_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getAlarmArn(), ALARMARN_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getAlarmConfigurationUpdatedTimestamp(), ALARMCONFIGURATIONUPDATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getAlarmDescription(), ALARMDESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getDatapointsToAlarm(), DATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getDimensions(), DIMENSIONS_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getEvaluateLowSampleCountPercentile(), EVALUATELOWSAMPLECOUNTPERCENTILE_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getExtendedStatistic(), EXTENDEDSTATISTIC_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getInsufficientDataActions(), INSUFFICIENTDATAACTIONS_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getOkActions(), OKACTIONS_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getThresholdMetricId(), THRESHOLDMETRICID_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getTreatMissingData(), TREATMISSINGDATA_BINDING);
            protocolMarshaller.marshall(awsCloudWatchAlarmDetails.getUnit(), UNIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

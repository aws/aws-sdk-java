/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CloudWatchAlarmTemplateSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CloudWatchAlarmTemplateSummaryMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("comparisonOperator").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Integer> DATAPOINTSTOALARM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datapointsToAlarm").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationPeriods").build();
    private static final MarshallingInfo<String> GROUPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("groupId").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricName").build();
    private static final MarshallingInfo<java.util.Date> MODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modifiedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<Integer> PERIOD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("period").build();
    private static final MarshallingInfo<String> STATISTIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statistic").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> TARGETRESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetResourceType").build();
    private static final MarshallingInfo<Double> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("threshold").build();
    private static final MarshallingInfo<String> TREATMISSINGDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("treatMissingData").build();

    private static final CloudWatchAlarmTemplateSummaryMarshaller instance = new CloudWatchAlarmTemplateSummaryMarshaller();

    public static CloudWatchAlarmTemplateSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CloudWatchAlarmTemplateSummary cloudWatchAlarmTemplateSummary, ProtocolMarshaller protocolMarshaller) {

        if (cloudWatchAlarmTemplateSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getDatapointsToAlarm(), DATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getGroupId(), GROUPID_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getModifiedAt(), MODIFIEDAT_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getTargetResourceType(), TARGETRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(cloudWatchAlarmTemplateSummary.getTreatMissingData(), TREATMISSINGDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

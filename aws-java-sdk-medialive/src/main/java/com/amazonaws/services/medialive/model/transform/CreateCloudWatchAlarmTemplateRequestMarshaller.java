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
 * CreateCloudWatchAlarmTemplateRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateCloudWatchAlarmTemplateRequestMarshaller {

    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("comparisonOperator").build();
    private static final MarshallingInfo<Integer> DATAPOINTSTOALARM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datapointsToAlarm").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationPeriods").build();
    private static final MarshallingInfo<String> GROUPIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("groupIdentifier").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricName").build();
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

    private static final CreateCloudWatchAlarmTemplateRequestMarshaller instance = new CreateCloudWatchAlarmTemplateRequestMarshaller();

    public static CreateCloudWatchAlarmTemplateRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateCloudWatchAlarmTemplateRequest createCloudWatchAlarmTemplateRequest, ProtocolMarshaller protocolMarshaller) {

        if (createCloudWatchAlarmTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getDatapointsToAlarm(), DATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getGroupIdentifier(), GROUPIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getPeriod(), PERIOD_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getStatistic(), STATISTIC_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getTargetResourceType(), TARGETRESOURCETYPE_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(createCloudWatchAlarmTemplateRequest.getTreatMissingData(), TREATMISSINGDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

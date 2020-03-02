/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutAlarmRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutAlarmRequestMarshaller {

    private static final MarshallingInfo<String> ALARMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("alarmName").build();
    private static final MarshallingInfo<String> METRICNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metricName").build();
    private static final MarshallingInfo<String> MONITOREDRESOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monitoredResourceName").build();
    private static final MarshallingInfo<String> COMPARISONOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("comparisonOperator").build();
    private static final MarshallingInfo<Double> THRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("threshold").build();
    private static final MarshallingInfo<Integer> EVALUATIONPERIODS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationPeriods").build();
    private static final MarshallingInfo<Integer> DATAPOINTSTOALARM_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("datapointsToAlarm").build();
    private static final MarshallingInfo<String> TREATMISSINGDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("treatMissingData").build();
    private static final MarshallingInfo<List> CONTACTPROTOCOLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("contactProtocols").build();
    private static final MarshallingInfo<List> NOTIFICATIONTRIGGERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationTriggers").build();
    private static final MarshallingInfo<Boolean> NOTIFICATIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationEnabled").build();

    private static final PutAlarmRequestMarshaller instance = new PutAlarmRequestMarshaller();

    public static PutAlarmRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutAlarmRequest putAlarmRequest, ProtocolMarshaller protocolMarshaller) {

        if (putAlarmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putAlarmRequest.getAlarmName(), ALARMNAME_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getMetricName(), METRICNAME_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getMonitoredResourceName(), MONITOREDRESOURCENAME_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getComparisonOperator(), COMPARISONOPERATOR_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getThreshold(), THRESHOLD_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getEvaluationPeriods(), EVALUATIONPERIODS_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getDatapointsToAlarm(), DATAPOINTSTOALARM_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getTreatMissingData(), TREATMISSINGDATA_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getContactProtocols(), CONTACTPROTOCOLS_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getNotificationTriggers(), NOTIFICATIONTRIGGERS_BINDING);
            protocolMarshaller.marshall(putAlarmRequest.getNotificationEnabled(), NOTIFICATIONENABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

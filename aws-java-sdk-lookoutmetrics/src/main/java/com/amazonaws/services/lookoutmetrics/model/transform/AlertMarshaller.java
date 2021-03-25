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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlertMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlertMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Action").build();
    private static final MarshallingInfo<String> ALERTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlertDescription").build();
    private static final MarshallingInfo<String> ALERTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlertArn").build();
    private static final MarshallingInfo<String> ANOMALYDETECTORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnomalyDetectorArn").build();
    private static final MarshallingInfo<String> ALERTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlertName").build();
    private static final MarshallingInfo<Integer> ALERTSENSITIVITYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlertSensitivityThreshold").build();
    private static final MarshallingInfo<String> ALERTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlertType").build();
    private static final MarshallingInfo<String> ALERTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlertStatus").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModificationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();

    private static final AlertMarshaller instance = new AlertMarshaller();

    public static AlertMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Alert alert, ProtocolMarshaller protocolMarshaller) {

        if (alert == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alert.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(alert.getAlertDescription(), ALERTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(alert.getAlertArn(), ALERTARN_BINDING);
            protocolMarshaller.marshall(alert.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(alert.getAlertName(), ALERTNAME_BINDING);
            protocolMarshaller.marshall(alert.getAlertSensitivityThreshold(), ALERTSENSITIVITYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(alert.getAlertType(), ALERTTYPE_BINDING);
            protocolMarshaller.marshall(alert.getAlertStatus(), ALERTSTATUS_BINDING);
            protocolMarshaller.marshall(alert.getLastModificationTime(), LASTMODIFICATIONTIME_BINDING);
            protocolMarshaller.marshall(alert.getCreationTime(), CREATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

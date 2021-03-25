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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlertSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlertSummaryMarshaller {

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
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final AlertSummaryMarshaller instance = new AlertSummaryMarshaller();

    public static AlertSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlertSummary alertSummary, ProtocolMarshaller protocolMarshaller) {

        if (alertSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alertSummary.getAlertArn(), ALERTARN_BINDING);
            protocolMarshaller.marshall(alertSummary.getAnomalyDetectorArn(), ANOMALYDETECTORARN_BINDING);
            protocolMarshaller.marshall(alertSummary.getAlertName(), ALERTNAME_BINDING);
            protocolMarshaller.marshall(alertSummary.getAlertSensitivityThreshold(), ALERTSENSITIVITYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(alertSummary.getAlertType(), ALERTTYPE_BINDING);
            protocolMarshaller.marshall(alertSummary.getAlertStatus(), ALERTSTATUS_BINDING);
            protocolMarshaller.marshall(alertSummary.getLastModificationTime(), LASTMODIFICATIONTIME_BINDING);
            protocolMarshaller.marshall(alertSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(alertSummary.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

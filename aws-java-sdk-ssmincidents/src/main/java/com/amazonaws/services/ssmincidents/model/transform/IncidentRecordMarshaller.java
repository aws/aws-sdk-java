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
package com.amazonaws.services.ssmincidents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmincidents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IncidentRecordMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IncidentRecordMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<List> AUTOMATIONEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("automationExecutions").build();
    private static final MarshallingInfo<StructuredPojo> CHATCHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("chatChannel").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEDUPESTRING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dedupeString").build();
    private static final MarshallingInfo<Integer> IMPACT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("impact").build();
    private static final MarshallingInfo<StructuredPojo> INCIDENTRECORDSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("incidentRecordSource").build();
    private static final MarshallingInfo<String> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedBy").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> NOTIFICATIONTARGETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("notificationTargets").build();
    private static final MarshallingInfo<java.util.Date> RESOLVEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resolvedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("summary").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();

    private static final IncidentRecordMarshaller instance = new IncidentRecordMarshaller();

    public static IncidentRecordMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IncidentRecord incidentRecord, ProtocolMarshaller protocolMarshaller) {

        if (incidentRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(incidentRecord.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(incidentRecord.getAutomationExecutions(), AUTOMATIONEXECUTIONS_BINDING);
            protocolMarshaller.marshall(incidentRecord.getChatChannel(), CHATCHANNEL_BINDING);
            protocolMarshaller.marshall(incidentRecord.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(incidentRecord.getDedupeString(), DEDUPESTRING_BINDING);
            protocolMarshaller.marshall(incidentRecord.getImpact(), IMPACT_BINDING);
            protocolMarshaller.marshall(incidentRecord.getIncidentRecordSource(), INCIDENTRECORDSOURCE_BINDING);
            protocolMarshaller.marshall(incidentRecord.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(incidentRecord.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(incidentRecord.getNotificationTargets(), NOTIFICATIONTARGETS_BINDING);
            protocolMarshaller.marshall(incidentRecord.getResolvedTime(), RESOLVEDTIME_BINDING);
            protocolMarshaller.marshall(incidentRecord.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(incidentRecord.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(incidentRecord.getTitle(), TITLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

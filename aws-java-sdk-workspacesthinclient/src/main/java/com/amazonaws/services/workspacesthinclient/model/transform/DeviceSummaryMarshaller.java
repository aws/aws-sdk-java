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
package com.amazonaws.services.workspacesthinclient.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesthinclient.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceSummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> SERIALNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serialNumber").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> MODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("model").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> CURRENTSOFTWARESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentSoftwareSetId").build();
    private static final MarshallingInfo<String> DESIREDSOFTWARESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredSoftwareSetId").build();
    private static final MarshallingInfo<String> PENDINGSOFTWARESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingSoftwareSetId").build();
    private static final MarshallingInfo<String> SOFTWARESETUPDATESCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softwareSetUpdateSchedule").build();
    private static final MarshallingInfo<java.util.Date> LASTCONNECTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastConnectedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTPOSTUREAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastPostureAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();

    private static final DeviceSummaryMarshaller instance = new DeviceSummaryMarshaller();

    public static DeviceSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceSummary deviceSummary, ProtocolMarshaller protocolMarshaller) {

        if (deviceSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(deviceSummary.getSerialNumber(), SERIALNUMBER_BINDING);
            protocolMarshaller.marshall(deviceSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(deviceSummary.getModel(), MODEL_BINDING);
            protocolMarshaller.marshall(deviceSummary.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(deviceSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(deviceSummary.getCurrentSoftwareSetId(), CURRENTSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(deviceSummary.getDesiredSoftwareSetId(), DESIREDSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(deviceSummary.getPendingSoftwareSetId(), PENDINGSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(deviceSummary.getSoftwareSetUpdateSchedule(), SOFTWARESETUPDATESCHEDULE_BINDING);
            protocolMarshaller.marshall(deviceSummary.getLastConnectedAt(), LASTCONNECTEDAT_BINDING);
            protocolMarshaller.marshall(deviceSummary.getLastPostureAt(), LASTPOSTUREAT_BINDING);
            protocolMarshaller.marshall(deviceSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(deviceSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(deviceSummary.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

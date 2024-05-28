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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesthinclient.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnvironmentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESKTOPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desktopArn").build();
    private static final MarshallingInfo<String> DESKTOPENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desktopEndpoint").build();
    private static final MarshallingInfo<String> DESKTOPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desktopType").build();
    private static final MarshallingInfo<String> ACTIVATIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activationCode").build();
    private static final MarshallingInfo<Integer> REGISTEREDDEVICESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("registeredDevicesCount").build();
    private static final MarshallingInfo<String> SOFTWARESETUPDATESCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softwareSetUpdateSchedule").build();
    private static final MarshallingInfo<StructuredPojo> MAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maintenanceWindow").build();
    private static final MarshallingInfo<String> SOFTWARESETUPDATEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softwareSetUpdateMode").build();
    private static final MarshallingInfo<String> DESIREDSOFTWARESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredSoftwareSetId").build();
    private static final MarshallingInfo<String> PENDINGSOFTWARESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingSoftwareSetId").build();
    private static final MarshallingInfo<String> PENDINGSOFTWARESETVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingSoftwareSetVersion").build();
    private static final MarshallingInfo<String> SOFTWARESETCOMPLIANCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softwareSetComplianceStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final EnvironmentMarshaller instance = new EnvironmentMarshaller();

    public static EnvironmentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Environment environment, ProtocolMarshaller protocolMarshaller) {

        if (environment == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(environment.getId(), ID_BINDING);
            protocolMarshaller.marshall(environment.getName(), NAME_BINDING);
            protocolMarshaller.marshall(environment.getDesktopArn(), DESKTOPARN_BINDING);
            protocolMarshaller.marshall(environment.getDesktopEndpoint(), DESKTOPENDPOINT_BINDING);
            protocolMarshaller.marshall(environment.getDesktopType(), DESKTOPTYPE_BINDING);
            protocolMarshaller.marshall(environment.getActivationCode(), ACTIVATIONCODE_BINDING);
            protocolMarshaller.marshall(environment.getRegisteredDevicesCount(), REGISTEREDDEVICESCOUNT_BINDING);
            protocolMarshaller.marshall(environment.getSoftwareSetUpdateSchedule(), SOFTWARESETUPDATESCHEDULE_BINDING);
            protocolMarshaller.marshall(environment.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(environment.getSoftwareSetUpdateMode(), SOFTWARESETUPDATEMODE_BINDING);
            protocolMarshaller.marshall(environment.getDesiredSoftwareSetId(), DESIREDSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(environment.getPendingSoftwareSetId(), PENDINGSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(environment.getPendingSoftwareSetVersion(), PENDINGSOFTWARESETVERSION_BINDING);
            protocolMarshaller.marshall(environment.getSoftwareSetComplianceStatus(), SOFTWARESETCOMPLIANCESTATUS_BINDING);
            protocolMarshaller.marshall(environment.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(environment.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(environment.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(environment.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(environment.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

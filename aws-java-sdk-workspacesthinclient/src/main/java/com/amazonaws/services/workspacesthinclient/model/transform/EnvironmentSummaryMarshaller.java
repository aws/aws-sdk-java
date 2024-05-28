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
 * EnvironmentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentSummaryMarshaller {

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
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();

    private static final EnvironmentSummaryMarshaller instance = new EnvironmentSummaryMarshaller();

    public static EnvironmentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnvironmentSummary environmentSummary, ProtocolMarshaller protocolMarshaller) {

        if (environmentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(environmentSummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(environmentSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(environmentSummary.getDesktopArn(), DESKTOPARN_BINDING);
            protocolMarshaller.marshall(environmentSummary.getDesktopEndpoint(), DESKTOPENDPOINT_BINDING);
            protocolMarshaller.marshall(environmentSummary.getDesktopType(), DESKTOPTYPE_BINDING);
            protocolMarshaller.marshall(environmentSummary.getActivationCode(), ACTIVATIONCODE_BINDING);
            protocolMarshaller.marshall(environmentSummary.getSoftwareSetUpdateSchedule(), SOFTWARESETUPDATESCHEDULE_BINDING);
            protocolMarshaller.marshall(environmentSummary.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(environmentSummary.getSoftwareSetUpdateMode(), SOFTWARESETUPDATEMODE_BINDING);
            protocolMarshaller.marshall(environmentSummary.getDesiredSoftwareSetId(), DESIREDSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(environmentSummary.getPendingSoftwareSetId(), PENDINGSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(environmentSummary.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(environmentSummary.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(environmentSummary.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

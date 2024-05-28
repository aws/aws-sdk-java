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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateEnvironmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateEnvironmentRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESKTOPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desktopArn").build();
    private static final MarshallingInfo<String> DESKTOPENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desktopEndpoint").build();
    private static final MarshallingInfo<String> SOFTWARESETUPDATESCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softwareSetUpdateSchedule").build();
    private static final MarshallingInfo<StructuredPojo> MAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maintenanceWindow").build();
    private static final MarshallingInfo<String> SOFTWARESETUPDATEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("softwareSetUpdateMode").build();
    private static final MarshallingInfo<String> DESIREDSOFTWARESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredSoftwareSetId").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyArn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateEnvironmentRequestMarshaller instance = new CreateEnvironmentRequestMarshaller();

    public static CreateEnvironmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateEnvironmentRequest createEnvironmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (createEnvironmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createEnvironmentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getDesktopArn(), DESKTOPARN_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getDesktopEndpoint(), DESKTOPENDPOINT_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getSoftwareSetUpdateSchedule(), SOFTWARESETUPDATESCHEDULE_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getMaintenanceWindow(), MAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getSoftwareSetUpdateMode(), SOFTWARESETUPDATEMODE_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getDesiredSoftwareSetId(), DESIREDSOFTWARESETID_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getKmsKeyArn(), KMSKEYARN_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createEnvironmentRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

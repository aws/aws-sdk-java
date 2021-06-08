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
package com.amazonaws.services.auditmanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateControlRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateControlRequestMarshaller {

    private static final MarshallingInfo<String> CONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("controlId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> TESTINGINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("testingInformation").build();
    private static final MarshallingInfo<String> ACTIONPLANTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionPlanTitle").build();
    private static final MarshallingInfo<String> ACTIONPLANINSTRUCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionPlanInstructions").build();
    private static final MarshallingInfo<List> CONTROLMAPPINGSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlMappingSources").build();

    private static final UpdateControlRequestMarshaller instance = new UpdateControlRequestMarshaller();

    public static UpdateControlRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateControlRequest updateControlRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateControlRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateControlRequest.getControlId(), CONTROLID_BINDING);
            protocolMarshaller.marshall(updateControlRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateControlRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateControlRequest.getTestingInformation(), TESTINGINFORMATION_BINDING);
            protocolMarshaller.marshall(updateControlRequest.getActionPlanTitle(), ACTIONPLANTITLE_BINDING);
            protocolMarshaller.marshall(updateControlRequest.getActionPlanInstructions(), ACTIONPLANINSTRUCTIONS_BINDING);
            protocolMarshaller.marshall(updateControlRequest.getControlMappingSources(), CONTROLMAPPINGSOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

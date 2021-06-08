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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ControlMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
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
    private static final MarshallingInfo<String> CONTROLSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlSources").build();
    private static final MarshallingInfo<List> CONTROLMAPPINGSOURCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("controlMappingSources").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdBy").build();
    private static final MarshallingInfo<String> LASTUPDATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedBy").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ControlMarshaller instance = new ControlMarshaller();

    public static ControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Control control, ProtocolMarshaller protocolMarshaller) {

        if (control == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(control.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(control.getId(), ID_BINDING);
            protocolMarshaller.marshall(control.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(control.getName(), NAME_BINDING);
            protocolMarshaller.marshall(control.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(control.getTestingInformation(), TESTINGINFORMATION_BINDING);
            protocolMarshaller.marshall(control.getActionPlanTitle(), ACTIONPLANTITLE_BINDING);
            protocolMarshaller.marshall(control.getActionPlanInstructions(), ACTIONPLANINSTRUCTIONS_BINDING);
            protocolMarshaller.marshall(control.getControlSources(), CONTROLSOURCES_BINDING);
            protocolMarshaller.marshall(control.getControlMappingSources(), CONTROLMAPPINGSOURCES_BINDING);
            protocolMarshaller.marshall(control.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(control.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(control.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(control.getLastUpdatedBy(), LASTUPDATEDBY_BINDING);
            protocolMarshaller.marshall(control.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

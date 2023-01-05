/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.panorama.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationInstanceMarshaller {

    private static final MarshallingInfo<String> APPLICATIONINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationInstanceId").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DEFAULTRUNTIMECONTEXTDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRuntimeContextDevice").build();
    private static final MarshallingInfo<String> DEFAULTRUNTIMECONTEXTDEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRuntimeContextDeviceName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> HEALTHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HealthStatus").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<List> RUNTIMECONTEXTSTATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeContextStates").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusDescription").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final ApplicationInstanceMarshaller instance = new ApplicationInstanceMarshaller();

    public static ApplicationInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationInstance applicationInstance, ProtocolMarshaller protocolMarshaller) {

        if (applicationInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationInstance.getApplicationInstanceId(), APPLICATIONINSTANCEID_BINDING);
            protocolMarshaller.marshall(applicationInstance.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(applicationInstance.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(applicationInstance.getDefaultRuntimeContextDevice(), DEFAULTRUNTIMECONTEXTDEVICE_BINDING);
            protocolMarshaller.marshall(applicationInstance.getDefaultRuntimeContextDeviceName(), DEFAULTRUNTIMECONTEXTDEVICENAME_BINDING);
            protocolMarshaller.marshall(applicationInstance.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationInstance.getHealthStatus(), HEALTHSTATUS_BINDING);
            protocolMarshaller.marshall(applicationInstance.getName(), NAME_BINDING);
            protocolMarshaller.marshall(applicationInstance.getRuntimeContextStates(), RUNTIMECONTEXTSTATES_BINDING);
            protocolMarshaller.marshall(applicationInstance.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(applicationInstance.getStatusDescription(), STATUSDESCRIPTION_BINDING);
            protocolMarshaller.marshall(applicationInstance.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

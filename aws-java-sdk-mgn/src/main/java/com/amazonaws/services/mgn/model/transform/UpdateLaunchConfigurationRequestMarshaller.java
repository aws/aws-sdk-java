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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLaunchConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLaunchConfigurationRequestMarshaller {

    private static final MarshallingInfo<Boolean> COPYPRIVATEIP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyPrivateIp").build();
    private static final MarshallingInfo<Boolean> COPYTAGS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("copyTags").build();
    private static final MarshallingInfo<String> LAUNCHDISPOSITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchDisposition").build();
    private static final MarshallingInfo<StructuredPojo> LICENSING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licensing").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> SOURCESERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceServerID").build();
    private static final MarshallingInfo<String> TARGETINSTANCETYPERIGHTSIZINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetInstanceTypeRightSizingMethod").build();

    private static final UpdateLaunchConfigurationRequestMarshaller instance = new UpdateLaunchConfigurationRequestMarshaller();

    public static UpdateLaunchConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLaunchConfigurationRequest updateLaunchConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLaunchConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getCopyPrivateIp(), COPYPRIVATEIP_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getCopyTags(), COPYTAGS_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getLaunchDisposition(), LAUNCHDISPOSITION_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getLicensing(), LICENSING_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getSourceServerID(), SOURCESERVERID_BINDING);
            protocolMarshaller.marshall(updateLaunchConfigurationRequest.getTargetInstanceTypeRightSizingMethod(), TARGETINSTANCETYPERIGHTSIZINGMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

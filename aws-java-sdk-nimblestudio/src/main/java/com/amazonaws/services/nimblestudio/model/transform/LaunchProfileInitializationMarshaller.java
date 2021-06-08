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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LaunchProfileInitializationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LaunchProfileInitializationMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACTIVEDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeDirectory").build();
    private static final MarshallingInfo<List> EC2SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2SecurityGroupIds").build();
    private static final MarshallingInfo<String> LAUNCHPROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchProfileId").build();
    private static final MarshallingInfo<String> LAUNCHPROFILEPROTOCOLVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchProfileProtocolVersion").build();
    private static final MarshallingInfo<String> LAUNCHPURPOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchPurpose").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<List> SYSTEMINITIALIZATIONSCRIPTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemInitializationScripts").build();
    private static final MarshallingInfo<List> USERINITIALIZATIONSCRIPTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userInitializationScripts").build();

    private static final LaunchProfileInitializationMarshaller instance = new LaunchProfileInitializationMarshaller();

    public static LaunchProfileInitializationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LaunchProfileInitialization launchProfileInitialization, ProtocolMarshaller protocolMarshaller) {

        if (launchProfileInitialization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(launchProfileInitialization.getActiveDirectory(), ACTIVEDIRECTORY_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getEc2SecurityGroupIds(), EC2SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getLaunchProfileId(), LAUNCHPROFILEID_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getLaunchProfileProtocolVersion(), LAUNCHPROFILEPROTOCOLVERSION_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getLaunchPurpose(), LAUNCHPURPOSE_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getName(), NAME_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getSystemInitializationScripts(), SYSTEMINITIALIZATIONSCRIPTS_BINDING);
            protocolMarshaller.marshall(launchProfileInitialization.getUserInitializationScripts(), USERINITIALIZATIONSCRIPTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspaces.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SelfservicePermissionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SelfservicePermissionsMarshaller {

    private static final MarshallingInfo<String> RESTARTWORKSPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestartWorkspace").build();
    private static final MarshallingInfo<String> INCREASEVOLUMESIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncreaseVolumeSize").build();
    private static final MarshallingInfo<String> CHANGECOMPUTETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeComputeType").build();
    private static final MarshallingInfo<String> SWITCHRUNNINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SwitchRunningMode").build();
    private static final MarshallingInfo<String> REBUILDWORKSPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RebuildWorkspace").build();

    private static final SelfservicePermissionsMarshaller instance = new SelfservicePermissionsMarshaller();

    public static SelfservicePermissionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SelfservicePermissions selfservicePermissions, ProtocolMarshaller protocolMarshaller) {

        if (selfservicePermissions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(selfservicePermissions.getRestartWorkspace(), RESTARTWORKSPACE_BINDING);
            protocolMarshaller.marshall(selfservicePermissions.getIncreaseVolumeSize(), INCREASEVOLUMESIZE_BINDING);
            protocolMarshaller.marshall(selfservicePermissions.getChangeComputeType(), CHANGECOMPUTETYPE_BINDING);
            protocolMarshaller.marshall(selfservicePermissions.getSwitchRunningMode(), SWITCHRUNNINGMODE_BINDING);
            protocolMarshaller.marshall(selfservicePermissions.getRebuildWorkspace(), REBUILDWORKSPACE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

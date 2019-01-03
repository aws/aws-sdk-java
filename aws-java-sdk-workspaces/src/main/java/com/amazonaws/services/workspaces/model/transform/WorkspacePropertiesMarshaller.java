/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * WorkspacePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WorkspacePropertiesMarshaller {

    private static final MarshallingInfo<String> RUNNINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningMode").build();
    private static final MarshallingInfo<Integer> RUNNINGMODEAUTOSTOPTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RunningModeAutoStopTimeoutInMinutes").build();
    private static final MarshallingInfo<Integer> ROOTVOLUMESIZEGIB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootVolumeSizeGib").build();
    private static final MarshallingInfo<Integer> USERVOLUMESIZEGIB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserVolumeSizeGib").build();
    private static final MarshallingInfo<String> COMPUTETYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeTypeName").build();

    private static final WorkspacePropertiesMarshaller instance = new WorkspacePropertiesMarshaller();

    public static WorkspacePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WorkspaceProperties workspaceProperties, ProtocolMarshaller protocolMarshaller) {

        if (workspaceProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(workspaceProperties.getRunningMode(), RUNNINGMODE_BINDING);
            protocolMarshaller.marshall(workspaceProperties.getRunningModeAutoStopTimeoutInMinutes(), RUNNINGMODEAUTOSTOPTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(workspaceProperties.getRootVolumeSizeGib(), ROOTVOLUMESIZEGIB_BINDING);
            protocolMarshaller.marshall(workspaceProperties.getUserVolumeSizeGib(), USERVOLUMESIZEGIB_BINDING);
            protocolMarshaller.marshall(workspaceProperties.getComputeTypeName(), COMPUTETYPENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

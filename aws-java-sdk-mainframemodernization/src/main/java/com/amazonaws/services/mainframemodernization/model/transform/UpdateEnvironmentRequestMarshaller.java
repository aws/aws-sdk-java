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
package com.amazonaws.services.mainframemodernization.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mainframemodernization.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateEnvironmentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateEnvironmentRequestMarshaller {

    private static final MarshallingInfo<Boolean> APPLYDURINGMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applyDuringMaintenanceWindow").build();
    private static final MarshallingInfo<Integer> DESIREDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredCapacity").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersion").build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredMaintenanceWindow").build();

    private static final UpdateEnvironmentRequestMarshaller instance = new UpdateEnvironmentRequestMarshaller();

    public static UpdateEnvironmentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateEnvironmentRequest updateEnvironmentRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateEnvironmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateEnvironmentRequest.getApplyDuringMaintenanceWindow(), APPLYDURINGMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getDesiredCapacity(), DESIREDCAPACITY_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(updateEnvironmentRequest.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

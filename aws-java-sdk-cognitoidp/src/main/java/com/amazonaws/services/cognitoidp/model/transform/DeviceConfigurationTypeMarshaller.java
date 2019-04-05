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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeviceConfigurationTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeviceConfigurationTypeMarshaller {

    private static final MarshallingInfo<Boolean> CHALLENGEREQUIREDONNEWDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChallengeRequiredOnNewDevice").build();
    private static final MarshallingInfo<Boolean> DEVICEONLYREMEMBEREDONUSERPROMPT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceOnlyRememberedOnUserPrompt").build();

    private static final DeviceConfigurationTypeMarshaller instance = new DeviceConfigurationTypeMarshaller();

    public static DeviceConfigurationTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeviceConfigurationType deviceConfigurationType, ProtocolMarshaller protocolMarshaller) {

        if (deviceConfigurationType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deviceConfigurationType.getChallengeRequiredOnNewDevice(), CHALLENGEREQUIREDONNEWDEVICE_BINDING);
            protocolMarshaller.marshall(deviceConfigurationType.getDeviceOnlyRememberedOnUserPrompt(), DEVICEONLYREMEMBEREDONUSERPROMPT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

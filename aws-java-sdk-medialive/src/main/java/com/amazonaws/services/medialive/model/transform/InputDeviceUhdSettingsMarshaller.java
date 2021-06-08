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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputDeviceUhdSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputDeviceUhdSettingsMarshaller {

    private static final MarshallingInfo<String> ACTIVEINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("activeInput").build();
    private static final MarshallingInfo<String> CONFIGUREDINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuredInput").build();
    private static final MarshallingInfo<String> DEVICESTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceState").build();
    private static final MarshallingInfo<Double> FRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("framerate").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("height").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<String> SCANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanType").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final InputDeviceUhdSettingsMarshaller instance = new InputDeviceUhdSettingsMarshaller();

    public static InputDeviceUhdSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputDeviceUhdSettings inputDeviceUhdSettings, ProtocolMarshaller protocolMarshaller) {

        if (inputDeviceUhdSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputDeviceUhdSettings.getActiveInput(), ACTIVEINPUT_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getConfiguredInput(), CONFIGUREDINPUT_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getDeviceState(), DEVICESTATE_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getFramerate(), FRAMERATE_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getScanType(), SCANTYPE_BINDING);
            protocolMarshaller.marshall(inputDeviceUhdSettings.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

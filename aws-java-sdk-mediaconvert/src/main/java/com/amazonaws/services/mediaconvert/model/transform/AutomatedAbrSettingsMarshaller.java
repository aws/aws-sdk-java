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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutomatedAbrSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomatedAbrSettingsMarshaller {

    private static final MarshallingInfo<Integer> MAXABRBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxAbrBitrate").build();
    private static final MarshallingInfo<Integer> MAXRENDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxRenditions").build();
    private static final MarshallingInfo<Integer> MINABRBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minAbrBitrate").build();

    private static final AutomatedAbrSettingsMarshaller instance = new AutomatedAbrSettingsMarshaller();

    public static AutomatedAbrSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomatedAbrSettings automatedAbrSettings, ProtocolMarshaller protocolMarshaller) {

        if (automatedAbrSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automatedAbrSettings.getMaxAbrBitrate(), MAXABRBITRATE_BINDING);
            protocolMarshaller.marshall(automatedAbrSettings.getMaxRenditions(), MAXRENDITIONS_BINDING);
            protocolMarshaller.marshall(automatedAbrSettings.getMinAbrBitrate(), MINABRBITRATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

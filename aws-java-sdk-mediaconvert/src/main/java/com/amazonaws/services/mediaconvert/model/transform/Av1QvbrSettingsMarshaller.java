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
 * Av1QvbrSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Av1QvbrSettingsMarshaller {

    private static final MarshallingInfo<Integer> QVBRQUALITYLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qvbrQualityLevel").build();
    private static final MarshallingInfo<Double> QVBRQUALITYLEVELFINETUNE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("qvbrQualityLevelFineTune").build();

    private static final Av1QvbrSettingsMarshaller instance = new Av1QvbrSettingsMarshaller();

    public static Av1QvbrSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Av1QvbrSettings av1QvbrSettings, ProtocolMarshaller protocolMarshaller) {

        if (av1QvbrSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(av1QvbrSettings.getQvbrQualityLevel(), QVBRQUALITYLEVEL_BINDING);
            protocolMarshaller.marshall(av1QvbrSettings.getQvbrQualityLevelFineTune(), QVBRQUALITYLEVELFINETUNE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StaticImageActivateScheduleActionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StaticImageActivateScheduleActionSettingsMarshaller {

    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("duration").build();
    private static final MarshallingInfo<Integer> FADEIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fadeIn").build();
    private static final MarshallingInfo<Integer> FADEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fadeOut").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("height").build();
    private static final MarshallingInfo<StructuredPojo> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("image").build();
    private static final MarshallingInfo<Integer> IMAGEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageX").build();
    private static final MarshallingInfo<Integer> IMAGEY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageY").build();
    private static final MarshallingInfo<Integer> LAYER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("layer").build();
    private static final MarshallingInfo<Integer> OPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("opacity").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final StaticImageActivateScheduleActionSettingsMarshaller instance = new StaticImageActivateScheduleActionSettingsMarshaller();

    public static StaticImageActivateScheduleActionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StaticImageActivateScheduleActionSettings staticImageActivateScheduleActionSettings, ProtocolMarshaller protocolMarshaller) {

        if (staticImageActivateScheduleActionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getFadeIn(), FADEIN_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getFadeOut(), FADEOUT_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getImageX(), IMAGEX_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getImageY(), IMAGEY_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getLayer(), LAYER_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getOpacity(), OPACITY_BINDING);
            protocolMarshaller.marshall(staticImageActivateScheduleActionSettings.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

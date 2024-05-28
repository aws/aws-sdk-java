/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StaticImageOutputActivateScheduleActionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StaticImageOutputActivateScheduleActionSettingsMarshaller {

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
    private static final MarshallingInfo<List> OUTPUTNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("outputNames").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final StaticImageOutputActivateScheduleActionSettingsMarshaller instance = new StaticImageOutputActivateScheduleActionSettingsMarshaller();

    public static StaticImageOutputActivateScheduleActionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StaticImageOutputActivateScheduleActionSettings staticImageOutputActivateScheduleActionSettings, ProtocolMarshaller protocolMarshaller) {

        if (staticImageOutputActivateScheduleActionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getFadeIn(), FADEIN_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getFadeOut(), FADEOUT_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getImageX(), IMAGEX_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getImageY(), IMAGEY_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getLayer(), LAYER_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getOpacity(), OPACITY_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getOutputNames(), OUTPUTNAMES_BINDING);
            protocolMarshaller.marshall(staticImageOutputActivateScheduleActionSettings.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

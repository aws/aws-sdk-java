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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InsertableImageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InsertableImageMarshaller {

    private static final MarshallingInfo<Integer> DURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("duration").build();
    private static final MarshallingInfo<Integer> FADEIN_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fadeIn").build();
    private static final MarshallingInfo<Integer> FADEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fadeOut").build();
    private static final MarshallingInfo<Integer> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("height").build();
    private static final MarshallingInfo<String> IMAGEINSERTERINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageInserterInput").build();
    private static final MarshallingInfo<Integer> IMAGEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageX").build();
    private static final MarshallingInfo<Integer> IMAGEY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("imageY").build();
    private static final MarshallingInfo<Integer> LAYER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("layer").build();
    private static final MarshallingInfo<Integer> OPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("opacity").build();
    private static final MarshallingInfo<String> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startTime").build();
    private static final MarshallingInfo<Integer> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final InsertableImageMarshaller instance = new InsertableImageMarshaller();

    public static InsertableImageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InsertableImage insertableImage, ProtocolMarshaller protocolMarshaller) {

        if (insertableImage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(insertableImage.getDuration(), DURATION_BINDING);
            protocolMarshaller.marshall(insertableImage.getFadeIn(), FADEIN_BINDING);
            protocolMarshaller.marshall(insertableImage.getFadeOut(), FADEOUT_BINDING);
            protocolMarshaller.marshall(insertableImage.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(insertableImage.getImageInserterInput(), IMAGEINSERTERINPUT_BINDING);
            protocolMarshaller.marshall(insertableImage.getImageX(), IMAGEX_BINDING);
            protocolMarshaller.marshall(insertableImage.getImageY(), IMAGEY_BINDING);
            protocolMarshaller.marshall(insertableImage.getLayer(), LAYER_BINDING);
            protocolMarshaller.marshall(insertableImage.getOpacity(), OPACITY_BINDING);
            protocolMarshaller.marshall(insertableImage.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(insertableImage.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

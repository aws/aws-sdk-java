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
 * CaptionRectangleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CaptionRectangleMarshaller {

    private static final MarshallingInfo<Double> HEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("height").build();
    private static final MarshallingInfo<Double> LEFTOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("leftOffset").build();
    private static final MarshallingInfo<Double> TOPOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("topOffset").build();
    private static final MarshallingInfo<Double> WIDTH_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("width").build();

    private static final CaptionRectangleMarshaller instance = new CaptionRectangleMarshaller();

    public static CaptionRectangleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CaptionRectangle captionRectangle, ProtocolMarshaller protocolMarshaller) {

        if (captionRectangle == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(captionRectangle.getHeight(), HEIGHT_BINDING);
            protocolMarshaller.marshall(captionRectangle.getLeftOffset(), LEFTOFFSET_BINDING);
            protocolMarshaller.marshall(captionRectangle.getTopOffset(), TOPOFFSET_BINDING);
            protocolMarshaller.marshall(captionRectangle.getWidth(), WIDTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

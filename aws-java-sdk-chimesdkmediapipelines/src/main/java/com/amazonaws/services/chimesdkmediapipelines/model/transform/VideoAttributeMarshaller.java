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
package com.amazonaws.services.chimesdkmediapipelines.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkmediapipelines.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VideoAttributeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VideoAttributeMarshaller {

    private static final MarshallingInfo<Integer> CORNERRADIUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CornerRadius").build();
    private static final MarshallingInfo<String> BORDERCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderColor").build();
    private static final MarshallingInfo<String> HIGHLIGHTCOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HighlightColor").build();
    private static final MarshallingInfo<Integer> BORDERTHICKNESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BorderThickness").build();

    private static final VideoAttributeMarshaller instance = new VideoAttributeMarshaller();

    public static VideoAttributeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VideoAttribute videoAttribute, ProtocolMarshaller protocolMarshaller) {

        if (videoAttribute == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(videoAttribute.getCornerRadius(), CORNERRADIUS_BINDING);
            protocolMarshaller.marshall(videoAttribute.getBorderColor(), BORDERCOLOR_BINDING);
            protocolMarshaller.marshall(videoAttribute.getHighlightColor(), HIGHLIGHTCOLOR_BINDING);
            protocolMarshaller.marshall(videoAttribute.getBorderThickness(), BORDERTHICKNESS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

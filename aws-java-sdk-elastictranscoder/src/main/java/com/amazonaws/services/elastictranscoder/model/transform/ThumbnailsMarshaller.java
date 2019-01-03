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
package com.amazonaws.services.elastictranscoder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elastictranscoder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ThumbnailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThumbnailsMarshaller {

    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<String> INTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Interval").build();
    private static final MarshallingInfo<String> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resolution").build();
    private static final MarshallingInfo<String> ASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AspectRatio").build();
    private static final MarshallingInfo<String> MAXWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxWidth").build();
    private static final MarshallingInfo<String> MAXHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxHeight").build();
    private static final MarshallingInfo<String> SIZINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizingPolicy").build();
    private static final MarshallingInfo<String> PADDINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaddingPolicy").build();

    private static final ThumbnailsMarshaller instance = new ThumbnailsMarshaller();

    public static ThumbnailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Thumbnails thumbnails, ProtocolMarshaller protocolMarshaller) {

        if (thumbnails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(thumbnails.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(thumbnails.getInterval(), INTERVAL_BINDING);
            protocolMarshaller.marshall(thumbnails.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(thumbnails.getAspectRatio(), ASPECTRATIO_BINDING);
            protocolMarshaller.marshall(thumbnails.getMaxWidth(), MAXWIDTH_BINDING);
            protocolMarshaller.marshall(thumbnails.getMaxHeight(), MAXHEIGHT_BINDING);
            protocolMarshaller.marshall(thumbnails.getSizingPolicy(), SIZINGPOLICY_BINDING);
            protocolMarshaller.marshall(thumbnails.getPaddingPolicy(), PADDINGPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * ArtworkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ArtworkMarshaller {

    private static final MarshallingInfo<String> INPUTKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputKey").build();
    private static final MarshallingInfo<String> MAXWIDTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxWidth").build();
    private static final MarshallingInfo<String> MAXHEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxHeight").build();
    private static final MarshallingInfo<String> SIZINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizingPolicy").build();
    private static final MarshallingInfo<String> PADDINGPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PaddingPolicy").build();
    private static final MarshallingInfo<String> ALBUMARTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlbumArtFormat").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encryption").build();

    private static final ArtworkMarshaller instance = new ArtworkMarshaller();

    public static ArtworkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Artwork artwork, ProtocolMarshaller protocolMarshaller) {

        if (artwork == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(artwork.getInputKey(), INPUTKEY_BINDING);
            protocolMarshaller.marshall(artwork.getMaxWidth(), MAXWIDTH_BINDING);
            protocolMarshaller.marshall(artwork.getMaxHeight(), MAXHEIGHT_BINDING);
            protocolMarshaller.marshall(artwork.getSizingPolicy(), SIZINGPOLICY_BINDING);
            protocolMarshaller.marshall(artwork.getPaddingPolicy(), PADDINGPOLICY_BINDING);
            protocolMarshaller.marshall(artwork.getAlbumArtFormat(), ALBUMARTFORMAT_BINDING);
            protocolMarshaller.marshall(artwork.getEncryption(), ENCRYPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

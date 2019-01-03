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
 * EmbeddedSourceSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EmbeddedSourceSettingsMarshaller {

    private static final MarshallingInfo<String> CONVERT608TO708_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("convert608To708").build();
    private static final MarshallingInfo<Integer> SOURCE608CHANNELNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source608ChannelNumber").build();
    private static final MarshallingInfo<Integer> SOURCE608TRACKNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("source608TrackNumber").build();

    private static final EmbeddedSourceSettingsMarshaller instance = new EmbeddedSourceSettingsMarshaller();

    public static EmbeddedSourceSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EmbeddedSourceSettings embeddedSourceSettings, ProtocolMarshaller protocolMarshaller) {

        if (embeddedSourceSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(embeddedSourceSettings.getConvert608To708(), CONVERT608TO708_BINDING);
            protocolMarshaller.marshall(embeddedSourceSettings.getSource608ChannelNumber(), SOURCE608CHANNELNUMBER_BINDING);
            protocolMarshaller.marshall(embeddedSourceSettings.getSource608TrackNumber(), SOURCE608TRACKNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

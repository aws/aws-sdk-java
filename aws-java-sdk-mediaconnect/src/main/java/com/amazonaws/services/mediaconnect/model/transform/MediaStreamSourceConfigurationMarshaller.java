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
package com.amazonaws.services.mediaconnect.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MediaStreamSourceConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MediaStreamSourceConfigurationMarshaller {

    private static final MarshallingInfo<String> ENCODINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encodingName").build();
    private static final MarshallingInfo<List> INPUTCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputConfigurations").build();
    private static final MarshallingInfo<String> MEDIASTREAMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mediaStreamName").build();

    private static final MediaStreamSourceConfigurationMarshaller instance = new MediaStreamSourceConfigurationMarshaller();

    public static MediaStreamSourceConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MediaStreamSourceConfiguration mediaStreamSourceConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (mediaStreamSourceConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mediaStreamSourceConfiguration.getEncodingName(), ENCODINGNAME_BINDING);
            protocolMarshaller.marshall(mediaStreamSourceConfiguration.getInputConfigurations(), INPUTCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(mediaStreamSourceConfiguration.getMediaStreamName(), MEDIASTREAMNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

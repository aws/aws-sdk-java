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
 * JobInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobInputMarshaller {

    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Key").build();
    private static final MarshallingInfo<String> FRAMERATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FrameRate").build();
    private static final MarshallingInfo<String> RESOLUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resolution").build();
    private static final MarshallingInfo<String> ASPECTRATIO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AspectRatio").build();
    private static final MarshallingInfo<String> INTERLACED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Interlaced").build();
    private static final MarshallingInfo<String> CONTAINER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Container").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encryption").build();
    private static final MarshallingInfo<StructuredPojo> TIMESPAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeSpan").build();
    private static final MarshallingInfo<StructuredPojo> INPUTCAPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputCaptions").build();
    private static final MarshallingInfo<StructuredPojo> DETECTEDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DetectedProperties").build();

    private static final JobInputMarshaller instance = new JobInputMarshaller();

    public static JobInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobInput jobInput, ProtocolMarshaller protocolMarshaller) {

        if (jobInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobInput.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(jobInput.getFrameRate(), FRAMERATE_BINDING);
            protocolMarshaller.marshall(jobInput.getResolution(), RESOLUTION_BINDING);
            protocolMarshaller.marshall(jobInput.getAspectRatio(), ASPECTRATIO_BINDING);
            protocolMarshaller.marshall(jobInput.getInterlaced(), INTERLACED_BINDING);
            protocolMarshaller.marshall(jobInput.getContainer(), CONTAINER_BINDING);
            protocolMarshaller.marshall(jobInput.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(jobInput.getTimeSpan(), TIMESPAN_BINDING);
            protocolMarshaller.marshall(jobInput.getInputCaptions(), INPUTCAPTIONS_BINDING);
            protocolMarshaller.marshall(jobInput.getDetectedProperties(), DETECTEDPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

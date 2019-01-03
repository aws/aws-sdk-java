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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputMarshaller {

    private static final MarshallingInfo<String> NAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NamePrefix").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputProcessingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMSINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamsInput").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseInput").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPARALLELISM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputParallelism").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputSchema").build();

    private static final InputMarshaller instance = new InputMarshaller();

    public static InputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Input input, ProtocolMarshaller protocolMarshaller) {

        if (input == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(input.getNamePrefix(), NAMEPREFIX_BINDING);
            protocolMarshaller.marshall(input.getInputProcessingConfiguration(), INPUTPROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(input.getKinesisStreamsInput(), KINESISSTREAMSINPUT_BINDING);
            protocolMarshaller.marshall(input.getKinesisFirehoseInput(), KINESISFIREHOSEINPUT_BINDING);
            protocolMarshaller.marshall(input.getInputParallelism(), INPUTPARALLELISM_BINDING);
            protocolMarshaller.marshall(input.getInputSchema(), INPUTSCHEMA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

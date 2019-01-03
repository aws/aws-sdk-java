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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputDescriptionMarshaller {

    private static final MarshallingInfo<String> INPUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputId").build();
    private static final MarshallingInfo<String> NAMEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NamePrefix").build();
    private static final MarshallingInfo<List> INAPPSTREAMNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InAppStreamNames").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPROCESSINGCONFIGURATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputProcessingConfigurationDescription").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMSINPUTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamsInputDescription").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEINPUTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseInputDescription").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputSchema").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPARALLELISM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputParallelism").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSTARTINGPOSITIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputStartingPositionConfiguration").build();

    private static final InputDescriptionMarshaller instance = new InputDescriptionMarshaller();

    public static InputDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputDescription inputDescription, ProtocolMarshaller protocolMarshaller) {

        if (inputDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputDescription.getInputId(), INPUTID_BINDING);
            protocolMarshaller.marshall(inputDescription.getNamePrefix(), NAMEPREFIX_BINDING);
            protocolMarshaller.marshall(inputDescription.getInAppStreamNames(), INAPPSTREAMNAMES_BINDING);
            protocolMarshaller.marshall(inputDescription.getInputProcessingConfigurationDescription(), INPUTPROCESSINGCONFIGURATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(inputDescription.getKinesisStreamsInputDescription(), KINESISSTREAMSINPUTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(inputDescription.getKinesisFirehoseInputDescription(), KINESISFIREHOSEINPUTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(inputDescription.getInputSchema(), INPUTSCHEMA_BINDING);
            protocolMarshaller.marshall(inputDescription.getInputParallelism(), INPUTPARALLELISM_BINDING);
            protocolMarshaller.marshall(inputDescription.getInputStartingPositionConfiguration(), INPUTSTARTINGPOSITIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

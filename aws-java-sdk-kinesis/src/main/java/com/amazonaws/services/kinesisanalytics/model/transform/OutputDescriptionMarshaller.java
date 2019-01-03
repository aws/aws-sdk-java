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
 * OutputDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OutputDescriptionMarshaller {

    private static final MarshallingInfo<String> OUTPUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMSOUTPUTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamsOutputDescription").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEOUTPUTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseOutputDescription").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAOUTPUTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaOutputDescription").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationSchema").build();

    private static final OutputDescriptionMarshaller instance = new OutputDescriptionMarshaller();

    public static OutputDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OutputDescription outputDescription, ProtocolMarshaller protocolMarshaller) {

        if (outputDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(outputDescription.getOutputId(), OUTPUTID_BINDING);
            protocolMarshaller.marshall(outputDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(outputDescription.getKinesisStreamsOutputDescription(), KINESISSTREAMSOUTPUTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(outputDescription.getKinesisFirehoseOutputDescription(), KINESISFIREHOSEOUTPUTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(outputDescription.getLambdaOutputDescription(), LAMBDAOUTPUTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(outputDescription.getDestinationSchema(), DESTINATIONSCHEMA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

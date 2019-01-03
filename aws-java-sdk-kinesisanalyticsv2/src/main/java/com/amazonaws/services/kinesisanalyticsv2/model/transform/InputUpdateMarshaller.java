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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalyticsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputUpdateMarshaller {

    private static final MarshallingInfo<String> INPUTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputId").build();
    private static final MarshallingInfo<String> NAMEPREFIXUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NamePrefixUpdate").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPROCESSINGCONFIGURATIONUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputProcessingConfigurationUpdate").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSTREAMSINPUTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisStreamsInputUpdate").build();
    private static final MarshallingInfo<StructuredPojo> KINESISFIREHOSEINPUTUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisFirehoseInputUpdate").build();
    private static final MarshallingInfo<StructuredPojo> INPUTSCHEMAUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputSchemaUpdate").build();
    private static final MarshallingInfo<StructuredPojo> INPUTPARALLELISMUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputParallelismUpdate").build();

    private static final InputUpdateMarshaller instance = new InputUpdateMarshaller();

    public static InputUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputUpdate inputUpdate, ProtocolMarshaller protocolMarshaller) {

        if (inputUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputUpdate.getInputId(), INPUTID_BINDING);
            protocolMarshaller.marshall(inputUpdate.getNamePrefixUpdate(), NAMEPREFIXUPDATE_BINDING);
            protocolMarshaller.marshall(inputUpdate.getInputProcessingConfigurationUpdate(), INPUTPROCESSINGCONFIGURATIONUPDATE_BINDING);
            protocolMarshaller.marshall(inputUpdate.getKinesisStreamsInputUpdate(), KINESISSTREAMSINPUTUPDATE_BINDING);
            protocolMarshaller.marshall(inputUpdate.getKinesisFirehoseInputUpdate(), KINESISFIREHOSEINPUTUPDATE_BINDING);
            protocolMarshaller.marshall(inputUpdate.getInputSchemaUpdate(), INPUTSCHEMAUPDATE_BINDING);
            protocolMarshaller.marshall(inputUpdate.getInputParallelismUpdate(), INPUTPARALLELISMUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

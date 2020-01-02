/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutExternalModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutExternalModelRequestMarshaller {

    private static final MarshallingInfo<String> MODELENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelEndpoint").build();
    private static final MarshallingInfo<String> MODELSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelSource").build();
    private static final MarshallingInfo<StructuredPojo> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("role").build();
    private static final MarshallingInfo<StructuredPojo> INPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputConfiguration").build();
    private static final MarshallingInfo<String> MODELENDPOINTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelEndpointStatus").build();

    private static final PutExternalModelRequestMarshaller instance = new PutExternalModelRequestMarshaller();

    public static PutExternalModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutExternalModelRequest putExternalModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (putExternalModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putExternalModelRequest.getModelEndpoint(), MODELENDPOINT_BINDING);
            protocolMarshaller.marshall(putExternalModelRequest.getModelSource(), MODELSOURCE_BINDING);
            protocolMarshaller.marshall(putExternalModelRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(putExternalModelRequest.getInputConfiguration(), INPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(putExternalModelRequest.getOutputConfiguration(), OUTPUTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(putExternalModelRequest.getModelEndpointStatus(), MODELENDPOINTSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

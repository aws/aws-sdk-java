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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RegisterJobDefinitionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RegisterJobDefinitionRequestMarshaller {

    private static final MarshallingInfo<String> JOBDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDefinitionName").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINERPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerProperties").build();
    private static final MarshallingInfo<StructuredPojo> NODEPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodeProperties").build();
    private static final MarshallingInfo<StructuredPojo> RETRYSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("retryStrategy").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeout").build();

    private static final RegisterJobDefinitionRequestMarshaller instance = new RegisterJobDefinitionRequestMarshaller();

    public static RegisterJobDefinitionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RegisterJobDefinitionRequest registerJobDefinitionRequest, ProtocolMarshaller protocolMarshaller) {

        if (registerJobDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(registerJobDefinitionRequest.getJobDefinitionName(), JOBDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(registerJobDefinitionRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(registerJobDefinitionRequest.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(registerJobDefinitionRequest.getContainerProperties(), CONTAINERPROPERTIES_BINDING);
            protocolMarshaller.marshall(registerJobDefinitionRequest.getNodeProperties(), NODEPROPERTIES_BINDING);
            protocolMarshaller.marshall(registerJobDefinitionRequest.getRetryStrategy(), RETRYSTRATEGY_BINDING);
            protocolMarshaller.marshall(registerJobDefinitionRequest.getTimeout(), TIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

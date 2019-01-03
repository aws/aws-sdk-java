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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EventSourceMappingConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EventSourceMappingConfigurationMarshaller {

    private static final MarshallingInfo<String> UUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UUID").build();
    private static final MarshallingInfo<Integer> BATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BatchSize").build();
    private static final MarshallingInfo<String> EVENTSOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventSourceArn").build();
    private static final MarshallingInfo<String> FUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionArn").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModified").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTPROCESSINGRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastProcessingResult").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> STATETRANSITIONREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateTransitionReason").build();

    private static final EventSourceMappingConfigurationMarshaller instance = new EventSourceMappingConfigurationMarshaller();

    public static EventSourceMappingConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EventSourceMappingConfiguration eventSourceMappingConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (eventSourceMappingConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getUUID(), UUID_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getBatchSize(), BATCHSIZE_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getEventSourceArn(), EVENTSOURCEARN_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getFunctionArn(), FUNCTIONARN_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getLastProcessingResult(), LASTPROCESSINGRESULT_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getState(), STATE_BINDING);
            protocolMarshaller.marshall(eventSourceMappingConfiguration.getStateTransitionReason(), STATETRANSITIONREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

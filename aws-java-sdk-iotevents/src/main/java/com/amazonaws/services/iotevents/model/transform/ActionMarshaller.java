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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionMarshaller {

    private static final MarshallingInfo<StructuredPojo> SETVARIABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("setVariable").build();
    private static final MarshallingInfo<StructuredPojo> SNS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sns").build();
    private static final MarshallingInfo<StructuredPojo> IOTTOPICPUBLISH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotTopicPublish").build();
    private static final MarshallingInfo<StructuredPojo> SETTIMER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("setTimer").build();
    private static final MarshallingInfo<StructuredPojo> CLEARTIMER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clearTimer").build();
    private static final MarshallingInfo<StructuredPojo> RESETTIMER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resetTimer").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambda").build();
    private static final MarshallingInfo<StructuredPojo> IOTEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotEvents").build();
    private static final MarshallingInfo<StructuredPojo> SQS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sqs").build();
    private static final MarshallingInfo<StructuredPojo> FIREHOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firehose").build();

    private static final ActionMarshaller instance = new ActionMarshaller();

    public static ActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Action action, ProtocolMarshaller protocolMarshaller) {

        if (action == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(action.getSetVariable(), SETVARIABLE_BINDING);
            protocolMarshaller.marshall(action.getSns(), SNS_BINDING);
            protocolMarshaller.marshall(action.getIotTopicPublish(), IOTTOPICPUBLISH_BINDING);
            protocolMarshaller.marshall(action.getSetTimer(), SETTIMER_BINDING);
            protocolMarshaller.marshall(action.getClearTimer(), CLEARTIMER_BINDING);
            protocolMarshaller.marshall(action.getResetTimer(), RESETTIMER_BINDING);
            protocolMarshaller.marshall(action.getLambda(), LAMBDA_BINDING);
            protocolMarshaller.marshall(action.getIotEvents(), IOTEVENTS_BINDING);
            protocolMarshaller.marshall(action.getSqs(), SQS_BINDING);
            protocolMarshaller.marshall(action.getFirehose(), FIREHOSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

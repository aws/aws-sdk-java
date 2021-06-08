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
package com.amazonaws.services.iotevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlarmActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlarmActionMarshaller {

    private static final MarshallingInfo<StructuredPojo> SNS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sns").build();
    private static final MarshallingInfo<StructuredPojo> IOTTOPICPUBLISH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotTopicPublish").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambda").build();
    private static final MarshallingInfo<StructuredPojo> IOTEVENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotEvents").build();
    private static final MarshallingInfo<StructuredPojo> SQS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sqs").build();
    private static final MarshallingInfo<StructuredPojo> FIREHOSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firehose").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODB_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamoDB").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODBV2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamoDBv2").build();
    private static final MarshallingInfo<StructuredPojo> IOTSITEWISE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("iotSiteWise").build();

    private static final AlarmActionMarshaller instance = new AlarmActionMarshaller();

    public static AlarmActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlarmAction alarmAction, ProtocolMarshaller protocolMarshaller) {

        if (alarmAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alarmAction.getSns(), SNS_BINDING);
            protocolMarshaller.marshall(alarmAction.getIotTopicPublish(), IOTTOPICPUBLISH_BINDING);
            protocolMarshaller.marshall(alarmAction.getLambda(), LAMBDA_BINDING);
            protocolMarshaller.marshall(alarmAction.getIotEvents(), IOTEVENTS_BINDING);
            protocolMarshaller.marshall(alarmAction.getSqs(), SQS_BINDING);
            protocolMarshaller.marshall(alarmAction.getFirehose(), FIREHOSE_BINDING);
            protocolMarshaller.marshall(alarmAction.getDynamoDB(), DYNAMODB_BINDING);
            protocolMarshaller.marshall(alarmAction.getDynamoDBv2(), DYNAMODBV2_BINDING);
            protocolMarshaller.marshall(alarmAction.getIotSiteWise(), IOTSITEWISE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

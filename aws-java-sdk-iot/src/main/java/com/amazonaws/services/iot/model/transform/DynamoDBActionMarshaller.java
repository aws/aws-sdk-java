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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DynamoDBActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DynamoDBActionMarshaller {

    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tableName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<String> OPERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("operation").build();
    private static final MarshallingInfo<String> HASHKEYFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hashKeyField").build();
    private static final MarshallingInfo<String> HASHKEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hashKeyValue").build();
    private static final MarshallingInfo<String> HASHKEYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hashKeyType").build();
    private static final MarshallingInfo<String> RANGEKEYFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rangeKeyField").build();
    private static final MarshallingInfo<String> RANGEKEYVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rangeKeyValue").build();
    private static final MarshallingInfo<String> RANGEKEYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rangeKeyType").build();
    private static final MarshallingInfo<String> PAYLOADFIELD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("payloadField").build();

    private static final DynamoDBActionMarshaller instance = new DynamoDBActionMarshaller();

    public static DynamoDBActionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DynamoDBAction dynamoDBAction, ProtocolMarshaller protocolMarshaller) {

        if (dynamoDBAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dynamoDBAction.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getOperation(), OPERATION_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getHashKeyField(), HASHKEYFIELD_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getHashKeyValue(), HASHKEYVALUE_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getHashKeyType(), HASHKEYTYPE_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getRangeKeyField(), RANGEKEYFIELD_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getRangeKeyValue(), RANGEKEYVALUE_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getRangeKeyType(), RANGEKEYTYPE_BINDING);
            protocolMarshaller.marshall(dynamoDBAction.getPayloadField(), PAYLOADFIELD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

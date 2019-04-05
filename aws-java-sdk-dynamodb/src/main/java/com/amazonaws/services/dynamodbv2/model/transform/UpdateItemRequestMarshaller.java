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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateItemRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateItemRequestMarshaller {

    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<Map> KEY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Key").build();
    private static final MarshallingInfo<Map> ATTRIBUTEUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeUpdates").build();
    private static final MarshallingInfo<Map> EXPECTED_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Expected").build();
    private static final MarshallingInfo<String> CONDITIONALOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConditionalOperator").build();
    private static final MarshallingInfo<String> RETURNVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnValues").build();
    private static final MarshallingInfo<String> RETURNCONSUMEDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnConsumedCapacity").build();
    private static final MarshallingInfo<String> RETURNITEMCOLLECTIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnItemCollectionMetrics").build();
    private static final MarshallingInfo<String> UPDATEEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UpdateExpression").build();
    private static final MarshallingInfo<String> CONDITIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConditionExpression").build();
    private static final MarshallingInfo<Map> EXPRESSIONATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionAttributeNames").build();
    private static final MarshallingInfo<Map> EXPRESSIONATTRIBUTEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionAttributeValues").build();

    private static final UpdateItemRequestMarshaller instance = new UpdateItemRequestMarshaller();

    public static UpdateItemRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateItemRequest updateItemRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateItemRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getAttributeUpdates(), ATTRIBUTEUPDATES_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getExpected(), EXPECTED_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getConditionalOperator(), CONDITIONALOPERATOR_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getReturnValues(), RETURNVALUES_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getReturnConsumedCapacity(), RETURNCONSUMEDCAPACITY_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getReturnItemCollectionMetrics(), RETURNITEMCOLLECTIONMETRICS_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getUpdateExpression(), UPDATEEXPRESSION_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getConditionExpression(), CONDITIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getExpressionAttributeNames(), EXPRESSIONATTRIBUTENAMES_BINDING);
            protocolMarshaller.marshall(updateItemRequest.getExpressionAttributeValues(), EXPRESSIONATTRIBUTEVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

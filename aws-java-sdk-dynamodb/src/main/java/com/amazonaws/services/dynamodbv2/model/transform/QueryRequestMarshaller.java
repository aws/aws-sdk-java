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
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryRequestMarshaller {

    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<String> SELECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Select").build();
    private static final MarshallingInfo<List> ATTRIBUTESTOGET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributesToGet").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Limit").build();
    private static final MarshallingInfo<Boolean> CONSISTENTREAD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsistentRead").build();
    private static final MarshallingInfo<Map> KEYCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyConditions").build();
    private static final MarshallingInfo<Map> QUERYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("QueryFilter").build();
    private static final MarshallingInfo<String> CONDITIONALOPERATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConditionalOperator").build();
    private static final MarshallingInfo<Boolean> SCANINDEXFORWARD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScanIndexForward").build();
    private static final MarshallingInfo<Map> EXCLUSIVESTARTKEY_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusiveStartKey").build();
    private static final MarshallingInfo<String> RETURNCONSUMEDCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReturnConsumedCapacity").build();
    private static final MarshallingInfo<String> PROJECTIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProjectionExpression").build();
    private static final MarshallingInfo<String> FILTEREXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterExpression").build();
    private static final MarshallingInfo<String> KEYCONDITIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyConditionExpression").build();
    private static final MarshallingInfo<Map> EXPRESSIONATTRIBUTENAMES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionAttributeNames").build();
    private static final MarshallingInfo<Map> EXPRESSIONATTRIBUTEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExpressionAttributeValues").build();

    private static final QueryRequestMarshaller instance = new QueryRequestMarshaller();

    public static QueryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryRequest queryRequest, ProtocolMarshaller protocolMarshaller) {

        if (queryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryRequest.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(queryRequest.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(queryRequest.getSelect(), SELECT_BINDING);
            protocolMarshaller.marshall(queryRequest.getAttributesToGet(), ATTRIBUTESTOGET_BINDING);
            protocolMarshaller.marshall(queryRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(queryRequest.getConsistentRead(), CONSISTENTREAD_BINDING);
            protocolMarshaller.marshall(queryRequest.getKeyConditions(), KEYCONDITIONS_BINDING);
            protocolMarshaller.marshall(queryRequest.getQueryFilter(), QUERYFILTER_BINDING);
            protocolMarshaller.marshall(queryRequest.getConditionalOperator(), CONDITIONALOPERATOR_BINDING);
            protocolMarshaller.marshall(queryRequest.getScanIndexForward(), SCANINDEXFORWARD_BINDING);
            protocolMarshaller.marshall(queryRequest.getExclusiveStartKey(), EXCLUSIVESTARTKEY_BINDING);
            protocolMarshaller.marshall(queryRequest.getReturnConsumedCapacity(), RETURNCONSUMEDCAPACITY_BINDING);
            protocolMarshaller.marshall(queryRequest.getProjectionExpression(), PROJECTIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(queryRequest.getFilterExpression(), FILTEREXPRESSION_BINDING);
            protocolMarshaller.marshall(queryRequest.getKeyConditionExpression(), KEYCONDITIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(queryRequest.getExpressionAttributeNames(), EXPRESSIONATTRIBUTENAMES_BINDING);
            protocolMarshaller.marshall(queryRequest.getExpressionAttributeValues(), EXPRESSIONATTRIBUTEVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

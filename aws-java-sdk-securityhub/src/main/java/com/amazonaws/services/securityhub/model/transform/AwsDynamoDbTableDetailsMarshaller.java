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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsDynamoDbTableDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDynamoDbTableDetailsMarshaller {

    private static final MarshallingInfo<List> ATTRIBUTEDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AttributeDefinitions").build();
    private static final MarshallingInfo<StructuredPojo> BILLINGMODESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillingModeSummary").build();
    private static final MarshallingInfo<String> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDateTime").build();
    private static final MarshallingInfo<List> GLOBALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalSecondaryIndexes").build();
    private static final MarshallingInfo<String> GLOBALTABLEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalTableVersion").build();
    private static final MarshallingInfo<Integer> ITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemCount").build();
    private static final MarshallingInfo<List> KEYSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeySchema").build();
    private static final MarshallingInfo<String> LATESTSTREAMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestStreamArn").build();
    private static final MarshallingInfo<String> LATESTSTREAMLABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestStreamLabel").build();
    private static final MarshallingInfo<List> LOCALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalSecondaryIndexes").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDTHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedThroughput").build();
    private static final MarshallingInfo<List> REPLICAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Replicas").build();
    private static final MarshallingInfo<StructuredPojo> RESTORESUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreSummary").build();
    private static final MarshallingInfo<StructuredPojo> SSEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SseDescription").build();
    private static final MarshallingInfo<StructuredPojo> STREAMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StreamSpecification").build();
    private static final MarshallingInfo<String> TABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableId").build();
    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<Long> TABLESIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableSizeBytes").build();
    private static final MarshallingInfo<String> TABLESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableStatus").build();

    private static final AwsDynamoDbTableDetailsMarshaller instance = new AwsDynamoDbTableDetailsMarshaller();

    public static AwsDynamoDbTableDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDynamoDbTableDetails awsDynamoDbTableDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsDynamoDbTableDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getAttributeDefinitions(), ATTRIBUTEDEFINITIONS_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getBillingModeSummary(), BILLINGMODESUMMARY_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getGlobalSecondaryIndexes(), GLOBALSECONDARYINDEXES_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getGlobalTableVersion(), GLOBALTABLEVERSION_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getItemCount(), ITEMCOUNT_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getKeySchema(), KEYSCHEMA_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getLatestStreamArn(), LATESTSTREAMARN_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getLatestStreamLabel(), LATESTSTREAMLABEL_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getLocalSecondaryIndexes(), LOCALSECONDARYINDEXES_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getProvisionedThroughput(), PROVISIONEDTHROUGHPUT_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getReplicas(), REPLICAS_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getRestoreSummary(), RESTORESUMMARY_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getSseDescription(), SSEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getStreamSpecification(), STREAMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getTableId(), TABLEID_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getTableSizeBytes(), TABLESIZEBYTES_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableDetails.getTableStatus(), TABLESTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * AwsDynamoDbTableGlobalSecondaryIndexMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsDynamoDbTableGlobalSecondaryIndexMarshaller {

    private static final MarshallingInfo<Boolean> BACKFILLING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Backfilling").build();
    private static final MarshallingInfo<String> INDEXARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexArn").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<Long> INDEXSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexSizeBytes").build();
    private static final MarshallingInfo<String> INDEXSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexStatus").build();
    private static final MarshallingInfo<Integer> ITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ItemCount").build();
    private static final MarshallingInfo<List> KEYSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeySchema").build();
    private static final MarshallingInfo<StructuredPojo> PROJECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Projection").build();
    private static final MarshallingInfo<StructuredPojo> PROVISIONEDTHROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedThroughput").build();

    private static final AwsDynamoDbTableGlobalSecondaryIndexMarshaller instance = new AwsDynamoDbTableGlobalSecondaryIndexMarshaller();

    public static AwsDynamoDbTableGlobalSecondaryIndexMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsDynamoDbTableGlobalSecondaryIndex awsDynamoDbTableGlobalSecondaryIndex, ProtocolMarshaller protocolMarshaller) {

        if (awsDynamoDbTableGlobalSecondaryIndex == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getBackfilling(), BACKFILLING_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getIndexArn(), INDEXARN_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getIndexSizeBytes(), INDEXSIZEBYTES_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getIndexStatus(), INDEXSTATUS_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getItemCount(), ITEMCOUNT_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getKeySchema(), KEYSCHEMA_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getProjection(), PROJECTION_BINDING);
            protocolMarshaller.marshall(awsDynamoDbTableGlobalSecondaryIndex.getProvisionedThroughput(), PROVISIONEDTHROUGHPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * ConsumedCapacityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConsumedCapacityMarshaller {

    private static final MarshallingInfo<String> TABLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableName").build();
    private static final MarshallingInfo<Double> CAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityUnits").build();
    private static final MarshallingInfo<Double> READCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadCapacityUnits").build();
    private static final MarshallingInfo<Double> WRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteCapacityUnits").build();
    private static final MarshallingInfo<StructuredPojo> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Table").build();
    private static final MarshallingInfo<Map> LOCALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LocalSecondaryIndexes").build();
    private static final MarshallingInfo<Map> GLOBALSECONDARYINDEXES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlobalSecondaryIndexes").build();

    private static final ConsumedCapacityMarshaller instance = new ConsumedCapacityMarshaller();

    public static ConsumedCapacityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConsumedCapacity consumedCapacity, ProtocolMarshaller protocolMarshaller) {

        if (consumedCapacity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(consumedCapacity.getTableName(), TABLENAME_BINDING);
            protocolMarshaller.marshall(consumedCapacity.getCapacityUnits(), CAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(consumedCapacity.getReadCapacityUnits(), READCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(consumedCapacity.getWriteCapacityUnits(), WRITECAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(consumedCapacity.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(consumedCapacity.getLocalSecondaryIndexes(), LOCALSECONDARYINDEXES_BINDING);
            protocolMarshaller.marshall(consumedCapacity.getGlobalSecondaryIndexes(), GLOBALSECONDARYINDEXES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

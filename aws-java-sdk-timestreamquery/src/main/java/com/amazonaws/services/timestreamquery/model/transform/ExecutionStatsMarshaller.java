/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.timestreamquery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecutionStatsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecutionStatsMarshaller {

    private static final MarshallingInfo<Long> EXECUTIONTIMEINMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionTimeInMillis").build();
    private static final MarshallingInfo<Long> DATAWRITES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DataWrites").build();
    private static final MarshallingInfo<Long> BYTESMETERED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BytesMetered").build();
    private static final MarshallingInfo<Long> RECORDSINGESTED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordsIngested").build();
    private static final MarshallingInfo<Long> QUERYRESULTROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryResultRows").build();

    private static final ExecutionStatsMarshaller instance = new ExecutionStatsMarshaller();

    public static ExecutionStatsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecutionStats executionStats, ProtocolMarshaller protocolMarshaller) {

        if (executionStats == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executionStats.getExecutionTimeInMillis(), EXECUTIONTIMEINMILLIS_BINDING);
            protocolMarshaller.marshall(executionStats.getDataWrites(), DATAWRITES_BINDING);
            protocolMarshaller.marshall(executionStats.getBytesMetered(), BYTESMETERED_BINDING);
            protocolMarshaller.marshall(executionStats.getRecordsIngested(), RECORDSINGESTED_BINDING);
            protocolMarshaller.marshall(executionStats.getQueryResultRows(), QUERYRESULTROWS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

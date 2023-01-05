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
package com.amazonaws.services.athena.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QueryStageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QueryStageMarshaller {

    private static final MarshallingInfo<Long> STAGEID_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageId").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<Long> OUTPUTBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputBytes").build();
    private static final MarshallingInfo<Long> OUTPUTROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OutputRows").build();
    private static final MarshallingInfo<Long> INPUTBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputBytes").build();
    private static final MarshallingInfo<Long> INPUTROWS_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputRows").build();
    private static final MarshallingInfo<Long> EXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExecutionTime").build();
    private static final MarshallingInfo<StructuredPojo> QUERYSTAGEPLAN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QueryStagePlan").build();
    private static final MarshallingInfo<List> SUBSTAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubStages").build();

    private static final QueryStageMarshaller instance = new QueryStageMarshaller();

    public static QueryStageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QueryStage queryStage, ProtocolMarshaller protocolMarshaller) {

        if (queryStage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(queryStage.getStageId(), STAGEID_BINDING);
            protocolMarshaller.marshall(queryStage.getState(), STATE_BINDING);
            protocolMarshaller.marshall(queryStage.getOutputBytes(), OUTPUTBYTES_BINDING);
            protocolMarshaller.marshall(queryStage.getOutputRows(), OUTPUTROWS_BINDING);
            protocolMarshaller.marshall(queryStage.getInputBytes(), INPUTBYTES_BINDING);
            protocolMarshaller.marshall(queryStage.getInputRows(), INPUTROWS_BINDING);
            protocolMarshaller.marshall(queryStage.getExecutionTime(), EXECUTIONTIME_BINDING);
            protocolMarshaller.marshall(queryStage.getQueryStagePlan(), QUERYSTAGEPLAN_BINDING);
            protocolMarshaller.marshall(queryStage.getSubStages(), SUBSTAGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

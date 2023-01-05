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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecutorsSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecutorsSummaryMarshaller {

    private static final MarshallingInfo<String> EXECUTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutorId").build();
    private static final MarshallingInfo<String> EXECUTORTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutorType").build();
    private static final MarshallingInfo<Long> STARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StartDateTime").build();
    private static final MarshallingInfo<Long> TERMINATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TerminationDateTime").build();
    private static final MarshallingInfo<String> EXECUTORSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutorState").build();
    private static final MarshallingInfo<Long> EXECUTORSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExecutorSize").build();

    private static final ExecutorsSummaryMarshaller instance = new ExecutorsSummaryMarshaller();

    public static ExecutorsSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecutorsSummary executorsSummary, ProtocolMarshaller protocolMarshaller) {

        if (executorsSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executorsSummary.getExecutorId(), EXECUTORID_BINDING);
            protocolMarshaller.marshall(executorsSummary.getExecutorType(), EXECUTORTYPE_BINDING);
            protocolMarshaller.marshall(executorsSummary.getStartDateTime(), STARTDATETIME_BINDING);
            protocolMarshaller.marshall(executorsSummary.getTerminationDateTime(), TERMINATIONDATETIME_BINDING);
            protocolMarshaller.marshall(executorsSummary.getExecutorState(), EXECUTORSTATE_BINDING);
            protocolMarshaller.marshall(executorsSummary.getExecutorSize(), EXECUTORSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

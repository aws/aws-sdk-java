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
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExecutionResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecutionResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> ERRORINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorInfo").build();
    private static final MarshallingInfo<Long> BYTESPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bytesProcessed").build();
    private static final MarshallingInfo<Long> BYTESWRITTEN_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bytesWritten").build();
    private static final MarshallingInfo<Long> RECORDSPROCESSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recordsProcessed").build();

    private static final ExecutionResultMarshaller instance = new ExecutionResultMarshaller();

    public static ExecutionResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecutionResult executionResult, ProtocolMarshaller protocolMarshaller) {

        if (executionResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executionResult.getErrorInfo(), ERRORINFO_BINDING);
            protocolMarshaller.marshall(executionResult.getBytesProcessed(), BYTESPROCESSED_BINDING);
            protocolMarshaller.marshall(executionResult.getBytesWritten(), BYTESWRITTEN_BINDING);
            protocolMarshaller.marshall(executionResult.getRecordsProcessed(), RECORDSPROCESSED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

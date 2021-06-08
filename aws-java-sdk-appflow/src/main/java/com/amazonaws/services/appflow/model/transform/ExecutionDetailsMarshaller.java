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
 * ExecutionDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExecutionDetailsMarshaller {

    private static final MarshallingInfo<String> MOSTRECENTEXECUTIONMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mostRecentExecutionMessage").build();
    private static final MarshallingInfo<java.util.Date> MOSTRECENTEXECUTIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mostRecentExecutionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MOSTRECENTEXECUTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mostRecentExecutionStatus").build();

    private static final ExecutionDetailsMarshaller instance = new ExecutionDetailsMarshaller();

    public static ExecutionDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExecutionDetails executionDetails, ProtocolMarshaller protocolMarshaller) {

        if (executionDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(executionDetails.getMostRecentExecutionMessage(), MOSTRECENTEXECUTIONMESSAGE_BINDING);
            protocolMarshaller.marshall(executionDetails.getMostRecentExecutionTime(), MOSTRECENTEXECUTIONTIME_BINDING);
            protocolMarshaller.marshall(executionDetails.getMostRecentExecutionStatus(), MOSTRECENTEXECUTIONSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

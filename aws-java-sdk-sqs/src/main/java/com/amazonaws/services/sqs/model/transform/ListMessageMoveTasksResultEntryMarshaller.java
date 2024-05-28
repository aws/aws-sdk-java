/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sqs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListMessageMoveTasksResultEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListMessageMoveTasksResultEntryMarshaller {

    private static final MarshallingInfo<String> TASKHANDLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TaskHandle").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceArn").build();
    private static final MarshallingInfo<String> DESTINATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationArn").build();
    private static final MarshallingInfo<Integer> MAXNUMBEROFMESSAGESPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxNumberOfMessagesPerSecond").build();
    private static final MarshallingInfo<Long> APPROXIMATENUMBEROFMESSAGESMOVED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApproximateNumberOfMessagesMoved").build();
    private static final MarshallingInfo<Long> APPROXIMATENUMBEROFMESSAGESTOMOVE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApproximateNumberOfMessagesToMove").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<Long> STARTEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedTimestamp").build();

    private static final ListMessageMoveTasksResultEntryMarshaller instance = new ListMessageMoveTasksResultEntryMarshaller();

    public static ListMessageMoveTasksResultEntryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListMessageMoveTasksResultEntry listMessageMoveTasksResultEntry, ProtocolMarshaller protocolMarshaller) {

        if (listMessageMoveTasksResultEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getTaskHandle(), TASKHANDLE_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getDestinationArn(), DESTINATIONARN_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getMaxNumberOfMessagesPerSecond(), MAXNUMBEROFMESSAGESPERSECOND_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getApproximateNumberOfMessagesMoved(), APPROXIMATENUMBEROFMESSAGESMOVED_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getApproximateNumberOfMessagesToMove(), APPROXIMATENUMBEROFMESSAGESTOMOVE_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(listMessageMoveTasksResultEntry.getStartedTimestamp(), STARTEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

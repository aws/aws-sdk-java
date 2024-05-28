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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatedSessionActionInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatedSessionActionInfoMarshaller {

    private static final MarshallingInfo<String> COMPLETEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completedStatus").build();
    private static final MarshallingInfo<java.util.Date> ENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Integer> PROCESSEXITCODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processExitCode").build();
    private static final MarshallingInfo<String> PROGRESSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progressMessage").build();
    private static final MarshallingInfo<Float> PROGRESSPERCENT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progressPercent").build();
    private static final MarshallingInfo<java.util.Date> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final UpdatedSessionActionInfoMarshaller instance = new UpdatedSessionActionInfoMarshaller();

    public static UpdatedSessionActionInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatedSessionActionInfo updatedSessionActionInfo, ProtocolMarshaller protocolMarshaller) {

        if (updatedSessionActionInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatedSessionActionInfo.getCompletedStatus(), COMPLETEDSTATUS_BINDING);
            protocolMarshaller.marshall(updatedSessionActionInfo.getEndedAt(), ENDEDAT_BINDING);
            protocolMarshaller.marshall(updatedSessionActionInfo.getProcessExitCode(), PROCESSEXITCODE_BINDING);
            protocolMarshaller.marshall(updatedSessionActionInfo.getProgressMessage(), PROGRESSMESSAGE_BINDING);
            protocolMarshaller.marshall(updatedSessionActionInfo.getProgressPercent(), PROGRESSPERCENT_BINDING);
            protocolMarshaller.marshall(updatedSessionActionInfo.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(updatedSessionActionInfo.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

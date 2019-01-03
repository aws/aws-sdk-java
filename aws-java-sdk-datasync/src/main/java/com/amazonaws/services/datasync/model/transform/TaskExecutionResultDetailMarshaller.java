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
package com.amazonaws.services.datasync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskExecutionResultDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskExecutionResultDetailMarshaller {

    private static final MarshallingInfo<Long> PREPAREDURATION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrepareDuration").build();
    private static final MarshallingInfo<String> PREPARESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrepareStatus").build();
    private static final MarshallingInfo<Long> TRANSFERDURATION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransferDuration").build();
    private static final MarshallingInfo<String> TRANSFERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransferStatus").build();
    private static final MarshallingInfo<Long> VERIFYDURATION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerifyDuration").build();
    private static final MarshallingInfo<String> VERIFYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerifyStatus").build();
    private static final MarshallingInfo<String> ERRORCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCode").build();
    private static final MarshallingInfo<String> ERRORDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorDetail").build();

    private static final TaskExecutionResultDetailMarshaller instance = new TaskExecutionResultDetailMarshaller();

    public static TaskExecutionResultDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskExecutionResultDetail taskExecutionResultDetail, ProtocolMarshaller protocolMarshaller) {

        if (taskExecutionResultDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskExecutionResultDetail.getPrepareDuration(), PREPAREDURATION_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getPrepareStatus(), PREPARESTATUS_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getTransferDuration(), TRANSFERDURATION_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getTransferStatus(), TRANSFERSTATUS_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getVerifyDuration(), VERIFYDURATION_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getVerifyStatus(), VERIFYSTATUS_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getErrorCode(), ERRORCODE_BINDING);
            protocolMarshaller.marshall(taskExecutionResultDetail.getErrorDetail(), ERRORDETAIL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

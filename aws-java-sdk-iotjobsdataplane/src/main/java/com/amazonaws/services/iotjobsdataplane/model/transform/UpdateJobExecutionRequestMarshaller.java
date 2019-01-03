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
package com.amazonaws.services.iotjobsdataplane.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotjobsdataplane.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateJobExecutionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateJobExecutionRequestMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> THINGNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("thingName").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> STATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("statusDetails").build();
    private static final MarshallingInfo<Long> STEPTIMEOUTINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stepTimeoutInMinutes").build();
    private static final MarshallingInfo<Long> EXPECTEDVERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedVersion").build();
    private static final MarshallingInfo<Boolean> INCLUDEJOBEXECUTIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeJobExecutionState").build();
    private static final MarshallingInfo<Boolean> INCLUDEJOBDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeJobDocument").build();
    private static final MarshallingInfo<Long> EXECUTIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionNumber").build();

    private static final UpdateJobExecutionRequestMarshaller instance = new UpdateJobExecutionRequestMarshaller();

    public static UpdateJobExecutionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateJobExecutionRequest updateJobExecutionRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateJobExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateJobExecutionRequest.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getThingName(), THINGNAME_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getStatusDetails(), STATUSDETAILS_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getStepTimeoutInMinutes(), STEPTIMEOUTINMINUTES_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getExpectedVersion(), EXPECTEDVERSION_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getIncludeJobExecutionState(), INCLUDEJOBEXECUTIONSTATE_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getIncludeJobDocument(), INCLUDEJOBDOCUMENT_BINDING);
            protocolMarshaller.marshall(updateJobExecutionRequest.getExecutionNumber(), EXECUTIONNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

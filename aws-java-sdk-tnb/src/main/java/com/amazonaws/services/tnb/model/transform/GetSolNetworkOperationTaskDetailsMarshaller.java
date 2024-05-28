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
package com.amazonaws.services.tnb.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.tnb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetSolNetworkOperationTaskDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetSolNetworkOperationTaskDetailsMarshaller {

    private static final MarshallingInfo<Map> TASKCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskContext").build();
    private static final MarshallingInfo<java.util.Date> TASKENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskEndTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> TASKERRORDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskErrorDetails").build();
    private static final MarshallingInfo<String> TASKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("taskName").build();
    private static final MarshallingInfo<java.util.Date> TASKSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStartTime").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> TASKSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskStatus").build();

    private static final GetSolNetworkOperationTaskDetailsMarshaller instance = new GetSolNetworkOperationTaskDetailsMarshaller();

    public static GetSolNetworkOperationTaskDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetSolNetworkOperationTaskDetails getSolNetworkOperationTaskDetails, ProtocolMarshaller protocolMarshaller) {

        if (getSolNetworkOperationTaskDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getSolNetworkOperationTaskDetails.getTaskContext(), TASKCONTEXT_BINDING);
            protocolMarshaller.marshall(getSolNetworkOperationTaskDetails.getTaskEndTime(), TASKENDTIME_BINDING);
            protocolMarshaller.marshall(getSolNetworkOperationTaskDetails.getTaskErrorDetails(), TASKERRORDETAILS_BINDING);
            protocolMarshaller.marshall(getSolNetworkOperationTaskDetails.getTaskName(), TASKNAME_BINDING);
            protocolMarshaller.marshall(getSolNetworkOperationTaskDetails.getTaskStartTime(), TASKSTARTTIME_BINDING);
            protocolMarshaller.marshall(getSolNetworkOperationTaskDetails.getTaskStatus(), TASKSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

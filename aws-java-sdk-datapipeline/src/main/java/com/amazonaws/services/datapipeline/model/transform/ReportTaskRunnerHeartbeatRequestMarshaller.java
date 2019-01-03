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
package com.amazonaws.services.datapipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datapipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportTaskRunnerHeartbeatRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportTaskRunnerHeartbeatRequestMarshaller {

    private static final MarshallingInfo<String> TASKRUNNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskrunnerId").build();
    private static final MarshallingInfo<String> WORKERGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workerGroup").build();
    private static final MarshallingInfo<String> HOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hostname").build();

    private static final ReportTaskRunnerHeartbeatRequestMarshaller instance = new ReportTaskRunnerHeartbeatRequestMarshaller();

    public static ReportTaskRunnerHeartbeatRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest, ProtocolMarshaller protocolMarshaller) {

        if (reportTaskRunnerHeartbeatRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportTaskRunnerHeartbeatRequest.getTaskrunnerId(), TASKRUNNERID_BINDING);
            protocolMarshaller.marshall(reportTaskRunnerHeartbeatRequest.getWorkerGroup(), WORKERGROUP_BINDING);
            protocolMarshaller.marshall(reportTaskRunnerHeartbeatRequest.getHostname(), HOSTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

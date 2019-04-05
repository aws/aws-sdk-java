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
package com.amazonaws.services.codepipeline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ActionExecutionDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionExecutionDetailMarshaller {

    private static final MarshallingInfo<String> PIPELINEEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineExecutionId").build();
    private static final MarshallingInfo<String> ACTIONEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionExecutionId").build();
    private static final MarshallingInfo<Integer> PIPELINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineVersion").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageName").build();
    private static final MarshallingInfo<String> ACTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actionName").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("input").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("output").build();

    private static final ActionExecutionDetailMarshaller instance = new ActionExecutionDetailMarshaller();

    public static ActionExecutionDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionExecutionDetail actionExecutionDetail, ProtocolMarshaller protocolMarshaller) {

        if (actionExecutionDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionExecutionDetail.getPipelineExecutionId(), PIPELINEEXECUTIONID_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getActionExecutionId(), ACTIONEXECUTIONID_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getPipelineVersion(), PIPELINEVERSION_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getActionName(), ACTIONNAME_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getLastUpdateTime(), LASTUPDATETIME_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(actionExecutionDetail.getOutput(), OUTPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

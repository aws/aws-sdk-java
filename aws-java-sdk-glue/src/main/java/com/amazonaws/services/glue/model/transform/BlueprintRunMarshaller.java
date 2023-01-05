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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BlueprintRunMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BlueprintRunMarshaller {

    private static final MarshallingInfo<String> BLUEPRINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlueprintName").build();
    private static final MarshallingInfo<String> RUNID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RunId").build();
    private static final MarshallingInfo<String> WORKFLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkflowName").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<java.util.Date> STARTEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> COMPLETEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompletedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<String> ROLLBACKERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RollbackErrorMessage").build();
    private static final MarshallingInfo<String> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Parameters").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();

    private static final BlueprintRunMarshaller instance = new BlueprintRunMarshaller();

    public static BlueprintRunMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BlueprintRun blueprintRun, ProtocolMarshaller protocolMarshaller) {

        if (blueprintRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(blueprintRun.getBlueprintName(), BLUEPRINTNAME_BINDING);
            protocolMarshaller.marshall(blueprintRun.getRunId(), RUNID_BINDING);
            protocolMarshaller.marshall(blueprintRun.getWorkflowName(), WORKFLOWNAME_BINDING);
            protocolMarshaller.marshall(blueprintRun.getState(), STATE_BINDING);
            protocolMarshaller.marshall(blueprintRun.getStartedOn(), STARTEDON_BINDING);
            protocolMarshaller.marshall(blueprintRun.getCompletedOn(), COMPLETEDON_BINDING);
            protocolMarshaller.marshall(blueprintRun.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(blueprintRun.getRollbackErrorMessage(), ROLLBACKERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(blueprintRun.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(blueprintRun.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

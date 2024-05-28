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
package com.amazonaws.services.dlm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dlm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScriptMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScriptMarshaller {

    private static final MarshallingInfo<List> STAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stages").build();
    private static final MarshallingInfo<String> EXECUTIONHANDLERSERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionHandlerService").build();
    private static final MarshallingInfo<String> EXECUTIONHANDLER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionHandler").build();
    private static final MarshallingInfo<Boolean> EXECUTEOPERATIONONSCRIPTFAILURE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecuteOperationOnScriptFailure").build();
    private static final MarshallingInfo<Integer> EXECUTIONTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionTimeout").build();
    private static final MarshallingInfo<Integer> MAXIMUMRETRYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumRetryCount").build();

    private static final ScriptMarshaller instance = new ScriptMarshaller();

    public static ScriptMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Script script, ProtocolMarshaller protocolMarshaller) {

        if (script == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(script.getStages(), STAGES_BINDING);
            protocolMarshaller.marshall(script.getExecutionHandlerService(), EXECUTIONHANDLERSERVICE_BINDING);
            protocolMarshaller.marshall(script.getExecutionHandler(), EXECUTIONHANDLER_BINDING);
            protocolMarshaller.marshall(script.getExecuteOperationOnScriptFailure(), EXECUTEOPERATIONONSCRIPTFAILURE_BINDING);
            protocolMarshaller.marshall(script.getExecutionTimeout(), EXECUTIONTIMEOUT_BINDING);
            protocolMarshaller.marshall(script.getMaximumRetryCount(), MAXIMUMRETRYCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

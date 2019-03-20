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
 * ActionExecutionResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionExecutionResultMarshaller {

    private static final MarshallingInfo<String> EXTERNALEXECUTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionId").build();
    private static final MarshallingInfo<String> EXTERNALEXECUTIONSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionSummary").build();
    private static final MarshallingInfo<String> EXTERNALEXECUTIONURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalExecutionUrl").build();

    private static final ActionExecutionResultMarshaller instance = new ActionExecutionResultMarshaller();

    public static ActionExecutionResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionExecutionResult actionExecutionResult, ProtocolMarshaller protocolMarshaller) {

        if (actionExecutionResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionExecutionResult.getExternalExecutionId(), EXTERNALEXECUTIONID_BINDING);
            protocolMarshaller.marshall(actionExecutionResult.getExternalExecutionSummary(), EXTERNALEXECUTIONSUMMARY_BINDING);
            protocolMarshaller.marshall(actionExecutionResult.getExternalExecutionUrl(), EXTERNALEXECUTIONURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

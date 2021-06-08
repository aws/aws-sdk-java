/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ActionTypeExecutorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ActionTypeExecutorMarshaller {

    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("configuration").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> POLICYSTATEMENTSTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyStatementsTemplate").build();
    private static final MarshallingInfo<Integer> JOBTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobTimeout").build();

    private static final ActionTypeExecutorMarshaller instance = new ActionTypeExecutorMarshaller();

    public static ActionTypeExecutorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ActionTypeExecutor actionTypeExecutor, ProtocolMarshaller protocolMarshaller) {

        if (actionTypeExecutor == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(actionTypeExecutor.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(actionTypeExecutor.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(actionTypeExecutor.getPolicyStatementsTemplate(), POLICYSTATEMENTSTEMPLATE_BINDING);
            protocolMarshaller.marshall(actionTypeExecutor.getJobTimeout(), JOBTIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

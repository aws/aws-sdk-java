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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AsyncInferenceNotificationConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AsyncInferenceNotificationConfigMarshaller {

    private static final MarshallingInfo<String> SUCCESSTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SuccessTopic").build();
    private static final MarshallingInfo<String> ERRORTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorTopic").build();

    private static final AsyncInferenceNotificationConfigMarshaller instance = new AsyncInferenceNotificationConfigMarshaller();

    public static AsyncInferenceNotificationConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AsyncInferenceNotificationConfig asyncInferenceNotificationConfig, ProtocolMarshaller protocolMarshaller) {

        if (asyncInferenceNotificationConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(asyncInferenceNotificationConfig.getSuccessTopic(), SUCCESSTOPIC_BINDING);
            protocolMarshaller.marshall(asyncInferenceNotificationConfig.getErrorTopic(), ERRORTOPIC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

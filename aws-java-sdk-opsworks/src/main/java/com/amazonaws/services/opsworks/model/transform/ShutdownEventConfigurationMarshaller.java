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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ShutdownEventConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ShutdownEventConfigurationMarshaller {

    private static final MarshallingInfo<Integer> EXECUTIONTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionTimeout").build();
    private static final MarshallingInfo<Boolean> DELAYUNTILELBCONNECTIONSDRAINED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DelayUntilElbConnectionsDrained").build();

    private static final ShutdownEventConfigurationMarshaller instance = new ShutdownEventConfigurationMarshaller();

    public static ShutdownEventConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ShutdownEventConfiguration shutdownEventConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (shutdownEventConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(shutdownEventConfiguration.getExecutionTimeout(), EXECUTIONTIMEOUT_BINDING);
            protocolMarshaller.marshall(shutdownEventConfiguration.getDelayUntilElbConnectionsDrained(), DELAYUNTILELBCONNECTIONSDRAINED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

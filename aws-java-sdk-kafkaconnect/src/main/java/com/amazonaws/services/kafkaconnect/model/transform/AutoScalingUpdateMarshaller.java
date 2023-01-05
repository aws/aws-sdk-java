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
package com.amazonaws.services.kafkaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kafkaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoScalingUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoScalingUpdateMarshaller {

    private static final MarshallingInfo<Integer> MAXWORKERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxWorkerCount").build();
    private static final MarshallingInfo<Integer> MCUCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mcuCount").build();
    private static final MarshallingInfo<Integer> MINWORKERCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("minWorkerCount").build();
    private static final MarshallingInfo<StructuredPojo> SCALEINPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scaleInPolicy").build();
    private static final MarshallingInfo<StructuredPojo> SCALEOUTPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scaleOutPolicy").build();

    private static final AutoScalingUpdateMarshaller instance = new AutoScalingUpdateMarshaller();

    public static AutoScalingUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoScalingUpdate autoScalingUpdate, ProtocolMarshaller protocolMarshaller) {

        if (autoScalingUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoScalingUpdate.getMaxWorkerCount(), MAXWORKERCOUNT_BINDING);
            protocolMarshaller.marshall(autoScalingUpdate.getMcuCount(), MCUCOUNT_BINDING);
            protocolMarshaller.marshall(autoScalingUpdate.getMinWorkerCount(), MINWORKERCOUNT_BINDING);
            protocolMarshaller.marshall(autoScalingUpdate.getScaleInPolicy(), SCALEINPOLICY_BINDING);
            protocolMarshaller.marshall(autoScalingUpdate.getScaleOutPolicy(), SCALEOUTPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

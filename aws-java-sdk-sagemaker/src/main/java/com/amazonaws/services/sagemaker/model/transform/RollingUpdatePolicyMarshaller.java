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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RollingUpdatePolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RollingUpdatePolicyMarshaller {

    private static final MarshallingInfo<StructuredPojo> MAXIMUMBATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumBatchSize").build();
    private static final MarshallingInfo<Integer> WAITINTERVALINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WaitIntervalInSeconds").build();
    private static final MarshallingInfo<Integer> MAXIMUMEXECUTIONTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaximumExecutionTimeoutInSeconds").build();
    private static final MarshallingInfo<StructuredPojo> ROLLBACKMAXIMUMBATCHSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RollbackMaximumBatchSize").build();

    private static final RollingUpdatePolicyMarshaller instance = new RollingUpdatePolicyMarshaller();

    public static RollingUpdatePolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RollingUpdatePolicy rollingUpdatePolicy, ProtocolMarshaller protocolMarshaller) {

        if (rollingUpdatePolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rollingUpdatePolicy.getMaximumBatchSize(), MAXIMUMBATCHSIZE_BINDING);
            protocolMarshaller.marshall(rollingUpdatePolicy.getWaitIntervalInSeconds(), WAITINTERVALINSECONDS_BINDING);
            protocolMarshaller.marshall(rollingUpdatePolicy.getMaximumExecutionTimeoutInSeconds(), MAXIMUMEXECUTIONTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(rollingUpdatePolicy.getRollbackMaximumBatchSize(), ROLLBACKMAXIMUMBATCHSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

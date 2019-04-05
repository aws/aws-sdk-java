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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SpotProvisioningSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SpotProvisioningSpecificationMarshaller {

    private static final MarshallingInfo<Integer> TIMEOUTDURATIONMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutDurationMinutes").build();
    private static final MarshallingInfo<String> TIMEOUTACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutAction").build();
    private static final MarshallingInfo<Integer> BLOCKDURATIONMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockDurationMinutes").build();

    private static final SpotProvisioningSpecificationMarshaller instance = new SpotProvisioningSpecificationMarshaller();

    public static SpotProvisioningSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SpotProvisioningSpecification spotProvisioningSpecification, ProtocolMarshaller protocolMarshaller) {

        if (spotProvisioningSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(spotProvisioningSpecification.getTimeoutDurationMinutes(), TIMEOUTDURATIONMINUTES_BINDING);
            protocolMarshaller.marshall(spotProvisioningSpecification.getTimeoutAction(), TIMEOUTACTION_BINDING);
            protocolMarshaller.marshall(spotProvisioningSpecification.getBlockDurationMinutes(), BLOCKDURATIONMINUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.storagegateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.storagegateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutomaticTapeCreationRuleMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutomaticTapeCreationRuleMarshaller {

    private static final MarshallingInfo<String> TAPEBARCODEPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeBarcodePrefix").build();
    private static final MarshallingInfo<String> POOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PoolId").build();
    private static final MarshallingInfo<Long> TAPESIZEINBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TapeSizeInBytes").build();
    private static final MarshallingInfo<Integer> MINIMUMNUMTAPES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimumNumTapes").build();
    private static final MarshallingInfo<Boolean> WORM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Worm").build();

    private static final AutomaticTapeCreationRuleMarshaller instance = new AutomaticTapeCreationRuleMarshaller();

    public static AutomaticTapeCreationRuleMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutomaticTapeCreationRule automaticTapeCreationRule, ProtocolMarshaller protocolMarshaller) {

        if (automaticTapeCreationRule == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(automaticTapeCreationRule.getTapeBarcodePrefix(), TAPEBARCODEPREFIX_BINDING);
            protocolMarshaller.marshall(automaticTapeCreationRule.getPoolId(), POOLID_BINDING);
            protocolMarshaller.marshall(automaticTapeCreationRule.getTapeSizeInBytes(), TAPESIZEINBYTES_BINDING);
            protocolMarshaller.marshall(automaticTapeCreationRule.getMinimumNumTapes(), MINIMUMNUMTAPES_BINDING);
            protocolMarshaller.marshall(automaticTapeCreationRule.getWorm(), WORM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

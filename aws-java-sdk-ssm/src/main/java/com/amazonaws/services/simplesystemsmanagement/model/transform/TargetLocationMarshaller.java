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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TargetLocationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TargetLocationMarshaller {

    private static final MarshallingInfo<List> ACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Accounts").build();
    private static final MarshallingInfo<List> REGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Regions").build();
    private static final MarshallingInfo<String> TARGETLOCATIONMAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLocationMaxConcurrency").build();
    private static final MarshallingInfo<String> TARGETLOCATIONMAXERRORS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLocationMaxErrors").build();
    private static final MarshallingInfo<String> EXECUTIONROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRoleName").build();

    private static final TargetLocationMarshaller instance = new TargetLocationMarshaller();

    public static TargetLocationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TargetLocation targetLocation, ProtocolMarshaller protocolMarshaller) {

        if (targetLocation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(targetLocation.getAccounts(), ACCOUNTS_BINDING);
            protocolMarshaller.marshall(targetLocation.getRegions(), REGIONS_BINDING);
            protocolMarshaller.marshall(targetLocation.getTargetLocationMaxConcurrency(), TARGETLOCATIONMAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(targetLocation.getTargetLocationMaxErrors(), TARGETLOCATIONMAXERRORS_BINDING);
            protocolMarshaller.marshall(targetLocation.getExecutionRoleName(), EXECUTIONROLENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

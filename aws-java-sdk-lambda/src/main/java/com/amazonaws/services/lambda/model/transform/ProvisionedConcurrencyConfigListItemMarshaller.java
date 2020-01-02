/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionedConcurrencyConfigListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionedConcurrencyConfigListItemMarshaller {

    private static final MarshallingInfo<String> FUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunctionArn").build();
    private static final MarshallingInfo<Integer> REQUESTEDPROVISIONEDCONCURRENTEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestedProvisionedConcurrentExecutions").build();
    private static final MarshallingInfo<Integer> AVAILABLEPROVISIONEDCONCURRENTEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailableProvisionedConcurrentExecutions").build();
    private static final MarshallingInfo<Integer> ALLOCATEDPROVISIONEDCONCURRENTEXECUTIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllocatedProvisionedConcurrentExecutions").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusReason").build();
    private static final MarshallingInfo<String> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModified").build();

    private static final ProvisionedConcurrencyConfigListItemMarshaller instance = new ProvisionedConcurrencyConfigListItemMarshaller();

    public static ProvisionedConcurrencyConfigListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionedConcurrencyConfigListItem provisionedConcurrencyConfigListItem, ProtocolMarshaller protocolMarshaller) {

        if (provisionedConcurrencyConfigListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getFunctionArn(), FUNCTIONARN_BINDING);
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getRequestedProvisionedConcurrentExecutions(),
                    REQUESTEDPROVISIONEDCONCURRENTEXECUTIONS_BINDING);
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getAvailableProvisionedConcurrentExecutions(),
                    AVAILABLEPROVISIONEDCONCURRENTEXECUTIONS_BINDING);
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getAllocatedProvisionedConcurrentExecutions(),
                    ALLOCATEDPROVISIONEDCONCURRENTEXECUTIONS_BINDING);
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(provisionedConcurrencyConfigListItem.getLastModified(), LASTMODIFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

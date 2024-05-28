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
package com.amazonaws.services.deadline.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.deadline.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DependencyCountsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DependencyCountsMarshaller {

    private static final MarshallingInfo<Integer> CONSUMERSRESOLVED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consumersResolved").build();
    private static final MarshallingInfo<Integer> CONSUMERSUNRESOLVED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("consumersUnresolved").build();
    private static final MarshallingInfo<Integer> DEPENDENCIESRESOLVED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dependenciesResolved").build();
    private static final MarshallingInfo<Integer> DEPENDENCIESUNRESOLVED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dependenciesUnresolved").build();

    private static final DependencyCountsMarshaller instance = new DependencyCountsMarshaller();

    public static DependencyCountsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DependencyCounts dependencyCounts, ProtocolMarshaller protocolMarshaller) {

        if (dependencyCounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dependencyCounts.getConsumersResolved(), CONSUMERSRESOLVED_BINDING);
            protocolMarshaller.marshall(dependencyCounts.getConsumersUnresolved(), CONSUMERSUNRESOLVED_BINDING);
            protocolMarshaller.marshall(dependencyCounts.getDependenciesResolved(), DEPENDENCIESRESOLVED_BINDING);
            protocolMarshaller.marshall(dependencyCounts.getDependenciesUnresolved(), DEPENDENCIESUNRESOLVED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

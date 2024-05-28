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
package com.amazonaws.services.ssmsap.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmsap.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResilienceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResilienceMarshaller {

    private static final MarshallingInfo<String> HSRTIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HsrTier").build();
    private static final MarshallingInfo<String> HSRREPLICATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HsrReplicationMode").build();
    private static final MarshallingInfo<String> HSROPERATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HsrOperationMode").build();
    private static final MarshallingInfo<String> CLUSTERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterStatus").build();
    private static final MarshallingInfo<Boolean> ENQUEUEREPLICATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnqueueReplication").build();

    private static final ResilienceMarshaller instance = new ResilienceMarshaller();

    public static ResilienceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Resilience resilience, ProtocolMarshaller protocolMarshaller) {

        if (resilience == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resilience.getHsrTier(), HSRTIER_BINDING);
            protocolMarshaller.marshall(resilience.getHsrReplicationMode(), HSRREPLICATIONMODE_BINDING);
            protocolMarshaller.marshall(resilience.getHsrOperationMode(), HSROPERATIONMODE_BINDING);
            protocolMarshaller.marshall(resilience.getClusterStatus(), CLUSTERSTATUS_BINDING);
            protocolMarshaller.marshall(resilience.getEnqueueReplication(), ENQUEUEREPLICATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

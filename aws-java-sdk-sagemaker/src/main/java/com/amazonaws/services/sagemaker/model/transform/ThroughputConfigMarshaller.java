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
 * ThroughputConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ThroughputConfigMarshaller {

    private static final MarshallingInfo<String> THROUGHPUTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ThroughputMode").build();
    private static final MarshallingInfo<Integer> PROVISIONEDREADCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedReadCapacityUnits").build();
    private static final MarshallingInfo<Integer> PROVISIONEDWRITECAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedWriteCapacityUnits").build();

    private static final ThroughputConfigMarshaller instance = new ThroughputConfigMarshaller();

    public static ThroughputConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ThroughputConfig throughputConfig, ProtocolMarshaller protocolMarshaller) {

        if (throughputConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(throughputConfig.getThroughputMode(), THROUGHPUTMODE_BINDING);
            protocolMarshaller.marshall(throughputConfig.getProvisionedReadCapacityUnits(), PROVISIONEDREADCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(throughputConfig.getProvisionedWriteCapacityUnits(), PROVISIONEDWRITECAPACITYUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

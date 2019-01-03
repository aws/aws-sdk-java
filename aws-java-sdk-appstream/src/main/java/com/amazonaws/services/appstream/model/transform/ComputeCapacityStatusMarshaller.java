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
package com.amazonaws.services.appstream.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appstream.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComputeCapacityStatusMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComputeCapacityStatusMarshaller {

    private static final MarshallingInfo<Integer> DESIRED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Desired").build();
    private static final MarshallingInfo<Integer> RUNNING_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Running").build();
    private static final MarshallingInfo<Integer> INUSE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InUse").build();
    private static final MarshallingInfo<Integer> AVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Available").build();

    private static final ComputeCapacityStatusMarshaller instance = new ComputeCapacityStatusMarshaller();

    public static ComputeCapacityStatusMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComputeCapacityStatus computeCapacityStatus, ProtocolMarshaller protocolMarshaller) {

        if (computeCapacityStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(computeCapacityStatus.getDesired(), DESIRED_BINDING);
            protocolMarshaller.marshall(computeCapacityStatus.getRunning(), RUNNING_BINDING);
            protocolMarshaller.marshall(computeCapacityStatus.getInUse(), INUSE_BINDING);
            protocolMarshaller.marshall(computeCapacityStatus.getAvailable(), AVAILABLE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EC2ResourceUtilizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EC2ResourceUtilizationMarshaller {

    private static final MarshallingInfo<String> MAXCPUUTILIZATIONPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCpuUtilizationPercentage").build();
    private static final MarshallingInfo<String> MAXMEMORYUTILIZATIONPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxMemoryUtilizationPercentage").build();
    private static final MarshallingInfo<String> MAXSTORAGEUTILIZATIONPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxStorageUtilizationPercentage").build();

    private static final EC2ResourceUtilizationMarshaller instance = new EC2ResourceUtilizationMarshaller();

    public static EC2ResourceUtilizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EC2ResourceUtilization eC2ResourceUtilization, ProtocolMarshaller protocolMarshaller) {

        if (eC2ResourceUtilization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eC2ResourceUtilization.getMaxCpuUtilizationPercentage(), MAXCPUUTILIZATIONPERCENTAGE_BINDING);
            protocolMarshaller.marshall(eC2ResourceUtilization.getMaxMemoryUtilizationPercentage(), MAXMEMORYUTILIZATIONPERCENTAGE_BINDING);
            protocolMarshaller.marshall(eC2ResourceUtilization.getMaxStorageUtilizationPercentage(), MAXSTORAGEUTILIZATIONPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

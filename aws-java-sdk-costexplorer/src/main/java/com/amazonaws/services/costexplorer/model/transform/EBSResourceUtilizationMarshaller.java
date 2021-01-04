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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EBSResourceUtilizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EBSResourceUtilizationMarshaller {

    private static final MarshallingInfo<String> EBSREADOPSPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsReadOpsPerSecond").build();
    private static final MarshallingInfo<String> EBSWRITEOPSPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsWriteOpsPerSecond").build();
    private static final MarshallingInfo<String> EBSREADBYTESPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsReadBytesPerSecond").build();
    private static final MarshallingInfo<String> EBSWRITEBYTESPERSECOND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsWriteBytesPerSecond").build();

    private static final EBSResourceUtilizationMarshaller instance = new EBSResourceUtilizationMarshaller();

    public static EBSResourceUtilizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EBSResourceUtilization eBSResourceUtilization, ProtocolMarshaller protocolMarshaller) {

        if (eBSResourceUtilization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eBSResourceUtilization.getEbsReadOpsPerSecond(), EBSREADOPSPERSECOND_BINDING);
            protocolMarshaller.marshall(eBSResourceUtilization.getEbsWriteOpsPerSecond(), EBSWRITEOPSPERSECOND_BINDING);
            protocolMarshaller.marshall(eBSResourceUtilization.getEbsReadBytesPerSecond(), EBSREADBYTESPERSECOND_BINDING);
            protocolMarshaller.marshall(eBSResourceUtilization.getEbsWriteBytesPerSecond(), EBSWRITEBYTESPERSECOND_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

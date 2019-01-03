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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LabelCountersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LabelCountersMarshaller {

    private static final MarshallingInfo<Integer> TOTALLABELED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalLabeled").build();
    private static final MarshallingInfo<Integer> HUMANLABELED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HumanLabeled").build();
    private static final MarshallingInfo<Integer> MACHINELABELED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MachineLabeled").build();
    private static final MarshallingInfo<Integer> FAILEDNONRETRYABLEERROR_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedNonRetryableError").build();
    private static final MarshallingInfo<Integer> UNLABELED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Unlabeled").build();

    private static final LabelCountersMarshaller instance = new LabelCountersMarshaller();

    public static LabelCountersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LabelCounters labelCounters, ProtocolMarshaller protocolMarshaller) {

        if (labelCounters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(labelCounters.getTotalLabeled(), TOTALLABELED_BINDING);
            protocolMarshaller.marshall(labelCounters.getHumanLabeled(), HUMANLABELED_BINDING);
            protocolMarshaller.marshall(labelCounters.getMachineLabeled(), MACHINELABELED_BINDING);
            protocolMarshaller.marshall(labelCounters.getFailedNonRetryableError(), FAILEDNONRETRYABLEERROR_BINDING);
            protocolMarshaller.marshall(labelCounters.getUnlabeled(), UNLABELED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

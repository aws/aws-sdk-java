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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlansUtilizationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansUtilizationMarshaller {

    private static final MarshallingInfo<String> TOTALCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCommitment").build();
    private static final MarshallingInfo<String> USEDCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UsedCommitment").build();
    private static final MarshallingInfo<String> UNUSEDCOMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnusedCommitment").build();
    private static final MarshallingInfo<String> UTILIZATIONPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UtilizationPercentage").build();

    private static final SavingsPlansUtilizationMarshaller instance = new SavingsPlansUtilizationMarshaller();

    public static SavingsPlansUtilizationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansUtilization savingsPlansUtilization, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansUtilization == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansUtilization.getTotalCommitment(), TOTALCOMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlansUtilization.getUsedCommitment(), USEDCOMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlansUtilization.getUnusedCommitment(), UNUSEDCOMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlansUtilization.getUtilizationPercentage(), UTILIZATIONPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

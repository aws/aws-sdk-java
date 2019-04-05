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
 * DesiredWeightAndCapacityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DesiredWeightAndCapacityMarshaller {

    private static final MarshallingInfo<String> VARIANTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VariantName").build();
    private static final MarshallingInfo<Float> DESIREDWEIGHT_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredWeight").build();
    private static final MarshallingInfo<Integer> DESIREDINSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredInstanceCount").build();

    private static final DesiredWeightAndCapacityMarshaller instance = new DesiredWeightAndCapacityMarshaller();

    public static DesiredWeightAndCapacityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DesiredWeightAndCapacity desiredWeightAndCapacity, ProtocolMarshaller protocolMarshaller) {

        if (desiredWeightAndCapacity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(desiredWeightAndCapacity.getVariantName(), VARIANTNAME_BINDING);
            protocolMarshaller.marshall(desiredWeightAndCapacity.getDesiredWeight(), DESIREDWEIGHT_BINDING);
            protocolMarshaller.marshall(desiredWeightAndCapacity.getDesiredInstanceCount(), DESIREDINSTANCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

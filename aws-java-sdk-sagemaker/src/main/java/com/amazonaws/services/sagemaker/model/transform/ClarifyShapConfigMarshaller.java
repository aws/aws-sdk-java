/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ClarifyShapConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ClarifyShapConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> SHAPBASELINECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShapBaselineConfig").build();
    private static final MarshallingInfo<Integer> NUMBEROFSAMPLES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfSamples").build();
    private static final MarshallingInfo<Boolean> USELOGIT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseLogit").build();
    private static final MarshallingInfo<Integer> SEED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Seed").build();
    private static final MarshallingInfo<StructuredPojo> TEXTCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TextConfig").build();

    private static final ClarifyShapConfigMarshaller instance = new ClarifyShapConfigMarshaller();

    public static ClarifyShapConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ClarifyShapConfig clarifyShapConfig, ProtocolMarshaller protocolMarshaller) {

        if (clarifyShapConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(clarifyShapConfig.getShapBaselineConfig(), SHAPBASELINECONFIG_BINDING);
            protocolMarshaller.marshall(clarifyShapConfig.getNumberOfSamples(), NUMBEROFSAMPLES_BINDING);
            protocolMarshaller.marshall(clarifyShapConfig.getUseLogit(), USELOGIT_BINDING);
            protocolMarshaller.marshall(clarifyShapConfig.getSeed(), SEED_BINDING);
            protocolMarshaller.marshall(clarifyShapConfig.getTextConfig(), TEXTCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

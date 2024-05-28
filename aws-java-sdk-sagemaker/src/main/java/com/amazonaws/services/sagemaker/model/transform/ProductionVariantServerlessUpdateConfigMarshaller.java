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
 * ProductionVariantServerlessUpdateConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductionVariantServerlessUpdateConfigMarshaller {

    private static final MarshallingInfo<Integer> MAXCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrency").build();
    private static final MarshallingInfo<Integer> PROVISIONEDCONCURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedConcurrency").build();

    private static final ProductionVariantServerlessUpdateConfigMarshaller instance = new ProductionVariantServerlessUpdateConfigMarshaller();

    public static ProductionVariantServerlessUpdateConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProductionVariantServerlessUpdateConfig productionVariantServerlessUpdateConfig, ProtocolMarshaller protocolMarshaller) {

        if (productionVariantServerlessUpdateConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(productionVariantServerlessUpdateConfig.getMaxConcurrency(), MAXCONCURRENCY_BINDING);
            protocolMarshaller.marshall(productionVariantServerlessUpdateConfig.getProvisionedConcurrency(), PROVISIONEDCONCURRENCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

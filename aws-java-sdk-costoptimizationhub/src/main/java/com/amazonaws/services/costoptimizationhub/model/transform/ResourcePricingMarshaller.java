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
package com.amazonaws.services.costoptimizationhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costoptimizationhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourcePricingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourcePricingMarshaller {

    private static final MarshallingInfo<Double> ESTIMATEDCOSTAFTERDISCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedCostAfterDiscounts").build();
    private static final MarshallingInfo<Double> ESTIMATEDCOSTBEFOREDISCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedCostBeforeDiscounts").build();
    private static final MarshallingInfo<StructuredPojo> ESTIMATEDDISCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedDiscounts").build();
    private static final MarshallingInfo<Double> ESTIMATEDNETUNUSEDAMORTIZEDCOMMITMENTS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("estimatedNetUnusedAmortizedCommitments").build();

    private static final ResourcePricingMarshaller instance = new ResourcePricingMarshaller();

    public static ResourcePricingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourcePricing resourcePricing, ProtocolMarshaller protocolMarshaller) {

        if (resourcePricing == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourcePricing.getEstimatedCostAfterDiscounts(), ESTIMATEDCOSTAFTERDISCOUNTS_BINDING);
            protocolMarshaller.marshall(resourcePricing.getEstimatedCostBeforeDiscounts(), ESTIMATEDCOSTBEFOREDISCOUNTS_BINDING);
            protocolMarshaller.marshall(resourcePricing.getEstimatedDiscounts(), ESTIMATEDDISCOUNTS_BINDING);
            protocolMarshaller.marshall(resourcePricing.getEstimatedNetUnusedAmortizedCommitments(), ESTIMATEDNETUNUSEDAMORTIZEDCOMMITMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

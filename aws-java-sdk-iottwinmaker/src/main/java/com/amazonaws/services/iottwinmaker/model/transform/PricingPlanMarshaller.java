/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PricingPlanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PricingPlanMarshaller {

    private static final MarshallingInfo<Long> BILLABLEENTITYCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billableEntityCount").build();
    private static final MarshallingInfo<StructuredPojo> BUNDLEINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bundleInformation").build();
    private static final MarshallingInfo<java.util.Date> EFFECTIVEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("effectiveDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PRICINGMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pricingMode").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UPDATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateReason").build();

    private static final PricingPlanMarshaller instance = new PricingPlanMarshaller();

    public static PricingPlanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PricingPlan pricingPlan, ProtocolMarshaller protocolMarshaller) {

        if (pricingPlan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pricingPlan.getBillableEntityCount(), BILLABLEENTITYCOUNT_BINDING);
            protocolMarshaller.marshall(pricingPlan.getBundleInformation(), BUNDLEINFORMATION_BINDING);
            protocolMarshaller.marshall(pricingPlan.getEffectiveDateTime(), EFFECTIVEDATETIME_BINDING);
            protocolMarshaller.marshall(pricingPlan.getPricingMode(), PRICINGMODE_BINDING);
            protocolMarshaller.marshall(pricingPlan.getUpdateDateTime(), UPDATEDATETIME_BINDING);
            protocolMarshaller.marshall(pricingPlan.getUpdateReason(), UPDATEREASON_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

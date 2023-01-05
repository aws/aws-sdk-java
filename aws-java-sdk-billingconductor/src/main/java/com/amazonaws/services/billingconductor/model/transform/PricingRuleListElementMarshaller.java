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
package com.amazonaws.services.billingconductor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.billingconductor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PricingRuleListElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PricingRuleListElementMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Scope").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<Double> MODIFIERPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModifierPercentage").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Service").build();
    private static final MarshallingInfo<Long> ASSOCIATEDPRICINGPLANCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedPricingPlanCount").build();
    private static final MarshallingInfo<Long> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreationTime").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").build();
    private static final MarshallingInfo<String> BILLINGENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillingEntity").build();
    private static final MarshallingInfo<StructuredPojo> TIERING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tiering").build();

    private static final PricingRuleListElementMarshaller instance = new PricingRuleListElementMarshaller();

    public static PricingRuleListElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PricingRuleListElement pricingRuleListElement, ProtocolMarshaller protocolMarshaller) {

        if (pricingRuleListElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pricingRuleListElement.getName(), NAME_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getModifierPercentage(), MODIFIERPERCENTAGE_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getAssociatedPricingPlanCount(), ASSOCIATEDPRICINGPLANCOUNT_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getBillingEntity(), BILLINGENTITY_BINDING);
            protocolMarshaller.marshall(pricingRuleListElement.getTiering(), TIERING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

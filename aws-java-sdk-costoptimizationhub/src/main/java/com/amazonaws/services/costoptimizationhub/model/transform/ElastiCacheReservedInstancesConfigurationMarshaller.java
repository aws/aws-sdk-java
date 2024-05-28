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
 * ElastiCacheReservedInstancesConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ElastiCacheReservedInstancesConfigurationMarshaller {

    private static final MarshallingInfo<String> ACCOUNTSCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accountScope").build();
    private static final MarshallingInfo<String> CURRENTGENERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentGeneration").build();
    private static final MarshallingInfo<String> INSTANCEFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceFamily").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> MONTHLYRECURRINGCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monthlyRecurringCost").build();
    private static final MarshallingInfo<String> NORMALIZEDUNITSTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("normalizedUnitsToPurchase").build();
    private static final MarshallingInfo<String> NUMBEROFINSTANCESTOPURCHASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfInstancesToPurchase").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("paymentOption").build();
    private static final MarshallingInfo<String> RESERVEDINSTANCESREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservedInstancesRegion").build();
    private static final MarshallingInfo<String> SERVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("service").build();
    private static final MarshallingInfo<Boolean> SIZEFLEXELIGIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeFlexEligible").build();
    private static final MarshallingInfo<String> TERM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("term").build();
    private static final MarshallingInfo<String> UPFRONTCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("upfrontCost").build();

    private static final ElastiCacheReservedInstancesConfigurationMarshaller instance = new ElastiCacheReservedInstancesConfigurationMarshaller();

    public static ElastiCacheReservedInstancesConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ElastiCacheReservedInstancesConfiguration elastiCacheReservedInstancesConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (elastiCacheReservedInstancesConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getAccountScope(), ACCOUNTSCOPE_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getCurrentGeneration(), CURRENTGENERATION_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getInstanceFamily(), INSTANCEFAMILY_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getMonthlyRecurringCost(), MONTHLYRECURRINGCOST_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getNormalizedUnitsToPurchase(), NORMALIZEDUNITSTOPURCHASE_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getNumberOfInstancesToPurchase(), NUMBEROFINSTANCESTOPURCHASE_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getReservedInstancesRegion(), RESERVEDINSTANCESREGION_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getService(), SERVICE_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getSizeFlexEligible(), SIZEFLEXELIGIBLE_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getTerm(), TERM_BINDING);
            protocolMarshaller.marshall(elastiCacheReservedInstancesConfiguration.getUpfrontCost(), UPFRONTCOST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

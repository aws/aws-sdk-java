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
package com.amazonaws.services.budgets.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CostTypesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CostTypesMarshaller {

    private static final MarshallingInfo<Boolean> INCLUDETAX_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeTax").build();
    private static final MarshallingInfo<Boolean> INCLUDESUBSCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeSubscription").build();
    private static final MarshallingInfo<Boolean> USEBLENDED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseBlended").build();
    private static final MarshallingInfo<Boolean> INCLUDEREFUND_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeRefund").build();
    private static final MarshallingInfo<Boolean> INCLUDECREDIT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeCredit").build();
    private static final MarshallingInfo<Boolean> INCLUDEUPFRONT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeUpfront").build();
    private static final MarshallingInfo<Boolean> INCLUDERECURRING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeRecurring").build();
    private static final MarshallingInfo<Boolean> INCLUDEOTHERSUBSCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeOtherSubscription").build();
    private static final MarshallingInfo<Boolean> INCLUDESUPPORT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeSupport").build();
    private static final MarshallingInfo<Boolean> INCLUDEDISCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncludeDiscount").build();
    private static final MarshallingInfo<Boolean> USEAMORTIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseAmortized").build();

    private static final CostTypesMarshaller instance = new CostTypesMarshaller();

    public static CostTypesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CostTypes costTypes, ProtocolMarshaller protocolMarshaller) {

        if (costTypes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(costTypes.getIncludeTax(), INCLUDETAX_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeSubscription(), INCLUDESUBSCRIPTION_BINDING);
            protocolMarshaller.marshall(costTypes.getUseBlended(), USEBLENDED_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeRefund(), INCLUDEREFUND_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeCredit(), INCLUDECREDIT_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeUpfront(), INCLUDEUPFRONT_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeRecurring(), INCLUDERECURRING_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeOtherSubscription(), INCLUDEOTHERSUBSCRIPTION_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeSupport(), INCLUDESUPPORT_BINDING);
            protocolMarshaller.marshall(costTypes.getIncludeDiscount(), INCLUDEDISCOUNT_BINDING);
            protocolMarshaller.marshall(costTypes.getUseAmortized(), USEAMORTIZED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

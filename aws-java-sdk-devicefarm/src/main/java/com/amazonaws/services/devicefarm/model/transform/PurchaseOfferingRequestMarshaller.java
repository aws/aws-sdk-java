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
package com.amazonaws.services.devicefarm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PurchaseOfferingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PurchaseOfferingRequestMarshaller {

    private static final MarshallingInfo<String> OFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringId").build();
    private static final MarshallingInfo<Integer> QUANTITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("quantity").build();
    private static final MarshallingInfo<String> OFFERINGPROMOTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringPromotionId").build();

    private static final PurchaseOfferingRequestMarshaller instance = new PurchaseOfferingRequestMarshaller();

    public static PurchaseOfferingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PurchaseOfferingRequest purchaseOfferingRequest, ProtocolMarshaller protocolMarshaller) {

        if (purchaseOfferingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(purchaseOfferingRequest.getOfferingId(), OFFERINGID_BINDING);
            protocolMarshaller.marshall(purchaseOfferingRequest.getQuantity(), QUANTITY_BINDING);
            protocolMarshaller.marshall(purchaseOfferingRequest.getOfferingPromotionId(), OFFERINGPROMOTIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

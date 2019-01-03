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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PurchaseReservedElasticsearchInstanceOfferingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PurchaseReservedElasticsearchInstanceOfferingRequestMarshaller {

    private static final MarshallingInfo<String> RESERVEDELASTICSEARCHINSTANCEOFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedElasticsearchInstanceOfferingId").build();
    private static final MarshallingInfo<String> RESERVATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservationName").build();
    private static final MarshallingInfo<Integer> INSTANCECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceCount").build();

    private static final PurchaseReservedElasticsearchInstanceOfferingRequestMarshaller instance = new PurchaseReservedElasticsearchInstanceOfferingRequestMarshaller();

    public static PurchaseReservedElasticsearchInstanceOfferingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PurchaseReservedElasticsearchInstanceOfferingRequest purchaseReservedElasticsearchInstanceOfferingRequest,
            ProtocolMarshaller protocolMarshaller) {

        if (purchaseReservedElasticsearchInstanceOfferingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(purchaseReservedElasticsearchInstanceOfferingRequest.getReservedElasticsearchInstanceOfferingId(),
                    RESERVEDELASTICSEARCHINSTANCEOFFERINGID_BINDING);
            protocolMarshaller.marshall(purchaseReservedElasticsearchInstanceOfferingRequest.getReservationName(), RESERVATIONNAME_BINDING);
            protocolMarshaller.marshall(purchaseReservedElasticsearchInstanceOfferingRequest.getInstanceCount(), INSTANCECOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

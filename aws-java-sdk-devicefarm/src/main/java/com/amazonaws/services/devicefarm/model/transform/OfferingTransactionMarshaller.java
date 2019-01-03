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
 * OfferingTransactionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OfferingTransactionMarshaller {

    private static final MarshallingInfo<StructuredPojo> OFFERINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringStatus").build();
    private static final MarshallingInfo<String> TRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transactionId").build();
    private static final MarshallingInfo<String> OFFERINGPROMOTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringPromotionId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> COST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cost").build();

    private static final OfferingTransactionMarshaller instance = new OfferingTransactionMarshaller();

    public static OfferingTransactionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OfferingTransaction offeringTransaction, ProtocolMarshaller protocolMarshaller) {

        if (offeringTransaction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(offeringTransaction.getOfferingStatus(), OFFERINGSTATUS_BINDING);
            protocolMarshaller.marshall(offeringTransaction.getTransactionId(), TRANSACTIONID_BINDING);
            protocolMarshaller.marshall(offeringTransaction.getOfferingPromotionId(), OFFERINGPROMOTIONID_BINDING);
            protocolMarshaller.marshall(offeringTransaction.getCreatedOn(), CREATEDON_BINDING);
            protocolMarshaller.marshall(offeringTransaction.getCost(), COST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

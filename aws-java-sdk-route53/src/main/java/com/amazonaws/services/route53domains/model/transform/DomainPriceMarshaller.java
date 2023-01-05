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
package com.amazonaws.services.route53domains.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DomainPriceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DomainPriceMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRATIONPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationPrice").build();
    private static final MarshallingInfo<StructuredPojo> TRANSFERPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransferPrice").build();
    private static final MarshallingInfo<StructuredPojo> RENEWALPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RenewalPrice").build();
    private static final MarshallingInfo<StructuredPojo> CHANGEOWNERSHIPPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChangeOwnershipPrice").build();
    private static final MarshallingInfo<StructuredPojo> RESTORATIONPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestorationPrice").build();

    private static final DomainPriceMarshaller instance = new DomainPriceMarshaller();

    public static DomainPriceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DomainPrice domainPrice, ProtocolMarshaller protocolMarshaller) {

        if (domainPrice == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(domainPrice.getName(), NAME_BINDING);
            protocolMarshaller.marshall(domainPrice.getRegistrationPrice(), REGISTRATIONPRICE_BINDING);
            protocolMarshaller.marshall(domainPrice.getTransferPrice(), TRANSFERPRICE_BINDING);
            protocolMarshaller.marshall(domainPrice.getRenewalPrice(), RENEWALPRICE_BINDING);
            protocolMarshaller.marshall(domainPrice.getChangeOwnershipPrice(), CHANGEOWNERSHIPPRICE_BINDING);
            protocolMarshaller.marshall(domainPrice.getRestorationPrice(), RESTORATIONPRICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

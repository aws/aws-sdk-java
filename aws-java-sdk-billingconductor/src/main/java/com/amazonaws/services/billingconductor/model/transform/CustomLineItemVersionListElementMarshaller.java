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
 * CustomLineItemVersionListElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CustomLineItemVersionListElementMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<StructuredPojo> CHARGEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChargeDetails").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> PRODUCTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductCode").build();
    private static final MarshallingInfo<String> BILLINGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillingGroupArn").build();
    private static final MarshallingInfo<Long> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CreationTime").build();
    private static final MarshallingInfo<Long> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").build();
    private static final MarshallingInfo<Long> ASSOCIATIONSIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationSize").build();
    private static final MarshallingInfo<String> STARTBILLINGPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartBillingPeriod").build();
    private static final MarshallingInfo<String> ENDBILLINGPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndBillingPeriod").build();

    private static final CustomLineItemVersionListElementMarshaller instance = new CustomLineItemVersionListElementMarshaller();

    public static CustomLineItemVersionListElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CustomLineItemVersionListElement customLineItemVersionListElement, ProtocolMarshaller protocolMarshaller) {

        if (customLineItemVersionListElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(customLineItemVersionListElement.getName(), NAME_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getChargeDetails(), CHARGEDETAILS_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getCurrencyCode(), CURRENCYCODE_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getProductCode(), PRODUCTCODE_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getBillingGroupArn(), BILLINGGROUPARN_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getAssociationSize(), ASSOCIATIONSIZE_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getStartBillingPeriod(), STARTBILLINGPERIOD_BINDING);
            protocolMarshaller.marshall(customLineItemVersionListElement.getEndBillingPeriod(), ENDBILLINGPERIOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

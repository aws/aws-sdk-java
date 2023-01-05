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
package com.amazonaws.services.licensemanagerusersubscriptions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanagerusersubscriptions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProductUserSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProductUserSummaryMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<StructuredPojo> IDENTITYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityProvider").build();
    private static final MarshallingInfo<String> PRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Product").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONENDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionEndDate").build();
    private static final MarshallingInfo<String> SUBSCRIPTIONSTARTDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SubscriptionStartDate").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();

    private static final ProductUserSummaryMarshaller instance = new ProductUserSummaryMarshaller();

    public static ProductUserSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProductUserSummary productUserSummary, ProtocolMarshaller protocolMarshaller) {

        if (productUserSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(productUserSummary.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(productUserSummary.getIdentityProvider(), IDENTITYPROVIDER_BINDING);
            protocolMarshaller.marshall(productUserSummary.getProduct(), PRODUCT_BINDING);
            protocolMarshaller.marshall(productUserSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(productUserSummary.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(productUserSummary.getSubscriptionEndDate(), SUBSCRIPTIONENDDATE_BINDING);
            protocolMarshaller.marshall(productUserSummary.getSubscriptionStartDate(), SUBSCRIPTIONSTARTDATE_BINDING);
            protocolMarshaller.marshall(productUserSummary.getUsername(), USERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

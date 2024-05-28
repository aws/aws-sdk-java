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
package com.amazonaws.services.eks.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EksAnywhereSubscriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EksAnywhereSubscriptionMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EFFECTIVEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("effectiveDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EXPIRATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expirationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> LICENSEQUANTITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseQuantity").build();
    private static final MarshallingInfo<String> LICENSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseType").build();
    private static final MarshallingInfo<StructuredPojo> TERM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("term").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Boolean> AUTORENEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoRenew").build();
    private static final MarshallingInfo<List> LICENSEARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("licenseArns").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final EksAnywhereSubscriptionMarshaller instance = new EksAnywhereSubscriptionMarshaller();

    public static EksAnywhereSubscriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EksAnywhereSubscription eksAnywhereSubscription, ProtocolMarshaller protocolMarshaller) {

        if (eksAnywhereSubscription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eksAnywhereSubscription.getId(), ID_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getEffectiveDate(), EFFECTIVEDATE_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getExpirationDate(), EXPIRATIONDATE_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getLicenseQuantity(), LICENSEQUANTITY_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getLicenseType(), LICENSETYPE_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getTerm(), TERM_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getAutoRenew(), AUTORENEW_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getLicenseArns(), LICENSEARNS_BINDING);
            protocolMarshaller.marshall(eksAnywhereSubscription.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

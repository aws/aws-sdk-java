/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.savingsplans.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.savingsplans.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlanMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlanMarshaller {

    private static final MarshallingInfo<String> OFFERINGID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offeringId").build();
    private static final MarshallingInfo<String> SAVINGSPLANID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanId").build();
    private static final MarshallingInfo<String> SAVINGSPLANARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanArn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> START_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("start").build();
    private static final MarshallingInfo<String> END_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("end").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<String> EC2INSTANCEFAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceFamily").build();
    private static final MarshallingInfo<String> SAVINGSPLANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsPlanType").build();
    private static final MarshallingInfo<String> PAYMENTOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("paymentOption").build();
    private static final MarshallingInfo<List> PRODUCTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("productTypes").build();
    private static final MarshallingInfo<String> CURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("currency").build();
    private static final MarshallingInfo<String> COMMITMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitment").build();
    private static final MarshallingInfo<String> UPFRONTPAYMENTAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("upfrontPaymentAmount").build();
    private static final MarshallingInfo<String> RECURRINGPAYMENTAMOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recurringPaymentAmount").build();
    private static final MarshallingInfo<Long> TERMDURATIONINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("termDurationInSeconds").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final SavingsPlanMarshaller instance = new SavingsPlanMarshaller();

    public static SavingsPlanMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlan savingsPlan, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlan == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlan.getOfferingId(), OFFERINGID_BINDING);
            protocolMarshaller.marshall(savingsPlan.getSavingsPlanId(), SAVINGSPLANID_BINDING);
            protocolMarshaller.marshall(savingsPlan.getSavingsPlanArn(), SAVINGSPLANARN_BINDING);
            protocolMarshaller.marshall(savingsPlan.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(savingsPlan.getStart(), START_BINDING);
            protocolMarshaller.marshall(savingsPlan.getEnd(), END_BINDING);
            protocolMarshaller.marshall(savingsPlan.getState(), STATE_BINDING);
            protocolMarshaller.marshall(savingsPlan.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(savingsPlan.getEc2InstanceFamily(), EC2INSTANCEFAMILY_BINDING);
            protocolMarshaller.marshall(savingsPlan.getSavingsPlanType(), SAVINGSPLANTYPE_BINDING);
            protocolMarshaller.marshall(savingsPlan.getPaymentOption(), PAYMENTOPTION_BINDING);
            protocolMarshaller.marshall(savingsPlan.getProductTypes(), PRODUCTTYPES_BINDING);
            protocolMarshaller.marshall(savingsPlan.getCurrency(), CURRENCY_BINDING);
            protocolMarshaller.marshall(savingsPlan.getCommitment(), COMMITMENT_BINDING);
            protocolMarshaller.marshall(savingsPlan.getUpfrontPaymentAmount(), UPFRONTPAYMENTAMOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlan.getRecurringPaymentAmount(), RECURRINGPAYMENTAMOUNT_BINDING);
            protocolMarshaller.marshall(savingsPlan.getTermDurationInSeconds(), TERMDURATIONINSECONDS_BINDING);
            protocolMarshaller.marshall(savingsPlan.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

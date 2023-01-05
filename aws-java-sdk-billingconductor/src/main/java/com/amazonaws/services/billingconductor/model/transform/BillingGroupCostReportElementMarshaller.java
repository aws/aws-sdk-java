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
 * BillingGroupCostReportElementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BillingGroupCostReportElementMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> AWSCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AWSCost").build();
    private static final MarshallingInfo<String> PROFORMACOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProformaCost").build();
    private static final MarshallingInfo<String> MARGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Margin").build();
    private static final MarshallingInfo<String> MARGINPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MarginPercentage").build();
    private static final MarshallingInfo<String> CURRENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Currency").build();

    private static final BillingGroupCostReportElementMarshaller instance = new BillingGroupCostReportElementMarshaller();

    public static BillingGroupCostReportElementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BillingGroupCostReportElement billingGroupCostReportElement, ProtocolMarshaller protocolMarshaller) {

        if (billingGroupCostReportElement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(billingGroupCostReportElement.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(billingGroupCostReportElement.getAWSCost(), AWSCOST_BINDING);
            protocolMarshaller.marshall(billingGroupCostReportElement.getProformaCost(), PROFORMACOST_BINDING);
            protocolMarshaller.marshall(billingGroupCostReportElement.getMargin(), MARGIN_BINDING);
            protocolMarshaller.marshall(billingGroupCostReportElement.getMarginPercentage(), MARGINPERCENTAGE_BINDING);
            protocolMarshaller.marshall(billingGroupCostReportElement.getCurrency(), CURRENCY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

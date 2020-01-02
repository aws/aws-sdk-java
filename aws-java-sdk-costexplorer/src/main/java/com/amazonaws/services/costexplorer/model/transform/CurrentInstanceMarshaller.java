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
package com.amazonaws.services.costexplorer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CurrentInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CurrentInstanceMarshaller {

    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceDetails").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCEUTILIZATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceUtilization").build();
    private static final MarshallingInfo<String> RESERVATIONCOVEREDHOURSINLOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservationCoveredHoursInLookbackPeriod").build();
    private static final MarshallingInfo<String> SAVINGSPLANSCOVEREDHOURSINLOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SavingsPlansCoveredHoursInLookbackPeriod").build();
    private static final MarshallingInfo<String> ONDEMANDHOURSINLOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandHoursInLookbackPeriod").build();
    private static final MarshallingInfo<String> TOTALRUNNINGHOURSINLOOKBACKPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalRunningHoursInLookbackPeriod").build();
    private static final MarshallingInfo<String> MONTHLYCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MonthlyCost").build();
    private static final MarshallingInfo<String> CURRENCYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrencyCode").build();

    private static final CurrentInstanceMarshaller instance = new CurrentInstanceMarshaller();

    public static CurrentInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CurrentInstance currentInstance, ProtocolMarshaller protocolMarshaller) {

        if (currentInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(currentInstance.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(currentInstance.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(currentInstance.getResourceDetails(), RESOURCEDETAILS_BINDING);
            protocolMarshaller.marshall(currentInstance.getResourceUtilization(), RESOURCEUTILIZATION_BINDING);
            protocolMarshaller.marshall(currentInstance.getReservationCoveredHoursInLookbackPeriod(), RESERVATIONCOVEREDHOURSINLOOKBACKPERIOD_BINDING);
            protocolMarshaller.marshall(currentInstance.getSavingsPlansCoveredHoursInLookbackPeriod(), SAVINGSPLANSCOVEREDHOURSINLOOKBACKPERIOD_BINDING);
            protocolMarshaller.marshall(currentInstance.getOnDemandHoursInLookbackPeriod(), ONDEMANDHOURSINLOOKBACKPERIOD_BINDING);
            protocolMarshaller.marshall(currentInstance.getTotalRunningHoursInLookbackPeriod(), TOTALRUNNINGHOURSINLOOKBACKPERIOD_BINDING);
            protocolMarshaller.marshall(currentInstance.getMonthlyCost(), MONTHLYCOST_BINDING);
            protocolMarshaller.marshall(currentInstance.getCurrencyCode(), CURRENCYCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

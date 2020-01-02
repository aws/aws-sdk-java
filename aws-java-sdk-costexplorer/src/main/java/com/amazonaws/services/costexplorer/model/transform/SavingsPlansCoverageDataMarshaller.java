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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SavingsPlansCoverageDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SavingsPlansCoverageDataMarshaller {

    private static final MarshallingInfo<String> SPENDCOVEREDBYSAVINGSPLANS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpendCoveredBySavingsPlans").build();
    private static final MarshallingInfo<String> ONDEMANDCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandCost").build();
    private static final MarshallingInfo<String> TOTALCOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TotalCost").build();
    private static final MarshallingInfo<String> COVERAGEPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoveragePercentage").build();

    private static final SavingsPlansCoverageDataMarshaller instance = new SavingsPlansCoverageDataMarshaller();

    public static SavingsPlansCoverageDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SavingsPlansCoverageData savingsPlansCoverageData, ProtocolMarshaller protocolMarshaller) {

        if (savingsPlansCoverageData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(savingsPlansCoverageData.getSpendCoveredBySavingsPlans(), SPENDCOVEREDBYSAVINGSPLANS_BINDING);
            protocolMarshaller.marshall(savingsPlansCoverageData.getOnDemandCost(), ONDEMANDCOST_BINDING);
            protocolMarshaller.marshall(savingsPlansCoverageData.getTotalCost(), TOTALCOST_BINDING);
            protocolMarshaller.marshall(savingsPlansCoverageData.getCoveragePercentage(), COVERAGEPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

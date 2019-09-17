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
package com.amazonaws.services.costexplorer.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.costexplorer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CoverageNormalizedUnitsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoverageNormalizedUnitsMarshaller {

    private static final MarshallingInfo<String> ONDEMANDNORMALIZEDUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandNormalizedUnits").build();
    private static final MarshallingInfo<String> RESERVEDNORMALIZEDUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedNormalizedUnits").build();
    private static final MarshallingInfo<String> TOTALRUNNINGNORMALIZEDUNITS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalRunningNormalizedUnits").build();
    private static final MarshallingInfo<String> COVERAGENORMALIZEDUNITSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoverageNormalizedUnitsPercentage").build();

    private static final CoverageNormalizedUnitsMarshaller instance = new CoverageNormalizedUnitsMarshaller();

    public static CoverageNormalizedUnitsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoverageNormalizedUnits coverageNormalizedUnits, ProtocolMarshaller protocolMarshaller) {

        if (coverageNormalizedUnits == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coverageNormalizedUnits.getOnDemandNormalizedUnits(), ONDEMANDNORMALIZEDUNITS_BINDING);
            protocolMarshaller.marshall(coverageNormalizedUnits.getReservedNormalizedUnits(), RESERVEDNORMALIZEDUNITS_BINDING);
            protocolMarshaller.marshall(coverageNormalizedUnits.getTotalRunningNormalizedUnits(), TOTALRUNNINGNORMALIZEDUNITS_BINDING);
            protocolMarshaller.marshall(coverageNormalizedUnits.getCoverageNormalizedUnitsPercentage(), COVERAGENORMALIZEDUNITSPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

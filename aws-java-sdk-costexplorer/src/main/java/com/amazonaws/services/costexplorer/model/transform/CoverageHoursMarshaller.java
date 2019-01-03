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
 * CoverageHoursMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoverageHoursMarshaller {

    private static final MarshallingInfo<String> ONDEMANDHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnDemandHours").build();
    private static final MarshallingInfo<String> RESERVEDHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservedHours").build();
    private static final MarshallingInfo<String> TOTALRUNNINGHOURS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalRunningHours").build();
    private static final MarshallingInfo<String> COVERAGEHOURSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoverageHoursPercentage").build();

    private static final CoverageHoursMarshaller instance = new CoverageHoursMarshaller();

    public static CoverageHoursMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoverageHours coverageHours, ProtocolMarshaller protocolMarshaller) {

        if (coverageHours == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coverageHours.getOnDemandHours(), ONDEMANDHOURS_BINDING);
            protocolMarshaller.marshall(coverageHours.getReservedHours(), RESERVEDHOURS_BINDING);
            protocolMarshaller.marshall(coverageHours.getTotalRunningHours(), TOTALRUNNINGHOURS_BINDING);
            protocolMarshaller.marshall(coverageHours.getCoverageHoursPercentage(), COVERAGEHOURSPERCENTAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

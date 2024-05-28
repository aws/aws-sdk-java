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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LicenseRecommendationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseRecommendationMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceArn").build();
    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<StructuredPojo> CURRENTLICENSECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("currentLicenseConfiguration").build();
    private static final MarshallingInfo<Double> LOOKBACKPERIODINDAYS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lookbackPeriodInDays").build();
    private static final MarshallingInfo<java.util.Date> LASTREFRESHTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastRefreshTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FINDING_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("finding").build();
    private static final MarshallingInfo<List> FINDINGREASONCODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("findingReasonCodes").build();
    private static final MarshallingInfo<List> LICENSERECOMMENDATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseRecommendationOptions").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final LicenseRecommendationMarshaller instance = new LicenseRecommendationMarshaller();

    public static LicenseRecommendationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseRecommendation licenseRecommendation, ProtocolMarshaller protocolMarshaller) {

        if (licenseRecommendation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseRecommendation.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getCurrentLicenseConfiguration(), CURRENTLICENSECONFIGURATION_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getLookbackPeriodInDays(), LOOKBACKPERIODINDAYS_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getLastRefreshTimestamp(), LASTREFRESHTIMESTAMP_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getFinding(), FINDING_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getFindingReasonCodes(), FINDINGREASONCODES_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getLicenseRecommendationOptions(), LICENSERECOMMENDATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(licenseRecommendation.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

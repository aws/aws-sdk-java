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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.computeoptimizer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LicenseRecommendationOptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseRecommendationOptionMarshaller {

    private static final MarshallingInfo<Integer> RANK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rank").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operatingSystem").build();
    private static final MarshallingInfo<String> LICENSEEDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseEdition").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseModel").build();
    private static final MarshallingInfo<StructuredPojo> SAVINGSOPPORTUNITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savingsOpportunity").build();

    private static final LicenseRecommendationOptionMarshaller instance = new LicenseRecommendationOptionMarshaller();

    public static LicenseRecommendationOptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseRecommendationOption licenseRecommendationOption, ProtocolMarshaller protocolMarshaller) {

        if (licenseRecommendationOption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseRecommendationOption.getRank(), RANK_BINDING);
            protocolMarshaller.marshall(licenseRecommendationOption.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(licenseRecommendationOption.getLicenseEdition(), LICENSEEDITION_BINDING);
            protocolMarshaller.marshall(licenseRecommendationOption.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(licenseRecommendationOption.getSavingsOpportunity(), SAVINGSOPPORTUNITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

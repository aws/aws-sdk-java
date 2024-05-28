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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * Ec2RecommendationsExportPreferencesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Ec2RecommendationsExportPreferencesMarshaller {

    private static final MarshallingInfo<Boolean> ENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("enabled").build();
    private static final MarshallingInfo<StructuredPojo> CPUPERFORMANCEMETRICBASIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cpuPerformanceMetricBasis").build();
    private static final MarshallingInfo<StructuredPojo> RAMPERFORMANCEMETRICBASIS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ramPerformanceMetricBasis").build();
    private static final MarshallingInfo<String> TENANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tenancy").build();
    private static final MarshallingInfo<List> EXCLUDEDINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("excludedInstanceTypes").build();
    private static final MarshallingInfo<String> PREFERREDREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredRegion").build();
    private static final MarshallingInfo<StructuredPojo> RESERVEDINSTANCEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reservedInstanceOptions").build();

    private static final Ec2RecommendationsExportPreferencesMarshaller instance = new Ec2RecommendationsExportPreferencesMarshaller();

    public static Ec2RecommendationsExportPreferencesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Ec2RecommendationsExportPreferences ec2RecommendationsExportPreferences, ProtocolMarshaller protocolMarshaller) {

        if (ec2RecommendationsExportPreferences == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getEnabled(), ENABLED_BINDING);
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getCpuPerformanceMetricBasis(), CPUPERFORMANCEMETRICBASIS_BINDING);
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getRamPerformanceMetricBasis(), RAMPERFORMANCEMETRICBASIS_BINDING);
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getTenancy(), TENANCY_BINDING);
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getExcludedInstanceTypes(), EXCLUDEDINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getPreferredRegion(), PREFERREDREGION_BINDING);
            protocolMarshaller.marshall(ec2RecommendationsExportPreferences.getReservedInstanceOptions(), RESERVEDINSTANCEOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

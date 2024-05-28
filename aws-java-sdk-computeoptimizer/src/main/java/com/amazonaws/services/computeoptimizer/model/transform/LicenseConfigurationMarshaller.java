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
 * LicenseConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseConfigurationMarshaller {

    private static final MarshallingInfo<Integer> NUMBEROFCORES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfCores").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceType").build();
    private static final MarshallingInfo<String> OPERATINGSYSTEM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operatingSystem").build();
    private static final MarshallingInfo<String> LICENSEEDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseEdition").build();
    private static final MarshallingInfo<String> LICENSENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseName").build();
    private static final MarshallingInfo<String> LICENSEMODEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseModel").build();
    private static final MarshallingInfo<String> LICENSEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseVersion").build();
    private static final MarshallingInfo<List> METRICSSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("metricsSource").build();

    private static final LicenseConfigurationMarshaller instance = new LicenseConfigurationMarshaller();

    public static LicenseConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseConfiguration licenseConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (licenseConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseConfiguration.getNumberOfCores(), NUMBEROFCORES_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getOperatingSystem(), OPERATINGSYSTEM_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseEdition(), LICENSEEDITION_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseName(), LICENSENAME_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseModel(), LICENSEMODEL_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseVersion(), LICENSEVERSION_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getMetricsSource(), METRICSSOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

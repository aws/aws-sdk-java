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
package com.amazonaws.services.iotwireless.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotwireless.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportedSidewalkDeviceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportedSidewalkDeviceMarshaller {

    private static final MarshallingInfo<String> SIDEWALKMANUFACTURINGSN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SidewalkManufacturingSn").build();
    private static final MarshallingInfo<String> ONBOARDINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnboardingStatus").build();
    private static final MarshallingInfo<String> ONBOARDINGSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OnboardingStatusReason").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateTime").timestampFormat("iso8601").build();

    private static final ImportedSidewalkDeviceMarshaller instance = new ImportedSidewalkDeviceMarshaller();

    public static ImportedSidewalkDeviceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportedSidewalkDevice importedSidewalkDevice, ProtocolMarshaller protocolMarshaller) {

        if (importedSidewalkDevice == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importedSidewalkDevice.getSidewalkManufacturingSn(), SIDEWALKMANUFACTURINGSN_BINDING);
            protocolMarshaller.marshall(importedSidewalkDevice.getOnboardingStatus(), ONBOARDINGSTATUS_BINDING);
            protocolMarshaller.marshall(importedSidewalkDevice.getOnboardingStatusReason(), ONBOARDINGSTATUSREASON_BINDING);
            protocolMarshaller.marshall(importedSidewalkDevice.getLastUpdateTime(), LASTUPDATETIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ScheduleRunConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ScheduleRunConfigurationMarshaller {

    private static final MarshallingInfo<String> EXTRADATAPACKAGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("extraDataPackageArn").build();
    private static final MarshallingInfo<String> NETWORKPROFILEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkProfileArn").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("locale").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<List> VPCECONFIGURATIONARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpceConfigurationArns").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMERARTIFACTPATHS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerArtifactPaths").build();
    private static final MarshallingInfo<StructuredPojo> RADIOS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("radios").build();
    private static final MarshallingInfo<List> AUXILIARYAPPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("auxiliaryApps").build();
    private static final MarshallingInfo<String> BILLINGMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("billingMethod").build();

    private static final ScheduleRunConfigurationMarshaller instance = new ScheduleRunConfigurationMarshaller();

    public static ScheduleRunConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ScheduleRunConfiguration scheduleRunConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (scheduleRunConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(scheduleRunConfiguration.getExtraDataPackageArn(), EXTRADATAPACKAGEARN_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getNetworkProfileArn(), NETWORKPROFILEARN_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getLocale(), LOCALE_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getVpceConfigurationArns(), VPCECONFIGURATIONARNS_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getCustomerArtifactPaths(), CUSTOMERARTIFACTPATHS_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getRadios(), RADIOS_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getAuxiliaryApps(), AUXILIARYAPPS_BINDING);
            protocolMarshaller.marshall(scheduleRunConfiguration.getBillingMethod(), BILLINGMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

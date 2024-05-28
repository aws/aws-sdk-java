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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ProvisionDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ProvisionDataMarshaller {

    private static final MarshallingInfo<String> PROVISIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionState").build();
    private static final MarshallingInfo<Integer> PROVISIONEDCAPACITYUNITS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProvisionedCapacityUnits").build();
    private static final MarshallingInfo<java.util.Date> DATEPROVISIONED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateProvisioned").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> ISNEWPROVISIONINGAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsNewProvisioningAvailable").build();
    private static final MarshallingInfo<java.util.Date> DATENEWPROVISIONINGDATAAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateNewProvisioningDataAvailable").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> REASONFORNEWPROVISIONINGDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReasonForNewProvisioningData").build();

    private static final ProvisionDataMarshaller instance = new ProvisionDataMarshaller();

    public static ProvisionDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ProvisionData provisionData, ProtocolMarshaller protocolMarshaller) {

        if (provisionData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(provisionData.getProvisionState(), PROVISIONSTATE_BINDING);
            protocolMarshaller.marshall(provisionData.getProvisionedCapacityUnits(), PROVISIONEDCAPACITYUNITS_BINDING);
            protocolMarshaller.marshall(provisionData.getDateProvisioned(), DATEPROVISIONED_BINDING);
            protocolMarshaller.marshall(provisionData.getIsNewProvisioningAvailable(), ISNEWPROVISIONINGAVAILABLE_BINDING);
            protocolMarshaller.marshall(provisionData.getDateNewProvisioningDataAvailable(), DATENEWPROVISIONINGDATAAVAILABLE_BINDING);
            protocolMarshaller.marshall(provisionData.getReasonForNewProvisioningData(), REASONFORNEWPROVISIONINGDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

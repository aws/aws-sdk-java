/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DatabaseInstanceSoftwareDetailsResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatabaseInstanceSoftwareDetailsResponseMarshaller {

    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineVersion").build();
    private static final MarshallingInfo<String> ENGINEEDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineEdition").build();
    private static final MarshallingInfo<String> SERVICEPACK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServicePack").build();
    private static final MarshallingInfo<String> SUPPORTLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportLevel").build();
    private static final MarshallingInfo<Integer> OSARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OsArchitecture").build();
    private static final MarshallingInfo<String> TOOLTIP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tooltip").build();

    private static final DatabaseInstanceSoftwareDetailsResponseMarshaller instance = new DatabaseInstanceSoftwareDetailsResponseMarshaller();

    public static DatabaseInstanceSoftwareDetailsResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatabaseInstanceSoftwareDetailsResponse databaseInstanceSoftwareDetailsResponse, ProtocolMarshaller protocolMarshaller) {

        if (databaseInstanceSoftwareDetailsResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getEngineEdition(), ENGINEEDITION_BINDING);
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getServicePack(), SERVICEPACK_BINDING);
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getSupportLevel(), SUPPORTLEVEL_BINDING);
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getOsArchitecture(), OSARCHITECTURE_BINDING);
            protocolMarshaller.marshall(databaseInstanceSoftwareDetailsResponse.getTooltip(), TOOLTIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

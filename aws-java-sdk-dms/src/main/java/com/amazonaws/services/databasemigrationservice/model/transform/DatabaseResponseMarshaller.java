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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatabaseResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatabaseResponseMarshaller {

    private static final MarshallingInfo<String> DATABASEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseId").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<Long> NUMBEROFSCHEMAS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfSchemas").build();
    private static final MarshallingInfo<StructuredPojo> SERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Server").build();
    private static final MarshallingInfo<StructuredPojo> SOFTWAREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SoftwareDetails").build();
    private static final MarshallingInfo<List> COLLECTORS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Collectors").build();

    private static final DatabaseResponseMarshaller instance = new DatabaseResponseMarshaller();

    public static DatabaseResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatabaseResponse databaseResponse, ProtocolMarshaller protocolMarshaller) {

        if (databaseResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(databaseResponse.getDatabaseId(), DATABASEID_BINDING);
            protocolMarshaller.marshall(databaseResponse.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(databaseResponse.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(databaseResponse.getNumberOfSchemas(), NUMBEROFSCHEMAS_BINDING);
            protocolMarshaller.marshall(databaseResponse.getServer(), SERVER_BINDING);
            protocolMarshaller.marshall(databaseResponse.getSoftwareDetails(), SOFTWAREDETAILS_BINDING);
            protocolMarshaller.marshall(databaseResponse.getCollectors(), COLLECTORS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.finspace.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KxDatabaseConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KxDatabaseConfigurationMarshaller {

    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("databaseName").build();
    private static final MarshallingInfo<List> CACHECONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheConfigurations").build();
    private static final MarshallingInfo<String> CHANGESETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("changesetId").build();
    private static final MarshallingInfo<String> DATAVIEWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataviewName").build();
    private static final MarshallingInfo<StructuredPojo> DATAVIEWCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataviewConfiguration").build();

    private static final KxDatabaseConfigurationMarshaller instance = new KxDatabaseConfigurationMarshaller();

    public static KxDatabaseConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KxDatabaseConfiguration kxDatabaseConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (kxDatabaseConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(kxDatabaseConfiguration.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(kxDatabaseConfiguration.getCacheConfigurations(), CACHECONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(kxDatabaseConfiguration.getChangesetId(), CHANGESETID_BINDING);
            protocolMarshaller.marshall(kxDatabaseConfiguration.getDataviewName(), DATAVIEWNAME_BINDING);
            protocolMarshaller.marshall(kxDatabaseConfiguration.getDataviewConfiguration(), DATAVIEWCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

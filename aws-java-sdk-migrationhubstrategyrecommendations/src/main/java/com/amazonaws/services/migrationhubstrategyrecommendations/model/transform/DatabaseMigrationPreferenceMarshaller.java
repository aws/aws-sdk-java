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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatabaseMigrationPreferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatabaseMigrationPreferenceMarshaller {

    private static final MarshallingInfo<StructuredPojo> HETEROGENEOUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("heterogeneous").build();
    private static final MarshallingInfo<StructuredPojo> HOMOGENEOUS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("homogeneous").build();
    private static final MarshallingInfo<StructuredPojo> NOPREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noPreference").build();

    private static final DatabaseMigrationPreferenceMarshaller instance = new DatabaseMigrationPreferenceMarshaller();

    public static DatabaseMigrationPreferenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatabaseMigrationPreference databaseMigrationPreference, ProtocolMarshaller protocolMarshaller) {

        if (databaseMigrationPreference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(databaseMigrationPreference.getHeterogeneous(), HETEROGENEOUS_BINDING);
            protocolMarshaller.marshall(databaseMigrationPreference.getHomogeneous(), HOMOGENEOUS_BINDING);
            protocolMarshaller.marshall(databaseMigrationPreference.getNoPreference(), NOPREFERENCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

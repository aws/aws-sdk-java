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
 * TimestreamSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TimestreamSettingsMarshaller {

    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<Integer> MEMORYDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryDuration").build();
    private static final MarshallingInfo<Integer> MAGNETICDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MagneticDuration").build();
    private static final MarshallingInfo<Boolean> CDCINSERTSANDUPDATES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcInsertsAndUpdates").build();
    private static final MarshallingInfo<Boolean> ENABLEMAGNETICSTOREWRITES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableMagneticStoreWrites").build();

    private static final TimestreamSettingsMarshaller instance = new TimestreamSettingsMarshaller();

    public static TimestreamSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TimestreamSettings timestreamSettings, ProtocolMarshaller protocolMarshaller) {

        if (timestreamSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(timestreamSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(timestreamSettings.getMemoryDuration(), MEMORYDURATION_BINDING);
            protocolMarshaller.marshall(timestreamSettings.getMagneticDuration(), MAGNETICDURATION_BINDING);
            protocolMarshaller.marshall(timestreamSettings.getCdcInsertsAndUpdates(), CDCINSERTSANDUPDATES_BINDING);
            protocolMarshaller.marshall(timestreamSettings.getEnableMagneticStoreWrites(), ENABLEMAGNETICSTOREWRITES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

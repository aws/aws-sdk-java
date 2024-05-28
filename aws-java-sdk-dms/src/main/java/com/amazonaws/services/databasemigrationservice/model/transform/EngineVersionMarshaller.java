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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EngineVersionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EngineVersionMarshaller {

    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<String> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lifecycle").build();
    private static final MarshallingInfo<String> RELEASESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseStatus").build();
    private static final MarshallingInfo<java.util.Date> LAUNCHDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> AUTOUPGRADEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoUpgradeDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DEPRECATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeprecationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> FORCEUPGRADEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForceUpgradeDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> AVAILABLEUPGRADES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailableUpgrades").build();

    private static final EngineVersionMarshaller instance = new EngineVersionMarshaller();

    public static EngineVersionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EngineVersion engineVersion, ProtocolMarshaller protocolMarshaller) {

        if (engineVersion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(engineVersion.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(engineVersion.getLifecycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(engineVersion.getReleaseStatus(), RELEASESTATUS_BINDING);
            protocolMarshaller.marshall(engineVersion.getLaunchDate(), LAUNCHDATE_BINDING);
            protocolMarshaller.marshall(engineVersion.getAutoUpgradeDate(), AUTOUPGRADEDATE_BINDING);
            protocolMarshaller.marshall(engineVersion.getDeprecationDate(), DEPRECATIONDATE_BINDING);
            protocolMarshaller.marshall(engineVersion.getForceUpgradeDate(), FORCEUPGRADEDATE_BINDING);
            protocolMarshaller.marshall(engineVersion.getAvailableUpgrades(), AVAILABLEUPGRADES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

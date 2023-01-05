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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanagerlinuxsubscriptions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LinuxSubscriptionsDiscoverySettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LinuxSubscriptionsDiscoverySettingsMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONINTEGRATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationIntegration").build();
    private static final MarshallingInfo<List> SOURCEREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SourceRegions").build();

    private static final LinuxSubscriptionsDiscoverySettingsMarshaller instance = new LinuxSubscriptionsDiscoverySettingsMarshaller();

    public static LinuxSubscriptionsDiscoverySettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings, ProtocolMarshaller protocolMarshaller) {

        if (linuxSubscriptionsDiscoverySettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(linuxSubscriptionsDiscoverySettings.getOrganizationIntegration(), ORGANIZATIONINTEGRATION_BINDING);
            protocolMarshaller.marshall(linuxSubscriptionsDiscoverySettings.getSourceRegions(), SOURCEREGIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

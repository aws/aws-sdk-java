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
package com.amazonaws.services.datazone.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EnvironmentBlueprintConfigurationItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EnvironmentBlueprintConfigurationItemMarshaller {

    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("domainId").build();
    private static final MarshallingInfo<List> ENABLEDREGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enabledRegions").build();
    private static final MarshallingInfo<String> ENVIRONMENTBLUEPRINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentBlueprintId").build();
    private static final MarshallingInfo<String> MANAGEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("manageAccessRoleArn").build();
    private static final MarshallingInfo<String> PROVISIONINGROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("provisioningRoleArn").build();
    private static final MarshallingInfo<Map> REGIONALPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("regionalParameters").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("iso8601").build();

    private static final EnvironmentBlueprintConfigurationItemMarshaller instance = new EnvironmentBlueprintConfigurationItemMarshaller();

    public static EnvironmentBlueprintConfigurationItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EnvironmentBlueprintConfigurationItem environmentBlueprintConfigurationItem, ProtocolMarshaller protocolMarshaller) {

        if (environmentBlueprintConfigurationItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getEnabledRegions(), ENABLEDREGIONS_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getEnvironmentBlueprintId(), ENVIRONMENTBLUEPRINTID_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getManageAccessRoleArn(), MANAGEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getProvisioningRoleArn(), PROVISIONINGROLEARN_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getRegionalParameters(), REGIONALPARAMETERS_BINDING);
            protocolMarshaller.marshall(environmentBlueprintConfigurationItem.getUpdatedAt(), UPDATEDAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OneDriveConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OneDriveConfigurationMarshaller {

    private static final MarshallingInfo<String> TENANTDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TenantDomain").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<StructuredPojo> ONEDRIVEUSERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OneDriveUsers").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();
    private static final MarshallingInfo<Boolean> DISABLELOCALGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableLocalGroups").build();

    private static final OneDriveConfigurationMarshaller instance = new OneDriveConfigurationMarshaller();

    public static OneDriveConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OneDriveConfiguration oneDriveConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (oneDriveConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oneDriveConfiguration.getTenantDomain(), TENANTDOMAIN_BINDING);
            protocolMarshaller.marshall(oneDriveConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(oneDriveConfiguration.getOneDriveUsers(), ONEDRIVEUSERS_BINDING);
            protocolMarshaller.marshall(oneDriveConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(oneDriveConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(oneDriveConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(oneDriveConfiguration.getDisableLocalGroups(), DISABLELOCALGROUPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

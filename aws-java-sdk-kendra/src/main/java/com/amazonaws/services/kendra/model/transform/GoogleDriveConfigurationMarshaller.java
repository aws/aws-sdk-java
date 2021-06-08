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
 * GoogleDriveConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GoogleDriveConfigurationMarshaller {

    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();
    private static final MarshallingInfo<List> EXCLUDEMIMETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeMimeTypes").build();
    private static final MarshallingInfo<List> EXCLUDEUSERACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeUserAccounts").build();
    private static final MarshallingInfo<List> EXCLUDESHAREDDRIVES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeSharedDrives").build();

    private static final GoogleDriveConfigurationMarshaller instance = new GoogleDriveConfigurationMarshaller();

    public static GoogleDriveConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GoogleDriveConfiguration googleDriveConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (googleDriveConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(googleDriveConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(googleDriveConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(googleDriveConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(googleDriveConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(googleDriveConfiguration.getExcludeMimeTypes(), EXCLUDEMIMETYPES_BINDING);
            protocolMarshaller.marshall(googleDriveConfiguration.getExcludeUserAccounts(), EXCLUDEUSERACCOUNTS_BINDING);
            protocolMarshaller.marshall(googleDriveConfiguration.getExcludeSharedDrives(), EXCLUDESHAREDDRIVES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

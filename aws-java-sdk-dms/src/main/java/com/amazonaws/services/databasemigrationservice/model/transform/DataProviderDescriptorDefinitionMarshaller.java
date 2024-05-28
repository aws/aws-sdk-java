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
 * DataProviderDescriptorDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DataProviderDescriptorDefinitionMarshaller {

    private static final MarshallingInfo<String> DATAPROVIDERIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataProviderIdentifier").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();

    private static final DataProviderDescriptorDefinitionMarshaller instance = new DataProviderDescriptorDefinitionMarshaller();

    public static DataProviderDescriptorDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DataProviderDescriptorDefinition dataProviderDescriptorDefinition, ProtocolMarshaller protocolMarshaller) {

        if (dataProviderDescriptorDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dataProviderDescriptorDefinition.getDataProviderIdentifier(), DATAPROVIDERIDENTIFIER_BINDING);
            protocolMarshaller.marshall(dataProviderDescriptorDefinition.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
            protocolMarshaller.marshall(dataProviderDescriptorDefinition.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

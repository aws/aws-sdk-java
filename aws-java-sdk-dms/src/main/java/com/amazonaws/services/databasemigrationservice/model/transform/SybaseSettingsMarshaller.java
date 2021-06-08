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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SybaseSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SybaseSettingsMarshaller {

    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();

    private static final SybaseSettingsMarshaller instance = new SybaseSettingsMarshaller();

    public static SybaseSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SybaseSettings sybaseSettings, ProtocolMarshaller protocolMarshaller) {

        if (sybaseSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sybaseSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(sybaseSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(sybaseSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(sybaseSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(sybaseSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(sybaseSettings.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(sybaseSettings.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

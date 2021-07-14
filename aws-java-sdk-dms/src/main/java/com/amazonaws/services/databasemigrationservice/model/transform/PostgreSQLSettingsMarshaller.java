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
 * PostgreSQLSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostgreSQLSettingsMarshaller {

    private static final MarshallingInfo<String> AFTERCONNECTSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AfterConnectScript").build();
    private static final MarshallingInfo<Boolean> CAPTUREDDLS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CaptureDdls").build();
    private static final MarshallingInfo<Integer> MAXFILESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFileSize").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> DDLARTIFACTSSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DdlArtifactsSchema").build();
    private static final MarshallingInfo<Integer> EXECUTETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecuteTimeout").build();
    private static final MarshallingInfo<Boolean> FAILTASKSONLOBTRUNCATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailTasksOnLobTruncation").build();
    private static final MarshallingInfo<Boolean> HEARTBEATENABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeartbeatEnable").build();
    private static final MarshallingInfo<String> HEARTBEATSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeartbeatSchema").build();
    private static final MarshallingInfo<Integer> HEARTBEATFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeartbeatFrequency").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> SLOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SlotName").build();
    private static final MarshallingInfo<String> PLUGINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PluginName").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();

    private static final PostgreSQLSettingsMarshaller instance = new PostgreSQLSettingsMarshaller();

    public static PostgreSQLSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostgreSQLSettings postgreSQLSettings, ProtocolMarshaller protocolMarshaller) {

        if (postgreSQLSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postgreSQLSettings.getAfterConnectScript(), AFTERCONNECTSCRIPT_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getCaptureDdls(), CAPTUREDDLS_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getMaxFileSize(), MAXFILESIZE_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getDdlArtifactsSchema(), DDLARTIFACTSSCHEMA_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getExecuteTimeout(), EXECUTETIMEOUT_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getFailTasksOnLobTruncation(), FAILTASKSONLOBTRUNCATION_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getHeartbeatEnable(), HEARTBEATENABLE_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getHeartbeatSchema(), HEARTBEATSCHEMA_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getHeartbeatFrequency(), HEARTBEATFREQUENCY_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getSlotName(), SLOTNAME_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getPluginName(), PLUGINNAME_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(postgreSQLSettings.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

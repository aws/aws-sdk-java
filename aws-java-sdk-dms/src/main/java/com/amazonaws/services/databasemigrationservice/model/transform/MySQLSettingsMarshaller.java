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
 * MySQLSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MySQLSettingsMarshaller {

    private static final MarshallingInfo<String> AFTERCONNECTSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AfterConnectScript").build();
    private static final MarshallingInfo<Boolean> CLEANSOURCEMETADATAONMISMATCH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CleanSourceMetadataOnMismatch").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<Integer> EVENTSPOLLINTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EventsPollInterval").build();
    private static final MarshallingInfo<String> TARGETDBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDbType").build();
    private static final MarshallingInfo<Integer> MAXFILESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFileSize").build();
    private static final MarshallingInfo<Integer> PARALLELLOADTHREADS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelLoadThreads").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> SERVERTIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerTimezone").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();

    private static final MySQLSettingsMarshaller instance = new MySQLSettingsMarshaller();

    public static MySQLSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MySQLSettings mySQLSettings, ProtocolMarshaller protocolMarshaller) {

        if (mySQLSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mySQLSettings.getAfterConnectScript(), AFTERCONNECTSCRIPT_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getCleanSourceMetadataOnMismatch(), CLEANSOURCEMETADATAONMISMATCH_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getEventsPollInterval(), EVENTSPOLLINTERVAL_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getTargetDbType(), TARGETDBTYPE_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getMaxFileSize(), MAXFILESIZE_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getParallelLoadThreads(), PARALLELLOADTHREADS_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getServerTimezone(), SERVERTIMEZONE_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(mySQLSettings.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

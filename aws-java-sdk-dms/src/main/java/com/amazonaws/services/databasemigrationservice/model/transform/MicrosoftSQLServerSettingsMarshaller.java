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
 * MicrosoftSQLServerSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MicrosoftSQLServerSettingsMarshaller {

    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<Integer> BCPPACKETSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BcpPacketSize").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> CONTROLTABLESFILEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ControlTablesFileGroup").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Boolean> QUERYSINGLEALWAYSONNODE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QuerySingleAlwaysOnNode").build();
    private static final MarshallingInfo<Boolean> READBACKUPONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadBackupOnly").build();
    private static final MarshallingInfo<String> SAFEGUARDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SafeguardPolicy").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<Boolean> USEBCPFULLLOAD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseBcpFullLoad").build();
    private static final MarshallingInfo<Boolean> USETHIRDPARTYBACKUPDEVICE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseThirdPartyBackupDevice").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();

    private static final MicrosoftSQLServerSettingsMarshaller instance = new MicrosoftSQLServerSettingsMarshaller();

    public static MicrosoftSQLServerSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MicrosoftSQLServerSettings microsoftSQLServerSettings, ProtocolMarshaller protocolMarshaller) {

        if (microsoftSQLServerSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(microsoftSQLServerSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getBcpPacketSize(), BCPPACKETSIZE_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getControlTablesFileGroup(), CONTROLTABLESFILEGROUP_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getQuerySingleAlwaysOnNode(), QUERYSINGLEALWAYSONNODE_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getReadBackupOnly(), READBACKUPONLY_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getSafeguardPolicy(), SAFEGUARDPOLICY_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getUseBcpFullLoad(), USEBCPFULLLOAD_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getUseThirdPartyBackupDevice(), USETHIRDPARTYBACKUPDEVICE_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(microsoftSQLServerSettings.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

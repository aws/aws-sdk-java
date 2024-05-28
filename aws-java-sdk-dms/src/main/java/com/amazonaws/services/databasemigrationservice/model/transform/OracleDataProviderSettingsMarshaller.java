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
 * OracleDataProviderSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OracleDataProviderSettingsMarshaller {

    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> SSLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SslMode").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> ASMSERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AsmServer").build();
    private static final MarshallingInfo<String> SECRETSMANAGERORACLEASMSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerOracleAsmSecretId").build();
    private static final MarshallingInfo<String> SECRETSMANAGERORACLEASMACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerOracleAsmAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECURITYDBENCRYPTIONSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecurityDbEncryptionSecretId").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECURITYDBENCRYPTIONACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecurityDbEncryptionAccessRoleArn").build();

    private static final OracleDataProviderSettingsMarshaller instance = new OracleDataProviderSettingsMarshaller();

    public static OracleDataProviderSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OracleDataProviderSettings oracleDataProviderSettings, ProtocolMarshaller protocolMarshaller) {

        if (oracleDataProviderSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oracleDataProviderSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getSslMode(), SSLMODE_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getAsmServer(), ASMSERVER_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getSecretsManagerOracleAsmSecretId(), SECRETSMANAGERORACLEASMSECRETID_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getSecretsManagerOracleAsmAccessRoleArn(), SECRETSMANAGERORACLEASMACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getSecretsManagerSecurityDbEncryptionSecretId(),
                    SECRETSMANAGERSECURITYDBENCRYPTIONSECRETID_BINDING);
            protocolMarshaller.marshall(oracleDataProviderSettings.getSecretsManagerSecurityDbEncryptionAccessRoleArn(),
                    SECRETSMANAGERSECURITYDBENCRYPTIONACCESSROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

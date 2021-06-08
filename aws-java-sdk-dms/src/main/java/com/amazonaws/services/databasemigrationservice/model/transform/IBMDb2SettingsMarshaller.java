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
 * IBMDb2SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IBMDb2SettingsMarshaller {

    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<Boolean> SETDATACAPTURECHANGES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SetDataCaptureChanges").build();
    private static final MarshallingInfo<String> CURRENTLSN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentLsn").build();
    private static final MarshallingInfo<Integer> MAXKBYTESPERREAD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxKBytesPerRead").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> SECRETSMANAGERACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerAccessRoleArn").build();
    private static final MarshallingInfo<String> SECRETSMANAGERSECRETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretsManagerSecretId").build();

    private static final IBMDb2SettingsMarshaller instance = new IBMDb2SettingsMarshaller();

    public static IBMDb2SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IBMDb2Settings iBMDb2Settings, ProtocolMarshaller protocolMarshaller) {

        if (iBMDb2Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(iBMDb2Settings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getSetDataCaptureChanges(), SETDATACAPTURECHANGES_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getCurrentLsn(), CURRENTLSN_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getMaxKBytesPerRead(), MAXKBYTESPERREAD_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getSecretsManagerAccessRoleArn(), SECRETSMANAGERACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(iBMDb2Settings.getSecretsManagerSecretId(), SECRETSMANAGERSECRETID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

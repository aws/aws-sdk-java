/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * OracleSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OracleSettingsMarshaller {

    private static final MarshallingInfo<String> ASMPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AsmPassword").build();
    private static final MarshallingInfo<String> ASMSERVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AsmServer").build();
    private static final MarshallingInfo<String> ASMUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AsmUser").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SECURITYDBENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityDbEncryption").build();
    private static final MarshallingInfo<String> SECURITYDBENCRYPTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityDbEncryptionName").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();

    private static final OracleSettingsMarshaller instance = new OracleSettingsMarshaller();

    public static OracleSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OracleSettings oracleSettings, ProtocolMarshaller protocolMarshaller) {

        if (oracleSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oracleSettings.getAsmPassword(), ASMPASSWORD_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAsmServer(), ASMSERVER_BINDING);
            protocolMarshaller.marshall(oracleSettings.getAsmUser(), ASMUSER_BINDING);
            protocolMarshaller.marshall(oracleSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(oracleSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecurityDbEncryption(), SECURITYDBENCRYPTION_BINDING);
            protocolMarshaller.marshall(oracleSettings.getSecurityDbEncryptionName(), SECURITYDBENCRYPTIONNAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(oracleSettings.getUsername(), USERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

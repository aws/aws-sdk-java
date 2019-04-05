/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * MongoDbSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MongoDbSettingsMarshaller {

    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> AUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthType").build();
    private static final MarshallingInfo<String> AUTHMECHANISM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthMechanism").build();
    private static final MarshallingInfo<String> NESTINGLEVEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NestingLevel").build();
    private static final MarshallingInfo<String> EXTRACTDOCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtractDocId").build();
    private static final MarshallingInfo<String> DOCSTOINVESTIGATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocsToInvestigate").build();
    private static final MarshallingInfo<String> AUTHSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthSource").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();

    private static final MongoDbSettingsMarshaller instance = new MongoDbSettingsMarshaller();

    public static MongoDbSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MongoDbSettings mongoDbSettings, ProtocolMarshaller protocolMarshaller) {

        if (mongoDbSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mongoDbSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getAuthType(), AUTHTYPE_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getAuthMechanism(), AUTHMECHANISM_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getNestingLevel(), NESTINGLEVEL_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getExtractDocId(), EXTRACTDOCID_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getDocsToInvestigate(), DOCSTOINVESTIGATE_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getAuthSource(), AUTHSOURCE_BINDING);
            protocolMarshaller.marshall(mongoDbSettings.getKmsKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

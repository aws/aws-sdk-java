/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * RedisSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedisSettingsMarshaller {

    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> SSLSECURITYPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslSecurityProtocol").build();
    private static final MarshallingInfo<String> AUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AuthType").build();
    private static final MarshallingInfo<String> AUTHUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthUserName").build();
    private static final MarshallingInfo<String> AUTHPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthPassword").build();
    private static final MarshallingInfo<String> SSLCACERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslCaCertificateArn").build();

    private static final RedisSettingsMarshaller instance = new RedisSettingsMarshaller();

    public static RedisSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedisSettings redisSettings, ProtocolMarshaller protocolMarshaller) {

        if (redisSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redisSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(redisSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(redisSettings.getSslSecurityProtocol(), SSLSECURITYPROTOCOL_BINDING);
            protocolMarshaller.marshall(redisSettings.getAuthType(), AUTHTYPE_BINDING);
            protocolMarshaller.marshall(redisSettings.getAuthUserName(), AUTHUSERNAME_BINDING);
            protocolMarshaller.marshall(redisSettings.getAuthPassword(), AUTHPASSWORD_BINDING);
            protocolMarshaller.marshall(redisSettings.getSslCaCertificateArn(), SSLCACERTIFICATEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.cloudwatchevents.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudwatchevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectionMarshaller {

    private static final MarshallingInfo<String> CONNECTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> CONNECTIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionState").build();
    private static final MarshallingInfo<String> STATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateReason").build();
    private static final MarshallingInfo<String> AUTHORIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthorizationType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTAUTHORIZEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAuthorizedTime").timestampFormat("unixTimestamp").build();

    private static final ConnectionMarshaller instance = new ConnectionMarshaller();

    public static ConnectionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Connection connection, ProtocolMarshaller protocolMarshaller) {

        if (connection == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connection.getConnectionArn(), CONNECTIONARN_BINDING);
            protocolMarshaller.marshall(connection.getName(), NAME_BINDING);
            protocolMarshaller.marshall(connection.getConnectionState(), CONNECTIONSTATE_BINDING);
            protocolMarshaller.marshall(connection.getStateReason(), STATEREASON_BINDING);
            protocolMarshaller.marshall(connection.getAuthorizationType(), AUTHORIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(connection.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(connection.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(connection.getLastAuthorizedTime(), LASTAUTHORIZEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

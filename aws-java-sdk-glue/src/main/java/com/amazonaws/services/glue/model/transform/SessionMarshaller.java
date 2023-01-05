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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SessionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<java.util.Date> CREATEDON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedOn").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorMessage").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<StructuredPojo> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Command").build();
    private static final MarshallingInfo<Map> DEFAULTARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultArguments").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Connections").build();
    private static final MarshallingInfo<Double> PROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Progress").build();
    private static final MarshallingInfo<Double> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCapacity").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<String> GLUEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlueVersion").build();

    private static final SessionMarshaller instance = new SessionMarshaller();

    public static SessionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Session session, ProtocolMarshaller protocolMarshaller) {

        if (session == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(session.getId(), ID_BINDING);
            protocolMarshaller.marshall(session.getCreatedOn(), CREATEDON_BINDING);
            protocolMarshaller.marshall(session.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(session.getErrorMessage(), ERRORMESSAGE_BINDING);
            protocolMarshaller.marshall(session.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(session.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(session.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(session.getDefaultArguments(), DEFAULTARGUMENTS_BINDING);
            protocolMarshaller.marshall(session.getConnections(), CONNECTIONS_BINDING);
            protocolMarshaller.marshall(session.getProgress(), PROGRESS_BINDING);
            protocolMarshaller.marshall(session.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(session.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(session.getGlueVersion(), GLUEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

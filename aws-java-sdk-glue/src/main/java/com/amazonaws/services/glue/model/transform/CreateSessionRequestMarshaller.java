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
 * CreateSessionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSessionRequestMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<StructuredPojo> COMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Command").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();
    private static final MarshallingInfo<Integer> IDLETIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdleTimeout").build();
    private static final MarshallingInfo<Map> DEFAULTARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultArguments").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Connections").build();
    private static final MarshallingInfo<Double> MAXCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxCapacity").build();
    private static final MarshallingInfo<Integer> NUMBEROFWORKERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfWorkers").build();
    private static final MarshallingInfo<String> WORKERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkerType").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<String> GLUEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GlueVersion").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> REQUESTORIGIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequestOrigin").build();

    private static final CreateSessionRequestMarshaller instance = new CreateSessionRequestMarshaller();

    public static CreateSessionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSessionRequest createSessionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createSessionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSessionRequest.getId(), ID_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getCommand(), COMMAND_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getTimeout(), TIMEOUT_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getIdleTimeout(), IDLETIMEOUT_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getDefaultArguments(), DEFAULTARGUMENTS_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getConnections(), CONNECTIONS_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getMaxCapacity(), MAXCAPACITY_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getNumberOfWorkers(), NUMBEROFWORKERS_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getWorkerType(), WORKERTYPE_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getGlueVersion(), GLUEVERSION_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createSessionRequest.getRequestOrigin(), REQUESTORIGIN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

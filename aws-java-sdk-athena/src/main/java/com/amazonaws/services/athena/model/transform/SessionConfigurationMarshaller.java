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
package com.amazonaws.services.athena.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SessionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionConfigurationMarshaller {

    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExecutionRole").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WorkingDirectory").build();
    private static final MarshallingInfo<Long> IDLETIMEOUTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdleTimeoutSeconds").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfiguration").build();

    private static final SessionConfigurationMarshaller instance = new SessionConfigurationMarshaller();

    public static SessionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionConfiguration sessionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sessionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionConfiguration.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(sessionConfiguration.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
            protocolMarshaller.marshall(sessionConfiguration.getIdleTimeoutSeconds(), IDLETIMEOUTSECONDS_BINDING);
            protocolMarshaller.marshall(sessionConfiguration.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

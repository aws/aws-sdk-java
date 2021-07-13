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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelbuilding.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartMigrationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartMigrationRequestMarshaller {

    private static final MarshallingInfo<String> V1BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("v1BotName").build();
    private static final MarshallingInfo<String> V1BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("v1BotVersion").build();
    private static final MarshallingInfo<String> V2BOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("v2BotName").build();
    private static final MarshallingInfo<String> V2BOTROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("v2BotRole").build();
    private static final MarshallingInfo<String> MIGRATIONSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("migrationStrategy").build();

    private static final StartMigrationRequestMarshaller instance = new StartMigrationRequestMarshaller();

    public static StartMigrationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartMigrationRequest startMigrationRequest, ProtocolMarshaller protocolMarshaller) {

        if (startMigrationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startMigrationRequest.getV1BotName(), V1BOTNAME_BINDING);
            protocolMarshaller.marshall(startMigrationRequest.getV1BotVersion(), V1BOTVERSION_BINDING);
            protocolMarshaller.marshall(startMigrationRequest.getV2BotName(), V2BOTNAME_BINDING);
            protocolMarshaller.marshall(startMigrationRequest.getV2BotRole(), V2BOTROLE_BINDING);
            protocolMarshaller.marshall(startMigrationRequest.getMigrationStrategy(), MIGRATIONSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

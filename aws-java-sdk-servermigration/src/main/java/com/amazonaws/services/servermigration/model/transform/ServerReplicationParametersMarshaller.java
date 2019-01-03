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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServerReplicationParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServerReplicationParametersMarshaller {

    private static final MarshallingInfo<java.util.Date> SEEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("seedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> FREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frequency").build();
    private static final MarshallingInfo<Boolean> RUNONCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runOnce").build();
    private static final MarshallingInfo<String> LICENSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseType").build();
    private static final MarshallingInfo<Integer> NUMBEROFRECENTAMISTOKEEP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRecentAmisToKeep").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();

    private static final ServerReplicationParametersMarshaller instance = new ServerReplicationParametersMarshaller();

    public static ServerReplicationParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServerReplicationParameters serverReplicationParameters, ProtocolMarshaller protocolMarshaller) {

        if (serverReplicationParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serverReplicationParameters.getSeedTime(), SEEDTIME_BINDING);
            protocolMarshaller.marshall(serverReplicationParameters.getFrequency(), FREQUENCY_BINDING);
            protocolMarshaller.marshall(serverReplicationParameters.getRunOnce(), RUNONCE_BINDING);
            protocolMarshaller.marshall(serverReplicationParameters.getLicenseType(), LICENSETYPE_BINDING);
            protocolMarshaller.marshall(serverReplicationParameters.getNumberOfRecentAmisToKeep(), NUMBEROFRECENTAMISTOKEEP_BINDING);
            protocolMarshaller.marshall(serverReplicationParameters.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(serverReplicationParameters.getKmsKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

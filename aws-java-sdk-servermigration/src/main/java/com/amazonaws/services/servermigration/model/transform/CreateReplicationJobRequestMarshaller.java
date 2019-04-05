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
 * CreateReplicationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateReplicationJobRequestMarshaller {

    private static final MarshallingInfo<String> SERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("serverId").build();
    private static final MarshallingInfo<java.util.Date> SEEDREPLICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("seedReplicationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> FREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("frequency").build();
    private static final MarshallingInfo<Boolean> RUNONCE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("runOnce").build();
    private static final MarshallingInfo<String> LICENSETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseType").build();
    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Integer> NUMBEROFRECENTAMISTOKEEP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRecentAmisToKeep").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encrypted").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();

    private static final CreateReplicationJobRequestMarshaller instance = new CreateReplicationJobRequestMarshaller();

    public static CreateReplicationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateReplicationJobRequest createReplicationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (createReplicationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createReplicationJobRequest.getServerId(), SERVERID_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getSeedReplicationTime(), SEEDREPLICATIONTIME_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getFrequency(), FREQUENCY_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getRunOnce(), RUNONCE_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getLicenseType(), LICENSETYPE_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getRoleName(), ROLENAME_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getNumberOfRecentAmisToKeep(), NUMBEROFRECENTAMISTOKEEP_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(createReplicationJobRequest.getKmsKeyId(), KMSKEYID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

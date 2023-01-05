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
package com.amazonaws.services.drs.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFailbackReplicationConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFailbackReplicationConfigurationRequestMarshaller {

    private static final MarshallingInfo<Long> BANDWIDTHTHROTTLING_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("bandwidthThrottling").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> RECOVERYINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recoveryInstanceID").build();
    private static final MarshallingInfo<Boolean> USEPRIVATEIP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("usePrivateIP").build();

    private static final UpdateFailbackReplicationConfigurationRequestMarshaller instance = new UpdateFailbackReplicationConfigurationRequestMarshaller();

    public static UpdateFailbackReplicationConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFailbackReplicationConfigurationRequest updateFailbackReplicationConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFailbackReplicationConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFailbackReplicationConfigurationRequest.getBandwidthThrottling(), BANDWIDTHTHROTTLING_BINDING);
            protocolMarshaller.marshall(updateFailbackReplicationConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateFailbackReplicationConfigurationRequest.getRecoveryInstanceID(), RECOVERYINSTANCEID_BINDING);
            protocolMarshaller.marshall(updateFailbackReplicationConfigurationRequest.getUsePrivateIP(), USEPRIVATEIP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

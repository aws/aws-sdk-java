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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.drs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RecoveryInstanceDataReplicationInitiationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RecoveryInstanceDataReplicationInitiationMarshaller {

    private static final MarshallingInfo<String> STARTDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startDateTime").build();
    private static final MarshallingInfo<List> STEPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("steps").build();

    private static final RecoveryInstanceDataReplicationInitiationMarshaller instance = new RecoveryInstanceDataReplicationInitiationMarshaller();

    public static RecoveryInstanceDataReplicationInitiationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RecoveryInstanceDataReplicationInitiation recoveryInstanceDataReplicationInitiation, ProtocolMarshaller protocolMarshaller) {

        if (recoveryInstanceDataReplicationInitiation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInitiation.getStartDateTime(), STARTDATETIME_BINDING);
            protocolMarshaller.marshall(recoveryInstanceDataReplicationInitiation.getSteps(), STEPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

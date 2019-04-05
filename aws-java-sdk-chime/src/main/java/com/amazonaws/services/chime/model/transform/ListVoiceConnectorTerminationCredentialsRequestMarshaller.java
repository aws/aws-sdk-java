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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListVoiceConnectorTerminationCredentialsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListVoiceConnectorTerminationCredentialsRequestMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("voiceConnectorId").build();

    private static final ListVoiceConnectorTerminationCredentialsRequestMarshaller instance = new ListVoiceConnectorTerminationCredentialsRequestMarshaller();

    public static ListVoiceConnectorTerminationCredentialsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listVoiceConnectorTerminationCredentialsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listVoiceConnectorTerminationCredentialsRequest.getVoiceConnectorId(), VOICECONNECTORID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

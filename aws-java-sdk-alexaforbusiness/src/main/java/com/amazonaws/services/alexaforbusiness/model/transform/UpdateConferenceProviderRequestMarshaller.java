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
package com.amazonaws.services.alexaforbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateConferenceProviderRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateConferenceProviderRequestMarshaller {

    private static final MarshallingInfo<String> CONFERENCEPROVIDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConferenceProviderArn").build();
    private static final MarshallingInfo<String> CONFERENCEPROVIDERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConferenceProviderType").build();
    private static final MarshallingInfo<StructuredPojo> IPDIALIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IPDialIn").build();
    private static final MarshallingInfo<StructuredPojo> PSTNDIALIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PSTNDialIn").build();
    private static final MarshallingInfo<StructuredPojo> MEETINGSETTING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MeetingSetting").build();

    private static final UpdateConferenceProviderRequestMarshaller instance = new UpdateConferenceProviderRequestMarshaller();

    public static UpdateConferenceProviderRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateConferenceProviderRequest updateConferenceProviderRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateConferenceProviderRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateConferenceProviderRequest.getConferenceProviderArn(), CONFERENCEPROVIDERARN_BINDING);
            protocolMarshaller.marshall(updateConferenceProviderRequest.getConferenceProviderType(), CONFERENCEPROVIDERTYPE_BINDING);
            protocolMarshaller.marshall(updateConferenceProviderRequest.getIPDialIn(), IPDIALIN_BINDING);
            protocolMarshaller.marshall(updateConferenceProviderRequest.getPSTNDialIn(), PSTNDIALIN_BINDING);
            protocolMarshaller.marshall(updateConferenceProviderRequest.getMeetingSetting(), MEETINGSETTING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

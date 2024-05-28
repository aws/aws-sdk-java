/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CommitmentInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CommitmentInformationMarshaller {

    private static final MarshallingInfo<StructuredPojo> COMMITMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commitmentConfiguration").build();
    private static final MarshallingInfo<java.util.Date> EXPIRESON_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expiresOn").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> STARTAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startAt").timestampFormat("iso8601").build();

    private static final CommitmentInformationMarshaller instance = new CommitmentInformationMarshaller();

    public static CommitmentInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CommitmentInformation commitmentInformation, ProtocolMarshaller protocolMarshaller) {

        if (commitmentInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(commitmentInformation.getCommitmentConfiguration(), COMMITMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(commitmentInformation.getExpiresOn(), EXPIRESON_BINDING);
            protocolMarshaller.marshall(commitmentInformation.getStartAt(), STARTAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

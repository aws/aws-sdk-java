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
package com.amazonaws.services.quicksight.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GenerateEmbedUrlForRegisteredUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenerateEmbedUrlForRegisteredUserRequestMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("AwsAccountId").build();
    private static final MarshallingInfo<Long> SESSIONLIFETIMEINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionLifetimeInMinutes").build();
    private static final MarshallingInfo<String> USERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserArn").build();
    private static final MarshallingInfo<StructuredPojo> EXPERIENCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExperienceConfiguration").build();
    private static final MarshallingInfo<List> ALLOWEDDOMAINS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedDomains").build();

    private static final GenerateEmbedUrlForRegisteredUserRequestMarshaller instance = new GenerateEmbedUrlForRegisteredUserRequestMarshaller();

    public static GenerateEmbedUrlForRegisteredUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GenerateEmbedUrlForRegisteredUserRequest generateEmbedUrlForRegisteredUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (generateEmbedUrlForRegisteredUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generateEmbedUrlForRegisteredUserRequest.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(generateEmbedUrlForRegisteredUserRequest.getSessionLifetimeInMinutes(), SESSIONLIFETIMEINMINUTES_BINDING);
            protocolMarshaller.marshall(generateEmbedUrlForRegisteredUserRequest.getUserArn(), USERARN_BINDING);
            protocolMarshaller.marshall(generateEmbedUrlForRegisteredUserRequest.getExperienceConfiguration(), EXPERIENCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(generateEmbedUrlForRegisteredUserRequest.getAllowedDomains(), ALLOWEDDOMAINS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

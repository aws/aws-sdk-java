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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateStudioRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateStudioRequestMarshaller {

    private static final MarshallingInfo<String> ADMINROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("adminRoleArn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Token")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<StructuredPojo> STUDIOENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioEncryptionConfiguration").build();
    private static final MarshallingInfo<String> STUDIONAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioName").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> USERROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userRoleArn").build();

    private static final CreateStudioRequestMarshaller instance = new CreateStudioRequestMarshaller();

    public static CreateStudioRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateStudioRequest createStudioRequest, ProtocolMarshaller protocolMarshaller) {

        if (createStudioRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createStudioRequest.getAdminRoleArn(), ADMINROLEARN_BINDING);
            protocolMarshaller.marshall(createStudioRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createStudioRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(createStudioRequest.getStudioEncryptionConfiguration(), STUDIOENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createStudioRequest.getStudioName(), STUDIONAME_BINDING);
            protocolMarshaller.marshall(createStudioRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createStudioRequest.getUserRoleArn(), USERROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

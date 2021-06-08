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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteStudioSessionMappingRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteStudioSessionMappingRequestMarshaller {

    private static final MarshallingInfo<String> STUDIOID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StudioId").build();
    private static final MarshallingInfo<String> IDENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityId").build();
    private static final MarshallingInfo<String> IDENTITYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityName").build();
    private static final MarshallingInfo<String> IDENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityType").build();

    private static final DeleteStudioSessionMappingRequestMarshaller instance = new DeleteStudioSessionMappingRequestMarshaller();

    public static DeleteStudioSessionMappingRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteStudioSessionMappingRequest deleteStudioSessionMappingRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteStudioSessionMappingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteStudioSessionMappingRequest.getStudioId(), STUDIOID_BINDING);
            protocolMarshaller.marshall(deleteStudioSessionMappingRequest.getIdentityId(), IDENTITYID_BINDING);
            protocolMarshaller.marshall(deleteStudioSessionMappingRequest.getIdentityName(), IDENTITYNAME_BINDING);
            protocolMarshaller.marshall(deleteStudioSessionMappingRequest.getIdentityType(), IDENTITYTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

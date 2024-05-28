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
package com.amazonaws.services.ram.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ram.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReplacePermissionAssociationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplacePermissionAssociationsRequestMarshaller {

    private static final MarshallingInfo<String> FROMPERMISSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromPermissionArn").build();
    private static final MarshallingInfo<Integer> FROMPERMISSIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromPermissionVersion").build();
    private static final MarshallingInfo<String> TOPERMISSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toPermissionArn").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken").build();

    private static final ReplacePermissionAssociationsRequestMarshaller instance = new ReplacePermissionAssociationsRequestMarshaller();

    public static ReplacePermissionAssociationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplacePermissionAssociationsRequest replacePermissionAssociationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (replacePermissionAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replacePermissionAssociationsRequest.getFromPermissionArn(), FROMPERMISSIONARN_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsRequest.getFromPermissionVersion(), FROMPERMISSIONVERSION_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsRequest.getToPermissionArn(), TOPERMISSIONARN_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

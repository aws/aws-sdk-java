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
 * ReplacePermissionAssociationsWorkMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReplacePermissionAssociationsWorkMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> FROMPERMISSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromPermissionArn").build();
    private static final MarshallingInfo<String> FROMPERMISSIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromPermissionVersion").build();
    private static final MarshallingInfo<String> TOPERMISSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toPermissionArn").build();
    private static final MarshallingInfo<String> TOPERMISSIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("toPermissionVersion").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").timestampFormat("unixTimestamp").build();

    private static final ReplacePermissionAssociationsWorkMarshaller instance = new ReplacePermissionAssociationsWorkMarshaller();

    public static ReplacePermissionAssociationsWorkMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReplacePermissionAssociationsWork replacePermissionAssociationsWork, ProtocolMarshaller protocolMarshaller) {

        if (replacePermissionAssociationsWork == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getId(), ID_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getFromPermissionArn(), FROMPERMISSIONARN_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getFromPermissionVersion(), FROMPERMISSIONVERSION_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getToPermissionArn(), TOPERMISSIONARN_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getToPermissionVersion(), TOPERMISSIONVERSION_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(replacePermissionAssociationsWork.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

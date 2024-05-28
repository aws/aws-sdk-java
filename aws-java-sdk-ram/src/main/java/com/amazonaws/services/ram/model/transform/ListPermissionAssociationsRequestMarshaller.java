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
 * ListPermissionAssociationsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListPermissionAssociationsRequestMarshaller {

    private static final MarshallingInfo<String> PERMISSIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionArn").build();
    private static final MarshallingInfo<Integer> PERMISSIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permissionVersion").build();
    private static final MarshallingInfo<String> ASSOCIATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associationStatus").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> FEATURESET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("featureSet").build();
    private static final MarshallingInfo<Boolean> DEFAULTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultVersion").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();

    private static final ListPermissionAssociationsRequestMarshaller instance = new ListPermissionAssociationsRequestMarshaller();

    public static ListPermissionAssociationsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListPermissionAssociationsRequest listPermissionAssociationsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listPermissionAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getPermissionArn(), PERMISSIONARN_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getPermissionVersion(), PERMISSIONVERSION_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getAssociationStatus(), ASSOCIATIONSTATUS_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getFeatureSet(), FEATURESET_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getDefaultVersion(), DEFAULTVERSION_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listPermissionAssociationsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

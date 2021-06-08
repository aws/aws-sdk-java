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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssociateOpsItemRelatedItemRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssociateOpsItemRelatedItemRequestMarshaller {

    private static final MarshallingInfo<String> OPSITEMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OpsItemId").build();
    private static final MarshallingInfo<String> ASSOCIATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationType").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> RESOURCEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceUri").build();

    private static final AssociateOpsItemRelatedItemRequestMarshaller instance = new AssociateOpsItemRelatedItemRequestMarshaller();

    public static AssociateOpsItemRelatedItemRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssociateOpsItemRelatedItemRequest associateOpsItemRelatedItemRequest, ProtocolMarshaller protocolMarshaller) {

        if (associateOpsItemRelatedItemRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(associateOpsItemRelatedItemRequest.getOpsItemId(), OPSITEMID_BINDING);
            protocolMarshaller.marshall(associateOpsItemRelatedItemRequest.getAssociationType(), ASSOCIATIONTYPE_BINDING);
            protocolMarshaller.marshall(associateOpsItemRelatedItemRequest.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(associateOpsItemRelatedItemRequest.getResourceUri(), RESOURCEURI_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

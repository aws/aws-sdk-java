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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NamespaceInfoV2Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NamespaceInfoV2Marshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> CAPACITYREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityRegion").build();
    private static final MarshallingInfo<String> CREATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationStatus").build();
    private static final MarshallingInfo<String> IDENTITYSTORE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityStore").build();
    private static final MarshallingInfo<StructuredPojo> NAMESPACEERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NamespaceError").build();

    private static final NamespaceInfoV2Marshaller instance = new NamespaceInfoV2Marshaller();

    public static NamespaceInfoV2Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NamespaceInfoV2 namespaceInfoV2, ProtocolMarshaller protocolMarshaller) {

        if (namespaceInfoV2 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(namespaceInfoV2.getName(), NAME_BINDING);
            protocolMarshaller.marshall(namespaceInfoV2.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(namespaceInfoV2.getCapacityRegion(), CAPACITYREGION_BINDING);
            protocolMarshaller.marshall(namespaceInfoV2.getCreationStatus(), CREATIONSTATUS_BINDING);
            protocolMarshaller.marshall(namespaceInfoV2.getIdentityStore(), IDENTITYSTORE_BINDING);
            protocolMarshaller.marshall(namespaceInfoV2.getNamespaceError(), NAMESPACEERROR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TypedLinkSpecifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TypedLinkSpecifierMarshaller {

    private static final MarshallingInfo<StructuredPojo> TYPEDLINKFACET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TypedLinkFacet").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEOBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceObjectReference").build();
    private static final MarshallingInfo<StructuredPojo> TARGETOBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetObjectReference").build();
    private static final MarshallingInfo<List> IDENTITYATTRIBUTEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityAttributeValues").build();

    private static final TypedLinkSpecifierMarshaller instance = new TypedLinkSpecifierMarshaller();

    public static TypedLinkSpecifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TypedLinkSpecifier typedLinkSpecifier, ProtocolMarshaller protocolMarshaller) {

        if (typedLinkSpecifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(typedLinkSpecifier.getTypedLinkFacet(), TYPEDLINKFACET_BINDING);
            protocolMarshaller.marshall(typedLinkSpecifier.getSourceObjectReference(), SOURCEOBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(typedLinkSpecifier.getTargetObjectReference(), TARGETOBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(typedLinkSpecifier.getIdentityAttributeValues(), IDENTITYATTRIBUTEVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

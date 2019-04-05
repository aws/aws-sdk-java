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
 * AttachTypedLinkRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AttachTypedLinkRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-data-partition").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEOBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceObjectReference").build();
    private static final MarshallingInfo<StructuredPojo> TARGETOBJECTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetObjectReference").build();
    private static final MarshallingInfo<StructuredPojo> TYPEDLINKFACET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TypedLinkFacet").build();
    private static final MarshallingInfo<List> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();

    private static final AttachTypedLinkRequestMarshaller instance = new AttachTypedLinkRequestMarshaller();

    public static AttachTypedLinkRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AttachTypedLinkRequest attachTypedLinkRequest, ProtocolMarshaller protocolMarshaller) {

        if (attachTypedLinkRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(attachTypedLinkRequest.getDirectoryArn(), DIRECTORYARN_BINDING);
            protocolMarshaller.marshall(attachTypedLinkRequest.getSourceObjectReference(), SOURCEOBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(attachTypedLinkRequest.getTargetObjectReference(), TARGETOBJECTREFERENCE_BINDING);
            protocolMarshaller.marshall(attachTypedLinkRequest.getTypedLinkFacet(), TYPEDLINKFACET_BINDING);
            protocolMarshaller.marshall(attachTypedLinkRequest.getAttributes(), ATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ViewRepresentationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ViewRepresentationMarshaller {

    private static final MarshallingInfo<String> DIALECT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Dialect").build();
    private static final MarshallingInfo<String> DIALECTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DialectVersion").build();
    private static final MarshallingInfo<String> VIEWORIGINALTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewOriginalText").build();
    private static final MarshallingInfo<String> VIEWEXPANDEDTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViewExpandedText").build();
    private static final MarshallingInfo<Boolean> ISSTALE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IsStale").build();

    private static final ViewRepresentationMarshaller instance = new ViewRepresentationMarshaller();

    public static ViewRepresentationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ViewRepresentation viewRepresentation, ProtocolMarshaller protocolMarshaller) {

        if (viewRepresentation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(viewRepresentation.getDialect(), DIALECT_BINDING);
            protocolMarshaller.marshall(viewRepresentation.getDialectVersion(), DIALECTVERSION_BINDING);
            protocolMarshaller.marshall(viewRepresentation.getViewOriginalText(), VIEWORIGINALTEXT_BINDING);
            protocolMarshaller.marshall(viewRepresentation.getViewExpandedText(), VIEWEXPANDEDTEXT_BINDING);
            protocolMarshaller.marshall(viewRepresentation.getIsStale(), ISSTALE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

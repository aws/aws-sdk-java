/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DocumentAttributeTargetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DocumentAttributeTargetMarshaller {

    private static final MarshallingInfo<String> TARGETDOCUMENTATTRIBUTEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDocumentAttributeKey").build();
    private static final MarshallingInfo<Boolean> TARGETDOCUMENTATTRIBUTEVALUEDELETION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDocumentAttributeValueDeletion").build();
    private static final MarshallingInfo<StructuredPojo> TARGETDOCUMENTATTRIBUTEVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetDocumentAttributeValue").build();

    private static final DocumentAttributeTargetMarshaller instance = new DocumentAttributeTargetMarshaller();

    public static DocumentAttributeTargetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DocumentAttributeTarget documentAttributeTarget, ProtocolMarshaller protocolMarshaller) {

        if (documentAttributeTarget == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(documentAttributeTarget.getTargetDocumentAttributeKey(), TARGETDOCUMENTATTRIBUTEKEY_BINDING);
            protocolMarshaller.marshall(documentAttributeTarget.getTargetDocumentAttributeValueDeletion(), TARGETDOCUMENTATTRIBUTEVALUEDELETION_BINDING);
            protocolMarshaller.marshall(documentAttributeTarget.getTargetDocumentAttributeValue(), TARGETDOCUMENTATTRIBUTEVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.textract.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.textract.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IdentityDocumentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IdentityDocumentMarshaller {

    private static final MarshallingInfo<Integer> DOCUMENTINDEX_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentIndex").build();
    private static final MarshallingInfo<List> IDENTITYDOCUMENTFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IdentityDocumentFields").build();
    private static final MarshallingInfo<List> BLOCKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Blocks").build();

    private static final IdentityDocumentMarshaller instance = new IdentityDocumentMarshaller();

    public static IdentityDocumentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IdentityDocument identityDocument, ProtocolMarshaller protocolMarshaller) {

        if (identityDocument == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(identityDocument.getDocumentIndex(), DOCUMENTINDEX_BINDING);
            protocolMarshaller.marshall(identityDocument.getIdentityDocumentFields(), IDENTITYDOCUMENTFIELDS_BINDING);
            protocolMarshaller.marshall(identityDocument.getBlocks(), BLOCKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

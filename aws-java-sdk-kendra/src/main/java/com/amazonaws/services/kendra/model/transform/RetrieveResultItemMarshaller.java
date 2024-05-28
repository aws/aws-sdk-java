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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RetrieveResultItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RetrieveResultItemMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Id").build();
    private static final MarshallingInfo<String> DOCUMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentId").build();
    private static final MarshallingInfo<String> DOCUMENTTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentTitle").build();
    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Content").build();
    private static final MarshallingInfo<String> DOCUMENTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentURI").build();
    private static final MarshallingInfo<List> DOCUMENTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentAttributes").build();
    private static final MarshallingInfo<StructuredPojo> SCOREATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScoreAttributes").build();

    private static final RetrieveResultItemMarshaller instance = new RetrieveResultItemMarshaller();

    public static RetrieveResultItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RetrieveResultItem retrieveResultItem, ProtocolMarshaller protocolMarshaller) {

        if (retrieveResultItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(retrieveResultItem.getId(), ID_BINDING);
            protocolMarshaller.marshall(retrieveResultItem.getDocumentId(), DOCUMENTID_BINDING);
            protocolMarshaller.marshall(retrieveResultItem.getDocumentTitle(), DOCUMENTTITLE_BINDING);
            protocolMarshaller.marshall(retrieveResultItem.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(retrieveResultItem.getDocumentURI(), DOCUMENTURI_BINDING);
            protocolMarshaller.marshall(retrieveResultItem.getDocumentAttributes(), DOCUMENTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(retrieveResultItem.getScoreAttributes(), SCOREATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

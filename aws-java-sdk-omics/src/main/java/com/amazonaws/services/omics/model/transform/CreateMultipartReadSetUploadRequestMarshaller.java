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
package com.amazonaws.services.omics.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateMultipartReadSetUploadRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateMultipartReadSetUploadRequestMarshaller {

    private static final MarshallingInfo<String> SEQUENCESTOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("sequenceStoreId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken").build();
    private static final MarshallingInfo<String> SOURCEFILETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFileType").build();
    private static final MarshallingInfo<String> SUBJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subjectId").build();
    private static final MarshallingInfo<String> SAMPLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sampleId").build();
    private static final MarshallingInfo<String> GENERATEDFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("generatedFrom").build();
    private static final MarshallingInfo<String> REFERENCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("referenceArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateMultipartReadSetUploadRequestMarshaller instance = new CreateMultipartReadSetUploadRequestMarshaller();

    public static CreateMultipartReadSetUploadRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateMultipartReadSetUploadRequest createMultipartReadSetUploadRequest, ProtocolMarshaller protocolMarshaller) {

        if (createMultipartReadSetUploadRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getSequenceStoreId(), SEQUENCESTOREID_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getSourceFileType(), SOURCEFILETYPE_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getSubjectId(), SUBJECTID_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getSampleId(), SAMPLEID_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getGeneratedFrom(), GENERATEDFROM_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getReferenceArn(), REFERENCEARN_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createMultipartReadSetUploadRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

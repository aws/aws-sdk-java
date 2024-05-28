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
 * MultipartReadSetUploadListItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MultipartReadSetUploadListItemMarshaller {

    private static final MarshallingInfo<String> SEQUENCESTOREID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sequenceStoreId").build();
    private static final MarshallingInfo<String> UPLOADID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("uploadId").build();
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
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("iso8601").build();

    private static final MultipartReadSetUploadListItemMarshaller instance = new MultipartReadSetUploadListItemMarshaller();

    public static MultipartReadSetUploadListItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MultipartReadSetUploadListItem multipartReadSetUploadListItem, ProtocolMarshaller protocolMarshaller) {

        if (multipartReadSetUploadListItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getSequenceStoreId(), SEQUENCESTOREID_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getUploadId(), UPLOADID_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getSourceFileType(), SOURCEFILETYPE_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getSubjectId(), SUBJECTID_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getSampleId(), SAMPLEID_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getGeneratedFrom(), GENERATEDFROM_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getReferenceArn(), REFERENCEARN_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(multipartReadSetUploadListItem.getCreationTime(), CREATIONTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

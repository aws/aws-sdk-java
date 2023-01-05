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
package com.amazonaws.services.omics.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.omics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportReadSetSourceItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportReadSetSourceItemMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> GENERATEDFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("generatedFrom").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> REFERENCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("referenceArn").build();
    private static final MarshallingInfo<String> SAMPLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sampleId").build();
    private static final MarshallingInfo<String> SOURCEFILETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFileType").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEFILES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFiles").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> SUBJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subjectId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ImportReadSetSourceItemMarshaller instance = new ImportReadSetSourceItemMarshaller();

    public static ImportReadSetSourceItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportReadSetSourceItem importReadSetSourceItem, ProtocolMarshaller protocolMarshaller) {

        if (importReadSetSourceItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importReadSetSourceItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getGeneratedFrom(), GENERATEDFROM_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getReferenceArn(), REFERENCEARN_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getSampleId(), SAMPLEID_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getSourceFileType(), SOURCEFILETYPE_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getSourceFiles(), SOURCEFILES_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getSubjectId(), SUBJECTID_BINDING);
            protocolMarshaller.marshall(importReadSetSourceItem.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * StartReadSetImportJobSourceItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartReadSetImportJobSourceItemMarshaller {

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
    private static final MarshallingInfo<String> SUBJECTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subjectId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final StartReadSetImportJobSourceItemMarshaller instance = new StartReadSetImportJobSourceItemMarshaller();

    public static StartReadSetImportJobSourceItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartReadSetImportJobSourceItem startReadSetImportJobSourceItem, ProtocolMarshaller protocolMarshaller) {

        if (startReadSetImportJobSourceItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getGeneratedFrom(), GENERATEDFROM_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getName(), NAME_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getReferenceArn(), REFERENCEARN_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getSampleId(), SAMPLEID_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getSourceFileType(), SOURCEFILETYPE_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getSourceFiles(), SOURCEFILES_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getSubjectId(), SUBJECTID_BINDING);
            protocolMarshaller.marshall(startReadSetImportJobSourceItem.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

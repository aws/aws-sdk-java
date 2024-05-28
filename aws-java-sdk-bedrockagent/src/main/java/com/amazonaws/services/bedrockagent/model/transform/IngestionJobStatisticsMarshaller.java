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
package com.amazonaws.services.bedrockagent.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockagent.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IngestionJobStatisticsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IngestionJobStatisticsMarshaller {

    private static final MarshallingInfo<Long> NUMBEROFDOCUMENTSDELETED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfDocumentsDeleted").build();
    private static final MarshallingInfo<Long> NUMBEROFDOCUMENTSFAILED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfDocumentsFailed").build();
    private static final MarshallingInfo<Long> NUMBEROFDOCUMENTSSCANNED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfDocumentsScanned").build();
    private static final MarshallingInfo<Long> NUMBEROFMETADATADOCUMENTSMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfMetadataDocumentsModified").build();
    private static final MarshallingInfo<Long> NUMBEROFMETADATADOCUMENTSSCANNED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfMetadataDocumentsScanned").build();
    private static final MarshallingInfo<Long> NUMBEROFMODIFIEDDOCUMENTSINDEXED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfModifiedDocumentsIndexed").build();
    private static final MarshallingInfo<Long> NUMBEROFNEWDOCUMENTSINDEXED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfNewDocumentsIndexed").build();

    private static final IngestionJobStatisticsMarshaller instance = new IngestionJobStatisticsMarshaller();

    public static IngestionJobStatisticsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IngestionJobStatistics ingestionJobStatistics, ProtocolMarshaller protocolMarshaller) {

        if (ingestionJobStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfDocumentsDeleted(), NUMBEROFDOCUMENTSDELETED_BINDING);
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfDocumentsFailed(), NUMBEROFDOCUMENTSFAILED_BINDING);
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfDocumentsScanned(), NUMBEROFDOCUMENTSSCANNED_BINDING);
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfMetadataDocumentsModified(), NUMBEROFMETADATADOCUMENTSMODIFIED_BINDING);
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfMetadataDocumentsScanned(), NUMBEROFMETADATADOCUMENTSSCANNED_BINDING);
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfModifiedDocumentsIndexed(), NUMBEROFMODIFIEDDOCUMENTSINDEXED_BINDING);
            protocolMarshaller.marshall(ingestionJobStatistics.getNumberOfNewDocumentsIndexed(), NUMBEROFNEWDOCUMENTSINDEXED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

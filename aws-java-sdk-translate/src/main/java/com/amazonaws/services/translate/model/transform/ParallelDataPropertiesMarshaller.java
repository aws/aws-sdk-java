/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.translate.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParallelDataPropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParallelDataPropertiesMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SOURCELANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLanguageCode").build();
    private static final MarshallingInfo<List> TARGETLANGUAGECODES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TargetLanguageCodes").build();
    private static final MarshallingInfo<StructuredPojo> PARALLELDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParallelDataConfig").build();
    private static final MarshallingInfo<String> MESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Message").build();
    private static final MarshallingInfo<Long> IMPORTEDDATASIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedDataSize").build();
    private static final MarshallingInfo<Long> IMPORTEDRECORDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedRecordCount").build();
    private static final MarshallingInfo<Long> FAILEDRECORDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailedRecordCount").build();
    private static final MarshallingInfo<Long> SKIPPEDRECORDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkippedRecordCount").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKey").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LATESTUPDATEATTEMPTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestUpdateAttemptStatus").build();
    private static final MarshallingInfo<java.util.Date> LATESTUPDATEATTEMPTAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LatestUpdateAttemptAt").timestampFormat("unixTimestamp").build();

    private static final ParallelDataPropertiesMarshaller instance = new ParallelDataPropertiesMarshaller();

    public static ParallelDataPropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParallelDataProperties parallelDataProperties, ProtocolMarshaller protocolMarshaller) {

        if (parallelDataProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parallelDataProperties.getName(), NAME_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getSourceLanguageCode(), SOURCELANGUAGECODE_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getTargetLanguageCodes(), TARGETLANGUAGECODES_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getParallelDataConfig(), PARALLELDATACONFIG_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getMessage(), MESSAGE_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getImportedDataSize(), IMPORTEDDATASIZE_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getImportedRecordCount(), IMPORTEDRECORDCOUNT_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getFailedRecordCount(), FAILEDRECORDCOUNT_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getSkippedRecordCount(), SKIPPEDRECORDCOUNT_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getEncryptionKey(), ENCRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getLastUpdatedAt(), LASTUPDATEDAT_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getLatestUpdateAttemptStatus(), LATESTUPDATEATTEMPTSTATUS_BINDING);
            protocolMarshaller.marshall(parallelDataProperties.getLatestUpdateAttemptAt(), LATESTUPDATEATTEMPTAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

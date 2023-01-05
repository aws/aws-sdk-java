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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportFileTaskInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportFileTaskInformationMarshaller {

    private static final MarshallingInfo<java.util.Date> COMPLETIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("completionTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> IMPORTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("importName").build();
    private static final MarshallingInfo<String> INPUTS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputS3Bucket").build();
    private static final MarshallingInfo<String> INPUTS3KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputS3Key").build();
    private static final MarshallingInfo<Integer> NUMBEROFRECORDSFAILED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRecordsFailed").build();
    private static final MarshallingInfo<Integer> NUMBEROFRECORDSSUCCESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("numberOfRecordsSuccess").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("startTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREPORTS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReportS3Bucket").build();
    private static final MarshallingInfo<String> STATUSREPORTS3KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReportS3Key").build();

    private static final ImportFileTaskInformationMarshaller instance = new ImportFileTaskInformationMarshaller();

    public static ImportFileTaskInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportFileTaskInformation importFileTaskInformation, ProtocolMarshaller protocolMarshaller) {

        if (importFileTaskInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importFileTaskInformation.getCompletionTime(), COMPLETIONTIME_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getId(), ID_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getImportName(), IMPORTNAME_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getInputS3Bucket(), INPUTS3BUCKET_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getInputS3Key(), INPUTS3KEY_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getNumberOfRecordsFailed(), NUMBEROFRECORDSFAILED_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getNumberOfRecordsSuccess(), NUMBEROFRECORDSSUCCESS_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getStatusReportS3Bucket(), STATUSREPORTS3BUCKET_BINDING);
            protocolMarshaller.marshall(importFileTaskInformation.getStatusReportS3Key(), STATUSREPORTS3KEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportTableDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportTableDescriptionMarshaller {

    private static final MarshallingInfo<String> IMPORTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImportArn").build();
    private static final MarshallingInfo<String> IMPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportStatus").build();
    private static final MarshallingInfo<String> TABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableArn").build();
    private static final MarshallingInfo<String> TABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<StructuredPojo> S3BUCKETSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketSource").build();
    private static final MarshallingInfo<Long> ERRORCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ErrorCount").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogGroupArn").build();
    private static final MarshallingInfo<String> INPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormat").build();
    private static final MarshallingInfo<StructuredPojo> INPUTFORMATOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormatOptions").build();
    private static final MarshallingInfo<String> INPUTCOMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputCompressionType").build();
    private static final MarshallingInfo<StructuredPojo> TABLECREATIONPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableCreationParameters").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> PROCESSEDSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessedSizeBytes").build();
    private static final MarshallingInfo<Long> PROCESSEDITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessedItemCount").build();
    private static final MarshallingInfo<Long> IMPORTEDITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportedItemCount").build();
    private static final MarshallingInfo<String> FAILURECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureCode").build();
    private static final MarshallingInfo<String> FAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureMessage").build();

    private static final ImportTableDescriptionMarshaller instance = new ImportTableDescriptionMarshaller();

    public static ImportTableDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportTableDescription importTableDescription, ProtocolMarshaller protocolMarshaller) {

        if (importTableDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importTableDescription.getImportArn(), IMPORTARN_BINDING);
            protocolMarshaller.marshall(importTableDescription.getImportStatus(), IMPORTSTATUS_BINDING);
            protocolMarshaller.marshall(importTableDescription.getTableArn(), TABLEARN_BINDING);
            protocolMarshaller.marshall(importTableDescription.getTableId(), TABLEID_BINDING);
            protocolMarshaller.marshall(importTableDescription.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(importTableDescription.getS3BucketSource(), S3BUCKETSOURCE_BINDING);
            protocolMarshaller.marshall(importTableDescription.getErrorCount(), ERRORCOUNT_BINDING);
            protocolMarshaller.marshall(importTableDescription.getCloudWatchLogGroupArn(), CLOUDWATCHLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(importTableDescription.getInputFormat(), INPUTFORMAT_BINDING);
            protocolMarshaller.marshall(importTableDescription.getInputFormatOptions(), INPUTFORMATOPTIONS_BINDING);
            protocolMarshaller.marshall(importTableDescription.getInputCompressionType(), INPUTCOMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(importTableDescription.getTableCreationParameters(), TABLECREATIONPARAMETERS_BINDING);
            protocolMarshaller.marshall(importTableDescription.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(importTableDescription.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(importTableDescription.getProcessedSizeBytes(), PROCESSEDSIZEBYTES_BINDING);
            protocolMarshaller.marshall(importTableDescription.getProcessedItemCount(), PROCESSEDITEMCOUNT_BINDING);
            protocolMarshaller.marshall(importTableDescription.getImportedItemCount(), IMPORTEDITEMCOUNT_BINDING);
            protocolMarshaller.marshall(importTableDescription.getFailureCode(), FAILURECODE_BINDING);
            protocolMarshaller.marshall(importTableDescription.getFailureMessage(), FAILUREMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

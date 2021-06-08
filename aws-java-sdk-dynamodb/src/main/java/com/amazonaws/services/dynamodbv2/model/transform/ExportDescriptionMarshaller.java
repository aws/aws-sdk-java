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
package com.amazonaws.services.dynamodbv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportDescriptionMarshaller {

    private static final MarshallingInfo<String> EXPORTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExportArn").build();
    private static final MarshallingInfo<String> EXPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportStatus").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> EXPORTMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportManifest").build();
    private static final MarshallingInfo<String> TABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableArn").build();
    private static final MarshallingInfo<String> TABLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableId").build();
    private static final MarshallingInfo<java.util.Date> EXPORTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken").build();
    private static final MarshallingInfo<String> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Bucket").build();
    private static final MarshallingInfo<String> S3BUCKETOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketOwner").build();
    private static final MarshallingInfo<String> S3PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("S3Prefix").build();
    private static final MarshallingInfo<String> S3SSEALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3SseAlgorithm").build();
    private static final MarshallingInfo<String> S3SSEKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3SseKmsKeyId").build();
    private static final MarshallingInfo<String> FAILURECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureCode").build();
    private static final MarshallingInfo<String> FAILUREMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureMessage").build();
    private static final MarshallingInfo<String> EXPORTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportFormat").build();
    private static final MarshallingInfo<Long> BILLEDSIZEBYTES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BilledSizeBytes").build();
    private static final MarshallingInfo<Long> ITEMCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ItemCount").build();

    private static final ExportDescriptionMarshaller instance = new ExportDescriptionMarshaller();

    public static ExportDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportDescription exportDescription, ProtocolMarshaller protocolMarshaller) {

        if (exportDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportDescription.getExportArn(), EXPORTARN_BINDING);
            protocolMarshaller.marshall(exportDescription.getExportStatus(), EXPORTSTATUS_BINDING);
            protocolMarshaller.marshall(exportDescription.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(exportDescription.getEndTime(), ENDTIME_BINDING);
            protocolMarshaller.marshall(exportDescription.getExportManifest(), EXPORTMANIFEST_BINDING);
            protocolMarshaller.marshall(exportDescription.getTableArn(), TABLEARN_BINDING);
            protocolMarshaller.marshall(exportDescription.getTableId(), TABLEID_BINDING);
            protocolMarshaller.marshall(exportDescription.getExportTime(), EXPORTTIME_BINDING);
            protocolMarshaller.marshall(exportDescription.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(exportDescription.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(exportDescription.getS3BucketOwner(), S3BUCKETOWNER_BINDING);
            protocolMarshaller.marshall(exportDescription.getS3Prefix(), S3PREFIX_BINDING);
            protocolMarshaller.marshall(exportDescription.getS3SseAlgorithm(), S3SSEALGORITHM_BINDING);
            protocolMarshaller.marshall(exportDescription.getS3SseKmsKeyId(), S3SSEKMSKEYID_BINDING);
            protocolMarshaller.marshall(exportDescription.getFailureCode(), FAILURECODE_BINDING);
            protocolMarshaller.marshall(exportDescription.getFailureMessage(), FAILUREMESSAGE_BINDING);
            protocolMarshaller.marshall(exportDescription.getExportFormat(), EXPORTFORMAT_BINDING);
            protocolMarshaller.marshall(exportDescription.getBilledSizeBytes(), BILLEDSIZEBYTES_BINDING);
            protocolMarshaller.marshall(exportDescription.getItemCount(), ITEMCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

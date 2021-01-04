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

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportTableToPointInTimeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportTableToPointInTimeRequestMarshaller {

    private static final MarshallingInfo<String> TABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableArn").build();
    private static final MarshallingInfo<java.util.Date> EXPORTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
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
    private static final MarshallingInfo<String> EXPORTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportFormat").build();

    private static final ExportTableToPointInTimeRequestMarshaller instance = new ExportTableToPointInTimeRequestMarshaller();

    public static ExportTableToPointInTimeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportTableToPointInTimeRequest exportTableToPointInTimeRequest, ProtocolMarshaller protocolMarshaller) {

        if (exportTableToPointInTimeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getTableArn(), TABLEARN_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getExportTime(), EXPORTTIME_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getS3BucketOwner(), S3BUCKETOWNER_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getS3Prefix(), S3PREFIX_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getS3SseAlgorithm(), S3SSEALGORITHM_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getS3SseKmsKeyId(), S3SSEKMSKEYID_BINDING);
            protocolMarshaller.marshall(exportTableToPointInTimeRequest.getExportFormat(), EXPORTFORMAT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

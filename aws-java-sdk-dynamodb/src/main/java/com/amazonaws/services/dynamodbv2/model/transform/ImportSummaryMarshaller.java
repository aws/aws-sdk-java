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
 * ImportSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportSummaryMarshaller {

    private static final MarshallingInfo<String> IMPORTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImportArn").build();
    private static final MarshallingInfo<String> IMPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportStatus").build();
    private static final MarshallingInfo<String> TABLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TableArn").build();
    private static final MarshallingInfo<StructuredPojo> S3BUCKETSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketSource").build();
    private static final MarshallingInfo<String> CLOUDWATCHLOGGROUPARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLogGroupArn").build();
    private static final MarshallingInfo<String> INPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputFormat").build();
    private static final MarshallingInfo<java.util.Date> STARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> ENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndTime").timestampFormat("unixTimestamp").build();

    private static final ImportSummaryMarshaller instance = new ImportSummaryMarshaller();

    public static ImportSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportSummary importSummary, ProtocolMarshaller protocolMarshaller) {

        if (importSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importSummary.getImportArn(), IMPORTARN_BINDING);
            protocolMarshaller.marshall(importSummary.getImportStatus(), IMPORTSTATUS_BINDING);
            protocolMarshaller.marshall(importSummary.getTableArn(), TABLEARN_BINDING);
            protocolMarshaller.marshall(importSummary.getS3BucketSource(), S3BUCKETSOURCE_BINDING);
            protocolMarshaller.marshall(importSummary.getCloudWatchLogGroupArn(), CLOUDWATCHLOGGROUPARN_BINDING);
            protocolMarshaller.marshall(importSummary.getInputFormat(), INPUTFORMAT_BINDING);
            protocolMarshaller.marshall(importSummary.getStartTime(), STARTTIME_BINDING);
            protocolMarshaller.marshall(importSummary.getEndTime(), ENDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

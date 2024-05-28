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
package com.amazonaws.services.mgn.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mgn.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExportTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportTaskMarshaller {

    private static final MarshallingInfo<String> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").build();
    private static final MarshallingInfo<String> ENDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endDateTime").build();
    private static final MarshallingInfo<String> EXPORTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("exportID").build();
    private static final MarshallingInfo<Float> PROGRESSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progressPercentage").build();
    private static final MarshallingInfo<String> S3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("s3Bucket").build();
    private static final MarshallingInfo<String> S3BUCKETOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketOwner").build();
    private static final MarshallingInfo<String> S3KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("s3Key").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("summary").build();

    private static final ExportTaskMarshaller instance = new ExportTaskMarshaller();

    public static ExportTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportTask exportTask, ProtocolMarshaller protocolMarshaller) {

        if (exportTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportTask.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(exportTask.getEndDateTime(), ENDDATETIME_BINDING);
            protocolMarshaller.marshall(exportTask.getExportID(), EXPORTID_BINDING);
            protocolMarshaller.marshall(exportTask.getProgressPercentage(), PROGRESSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(exportTask.getS3Bucket(), S3BUCKET_BINDING);
            protocolMarshaller.marshall(exportTask.getS3BucketOwner(), S3BUCKETOWNER_BINDING);
            protocolMarshaller.marshall(exportTask.getS3Key(), S3KEY_BINDING);
            protocolMarshaller.marshall(exportTask.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(exportTask.getSummary(), SUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * ImportTaskMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportTaskMarshaller {

    private static final MarshallingInfo<String> CREATIONDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDateTime").build();
    private static final MarshallingInfo<String> ENDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endDateTime").build();
    private static final MarshallingInfo<String> IMPORTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("importID").build();
    private static final MarshallingInfo<Float> PROGRESSPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progressPercentage").build();
    private static final MarshallingInfo<StructuredPojo> S3BUCKETSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketSource").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("summary").build();

    private static final ImportTaskMarshaller instance = new ImportTaskMarshaller();

    public static ImportTaskMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportTask importTask, ProtocolMarshaller protocolMarshaller) {

        if (importTask == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importTask.getCreationDateTime(), CREATIONDATETIME_BINDING);
            protocolMarshaller.marshall(importTask.getEndDateTime(), ENDDATETIME_BINDING);
            protocolMarshaller.marshall(importTask.getImportID(), IMPORTID_BINDING);
            protocolMarshaller.marshall(importTask.getProgressPercentage(), PROGRESSPERCENTAGE_BINDING);
            protocolMarshaller.marshall(importTask.getS3BucketSource(), S3BUCKETSOURCE_BINDING);
            protocolMarshaller.marshall(importTask.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(importTask.getSummary(), SUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

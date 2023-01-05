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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3BucketTranscriptSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3BucketTranscriptSourceMarshaller {

    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("s3BucketName").build();
    private static final MarshallingInfo<StructuredPojo> PATHFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pathFormat").build();
    private static final MarshallingInfo<String> TRANSCRIPTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transcriptFormat").build();
    private static final MarshallingInfo<StructuredPojo> TRANSCRIPTFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("transcriptFilter").build();
    private static final MarshallingInfo<String> KMSKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyArn").build();

    private static final S3BucketTranscriptSourceMarshaller instance = new S3BucketTranscriptSourceMarshaller();

    public static S3BucketTranscriptSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3BucketTranscriptSource s3BucketTranscriptSource, ProtocolMarshaller protocolMarshaller) {

        if (s3BucketTranscriptSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3BucketTranscriptSource.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(s3BucketTranscriptSource.getPathFormat(), PATHFORMAT_BINDING);
            protocolMarshaller.marshall(s3BucketTranscriptSource.getTranscriptFormat(), TRANSCRIPTFORMAT_BINDING);
            protocolMarshaller.marshall(s3BucketTranscriptSource.getTranscriptFilter(), TRANSCRIPTFILTER_BINDING);
            protocolMarshaller.marshall(s3BucketTranscriptSource.getKmsKeyArn(), KMSKEYARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

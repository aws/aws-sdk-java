/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ElasticsearchDestinationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ElasticsearchDestinationUpdateMarshaller {

    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<String> DOMAINARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainARN").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<String> TYPENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TypeName").build();
    private static final MarshallingInfo<String> INDEXROTATIONPERIOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexRotationPeriod").build();
    private static final MarshallingInfo<StructuredPojo> BUFFERINGHINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BufferingHints").build();
    private static final MarshallingInfo<StructuredPojo> RETRYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryOptions").build();
    private static final MarshallingInfo<StructuredPojo> S3UPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Update").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGGINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptions").build();

    private static final ElasticsearchDestinationUpdateMarshaller instance = new ElasticsearchDestinationUpdateMarshaller();

    public static ElasticsearchDestinationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ElasticsearchDestinationUpdate elasticsearchDestinationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (elasticsearchDestinationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getDomainARN(), DOMAINARN_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getTypeName(), TYPENAME_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getIndexRotationPeriod(), INDEXROTATIONPERIOD_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getBufferingHints(), BUFFERINGHINTS_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getRetryOptions(), RETRYOPTIONS_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getS3Update(), S3UPDATE_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getProcessingConfiguration(), PROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(elasticsearchDestinationUpdate.getCloudWatchLoggingOptions(), CLOUDWATCHLOGGINGOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

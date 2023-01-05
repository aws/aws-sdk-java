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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AmazonOpenSearchServerlessDestinationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AmazonOpenSearchServerlessDestinationConfigurationMarshaller {

    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<String> COLLECTIONENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectionEndpoint").build();
    private static final MarshallingInfo<String> INDEXNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IndexName").build();
    private static final MarshallingInfo<StructuredPojo> BUFFERINGHINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BufferingHints").build();
    private static final MarshallingInfo<StructuredPojo> RETRYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryOptions").build();
    private static final MarshallingInfo<String> S3BACKUPMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BackupMode").build();
    private static final MarshallingInfo<StructuredPojo> S3CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Configuration").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGGINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptions").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();

    private static final AmazonOpenSearchServerlessDestinationConfigurationMarshaller instance = new AmazonOpenSearchServerlessDestinationConfigurationMarshaller();

    public static AmazonOpenSearchServerlessDestinationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AmazonOpenSearchServerlessDestinationConfiguration amazonOpenSearchServerlessDestinationConfiguration,
            ProtocolMarshaller protocolMarshaller) {

        if (amazonOpenSearchServerlessDestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getCollectionEndpoint(), COLLECTIONENDPOINT_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getIndexName(), INDEXNAME_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getBufferingHints(), BUFFERINGHINTS_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getRetryOptions(), RETRYOPTIONS_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getS3BackupMode(), S3BACKUPMODE_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getS3Configuration(), S3CONFIGURATION_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getProcessingConfiguration(), PROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getCloudWatchLoggingOptions(), CLOUDWATCHLOGGINGOPTIONS_BINDING);
            protocolMarshaller.marshall(amazonOpenSearchServerlessDestinationConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

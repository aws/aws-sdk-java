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
 * RedshiftDestinationDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedshiftDestinationDescriptionMarshaller {

    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<String> CLUSTERJDBCURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterJDBCURL").build();
    private static final MarshallingInfo<StructuredPojo> COPYCOMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyCommand").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<StructuredPojo> RETRYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryOptions").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATIONDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3DestinationDescription").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingConfiguration").build();
    private static final MarshallingInfo<String> S3BACKUPMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BackupMode").build();
    private static final MarshallingInfo<StructuredPojo> S3BACKUPDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BackupDescription").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGGINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptions").build();

    private static final RedshiftDestinationDescriptionMarshaller instance = new RedshiftDestinationDescriptionMarshaller();

    public static RedshiftDestinationDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedshiftDestinationDescription redshiftDestinationDescription, ProtocolMarshaller protocolMarshaller) {

        if (redshiftDestinationDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redshiftDestinationDescription.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getClusterJDBCURL(), CLUSTERJDBCURL_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getCopyCommand(), COPYCOMMAND_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getRetryOptions(), RETRYOPTIONS_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getS3DestinationDescription(), S3DESTINATIONDESCRIPTION_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getProcessingConfiguration(), PROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getS3BackupMode(), S3BACKUPMODE_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getS3BackupDescription(), S3BACKUPDESCRIPTION_BINDING);
            protocolMarshaller.marshall(redshiftDestinationDescription.getCloudWatchLoggingOptions(), CLOUDWATCHLOGGINGOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

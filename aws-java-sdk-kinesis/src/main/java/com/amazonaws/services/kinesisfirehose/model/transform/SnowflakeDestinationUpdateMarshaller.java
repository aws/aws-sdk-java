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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SnowflakeDestinationUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnowflakeDestinationUpdateMarshaller {

    private static final MarshallingInfo<String> ACCOUNTURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountUrl").build();
    private static final MarshallingInfo<String> PRIVATEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateKey").build();
    private static final MarshallingInfo<String> KEYPASSPHRASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyPassphrase").build();
    private static final MarshallingInfo<String> USER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("User").build();
    private static final MarshallingInfo<String> DATABASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Database").build();
    private static final MarshallingInfo<String> SCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Schema").build();
    private static final MarshallingInfo<String> TABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Table").build();
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKEROLECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowflakeRoleConfiguration").build();
    private static final MarshallingInfo<String> DATALOADINGOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataLoadingOption").build();
    private static final MarshallingInfo<String> METADATACOLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetaDataColumnName").build();
    private static final MarshallingInfo<String> CONTENTCOLUMNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentColumnName").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGGINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptions").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingConfiguration").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<StructuredPojo> RETRYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryOptions").build();
    private static final MarshallingInfo<String> S3BACKUPMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BackupMode").build();
    private static final MarshallingInfo<StructuredPojo> S3UPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Update").build();

    private static final SnowflakeDestinationUpdateMarshaller instance = new SnowflakeDestinationUpdateMarshaller();

    public static SnowflakeDestinationUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnowflakeDestinationUpdate snowflakeDestinationUpdate, ProtocolMarshaller protocolMarshaller) {

        if (snowflakeDestinationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getAccountUrl(), ACCOUNTURL_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getPrivateKey(), PRIVATEKEY_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getKeyPassphrase(), KEYPASSPHRASE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getUser(), USER_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getSnowflakeRoleConfiguration(), SNOWFLAKEROLECONFIGURATION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getDataLoadingOption(), DATALOADINGOPTION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getMetaDataColumnName(), METADATACOLUMNNAME_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getContentColumnName(), CONTENTCOLUMNNAME_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getCloudWatchLoggingOptions(), CLOUDWATCHLOGGINGOPTIONS_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getProcessingConfiguration(), PROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getRetryOptions(), RETRYOPTIONS_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getS3BackupMode(), S3BACKUPMODE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationUpdate.getS3Update(), S3UPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

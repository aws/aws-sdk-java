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
 * SnowflakeDestinationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SnowflakeDestinationConfigurationMarshaller {

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
    private static final MarshallingInfo<StructuredPojo> SNOWFLAKEVPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnowflakeVpcConfiguration").build();
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
    private static final MarshallingInfo<StructuredPojo> S3CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Configuration").build();

    private static final SnowflakeDestinationConfigurationMarshaller instance = new SnowflakeDestinationConfigurationMarshaller();

    public static SnowflakeDestinationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SnowflakeDestinationConfiguration snowflakeDestinationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (snowflakeDestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getAccountUrl(), ACCOUNTURL_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getPrivateKey(), PRIVATEKEY_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getKeyPassphrase(), KEYPASSPHRASE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getUser(), USER_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getDatabase(), DATABASE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getSchema(), SCHEMA_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getTable(), TABLE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getSnowflakeRoleConfiguration(), SNOWFLAKEROLECONFIGURATION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getDataLoadingOption(), DATALOADINGOPTION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getMetaDataColumnName(), METADATACOLUMNNAME_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getContentColumnName(), CONTENTCOLUMNNAME_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getSnowflakeVpcConfiguration(), SNOWFLAKEVPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getCloudWatchLoggingOptions(), CLOUDWATCHLOGGINGOPTIONS_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getProcessingConfiguration(), PROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getRetryOptions(), RETRYOPTIONS_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getS3BackupMode(), S3BACKUPMODE_BINDING);
            protocolMarshaller.marshall(snowflakeDestinationConfiguration.getS3Configuration(), S3CONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

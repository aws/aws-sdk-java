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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3SettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3SettingsMarshaller {

    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> EXTERNALTABLEDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalTableDefinition").build();
    private static final MarshallingInfo<String> CSVROWDELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CsvRowDelimiter").build();
    private static final MarshallingInfo<String> CSVDELIMITER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CsvDelimiter").build();
    private static final MarshallingInfo<String> BUCKETFOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketFolder").build();
    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketName").build();
    private static final MarshallingInfo<String> COMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompressionType").build();
    private static final MarshallingInfo<String> ENCRYPTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionMode").build();
    private static final MarshallingInfo<String> SERVERSIDEENCRYPTIONKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerSideEncryptionKmsKeyId").build();
    private static final MarshallingInfo<String> DATAFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataFormat").build();
    private static final MarshallingInfo<String> ENCODINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncodingType").build();
    private static final MarshallingInfo<Integer> DICTPAGESIZELIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DictPageSizeLimit").build();
    private static final MarshallingInfo<Integer> ROWGROUPLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RowGroupLength").build();
    private static final MarshallingInfo<Integer> DATAPAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataPageSize").build();
    private static final MarshallingInfo<String> PARQUETVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParquetVersion").build();
    private static final MarshallingInfo<Boolean> ENABLESTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnableStatistics").build();
    private static final MarshallingInfo<Boolean> CDCINSERTSONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CdcInsertsOnly").build();

    private static final S3SettingsMarshaller instance = new S3SettingsMarshaller();

    public static S3SettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3Settings s3Settings, ProtocolMarshaller protocolMarshaller) {

        if (s3Settings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3Settings.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(s3Settings.getExternalTableDefinition(), EXTERNALTABLEDEFINITION_BINDING);
            protocolMarshaller.marshall(s3Settings.getCsvRowDelimiter(), CSVROWDELIMITER_BINDING);
            protocolMarshaller.marshall(s3Settings.getCsvDelimiter(), CSVDELIMITER_BINDING);
            protocolMarshaller.marshall(s3Settings.getBucketFolder(), BUCKETFOLDER_BINDING);
            protocolMarshaller.marshall(s3Settings.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(s3Settings.getCompressionType(), COMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(s3Settings.getEncryptionMode(), ENCRYPTIONMODE_BINDING);
            protocolMarshaller.marshall(s3Settings.getServerSideEncryptionKmsKeyId(), SERVERSIDEENCRYPTIONKMSKEYID_BINDING);
            protocolMarshaller.marshall(s3Settings.getDataFormat(), DATAFORMAT_BINDING);
            protocolMarshaller.marshall(s3Settings.getEncodingType(), ENCODINGTYPE_BINDING);
            protocolMarshaller.marshall(s3Settings.getDictPageSizeLimit(), DICTPAGESIZELIMIT_BINDING);
            protocolMarshaller.marshall(s3Settings.getRowGroupLength(), ROWGROUPLENGTH_BINDING);
            protocolMarshaller.marshall(s3Settings.getDataPageSize(), DATAPAGESIZE_BINDING);
            protocolMarshaller.marshall(s3Settings.getParquetVersion(), PARQUETVERSION_BINDING);
            protocolMarshaller.marshall(s3Settings.getEnableStatistics(), ENABLESTATISTICS_BINDING);
            protocolMarshaller.marshall(s3Settings.getCdcInsertsOnly(), CDCINSERTSONLY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

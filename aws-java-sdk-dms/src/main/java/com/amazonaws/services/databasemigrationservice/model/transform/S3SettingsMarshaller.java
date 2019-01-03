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
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

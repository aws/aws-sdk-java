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
 * RedshiftSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedshiftSettingsMarshaller {

    private static final MarshallingInfo<Boolean> ACCEPTANYDATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptAnyDate").build();
    private static final MarshallingInfo<String> AFTERCONNECTSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AfterConnectScript").build();
    private static final MarshallingInfo<String> BUCKETFOLDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketFolder").build();
    private static final MarshallingInfo<String> BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketName").build();
    private static final MarshallingInfo<Integer> CONNECTIONTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectionTimeout").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> DATEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateFormat").build();
    private static final MarshallingInfo<Boolean> EMPTYASNULL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmptyAsNull").build();
    private static final MarshallingInfo<String> ENCRYPTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionMode").build();
    private static final MarshallingInfo<Integer> FILETRANSFERUPLOADSTREAMS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileTransferUploadStreams").build();
    private static final MarshallingInfo<Integer> LOADTIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LoadTimeout").build();
    private static final MarshallingInfo<Integer> MAXFILESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxFileSize").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<Boolean> REMOVEQUOTES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveQuotes").build();
    private static final MarshallingInfo<String> REPLACEINVALIDCHARS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplaceInvalidChars").build();
    private static final MarshallingInfo<String> REPLACECHARS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReplaceChars").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> SERVERSIDEENCRYPTIONKMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerSideEncryptionKmsKeyId").build();
    private static final MarshallingInfo<String> TIMEFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeFormat").build();
    private static final MarshallingInfo<Boolean> TRIMBLANKS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrimBlanks").build();
    private static final MarshallingInfo<Boolean> TRUNCATECOLUMNS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TruncateColumns").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<Integer> WRITEBUFFERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteBufferSize").build();

    private static final RedshiftSettingsMarshaller instance = new RedshiftSettingsMarshaller();

    public static RedshiftSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedshiftSettings redshiftSettings, ProtocolMarshaller protocolMarshaller) {

        if (redshiftSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redshiftSettings.getAcceptAnyDate(), ACCEPTANYDATE_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getAfterConnectScript(), AFTERCONNECTSCRIPT_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getBucketFolder(), BUCKETFOLDER_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getBucketName(), BUCKETNAME_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getConnectionTimeout(), CONNECTIONTIMEOUT_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getDateFormat(), DATEFORMAT_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getEmptyAsNull(), EMPTYASNULL_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getEncryptionMode(), ENCRYPTIONMODE_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getFileTransferUploadStreams(), FILETRANSFERUPLOADSTREAMS_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getLoadTimeout(), LOADTIMEOUT_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getMaxFileSize(), MAXFILESIZE_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getRemoveQuotes(), REMOVEQUOTES_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getReplaceInvalidChars(), REPLACEINVALIDCHARS_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getReplaceChars(), REPLACECHARS_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getServerSideEncryptionKmsKeyId(), SERVERSIDEENCRYPTIONKMSKEYID_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getTimeFormat(), TIMEFORMAT_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getTrimBlanks(), TRIMBLANKS_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getTruncateColumns(), TRUNCATECOLUMNS_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(redshiftSettings.getWriteBufferSize(), WRITEBUFFERSIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

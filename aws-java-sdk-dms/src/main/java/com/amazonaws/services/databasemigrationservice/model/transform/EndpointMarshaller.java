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
 * EndpointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EndpointMarshaller {

    private static final MarshallingInfo<String> ENDPOINTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointIdentifier").build();
    private static final MarshallingInfo<String> ENDPOINTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointType").build();
    private static final MarshallingInfo<String> ENGINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineName").build();
    private static final MarshallingInfo<String> ENGINEDISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineDisplayName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> EXTRACONNECTIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraConnectionAttributes").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> ENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointArn").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> SSLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SslMode").build();
    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> EXTERNALTABLEDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalTableDefinition").build();
    private static final MarshallingInfo<String> EXTERNALID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalId").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODBSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamoDbSettings").build();
    private static final MarshallingInfo<StructuredPojo> S3SETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Settings").build();
    private static final MarshallingInfo<StructuredPojo> DMSTRANSFERSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DmsTransferSettings").build();
    private static final MarshallingInfo<StructuredPojo> MONGODBSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MongoDbSettings").build();
    private static final MarshallingInfo<StructuredPojo> KINESISSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KinesisSettings").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCHSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticsearchSettings").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftSettings").build();

    private static final EndpointMarshaller instance = new EndpointMarshaller();

    public static EndpointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Endpoint endpoint, ProtocolMarshaller protocolMarshaller) {

        if (endpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(endpoint.getEndpointIdentifier(), ENDPOINTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(endpoint.getEndpointType(), ENDPOINTTYPE_BINDING);
            protocolMarshaller.marshall(endpoint.getEngineName(), ENGINENAME_BINDING);
            protocolMarshaller.marshall(endpoint.getEngineDisplayName(), ENGINEDISPLAYNAME_BINDING);
            protocolMarshaller.marshall(endpoint.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(endpoint.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(endpoint.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(endpoint.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(endpoint.getExtraConnectionAttributes(), EXTRACONNECTIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(endpoint.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(endpoint.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(endpoint.getEndpointArn(), ENDPOINTARN_BINDING);
            protocolMarshaller.marshall(endpoint.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(endpoint.getSslMode(), SSLMODE_BINDING);
            protocolMarshaller.marshall(endpoint.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(endpoint.getExternalTableDefinition(), EXTERNALTABLEDEFINITION_BINDING);
            protocolMarshaller.marshall(endpoint.getExternalId(), EXTERNALID_BINDING);
            protocolMarshaller.marshall(endpoint.getDynamoDbSettings(), DYNAMODBSETTINGS_BINDING);
            protocolMarshaller.marshall(endpoint.getS3Settings(), S3SETTINGS_BINDING);
            protocolMarshaller.marshall(endpoint.getDmsTransferSettings(), DMSTRANSFERSETTINGS_BINDING);
            protocolMarshaller.marshall(endpoint.getMongoDbSettings(), MONGODBSETTINGS_BINDING);
            protocolMarshaller.marshall(endpoint.getKinesisSettings(), KINESISSETTINGS_BINDING);
            protocolMarshaller.marshall(endpoint.getElasticsearchSettings(), ELASTICSEARCHSETTINGS_BINDING);
            protocolMarshaller.marshall(endpoint.getRedshiftSettings(), REDSHIFTSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

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
 * ModifyEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModifyEndpointRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointArn").build();
    private static final MarshallingInfo<String> ENDPOINTIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointIdentifier").build();
    private static final MarshallingInfo<String> ENDPOINTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointType").build();
    private static final MarshallingInfo<String> ENGINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EngineName").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Username").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<String> SERVERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServerName").build();
    private static final MarshallingInfo<Integer> PORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<String> DATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseName").build();
    private static final MarshallingInfo<String> EXTRACONNECTIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraConnectionAttributes").build();
    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateArn").build();
    private static final MarshallingInfo<String> SSLMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SslMode").build();
    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<String> EXTERNALTABLEDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExternalTableDefinition").build();
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

    private static final ModifyEndpointRequestMarshaller instance = new ModifyEndpointRequestMarshaller();

    public static ModifyEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModifyEndpointRequest modifyEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (modifyEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modifyEndpointRequest.getEndpointArn(), ENDPOINTARN_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getEndpointIdentifier(), ENDPOINTIDENTIFIER_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getEndpointType(), ENDPOINTTYPE_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getEngineName(), ENGINENAME_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getUsername(), USERNAME_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getServerName(), SERVERNAME_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getDatabaseName(), DATABASENAME_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getExtraConnectionAttributes(), EXTRACONNECTIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getSslMode(), SSLMODE_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getExternalTableDefinition(), EXTERNALTABLEDEFINITION_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getDynamoDbSettings(), DYNAMODBSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getS3Settings(), S3SETTINGS_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getDmsTransferSettings(), DMSTRANSFERSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getMongoDbSettings(), MONGODBSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getKinesisSettings(), KINESISSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getElasticsearchSettings(), ELASTICSEARCHSETTINGS_BINDING);
            protocolMarshaller.marshall(modifyEndpointRequest.getRedshiftSettings(), REDSHIFTSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

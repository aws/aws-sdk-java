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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateDataSourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateDataSourceRequestMarshaller {

    private static final MarshallingInfo<String> APIID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("apiId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> SERVICEROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMODBCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dynamodbConfig").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaConfig").build();
    private static final MarshallingInfo<StructuredPojo> ELASTICSEARCHCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elasticsearchConfig").build();
    private static final MarshallingInfo<StructuredPojo> HTTPCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("httpConfig").build();
    private static final MarshallingInfo<StructuredPojo> RELATIONALDATABASECONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseConfig").build();

    private static final UpdateDataSourceRequestMarshaller instance = new UpdateDataSourceRequestMarshaller();

    public static UpdateDataSourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateDataSourceRequest updateDataSourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateDataSourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateDataSourceRequest.getApiId(), APIID_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getServiceRoleArn(), SERVICEROLEARN_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getDynamodbConfig(), DYNAMODBCONFIG_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getLambdaConfig(), LAMBDACONFIG_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getElasticsearchConfig(), ELASTICSEARCHCONFIG_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getHttpConfig(), HTTPCONFIG_BINDING);
            protocolMarshaller.marshall(updateDataSourceRequest.getRelationalDatabaseConfig(), RELATIONALDATABASECONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

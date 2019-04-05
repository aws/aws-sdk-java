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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Endpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointJsonUnmarshaller implements Unmarshaller<Endpoint, JsonUnmarshallerContext> {

    public Endpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Endpoint endpoint = new Endpoint();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EndpointIdentifier", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineName", targetDepth)) {
                    context.nextToken();
                    endpoint.setEngineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineDisplayName", targetDepth)) {
                    context.nextToken();
                    endpoint.setEngineDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    endpoint.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    endpoint.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    endpoint.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    endpoint.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraConnectionAttributes", targetDepth)) {
                    context.nextToken();
                    endpoint.setExtraConnectionAttributes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    endpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    endpoint.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointArn", targetDepth)) {
                    context.nextToken();
                    endpoint.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateArn", targetDepth)) {
                    context.nextToken();
                    endpoint.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslMode", targetDepth)) {
                    context.nextToken();
                    endpoint.setSslMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    endpoint.setServiceAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalTableDefinition", targetDepth)) {
                    context.nextToken();
                    endpoint.setExternalTableDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalId", targetDepth)) {
                    context.nextToken();
                    endpoint.setExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DynamoDbSettings", targetDepth)) {
                    context.nextToken();
                    endpoint.setDynamoDbSettings(DynamoDbSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3Settings", targetDepth)) {
                    context.nextToken();
                    endpoint.setS3Settings(S3SettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DmsTransferSettings", targetDepth)) {
                    context.nextToken();
                    endpoint.setDmsTransferSettings(DmsTransferSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MongoDbSettings", targetDepth)) {
                    context.nextToken();
                    endpoint.setMongoDbSettings(MongoDbSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisSettings", targetDepth)) {
                    context.nextToken();
                    endpoint.setKinesisSettings(KinesisSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticsearchSettings", targetDepth)) {
                    context.nextToken();
                    endpoint.setElasticsearchSettings(ElasticsearchSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftSettings", targetDepth)) {
                    context.nextToken();
                    endpoint.setRedshiftSettings(RedshiftSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return endpoint;
    }

    private static EndpointJsonUnmarshaller instance;

    public static EndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonUnmarshaller();
        return instance;
    }
}

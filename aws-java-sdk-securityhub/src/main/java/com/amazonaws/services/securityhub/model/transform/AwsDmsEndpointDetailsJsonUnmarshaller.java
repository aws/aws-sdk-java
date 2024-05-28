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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsDmsEndpointDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsEndpointDetailsJsonUnmarshaller implements Unmarshaller<AwsDmsEndpointDetails, JsonUnmarshallerContext> {

    public AwsDmsEndpointDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsDmsEndpointDetails awsDmsEndpointDetails = new AwsDmsEndpointDetails();

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
                if (context.testExpression("CertificateArn", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointArn", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointIdentifier", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setEndpointIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineName", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setEngineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalId", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraConnectionAttributes", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setExtraConnectionAttributes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslMode", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setSslMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    awsDmsEndpointDetails.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsDmsEndpointDetails;
    }

    private static AwsDmsEndpointDetailsJsonUnmarshaller instance;

    public static AwsDmsEndpointDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsDmsEndpointDetailsJsonUnmarshaller();
        return instance;
    }
}

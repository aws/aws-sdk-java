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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainNameConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainNameConfigurationJsonUnmarshaller implements Unmarshaller<DomainNameConfiguration, JsonUnmarshallerContext> {

    public DomainNameConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainNameConfiguration domainNameConfiguration = new DomainNameConfiguration();

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
                if (context.testExpression("apiGatewayDomainName", targetDepth)) {
                    context.nextToken();
                    domainNameConfiguration.setApiGatewayDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateArn", targetDepth)) {
                    context.nextToken();
                    domainNameConfiguration.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateName", targetDepth)) {
                    context.nextToken();
                    domainNameConfiguration.setCertificateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateUploadDate", targetDepth)) {
                    context.nextToken();
                    domainNameConfiguration.setCertificateUploadDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("endpointType", targetDepth)) {
                    context.nextToken();
                    domainNameConfiguration.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostedZoneId", targetDepth)) {
                    context.nextToken();
                    domainNameConfiguration.setHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainNameConfiguration;
    }

    private static DomainNameConfigurationJsonUnmarshaller instance;

    public static DomainNameConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainNameConfigurationJsonUnmarshaller();
        return instance;
    }
}

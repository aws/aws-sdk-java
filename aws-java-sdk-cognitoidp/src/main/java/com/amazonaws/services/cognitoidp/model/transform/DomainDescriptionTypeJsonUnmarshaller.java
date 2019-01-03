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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DomainDescriptionType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDescriptionTypeJsonUnmarshaller implements Unmarshaller<DomainDescriptionType, JsonUnmarshallerContext> {

    public DomainDescriptionType unmarshall(JsonUnmarshallerContext context) throws Exception {
        DomainDescriptionType domainDescriptionType = new DomainDescriptionType();

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
                if (context.testExpression("UserPoolId", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setUserPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AWSAccountId", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setAWSAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3Bucket", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setS3Bucket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudFrontDistribution", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setCloudFrontDistribution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomDomainConfig", targetDepth)) {
                    context.nextToken();
                    domainDescriptionType.setCustomDomainConfig(CustomDomainConfigTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return domainDescriptionType;
    }

    private static DomainDescriptionTypeJsonUnmarshaller instance;

    public static DomainDescriptionTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainDescriptionTypeJsonUnmarshaller();
        return instance;
    }
}

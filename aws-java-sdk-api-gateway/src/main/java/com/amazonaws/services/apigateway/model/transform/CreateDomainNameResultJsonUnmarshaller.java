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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateDomainNameResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainNameResultJsonUnmarshaller implements Unmarshaller<CreateDomainNameResult, JsonUnmarshallerContext> {

    public CreateDomainNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDomainNameResult createDomainNameResult = new CreateDomainNameResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createDomainNameResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("domainName", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateName", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setCertificateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateArn", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateUploadDate", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setCertificateUploadDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("regionalDomainName", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setRegionalDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalHostedZoneId", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setRegionalHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalCertificateName", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setRegionalCertificateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalCertificateArn", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setRegionalCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("distributionDomainName", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setDistributionDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("distributionHostedZoneId", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setDistributionHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpointConfiguration", targetDepth)) {
                    context.nextToken();
                    createDomainNameResult.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createDomainNameResult;
    }

    private static CreateDomainNameResultJsonUnmarshaller instance;

    public static CreateDomainNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDomainNameResultJsonUnmarshaller();
        return instance;
    }
}

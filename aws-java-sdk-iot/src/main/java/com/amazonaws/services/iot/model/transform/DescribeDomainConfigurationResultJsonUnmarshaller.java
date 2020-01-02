/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDomainConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainConfigurationResultJsonUnmarshaller implements Unmarshaller<DescribeDomainConfigurationResult, JsonUnmarshallerContext> {

    public DescribeDomainConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDomainConfigurationResult describeDomainConfigurationResult = new DescribeDomainConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDomainConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("domainConfigurationName", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setDomainConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainConfigurationArn", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setDomainConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainName", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serverCertificates", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setServerCertificates(new ListUnmarshaller<ServerCertificateSummary>(
                            ServerCertificateSummaryJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("authorizerConfig", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setAuthorizerConfig(AuthorizerConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("domainConfigurationStatus", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setDomainConfigurationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceType", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setServiceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainType", targetDepth)) {
                    context.nextToken();
                    describeDomainConfigurationResult.setDomainType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDomainConfigurationResult;
    }

    private static DescribeDomainConfigurationResultJsonUnmarshaller instance;

    public static DescribeDomainConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDomainConfigurationResultJsonUnmarshaller();
        return instance;
    }
}

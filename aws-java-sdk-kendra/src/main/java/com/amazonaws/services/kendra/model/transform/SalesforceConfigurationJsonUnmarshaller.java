/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SalesforceConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceConfigurationJsonUnmarshaller implements Unmarshaller<SalesforceConfiguration, JsonUnmarshallerContext> {

    public SalesforceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        SalesforceConfiguration salesforceConfiguration = new SalesforceConfiguration();

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
                if (context.testExpression("ServerUrl", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardObjectConfigurations", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setStandardObjectConfigurations(new ListUnmarshaller<SalesforceStandardObjectConfiguration>(
                            SalesforceStandardObjectConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("KnowledgeArticleConfiguration", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setKnowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ChatterFeedConfiguration", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setChatterFeedConfiguration(SalesforceChatterFeedConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CrawlAttachments", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setCrawlAttachments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StandardObjectAttachmentConfiguration", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setStandardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("IncludeAttachmentFilePatterns", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setIncludeAttachmentFilePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExcludeAttachmentFilePatterns", targetDepth)) {
                    context.nextToken();
                    salesforceConfiguration.setExcludeAttachmentFilePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return salesforceConfiguration;
    }

    private static SalesforceConfigurationJsonUnmarshaller instance;

    public static SalesforceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SalesforceConfigurationJsonUnmarshaller();
        return instance;
    }
}

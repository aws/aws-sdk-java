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
 * ServiceNowKnowledgeArticleConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller implements Unmarshaller<ServiceNowKnowledgeArticleConfiguration, JsonUnmarshallerContext> {

    public ServiceNowKnowledgeArticleConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceNowKnowledgeArticleConfiguration serviceNowKnowledgeArticleConfiguration = new ServiceNowKnowledgeArticleConfiguration();

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
                if (context.testExpression("CrawlAttachments", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration.setCrawlAttachments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeAttachmentFilePatterns", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration
                            .setIncludeAttachmentFilePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("ExcludeAttachmentFilePatterns", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration
                            .setExcludeAttachmentFilePatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("DocumentDataFieldName", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration.setDocumentDataFieldName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentTitleFieldName", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration.setDocumentTitleFieldName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FieldMappings", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration.setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FilterQuery", targetDepth)) {
                    context.nextToken();
                    serviceNowKnowledgeArticleConfiguration.setFilterQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceNowKnowledgeArticleConfiguration;
    }

    private static ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller instance;

    public static ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceNowKnowledgeArticleConfigurationJsonUnmarshaller();
        return instance;
    }
}

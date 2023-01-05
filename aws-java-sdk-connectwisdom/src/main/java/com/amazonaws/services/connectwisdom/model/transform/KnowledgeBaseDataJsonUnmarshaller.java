/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectwisdom.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectwisdom.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KnowledgeBaseData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseDataJsonUnmarshaller implements Unmarshaller<KnowledgeBaseData, JsonUnmarshallerContext> {

    public KnowledgeBaseData unmarshall(JsonUnmarshallerContext context) throws Exception {
        KnowledgeBaseData knowledgeBaseData = new KnowledgeBaseData();

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
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseArn", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setKnowledgeBaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseId", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setKnowledgeBaseId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("knowledgeBaseType", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setKnowledgeBaseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastContentModificationTime", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setLastContentModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("renderingConfiguration", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setRenderingConfiguration(RenderingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverSideEncryptionConfiguration", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setServerSideEncryptionConfiguration(ServerSideEncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceConfiguration", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setSourceConfiguration(SourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    knowledgeBaseData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return knowledgeBaseData;
    }

    private static KnowledgeBaseDataJsonUnmarshaller instance;

    public static KnowledgeBaseDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KnowledgeBaseDataJsonUnmarshaller();
        return instance;
    }
}

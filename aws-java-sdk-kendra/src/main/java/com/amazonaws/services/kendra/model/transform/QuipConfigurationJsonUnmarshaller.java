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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QuipConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuipConfigurationJsonUnmarshaller implements Unmarshaller<QuipConfiguration, JsonUnmarshallerContext> {

    public QuipConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        QuipConfiguration quipConfiguration = new QuipConfiguration();

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
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CrawlFileComments", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setCrawlFileComments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlChatRooms", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setCrawlChatRooms(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrawlAttachments", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setCrawlAttachments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("FolderIds", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setFolderIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ThreadFieldMappings", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setThreadFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MessageFieldMappings", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setMessageFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AttachmentFieldMappings", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setAttachmentFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    context.nextToken();
                    quipConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return quipConfiguration;
    }

    private static QuipConfigurationJsonUnmarshaller instance;

    public static QuipConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QuipConfigurationJsonUnmarshaller();
        return instance;
    }
}

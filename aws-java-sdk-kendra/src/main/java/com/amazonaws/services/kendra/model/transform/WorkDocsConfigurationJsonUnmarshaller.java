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
 * WorkDocsConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkDocsConfigurationJsonUnmarshaller implements Unmarshaller<WorkDocsConfiguration, JsonUnmarshallerContext> {

    public WorkDocsConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkDocsConfiguration workDocsConfiguration = new WorkDocsConfiguration();

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
                if (context.testExpression("OrganizationId", targetDepth)) {
                    context.nextToken();
                    workDocsConfiguration.setOrganizationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CrawlComments", targetDepth)) {
                    context.nextToken();
                    workDocsConfiguration.setCrawlComments(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseChangeLog", targetDepth)) {
                    context.nextToken();
                    workDocsConfiguration.setUseChangeLog(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    context.nextToken();
                    workDocsConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    context.nextToken();
                    workDocsConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FieldMappings", targetDepth)) {
                    context.nextToken();
                    workDocsConfiguration.setFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

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

        return workDocsConfiguration;
    }

    private static WorkDocsConfigurationJsonUnmarshaller instance;

    public static WorkDocsConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkDocsConfigurationJsonUnmarshaller();
        return instance;
    }
}

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
package com.amazonaws.services.appsync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Resolver JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverJsonUnmarshaller implements Unmarshaller<Resolver, JsonUnmarshallerContext> {

    public Resolver unmarshall(JsonUnmarshallerContext context) throws Exception {
        Resolver resolver = new Resolver();

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
                if (context.testExpression("typeName", targetDepth)) {
                    context.nextToken();
                    resolver.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fieldName", targetDepth)) {
                    context.nextToken();
                    resolver.setFieldName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSourceName", targetDepth)) {
                    context.nextToken();
                    resolver.setDataSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resolverArn", targetDepth)) {
                    context.nextToken();
                    resolver.setResolverArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestMappingTemplate", targetDepth)) {
                    context.nextToken();
                    resolver.setRequestMappingTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("responseMappingTemplate", targetDepth)) {
                    context.nextToken();
                    resolver.setResponseMappingTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kind", targetDepth)) {
                    context.nextToken();
                    resolver.setKind(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelineConfig", targetDepth)) {
                    context.nextToken();
                    resolver.setPipelineConfig(PipelineConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resolver;
    }

    private static ResolverJsonUnmarshaller instance;

    public static ResolverJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResolverJsonUnmarshaller();
        return instance;
    }
}

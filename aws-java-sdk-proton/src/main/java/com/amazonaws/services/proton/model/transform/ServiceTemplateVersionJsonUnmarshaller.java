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
package com.amazonaws.services.proton.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceTemplateVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceTemplateVersionJsonUnmarshaller implements Unmarshaller<ServiceTemplateVersion, JsonUnmarshallerContext> {

    public ServiceTemplateVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceTemplateVersion serviceTemplateVersion = new ServiceTemplateVersion();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("compatibleEnvironmentTemplates", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setCompatibleEnvironmentTemplates(new ListUnmarshaller<CompatibleEnvironmentTemplate>(
                            CompatibleEnvironmentTemplateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("majorVersion", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setMajorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minorVersion", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendedMinorVersion", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setRecommendedMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schema", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateName", targetDepth)) {
                    context.nextToken();
                    serviceTemplateVersion.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceTemplateVersion;
    }

    private static ServiceTemplateVersionJsonUnmarshaller instance;

    public static ServiceTemplateVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceTemplateVersionJsonUnmarshaller();
        return instance;
    }
}

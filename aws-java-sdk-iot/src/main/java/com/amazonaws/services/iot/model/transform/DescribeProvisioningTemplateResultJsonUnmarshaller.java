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
 * DescribeProvisioningTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisioningTemplateResultJsonUnmarshaller implements Unmarshaller<DescribeProvisioningTemplateResult, JsonUnmarshallerContext> {

    public DescribeProvisioningTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProvisioningTemplateResult describeProvisioningTemplateResult = new DescribeProvisioningTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProvisioningTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("templateArn", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateName", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("defaultVersionId", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setDefaultVersionId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("templateBody", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setTemplateBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enabled", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("provisioningRoleArn", targetDepth)) {
                    context.nextToken();
                    describeProvisioningTemplateResult.setProvisioningRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeProvisioningTemplateResult;
    }

    private static DescribeProvisioningTemplateResultJsonUnmarshaller instance;

    public static DescribeProvisioningTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProvisioningTemplateResultJsonUnmarshaller();
        return instance;
    }
}

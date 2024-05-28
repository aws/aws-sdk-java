/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CountsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CountsSummaryJsonUnmarshaller implements Unmarshaller<CountsSummary, JsonUnmarshallerContext> {

    public CountsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CountsSummary countsSummary = new CountsSummary();

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
                if (context.testExpression("components", targetDepth)) {
                    context.nextToken();
                    countsSummary.setComponents(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environmentTemplates", targetDepth)) {
                    context.nextToken();
                    countsSummary.setEnvironmentTemplates(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environments", targetDepth)) {
                    context.nextToken();
                    countsSummary.setEnvironments(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pipelines", targetDepth)) {
                    context.nextToken();
                    countsSummary.setPipelines(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceInstances", targetDepth)) {
                    context.nextToken();
                    countsSummary.setServiceInstances(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceTemplates", targetDepth)) {
                    context.nextToken();
                    countsSummary.setServiceTemplates(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("services", targetDepth)) {
                    context.nextToken();
                    countsSummary.setServices(ResourceCountsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return countsSummary;
    }

    private static CountsSummaryJsonUnmarshaller instance;

    public static CountsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CountsSummaryJsonUnmarshaller();
        return instance;
    }
}

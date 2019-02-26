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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceChange JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceChangeJsonUnmarshaller implements Unmarshaller<ResourceChange, JsonUnmarshallerContext> {

    public ResourceChange unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceChange resourceChange = new ResourceChange();

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
                if (context.testExpression("Action", targetDepth)) {
                    context.nextToken();
                    resourceChange.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogicalResourceId", targetDepth)) {
                    context.nextToken();
                    resourceChange.setLogicalResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhysicalResourceId", targetDepth)) {
                    context.nextToken();
                    resourceChange.setPhysicalResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    context.nextToken();
                    resourceChange.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Replacement", targetDepth)) {
                    context.nextToken();
                    resourceChange.setReplacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Scope", targetDepth)) {
                    context.nextToken();
                    resourceChange.setScope(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Details", targetDepth)) {
                    context.nextToken();
                    resourceChange.setDetails(new ListUnmarshaller<ResourceChangeDetail>(ResourceChangeDetailJsonUnmarshaller.getInstance())
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

        return resourceChange;
    }

    private static ResourceChangeJsonUnmarshaller instance;

    public static ResourceChangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceChangeJsonUnmarshaller();
        return instance;
    }
}

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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionDeclaration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionDeclarationJsonUnmarshaller implements Unmarshaller<ActionDeclaration, JsonUnmarshallerContext> {

    public ActionDeclaration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionDeclaration actionDeclaration = new ActionDeclaration();

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
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionTypeId", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setActionTypeId(ActionTypeIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("runOrder", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setRunOrder(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("outputArtifacts", targetDepth)) {
                    context.nextToken();
                    actionDeclaration
                            .setOutputArtifacts(new ListUnmarshaller<OutputArtifact>(OutputArtifactJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("inputArtifacts", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setInputArtifacts(new ListUnmarshaller<InputArtifact>(InputArtifactJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    actionDeclaration.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return actionDeclaration;
    }

    private static ActionDeclarationJsonUnmarshaller instance;

    public static ActionDeclarationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionDeclarationJsonUnmarshaller();
        return instance;
    }
}

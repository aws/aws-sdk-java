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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerRecipe JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerRecipeJsonUnmarshaller implements Unmarshaller<ContainerRecipe, JsonUnmarshallerContext> {

    public ContainerRecipe unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerRecipe containerRecipe = new ContainerRecipe();

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
                    containerRecipe.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containerType", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setContainerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("components", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setComponents(new ListUnmarshaller<ComponentConfiguration>(ComponentConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceConfiguration", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setInstanceConfiguration(InstanceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dockerfileTemplateData", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setDockerfileTemplateData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encrypted", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("parentImage", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setParentImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("workingDirectory", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetRepository", targetDepth)) {
                    context.nextToken();
                    containerRecipe.setTargetRepository(TargetContainerRepositoryJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return containerRecipe;
    }

    private static ContainerRecipeJsonUnmarshaller instance;

    public static ContainerRecipeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerRecipeJsonUnmarshaller();
        return instance;
    }
}

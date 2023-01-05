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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EntityDetectorConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDetectorConfigurationJsonUnmarshaller implements Unmarshaller<EntityDetectorConfiguration, JsonUnmarshallerContext> {

    public EntityDetectorConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        EntityDetectorConfiguration entityDetectorConfiguration = new EntityDetectorConfiguration();

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
                if (context.testExpression("EntityTypes", targetDepth)) {
                    context.nextToken();
                    entityDetectorConfiguration.setEntityTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AllowedStatistics", targetDepth)) {
                    context.nextToken();
                    entityDetectorConfiguration.setAllowedStatistics(new ListUnmarshaller<AllowedStatistics>(AllowedStatisticsJsonUnmarshaller.getInstance())

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

        return entityDetectorConfiguration;
    }

    private static EntityDetectorConfigurationJsonUnmarshaller instance;

    public static EntityDetectorConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityDetectorConfigurationJsonUnmarshaller();
        return instance;
    }
}

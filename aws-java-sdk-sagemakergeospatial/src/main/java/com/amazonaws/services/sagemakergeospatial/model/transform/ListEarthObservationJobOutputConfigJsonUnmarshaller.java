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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListEarthObservationJobOutputConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEarthObservationJobOutputConfigJsonUnmarshaller implements Unmarshaller<ListEarthObservationJobOutputConfig, JsonUnmarshallerContext> {

    public ListEarthObservationJobOutputConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListEarthObservationJobOutputConfig listEarthObservationJobOutputConfig = new ListEarthObservationJobOutputConfig();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DurationInSeconds", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setDurationInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperationType", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setOperationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    listEarthObservationJobOutputConfig.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listEarthObservationJobOutputConfig;
    }

    private static ListEarthObservationJobOutputConfigJsonUnmarshaller instance;

    public static ListEarthObservationJobOutputConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEarthObservationJobOutputConfigJsonUnmarshaller();
        return instance;
    }
}

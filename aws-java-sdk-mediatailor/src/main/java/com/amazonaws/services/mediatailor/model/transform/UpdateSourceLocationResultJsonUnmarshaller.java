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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateSourceLocationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSourceLocationResultJsonUnmarshaller implements Unmarshaller<UpdateSourceLocationResult, JsonUnmarshallerContext> {

    public UpdateSourceLocationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSourceLocationResult updateSourceLocationResult = new UpdateSourceLocationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSourceLocationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AccessConfiguration", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setAccessConfiguration(AccessConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DefaultSegmentDeliveryConfiguration", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setDefaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("HttpConfiguration", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setHttpConfiguration(HttpConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SourceLocationName", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setSourceLocationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    updateSourceLocationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return updateSourceLocationResult;
    }

    private static UpdateSourceLocationResultJsonUnmarshaller instance;

    public static UpdateSourceLocationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSourceLocationResultJsonUnmarshaller();
        return instance;
    }
}

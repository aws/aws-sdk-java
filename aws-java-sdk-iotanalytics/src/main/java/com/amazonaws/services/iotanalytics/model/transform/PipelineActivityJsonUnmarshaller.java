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
package com.amazonaws.services.iotanalytics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotanalytics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipelineActivity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineActivityJsonUnmarshaller implements Unmarshaller<PipelineActivity, JsonUnmarshallerContext> {

    public PipelineActivity unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipelineActivity pipelineActivity = new PipelineActivity();

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
                if (context.testExpression("channel", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setChannel(ChannelActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambda", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setLambda(LambdaActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("datastore", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setDatastore(DatastoreActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("addAttributes", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setAddAttributes(AddAttributesActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("removeAttributes", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setRemoveAttributes(RemoveAttributesActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("selectAttributes", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setSelectAttributes(SelectAttributesActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("filter", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setFilter(FilterActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("math", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setMath(MathActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deviceRegistryEnrich", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setDeviceRegistryEnrich(DeviceRegistryEnrichActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deviceShadowEnrich", targetDepth)) {
                    context.nextToken();
                    pipelineActivity.setDeviceShadowEnrich(DeviceShadowEnrichActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipelineActivity;
    }

    private static PipelineActivityJsonUnmarshaller instance;

    public static PipelineActivityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineActivityJsonUnmarshaller();
        return instance;
    }
}

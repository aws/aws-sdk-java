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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EndpointSetting JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointSettingJsonUnmarshaller implements Unmarshaller<EndpointSetting, JsonUnmarshallerContext> {

    public EndpointSetting unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointSetting endpointSetting = new EndpointSetting();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnumValues", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setEnumValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Sensitive", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setSensitive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Units", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Applicability", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setApplicability(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IntValueMin", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setIntValueMin(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IntValueMax", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setIntValueMax(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DefaultValue", targetDepth)) {
                    context.nextToken();
                    endpointSetting.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return endpointSetting;
    }

    private static EndpointSettingJsonUnmarshaller instance;

    public static EndpointSettingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointSettingJsonUnmarshaller();
        return instance;
    }
}

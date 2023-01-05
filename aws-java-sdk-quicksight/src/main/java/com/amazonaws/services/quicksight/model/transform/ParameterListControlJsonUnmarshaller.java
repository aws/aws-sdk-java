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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParameterListControl JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterListControlJsonUnmarshaller implements Unmarshaller<ParameterListControl, JsonUnmarshallerContext> {

    public ParameterListControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParameterListControl parameterListControl = new ParameterListControl();

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
                if (context.testExpression("ParameterControlId", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setParameterControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceParameterName", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setSourceParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayOptions", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setDisplayOptions(ListControlDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectableValues", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setSelectableValues(ParameterSelectableValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CascadingControlConfiguration", targetDepth)) {
                    context.nextToken();
                    parameterListControl.setCascadingControlConfiguration(CascadingControlConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return parameterListControl;
    }

    private static ParameterListControlJsonUnmarshaller instance;

    public static ParameterListControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterListControlJsonUnmarshaller();
        return instance;
    }
}

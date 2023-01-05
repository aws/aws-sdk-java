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
 * FilterDropDownControl JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterDropDownControlJsonUnmarshaller implements Unmarshaller<FilterDropDownControl, JsonUnmarshallerContext> {

    public FilterDropDownControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilterDropDownControl filterDropDownControl = new FilterDropDownControl();

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
                if (context.testExpression("FilterControlId", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setFilterControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceFilterId", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setSourceFilterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayOptions", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setDisplayOptions(DropDownControlDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectableValues", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setSelectableValues(FilterSelectableValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CascadingControlConfiguration", targetDepth)) {
                    context.nextToken();
                    filterDropDownControl.setCascadingControlConfiguration(CascadingControlConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return filterDropDownControl;
    }

    private static FilterDropDownControlJsonUnmarshaller instance;

    public static FilterDropDownControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilterDropDownControlJsonUnmarshaller();
        return instance;
    }
}

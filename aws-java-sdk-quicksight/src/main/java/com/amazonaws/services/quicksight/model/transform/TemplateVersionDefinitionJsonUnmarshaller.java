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
 * TemplateVersionDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateVersionDefinitionJsonUnmarshaller implements Unmarshaller<TemplateVersionDefinition, JsonUnmarshallerContext> {

    public TemplateVersionDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        TemplateVersionDefinition templateVersionDefinition = new TemplateVersionDefinition();

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
                if (context.testExpression("DataSetConfigurations", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setDataSetConfigurations(new ListUnmarshaller<DataSetConfiguration>(DataSetConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Sheets", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setSheets(new ListUnmarshaller<SheetDefinition>(SheetDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CalculatedFields", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setCalculatedFields(new ListUnmarshaller<CalculatedField>(CalculatedFieldJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ParameterDeclarations", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setParameterDeclarations(new ListUnmarshaller<ParameterDeclaration>(ParameterDeclarationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FilterGroups", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setFilterGroups(new ListUnmarshaller<FilterGroup>(FilterGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ColumnConfigurations", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setColumnConfigurations(new ListUnmarshaller<ColumnConfiguration>(ColumnConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AnalysisDefaults", targetDepth)) {
                    context.nextToken();
                    templateVersionDefinition.setAnalysisDefaults(AnalysisDefaultsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return templateVersionDefinition;
    }

    private static TemplateVersionDefinitionJsonUnmarshaller instance;

    public static TemplateVersionDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TemplateVersionDefinitionJsonUnmarshaller();
        return instance;
    }
}

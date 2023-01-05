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
 * AnalysisDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisDefinitionJsonUnmarshaller implements Unmarshaller<AnalysisDefinition, JsonUnmarshallerContext> {

    public AnalysisDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnalysisDefinition analysisDefinition = new AnalysisDefinition();

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
                if (context.testExpression("DataSetIdentifierDeclarations", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setDataSetIdentifierDeclarations(new ListUnmarshaller<DataSetIdentifierDeclaration>(
                            DataSetIdentifierDeclarationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Sheets", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setSheets(new ListUnmarshaller<SheetDefinition>(SheetDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CalculatedFields", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setCalculatedFields(new ListUnmarshaller<CalculatedField>(CalculatedFieldJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ParameterDeclarations", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setParameterDeclarations(new ListUnmarshaller<ParameterDeclaration>(ParameterDeclarationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FilterGroups", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setFilterGroups(new ListUnmarshaller<FilterGroup>(FilterGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ColumnConfigurations", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setColumnConfigurations(new ListUnmarshaller<ColumnConfiguration>(ColumnConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AnalysisDefaults", targetDepth)) {
                    context.nextToken();
                    analysisDefinition.setAnalysisDefaults(AnalysisDefaultsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return analysisDefinition;
    }

    private static AnalysisDefinitionJsonUnmarshaller instance;

    public static AnalysisDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisDefinitionJsonUnmarshaller();
        return instance;
    }
}

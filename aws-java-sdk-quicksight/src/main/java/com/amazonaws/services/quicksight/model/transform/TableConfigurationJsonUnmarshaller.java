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
 * TableConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableConfigurationJsonUnmarshaller implements Unmarshaller<TableConfiguration, JsonUnmarshallerContext> {

    public TableConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableConfiguration tableConfiguration = new TableConfiguration();

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
                if (context.testExpression("FieldWells", targetDepth)) {
                    context.nextToken();
                    tableConfiguration.setFieldWells(TableFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    context.nextToken();
                    tableConfiguration.setSortConfiguration(TableSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableOptions", targetDepth)) {
                    context.nextToken();
                    tableConfiguration.setTableOptions(TableOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TotalOptions", targetDepth)) {
                    context.nextToken();
                    tableConfiguration.setTotalOptions(TotalOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FieldOptions", targetDepth)) {
                    context.nextToken();
                    tableConfiguration.setFieldOptions(TableFieldOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PaginatedReportOptions", targetDepth)) {
                    context.nextToken();
                    tableConfiguration.setPaginatedReportOptions(TablePaginatedReportOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tableConfiguration;
    }

    private static TableConfigurationJsonUnmarshaller instance;

    public static TableConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableConfigurationJsonUnmarshaller();
        return instance;
    }
}

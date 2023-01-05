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
package com.amazonaws.services.lakeformation.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lakeformation.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataCellsFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCellsFilterJsonUnmarshaller implements Unmarshaller<DataCellsFilter, JsonUnmarshallerContext> {

    public DataCellsFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataCellsFilter dataCellsFilter = new DataCellsFilter();

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
                if (context.testExpression("TableCatalogId", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setTableCatalogId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RowFilter", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setRowFilter(RowFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ColumnNames", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setColumnNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ColumnWildcard", targetDepth)) {
                    context.nextToken();
                    dataCellsFilter.setColumnWildcard(ColumnWildcardJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataCellsFilter;
    }

    private static DataCellsFilterJsonUnmarshaller instance;

    public static DataCellsFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataCellsFilterJsonUnmarshaller();
        return instance;
    }
}

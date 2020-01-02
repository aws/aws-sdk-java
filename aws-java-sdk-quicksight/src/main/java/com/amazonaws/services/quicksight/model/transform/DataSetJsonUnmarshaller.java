/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DataSet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetJsonUnmarshaller implements Unmarshaller<DataSet, JsonUnmarshallerContext> {

    public DataSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataSet dataSet = new DataSet();

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
                    dataSet.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSetId", targetDepth)) {
                    context.nextToken();
                    dataSet.setDataSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    dataSet.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    dataSet.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    dataSet.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PhysicalTableMap", targetDepth)) {
                    context.nextToken();
                    dataSet.setPhysicalTableMap(new MapUnmarshaller<String, PhysicalTable>(context.getUnmarshaller(String.class), PhysicalTableJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("LogicalTableMap", targetDepth)) {
                    context.nextToken();
                    dataSet.setLogicalTableMap(new MapUnmarshaller<String, LogicalTable>(context.getUnmarshaller(String.class), LogicalTableJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("OutputColumns", targetDepth)) {
                    context.nextToken();
                    dataSet.setOutputColumns(new ListUnmarshaller<OutputColumn>(OutputColumnJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ImportMode", targetDepth)) {
                    context.nextToken();
                    dataSet.setImportMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConsumedSpiceCapacityInBytes", targetDepth)) {
                    context.nextToken();
                    dataSet.setConsumedSpiceCapacityInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ColumnGroups", targetDepth)) {
                    context.nextToken();
                    dataSet.setColumnGroups(new ListUnmarshaller<ColumnGroup>(ColumnGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("RowLevelPermissionDataSet", targetDepth)) {
                    context.nextToken();
                    dataSet.setRowLevelPermissionDataSet(RowLevelPermissionDataSetJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return dataSet;
    }

    private static DataSetJsonUnmarshaller instance;

    public static DataSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataSetJsonUnmarshaller();
        return instance;
    }
}

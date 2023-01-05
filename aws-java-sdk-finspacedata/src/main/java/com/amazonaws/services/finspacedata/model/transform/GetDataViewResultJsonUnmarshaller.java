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
package com.amazonaws.services.finspacedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDataViewResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataViewResultJsonUnmarshaller implements Unmarshaller<GetDataViewResult, JsonUnmarshallerContext> {

    public GetDataViewResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataViewResult getDataViewResult = new GetDataViewResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataViewResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("autoUpdate", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setAutoUpdate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("partitionColumns", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setPartitionColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("asOfTimestamp", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setAsOfTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setErrorInfo(DataViewErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sortColumns", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setSortColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dataViewId", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setDataViewId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataViewArn", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setDataViewArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationTypeParams", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setDestinationTypeParams(DataViewDestinationTypeParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getDataViewResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDataViewResult;
    }

    private static GetDataViewResultJsonUnmarshaller instance;

    public static GetDataViewResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataViewResultJsonUnmarshaller();
        return instance;
    }
}

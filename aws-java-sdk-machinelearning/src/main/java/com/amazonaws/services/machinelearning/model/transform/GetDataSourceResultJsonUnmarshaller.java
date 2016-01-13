/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDataSourceResult JSON Unmarshaller
 */
public class GetDataSourceResultJsonUnmarshaller implements
        Unmarshaller<GetDataSourceResult, JsonUnmarshallerContext> {

    public GetDataSourceResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetDataSourceResult getDataSourceResult = new GetDataSourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DataSourceId", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDataSourceId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLocationS3", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setDataLocationS3(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("DataRearrangement", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setDataRearrangement(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedByIamUser", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setCreatedByIamUser(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setCreatedAt(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setLastUpdatedAt(DateJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("DataSizeInBytes", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setDataSizeInBytes(LongJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("NumberOfFiles", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setNumberOfFiles(LongJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setStatus(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setLogUri(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setMessage(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftMetadata", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setRedshiftMetadata(RedshiftMetadataJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("RDSMetadata", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setRDSMetadata(RDSMetadataJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleARN", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult.setRoleARN(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("ComputeStatistics", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setComputeStatistics(BooleanJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("DataSourceSchema", targetDepth)) {
                    context.nextToken();
                    getDataSourceResult
                            .setDataSourceSchema(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDataSourceResult;
    }

    private static GetDataSourceResultJsonUnmarshaller instance;

    public static GetDataSourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataSourceResultJsonUnmarshaller();
        return instance;
    }
}

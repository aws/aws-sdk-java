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
 * GetChangesetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangesetResultJsonUnmarshaller implements Unmarshaller<GetChangesetResult, JsonUnmarshallerContext> {

    public GetChangesetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetChangesetResult getChangesetResult = new GetChangesetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getChangesetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("changesetId", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changesetArn", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setChangesetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changeType", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceParams", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setSourceParams(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("formatParams", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setFormatParams(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setErrorInfo(ChangesetErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activeUntilTimestamp", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setActiveUntilTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("activeFromTimestamp", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setActiveFromTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("updatesChangesetId", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setUpdatesChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedByChangesetId", targetDepth)) {
                    context.nextToken();
                    getChangesetResult.setUpdatedByChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getChangesetResult;
    }

    private static GetChangesetResultJsonUnmarshaller instance;

    public static GetChangesetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetChangesetResultJsonUnmarshaller();
        return instance;
    }
}

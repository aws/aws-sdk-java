/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ChangesetInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangesetInfoJsonUnmarshaller implements Unmarshaller<ChangesetInfo, JsonUnmarshallerContext> {

    public ChangesetInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChangesetInfo changesetInfo = new ChangesetInfo();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changesetArn", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setChangesetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changeType", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceType", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceParams", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setSourceParams(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("formatType", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setFormatType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formatParams", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setFormatParams(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("createTimestamp", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setCreateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("changesetLabels", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setChangesetLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("updatesChangesetId", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setUpdatesChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedByChangesetId", targetDepth)) {
                    context.nextToken();
                    changesetInfo.setUpdatedByChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return changesetInfo;
    }

    private static ChangesetInfoJsonUnmarshaller instance;

    public static ChangesetInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChangesetInfoJsonUnmarshaller();
        return instance;
    }
}

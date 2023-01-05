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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDataSetDetailsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSetDetailsResultJsonUnmarshaller implements Unmarshaller<GetDataSetDetailsResult, JsonUnmarshallerContext> {

    public GetDataSetDetailsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataSetDetailsResult getDataSetDetailsResult = new GetDataSetDetailsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataSetDetailsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("blocksize", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setBlocksize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dataSetName", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setDataSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSetOrg", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setDataSetOrg(DatasetDetailOrgAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastReferencedTime", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setLastReferencedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recordLength", targetDepth)) {
                    context.nextToken();
                    getDataSetDetailsResult.setRecordLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDataSetDetailsResult;
    }

    private static GetDataSetDetailsResultJsonUnmarshaller instance;

    public static GetDataSetDetailsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataSetDetailsResultJsonUnmarshaller();
        return instance;
    }
}

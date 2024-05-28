/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.osis.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.osis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetPipelineChangeProgressResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPipelineChangeProgressResultJsonUnmarshaller implements Unmarshaller<GetPipelineChangeProgressResult, JsonUnmarshallerContext> {

    public GetPipelineChangeProgressResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetPipelineChangeProgressResult getPipelineChangeProgressResult = new GetPipelineChangeProgressResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getPipelineChangeProgressResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ChangeProgressStatuses", targetDepth)) {
                    context.nextToken();
                    getPipelineChangeProgressResult.setChangeProgressStatuses(new ListUnmarshaller<ChangeProgressStatus>(ChangeProgressStatusJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getPipelineChangeProgressResult;
    }

    private static GetPipelineChangeProgressResultJsonUnmarshaller instance;

    public static GetPipelineChangeProgressResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPipelineChangeProgressResultJsonUnmarshaller();
        return instance;
    }
}

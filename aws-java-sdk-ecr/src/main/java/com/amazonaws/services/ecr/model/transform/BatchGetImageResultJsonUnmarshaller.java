/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetImageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetImageResultJsonUnmarshaller implements Unmarshaller<BatchGetImageResult, JsonUnmarshallerContext> {

    public BatchGetImageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetImageResult batchGetImageResult = new BatchGetImageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchGetImageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("images", targetDepth)) {
                    context.nextToken();
                    batchGetImageResult.setImages(new ListUnmarshaller<Image>(ImageJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("failures", targetDepth)) {
                    context.nextToken();
                    batchGetImageResult.setFailures(new ListUnmarshaller<ImageFailure>(ImageFailureJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchGetImageResult;
    }

    private static BatchGetImageResultJsonUnmarshaller instance;

    public static BatchGetImageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetImageResultJsonUnmarshaller();
        return instance;
    }
}

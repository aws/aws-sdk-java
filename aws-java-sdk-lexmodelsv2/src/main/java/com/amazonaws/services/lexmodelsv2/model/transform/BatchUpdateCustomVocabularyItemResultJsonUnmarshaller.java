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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchUpdateCustomVocabularyItemResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateCustomVocabularyItemResultJsonUnmarshaller implements Unmarshaller<BatchUpdateCustomVocabularyItemResult, JsonUnmarshallerContext> {

    public BatchUpdateCustomVocabularyItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchUpdateCustomVocabularyItemResult batchUpdateCustomVocabularyItemResult = new BatchUpdateCustomVocabularyItemResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchUpdateCustomVocabularyItemResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    batchUpdateCustomVocabularyItemResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    batchUpdateCustomVocabularyItemResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    batchUpdateCustomVocabularyItemResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errors", targetDepth)) {
                    context.nextToken();
                    batchUpdateCustomVocabularyItemResult.setErrors(new ListUnmarshaller<FailedCustomVocabularyItem>(FailedCustomVocabularyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resources", targetDepth)) {
                    context.nextToken();
                    batchUpdateCustomVocabularyItemResult.setResources(new ListUnmarshaller<CustomVocabularyItem>(CustomVocabularyItemJsonUnmarshaller
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

        return batchUpdateCustomVocabularyItemResult;
    }

    private static BatchUpdateCustomVocabularyItemResultJsonUnmarshaller instance;

    public static BatchUpdateCustomVocabularyItemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchUpdateCustomVocabularyItemResultJsonUnmarshaller();
        return instance;
    }
}

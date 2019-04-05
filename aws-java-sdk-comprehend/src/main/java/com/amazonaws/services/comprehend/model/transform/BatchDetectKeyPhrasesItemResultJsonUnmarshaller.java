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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchDetectKeyPhrasesItemResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectKeyPhrasesItemResultJsonUnmarshaller implements Unmarshaller<BatchDetectKeyPhrasesItemResult, JsonUnmarshallerContext> {

    public BatchDetectKeyPhrasesItemResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchDetectKeyPhrasesItemResult batchDetectKeyPhrasesItemResult = new BatchDetectKeyPhrasesItemResult();

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
                if (context.testExpression("Index", targetDepth)) {
                    context.nextToken();
                    batchDetectKeyPhrasesItemResult.setIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("KeyPhrases", targetDepth)) {
                    context.nextToken();
                    batchDetectKeyPhrasesItemResult.setKeyPhrases(new ListUnmarshaller<KeyPhrase>(KeyPhraseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchDetectKeyPhrasesItemResult;
    }

    private static BatchDetectKeyPhrasesItemResultJsonUnmarshaller instance;

    public static BatchDetectKeyPhrasesItemResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchDetectKeyPhrasesItemResultJsonUnmarshaller();
        return instance;
    }
}

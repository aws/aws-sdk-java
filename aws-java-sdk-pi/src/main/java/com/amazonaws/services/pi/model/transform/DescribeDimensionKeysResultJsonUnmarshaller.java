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
package com.amazonaws.services.pi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDimensionKeysResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDimensionKeysResultJsonUnmarshaller implements Unmarshaller<DescribeDimensionKeysResult, JsonUnmarshallerContext> {

    public DescribeDimensionKeysResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDimensionKeysResult describeDimensionKeysResult = new DescribeDimensionKeysResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDimensionKeysResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AlignedStartTime", targetDepth)) {
                    context.nextToken();
                    describeDimensionKeysResult.setAlignedStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AlignedEndTime", targetDepth)) {
                    context.nextToken();
                    describeDimensionKeysResult.setAlignedEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PartitionKeys", targetDepth)) {
                    context.nextToken();
                    describeDimensionKeysResult.setPartitionKeys(new ListUnmarshaller<ResponsePartitionKey>(ResponsePartitionKeyJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Keys", targetDepth)) {
                    context.nextToken();
                    describeDimensionKeysResult.setKeys(new ListUnmarshaller<DimensionKeyDescription>(DimensionKeyDescriptionJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    describeDimensionKeysResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDimensionKeysResult;
    }

    private static DescribeDimensionKeysResultJsonUnmarshaller instance;

    public static DescribeDimensionKeysResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDimensionKeysResultJsonUnmarshaller();
        return instance;
    }
}

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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchDisassociateResourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateResourceResultJsonUnmarshaller implements Unmarshaller<BatchDisassociateResourceResult, JsonUnmarshallerContext> {

    public BatchDisassociateResourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchDisassociateResourceResult batchDisassociateResourceResult = new BatchDisassociateResourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return batchDisassociateResourceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ResourceSetIdentifier", targetDepth)) {
                    context.nextToken();
                    batchDisassociateResourceResult.setResourceSetIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedItems", targetDepth)) {
                    context.nextToken();
                    batchDisassociateResourceResult.setFailedItems(new ListUnmarshaller<FailedItem>(FailedItemJsonUnmarshaller.getInstance())

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

        return batchDisassociateResourceResult;
    }

    private static BatchDisassociateResourceResultJsonUnmarshaller instance;

    public static BatchDisassociateResourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchDisassociateResourceResultJsonUnmarshaller();
        return instance;
    }
}

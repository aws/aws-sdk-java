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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TapeArchive JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TapeArchiveJsonUnmarshaller implements Unmarshaller<TapeArchive, JsonUnmarshallerContext> {

    public TapeArchive unmarshall(JsonUnmarshallerContext context) throws Exception {
        TapeArchive tapeArchive = new TapeArchive();

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
                if (context.testExpression("TapeARN", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setTapeARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeBarcode", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setTapeBarcode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeCreatedDate", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setTapeCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TapeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setTapeSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RetrievedTo", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setRetrievedTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeStatus", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setTapeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TapeUsedInBytes", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setTapeUsedInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PoolId", targetDepth)) {
                    context.nextToken();
                    tapeArchive.setPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return tapeArchive;
    }

    private static TapeArchiveJsonUnmarshaller instance;

    public static TapeArchiveJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TapeArchiveJsonUnmarshaller();
        return instance;
    }
}

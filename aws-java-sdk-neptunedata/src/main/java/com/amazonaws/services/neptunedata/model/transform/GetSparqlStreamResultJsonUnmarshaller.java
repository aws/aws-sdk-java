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
package com.amazonaws.services.neptunedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.neptunedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSparqlStreamResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSparqlStreamResultJsonUnmarshaller implements Unmarshaller<GetSparqlStreamResult, JsonUnmarshallerContext> {

    public GetSparqlStreamResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSparqlStreamResult getSparqlStreamResult = new GetSparqlStreamResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSparqlStreamResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("lastEventId", targetDepth)) {
                    context.nextToken();
                    getSparqlStreamResult.setLastEventId(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("lastTrxTimestamp", targetDepth)) {
                    context.nextToken();
                    getSparqlStreamResult.setLastTrxTimestampInMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("format", targetDepth)) {
                    context.nextToken();
                    getSparqlStreamResult.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("records", targetDepth)) {
                    context.nextToken();
                    getSparqlStreamResult.setRecords(new ListUnmarshaller<SparqlRecord>(SparqlRecordJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("totalRecords", targetDepth)) {
                    context.nextToken();
                    getSparqlStreamResult.setTotalRecords(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getSparqlStreamResult;
    }

    private static GetSparqlStreamResultJsonUnmarshaller instance;

    public static GetSparqlStreamResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSparqlStreamResultJsonUnmarshaller();
        return instance;
    }
}

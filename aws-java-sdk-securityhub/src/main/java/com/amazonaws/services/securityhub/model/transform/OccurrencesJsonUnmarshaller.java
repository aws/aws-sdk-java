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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Occurrences JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OccurrencesJsonUnmarshaller implements Unmarshaller<Occurrences, JsonUnmarshallerContext> {

    public Occurrences unmarshall(JsonUnmarshallerContext context) throws Exception {
        Occurrences occurrences = new Occurrences();

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
                if (context.testExpression("LineRanges", targetDepth)) {
                    context.nextToken();
                    occurrences.setLineRanges(new ListUnmarshaller<Range>(RangeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OffsetRanges", targetDepth)) {
                    context.nextToken();
                    occurrences.setOffsetRanges(new ListUnmarshaller<Range>(RangeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Pages", targetDepth)) {
                    context.nextToken();
                    occurrences.setPages(new ListUnmarshaller<Page>(PageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Records", targetDepth)) {
                    context.nextToken();
                    occurrences.setRecords(new ListUnmarshaller<Record>(RecordJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Cells", targetDepth)) {
                    context.nextToken();
                    occurrences.setCells(new ListUnmarshaller<Cell>(CellJsonUnmarshaller.getInstance())

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

        return occurrences;
    }

    private static OccurrencesJsonUnmarshaller instance;

    public static OccurrencesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OccurrencesJsonUnmarshaller();
        return instance;
    }
}

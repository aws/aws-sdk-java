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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetReservationCoverageResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservationCoverageResultJsonUnmarshaller implements Unmarshaller<GetReservationCoverageResult, JsonUnmarshallerContext> {

    public GetReservationCoverageResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetReservationCoverageResult getReservationCoverageResult = new GetReservationCoverageResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getReservationCoverageResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CoveragesByTime", targetDepth)) {
                    context.nextToken();
                    getReservationCoverageResult.setCoveragesByTime(new ListUnmarshaller<CoverageByTime>(CoverageByTimeJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("Total", targetDepth)) {
                    context.nextToken();
                    getReservationCoverageResult.setTotal(CoverageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextPageToken", targetDepth)) {
                    context.nextToken();
                    getReservationCoverageResult.setNextPageToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getReservationCoverageResult;
    }

    private static GetReservationCoverageResultJsonUnmarshaller instance;

    public static GetReservationCoverageResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetReservationCoverageResultJsonUnmarshaller();
        return instance;
    }
}

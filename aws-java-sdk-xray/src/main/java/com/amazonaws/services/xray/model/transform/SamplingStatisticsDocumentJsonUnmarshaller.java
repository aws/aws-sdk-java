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
package com.amazonaws.services.xray.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SamplingStatisticsDocument JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamplingStatisticsDocumentJsonUnmarshaller implements Unmarshaller<SamplingStatisticsDocument, JsonUnmarshallerContext> {

    public SamplingStatisticsDocument unmarshall(JsonUnmarshallerContext context) throws Exception {
        SamplingStatisticsDocument samplingStatisticsDocument = new SamplingStatisticsDocument();

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
                if (context.testExpression("RuleName", targetDepth)) {
                    context.nextToken();
                    samplingStatisticsDocument.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientID", targetDepth)) {
                    context.nextToken();
                    samplingStatisticsDocument.setClientID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    samplingStatisticsDocument.setTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RequestCount", targetDepth)) {
                    context.nextToken();
                    samplingStatisticsDocument.setRequestCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SampledCount", targetDepth)) {
                    context.nextToken();
                    samplingStatisticsDocument.setSampledCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BorrowCount", targetDepth)) {
                    context.nextToken();
                    samplingStatisticsDocument.setBorrowCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return samplingStatisticsDocument;
    }

    private static SamplingStatisticsDocumentJsonUnmarshaller instance;

    public static SamplingStatisticsDocumentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SamplingStatisticsDocumentJsonUnmarshaller();
        return instance;
    }
}

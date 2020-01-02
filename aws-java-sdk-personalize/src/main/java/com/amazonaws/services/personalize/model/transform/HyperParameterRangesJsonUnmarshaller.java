/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HyperParameterRanges JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterRangesJsonUnmarshaller implements Unmarshaller<HyperParameterRanges, JsonUnmarshallerContext> {

    public HyperParameterRanges unmarshall(JsonUnmarshallerContext context) throws Exception {
        HyperParameterRanges hyperParameterRanges = new HyperParameterRanges();

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
                if (context.testExpression("integerHyperParameterRanges", targetDepth)) {
                    context.nextToken();
                    hyperParameterRanges.setIntegerHyperParameterRanges(new ListUnmarshaller<IntegerHyperParameterRange>(
                            IntegerHyperParameterRangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("continuousHyperParameterRanges", targetDepth)) {
                    context.nextToken();
                    hyperParameterRanges.setContinuousHyperParameterRanges(new ListUnmarshaller<ContinuousHyperParameterRange>(
                            ContinuousHyperParameterRangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("categoricalHyperParameterRanges", targetDepth)) {
                    context.nextToken();
                    hyperParameterRanges.setCategoricalHyperParameterRanges(new ListUnmarshaller<CategoricalHyperParameterRange>(
                            CategoricalHyperParameterRangeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return hyperParameterRanges;
    }

    private static HyperParameterRangesJsonUnmarshaller instance;

    public static HyperParameterRangesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterRangesJsonUnmarshaller();
        return instance;
    }
}

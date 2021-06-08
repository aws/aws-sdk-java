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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLensVersionDifferenceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLensVersionDifferenceResultJsonUnmarshaller implements Unmarshaller<GetLensVersionDifferenceResult, JsonUnmarshallerContext> {

    public GetLensVersionDifferenceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLensVersionDifferenceResult getLensVersionDifferenceResult = new GetLensVersionDifferenceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLensVersionDifferenceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LensAlias", targetDepth)) {
                    context.nextToken();
                    getLensVersionDifferenceResult.setLensAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaseLensVersion", targetDepth)) {
                    context.nextToken();
                    getLensVersionDifferenceResult.setBaseLensVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestLensVersion", targetDepth)) {
                    context.nextToken();
                    getLensVersionDifferenceResult.setLatestLensVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionDifferences", targetDepth)) {
                    context.nextToken();
                    getLensVersionDifferenceResult.setVersionDifferences(VersionDifferencesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLensVersionDifferenceResult;
    }

    private static GetLensVersionDifferenceResultJsonUnmarshaller instance;

    public static GetLensVersionDifferenceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLensVersionDifferenceResultJsonUnmarshaller();
        return instance;
    }
}

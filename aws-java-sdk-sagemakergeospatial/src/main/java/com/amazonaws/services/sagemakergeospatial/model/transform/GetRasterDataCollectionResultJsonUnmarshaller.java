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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRasterDataCollectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRasterDataCollectionResultJsonUnmarshaller implements Unmarshaller<GetRasterDataCollectionResult, JsonUnmarshallerContext> {

    public GetRasterDataCollectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRasterDataCollectionResult getRasterDataCollectionResult = new GetRasterDataCollectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRasterDataCollectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DescriptionPageUrl", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setDescriptionPageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageSourceBands", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setImageSourceBands(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportedFilters", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setSupportedFilters(new ListUnmarshaller<Filter>(FilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    getRasterDataCollectionResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRasterDataCollectionResult;
    }

    private static GetRasterDataCollectionResultJsonUnmarshaller instance;

    public static GetRasterDataCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRasterDataCollectionResultJsonUnmarshaller();
        return instance;
    }
}

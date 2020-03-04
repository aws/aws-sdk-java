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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRecommenderConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommenderConfigurationResultJsonUnmarshaller implements Unmarshaller<GetRecommenderConfigurationResult, JsonUnmarshallerContext> {

    public GetRecommenderConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRecommenderConfigurationResult getRecommenderConfigurationResult = new GetRecommenderConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRecommenderConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            getRecommenderConfigurationResult.setRecommenderConfigurationResponse(RecommenderConfigurationResponseJsonUnmarshaller.getInstance().unmarshall(
                    context));
            token = context.nextToken();
        }

        return getRecommenderConfigurationResult;
    }

    private static GetRecommenderConfigurationResultJsonUnmarshaller instance;

    public static GetRecommenderConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRecommenderConfigurationResultJsonUnmarshaller();
        return instance;
    }
}

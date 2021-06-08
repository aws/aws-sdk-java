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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePlaceIndexResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePlaceIndexResultJsonUnmarshaller implements Unmarshaller<DescribePlaceIndexResult, JsonUnmarshallerContext> {

    public DescribePlaceIndexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePlaceIndexResult describePlaceIndexResult = new DescribePlaceIndexResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePlaceIndexResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSourceConfiguration", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setDataSourceConfiguration(DataSourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexArn", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setIndexArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexName", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PricingPlan", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setPricingPlan(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    context.nextToken();
                    describePlaceIndexResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePlaceIndexResult;
    }

    private static DescribePlaceIndexResultJsonUnmarshaller instance;

    public static DescribePlaceIndexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePlaceIndexResultJsonUnmarshaller();
        return instance;
    }
}

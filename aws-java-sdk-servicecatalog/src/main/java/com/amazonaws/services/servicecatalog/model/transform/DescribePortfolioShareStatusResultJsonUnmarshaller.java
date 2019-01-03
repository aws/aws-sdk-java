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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePortfolioShareStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePortfolioShareStatusResultJsonUnmarshaller implements Unmarshaller<DescribePortfolioShareStatusResult, JsonUnmarshallerContext> {

    public DescribePortfolioShareStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePortfolioShareStatusResult describePortfolioShareStatusResult = new DescribePortfolioShareStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePortfolioShareStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PortfolioShareToken", targetDepth)) {
                    context.nextToken();
                    describePortfolioShareStatusResult.setPortfolioShareToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PortfolioId", targetDepth)) {
                    context.nextToken();
                    describePortfolioShareStatusResult.setPortfolioId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationNodeValue", targetDepth)) {
                    context.nextToken();
                    describePortfolioShareStatusResult.setOrganizationNodeValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describePortfolioShareStatusResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareDetails", targetDepth)) {
                    context.nextToken();
                    describePortfolioShareStatusResult.setShareDetails(ShareDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describePortfolioShareStatusResult;
    }

    private static DescribePortfolioShareStatusResultJsonUnmarshaller instance;

    public static DescribePortfolioShareStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePortfolioShareStatusResultJsonUnmarshaller();
        return instance;
    }
}

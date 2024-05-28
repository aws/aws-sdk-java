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
package com.amazonaws.services.pricing.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pricing.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PriceList JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PriceListJsonUnmarshaller implements Unmarshaller<PriceList, JsonUnmarshallerContext> {

    public PriceList unmarshall(JsonUnmarshallerContext context) throws Exception {
        PriceList priceList = new PriceList();

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
                if (context.testExpression("PriceListArn", targetDepth)) {
                    context.nextToken();
                    priceList.setPriceListArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegionCode", targetDepth)) {
                    context.nextToken();
                    priceList.setRegionCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    context.nextToken();
                    priceList.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileFormats", targetDepth)) {
                    context.nextToken();
                    priceList.setFileFormats(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return priceList;
    }

    private static PriceListJsonUnmarshaller instance;

    public static PriceListJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PriceListJsonUnmarshaller();
        return instance;
    }
}

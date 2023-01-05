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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CellTowers JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CellTowersJsonUnmarshaller implements Unmarshaller<CellTowers, JsonUnmarshallerContext> {

    public CellTowers unmarshall(JsonUnmarshallerContext context) throws Exception {
        CellTowers cellTowers = new CellTowers();

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
                if (context.testExpression("Gsm", targetDepth)) {
                    context.nextToken();
                    cellTowers.setGsm(new ListUnmarshaller<GsmObj>(GsmObjJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Wcdma", targetDepth)) {
                    context.nextToken();
                    cellTowers.setWcdma(new ListUnmarshaller<WcdmaObj>(WcdmaObjJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tdscdma", targetDepth)) {
                    context.nextToken();
                    cellTowers.setTdscdma(new ListUnmarshaller<TdscdmaObj>(TdscdmaObjJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Lte", targetDepth)) {
                    context.nextToken();
                    cellTowers.setLte(new ListUnmarshaller<LteObj>(LteObjJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Cdma", targetDepth)) {
                    context.nextToken();
                    cellTowers.setCdma(new ListUnmarshaller<CdmaObj>(CdmaObjJsonUnmarshaller.getInstance())

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

        return cellTowers;
    }

    private static CellTowersJsonUnmarshaller instance;

    public static CellTowersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CellTowersJsonUnmarshaller();
        return instance;
    }
}

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
 * TdscdmaObj JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TdscdmaObjJsonUnmarshaller implements Unmarshaller<TdscdmaObj, JsonUnmarshallerContext> {

    public TdscdmaObj unmarshall(JsonUnmarshallerContext context) throws Exception {
        TdscdmaObj tdscdmaObj = new TdscdmaObj();

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
                if (context.testExpression("Mcc", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setMcc(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Mnc", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setMnc(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Lac", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setLac(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UtranCid", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setUtranCid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TdscdmaLocalId", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setTdscdmaLocalId(TdscdmaLocalIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TdscdmaTimingAdvance", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setTdscdmaTimingAdvance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Rscp", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setRscp(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PathLoss", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setPathLoss(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TdscdmaNmr", targetDepth)) {
                    context.nextToken();
                    tdscdmaObj.setTdscdmaNmr(new ListUnmarshaller<TdscdmaNmrObj>(TdscdmaNmrObjJsonUnmarshaller.getInstance())

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

        return tdscdmaObj;
    }

    private static TdscdmaObjJsonUnmarshaller instance;

    public static TdscdmaObjJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TdscdmaObjJsonUnmarshaller();
        return instance;
    }
}

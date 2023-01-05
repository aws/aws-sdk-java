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
 * WcdmaObj JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WcdmaObjJsonUnmarshaller implements Unmarshaller<WcdmaObj, JsonUnmarshallerContext> {

    public WcdmaObj unmarshall(JsonUnmarshallerContext context) throws Exception {
        WcdmaObj wcdmaObj = new WcdmaObj();

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
                    wcdmaObj.setMcc(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Mnc", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setMnc(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Lac", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setLac(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UtranCid", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setUtranCid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WcdmaLocalId", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setWcdmaLocalId(WcdmaLocalIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Rscp", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setRscp(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PathLoss", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setPathLoss(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WcdmaNmr", targetDepth)) {
                    context.nextToken();
                    wcdmaObj.setWcdmaNmr(new ListUnmarshaller<WcdmaNmrObj>(WcdmaNmrObjJsonUnmarshaller.getInstance())

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

        return wcdmaObj;
    }

    private static WcdmaObjJsonUnmarshaller instance;

    public static WcdmaObjJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WcdmaObjJsonUnmarshaller();
        return instance;
    }
}

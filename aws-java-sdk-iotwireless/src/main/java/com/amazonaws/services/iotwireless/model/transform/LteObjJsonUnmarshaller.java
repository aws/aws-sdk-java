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
 * LteObj JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LteObjJsonUnmarshaller implements Unmarshaller<LteObj, JsonUnmarshallerContext> {

    public LteObj unmarshall(JsonUnmarshallerContext context) throws Exception {
        LteObj lteObj = new LteObj();

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
                    lteObj.setMcc(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Mnc", targetDepth)) {
                    context.nextToken();
                    lteObj.setMnc(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EutranCid", targetDepth)) {
                    context.nextToken();
                    lteObj.setEutranCid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Tac", targetDepth)) {
                    context.nextToken();
                    lteObj.setTac(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LteLocalId", targetDepth)) {
                    context.nextToken();
                    lteObj.setLteLocalId(LteLocalIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LteTimingAdvance", targetDepth)) {
                    context.nextToken();
                    lteObj.setLteTimingAdvance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Rsrp", targetDepth)) {
                    context.nextToken();
                    lteObj.setRsrp(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Rsrq", targetDepth)) {
                    context.nextToken();
                    lteObj.setRsrq(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("NrCapable", targetDepth)) {
                    context.nextToken();
                    lteObj.setNrCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LteNmr", targetDepth)) {
                    context.nextToken();
                    lteObj.setLteNmr(new ListUnmarshaller<LteNmrObj>(LteNmrObjJsonUnmarshaller.getInstance())

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

        return lteObj;
    }

    private static LteObjJsonUnmarshaller instance;

    public static LteObjJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LteObjJsonUnmarshaller();
        return instance;
    }
}

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
 * LteNmrObj JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LteNmrObjJsonUnmarshaller implements Unmarshaller<LteNmrObj, JsonUnmarshallerContext> {

    public LteNmrObj unmarshall(JsonUnmarshallerContext context) throws Exception {
        LteNmrObj lteNmrObj = new LteNmrObj();

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
                if (context.testExpression("Pci", targetDepth)) {
                    context.nextToken();
                    lteNmrObj.setPci(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Earfcn", targetDepth)) {
                    context.nextToken();
                    lteNmrObj.setEarfcn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EutranCid", targetDepth)) {
                    context.nextToken();
                    lteNmrObj.setEutranCid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Rsrp", targetDepth)) {
                    context.nextToken();
                    lteNmrObj.setRsrp(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Rsrq", targetDepth)) {
                    context.nextToken();
                    lteNmrObj.setRsrq(context.getUnmarshaller(Float.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lteNmrObj;
    }

    private static LteNmrObjJsonUnmarshaller instance;

    public static LteNmrObjJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LteNmrObjJsonUnmarshaller();
        return instance;
    }
}

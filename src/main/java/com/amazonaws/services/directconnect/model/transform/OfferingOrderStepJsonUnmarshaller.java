/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directconnect.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Offering Order Step JSON Unmarshaller
 */
public class OfferingOrderStepJsonUnmarshaller implements Unmarshaller<OfferingOrderStep, JsonUnmarshallerContext> {

    

    public OfferingOrderStep unmarshall(JsonUnmarshallerContext context) throws Exception {
        OfferingOrderStep offeringOrderStep = new OfferingOrderStep();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("number", targetDepth)) {
                    context.nextToken();
                    offeringOrderStep.setNumber(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    offeringOrderStep.setName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    offeringOrderStep.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    context.nextToken();
                    offeringOrderStep.setOwner(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sla", targetDepth)) {
                    context.nextToken();
                    offeringOrderStep.setSla(IntegerJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            

            token = context.nextToken();
        }
        
        return offeringOrderStep;
    }

    private static OfferingOrderStepJsonUnmarshaller instance;
    public static OfferingOrderStepJsonUnmarshaller getInstance() {
        if (instance == null) instance = new OfferingOrderStepJsonUnmarshaller();
        return instance;
    }
}
    
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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Hadoop Step Config JSON Unmarshaller
 */
public class HadoopStepConfigJsonUnmarshaller implements Unmarshaller<HadoopStepConfig, JsonUnmarshallerContext> {

    

    public HadoopStepConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        HadoopStepConfig hadoopStepConfig = new HadoopStepConfig();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Jar", targetDepth)) {
                    context.nextToken();
                    hadoopStepConfig.setJar(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Properties", targetDepth)) {
                    hadoopStepConfig.setProperties(new MapUnmarshaller<String,String>(StringJsonUnmarshaller.getInstance(), StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("MainClass", targetDepth)) {
                    context.nextToken();
                    hadoopStepConfig.setMainClass(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Args", targetDepth)) {
                    hadoopStepConfig.setArgs(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return hadoopStepConfig;
    }

    private static HadoopStepConfigJsonUnmarshaller instance;
    public static HadoopStepConfigJsonUnmarshaller getInstance() {
        if (instance == null) instance = new HadoopStepConfigJsonUnmarshaller();
        return instance;
    }
}
    
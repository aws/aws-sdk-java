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

package com.amazonaws.services.glacier.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Initiate Job Result JSON Unmarshaller
 */
public class InitiateJobResultJsonUnmarshaller implements Unmarshaller<InitiateJobResult, JsonUnmarshallerContext> {

    

    public InitiateJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        InitiateJobResult initiateJobResult = new InitiateJobResult();

        
        

        if (context.isStartOfDocument()) {
            if (context.getHeader("Location") != null)
                initiateJobResult.setLocation(context.getHeader("Location"));
            if (context.getHeader("x-amz-job-id") != null)
                initiateJobResult.setJobId(context.getHeader("x-amz-job-id"));
        }
        
        return initiateJobResult;
    }

    private static InitiateJobResultJsonUnmarshaller instance;
    public static InitiateJobResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new InitiateJobResultJsonUnmarshaller();
        return instance;
    }
}
    
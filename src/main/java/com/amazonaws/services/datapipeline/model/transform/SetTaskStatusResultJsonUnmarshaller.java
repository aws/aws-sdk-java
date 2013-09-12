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

package com.amazonaws.services.datapipeline.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Set Task Status Result JSON Unmarshaller
 */
public class SetTaskStatusResultJsonUnmarshaller implements Unmarshaller<SetTaskStatusResult, JsonUnmarshallerContext> {

    

    public SetTaskStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SetTaskStatusResult setTaskStatusResult = new SetTaskStatusResult();

        
        
        return setTaskStatusResult;
    }

    private static SetTaskStatusResultJsonUnmarshaller instance;
    public static SetTaskStatusResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new SetTaskStatusResultJsonUnmarshaller();
        return instance;
    }
}
    
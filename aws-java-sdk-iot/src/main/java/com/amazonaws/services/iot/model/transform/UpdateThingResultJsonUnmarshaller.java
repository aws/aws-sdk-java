/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.*;

/**
 * UpdateThingResult JSON Unmarshaller
 */
public class UpdateThingResultJsonUnmarshaller implements Unmarshaller<UpdateThingResult, JsonUnmarshallerContext> {

    public UpdateThingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateThingResult updateThingResult = new UpdateThingResult();

        return updateThingResult;
    }

    private static UpdateThingResultJsonUnmarshaller instance;

    public static UpdateThingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateThingResultJsonUnmarshaller();
        return instance;
    }
}

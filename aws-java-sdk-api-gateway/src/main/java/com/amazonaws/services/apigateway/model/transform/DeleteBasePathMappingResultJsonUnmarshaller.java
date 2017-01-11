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
package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.*;

/**
 * DeleteBasePathMappingResult JSON Unmarshaller
 */
public class DeleteBasePathMappingResultJsonUnmarshaller implements Unmarshaller<DeleteBasePathMappingResult, JsonUnmarshallerContext> {

    public DeleteBasePathMappingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteBasePathMappingResult deleteBasePathMappingResult = new DeleteBasePathMappingResult();

        return deleteBasePathMappingResult;
    }

    private static DeleteBasePathMappingResultJsonUnmarshaller instance;

    public static DeleteBasePathMappingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteBasePathMappingResultJsonUnmarshaller();
        return instance;
    }
}

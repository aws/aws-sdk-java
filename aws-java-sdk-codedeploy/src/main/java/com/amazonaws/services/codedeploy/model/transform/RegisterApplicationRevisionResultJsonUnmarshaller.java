/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.*;

/**
 * RegisterApplicationRevisionResult JSON Unmarshaller
 */
public class RegisterApplicationRevisionResultJsonUnmarshaller implements Unmarshaller<RegisterApplicationRevisionResult, JsonUnmarshallerContext> {

    public RegisterApplicationRevisionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegisterApplicationRevisionResult registerApplicationRevisionResult = new RegisterApplicationRevisionResult();

        return registerApplicationRevisionResult;
    }

    private static RegisterApplicationRevisionResultJsonUnmarshaller instance;

    public static RegisterApplicationRevisionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisterApplicationRevisionResultJsonUnmarshaller();
        return instance;
    }
}

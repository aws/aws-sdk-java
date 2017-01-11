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
package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.*;

/**
 * DeleteConstraintResult JSON Unmarshaller
 */
public class DeleteConstraintResultJsonUnmarshaller implements Unmarshaller<DeleteConstraintResult, JsonUnmarshallerContext> {

    public DeleteConstraintResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteConstraintResult deleteConstraintResult = new DeleteConstraintResult();

        return deleteConstraintResult;
    }

    private static DeleteConstraintResultJsonUnmarshaller instance;

    public static DeleteConstraintResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteConstraintResultJsonUnmarshaller();
        return instance;
    }
}

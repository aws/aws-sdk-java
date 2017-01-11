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
package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.*;

/**
 * IncreaseStreamRetentionPeriodResult JSON Unmarshaller
 */
public class IncreaseStreamRetentionPeriodResultJsonUnmarshaller implements Unmarshaller<IncreaseStreamRetentionPeriodResult, JsonUnmarshallerContext> {

    public IncreaseStreamRetentionPeriodResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        IncreaseStreamRetentionPeriodResult increaseStreamRetentionPeriodResult = new IncreaseStreamRetentionPeriodResult();

        return increaseStreamRetentionPeriodResult;
    }

    private static IncreaseStreamRetentionPeriodResultJsonUnmarshaller instance;

    public static IncreaseStreamRetentionPeriodResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IncreaseStreamRetentionPeriodResultJsonUnmarshaller();
        return instance;
    }
}

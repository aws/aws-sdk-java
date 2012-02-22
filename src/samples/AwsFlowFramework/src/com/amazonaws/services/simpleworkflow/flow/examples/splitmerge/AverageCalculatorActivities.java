/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.examples.splitmerge;

import java.io.IOException;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.Activity;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry;

@Activities(version = "1.0")
@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 30, defaultTaskStartToCloseTimeoutSeconds = 30)
public interface AverageCalculatorActivities {

    @Activity(name = "computeDataSize")
    int computeDataSizeForInputData(String bucketName, String filename);

    @ExponentialRetry(initialRetryIntervalSeconds = 10, maximumAttempts = 10)
    int computeSumForChunk(String bucketName, String filename, int chunkNumber, int chunkSize) throws IOException;

    void reportResult(double average);
    
}

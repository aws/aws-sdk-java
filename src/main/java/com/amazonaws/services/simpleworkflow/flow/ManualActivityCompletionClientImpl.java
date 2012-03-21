/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow;

import java.util.concurrent.CancellationException;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.model.ActivityTaskStatus;
import com.amazonaws.services.simpleworkflow.model.RecordActivityTaskHeartbeatRequest;
import com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCanceledRequest;
import com.amazonaws.services.simpleworkflow.model.RespondActivityTaskCompletedRequest;
import com.amazonaws.services.simpleworkflow.model.RespondActivityTaskFailedRequest;

class ManualActivityCompletionClientImpl extends ManualActivityCompletionClient {

    private final AmazonSimpleWorkflow service;

    private final String taskToken;

    private final DataConverter dataConverter;

    public ManualActivityCompletionClientImpl(AmazonSimpleWorkflow service, String taskToken, DataConverter dataConverter) {
        this.service = service;
        this.taskToken = taskToken;
        this.dataConverter = dataConverter;
    }

    @Override
    public void complete(Object result) {
        RespondActivityTaskCompletedRequest request = new RespondActivityTaskCompletedRequest();
        String convertedResult = dataConverter.toData(result);
        request.setResult(convertedResult);
        request.setTaskToken(taskToken);
        service.respondActivityTaskCompleted(request);
    }

    @Override
    public void fail(Throwable failure) {
        RespondActivityTaskFailedRequest request = new RespondActivityTaskFailedRequest();
        String convertedFailure = dataConverter.toData(failure);
        request.setReason(failure.getMessage());
        request.setDetails(convertedFailure);
        request.setTaskToken(taskToken);
        service.respondActivityTaskFailed(request);
    }

    @Override
    public void recordHeartbeat(String details) throws CancellationException {
        RecordActivityTaskHeartbeatRequest request = new RecordActivityTaskHeartbeatRequest();
        request.setDetails(details);
        request.setTaskToken(taskToken);
        ActivityTaskStatus status = service.recordActivityTaskHeartbeat(request);
        status = service.recordActivityTaskHeartbeat(request);
        if (status.isCancelRequested()) {
            throw new CancellationException();
        }
    }

    @Override
    public void reportCancellation(String details) {
        RespondActivityTaskCanceledRequest request = new RespondActivityTaskCanceledRequest();
        request.setDetails(details);
        request.setTaskToken(taskToken);
        service.respondActivityTaskCanceled(request);
    }

}

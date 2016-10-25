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
package com.amazonaws.services.sqs.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DeleteMessageBatchRequest Marshaller
 */

public class DeleteMessageBatchRequestMarshaller implements Marshaller<Request<DeleteMessageBatchRequest>, DeleteMessageBatchRequest> {

    public Request<DeleteMessageBatchRequest> marshall(DeleteMessageBatchRequest deleteMessageBatchRequest) {

        if (deleteMessageBatchRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMessageBatchRequest> request = new DefaultRequest<DeleteMessageBatchRequest>(deleteMessageBatchRequest, "AmazonSQS");
        request.addParameter("Action", "DeleteMessageBatch");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteMessageBatchRequest.getQueueUrl() != null) {
            request.addParameter("QueueUrl", StringUtils.fromString(deleteMessageBatchRequest.getQueueUrl()));
        }

        com.amazonaws.internal.SdkInternalList<DeleteMessageBatchRequestEntry> entriesList = (com.amazonaws.internal.SdkInternalList<DeleteMessageBatchRequestEntry>) deleteMessageBatchRequest
                .getEntries();
        if (!entriesList.isEmpty() || !entriesList.isAutoConstruct()) {
            int entriesListIndex = 1;

            for (DeleteMessageBatchRequestEntry entriesListValue : entriesList) {

                if (entriesListValue.getId() != null) {
                    request.addParameter("DeleteMessageBatchRequestEntry." + entriesListIndex + ".Id", StringUtils.fromString(entriesListValue.getId()));
                }

                if (entriesListValue.getReceiptHandle() != null) {
                    request.addParameter("DeleteMessageBatchRequestEntry." + entriesListIndex + ".ReceiptHandle",
                            StringUtils.fromString(entriesListValue.getReceiptHandle()));
                }
                entriesListIndex++;
            }
        }

        return request;
    }

}

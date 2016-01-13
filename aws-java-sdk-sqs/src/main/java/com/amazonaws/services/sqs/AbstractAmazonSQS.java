/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.sqs;

import com.amazonaws.services.sqs.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonSQS}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonSQS implements AmazonSQS {

    protected AbstractAmazonSQS() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void addPermission(AddPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void addPermission(String queueUrl, String label,
            java.util.List<String> aWSAccountIds, java.util.List<String> actions) {
        addPermission(new AddPermissionRequest().withQueueUrl(queueUrl)
                .withLabel(label).withAWSAccountIds(aWSAccountIds)
                .withActions(actions));
    }

    @Override
    public void changeMessageVisibility(ChangeMessageVisibilityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void changeMessageVisibility(String queueUrl, String receiptHandle,
            Integer visibilityTimeout) {
        changeMessageVisibility(new ChangeMessageVisibilityRequest()
                .withQueueUrl(queueUrl).withReceiptHandle(receiptHandle)
                .withVisibilityTimeout(visibilityTimeout));
    }

    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(
            ChangeMessageVisibilityBatchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ChangeMessageVisibilityBatchResult changeMessageVisibilityBatch(
            String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {
        return changeMessageVisibilityBatch(new ChangeMessageVisibilityBatchRequest()
                .withQueueUrl(queueUrl).withEntries(entries));
    }

    @Override
    public CreateQueueResult createQueue(CreateQueueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateQueueResult createQueue(String queueName) {
        return createQueue(new CreateQueueRequest().withQueueName(queueName));
    }

    @Override
    public void deleteMessage(DeleteMessageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteMessage(String queueUrl, String receiptHandle) {
        deleteMessage(new DeleteMessageRequest().withQueueUrl(queueUrl)
                .withReceiptHandle(receiptHandle));
    }

    @Override
    public DeleteMessageBatchResult deleteMessageBatch(
            DeleteMessageBatchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteMessageBatchResult deleteMessageBatch(String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries) {
        return deleteMessageBatch(new DeleteMessageBatchRequest().withQueueUrl(
                queueUrl).withEntries(entries));
    }

    @Override
    public void deleteQueue(DeleteQueueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteQueue(String queueUrl) {
        deleteQueue(new DeleteQueueRequest().withQueueUrl(queueUrl));
    }

    @Override
    public GetQueueAttributesResult getQueueAttributes(
            GetQueueAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueueAttributesResult getQueueAttributes(String queueUrl,
            java.util.List<String> attributeNames) {
        return getQueueAttributes(new GetQueueAttributesRequest().withQueueUrl(
                queueUrl).withAttributeNames(attributeNames));
    }

    @Override
    public GetQueueUrlResult getQueueUrl(GetQueueUrlRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetQueueUrlResult getQueueUrl(String queueName) {
        return getQueueUrl(new GetQueueUrlRequest().withQueueName(queueName));
    }

    @Override
    public ListDeadLetterSourceQueuesResult listDeadLetterSourceQueues(
            ListDeadLetterSourceQueuesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListQueuesResult listQueues(ListQueuesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListQueuesResult listQueues() {
        return listQueues(new ListQueuesRequest());
    }

    @Override
    public ListQueuesResult listQueues(String queueNamePrefix) {
        return listQueues(new ListQueuesRequest()
                .withQueueNamePrefix(queueNamePrefix));
    }

    @Override
    public void purgeQueue(PurgeQueueRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReceiveMessageResult receiveMessage(ReceiveMessageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReceiveMessageResult receiveMessage(String queueUrl) {
        return receiveMessage(new ReceiveMessageRequest()
                .withQueueUrl(queueUrl));
    }

    @Override
    public void removePermission(RemovePermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void removePermission(String queueUrl, String label) {
        removePermission(new RemovePermissionRequest().withQueueUrl(queueUrl)
                .withLabel(label));
    }

    @Override
    public SendMessageResult sendMessage(SendMessageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendMessageResult sendMessage(String queueUrl, String messageBody) {
        return sendMessage(new SendMessageRequest().withQueueUrl(queueUrl)
                .withMessageBody(messageBody));
    }

    @Override
    public SendMessageBatchResult sendMessageBatch(
            SendMessageBatchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendMessageBatchResult sendMessageBatch(String queueUrl,
            java.util.List<SendMessageBatchRequestEntry> entries) {
        return sendMessageBatch(new SendMessageBatchRequest().withQueueUrl(
                queueUrl).withEntries(entries));
    }

    @Override
    public void setQueueAttributes(SetQueueAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setQueueAttributes(String queueUrl,
            java.util.Map<String, String> attributes) {
        setQueueAttributes(new SetQueueAttributesRequest().withQueueUrl(
                queueUrl).withAttributes(attributes));
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}

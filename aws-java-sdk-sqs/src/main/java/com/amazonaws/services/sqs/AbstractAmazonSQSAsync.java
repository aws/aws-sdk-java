/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs;

import javax.annotation.Generated;

import com.amazonaws.services.sqs.model.*;

/**
 * Abstract implementation of {@code AmazonSQSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSQSAsync extends AbstractAmazonSQS implements AmazonSQSAsync {

    protected AbstractAmazonSQSAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String queueUrl, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actions) {

        return addPermissionAsync(new AddPermissionRequest().withQueueUrl(queueUrl).withLabel(label).withAWSAccountIds(aWSAccountIds).withActions(actions));
    }

    /**
     * Simplified method form for invoking the AddPermission operation with an AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<AddPermissionResult> addPermissionAsync(String queueUrl, String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actions, com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler) {

        return addPermissionAsync(new AddPermissionRequest().withQueueUrl(queueUrl).withLabel(label).withAWSAccountIds(aWSAccountIds).withActions(actions),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(ChangeMessageVisibilityRequest request) {

        return changeMessageVisibilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(ChangeMessageVisibilityRequest request,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ChangeMessageVisibility operation.
     *
     * @see #changeMessageVisibilityAsync(ChangeMessageVisibilityRequest)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(String queueUrl, String receiptHandle,
            Integer visibilityTimeout) {

        return changeMessageVisibilityAsync(new ChangeMessageVisibilityRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle)
                .withVisibilityTimeout(visibilityTimeout));
    }

    /**
     * Simplified method form for invoking the ChangeMessageVisibility operation with an AsyncHandler.
     *
     * @see #changeMessageVisibilityAsync(ChangeMessageVisibilityRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityResult> changeMessageVisibilityAsync(String queueUrl, String receiptHandle,
            Integer visibilityTimeout, com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityRequest, ChangeMessageVisibilityResult> asyncHandler) {

        return changeMessageVisibilityAsync(
                new ChangeMessageVisibilityRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle).withVisibilityTimeout(visibilityTimeout),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest request) {

        return changeMessageVisibilityBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ChangeMessageVisibilityBatch operation.
     *
     * @see #changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries) {

        return changeMessageVisibilityBatchAsync(new ChangeMessageVisibilityBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * Simplified method form for invoking the ChangeMessageVisibilityBatch operation with an AsyncHandler.
     *
     * @see #changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler) {

        return changeMessageVisibilityBatchAsync(new ChangeMessageVisibilityBatchRequest().withQueueUrl(queueUrl).withEntries(entries), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request) {

        return createQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateQueue operation.
     *
     * @see #createQueueAsync(CreateQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(String queueName) {

        return createQueueAsync(new CreateQueueRequest().withQueueName(queueName));
    }

    /**
     * Simplified method form for invoking the CreateQueue operation with an AsyncHandler.
     *
     * @see #createQueueAsync(CreateQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(String queueName,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {

        return createQueueAsync(new CreateQueueRequest().withQueueName(queueName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest request) {

        return deleteMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteMessage operation.
     *
     * @see #deleteMessageAsync(DeleteMessageRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(String queueUrl, String receiptHandle) {

        return deleteMessageAsync(new DeleteMessageRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle));
    }

    /**
     * Simplified method form for invoking the DeleteMessage operation with an AsyncHandler.
     *
     * @see #deleteMessageAsync(DeleteMessageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(String queueUrl, String receiptHandle,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler) {

        return deleteMessageAsync(new DeleteMessageRequest().withQueueUrl(queueUrl).withReceiptHandle(receiptHandle), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(DeleteMessageBatchRequest request) {

        return deleteMessageBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(DeleteMessageBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteMessageBatch operation.
     *
     * @see #deleteMessageBatchAsync(DeleteMessageBatchRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(String queueUrl, java.util.List<DeleteMessageBatchRequestEntry> entries) {

        return deleteMessageBatchAsync(new DeleteMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * Simplified method form for invoking the DeleteMessageBatch operation with an AsyncHandler.
     *
     * @see #deleteMessageBatchAsync(DeleteMessageBatchRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler) {

        return deleteMessageBatchAsync(new DeleteMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest request) {

        return deleteQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteQueue operation.
     *
     * @see #deleteQueueAsync(DeleteQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(String queueUrl) {

        return deleteQueueAsync(new DeleteQueueRequest().withQueueUrl(queueUrl));
    }

    /**
     * Simplified method form for invoking the DeleteQueue operation with an AsyncHandler.
     *
     * @see #deleteQueueAsync(DeleteQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(String queueUrl,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {

        return deleteQueueAsync(new DeleteQueueRequest().withQueueUrl(queueUrl), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(GetQueueAttributesRequest request) {

        return getQueueAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(GetQueueAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetQueueAttributes operation.
     *
     * @see #getQueueAttributesAsync(GetQueueAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(String queueUrl, java.util.List<String> attributeNames) {

        return getQueueAttributesAsync(new GetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributeNames(attributeNames));
    }

    /**
     * Simplified method form for invoking the GetQueueAttributes operation with an AsyncHandler.
     *
     * @see #getQueueAttributesAsync(GetQueueAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(String queueUrl, java.util.List<String> attributeNames,
            com.amazonaws.handlers.AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler) {

        return getQueueAttributesAsync(new GetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributeNames(attributeNames), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest request) {

        return getQueueUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(GetQueueUrlRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetQueueUrl operation.
     *
     * @see #getQueueUrlAsync(GetQueueUrlRequest)
     */
    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(String queueName) {

        return getQueueUrlAsync(new GetQueueUrlRequest().withQueueName(queueName));
    }

    /**
     * Simplified method form for invoking the GetQueueUrl operation with an AsyncHandler.
     *
     * @see #getQueueUrlAsync(GetQueueUrlRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(String queueName,
            com.amazonaws.handlers.AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler) {

        return getQueueUrlAsync(new GetQueueUrlRequest().withQueueName(queueName), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(ListDeadLetterSourceQueuesRequest request) {

        return listDeadLetterSourceQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(ListDeadLetterSourceQueuesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDeadLetterSourceQueuesRequest, ListDeadLetterSourceQueuesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(ListQueueTagsRequest request) {

        return listQueueTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(ListQueueTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQueueTagsRequest, ListQueueTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListQueueTags operation.
     *
     * @see #listQueueTagsAsync(ListQueueTagsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(String queueUrl) {

        return listQueueTagsAsync(new ListQueueTagsRequest().withQueueUrl(queueUrl));
    }

    /**
     * Simplified method form for invoking the ListQueueTags operation with an AsyncHandler.
     *
     * @see #listQueueTagsAsync(ListQueueTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListQueueTagsResult> listQueueTagsAsync(String queueUrl,
            com.amazonaws.handlers.AsyncHandler<ListQueueTagsRequest, ListQueueTagsResult> asyncHandler) {

        return listQueueTagsAsync(new ListQueueTagsRequest().withQueueUrl(queueUrl), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueuesAsync(ListQueuesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync() {

        return listQueuesAsync(new ListQueuesRequest());
    }

    /**
     * Simplified method form for invoking the ListQueues operation with an AsyncHandler.
     *
     * @see #listQueuesAsync(ListQueuesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {

        return listQueuesAsync(new ListQueuesRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueuesAsync(ListQueuesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(String queueNamePrefix) {

        return listQueuesAsync(new ListQueuesRequest().withQueueNamePrefix(queueNamePrefix));
    }

    /**
     * Simplified method form for invoking the ListQueues operation with an AsyncHandler.
     *
     * @see #listQueuesAsync(ListQueuesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(String queueNamePrefix,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {

        return listQueuesAsync(new ListQueuesRequest().withQueueNamePrefix(queueNamePrefix), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PurgeQueueResult> purgeQueueAsync(PurgeQueueRequest request) {

        return purgeQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurgeQueueResult> purgeQueueAsync(PurgeQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<PurgeQueueRequest, PurgeQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest request) {

        return receiveMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(ReceiveMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ReceiveMessage operation.
     *
     * @see #receiveMessageAsync(ReceiveMessageRequest)
     */
    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(String queueUrl) {

        return receiveMessageAsync(new ReceiveMessageRequest().withQueueUrl(queueUrl));
    }

    /**
     * Simplified method form for invoking the ReceiveMessage operation with an AsyncHandler.
     *
     * @see #receiveMessageAsync(ReceiveMessageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(String queueUrl,
            com.amazonaws.handlers.AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler) {

        return receiveMessageAsync(new ReceiveMessageRequest().withQueueUrl(queueUrl), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String queueUrl, String label) {

        return removePermissionAsync(new RemovePermissionRequest().withQueueUrl(queueUrl).withLabel(label));
    }

    /**
     * Simplified method form for invoking the RemovePermission operation with an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(String queueUrl, String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        return removePermissionAsync(new RemovePermissionRequest().withQueueUrl(queueUrl).withLabel(label), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest request) {

        return sendMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SendMessage operation.
     *
     * @see #sendMessageAsync(SendMessageRequest)
     */
    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(String queueUrl, String messageBody) {

        return sendMessageAsync(new SendMessageRequest().withQueueUrl(queueUrl).withMessageBody(messageBody));
    }

    /**
     * Simplified method form for invoking the SendMessage operation with an AsyncHandler.
     *
     * @see #sendMessageAsync(SendMessageRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(String queueUrl, String messageBody,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler) {

        return sendMessageAsync(new SendMessageRequest().withQueueUrl(queueUrl).withMessageBody(messageBody), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(SendMessageBatchRequest request) {

        return sendMessageBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(SendMessageBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SendMessageBatch operation.
     *
     * @see #sendMessageBatchAsync(SendMessageBatchRequest)
     */
    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries) {

        return sendMessageBatchAsync(new SendMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries));
    }

    /**
     * Simplified method form for invoking the SendMessageBatch operation with an AsyncHandler.
     *
     * @see #sendMessageBatchAsync(SendMessageBatchRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(String queueUrl, java.util.List<SendMessageBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler) {

        return sendMessageBatchAsync(new SendMessageBatchRequest().withQueueUrl(queueUrl).withEntries(entries), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(SetQueueAttributesRequest request) {

        return setQueueAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(SetQueueAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<SetQueueAttributesRequest, SetQueueAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SetQueueAttributes operation.
     *
     * @see #setQueueAttributesAsync(SetQueueAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(String queueUrl, java.util.Map<String, String> attributes) {

        return setQueueAttributesAsync(new SetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributes(attributes));
    }

    /**
     * Simplified method form for invoking the SetQueueAttributes operation with an AsyncHandler.
     *
     * @see #setQueueAttributesAsync(SetQueueAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<SetQueueAttributesResult> setQueueAttributesAsync(String queueUrl, java.util.Map<String, String> attributes,
            com.amazonaws.handlers.AsyncHandler<SetQueueAttributesRequest, SetQueueAttributesResult> asyncHandler) {

        return setQueueAttributesAsync(new SetQueueAttributesRequest().withQueueUrl(queueUrl).withAttributes(attributes), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(TagQueueRequest request) {

        return tagQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(TagQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<TagQueueRequest, TagQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the TagQueue operation.
     *
     * @see #tagQueueAsync(TagQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(String queueUrl, java.util.Map<String, String> tags) {

        return tagQueueAsync(new TagQueueRequest().withQueueUrl(queueUrl).withTags(tags));
    }

    /**
     * Simplified method form for invoking the TagQueue operation with an AsyncHandler.
     *
     * @see #tagQueueAsync(TagQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<TagQueueResult> tagQueueAsync(String queueUrl, java.util.Map<String, String> tags,
            com.amazonaws.handlers.AsyncHandler<TagQueueRequest, TagQueueResult> asyncHandler) {

        return tagQueueAsync(new TagQueueRequest().withQueueUrl(queueUrl).withTags(tags), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(UntagQueueRequest request) {

        return untagQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(UntagQueueRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagQueueRequest, UntagQueueResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the UntagQueue operation.
     *
     * @see #untagQueueAsync(UntagQueueRequest)
     */
    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(String queueUrl, java.util.List<String> tagKeys) {

        return untagQueueAsync(new UntagQueueRequest().withQueueUrl(queueUrl).withTagKeys(tagKeys));
    }

    /**
     * Simplified method form for invoking the UntagQueue operation with an AsyncHandler.
     *
     * @see #untagQueueAsync(UntagQueueRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<UntagQueueResult> untagQueueAsync(String queueUrl, java.util.List<String> tagKeys,
            com.amazonaws.handlers.AsyncHandler<UntagQueueRequest, UntagQueueResult> asyncHandler) {

        return untagQueueAsync(new UntagQueueRequest().withQueueUrl(queueUrl).withTagKeys(tagKeys), asyncHandler);
    }

}

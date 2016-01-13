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
package com.amazonaws.services.simplesystemsmanagement;

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Abstract implementation of {@code AWSSimpleSystemsManagementAsync}.
 * Convenient method forms pass through to the corresponding overload that takes
 * a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSSimpleSystemsManagementAsync extends
        AbstractAWSSimpleSystemsManagement implements
        AWSSimpleSystemsManagementAsync {

    protected AbstractAWSSimpleSystemsManagementAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(
            CancelCommandRequest request) {

        return cancelCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelCommandResult> cancelCommandAsync(
            CancelCommandRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelCommandRequest, CancelCommandResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest request) {

        return createAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest request) {

        return createAssociationBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(
            CreateDocumentRequest request) {

        return createDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(
            CreateDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest request) {

        return deleteAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(
            DeleteDocumentRequest request) {

        return deleteDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(
            DeleteDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest request) {

        return describeAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest request) {

        return describeDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest request) {

        return describeInstanceInformationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstanceInformationResult> describeInstanceInformationAsync(
            DescribeInstanceInformationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceInformationRequest, DescribeInstanceInformationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(
            GetDocumentRequest request) {

        return getDocumentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(
            GetDocumentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest request) {

        return listAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            ListCommandInvocationsRequest request) {

        return listCommandInvocationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandInvocationsResult> listCommandInvocationsAsync(
            ListCommandInvocationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCommandInvocationsRequest, ListCommandInvocationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(
            ListCommandsRequest request) {

        return listCommandsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCommandsResult> listCommandsAsync(
            ListCommandsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCommandsRequest, ListCommandsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            ListDocumentsRequest request) {

        return listDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            ListDocumentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync() {

        return listDocumentsAsync(new ListDocumentsRequest());
    }

    /**
     * Simplified method form for invoking the ListDocuments operation with an
     * AsyncHandler.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler) {

        return listDocumentsAsync(new ListDocumentsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(
            SendCommandRequest request) {

        return sendCommandAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCommandResult> sendCommandAsync(
            SendCommandRequest request,
            com.amazonaws.handlers.AsyncHandler<SendCommandRequest, SendCommandResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest request) {

        return updateAssociationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}

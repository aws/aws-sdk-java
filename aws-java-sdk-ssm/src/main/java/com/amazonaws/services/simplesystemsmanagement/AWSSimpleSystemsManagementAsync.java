/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing Amazon SSM asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EC2 Simple Systems Manager (SSM) enables you to configure and manage
 * your EC2 instances. You can create a configuration document and then
 * associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks for your
 * Windows instances:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Join an AWS Directory
 * </p>
 * </li>
 * <li>
 * <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li>
 * <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * </ul>
 * <p>
 * Note that configuration documents are not supported on Linux instances.
 * </p>
 */
public interface AWSSimpleSystemsManagementAsync extends
        AWSSimpleSystemsManagement {

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationRequest
     * @return A Java Future containing the result of the CreateAssociation
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest createAssociationRequest);

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssociation
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateAssociationResult> createAssociationAsync(
            CreateAssociationRequest createAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler);

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return A Java Future containing the result of the CreateAssociationBatch
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration document
     * and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that already
     * has an associated configuration document, we replace the current
     * configuration document with the new configuration document.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAssociationBatch
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            CreateAssociationBatchRequest createAssociationBatchRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * <a>CreateAssociation</a> to associate it with one or more running
     * instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @return A Java Future containing the result of the CreateDocument
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(
            CreateDocumentRequest createDocumentRequest);

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * <a>CreateAssociation</a> to associate it with one or more running
     * instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDocument
     *         operation returned by the service.
     */
    java.util.concurrent.Future<CreateDocumentResult> createDocumentAsync(
            CreateDocumentRequest createDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it does
     * not change the configuration of the instance. To change the configuration
     * state of an instance after you disassociate a configuration document, you
     * must create a new configuration document with the desired configuration
     * and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return A Java Future containing the result of the DeleteAssociation
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it does
     * not change the configuration of the instance. To change the configuration
     * state of an instance after you disassociate a configuration document, you
     * must create a new configuration document with the desired configuration
     * and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAssociation
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteAssociationResult> deleteAssociationAsync(
            DeleteAssociationRequest deleteAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use <a>DeleteAssociation</a> to disassociate all instances that
     * are associated with the configuration document before you can delete it.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return A Java Future containing the result of the DeleteDocument
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(
            DeleteDocumentRequest deleteDocumentRequest);

    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use <a>DeleteAssociation</a> to disassociate all instances that
     * are associated with the configuration document before you can delete it.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDocument
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DeleteDocumentResult> deleteDocumentAsync(
            DeleteDocumentRequest deleteDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler);

    /**
     * <p>
     * Describes the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return A Java Future containing the result of the DescribeAssociation
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest describeAssociationRequest);

    /**
     * <p>
     * Describes the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param describeAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAssociation
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeAssociationResult> describeAssociationAsync(
            DescribeAssociationRequest describeAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler);

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return A Java Future containing the result of the DescribeDocument
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDocument
     *         operation returned by the service.
     */
    java.util.concurrent.Future<DescribeDocumentResult> describeDocumentAsync(
            DescribeDocumentRequest describeDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler);

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return A Java Future containing the result of the GetDocument operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(
            GetDocumentRequest getDocumentRequest);

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     * 
     * @param getDocumentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDocument operation
     *         returned by the service.
     */
    java.util.concurrent.Future<GetDocumentResult> getDocumentAsync(
            GetDocumentRequest getDocumentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler);

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return A Java Future containing the result of the ListAssociations
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociations
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListAssociationsResult> listAssociationsAsync(
            ListAssociationsRequest listAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return A Java Future containing the result of the ListDocuments
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            ListDocumentsRequest listDocumentsRequest);

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDocuments
     *         operation returned by the service.
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            ListDocumentsRequest listDocumentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDocuments operation.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest)
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync();

    /**
     * Simplified method form for invoking the ListDocuments operation with an
     * AsyncHandler.
     *
     * @see #listDocumentsAsync(ListDocumentsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDocumentsResult> listDocumentsAsync(
            com.amazonaws.handlers.AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return A Java Future containing the result of the
     *         UpdateAssociationStatus operation returned by the service.
     */
    java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest updateAssociationStatusRequest);

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateAssociationStatus operation returned by the service.
     */
    java.util.concurrent.Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            UpdateAssociationStatusRequest updateAssociationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler);

}

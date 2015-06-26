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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Interface for accessing AWSSimpleSystemsManagement asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * Amazon EC2 Simple Systems Manager (SSM) enables you to configure and
 * manage your EC2 instances. You can create a configuration document and
 * then associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks
 * for your Windows instances:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Join an AWS Directory
 * </p>
 * </li>
 * <li> <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li> <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li> <p>
 * Configure CloudWatch Logs to monitor applications and systems
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Note that configuration documents are not supported on Linux
 * instances.
 * </p>
 */
public interface AWSSimpleSystemsManagementAsync extends AWSSimpleSystemsManagement {
    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use DeleteAssociation to disassociate all instances that are
     * associated with the configuration document before you can delete it.
     * </p>
     *
     * @param deleteDocumentRequest Container for the necessary parameters to
     *           execute the DeleteDocument operation on AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDocument service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified configuration document.
     * </p>
     * <p>
     * You must use DeleteAssociation to disassociate all instances that are
     * associated with the configuration document before you can delete it.
     * </p>
     *
     * @param deleteDocumentRequest Container for the necessary parameters to
     *           execute the DeleteDocument operation on AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDocument service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDocumentResult> deleteDocumentAsync(DeleteDocumentRequest deleteDocumentRequest,
            AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the associations for the specified configuration document
     * or instance.
     * </p>
     *
     * @param describeAssociationRequest Container for the necessary
     *           parameters to execute the DescribeAssociation operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAssociation service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest describeAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the associations for the specified configuration document
     * or instance.
     * </p>
     *
     * @param describeAssociationRequest Container for the necessary
     *           parameters to execute the DescribeAssociation operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAssociation service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAssociationResult> describeAssociationAsync(DescribeAssociationRequest describeAssociationRequest,
            AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationRequest Container for the necessary parameters
     *           to execute the CreateAssociation operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAssociation service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest createAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified configuration document with the specified
     * instance.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationRequest Container for the necessary parameters
     *           to execute the CreateAssociation operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAssociation service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAssociationResult> createAssociationAsync(CreateAssociationRequest createAssociationRequest,
            AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationBatchRequest Container for the necessary
     *           parameters to execute the CreateAssociationBatch operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAssociationBatch service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest createAssociationBatchRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates the specified configuration documents with the specified
     * instances.
     * </p>
     * <p>
     * When you associate a configuration document with an instance, the
     * configuration agent on the instance processes the configuration
     * document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a configuration document with an instance that
     * already has an associated configuration document, we replace the
     * current configuration document with the new configuration document.
     * </p>
     *
     * @param createAssociationBatchRequest Container for the necessary
     *           parameters to execute the CreateAssociationBatch operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAssociationBatch service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAssociationBatchResult> createAssociationBatchAsync(CreateAssociationBatchRequest createAssociationBatchRequest,
            AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     *
     * @param describeDocumentRequest Container for the necessary parameters
     *           to execute the DescribeDocument operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDocument service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest describeDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified configuration document.
     * </p>
     *
     * @param describeDocumentRequest Container for the necessary parameters
     *           to execute the DescribeDocument operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDocument service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDocumentResult> describeDocumentAsync(DescribeDocumentRequest describeDocumentRequest,
            AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     *
     * @param updateAssociationStatusRequest Container for the necessary
     *           parameters to execute the UpdateAssociationStatus operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAssociationStatus service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest updateAssociationStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the status of the configuration document associated with the
     * specified instance.
     * </p>
     *
     * @param updateAssociationStatusRequest Container for the necessary
     *           parameters to execute the UpdateAssociationStatus operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAssociationStatus service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(UpdateAssociationStatusRequest updateAssociationStatusRequest,
            AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     *
     * @param listAssociationsRequest Container for the necessary parameters
     *           to execute the ListAssociations operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListAssociations service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Lists the associations for the specified configuration document or
     * instance.
     * </p>
     *
     * @param listAssociationsRequest Container for the necessary parameters
     *           to execute the ListAssociations operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAssociations service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAssociationsResult> listAssociationsAsync(ListAssociationsRequest listAssociationsRequest,
            AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     *
     * @param listDocumentsRequest Container for the necessary parameters to
     *           execute the ListDocuments operation on AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         ListDocuments service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your configuration documents.
     * </p>
     *
     * @param listDocumentsRequest Container for the necessary parameters to
     *           execute the ListDocuments operation on AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDocuments service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDocumentsResult> listDocumentsAsync(ListDocumentsRequest listDocumentsRequest,
            AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it
     * does not change the configuration of the instance. To change the
     * configuration state of an instance after you disassociate a
     * configuration document, you must create a new configuration document
     * with the desired configuration and associate it with the instance.
     * </p>
     *
     * @param deleteAssociationRequest Container for the necessary parameters
     *           to execute the DeleteAssociation operation on
     *           AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAssociation service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates the specified configuration document from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a configuration document from an instance, it
     * does not change the configuration of the instance. To change the
     * configuration state of an instance after you disassociate a
     * configuration document, you must create a new configuration document
     * with the desired configuration and associate it with the instance.
     * </p>
     *
     * @param deleteAssociationRequest Container for the necessary parameters
     *           to execute the DeleteAssociation operation on
     *           AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAssociation service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteAssociationResult> deleteAssociationAsync(DeleteAssociationRequest deleteAssociationRequest,
            AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * CreateAssociation to associate it with one or more running instances.
     * </p>
     *
     * @param createDocumentRequest Container for the necessary parameters to
     *           execute the CreateDocument operation on AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDocument service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a configuration document.
     * </p>
     * <p>
     * After you create a configuration document, you can use
     * CreateAssociation to associate it with one or more running instances.
     * </p>
     *
     * @param createDocumentRequest Container for the necessary parameters to
     *           execute the CreateDocument operation on AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDocument service method, as returned by
     *         AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDocumentResult> createDocumentAsync(CreateDocumentRequest createDocumentRequest,
            AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     *
     * @param getDocumentRequest Container for the necessary parameters to
     *           execute the GetDocument operation on AWSSimpleSystemsManagement.
     * 
     * @return A Java Future object containing the response from the
     *         GetDocument service method, as returned by AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the contents of the specified configuration document.
     * </p>
     *
     * @param getDocumentRequest Container for the necessary parameters to
     *           execute the GetDocument operation on AWSSimpleSystemsManagement.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDocument service method, as returned by AWSSimpleSystemsManagement.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSimpleSystemsManagement indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDocumentResult> getDocumentAsync(GetDocumentRequest getDocumentRequest,
            AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        
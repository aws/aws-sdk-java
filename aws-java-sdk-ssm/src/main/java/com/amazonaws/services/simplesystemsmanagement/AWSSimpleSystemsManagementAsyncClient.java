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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

import com.amazonaws.services.simplesystemsmanagement.model.*;

/**
 * Asynchronous client for accessing AWSSimpleSystemsManagement.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * AWS Simple Systems Management enables you to configure and manage your
 * EC2 instances. You can create a configuration document and then
 * associate it with one or more running instances.
 * </p>
 * <p>
 * You can use a configuration document to automate the following tasks
 * for your Windows instances:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Install, repair, or uninstall software using an MSI package
 * </p>
 * </li>
 * <li> <p>
 * Run PowerShell scripts
 * </p>
 * </li>
 * <li> <p>
 * Join an AWS Directory
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
public class AWSSimpleSystemsManagementAsyncClient extends AWSSimpleSystemsManagementClient
        implements AWSSimpleSystemsManagementAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSimpleSystemsManagementAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AWSSimpleSystemsManagement
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSimpleSystemsManagementAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentials
     *            The AWS credentials (access key ID and secret key) to use
     *            when authenticating with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials provider.
     * Default client settings will be used, and a fixed size thread pool will be
     * created for executing the asynchronous tasks.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials provider
     * and executor service.  Default client settings will be used.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSimpleSystemsManagement using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * <p>
     * All calls made using this new client object are non-blocking, and will immediately
     * return a Java Future object that the caller can later check to see if the service
     * call has actually completed.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration
     *            Client configuration options (ex: max retry limit, proxy
     *            settings, etc).
     * @param executorService
     *            The executor service by which all asynchronous requests will
     *            be executed.
     */
    public AWSSimpleSystemsManagementAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this async client to execute
     * requests.
     *
     * @return The executor service used by this async client to execute
     *         requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call getExecutorService().shutdown() followed by
     * getExecutorService().awaitTermination() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
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
    public Future<DeleteDocumentResult> deleteDocumentAsync(final DeleteDocumentRequest deleteDocumentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDocumentResult>() {
            public DeleteDocumentResult call() throws Exception {
                return deleteDocument(deleteDocumentRequest);
        }
    });
    }

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
    public Future<DeleteDocumentResult> deleteDocumentAsync(
            final DeleteDocumentRequest deleteDocumentRequest,
            final AsyncHandler<DeleteDocumentRequest, DeleteDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDocumentResult>() {
            public DeleteDocumentResult call() throws Exception {
              DeleteDocumentResult result;
                try {
                result = deleteDocument(deleteDocumentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDocumentRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<DescribeAssociationResult> describeAssociationAsync(final DescribeAssociationRequest describeAssociationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationResult>() {
            public DescribeAssociationResult call() throws Exception {
                return describeAssociation(describeAssociationRequest);
        }
    });
    }

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
    public Future<DescribeAssociationResult> describeAssociationAsync(
            final DescribeAssociationRequest describeAssociationRequest,
            final AsyncHandler<DescribeAssociationRequest, DescribeAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeAssociationResult>() {
            public DescribeAssociationResult call() throws Exception {
              DescribeAssociationResult result;
                try {
                result = describeAssociation(describeAssociationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeAssociationRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<CreateAssociationResult> createAssociationAsync(final CreateAssociationRequest createAssociationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationResult>() {
            public CreateAssociationResult call() throws Exception {
                return createAssociation(createAssociationRequest);
        }
    });
    }

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
    public Future<CreateAssociationResult> createAssociationAsync(
            final CreateAssociationRequest createAssociationRequest,
            final AsyncHandler<CreateAssociationRequest, CreateAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationResult>() {
            public CreateAssociationResult call() throws Exception {
              CreateAssociationResult result;
                try {
                result = createAssociation(createAssociationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAssociationRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<CreateAssociationBatchResult> createAssociationBatchAsync(final CreateAssociationBatchRequest createAssociationBatchRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationBatchResult>() {
            public CreateAssociationBatchResult call() throws Exception {
                return createAssociationBatch(createAssociationBatchRequest);
        }
    });
    }

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
    public Future<CreateAssociationBatchResult> createAssociationBatchAsync(
            final CreateAssociationBatchRequest createAssociationBatchRequest,
            final AsyncHandler<CreateAssociationBatchRequest, CreateAssociationBatchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAssociationBatchResult>() {
            public CreateAssociationBatchResult call() throws Exception {
              CreateAssociationBatchResult result;
                try {
                result = createAssociationBatch(createAssociationBatchRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAssociationBatchRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<DescribeDocumentResult> describeDocumentAsync(final DescribeDocumentRequest describeDocumentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentResult>() {
            public DescribeDocumentResult call() throws Exception {
                return describeDocument(describeDocumentRequest);
        }
    });
    }

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
    public Future<DescribeDocumentResult> describeDocumentAsync(
            final DescribeDocumentRequest describeDocumentRequest,
            final AsyncHandler<DescribeDocumentRequest, DescribeDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDocumentResult>() {
            public DescribeDocumentResult call() throws Exception {
              DescribeDocumentResult result;
                try {
                result = describeDocument(describeDocumentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDocumentRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(final UpdateAssociationStatusRequest updateAssociationStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAssociationStatusResult>() {
            public UpdateAssociationStatusResult call() throws Exception {
                return updateAssociationStatus(updateAssociationStatusRequest);
        }
    });
    }

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
    public Future<UpdateAssociationStatusResult> updateAssociationStatusAsync(
            final UpdateAssociationStatusRequest updateAssociationStatusRequest,
            final AsyncHandler<UpdateAssociationStatusRequest, UpdateAssociationStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateAssociationStatusResult>() {
            public UpdateAssociationStatusResult call() throws Exception {
              UpdateAssociationStatusResult result;
                try {
                result = updateAssociationStatus(updateAssociationStatusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateAssociationStatusRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<ListAssociationsResult> listAssociationsAsync(final ListAssociationsRequest listAssociationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAssociationsResult>() {
            public ListAssociationsResult call() throws Exception {
                return listAssociations(listAssociationsRequest);
        }
    });
    }

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
    public Future<ListAssociationsResult> listAssociationsAsync(
            final ListAssociationsRequest listAssociationsRequest,
            final AsyncHandler<ListAssociationsRequest, ListAssociationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAssociationsResult>() {
            public ListAssociationsResult call() throws Exception {
              ListAssociationsResult result;
                try {
                result = listAssociations(listAssociationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listAssociationsRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<ListDocumentsResult> listDocumentsAsync(final ListDocumentsRequest listDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentsResult>() {
            public ListDocumentsResult call() throws Exception {
                return listDocuments(listDocumentsRequest);
        }
    });
    }

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
    public Future<ListDocumentsResult> listDocumentsAsync(
            final ListDocumentsRequest listDocumentsRequest,
            final AsyncHandler<ListDocumentsRequest, ListDocumentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDocumentsResult>() {
            public ListDocumentsResult call() throws Exception {
              ListDocumentsResult result;
                try {
                result = listDocuments(listDocumentsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDocumentsRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<DeleteAssociationResult> deleteAssociationAsync(final DeleteAssociationRequest deleteAssociationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteAssociationResult>() {
            public DeleteAssociationResult call() throws Exception {
                return deleteAssociation(deleteAssociationRequest);
        }
    });
    }

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
    public Future<DeleteAssociationResult> deleteAssociationAsync(
            final DeleteAssociationRequest deleteAssociationRequest,
            final AsyncHandler<DeleteAssociationRequest, DeleteAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteAssociationResult>() {
            public DeleteAssociationResult call() throws Exception {
              DeleteAssociationResult result;
                try {
                result = deleteAssociation(deleteAssociationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteAssociationRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<CreateDocumentResult> createDocumentAsync(final CreateDocumentRequest createDocumentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDocumentResult>() {
            public CreateDocumentResult call() throws Exception {
                return createDocument(createDocumentRequest);
        }
    });
    }

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
    public Future<CreateDocumentResult> createDocumentAsync(
            final CreateDocumentRequest createDocumentRequest,
            final AsyncHandler<CreateDocumentRequest, CreateDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDocumentResult>() {
            public CreateDocumentResult call() throws Exception {
              CreateDocumentResult result;
                try {
                result = createDocument(createDocumentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDocumentRequest, result);
                 return result;
        }
    });
    }
    
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
    public Future<GetDocumentResult> getDocumentAsync(final GetDocumentRequest getDocumentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentResult>() {
            public GetDocumentResult call() throws Exception {
                return getDocument(getDocumentRequest);
        }
    });
    }

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
    public Future<GetDocumentResult> getDocumentAsync(
            final GetDocumentRequest getDocumentRequest,
            final AsyncHandler<GetDocumentRequest, GetDocumentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDocumentResult>() {
            public GetDocumentResult call() throws Exception {
              GetDocumentResult result;
                try {
                result = getDocument(getDocumentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDocumentRequest, result);
                 return result;
        }
    });
    }
    
}
        
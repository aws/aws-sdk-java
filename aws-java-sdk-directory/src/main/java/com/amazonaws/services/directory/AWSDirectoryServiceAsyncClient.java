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
package com.amazonaws.services.directory;

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

import com.amazonaws.services.directory.model.*;

/**
 * Asynchronous client for accessing AWSDirectoryService.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Directory Service <p>
 * This is the <i>AWS Directory Service API Reference</i> . This guide
 * provides detailed information about AWS Directory Service operations,
 * data types, parameters, and errors.
 * </p>
 */
public class AWSDirectoryServiceAsyncClient extends AWSDirectoryServiceClient
        implements AWSDirectoryServiceAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService.  A credentials provider chain will be used
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
    public AWSDirectoryServiceAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService.  A credentials provider chain will be used
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
     *                       client connects to AWSDirectoryService
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials.
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
    public AWSDirectoryServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials
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
    public AWSDirectoryServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials,
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
    public AWSDirectoryServiceAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials provider.
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
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials provider
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
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials
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
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSDirectoryService using the specified AWS account credentials
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
    public AWSDirectoryServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeSnapshots.NextToken</i> member contains a
     * token that you pass in the next call to DescribeSnapshots to retrieve
     * the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(final DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSnapshotsResult>() {
            public DescribeSnapshotsResult call() throws Exception {
                return describeSnapshots(describeSnapshotsRequest);
        }
    });
    }

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeSnapshots.NextToken</i> member contains a
     * token that you pass in the next call to DescribeSnapshots to retrieve
     * the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            final DescribeSnapshotsRequest describeSnapshotsRequest,
            final AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSnapshotsResult>() {
            public DescribeSnapshotsResult call() throws Exception {
              DescribeSnapshotsResult result;
                try {
                result = describeSnapshots(describeSnapshotsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeSnapshotsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the
     * directory. The alias is used to construct the access URL for the
     * directory, such as <code>http://<alias>.awsapps.com</code> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After an alias has been created, it cannot be
     * deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAliasResult>() {
            public CreateAliasResult call() throws Exception {
                return createAlias(createAliasRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the
     * directory. The alias is used to construct the access URL for the
     * directory, such as <code>http://<alias>.awsapps.com</code> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> After an alias has been created, it cannot be
     * deleted or reused, so this operation should only be used when
     * absolutely necessary.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAliasResult> createAliasAsync(
            final CreateAliasRequest createAliasRequest,
            final AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateAliasResult>() {
            public CreateAliasResult call() throws Exception {
              CreateAliasResult result;
                try {
                result = createAlias(createAliasRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createAliasRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotResult> deleteSnapshotAsync(final DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSnapshotResult>() {
            public DeleteSnapshotResult call() throws Exception {
                return deleteSnapshot(deleteSnapshotRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotResult> deleteSnapshotAsync(
            final DeleteSnapshotRequest deleteSnapshotRequest,
            final AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteSnapshotResult>() {
            public DeleteSnapshotResult call() throws Exception {
              DeleteSnapshotResult result;
                try {
                result = deleteSnapshot(deleteSnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteSnapshotRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS)
     * server information for an AD Connector directory.
     * </p>
     *
     * @param updateRadiusRequest Container for the necessary parameters to
     *           execute the UpdateRadius operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRadiusResult> updateRadiusAsync(final UpdateRadiusRequest updateRadiusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateRadiusResult>() {
            public UpdateRadiusResult call() throws Exception {
                return updateRadius(updateRadiusRequest);
        }
    });
    }

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS)
     * server information for an AD Connector directory.
     * </p>
     *
     * @param updateRadiusRequest Container for the necessary parameters to
     *           execute the UpdateRadius operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateRadiusResult> updateRadiusAsync(
            final UpdateRadiusRequest updateRadiusRequest,
            final AsyncHandler<UpdateRadiusRequest, UpdateRadiusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateRadiusResult>() {
            public UpdateRadiusResult call() throws Exception {
              UpdateRadiusResult result;
                try {
                result = updateRadius(updateRadiusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateRadiusRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Obtains information about the directories that belong to this
     * account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing
     * the directory identifiers in the <i>DirectoryIds</i> parameter.
     * Otherwise, all directories that belong to the current account are
     * returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeDirectoriesResult.NextToken</i> member
     * contains a token that you pass in the next call to DescribeDirectories
     * to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeDirectories operation on
     *           AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDirectories service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDirectoriesResult> describeDirectoriesAsync(final DescribeDirectoriesRequest describeDirectoriesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDirectoriesResult>() {
            public DescribeDirectoriesResult call() throws Exception {
                return describeDirectories(describeDirectoriesRequest);
        }
    });
    }

    /**
     * <p>
     * Obtains information about the directories that belong to this
     * account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing
     * the directory identifiers in the <i>DirectoryIds</i> parameter.
     * Otherwise, all directories that belong to the current account are
     * returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> request and response parameters. If more results are
     * available, the <i>DescribeDirectoriesResult.NextToken</i> member
     * contains a token that you pass in the next call to DescribeDirectories
     * to retrieve the next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     *
     * @param describeDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeDirectories operation on
     *           AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDirectories service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDirectoriesResult> describeDirectoriesAsync(
            final DescribeDirectoriesRequest describeDirectoriesRequest,
            final AsyncHandler<DescribeDirectoriesRequest, DescribeDirectoriesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDirectoriesResult>() {
            public DescribeDirectoriesResult call() throws Exception {
              DescribeDirectoriesResult result;
                try {
                result = describeDirectories(describeDirectoriesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeDirectoriesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     *
     * @param connectDirectoryRequest Container for the necessary parameters
     *           to execute the ConnectDirectory operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         ConnectDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConnectDirectoryResult> connectDirectoryAsync(final ConnectDirectoryRequest connectDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConnectDirectoryResult>() {
            public ConnectDirectoryResult call() throws Exception {
                return connectDirectory(connectDirectoryRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an AD Connector to connect an on-premises directory.
     * </p>
     *
     * @param connectDirectoryRequest Container for the necessary parameters
     *           to execute the ConnectDirectory operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConnectDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConnectDirectoryResult> connectDirectoryAsync(
            final ConnectDirectoryRequest connectDirectoryRequest,
            final AsyncHandler<ConnectDirectoryRequest, ConnectDirectoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConnectDirectoryResult>() {
            public ConnectDirectoryResult call() throws Exception {
              ConnectDirectoryResult result;
                try {
                result = connectDirectory(connectDirectoryRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(connectDirectoryRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a snapshot of an existing directory.
     * </p>
     * <p>
     * You cannot take snapshots of extended or connected directories.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(final CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSnapshotResult>() {
            public CreateSnapshotResult call() throws Exception {
                return createSnapshot(createSnapshotRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a snapshot of an existing directory.
     * </p>
     * <p>
     * You cannot take snapshots of extended or connected directories.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(
            final CreateSnapshotRequest createSnapshotRequest,
            final AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateSnapshotResult>() {
            public CreateSnapshotResult call() throws Exception {
              CreateSnapshotResult result;
                try {
                result = createSnapshot(createSnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createSnapshotRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     *
     * @param deleteDirectoryRequest Container for the necessary parameters
     *           to execute the DeleteDirectory operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDirectoryResult> deleteDirectoryAsync(final DeleteDirectoryRequest deleteDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDirectoryResult>() {
            public DeleteDirectoryResult call() throws Exception {
                return deleteDirectory(deleteDirectoryRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     *
     * @param deleteDirectoryRequest Container for the necessary parameters
     *           to execute the DeleteDirectory operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDirectoryResult> deleteDirectoryAsync(
            final DeleteDirectoryRequest deleteDirectoryRequest,
            final AsyncHandler<DeleteDirectoryRequest, DeleteDirectoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDirectoryResult>() {
            public DeleteDirectoryResult call() throws Exception {
              DeleteDirectoryResult result;
                try {
                result = deleteDirectory(deleteDirectoryRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteDirectoryRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     *
     * @param getDirectoryLimitsRequest Container for the necessary
     *           parameters to execute the GetDirectoryLimits operation on
     *           AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         GetDirectoryLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(final GetDirectoryLimitsRequest getDirectoryLimitsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDirectoryLimitsResult>() {
            public GetDirectoryLimitsResult call() throws Exception {
                return getDirectoryLimits(getDirectoryLimitsRequest);
        }
    });
    }

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     *
     * @param getDirectoryLimitsRequest Container for the necessary
     *           parameters to execute the GetDirectoryLimits operation on
     *           AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDirectoryLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDirectoryLimitsResult> getDirectoryLimitsAsync(
            final GetDirectoryLimitsRequest getDirectoryLimitsRequest,
            final AsyncHandler<GetDirectoryLimitsRequest, GetDirectoryLimitsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDirectoryLimitsResult>() {
            public GetDirectoryLimitsResult call() throws Exception {
              GetDirectoryLimitsResult result;
                try {
                result = getDirectoryLimits(getDirectoryLimitsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDirectoryLimitsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     *
     * @param disableSsoRequest Container for the necessary parameters to
     *           execute the DisableSso operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DisableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableSsoResult> disableSsoAsync(final DisableSsoRequest disableSsoRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableSsoResult>() {
            public DisableSsoResult call() throws Exception {
                return disableSso(disableSsoRequest);
        }
    });
    }

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     *
     * @param disableSsoRequest Container for the necessary parameters to
     *           execute the DisableSso operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableSsoResult> disableSsoAsync(
            final DisableSsoRequest disableSsoRequest,
            final AsyncHandler<DisableSsoRequest, DisableSsoResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableSsoResult>() {
            public DisableSsoResult call() throws Exception {
              DisableSsoResult result;
                try {
                result = disableSso(disableSsoRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableSsoRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param enableRadiusRequest Container for the necessary parameters to
     *           execute the EnableRadius operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         EnableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableRadiusResult> enableRadiusAsync(final EnableRadiusRequest enableRadiusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableRadiusResult>() {
            public EnableRadiusResult call() throws Exception {
                return enableRadius(enableRadiusRequest);
        }
    });
    }

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param enableRadiusRequest Container for the necessary parameters to
     *           execute the EnableRadius operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableRadiusResult> enableRadiusAsync(
            final EnableRadiusRequest enableRadiusRequest,
            final AsyncHandler<EnableRadiusRequest, EnableRadiusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableRadiusResult>() {
            public EnableRadiusResult call() throws Exception {
              EnableRadiusResult result;
                try {
                result = enableRadius(enableRadiusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableRadiusRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     *
     * @param createComputerRequest Container for the necessary parameters to
     *           execute the CreateComputer operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateComputer service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateComputerResult> createComputerAsync(final CreateComputerRequest createComputerRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateComputerResult>() {
            public CreateComputerResult call() throws Exception {
                return createComputer(createComputerRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     *
     * @param createComputerRequest Container for the necessary parameters to
     *           execute the CreateComputer operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateComputer service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateComputerResult> createComputerAsync(
            final CreateComputerRequest createComputerRequest,
            final AsyncHandler<CreateComputerRequest, CreateComputerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateComputerResult>() {
            public CreateComputerResult call() throws Exception {
              CreateComputerResult result;
                try {
                result = createComputer(createComputerRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createComputerRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     *
     * @param enableSsoRequest Container for the necessary parameters to
     *           execute the EnableSso operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         EnableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableSsoResult> enableSsoAsync(final EnableSsoRequest enableSsoRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableSsoResult>() {
            public EnableSsoResult call() throws Exception {
                return enableSso(enableSsoRequest);
        }
    });
    }

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     *
     * @param enableSsoRequest Container for the necessary parameters to
     *           execute the EnableSso operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableSso service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableSsoResult> enableSsoAsync(
            final EnableSsoRequest enableSsoRequest,
            final AsyncHandler<EnableSsoRequest, EnableSsoResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableSsoResult>() {
            public EnableSsoResult call() throws Exception {
              EnableSsoResult result;
                try {
                result = enableSso(enableSsoRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableSsoRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     *
     * @param createDirectoryRequest Container for the necessary parameters
     *           to execute the CreateDirectory operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDirectoryResult> createDirectoryAsync(final CreateDirectoryRequest createDirectoryRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDirectoryResult>() {
            public CreateDirectoryResult call() throws Exception {
                return createDirectory(createDirectoryRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     *
     * @param createDirectoryRequest Container for the necessary parameters
     *           to execute the CreateDirectory operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDirectory service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDirectoryResult> createDirectoryAsync(
            final CreateDirectoryRequest createDirectoryRequest,
            final AsyncHandler<CreateDirectoryRequest, CreateDirectoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDirectoryResult>() {
            public CreateDirectoryResult call() throws Exception {
              CreateDirectoryResult result;
                try {
                result = createDirectory(createDirectoryRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createDirectoryRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated.
     * You can monitor the progress of the restore operation by calling the
     * DescribeDirectories operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>
     * , the restore operation is complete.
     * </p>
     *
     * @param restoreFromSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromSnapshot operation on
     *           AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromSnapshot service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(final RestoreFromSnapshotRequest restoreFromSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RestoreFromSnapshotResult>() {
            public RestoreFromSnapshotResult call() throws Exception {
                return restoreFromSnapshot(restoreFromSnapshotRequest);
        }
    });
    }

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated.
     * You can monitor the progress of the restore operation by calling the
     * DescribeDirectories operation with the directory identifier. When the
     * <b>DirectoryDescription.Stage</b> value changes to <code>Active</code>
     * , the restore operation is complete.
     * </p>
     *
     * @param restoreFromSnapshotRequest Container for the necessary
     *           parameters to execute the RestoreFromSnapshot operation on
     *           AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RestoreFromSnapshot service method, as returned by
     *         AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RestoreFromSnapshotResult> restoreFromSnapshotAsync(
            final RestoreFromSnapshotRequest restoreFromSnapshotRequest,
            final AsyncHandler<RestoreFromSnapshotRequest, RestoreFromSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RestoreFromSnapshotResult>() {
            public RestoreFromSnapshotResult call() throws Exception {
              RestoreFromSnapshotResult result;
                try {
                result = restoreFromSnapshot(restoreFromSnapshotRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(restoreFromSnapshotRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param disableRadiusRequest Container for the necessary parameters to
     *           execute the DisableRadius operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         DisableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableRadiusResult> disableRadiusAsync(final DisableRadiusRequest disableRadiusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableRadiusResult>() {
            public DisableRadiusResult call() throws Exception {
                return disableRadius(disableRadiusRequest);
        }
    });
    }

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with Remote Authentication
     * Dial In User Service (RADIUS) for an AD Connector directory.
     * </p>
     *
     * @param disableRadiusRequest Container for the necessary parameters to
     *           execute the DisableRadius operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableRadius service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableRadiusResult> disableRadiusAsync(
            final DisableRadiusRequest disableRadiusRequest,
            final AsyncHandler<DisableRadiusRequest, DisableRadiusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableRadiusResult>() {
            public DisableRadiusResult call() throws Exception {
              DisableRadiusResult result;
                try {
                result = disableRadius(disableRadiusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableRadiusRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     *
     * @param getSnapshotLimitsRequest Container for the necessary parameters
     *           to execute the GetSnapshotLimits operation on AWSDirectoryService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSnapshotLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(final GetSnapshotLimitsRequest getSnapshotLimitsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSnapshotLimitsResult>() {
            public GetSnapshotLimitsResult call() throws Exception {
                return getSnapshotLimits(getSnapshotLimitsRequest);
        }
    });
    }

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     *
     * @param getSnapshotLimitsRequest Container for the necessary parameters
     *           to execute the GetSnapshotLimits operation on AWSDirectoryService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSnapshotLimits service method, as returned by AWSDirectoryService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSDirectoryService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSnapshotLimitsResult> getSnapshotLimitsAsync(
            final GetSnapshotLimitsRequest getSnapshotLimitsRequest,
            final AsyncHandler<GetSnapshotLimitsRequest, GetSnapshotLimitsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSnapshotLimitsResult>() {
            public GetSnapshotLimitsResult call() throws Exception {
              GetSnapshotLimitsResult result;
                try {
                result = getSnapshotLimits(getSnapshotLimitsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getSnapshotLimitsRequest, result);
                 return result;
        }
    });
    }
    
}
        
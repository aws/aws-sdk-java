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
package com.amazonaws.services.workspaces;

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

import com.amazonaws.services.workspaces.model.*;

/**
 * Asynchronous client for accessing AmazonWorkspaces.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon WorkSpaces Service <p>
 * This is the <i>Amazon WorkSpaces API Reference</i> . This guide
 * provides detailed information about Amazon WorkSpaces operations, data
 * types, parameters, and errors.
 * </p>
 */
public class AmazonWorkspacesAsyncClient extends AmazonWorkspacesClient
        implements AmazonWorkspacesAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces.  A credentials provider chain will be used
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
    public AmazonWorkspacesAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces.  A credentials provider chain will be used
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
     *                       client connects to AmazonWorkspaces
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonWorkspacesAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials.
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
    public AmazonWorkspacesAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials
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
    public AmazonWorkspacesAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials,
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
    public AmazonWorkspacesAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials provider.
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
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials provider
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
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials
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
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonWorkspaces using the specified AWS account credentials
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
    public AmazonWorkspacesAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and returns before the
     * WorkSpaces are created.
     * </p>
     *
     * @param createWorkspacesRequest Container for the necessary parameters
     *           to execute the CreateWorkspaces operation on AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         CreateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateWorkspacesResult> createWorkspacesAsync(final CreateWorkspacesRequest createWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateWorkspacesResult>() {
            public CreateWorkspacesResult call() throws Exception {
                return createWorkspaces(createWorkspacesRequest);
        }
    });
    }

    /**
     * <p>
     * Creates one or more WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and returns before the
     * WorkSpaces are created.
     * </p>
     *
     * @param createWorkspacesRequest Container for the necessary parameters
     *           to execute the CreateWorkspaces operation on AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateWorkspacesResult> createWorkspacesAsync(
            final CreateWorkspacesRequest createWorkspacesRequest,
            final AsyncHandler<CreateWorkspacesRequest, CreateWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateWorkspacesResult>() {
            public CreateWorkspacesResult call() throws Exception {
              CreateWorkspacesResult result;
                try {
                result = createWorkspaces(createWorkspacesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createWorkspacesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to
     * your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code>
     * parameter, or the <code>Owner</code> parameter, but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceBundlesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceBundles operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceBundles service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(final DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkspaceBundlesResult>() {
            public DescribeWorkspaceBundlesResult call() throws Exception {
                return describeWorkspaceBundles(describeWorkspaceBundlesRequest);
        }
    });
    }

    /**
     * <p>
     * Obtains information about the WorkSpace bundles that are available to
     * your account in the specified region.
     * </p>
     * <p>
     * You can filter the results with either the <code>BundleIds</code>
     * parameter, or the <code>Owner</code> parameter, but not both.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceBundlesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceBundles operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceBundles service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceBundlesResult> describeWorkspaceBundlesAsync(
            final DescribeWorkspaceBundlesRequest describeWorkspaceBundlesRequest,
            final AsyncHandler<DescribeWorkspaceBundlesRequest, DescribeWorkspaceBundlesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkspaceBundlesResult>() {
            public DescribeWorkspaceBundlesResult call() throws Exception {
              DescribeWorkspaceBundlesResult result;
                try {
                result = describeWorkspaceBundles(describeWorkspaceBundlesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeWorkspaceBundlesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * To be able to reboot a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> , <code>IMPAIRED</code> , or
     * <code>INOPERABLE</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have rebooted.
     * </p>
     *
     * @param rebootWorkspacesRequest Container for the necessary parameters
     *           to execute the RebootWorkspaces operation on AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         RebootWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebootWorkspacesResult> rebootWorkspacesAsync(final RebootWorkspacesRequest rebootWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RebootWorkspacesResult>() {
            public RebootWorkspacesResult call() throws Exception {
                return rebootWorkspaces(rebootWorkspacesRequest);
        }
    });
    }

    /**
     * <p>
     * Reboots the specified WorkSpaces.
     * </p>
     * <p>
     * To be able to reboot a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> , <code>IMPAIRED</code> , or
     * <code>INOPERABLE</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have rebooted.
     * </p>
     *
     * @param rebootWorkspacesRequest Container for the necessary parameters
     *           to execute the RebootWorkspaces operation on AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebootWorkspacesResult> rebootWorkspacesAsync(
            final RebootWorkspacesRequest rebootWorkspacesRequest,
            final AsyncHandler<RebootWorkspacesRequest, RebootWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RebootWorkspacesResult>() {
            public RebootWorkspacesResult call() throws Exception {
              RebootWorkspacesResult result;
                try {
                result = rebootWorkspaces(rebootWorkspacesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(rebootWorkspacesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code> ,
     * <code>DirectoryId</code> , or <code>WorkspaceIds</code> , can be
     * specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspacesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaces operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspacesResult> describeWorkspacesAsync(final DescribeWorkspacesRequest describeWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkspacesResult>() {
            public DescribeWorkspacesResult call() throws Exception {
                return describeWorkspaces(describeWorkspacesRequest);
        }
    });
    }

    /**
     * <p>
     * Obtains information about the specified WorkSpaces.
     * </p>
     * <p>
     * Only one of the filter parameters, such as <code>BundleId</code> ,
     * <code>DirectoryId</code> , or <code>WorkspaceIds</code> , can be
     * specified at a time.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspacesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaces operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspacesResult> describeWorkspacesAsync(
            final DescribeWorkspacesRequest describeWorkspacesRequest,
            final AsyncHandler<DescribeWorkspacesRequest, DescribeWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkspacesResult>() {
            public DescribeWorkspacesResult call() throws Exception {
              DescribeWorkspacesResult result;
                try {
                result = describeWorkspaces(describeWorkspacesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeWorkspacesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves information about the AWS Directory Service directories in
     * the region that are registered with Amazon WorkSpaces and are
     * available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceDirectories operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceDirectories service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(final DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkspaceDirectoriesResult>() {
            public DescribeWorkspaceDirectoriesResult call() throws Exception {
                return describeWorkspaceDirectories(describeWorkspaceDirectoriesRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves information about the AWS Directory Service directories in
     * the region that are registered with Amazon WorkSpaces and are
     * available to your account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <code>NextToken</code> request and response parameters. If more
     * results are available, the <code>NextToken</code> response member
     * contains a token that you pass in the next call to this operation to
     * retrieve the next set of items.
     * </p>
     *
     * @param describeWorkspaceDirectoriesRequest Container for the necessary
     *           parameters to execute the DescribeWorkspaceDirectories operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkspaceDirectories service method, as returned by
     *         AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkspaceDirectoriesResult> describeWorkspaceDirectoriesAsync(
            final DescribeWorkspaceDirectoriesRequest describeWorkspaceDirectoriesRequest,
            final AsyncHandler<DescribeWorkspaceDirectoriesRequest, DescribeWorkspaceDirectoriesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeWorkspaceDirectoriesResult>() {
            public DescribeWorkspaceDirectoriesResult call() throws Exception {
              DescribeWorkspaceDirectoriesResult result;
                try {
                result = describeWorkspaceDirectories(describeWorkspaceDirectoriesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeWorkspaceDirectoriesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can
     * result in the loss of data. Rebuilding a WorkSpace causes the
     * following to occur:
     * </p>
     * 
     * <ul>
     * <li>The system is restored to the image of the bundle that the
     * WorkSpace is created from. Any applications that have been installed,
     * or system settings that have been made since the WorkSpace was created
     * will be lost.</li>
     * <li>The data drive (D drive) is re-created from the last automatic
     * snapshot taken of the data drive. The current contents of the data
     * drive are overwritten. Automatic snapshots of the data drive are taken
     * every 12 hours, so the snapshot can be as much as 12 hours old.</li>
     * 
     * </ul>
     * <p>
     * To be able to rebuild a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> or <code>ERROR</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely rebuilt.
     * </p>
     *
     * @param rebuildWorkspacesRequest Container for the necessary parameters
     *           to execute the RebuildWorkspaces operation on AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         RebuildWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(final RebuildWorkspacesRequest rebuildWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RebuildWorkspacesResult>() {
            public RebuildWorkspacesResult call() throws Exception {
                return rebuildWorkspaces(rebuildWorkspacesRequest);
        }
    });
    }

    /**
     * <p>
     * Rebuilds the specified WorkSpaces.
     * </p>
     * <p>
     * Rebuilding a WorkSpace is a potentially destructive action that can
     * result in the loss of data. Rebuilding a WorkSpace causes the
     * following to occur:
     * </p>
     * 
     * <ul>
     * <li>The system is restored to the image of the bundle that the
     * WorkSpace is created from. Any applications that have been installed,
     * or system settings that have been made since the WorkSpace was created
     * will be lost.</li>
     * <li>The data drive (D drive) is re-created from the last automatic
     * snapshot taken of the data drive. The current contents of the data
     * drive are overwritten. Automatic snapshots of the data drive are taken
     * every 12 hours, so the snapshot can be as much as 12 hours old.</li>
     * 
     * </ul>
     * <p>
     * To be able to rebuild a WorkSpace, the WorkSpace must have a
     * <b>State</b> of <code>AVAILABLE</code> or <code>ERROR</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely rebuilt.
     * </p>
     *
     * @param rebuildWorkspacesRequest Container for the necessary parameters
     *           to execute the RebuildWorkspaces operation on AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebuildWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RebuildWorkspacesResult> rebuildWorkspacesAsync(
            final RebuildWorkspacesRequest rebuildWorkspacesRequest,
            final AsyncHandler<RebuildWorkspacesRequest, RebuildWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RebuildWorkspacesResult>() {
            public RebuildWorkspacesResult call() throws Exception {
              RebuildWorkspacesResult result;
                try {
                result = rebuildWorkspaces(rebuildWorkspacesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(rebuildWorkspacesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone.
     * The user's data is not maintained and will be destroyed. If you need
     * to archive any user data, contact Amazon Web Services before
     * terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except
     * <code>SUSPENDED</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely terminated.
     * </p>
     *
     * @param terminateWorkspacesRequest Container for the necessary
     *           parameters to execute the TerminateWorkspaces operation on
     *           AmazonWorkspaces.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateWorkspacesResult> terminateWorkspacesAsync(final TerminateWorkspacesRequest terminateWorkspacesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateWorkspacesResult>() {
            public TerminateWorkspacesResult call() throws Exception {
                return terminateWorkspaces(terminateWorkspacesRequest);
        }
    });
    }

    /**
     * <p>
     * Terminates the specified WorkSpaces.
     * </p>
     * <p>
     * Terminating a WorkSpace is a permanent action and cannot be undone.
     * The user's data is not maintained and will be destroyed. If you need
     * to archive any user data, contact Amazon Web Services before
     * terminating the WorkSpace.
     * </p>
     * <p>
     * You can terminate a WorkSpace that is in any state except
     * <code>SUSPENDED</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is asynchronous and will return before
     * the WorkSpaces have been completely terminated.
     * </p>
     *
     * @param terminateWorkspacesRequest Container for the necessary
     *           parameters to execute the TerminateWorkspaces operation on
     *           AmazonWorkspaces.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateWorkspaces service method, as returned by AmazonWorkspaces.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonWorkspaces indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateWorkspacesResult> terminateWorkspacesAsync(
            final TerminateWorkspacesRequest terminateWorkspacesRequest,
            final AsyncHandler<TerminateWorkspacesRequest, TerminateWorkspacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TerminateWorkspacesResult>() {
            public TerminateWorkspacesResult call() throws Exception {
              TerminateWorkspacesResult result;
                try {
                result = terminateWorkspaces(terminateWorkspacesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(terminateWorkspacesRequest, result);
                 return result;
        }
    });
    }
    
}
        
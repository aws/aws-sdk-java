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
package com.amazonaws.services.cloudhsm;

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

import com.amazonaws.services.cloudhsm.model.*;

/**
 * Asynchronous client for accessing AWSCloudHSM.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS CloudHSM Service
 */
public class AWSCloudHSMAsyncClient extends AWSCloudHSMClient
        implements AWSCloudHSMAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM.  A credentials provider chain will be used
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
    public AWSCloudHSMAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM.  A credentials provider chain will be used
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
     *                       client connects to AWSCloudHSM
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudHSMAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials.
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
    public AWSCloudHSMAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials
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
    public AWSCloudHSMAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials,
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
    public AWSCloudHSMAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials provider.
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
    public AWSCloudHSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials provider
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
    public AWSCloudHSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials
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
    public AWSCloudHSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSCloudHSM using the specified AWS account credentials
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
    public AWSCloudHSMAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Gets the configuration files necessary to connect to all high
     * availability partition groups the client is associated with.
     * </p>
     *
     * @param getConfigRequest Container for the necessary parameters to
     *           execute the GetConfig operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         GetConfig service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConfigResult> getConfigAsync(final GetConfigRequest getConfigRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetConfigResult>() {
            public GetConfigResult call() throws Exception {
                return getConfig(getConfigRequest);
        }
    });
    }

    /**
     * <p>
     * Gets the configuration files necessary to connect to all high
     * availability partition groups the client is associated with.
     * </p>
     *
     * @param getConfigRequest Container for the necessary parameters to
     *           execute the GetConfig operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetConfig service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConfigResult> getConfigAsync(
            final GetConfigRequest getConfigRequest,
            final AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetConfigResult>() {
            public GetConfigResult call() throws Exception {
              GetConfigResult result;
                try {
                result = getConfig(getConfigRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getConfigRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates a high-availability partition group. A high-availability
     * partition group is a group of partitions that spans multiple physical
     * HSMs.
     * </p>
     *
     * @param createHapgRequest Container for the necessary parameters to
     *           execute the CreateHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHapgResult> createHapgAsync(final CreateHapgRequest createHapgRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHapgResult>() {
            public CreateHapgResult call() throws Exception {
                return createHapg(createHapgRequest);
        }
    });
    }

    /**
     * <p>
     * Creates a high-availability partition group. A high-availability
     * partition group is a group of partitions that spans multiple physical
     * HSMs.
     * </p>
     *
     * @param createHapgRequest Container for the necessary parameters to
     *           execute the CreateHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHapgResult> createHapgAsync(
            final CreateHapgRequest createHapgRequest,
            final AsyncHandler<CreateHapgRequest, CreateHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHapgResult>() {
            public CreateHapgResult call() throws Exception {
              CreateHapgResult result;
                try {
                result = createHapg(createHapgRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createHapgRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     *
     * @param describeHapgRequest Container for the necessary parameters to
     *           execute the DescribeHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHapgResult> describeHapgAsync(final DescribeHapgRequest describeHapgRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHapgResult>() {
            public DescribeHapgResult call() throws Exception {
                return describeHapg(describeHapgRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     *
     * @param describeHapgRequest Container for the necessary parameters to
     *           execute the DescribeHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHapgResult> describeHapgAsync(
            final DescribeHapgRequest describeHapgRequest,
            final AsyncHandler<DescribeHapgRequest, DescribeHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHapgResult>() {
            public DescribeHapgResult call() throws Exception {
              DescribeHapgResult result;
                try {
                result = describeHapg(describeHapgRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeHapgRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM
     * capacity.
     * </p>
     *
     * @param listAvailableZonesRequest Container for the necessary
     *           parameters to execute the ListAvailableZones operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ListAvailableZones service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAvailableZonesResult> listAvailableZonesAsync(final ListAvailableZonesRequest listAvailableZonesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAvailableZonesResult>() {
            public ListAvailableZonesResult call() throws Exception {
                return listAvailableZones(listAvailableZonesRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM
     * capacity.
     * </p>
     *
     * @param listAvailableZonesRequest Container for the necessary
     *           parameters to execute the ListAvailableZones operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAvailableZones service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAvailableZonesResult> listAvailableZonesAsync(
            final ListAvailableZonesRequest listAvailableZonesRequest,
            final AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListAvailableZonesResult>() {
            public ListAvailableZonesResult call() throws Exception {
              ListAvailableZonesResult result;
                try {
                result = listAvailableZones(listAvailableZonesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listAvailableZonesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Modifies an HSM.
     * </p>
     *
     * @param modifyHsmRequest Container for the necessary parameters to
     *           execute the ModifyHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHsmResult> modifyHsmAsync(final ModifyHsmRequest modifyHsmRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyHsmResult>() {
            public ModifyHsmResult call() throws Exception {
                return modifyHsm(modifyHsmRequest);
        }
    });
    }

    /**
     * <p>
     * Modifies an HSM.
     * </p>
     *
     * @param modifyHsmRequest Container for the necessary parameters to
     *           execute the ModifyHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHsmResult> modifyHsmAsync(
            final ModifyHsmRequest modifyHsmRequest,
            final AsyncHandler<ModifyHsmRequest, ModifyHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyHsmResult>() {
            public ModifyHsmResult call() throws Exception {
              ModifyHsmResult result;
                try {
                result = modifyHsm(modifyHsmRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyHsmRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListLunaClients to retrieve the next set of items.
     * </p>
     *
     * @param listLunaClientsRequest Container for the necessary parameters
     *           to execute the ListLunaClients operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ListLunaClients service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLunaClientsResult> listLunaClientsAsync(final ListLunaClientsRequest listLunaClientsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLunaClientsResult>() {
            public ListLunaClientsResult call() throws Exception {
                return listLunaClients(listLunaClientsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListLunaClients to retrieve the next set of items.
     * </p>
     *
     * @param listLunaClientsRequest Container for the necessary parameters
     *           to execute the ListLunaClients operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListLunaClients service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLunaClientsResult> listLunaClientsAsync(
            final ListLunaClientsRequest listLunaClientsRequest,
            final AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListLunaClientsResult>() {
            public ListLunaClientsResult call() throws Exception {
              ListLunaClientsResult result;
                try {
                result = listLunaClients(listLunaClientsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listLunaClientsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHapgs to retrieve the next set of items.
     * </p>
     *
     * @param listHapgsRequest Container for the necessary parameters to
     *           execute the ListHapgs operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ListHapgs service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHapgsResult> listHapgsAsync(final ListHapgsRequest listHapgsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHapgsResult>() {
            public ListHapgsResult call() throws Exception {
                return listHapgs(listHapgsRequest);
        }
    });
    }

    /**
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHapgs to retrieve the next set of items.
     * </p>
     *
     * @param listHapgsRequest Container for the necessary parameters to
     *           execute the ListHapgs operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHapgs service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHapgsResult> listHapgsAsync(
            final ListHapgsRequest listHapgsRequest,
            final AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHapgsResult>() {
            public ListHapgsResult call() throws Exception {
              ListHapgsResult result;
                try {
                result = listHapgs(listHapgsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listHapgsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes an HSM. Once complete, this operation cannot be undone and
     * your key material cannot be recovered.
     * </p>
     *
     * @param deleteHsmRequest Container for the necessary parameters to
     *           execute the DeleteHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHsmResult> deleteHsmAsync(final DeleteHsmRequest deleteHsmRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHsmResult>() {
            public DeleteHsmResult call() throws Exception {
                return deleteHsm(deleteHsmRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes an HSM. Once complete, this operation cannot be undone and
     * your key material cannot be recovered.
     * </p>
     *
     * @param deleteHsmRequest Container for the necessary parameters to
     *           execute the DeleteHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHsmResult> deleteHsmAsync(
            final DeleteHsmRequest deleteHsmRequest,
            final AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHsmResult>() {
            public DeleteHsmResult call() throws Exception {
              DeleteHsmResult result;
                try {
                result = deleteHsm(deleteHsmRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteHsmRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates an uninitialized HSM instance. Running this command
     * provisions an HSM appliance and will result in charges to your AWS
     * account for the HSM.
     * </p>
     *
     * @param createHsmRequest Container for the necessary parameters to
     *           execute the CreateHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHsmResult> createHsmAsync(final CreateHsmRequest createHsmRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHsmResult>() {
            public CreateHsmResult call() throws Exception {
                return createHsm(createHsmRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an uninitialized HSM instance. Running this command
     * provisions an HSM appliance and will result in charges to your AWS
     * account for the HSM.
     * </p>
     *
     * @param createHsmRequest Container for the necessary parameters to
     *           execute the CreateHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHsmResult> createHsmAsync(
            final CreateHsmRequest createHsmRequest,
            final AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHsmResult>() {
            public CreateHsmResult call() throws Exception {
              CreateHsmResult result;
                try {
                result = createHsm(createHsmRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createHsmRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the
     * current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHsms to retrieve the next set of items.
     * </p>
     *
     * @param listHsmsRequest Container for the necessary parameters to
     *           execute the ListHsms operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the ListHsms
     *         service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHsmsResult> listHsmsAsync(final ListHsmsRequest listHsmsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHsmsResult>() {
            public ListHsmsResult call() throws Exception {
                return listHsms(listHsmsRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the
     * current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the
     * <i>NextToken</i> member. If more results are available, the
     * <i>NextToken</i> member of the response contains a token that you pass
     * in the next call to ListHsms to retrieve the next set of items.
     * </p>
     *
     * @param listHsmsRequest Container for the necessary parameters to
     *           execute the ListHsms operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the ListHsms
     *         service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHsmsResult> listHsmsAsync(
            final ListHsmsRequest listHsmsRequest,
            final AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHsmsResult>() {
            public ListHsmsResult call() throws Exception {
              ListHsmsResult result;
                try {
                result = listHsms(listHsmsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listHsmsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its
     * ARN or its serial number.
     * </p>
     *
     * @param describeHsmRequest Container for the necessary parameters to
     *           execute the DescribeHsm operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHsmResult> describeHsmAsync(final DescribeHsmRequest describeHsmRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHsmResult>() {
            public DescribeHsmResult call() throws Exception {
                return describeHsm(describeHsmRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its
     * ARN or its serial number.
     * </p>
     *
     * @param describeHsmRequest Container for the necessary parameters to
     *           execute the DescribeHsm operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeHsm service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeHsmResult> describeHsmAsync(
            final DescribeHsmRequest describeHsmRequest,
            final AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeHsmResult>() {
            public DescribeHsmResult call() throws Exception {
              DescribeHsmResult result;
                try {
                result = describeHsm(describeHsmRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeHsmRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     *
     * @param deleteHapgRequest Container for the necessary parameters to
     *           execute the DeleteHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHapgResult> deleteHapgAsync(final DeleteHapgRequest deleteHapgRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHapgResult>() {
            public DeleteHapgResult call() throws Exception {
                return deleteHapg(deleteHapgRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     *
     * @param deleteHapgRequest Container for the necessary parameters to
     *           execute the DeleteHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHapgResult> deleteHapgAsync(
            final DeleteHapgRequest deleteHapgRequest,
            final AsyncHandler<DeleteHapgRequest, DeleteHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHapgResult>() {
            public DeleteHapgResult call() throws Exception {
              DeleteHapgResult result;
                try {
                result = deleteHapg(deleteHapgRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteHapgRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     *
     * @param modifyHapgRequest Container for the necessary parameters to
     *           execute the ModifyHapg operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHapgResult> modifyHapgAsync(final ModifyHapgRequest modifyHapgRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyHapgResult>() {
            public ModifyHapgResult call() throws Exception {
                return modifyHapg(modifyHapgRequest);
        }
    });
    }

    /**
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     *
     * @param modifyHapgRequest Container for the necessary parameters to
     *           execute the ModifyHapg operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyHapg service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyHapgResult> modifyHapgAsync(
            final ModifyHapgRequest modifyHapgRequest,
            final AsyncHandler<ModifyHapgRequest, ModifyHapgResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyHapgResult>() {
            public ModifyHapgResult call() throws Exception {
              ModifyHapgResult result;
                try {
                result = modifyHapg(modifyHapgRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyHapgRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Creates an HSM client.
     * </p>
     *
     * @param createLunaClientRequest Container for the necessary parameters
     *           to execute the CreateLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLunaClientResult> createLunaClientAsync(final CreateLunaClientRequest createLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLunaClientResult>() {
            public CreateLunaClientResult call() throws Exception {
                return createLunaClient(createLunaClientRequest);
        }
    });
    }

    /**
     * <p>
     * Creates an HSM client.
     * </p>
     *
     * @param createLunaClientRequest Container for the necessary parameters
     *           to execute the CreateLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLunaClientResult> createLunaClientAsync(
            final CreateLunaClientRequest createLunaClientRequest,
            final AsyncHandler<CreateLunaClientRequest, CreateLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateLunaClientResult>() {
            public CreateLunaClientResult call() throws Exception {
              CreateLunaClientResult result;
                try {
                result = createLunaClient(createLunaClientRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createLunaClientRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Deletes a client.
     * </p>
     *
     * @param deleteLunaClientRequest Container for the necessary parameters
     *           to execute the DeleteLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLunaClientResult> deleteLunaClientAsync(final DeleteLunaClientRequest deleteLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLunaClientResult>() {
            public DeleteLunaClientResult call() throws Exception {
                return deleteLunaClient(deleteLunaClientRequest);
        }
    });
    }

    /**
     * <p>
     * Deletes a client.
     * </p>
     *
     * @param deleteLunaClientRequest Container for the necessary parameters
     *           to execute the DeleteLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteLunaClientResult> deleteLunaClientAsync(
            final DeleteLunaClientRequest deleteLunaClientRequest,
            final AsyncHandler<DeleteLunaClientRequest, DeleteLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteLunaClientResult>() {
            public DeleteLunaClientResult call() throws Exception {
              DeleteLunaClientResult result;
                try {
                result = deleteLunaClient(deleteLunaClientRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteLunaClientRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new
     * certificate on the client's HSMs.
     * </p>
     *
     * @param modifyLunaClientRequest Container for the necessary parameters
     *           to execute the ModifyLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLunaClientResult> modifyLunaClientAsync(final ModifyLunaClientRequest modifyLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyLunaClientResult>() {
            public ModifyLunaClientResult call() throws Exception {
                return modifyLunaClient(modifyLunaClientRequest);
        }
    });
    }

    /**
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new
     * certificate on the client's HSMs.
     * </p>
     *
     * @param modifyLunaClientRequest Container for the necessary parameters
     *           to execute the ModifyLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyLunaClientResult> modifyLunaClientAsync(
            final ModifyLunaClientRequest modifyLunaClientRequest,
            final AsyncHandler<ModifyLunaClientRequest, ModifyLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ModifyLunaClientResult>() {
            public ModifyLunaClientResult call() throws Exception {
              ModifyLunaClientResult result;
                try {
                result = modifyLunaClient(modifyLunaClientRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(modifyLunaClientRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     *
     * @param describeLunaClientRequest Container for the necessary
     *           parameters to execute the DescribeLunaClient operation on AWSCloudHSM.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLunaClientResult> describeLunaClientAsync(final DescribeLunaClientRequest describeLunaClientRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLunaClientResult>() {
            public DescribeLunaClientResult call() throws Exception {
                return describeLunaClient(describeLunaClientRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     *
     * @param describeLunaClientRequest Container for the necessary
     *           parameters to execute the DescribeLunaClient operation on AWSCloudHSM.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLunaClient service method, as returned by AWSCloudHSM.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSCloudHSM indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLunaClientResult> describeLunaClientAsync(
            final DescribeLunaClientRequest describeLunaClientRequest,
            final AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeLunaClientResult>() {
            public DescribeLunaClientResult call() throws Exception {
              DescribeLunaClientResult result;
                try {
                result = describeLunaClient(describeLunaClientRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(describeLunaClientRequest, result);
                 return result;
        }
    });
    }
    
}
        
/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains;

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

import com.amazonaws.services.route53domains.model.*;

/**
 * Asynchronous client for accessing AmazonRoute53Domains.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * 
 */
public class AmazonRoute53DomainsAsyncClient extends AmazonRoute53DomainsClient
        implements AmazonRoute53DomainsAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains.  A credentials provider chain will be used
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
    public AmazonRoute53DomainsAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains.  A credentials provider chain will be used
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
     *                       client connects to AmazonRoute53Domains
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRoute53DomainsAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials.
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials,
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials provider.
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials provider
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53Domains using the specified AWS account credentials
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
    public AmazonRoute53DomainsAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * This operation updates the contact information for a particular
     * domain. Information for at least one contact (registrant,
     * administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     *
     * @param updateDomainContactRequest Container for the necessary
     *           parameters to execute the UpdateDomainContact operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContact service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactResult> updateDomainContactAsync(final UpdateDomainContactRequest updateDomainContactRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDomainContactResult>() {
            public UpdateDomainContactResult call() throws Exception {
                return updateDomainContact(updateDomainContactRequest);
        }
    });
    }

    /**
     * <p>
     * This operation updates the contact information for a particular
     * domain. Information for at least one contact (registrant,
     * administrator, or technical) must be supplied for update.
     * </p>
     * <p>
     * If the update is successful, this method returns an operation ID that
     * you can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant will be
     * notified by email.
     * </p>
     *
     * @param updateDomainContactRequest Container for the necessary
     *           parameters to execute the UpdateDomainContact operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContact service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactResult> updateDomainContactAsync(
            final UpdateDomainContactRequest updateDomainContactRequest,
            final AsyncHandler<UpdateDomainContactRequest, UpdateDomainContactResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDomainContactResult>() {
            public UpdateDomainContactResult call() throws Exception {
              UpdateDomainContactResult result;
                try {
                result = updateDomainContact(updateDomainContactRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateDomainContactRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation checks the availability of one domain name. You can
     * access this API without authenticating. Note that if the availability
     * status of a domain is pending, you must submit another request to
     * determine the availability of the domain name.
     * </p>
     *
     * @param checkDomainAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDomainAvailability operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         CheckDomainAvailability service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(final CheckDomainAvailabilityRequest checkDomainAvailabilityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CheckDomainAvailabilityResult>() {
            public CheckDomainAvailabilityResult call() throws Exception {
                return checkDomainAvailability(checkDomainAvailabilityRequest);
        }
    });
    }

    /**
     * <p>
     * This operation checks the availability of one domain name. You can
     * access this API without authenticating. Note that if the availability
     * status of a domain is pending, you must submit another request to
     * determine the availability of the domain name.
     * </p>
     *
     * @param checkDomainAvailabilityRequest Container for the necessary
     *           parameters to execute the CheckDomainAvailability operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CheckDomainAvailability service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CheckDomainAvailabilityResult> checkDomainAvailabilityAsync(
            final CheckDomainAvailabilityRequest checkDomainAvailabilityRequest,
            final AsyncHandler<CheckDomainAvailabilityRequest, CheckDomainAvailabilityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CheckDomainAvailabilityResult>() {
            public CheckDomainAvailabilityResult call() throws Exception {
              CheckDomainAvailabilityResult result;
                try {
                result = checkDomainAvailability(checkDomainAvailabilityRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(checkDomainAvailabilityRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     *
     * @param listOperationsRequest Container for the necessary parameters to
     *           execute the ListOperations operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         ListOperations service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListOperationsResult> listOperationsAsync(final ListOperationsRequest listOperationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListOperationsResult>() {
            public ListOperationsResult call() throws Exception {
                return listOperations(listOperationsRequest);
        }
    });
    }

    /**
     * <p>
     * This operation returns the operation IDs of operations that are not
     * yet complete.
     * </p>
     *
     * @param listOperationsRequest Container for the necessary parameters to
     *           execute the ListOperations operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListOperations service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListOperationsResult> listOperationsAsync(
            final ListOperationsRequest listOperationsRequest,
            final AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListOperationsResult>() {
            public ListOperationsResult call() throws Exception {
              ListOperationsResult result;
                try {
                result = listOperations(listOperationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listOperationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainsResult> listDomainsAsync(final ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDomainsResult>() {
            public ListDomainsResult call() throws Exception {
                return listDomains(listDomainsRequest);
        }
    });
    }

    /**
     * <p>
     * This operation returns all the domain names registered with Amazon
     * Route 53 for the current AWS account.
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListDomains service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDomainsResult> listDomainsAsync(
            final ListDomainsRequest listDomainsRequest,
            final AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListDomainsResult>() {
            public ListDomainsResult call() throws Exception {
              ListDomainsResult result;
                try {
                result = listDomains(listDomainsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listDomainsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     *
     * @param getOperationDetailRequest Container for the necessary
     *           parameters to execute the GetOperationDetail operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         GetOperationDetail service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOperationDetailResult> getOperationDetailAsync(final GetOperationDetailRequest getOperationDetailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOperationDetailResult>() {
            public GetOperationDetailResult call() throws Exception {
                return getOperationDetail(getOperationDetailRequest);
        }
    });
    }

    /**
     * <p>
     * This operation returns the current status of an operation that is not
     * completed.
     * </p>
     *
     * @param getOperationDetailRequest Container for the necessary
     *           parameters to execute the GetOperationDetail operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetOperationDetail service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetOperationDetailResult> getOperationDetailAsync(
            final GetOperationDetailRequest getOperationDetailRequest,
            final AsyncHandler<GetOperationDetailRequest, GetOperationDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetOperationDetailResult>() {
            public GetOperationDetailResult call() throws Exception {
              GetOperationDetailResult result;
                try {
                result = getOperationDetail(getOperationDetailRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getOperationDetailRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically
     * the <code>clientTransferProhibited</code> status) to allow domain
     * transfers. We recommend you refrain from performing this action unless
     * you intend to transfer the domain to a different registrar. Successful
     * submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param disableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the DisableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         DisableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(final DisableDomainTransferLockRequest disableDomainTransferLockRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableDomainTransferLockResult>() {
            public DisableDomainTransferLockResult call() throws Exception {
                return disableDomainTransferLock(disableDomainTransferLockRequest);
        }
    });
    }

    /**
     * <p>
     * This operation removes the transfer lock on the domain (specifically
     * the <code>clientTransferProhibited</code> status) to allow domain
     * transfers. We recommend you refrain from performing this action unless
     * you intend to transfer the domain to a different registrar. Successful
     * submission returns an operation ID that you can use to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param disableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the DisableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisableDomainTransferLockResult> disableDomainTransferLockAsync(
            final DisableDomainTransferLockRequest disableDomainTransferLockRequest,
            final AsyncHandler<DisableDomainTransferLockRequest, DisableDomainTransferLockResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisableDomainTransferLockResult>() {
            public DisableDomainTransferLockResult call() throws Exception {
              DisableDomainTransferLockResult result;
                try {
                result = disableDomainTransferLock(disableDomainTransferLockRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disableDomainTransferLockRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation replaces the current set of name servers for the
     * domain with the specified set of name servers. If you use Amazon Route
     * 53 as your DNS service, specify the four name servers in the
     * delegation set for the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param updateDomainNameserversRequest Container for the necessary
     *           parameters to execute the UpdateDomainNameservers operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainNameservers service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(final UpdateDomainNameserversRequest updateDomainNameserversRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDomainNameserversResult>() {
            public UpdateDomainNameserversResult call() throws Exception {
                return updateDomainNameservers(updateDomainNameserversRequest);
        }
    });
    }

    /**
     * <p>
     * This operation replaces the current set of name servers for the
     * domain with the specified set of name servers. If you use Amazon Route
     * 53 as your DNS service, specify the four name servers in the
     * delegation set for the hosted zone for the domain.
     * </p>
     * <p>
     * If successful, this operation returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param updateDomainNameserversRequest Container for the necessary
     *           parameters to execute the UpdateDomainNameservers operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainNameservers service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainNameserversResult> updateDomainNameserversAsync(
            final UpdateDomainNameserversRequest updateDomainNameserversRequest,
            final AsyncHandler<UpdateDomainNameserversRequest, UpdateDomainNameserversResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDomainNameserversResult>() {
            public UpdateDomainNameserversResult call() throws Exception {
              UpdateDomainNameserversResult result;
                try {
                result = updateDomainNameservers(updateDomainNameserversRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateDomainNameserversRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param enableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the EnableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         EnableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(final EnableDomainTransferLockRequest enableDomainTransferLockRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableDomainTransferLockResult>() {
            public EnableDomainTransferLockResult call() throws Exception {
                return enableDomainTransferLock(enableDomainTransferLockRequest);
        }
    });
    }

    /**
     * <p>
     * This operation sets the transfer lock on the domain (specifically the
     * <code>clientTransferProhibited</code> status) to prevent domain
     * transfers. Successful submission returns an operation ID that you can
     * use to track the progress and completion of the action. If the request
     * is not completed successfully, the domain registrant will be notified
     * by email.
     * </p>
     *
     * @param enableDomainTransferLockRequest Container for the necessary
     *           parameters to execute the EnableDomainTransferLock operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableDomainTransferLock service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<EnableDomainTransferLockResult> enableDomainTransferLockAsync(
            final EnableDomainTransferLockRequest enableDomainTransferLockRequest,
            final AsyncHandler<EnableDomainTransferLockRequest, EnableDomainTransferLockResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<EnableDomainTransferLockResult>() {
            public EnableDomainTransferLockResult call() throws Exception {
              EnableDomainTransferLockResult result;
                try {
                result = enableDomainTransferLock(enableDomainTransferLockRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(enableDomainTransferLockRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS
     * registrar partner, Gandi. For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * 
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as
     * the domain. Amazon Route 53 assigns four name servers to your hosted
     * zone and automatically updates your domain registration with the names
     * of these name servers.</li>
     * <li>Enables autorenew, so your domain registration will renew
     * automatically each year. We'll notify you in advance of the renewal
     * date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return
     * contact information for our registrar partner, Gandi, instead of the
     * information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant is
     * notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain.
     * For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .</li>
     * 
     * </ul>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterDomainResult> registerDomainAsync(final RegisterDomainRequest registerDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterDomainResult>() {
            public RegisterDomainResult call() throws Exception {
                return registerDomain(registerDomainRequest);
        }
    });
    }

    /**
     * <p>
     * This operation registers a domain. Domains are registered by the AWS
     * registrar partner, Gandi. For some top-level domains (TLDs), this
     * operation requires extra parameters.
     * </p>
     * <p>
     * When you register a domain, Amazon Route 53 does the following:
     * </p>
     * 
     * <ul>
     * <li>Creates a Amazon Route 53 hosted zone that has the same name as
     * the domain. Amazon Route 53 assigns four name servers to your hosted
     * zone and automatically updates your domain registration with the names
     * of these name servers.</li>
     * <li>Enables autorenew, so your domain registration will renew
     * automatically each year. We'll notify you in advance of the renewal
     * date so you can choose whether to renew the registration.</li>
     * <li>Optionally enables privacy protection, so WHOIS queries return
     * contact information for our registrar partner, Gandi, instead of the
     * information you entered for registrant, admin, and tech contacts.</li>
     * <li>If registration is successful, returns an operation ID that you
     * can use to track the progress and completion of the action. If the
     * request is not completed successfully, the domain registrant is
     * notified by email.</li>
     * <li>Charges your AWS account an amount based on the top-level domain.
     * For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .</li>
     * 
     * </ul>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterDomainResult> registerDomainAsync(
            final RegisterDomainRequest registerDomainRequest,
            final AsyncHandler<RegisterDomainRequest, RegisterDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RegisterDomainResult>() {
            public RegisterDomainResult call() throws Exception {
              RegisterDomainResult result;
                try {
                result = registerDomain(registerDomainRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(registerDomainRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     *
     * @param getDomainDetailRequest Container for the necessary parameters
     *           to execute the GetDomainDetail operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         GetDomainDetail service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDomainDetailResult> getDomainDetailAsync(final GetDomainDetailRequest getDomainDetailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDomainDetailResult>() {
            public GetDomainDetailResult call() throws Exception {
                return getDomainDetail(getDomainDetailRequest);
        }
    });
    }

    /**
     * <p>
     * This operation returns detailed information about the domain. The
     * domain's contact information is also returned as part of the output.
     * </p>
     *
     * @param getDomainDetailRequest Container for the necessary parameters
     *           to execute the GetDomainDetail operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDomainDetail service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDomainDetailResult> getDomainDetailAsync(
            final GetDomainDetailRequest getDomainDetailRequest,
            final AsyncHandler<GetDomainDetailRequest, GetDomainDetailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetDomainDetailResult>() {
            public GetDomainDetailResult call() throws Exception {
              GetDomainDetailResult result;
                try {
                result = getDomainDetail(getDomainDetailRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getDomainDetailRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a
     * domain to another registrar, you provide this value to the new
     * registrar.
     * </p>
     *
     * @param retrieveDomainAuthCodeRequest Container for the necessary
     *           parameters to execute the RetrieveDomainAuthCode operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveDomainAuthCode service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(final RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveDomainAuthCodeResult>() {
            public RetrieveDomainAuthCodeResult call() throws Exception {
                return retrieveDomainAuthCode(retrieveDomainAuthCodeRequest);
        }
    });
    }

    /**
     * <p>
     * This operation returns the AuthCode for the domain. To transfer a
     * domain to another registrar, you provide this value to the new
     * registrar.
     * </p>
     *
     * @param retrieveDomainAuthCodeRequest Container for the necessary
     *           parameters to execute the RetrieveDomainAuthCode operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RetrieveDomainAuthCode service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RetrieveDomainAuthCodeResult> retrieveDomainAuthCodeAsync(
            final RetrieveDomainAuthCodeRequest retrieveDomainAuthCodeRequest,
            final AsyncHandler<RetrieveDomainAuthCodeRequest, RetrieveDomainAuthCodeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RetrieveDomainAuthCodeResult>() {
            public RetrieveDomainAuthCodeResult call() throws Exception {
              RetrieveDomainAuthCodeResult result;
                try {
                result = retrieveDomainAuthCode(retrieveDomainAuthCodeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(retrieveDomainAuthCodeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon
     * Route 53. Domains are registered by the AWS registrar, Gandi upon
     * transfer.
     * </p>
     * <p>
     * To transfer a domain, you need to meet all the domain transfer
     * criteria, including the following:
     * </p>
     * 
     * <ul>
     * <li>You must supply nameservers to transfer a domain.</li>
     * <li>You must disable the domain transfer lock (if any) before
     * transferring the domain.</li>
     * <li>A minimum of 60 days must have elapsed since the domain's
     * registration or last transfer.</li>
     * 
     * </ul>
     * <p>
     * We recommend you use the Amazon Route 53 as the DNS service for your
     * domain. You can create a hosted zone in Amazon Route 53 for your
     * current domain before transferring your domain.
     * </p>
     * <p>
     * Note that upon transfer, the domain duration is extended for a year
     * if not otherwise specified. Autorenew is enabled by default.
     * </p>
     * <p>
     * If the transfer is successful, this method returns an operation ID
     * that you can use to track the progress and completion of the action.
     * If the request is not completed successfully, the domain registrant
     * will be notified by email.
     * </p>
     * <p>
     * Transferring domains charges your AWS account an amount based on the
     * top-level domain. For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .
     * </p>
     *
     * @param transferDomainRequest Container for the necessary parameters to
     *           execute the TransferDomain operation on AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         TransferDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TransferDomainResult> transferDomainAsync(final TransferDomainRequest transferDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TransferDomainResult>() {
            public TransferDomainResult call() throws Exception {
                return transferDomain(transferDomainRequest);
        }
    });
    }

    /**
     * <p>
     * This operation transfers a domain from another registrar to Amazon
     * Route 53. Domains are registered by the AWS registrar, Gandi upon
     * transfer.
     * </p>
     * <p>
     * To transfer a domain, you need to meet all the domain transfer
     * criteria, including the following:
     * </p>
     * 
     * <ul>
     * <li>You must supply nameservers to transfer a domain.</li>
     * <li>You must disable the domain transfer lock (if any) before
     * transferring the domain.</li>
     * <li>A minimum of 60 days must have elapsed since the domain's
     * registration or last transfer.</li>
     * 
     * </ul>
     * <p>
     * We recommend you use the Amazon Route 53 as the DNS service for your
     * domain. You can create a hosted zone in Amazon Route 53 for your
     * current domain before transferring your domain.
     * </p>
     * <p>
     * Note that upon transfer, the domain duration is extended for a year
     * if not otherwise specified. Autorenew is enabled by default.
     * </p>
     * <p>
     * If the transfer is successful, this method returns an operation ID
     * that you can use to track the progress and completion of the action.
     * If the request is not completed successfully, the domain registrant
     * will be notified by email.
     * </p>
     * <p>
     * Transferring domains charges your AWS account an amount based on the
     * top-level domain. For more information, see
     * <a href="http://aws.amazon.com/route53/pricing/"> Amazon Route 53 Pricing </a>
     * .
     * </p>
     *
     * @param transferDomainRequest Container for the necessary parameters to
     *           execute the TransferDomain operation on AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TransferDomain service method, as returned by AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TransferDomainResult> transferDomainAsync(
            final TransferDomainRequest transferDomainRequest,
            final AsyncHandler<TransferDomainRequest, TransferDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<TransferDomainResult>() {
            public TransferDomainResult call() throws Exception {
              TransferDomainResult result;
                try {
                result = transferDomain(transferDomainRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(transferDomainRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This operation updates the specified domain contact's privacy
     * setting. When the privacy option is enabled, personal information such
     * as postal or email address is hidden from the results of a public
     * WHOIS query. The privacy services are provided by the AWS registrar,
     * Gandi. For more information, see the
     * <a href="http://www.gandi.net/domain/whois/?currency=USD&lang=en"> Gandi privacy features </a>
     * .
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type
     * (registrant, administrator, or tech). Successful acceptance returns an
     * operation ID that you can use with GetOperationDetail to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param updateDomainContactPrivacyRequest Container for the necessary
     *           parameters to execute the UpdateDomainContactPrivacy operation on
     *           AmazonRoute53Domains.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContactPrivacy service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(final UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDomainContactPrivacyResult>() {
            public UpdateDomainContactPrivacyResult call() throws Exception {
                return updateDomainContactPrivacy(updateDomainContactPrivacyRequest);
        }
    });
    }

    /**
     * <p>
     * This operation updates the specified domain contact's privacy
     * setting. When the privacy option is enabled, personal information such
     * as postal or email address is hidden from the results of a public
     * WHOIS query. The privacy services are provided by the AWS registrar,
     * Gandi. For more information, see the
     * <a href="http://www.gandi.net/domain/whois/?currency=USD&lang=en"> Gandi privacy features </a>
     * .
     * </p>
     * <p>
     * This operation only affects the privacy of the specified contact type
     * (registrant, administrator, or tech). Successful acceptance returns an
     * operation ID that you can use with GetOperationDetail to track the
     * progress and completion of the action. If the request is not completed
     * successfully, the domain registrant will be notified by email.
     * </p>
     *
     * @param updateDomainContactPrivacyRequest Container for the necessary
     *           parameters to execute the UpdateDomainContactPrivacy operation on
     *           AmazonRoute53Domains.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDomainContactPrivacy service method, as returned by
     *         AmazonRoute53Domains.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53Domains indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDomainContactPrivacyResult> updateDomainContactPrivacyAsync(
            final UpdateDomainContactPrivacyRequest updateDomainContactPrivacyRequest,
            final AsyncHandler<UpdateDomainContactPrivacyRequest, UpdateDomainContactPrivacyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDomainContactPrivacyResult>() {
            public UpdateDomainContactPrivacyResult call() throws Exception {
              UpdateDomainContactPrivacyResult result;
                try {
                result = updateDomainContactPrivacy(updateDomainContactPrivacyRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateDomainContactPrivacyRequest, result);
                 return result;
        }
    });
    }
    
}
        
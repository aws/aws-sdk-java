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
package com.amazonaws.services.route53;

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

import com.amazonaws.services.route53.model.*;

/**
 * Asynchronous client for accessing AmazonRoute53.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * 
 */
public class AmazonRoute53AsyncClient extends AmazonRoute53Client
        implements AmazonRoute53Async {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53.  A credentials provider chain will be used
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
    public AmazonRoute53AsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53.  A credentials provider chain will be used
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
     *                       client connects to AmazonRoute53
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonRoute53AsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials.
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
    public AmazonRoute53AsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials
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
    public AmazonRoute53AsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials,
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
    public AmazonRoute53AsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials provider.
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
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials provider
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
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials
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
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonRoute53 using the specified AWS account credentials
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
    public AmazonRoute53AsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * To retrieve the delegation set for a hosted zone, send a
     * <code>GET</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource. The delegation set is the four Route 53 name
     * servers that were assigned to the hosted zone when you created it.
     * </p>
     *
     * @param getHostedZoneRequest Container for the necessary parameters to
     *           execute the GetHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostedZoneResult> getHostedZoneAsync(final GetHostedZoneRequest getHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHostedZoneResult>() {
            public GetHostedZoneResult call() throws Exception {
                return getHostedZone(getHostedZoneRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a
     * <code>GET</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource. The delegation set is the four Route 53 name
     * servers that were assigned to the hosted zone when you created it.
     * </p>
     *
     * @param getHostedZoneRequest Container for the necessary parameters to
     *           execute the GetHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostedZoneResult> getHostedZoneAsync(
            final GetHostedZoneRequest getHostedZoneRequest,
            final AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHostedZoneResult>() {
            public GetHostedZoneResult call() throws Exception {
              GetHostedZoneResult result;
                try {
                result = getHostedZone(getHostedZoneRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getHostedZoneRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request
     * have not replicated to all Route 53 DNS servers. This is the initial
     * status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to
     * all Amazon Route 53 DNS servers.
     * </p>
     *
     * @param getChangeRequest Container for the necessary parameters to
     *           execute the GetChange operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetChange service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetChangeResult> getChangeAsync(final GetChangeRequest getChangeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetChangeResult>() {
            public GetChangeResult call() throws Exception {
                return getChange(getChangeRequest);
        }
    });
    }

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request
     * have not replicated to all Route 53 DNS servers. This is the initial
     * status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to
     * all Amazon Route 53 DNS servers.
     * </p>
     *
     * @param getChangeRequest Container for the necessary parameters to
     *           execute the GetChange operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetChange service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetChangeResult> getChangeAsync(
            final GetChangeRequest getChangeRequest,
            final AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetChangeResult>() {
            public GetChangeResult call() throws Exception {
              GetChangeResult result;
                try {
                result = getChange(getChangeRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getChangeRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to
     * the <code>2013-04-01/geolocation</code> resource with one of these
     * options: continentcode | countrycode | countrycode and
     * subdivisioncode.
     * </p>
     *
     * @param getGeoLocationRequest Container for the necessary parameters to
     *           execute the GetGeoLocation operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetGeoLocation service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetGeoLocationResult> getGeoLocationAsync(final GetGeoLocationRequest getGeoLocationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetGeoLocationResult>() {
            public GetGeoLocationResult call() throws Exception {
                return getGeoLocation(getGeoLocationRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to
     * the <code>2013-04-01/geolocation</code> resource with one of these
     * options: continentcode | countrycode | countrycode and
     * subdivisioncode.
     * </p>
     *
     * @param getGeoLocationRequest Container for the necessary parameters to
     *           execute the GetGeoLocation operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetGeoLocation service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetGeoLocationResult> getGeoLocationAsync(
            final GetGeoLocationRequest getGeoLocationRequest,
            final AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetGeoLocationResult>() {
            public GetGeoLocationResult call() throws Exception {
              GetGeoLocationResult result;
                try {
                result = getGeoLocation(getGeoLocationRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getGeoLocationRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request
     * to the <code>2013-04-01/hostedzone/hosted zone ID </code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to
     * this request includes the modified <code>HostedZone</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> The comment can have a maximum length of 256 characters.
     * </p>
     *
     * @param updateHostedZoneCommentRequest Container for the necessary
     *           parameters to execute the UpdateHostedZoneComment operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHostedZoneComment service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(final UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateHostedZoneCommentResult>() {
            public UpdateHostedZoneCommentResult call() throws Exception {
                return updateHostedZoneComment(updateHostedZoneCommentRequest);
        }
    });
    }

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request
     * to the <code>2013-04-01/hostedzone/hosted zone ID </code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to
     * this request includes the modified <code>HostedZone</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> The comment can have a maximum length of 256 characters.
     * </p>
     *
     * @param updateHostedZoneCommentRequest Container for the necessary
     *           parameters to execute the UpdateHostedZoneComment operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHostedZoneComment service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(
            final UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest,
            final AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateHostedZoneCommentResult>() {
            public UpdateHostedZoneCommentResult call() throws Exception {
              UpdateHostedZoneCommentResult result;
                try {
                result = updateHostedZoneComment(updateHostedZoneCommentRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateHostedZoneCommentRequest, result);
                 return result;
        }
    });
    }
    
    /**
     *
     * @param listTagsForResourcesRequest Container for the necessary
     *           parameters to execute the ListTagsForResources operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResources service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourcesResult> listTagsForResourcesAsync(final ListTagsForResourcesRequest listTagsForResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourcesResult>() {
            public ListTagsForResourcesResult call() throws Exception {
                return listTagsForResources(listTagsForResourcesRequest);
        }
    });
    }

    /**
     *
     * @param listTagsForResourcesRequest Container for the necessary
     *           parameters to execute the ListTagsForResources operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResources service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourcesResult> listTagsForResourcesAsync(
            final ListTagsForResourcesRequest listTagsForResourcesRequest,
            final AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourcesResult>() {
            public ListTagsForResourcesResult call() throws Exception {
              ListTagsForResourcesResult result;
                try {
                result = listTagsForResources(listTagsForResourcesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listTagsForResourcesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the <code>2013-04-01/healthcheck/health
     * check ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a health check only if there are no
     * resource record sets associated with this health check. If resource
     * record sets are associated with this health check, you must
     * disassociate them before you can delete your health check. If you try
     * to delete a health check that is associated with resource record sets,
     * Route 53 will deny your request with a HealthCheckInUse error. For
     * information about disassociating the records from your health check,
     * see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHealthCheckRequest Container for the necessary parameters
     *           to execute the DeleteHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHealthCheckResult> deleteHealthCheckAsync(final DeleteHealthCheckRequest deleteHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHealthCheckResult>() {
            public DeleteHealthCheckResult call() throws Exception {
                return deleteHealthCheck(deleteHealthCheckRequest);
        }
    });
    }

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the <code>2013-04-01/healthcheck/health
     * check ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a health check only if there are no
     * resource record sets associated with this health check. If resource
     * record sets are associated with this health check, you must
     * disassociate them before you can delete your health check. If you try
     * to delete a health check that is associated with resource record sets,
     * Route 53 will deny your request with a HealthCheckInUse error. For
     * information about disassociating the records from your health check,
     * see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHealthCheckRequest Container for the necessary parameters
     *           to execute the DeleteHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHealthCheckResult> deleteHealthCheckAsync(
            final DeleteHealthCheckRequest deleteHealthCheckRequest,
            final AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHealthCheckResult>() {
            public DeleteHealthCheckResult call() throws Exception {
              DeleteHealthCheckResult result;
                try {
                result = deleteHealthCheck(deleteHealthCheckRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteHealthCheckRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * 
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results
     * at the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name. </li>
     * <li>If both Name and Type are specified, this means start the results
     * at the first RRSET in the list whose name is greater than or equal to
     * Name and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * 
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any
     * processes making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page
     * of record sets. For subsequent calls, set Name and Type to the
     * NextName and NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there
     * is no consistency of results across calls to ListResourceRecordSets.
     * The only way to get a consistent multi-page snapshot of all RRSETs in
     * a zone is to stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent
     * within a page. If MakeChange calls are taking place concurrently, the
     * result of each one will either be completely visible in your results
     * or not at all. You will not see partial changes, or changes that do
     * not ultimately succeed. (This follows from the fact that MakeChange is
     * atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a
     * call to ChangeResourceRecordSets and receives a successful response,
     * the effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     *
     * @param listResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ListResourceRecordSets operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(final ListResourceRecordSetsRequest listResourceRecordSetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListResourceRecordSetsResult>() {
            public ListResourceRecordSetsResult call() throws Exception {
                return listResourceRecordSets(listResourceRecordSetsRequest);
        }
    });
    }

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * 
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results
     * at the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name. </li>
     * <li>If both Name and Type are specified, this means start the results
     * at the first RRSET in the list whose name is greater than or equal to
     * Name and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * 
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any
     * processes making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page
     * of record sets. For subsequent calls, set Name and Type to the
     * NextName and NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there
     * is no consistency of results across calls to ListResourceRecordSets.
     * The only way to get a consistent multi-page snapshot of all RRSETs in
     * a zone is to stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent
     * within a page. If MakeChange calls are taking place concurrently, the
     * result of each one will either be completely visible in your results
     * or not at all. You will not see partial changes, or changes that do
     * not ultimately succeed. (This follows from the fact that MakeChange is
     * atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a
     * call to ChangeResourceRecordSets and receives a successful response,
     * the effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     *
     * @param listResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ListResourceRecordSets operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(
            final ListResourceRecordSetsRequest listResourceRecordSetsRequest,
            final AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListResourceRecordSetsResult>() {
            public ListResourceRecordSetsResult call() throws Exception {
              ListResourceRecordSetsResult result;
                try {
                result = listResourceRecordSets(listResourceRecordSetsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listResourceRecordSetsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2013-04-01/delegationset/delegation set ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a reusable delegation set only if
     * there are no associated hosted zones. If your reusable delegation set
     * contains associated hosted zones, you must delete them before you can
     * delete your reusable delegation set. If you try to delete a reusable
     * delegation set that contains associated hosted zones, Route 53 will
     * deny your request with a DelegationSetInUse error.
     * </p>
     *
     * @param deleteReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the DeleteReusableDelegationSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(final DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReusableDelegationSetResult>() {
            public DeleteReusableDelegationSetResult call() throws Exception {
                return deleteReusableDelegationSet(deleteReusableDelegationSetRequest);
        }
    });
    }

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2013-04-01/delegationset/delegation set ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a reusable delegation set only if
     * there are no associated hosted zones. If your reusable delegation set
     * contains associated hosted zones, you must delete them before you can
     * delete your reusable delegation set. If you try to delete a reusable
     * delegation set that contains associated hosted zones, Route 53 will
     * deny your request with a DelegationSetInUse error.
     * </p>
     *
     * @param deleteReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the DeleteReusableDelegationSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            final DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest,
            final AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteReusableDelegationSetResult>() {
            public DeleteReusableDelegationSetResult call() throws Exception {
              DeleteReusableDelegationSetResult result;
                try {
                result = deleteReusableDelegationSet(deleteReusableDelegationSetRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteReusableDelegationSetRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource.
     * </p>
     *
     * @param getHealthCheckRequest Container for the necessary parameters to
     *           execute the GetHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckResult> getHealthCheckAsync(final GetHealthCheckRequest getHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckResult>() {
            public GetHealthCheckResult call() throws Exception {
                return getHealthCheck(getHealthCheckRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource.
     * </p>
     *
     * @param getHealthCheckRequest Container for the necessary parameters to
     *           execute the GetHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckResult> getHealthCheckAsync(
            final GetHealthCheckRequest getHealthCheckRequest,
            final AsyncHandler<GetHealthCheckRequest, GetHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckResult>() {
            public GetHealthCheckResult call() throws Exception {
              GetHealthCheckResult result;
                try {
                result = getHealthCheck(getHealthCheckRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getHealthCheckRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code>
     * request to the <code>2013-04-01/delegationset</code> resource. The
     * request body must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element
     * that contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     *
     * @param createReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the CreateReusableDelegationSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(final CreateReusableDelegationSetRequest createReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReusableDelegationSetResult>() {
            public CreateReusableDelegationSetResult call() throws Exception {
                return createReusableDelegationSet(createReusableDelegationSetRequest);
        }
    });
    }

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code>
     * request to the <code>2013-04-01/delegationset</code> resource. The
     * request body must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element
     * that contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     *
     * @param createReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the CreateReusableDelegationSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            final CreateReusableDelegationSetRequest createReusableDelegationSetRequest,
            final AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateReusableDelegationSetResult>() {
            public CreateReusableDelegationSetResult call() throws Exception {
              CreateReusableDelegationSetResult result;
                try {
                result = createReusableDelegationSet(createReusableDelegationSetRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createReusableDelegationSetRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/checkeripranges</code> resource. You can use these IP
     * addresses to configure router and firewall rules to allow health
     * checkers to check the health of your resources.
     * </p>
     *
     * @param getCheckerIpRangesRequest Container for the necessary
     *           parameters to execute the GetCheckerIpRanges operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetCheckerIpRanges service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(final GetCheckerIpRangesRequest getCheckerIpRangesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCheckerIpRangesResult>() {
            public GetCheckerIpRangesResult call() throws Exception {
                return getCheckerIpRanges(getCheckerIpRangesRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/checkeripranges</code> resource. You can use these IP
     * addresses to configure router and firewall rules to allow health
     * checkers to check the health of your resources.
     * </p>
     *
     * @param getCheckerIpRangesRequest Container for the necessary
     *           parameters to execute the GetCheckerIpRanges operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetCheckerIpRanges service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(
            final GetCheckerIpRangesRequest getCheckerIpRangesRequest,
            final AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetCheckerIpRangesResult>() {
            public GetCheckerIpRangesResult call() throws Exception {
              GetCheckerIpRangesResult result;
                try {
                result = getCheckerIpRanges(getCheckerIpRangesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getCheckerIpRangesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/disassociatevpc</code> resource. The request body must include an
     * XML document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response returns the
     * <code>DisassociateVPCFromHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param disassociateVPCFromHostedZoneRequest Container for the
     *           necessary parameters to execute the DisassociateVPCFromHostedZone
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateVPCFromHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(final DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisassociateVPCFromHostedZoneResult>() {
            public DisassociateVPCFromHostedZoneResult call() throws Exception {
                return disassociateVPCFromHostedZone(disassociateVPCFromHostedZoneRequest);
        }
    });
    }

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/disassociatevpc</code> resource. The request body must include an
     * XML document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response returns the
     * <code>DisassociateVPCFromHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param disassociateVPCFromHostedZoneRequest Container for the
     *           necessary parameters to execute the DisassociateVPCFromHostedZone
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateVPCFromHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            final DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest,
            final AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DisassociateVPCFromHostedZoneResult>() {
            public DisassociateVPCFromHostedZoneResult call() throws Exception {
              DisassociateVPCFromHostedZoneResult result;
                try {
                result = disassociateVPCFromHostedZone(disassociateVPCFromHostedZoneRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(disassociateVPCFromHostedZoneRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * If you want to learn why a health check is currently failing or why
     * it failed most recently (if at all), you can get the failure reason
     * for the most recent failure. Send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID/lastfailurereason</code>
     * resource.
     * </p>
     *
     * @param getHealthCheckLastFailureReasonRequest Container for the
     *           necessary parameters to execute the GetHealthCheckLastFailureReason
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckLastFailureReason service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(final GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckLastFailureReasonResult>() {
            public GetHealthCheckLastFailureReasonResult call() throws Exception {
                return getHealthCheckLastFailureReason(getHealthCheckLastFailureReasonRequest);
        }
    });
    }

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why
     * it failed most recently (if at all), you can get the failure reason
     * for the most recent failure. Send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID/lastfailurereason</code>
     * resource.
     * </p>
     *
     * @param getHealthCheckLastFailureReasonRequest Container for the
     *           necessary parameters to execute the GetHealthCheckLastFailureReason
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckLastFailureReason service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            final GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest,
            final AsyncHandler<GetHealthCheckLastFailureReasonRequest, GetHealthCheckLastFailureReasonResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckLastFailureReasonResult>() {
            public GetHealthCheckLastFailureReasonResult call() throws Exception {
              GetHealthCheckLastFailureReasonResult result;
                try {
                result = getHealthCheckLastFailureReason(getHealthCheckLastFailureReasonRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getHealthCheckLastFailureReasonRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the
     * <code>CreateHealthCheckResponse</code> element that contains metadata
     * about the health check.
     * </p>
     *
     * @param createHealthCheckRequest Container for the necessary parameters
     *           to execute the CreateHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHealthCheckResult> createHealthCheckAsync(final CreateHealthCheckRequest createHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHealthCheckResult>() {
            public CreateHealthCheckResult call() throws Exception {
                return createHealthCheck(createHealthCheckRequest);
        }
    });
    }

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the
     * <code>CreateHealthCheckResponse</code> element that contains metadata
     * about the health check.
     * </p>
     *
     * @param createHealthCheckRequest Container for the necessary parameters
     *           to execute the CreateHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHealthCheckResult> createHealthCheckAsync(
            final CreateHealthCheckRequest createHealthCheckRequest,
            final AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHealthCheckResult>() {
            public CreateHealthCheckResult call() throws Exception {
              CreateHealthCheckResult result;
                try {
                result = createHealthCheck(createHealthCheckRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createHealthCheckRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code>
     * request to the <code>2013-04-01/healthcheck</code> resource. The
     * response to this request includes a <code>HealthChecks</code> element
     * with zero, one, or multiple <code>HealthCheck</code> child elements.
     * By default, the list of health checks is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the health check that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHealthChecksRequest Container for the necessary parameters
     *           to execute the ListHealthChecks operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListHealthChecks service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHealthChecksResult> listHealthChecksAsync(final ListHealthChecksRequest listHealthChecksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHealthChecksResult>() {
            public ListHealthChecksResult call() throws Exception {
                return listHealthChecks(listHealthChecksRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code>
     * request to the <code>2013-04-01/healthcheck</code> resource. The
     * response to this request includes a <code>HealthChecks</code> element
     * with zero, one, or multiple <code>HealthCheck</code> child elements.
     * By default, the list of health checks is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the health check that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHealthChecksRequest Container for the necessary parameters
     *           to execute the ListHealthChecks operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHealthChecks service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHealthChecksResult> listHealthChecksAsync(
            final ListHealthChecksRequest listHealthChecksRequest,
            final AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHealthChecksResult>() {
            public ListHealthChecksResult call() throws Exception {
              ListHealthChecksResult result;
                try {
                result = listHealthChecks(listHealthChecksRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listHealthChecksRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a list of supported geo locations, send a
     * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
     * resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element with zero, one, or
     * multiple <code>GeoLocationDetails</code> child elements. The list is
     * sorted by country code, and then subdivision code, followed by
     * continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination
     * of <code>NextContinentCode, NextCountryCode,
     * NextSubdivisionCode</code> will be populated. You can pass these as
     * parameters to <code>StartContinentCode, StartCountryCode,
     * StartSubdivisionCode</code> to control the geo location that the list
     * begins with.
     * </p>
     *
     * @param listGeoLocationsRequest Container for the necessary parameters
     *           to execute the ListGeoLocations operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListGeoLocations service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGeoLocationsResult> listGeoLocationsAsync(final ListGeoLocationsRequest listGeoLocationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListGeoLocationsResult>() {
            public ListGeoLocationsResult call() throws Exception {
                return listGeoLocations(listGeoLocationsRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a
     * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
     * resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element with zero, one, or
     * multiple <code>GeoLocationDetails</code> child elements. The list is
     * sorted by country code, and then subdivision code, followed by
     * continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination
     * of <code>NextContinentCode, NextCountryCode,
     * NextSubdivisionCode</code> will be populated. You can pass these as
     * parameters to <code>StartContinentCode, StartCountryCode,
     * StartSubdivisionCode</code> to control the geo location that the list
     * begins with.
     * </p>
     *
     * @param listGeoLocationsRequest Container for the necessary parameters
     *           to execute the ListGeoLocations operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListGeoLocations service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGeoLocationsResult> listGeoLocationsAsync(
            final ListGeoLocationsRequest listGeoLocationsRequest,
            final AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListGeoLocationsResult>() {
            public ListGeoLocationsResult call() throws Exception {
              ListGeoLocationsResult result;
                try {
                result = listGeoLocations(listGeoLocationsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listGeoLocationsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a count of all your health checks, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/healthcheckcount</code> resource.
     * </p>
     *
     * @param getHealthCheckCountRequest Container for the necessary
     *           parameters to execute the GetHealthCheckCount operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckCount service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckCountResult> getHealthCheckCountAsync(final GetHealthCheckCountRequest getHealthCheckCountRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckCountResult>() {
            public GetHealthCheckCountResult call() throws Exception {
                return getHealthCheckCount(getHealthCheckCountRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a count of all your health checks, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/healthcheckcount</code> resource.
     * </p>
     *
     * @param getHealthCheckCountRequest Container for the necessary
     *           parameters to execute the GetHealthCheckCount operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckCount service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckCountResult> getHealthCheckCountAsync(
            final GetHealthCheckCountRequest getHealthCheckCountRequest,
            final AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckCountResult>() {
            public GetHealthCheckCountResult call() throws Exception {
              GetHealthCheckCountResult result;
                try {
                result = getHealthCheckCount(getHealthCheckCountRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getHealthCheckCountRequest, result);
                 return result;
        }
    });
    }
    
    /**
     *
     * @param changeTagsForResourceRequest Container for the necessary
     *           parameters to execute the ChangeTagsForResource operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(final ChangeTagsForResourceRequest changeTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ChangeTagsForResourceResult>() {
            public ChangeTagsForResourceResult call() throws Exception {
                return changeTagsForResource(changeTagsForResourceRequest);
        }
    });
    }

    /**
     *
     * @param changeTagsForResourceRequest Container for the necessary
     *           parameters to execute the ChangeTagsForResource operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(
            final ChangeTagsForResourceRequest changeTagsForResourceRequest,
            final AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ChangeTagsForResourceResult>() {
            public ChangeTagsForResourceResult call() throws Exception {
              ChangeTagsForResourceResult result;
                try {
                result = changeTagsForResource(changeTagsForResourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(changeTagsForResourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request
     * to the <code>2013-04-01/healthcheck/health check ID/status</code>
     * resource. You can use this call to get a health check's current
     * status.
     * </p>
     *
     * @param getHealthCheckStatusRequest Container for the necessary
     *           parameters to execute the GetHealthCheckStatus operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckStatus service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(final GetHealthCheckStatusRequest getHealthCheckStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckStatusResult>() {
            public GetHealthCheckStatusResult call() throws Exception {
                return getHealthCheckStatus(getHealthCheckStatusRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request
     * to the <code>2013-04-01/healthcheck/health check ID/status</code>
     * resource. You can use this call to get a health check's current
     * status.
     * </p>
     *
     * @param getHealthCheckStatusRequest Container for the necessary
     *           parameters to execute the GetHealthCheckStatus operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckStatus service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(
            final GetHealthCheckStatusRequest getHealthCheckStatusRequest,
            final AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetHealthCheckStatusResult>() {
            public GetHealthCheckStatusResult call() throws Exception {
              GetHealthCheckStatusResult result;
                try {
                result = getHealthCheckStatus(getHealthCheckStatusRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getHealthCheckStatusRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzone</code> resource. The
     * response to this request includes a <code>HostedZones</code> element
     * with zero, one, or multiple <code>HostedZone</code> child elements. By
     * default, the list of hosted zones is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesRequest Container for the necessary parameters
     *           to execute the ListHostedZones operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListHostedZones service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHostedZonesResult> listHostedZonesAsync(final ListHostedZonesRequest listHostedZonesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHostedZonesResult>() {
            public ListHostedZonesResult call() throws Exception {
                return listHostedZones(listHostedZonesRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzone</code> resource. The
     * response to this request includes a <code>HostedZones</code> element
     * with zero, one, or multiple <code>HostedZone</code> child elements. By
     * default, the list of hosted zones is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesRequest Container for the necessary parameters
     *           to execute the ListHostedZones operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHostedZones service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHostedZonesResult> listHostedZonesAsync(
            final ListHostedZonesRequest listHostedZonesRequest,
            final AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListHostedZonesResult>() {
            public ListHostedZonesResult call() throws Exception {
              ListHostedZonesResult result;
                try {
                result = listHostedZones(listHostedZonesRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listHostedZonesRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code>
     * request to the <code>2013-04-01/delegationset/delegation set ID
     * </code> resource.
     * </p>
     *
     * @param getReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the GetReusableDelegationSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetReusableDelegationSet service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(final GetReusableDelegationSetRequest getReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetReusableDelegationSetResult>() {
            public GetReusableDelegationSetResult call() throws Exception {
                return getReusableDelegationSet(getReusableDelegationSetRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code>
     * request to the <code>2013-04-01/delegationset/delegation set ID
     * </code> resource.
     * </p>
     *
     * @param getReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the GetReusableDelegationSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetReusableDelegationSet service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(
            final GetReusableDelegationSetRequest getReusableDelegationSetRequest,
            final AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetReusableDelegationSetResult>() {
            public GetReusableDelegationSetResult call() throws Exception {
              GetReusableDelegationSetResult result;
                try {
                result = getReusableDelegationSet(getReusableDelegationSetRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(getReusableDelegationSetRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains
     * metadata about the health check.
     * </p>
     *
     * @param updateHealthCheckRequest Container for the necessary parameters
     *           to execute the UpdateHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHealthCheckResult> updateHealthCheckAsync(final UpdateHealthCheckRequest updateHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateHealthCheckResult>() {
            public UpdateHealthCheckResult call() throws Exception {
                return updateHealthCheck(updateHealthCheckRequest);
        }
    });
    }

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains
     * metadata about the health check.
     * </p>
     *
     * @param updateHealthCheckRequest Container for the necessary parameters
     *           to execute the UpdateHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHealthCheckResult> updateHealthCheckAsync(
            final UpdateHealthCheckRequest updateHealthCheckRequest,
            final AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateHealthCheckResult>() {
            public UpdateHealthCheckResult call() throws Exception {
              UpdateHealthCheckResult result;
                try {
                result = updateHealthCheck(updateHealthCheckRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(updateHealthCheckRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"> Deleting a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a hosted zone only if there are no
     * resource record sets other than the default SOA record and NS resource
     * record sets. If your hosted zone contains other resource record sets,
     * you must delete them before you can delete your hosted zone. If you
     * try to delete a hosted zone that contains other resource record sets,
     * Route 53 will deny your request with a HostedZoneNotEmpty error. For
     * information about deleting records from your hosted zone, see
     * ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHostedZoneRequest Container for the necessary parameters
     *           to execute the DeleteHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHostedZoneResult> deleteHostedZoneAsync(final DeleteHostedZoneRequest deleteHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHostedZoneResult>() {
            public DeleteHostedZoneResult call() throws Exception {
                return deleteHostedZone(deleteHostedZoneRequest);
        }
    });
    }

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"> Deleting a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a hosted zone only if there are no
     * resource record sets other than the default SOA record and NS resource
     * record sets. If your hosted zone contains other resource record sets,
     * you must delete them before you can delete your hosted zone. If you
     * try to delete a hosted zone that contains other resource record sets,
     * Route 53 will deny your request with a HostedZoneNotEmpty error. For
     * information about deleting records from your hosted zone, see
     * ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHostedZoneRequest Container for the necessary parameters
     *           to execute the DeleteHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHostedZoneResult> deleteHostedZoneAsync(
            final DeleteHostedZoneRequest deleteHostedZoneRequest,
            final AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteHostedZoneResult>() {
            public DeleteHostedZoneResult call() throws Exception {
              DeleteHostedZoneResult result;
                try {
                result = deleteHostedZone(deleteHostedZoneRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(deleteHostedZoneRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/associatevpc</code> resource. The request body must include an XML
     * document with a <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response returns the
     * <code>AssociateVPCWithHostedZoneResponse</code> element that contains
     * <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param associateVPCWithHostedZoneRequest Container for the necessary
     *           parameters to execute the AssociateVPCWithHostedZone operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateVPCWithHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(final AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateVPCWithHostedZoneResult>() {
            public AssociateVPCWithHostedZoneResult call() throws Exception {
                return associateVPCWithHostedZone(associateVPCWithHostedZoneRequest);
        }
    });
    }

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/associatevpc</code> resource. The request body must include an XML
     * document with a <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response returns the
     * <code>AssociateVPCWithHostedZoneResponse</code> element that contains
     * <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param associateVPCWithHostedZoneRequest Container for the necessary
     *           parameters to execute the AssociateVPCWithHostedZone operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateVPCWithHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(
            final AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest,
            final AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AssociateVPCWithHostedZoneResult>() {
            public AssociateVPCWithHostedZoneResult call() throws Exception {
              AssociateVPCWithHostedZoneResult result;
                try {
                result = associateVPCWithHostedZone(associateVPCWithHostedZoneRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(associateVPCWithHostedZoneRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2013-04-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the
     * <code>CreateHostedZoneResponse</code> element that contains metadata
     * about the hosted zone.
     * </p>
     * <p>
     * Route 53 automatically creates a default SOA record and four NS
     * records for the zone. The NS records in the hosted zone are the name
     * servers you give your registrar to delegate your domain to. For more
     * information about SOA and NS records, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"> NS and SOA Records that Route 53 Creates for a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code> .
     * This means that it is not yet available on all DNS servers. The status
     * of the zone changes to <code>INSYNC</code> when the NS and SOA records
     * are available on all Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set,
     * you could specify an optional DelegationSetId, and Route53 would
     * assign those 4 NS records for the zone, instead of alloting a new one.
     * </p>
     *
     * @param createHostedZoneRequest Container for the necessary parameters
     *           to execute the CreateHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHostedZoneResult> createHostedZoneAsync(final CreateHostedZoneRequest createHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHostedZoneResult>() {
            public CreateHostedZoneResult call() throws Exception {
                return createHostedZone(createHostedZoneRequest);
        }
    });
    }

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2013-04-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the
     * <code>CreateHostedZoneResponse</code> element that contains metadata
     * about the hosted zone.
     * </p>
     * <p>
     * Route 53 automatically creates a default SOA record and four NS
     * records for the zone. The NS records in the hosted zone are the name
     * servers you give your registrar to delegate your domain to. For more
     * information about SOA and NS records, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"> NS and SOA Records that Route 53 Creates for a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code> .
     * This means that it is not yet available on all DNS servers. The status
     * of the zone changes to <code>INSYNC</code> when the NS and SOA records
     * are available on all Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set,
     * you could specify an optional DelegationSetId, and Route53 would
     * assign those 4 NS records for the zone, instead of alloting a new one.
     * </p>
     *
     * @param createHostedZoneRequest Container for the necessary parameters
     *           to execute the CreateHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHostedZoneResult> createHostedZoneAsync(
            final CreateHostedZoneRequest createHostedZoneRequest,
            final AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateHostedZoneResult>() {
            public CreateHostedZoneResult call() throws Exception {
              CreateHostedZoneResult result;
                try {
                result = createHostedZone(createHostedZoneRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(createHostedZoneRequest, result);
                 return result;
        }
    });
    }
    
    /**
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest listTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
                return listTagsForResource(listTagsForResourceRequest);
        }
    });
    }

    /**
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(
            final ListTagsForResourceRequest listTagsForResourceRequest,
            final AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTagsForResourceResult>() {
            public ListTagsForResourceResult call() throws Exception {
              ListTagsForResourceResult result;
                try {
                result = listTagsForResource(listTagsForResourceRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listTagsForResourceRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2013-04-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the
     * length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the delegation set that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listReusableDelegationSetsRequest Container for the necessary
     *           parameters to execute the ListReusableDelegationSets operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListReusableDelegationSets service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(final ListReusableDelegationSetsRequest listReusableDelegationSetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListReusableDelegationSetsResult>() {
            public ListReusableDelegationSetsResult call() throws Exception {
                return listReusableDelegationSets(listReusableDelegationSetsRequest);
        }
    });
    }

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2013-04-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the
     * length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the delegation set that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listReusableDelegationSetsRequest Container for the necessary
     *           parameters to execute the ListReusableDelegationSets operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListReusableDelegationSets service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            final ListReusableDelegationSetsRequest listReusableDelegationSetsRequest,
            final AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListReusableDelegationSetsResult>() {
            public ListReusableDelegationSetsResult call() throws Exception {
              ListReusableDelegationSetsResult result;
                try {
                result = listReusableDelegationSets(listReusableDelegationSetsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(listReusableDelegationSetsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Use this action to create or change your authoritative DNS
     * information. To use this action, send a <code>POST</code> request to
     * the <code>2013-04-01/hostedzone/hosted Zone ID/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional.
     * For more information on transactional changes, also known as change
     * batches, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/RRSchanges.html#RRSchanges_API"> Creating, Changing, and Deleting Resource Record Sets Using the Route 53 API </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Due to the nature of transactional changes, you
     * cannot delete the same resource record set more than once in a single
     * change batch. If you attempt to delete the same change batch more than
     * once, Route 53 returns an InvalidChangeBatch error.
     * </p>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your
     * DNS data is changed on all Route 53 DNS servers. Initially, the status
     * of a change is <code>PENDING</code> . This means the change has not
     * yet propagated to all the authoritative Route 53 DNS servers. When the
     * change is propagated to all hosts, the change returns a status of
     * <code>INSYNC</code> .
     * </p>
     * <p>
     * Note the following limitations on a
     * <code>ChangeResourceRecordSets</code> request:
     * </p>
     * <p>
     * - A request cannot contain more than 100 Change elements.
     * </p>
     * <p>
     * - A request cannot contain more than 1000 ResourceRecord elements.
     * </p>
     * <p>
     * The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000
     * characters.
     * </p>
     *
     * @param changeResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ChangeResourceRecordSets operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(final ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ChangeResourceRecordSetsResult>() {
            public ChangeResourceRecordSetsResult call() throws Exception {
                return changeResourceRecordSets(changeResourceRecordSetsRequest);
        }
    });
    }

    /**
     * <p>
     * Use this action to create or change your authoritative DNS
     * information. To use this action, send a <code>POST</code> request to
     * the <code>2013-04-01/hostedzone/hosted Zone ID/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional.
     * For more information on transactional changes, also known as change
     * batches, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/RRSchanges.html#RRSchanges_API"> Creating, Changing, and Deleting Resource Record Sets Using the Route 53 API </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Due to the nature of transactional changes, you
     * cannot delete the same resource record set more than once in a single
     * change batch. If you attempt to delete the same change batch more than
     * once, Route 53 returns an InvalidChangeBatch error.
     * </p>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your
     * DNS data is changed on all Route 53 DNS servers. Initially, the status
     * of a change is <code>PENDING</code> . This means the change has not
     * yet propagated to all the authoritative Route 53 DNS servers. When the
     * change is propagated to all hosts, the change returns a status of
     * <code>INSYNC</code> .
     * </p>
     * <p>
     * Note the following limitations on a
     * <code>ChangeResourceRecordSets</code> request:
     * </p>
     * <p>
     * - A request cannot contain more than 100 Change elements.
     * </p>
     * <p>
     * - A request cannot contain more than 1000 ResourceRecord elements.
     * </p>
     * <p>
     * The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000
     * characters.
     * </p>
     *
     * @param changeResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ChangeResourceRecordSets operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(
            final ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest,
            final AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ChangeResourceRecordSetsResult>() {
            public ChangeResourceRecordSetsResult call() throws Exception {
              ChangeResourceRecordSetsResult result;
                try {
                result = changeResourceRecordSets(changeResourceRecordSetsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(changeResourceRecordSetsRequest, result);
                 return result;
        }
    });
    }
    
}
        
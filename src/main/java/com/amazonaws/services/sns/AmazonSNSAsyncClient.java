/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns;

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

import com.amazonaws.services.sns.model.*;


/**
 * Asynchronous client for accessing AmazonSNS.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Simple Notification Service <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested subscribers over multiple delivery protocols. For more information about this
 * product see <a href="http://aws.amazon.com/sns/"> http://aws.amazon.com/sns </a> . For detailed information about Amazon SNS features and their
 * associated API calls, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/"> Amazon SNS Developer Guide </a> .
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain functionality that automatically
 * takes care of tasks such as: cryptographically signing your service requests, retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/"> Tools for Amazon Web Services </a> .
 * </p>
 */
public class AmazonSNSAsyncClient extends AmazonSNSClient
        implements AmazonSNSAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS.  A credentials provider chain will be used
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
    public AmazonSNSAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS.  A credentials provider chain will be used
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
     *                       client connects to AmazonSNS
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSNSAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials.
     * Default client settings will be used, and a default cached thread pool will be
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
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
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
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials,
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
    public AmazonSNSAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials provider.
     * Default client settings will be used, and a default cached thread pool will be
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials provider
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSNS using the specified AWS account credentials
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
    public AmazonSNSAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * call getExecutorService().shutdown() prior to calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
            
    /**
     * <p>
     * The <code>ConfirmSubscription</code> action verifies an endpoint
     * owner's intent to receive messages by validating the token sent to the
     * endpoint by an earlier <code>Subscribe</code> action. If the token is
     * valid, the action creates a new subscription and returns its Amazon
     * Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     *
     * @param confirmSubscriptionRequest Container for the necessary
     *           parameters to execute the ConfirmSubscription operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(final ConfirmSubscriptionRequest confirmSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmSubscriptionResult>() {
            public ConfirmSubscriptionResult call() throws Exception {
                return confirmSubscription(confirmSubscriptionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>ConfirmSubscription</code> action verifies an endpoint
     * owner's intent to receive messages by validating the token sent to the
     * endpoint by an earlier <code>Subscribe</code> action. If the token is
     * valid, the action creates a new subscription and returns its Amazon
     * Resource Name (ARN). This call requires an AWS signature only when the
     * <code>AuthenticateOnUnsubscribe</code> flag is set to "true".
     * </p>
     *
     * @param confirmSubscriptionRequest Container for the necessary
     *           parameters to execute the ConfirmSubscription operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmSubscription service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            final ConfirmSubscriptionRequest confirmSubscriptionRequest,
            final AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ConfirmSubscriptionResult>() {
            public ConfirmSubscriptionResult call() throws Exception {
            	ConfirmSubscriptionResult result;
                try {
            		result = confirmSubscription(confirmSubscriptionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(confirmSubscriptionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>CreatePlatformApplication</code> action creates a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM, to which devices and mobile apps may
     * register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code>
     * action. The PlatformPrincipal is received from the notification
     * service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL
     * certificate". For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is "private key". For GCM, PlatformCredential is
     * "API key". For ADM, PlatformCredential is "client secret". The
     * PlatformApplicationArn that is returned when using
     * <code>CreatePlatformApplication</code> is then used as an attribute
     * for the <code>CreatePlatformEndpoint</code> action. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformApplicationRequest Container for the necessary
     *           parameters to execute the CreatePlatformApplication operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePlatformApplication service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(final CreatePlatformApplicationRequest createPlatformApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformApplicationResult>() {
            public CreatePlatformApplicationResult call() throws Exception {
                return createPlatformApplication(createPlatformApplicationRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>CreatePlatformApplication</code> action creates a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM, to which devices and mobile apps may
     * register. You must specify PlatformPrincipal and PlatformCredential
     * attributes when using the <code>CreatePlatformApplication</code>
     * action. The PlatformPrincipal is received from the notification
     * service. For APNS/APNS_SANDBOX, PlatformPrincipal is "SSL
     * certificate". For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id". The PlatformCredential is also
     * received from the notification service. For APNS/APNS_SANDBOX,
     * PlatformCredential is "private key". For GCM, PlatformCredential is
     * "API key". For ADM, PlatformCredential is "client secret". The
     * PlatformApplicationArn that is returned when using
     * <code>CreatePlatformApplication</code> is then used as an attribute
     * for the <code>CreatePlatformEndpoint</code> action. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformApplicationRequest Container for the necessary
     *           parameters to execute the CreatePlatformApplication operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePlatformApplication service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            final CreatePlatformApplicationRequest createPlatformApplicationRequest,
            final AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformApplicationResult>() {
            public CreatePlatformApplicationResult call() throws Exception {
            	CreatePlatformApplicationResult result;
                try {
            		result = createPlatformApplication(createPlatformApplicationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createPlatformApplicationRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>GetTopicAttributes</code> action returns all of the
     * properties of a topic. Topic properties returned might differ based on
     * the authorization of the user.
     * </p>
     *
     * @param getTopicAttributesRequest Container for the necessary
     *           parameters to execute the GetTopicAttributes operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTopicAttributesResult> getTopicAttributesAsync(final GetTopicAttributesRequest getTopicAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTopicAttributesResult>() {
            public GetTopicAttributesResult call() throws Exception {
                return getTopicAttributes(getTopicAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>GetTopicAttributes</code> action returns all of the
     * properties of a topic. Topic properties returned might differ based on
     * the authorization of the user.
     * </p>
     *
     * @param getTopicAttributesRequest Container for the necessary
     *           parameters to execute the GetTopicAttributes operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTopicAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTopicAttributesResult> getTopicAttributesAsync(
            final GetTopicAttributesRequest getTopicAttributesRequest,
            final AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetTopicAttributesResult>() {
            public GetTopicAttributesResult call() throws Exception {
            	GetTopicAttributesResult result;
                try {
            		result = getTopicAttributes(getTopicAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getTopicAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>Subscribe</code> action prepares to subscribe an endpoint by
     * sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the
     * <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     *
     * @param subscribeRequest Container for the necessary parameters to
     *           execute the Subscribe operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         Subscribe service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubscribeResult> subscribeAsync(final SubscribeRequest subscribeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubscribeResult>() {
            public SubscribeResult call() throws Exception {
                return subscribe(subscribeRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>Subscribe</code> action prepares to subscribe an endpoint by
     * sending the endpoint a confirmation message. To actually create a
     * subscription, the endpoint owner must call the
     * <code>ConfirmSubscription</code> action with the token from the
     * confirmation message. Confirmation tokens are valid for three days.
     * </p>
     *
     * @param subscribeRequest Container for the necessary parameters to
     *           execute the Subscribe operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         Subscribe service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SubscribeResult> subscribeAsync(
            final SubscribeRequest subscribeRequest,
            final AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SubscribeResult>() {
            public SubscribeResult call() throws Exception {
            	SubscribeResult result;
                try {
            		result = subscribe(subscribeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(subscribeRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>DeleteEndpoint</code> action, which is idempotent, deletes
     * the endpoint from SNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deleteEndpointRequest Container for the necessary parameters to
     *           execute the DeleteEndpoint operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteEndpointAsync(final DeleteEndpointRequest deleteEndpointRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteEndpoint(deleteEndpointRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>DeleteEndpoint</code> action, which is idempotent, deletes
     * the endpoint from SNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deleteEndpointRequest Container for the necessary parameters to
     *           execute the DeleteEndpoint operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEndpoint service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteEndpointAsync(
            final DeleteEndpointRequest deleteEndpointRequest,
            final AsyncHandler<DeleteEndpointRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteEndpoint(deleteEndpointRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteEndpointRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>SetTopicAttributes</code> action allows a topic owner to set
     * an attribute of the topic to a new value.
     * </p>
     *
     * @param setTopicAttributesRequest Container for the necessary
     *           parameters to execute the SetTopicAttributes operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTopicAttributesAsync(final SetTopicAttributesRequest setTopicAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setTopicAttributes(setTopicAttributesRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>SetTopicAttributes</code> action allows a topic owner to set
     * an attribute of the topic to a new value.
     * </p>
     *
     * @param setTopicAttributesRequest Container for the necessary
     *           parameters to execute the SetTopicAttributes operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTopicAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTopicAttributesAsync(
            final SetTopicAttributesRequest setTopicAttributesRequest,
            final AsyncHandler<SetTopicAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setTopicAttributes(setTopicAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setTopicAttributesRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>RemovePermission</code> action removes a statement from a
     * topic's access control policy.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(final RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                removePermission(removePermissionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>RemovePermission</code> action removes a statement from a
     * topic's access control policy.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(
            final RemovePermissionRequest removePermissionRequest,
            final AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		removePermission(removePermissionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(removePermissionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>GetEndpointAttributes</code> retrieves the endpoint
     * attributes for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getEndpointAttributesRequest Container for the necessary
     *           parameters to execute the GetEndpointAttributes operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         GetEndpointAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEndpointAttributesResult> getEndpointAttributesAsync(final GetEndpointAttributesRequest getEndpointAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEndpointAttributesResult>() {
            public GetEndpointAttributesResult call() throws Exception {
                return getEndpointAttributes(getEndpointAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>GetEndpointAttributes</code> retrieves the endpoint
     * attributes for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getEndpointAttributesRequest Container for the necessary
     *           parameters to execute the GetEndpointAttributes operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEndpointAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            final GetEndpointAttributesRequest getEndpointAttributesRequest,
            final AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetEndpointAttributesResult>() {
            public GetEndpointAttributesResult call() throws Exception {
            	GetEndpointAttributesResult result;
                try {
            		result = getEndpointAttributes(getEndpointAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getEndpointAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
     * </p>
     *
     * @param listSubscriptionsRequest Container for the necessary parameters
     *           to execute the ListSubscriptions operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsResult> listSubscriptionsAsync(final ListSubscriptionsRequest listSubscriptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsResult>() {
            public ListSubscriptionsResult call() throws Exception {
                return listSubscriptions(listSubscriptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>ListSubscriptions</code> action returns a list of the
     * requester's subscriptions. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptions</code> call to get further results.
     * </p>
     *
     * @param listSubscriptionsRequest Container for the necessary parameters
     *           to execute the ListSubscriptions operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListSubscriptions service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsResult> listSubscriptionsAsync(
            final ListSubscriptionsRequest listSubscriptionsRequest,
            final AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsResult>() {
            public ListSubscriptionsResult call() throws Exception {
            	ListSubscriptionsResult result;
                try {
            		result = listSubscriptions(listSubscriptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listSubscriptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>CreatePlatformEndpoint</code> creates an endpoint for a
     * device and mobile app on one of the supported push notification
     * services, such as GCM and APNS. <code>CreatePlatformEndpoint</code>
     * requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code> . The EndpointArn that is
     * returned when using <code>CreatePlatformEndpoint</code> can then be
     * used by the <code>Publish</code> action to send a message to a mobile
     * app or by the <code>Subscribe</code> action for subscription to a
     * topic. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformEndpointRequest Container for the necessary
     *           parameters to execute the CreatePlatformEndpoint operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePlatformEndpoint service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(final CreatePlatformEndpointRequest createPlatformEndpointRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformEndpointResult>() {
            public CreatePlatformEndpointResult call() throws Exception {
                return createPlatformEndpoint(createPlatformEndpointRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>CreatePlatformEndpoint</code> creates an endpoint for a
     * device and mobile app on one of the supported push notification
     * services, such as GCM and APNS. <code>CreatePlatformEndpoint</code>
     * requires the PlatformApplicationArn that is returned from
     * <code>CreatePlatformApplication</code> . The EndpointArn that is
     * returned when using <code>CreatePlatformEndpoint</code> can then be
     * used by the <code>Publish</code> action to send a message to a mobile
     * app or by the <code>Subscribe</code> action for subscription to a
     * topic. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param createPlatformEndpointRequest Container for the necessary
     *           parameters to execute the CreatePlatformEndpoint operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePlatformEndpoint service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            final CreatePlatformEndpointRequest createPlatformEndpointRequest,
            final AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreatePlatformEndpointResult>() {
            public CreatePlatformEndpointResult call() throws Exception {
            	CreatePlatformEndpointResult result;
                try {
            		result = createPlatformEndpoint(createPlatformEndpointRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createPlatformEndpointRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>SetSubscriptionAttributes</code> action allows a
     * subscription owner to set an attribute of the topic to a new value.
     * </p>
     *
     * @param setSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the SetSubscriptionAttributes operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setSubscriptionAttributesAsync(final SetSubscriptionAttributesRequest setSubscriptionAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setSubscriptionAttributes(setSubscriptionAttributesRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>SetSubscriptionAttributes</code> action allows a
     * subscription owner to set an attribute of the topic to a new value.
     * </p>
     *
     * @param setSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the SetSubscriptionAttributes operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetSubscriptionAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setSubscriptionAttributesAsync(
            final SetSubscriptionAttributesRequest setSubscriptionAttributesRequest,
            final AsyncHandler<SetSubscriptionAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setSubscriptionAttributes(setSubscriptionAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setSubscriptionAttributesRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>CreateTopic</code> action creates a topic to which
     * notifications can be published. Users can create at most 100 topics.
     * For more information, see <a href="http://aws.amazon.com/sns/">
     * http://aws.amazon.com/sns </a> . This action is idempotent, so if the
     * requester already owns a topic with the specified name, that topic's
     * ARN is returned without creating a new topic.
     * </p>
     *
     * @param createTopicRequest Container for the necessary parameters to
     *           execute the CreateTopic operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTopic service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTopicResult> createTopicAsync(final CreateTopicRequest createTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTopicResult>() {
            public CreateTopicResult call() throws Exception {
                return createTopic(createTopicRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>CreateTopic</code> action creates a topic to which
     * notifications can be published. Users can create at most 100 topics.
     * For more information, see <a href="http://aws.amazon.com/sns/">
     * http://aws.amazon.com/sns </a> . This action is idempotent, so if the
     * requester already owns a topic with the specified name, that topic's
     * ARN is returned without creating a new topic.
     * </p>
     *
     * @param createTopicRequest Container for the necessary parameters to
     *           execute the CreateTopic operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTopic service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTopicResult> createTopicAsync(
            final CreateTopicRequest createTopicRequest,
            final AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateTopicResult>() {
            public CreateTopicResult call() throws Exception {
            	CreateTopicResult result;
                try {
            		result = createTopic(createTopicRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createTopicRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>GetSubscriptionAttribtues</code> action returns all of the
     * properties of a subscription.
     * </p>
     *
     * @param getSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the GetSubscriptionAttributes operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(final GetSubscriptionAttributesRequest getSubscriptionAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSubscriptionAttributesResult>() {
            public GetSubscriptionAttributesResult call() throws Exception {
                return getSubscriptionAttributes(getSubscriptionAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>GetSubscriptionAttribtues</code> action returns all of the
     * properties of a subscription.
     * </p>
     *
     * @param getSubscriptionAttributesRequest Container for the necessary
     *           parameters to execute the GetSubscriptionAttributes operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSubscriptionAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            final GetSubscriptionAttributesRequest getSubscriptionAttributesRequest,
            final AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSubscriptionAttributesResult>() {
            public GetSubscriptionAttributesResult call() throws Exception {
            	GetSubscriptionAttributesResult result;
                try {
            		result = getSubscriptionAttributes(getSubscriptionAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getSubscriptionAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
     * </p>
     *
     * @param listTopicsRequest Container for the necessary parameters to
     *           execute the ListTopics operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListTopics service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTopicsResult> listTopicsAsync(final ListTopicsRequest listTopicsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsResult>() {
            public ListTopicsResult call() throws Exception {
                return listTopics(listTopicsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>ListTopics</code> action returns a list of the requester's
     * topics. Each call returns a limited list of topics, up to 100. If
     * there are more topics, a <code>NextToken</code> is also returned. Use
     * the <code>NextToken</code> parameter in a new <code>ListTopics</code>
     * call to get further results.
     * </p>
     *
     * @param listTopicsRequest Container for the necessary parameters to
     *           execute the ListTopics operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTopics service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTopicsResult> listTopicsAsync(
            final ListTopicsRequest listTopicsRequest,
            final AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListTopicsResult>() {
            public ListTopicsResult call() throws Exception {
            	ListTopicsResult result;
                try {
            		result = listTopics(listTopicsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listTopicsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>DeletePlatformApplication</code> action deletes a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deletePlatformApplicationRequest Container for the necessary
     *           parameters to execute the DeletePlatformApplication operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePlatformApplication service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePlatformApplicationAsync(final DeletePlatformApplicationRequest deletePlatformApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deletePlatformApplication(deletePlatformApplicationRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>DeletePlatformApplication</code> action deletes a platform
     * application object for one of the supported push notification
     * services, such as APNS and GCM. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param deletePlatformApplicationRequest Container for the necessary
     *           parameters to execute the DeletePlatformApplication operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePlatformApplication service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePlatformApplicationAsync(
            final DeletePlatformApplicationRequest deletePlatformApplicationRequest,
            final AsyncHandler<DeletePlatformApplicationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deletePlatformApplication(deletePlatformApplicationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deletePlatformApplicationRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>ListPlatformApplications</code> action lists the platform
     * application objects for the supported push notification services, such
     * as APNS and GCM. The results for <code>ListPlatformApplications</code>
     * are paginated and return a limited list of applications, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string
     * received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listPlatformApplicationsRequest Container for the necessary
     *           parameters to execute the ListPlatformApplications operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListPlatformApplications service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(final ListPlatformApplicationsRequest listPlatformApplicationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPlatformApplicationsResult>() {
            public ListPlatformApplicationsResult call() throws Exception {
                return listPlatformApplications(listPlatformApplicationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>ListPlatformApplications</code> action lists the platform
     * application objects for the supported push notification services, such
     * as APNS and GCM. The results for <code>ListPlatformApplications</code>
     * are paginated and return a limited list of applications, up to 100. If
     * additional records are available after the first page results, then a
     * NextToken string will be returned. To receive the next page, you call
     * <code>ListPlatformApplications</code> using the NextToken string
     * received from the previous call. When there are no more records to
     * return, NextToken will be null. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listPlatformApplicationsRequest Container for the necessary
     *           parameters to execute the ListPlatformApplications operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListPlatformApplications service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            final ListPlatformApplicationsRequest listPlatformApplicationsRequest,
            final AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListPlatformApplicationsResult>() {
            public ListPlatformApplicationsResult call() throws Exception {
            	ListPlatformApplicationsResult result;
                try {
            		result = listPlatformApplications(listPlatformApplicationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listPlatformApplicationsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>SetEndpointAttributes</code> action sets the attributes for
     * an endpoint for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setEndpointAttributesRequest Container for the necessary
     *           parameters to execute the SetEndpointAttributes operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         SetEndpointAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setEndpointAttributesAsync(final SetEndpointAttributesRequest setEndpointAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setEndpointAttributes(setEndpointAttributesRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>SetEndpointAttributes</code> action sets the attributes for
     * an endpoint for a device on one of the supported push notification
     * services, such as GCM and APNS. For more information, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setEndpointAttributesRequest Container for the necessary
     *           parameters to execute the SetEndpointAttributes operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetEndpointAttributes service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setEndpointAttributesAsync(
            final SetEndpointAttributesRequest setEndpointAttributesRequest,
            final AsyncHandler<SetEndpointAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setEndpointAttributes(setEndpointAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setEndpointAttributesRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>Unsubscribe</code> action deletes a subscription. If the
     * subscription requires authentication for deletion, only the owner of
     * the subscription or the topic's owner can unsubscribe, and an AWS
     * signature is required. If the <code>Unsubscribe</code> call does not
     * require authentication and the requester is not the subscription
     * owner, a final cancellation message is delivered to the endpoint, so
     * that the endpoint owner can easily resubscribe to the topic if the
     * <code>Unsubscribe</code> request was unintended.
     * </p>
     *
     * @param unsubscribeRequest Container for the necessary parameters to
     *           execute the Unsubscribe operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         Unsubscribe service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unsubscribeAsync(final UnsubscribeRequest unsubscribeRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                unsubscribe(unsubscribeRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>Unsubscribe</code> action deletes a subscription. If the
     * subscription requires authentication for deletion, only the owner of
     * the subscription or the topic's owner can unsubscribe, and an AWS
     * signature is required. If the <code>Unsubscribe</code> call does not
     * require authentication and the requester is not the subscription
     * owner, a final cancellation message is delivered to the endpoint, so
     * that the endpoint owner can easily resubscribe to the topic if the
     * <code>Unsubscribe</code> request was unintended.
     * </p>
     *
     * @param unsubscribeRequest Container for the necessary parameters to
     *           execute the Unsubscribe operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         Unsubscribe service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unsubscribeAsync(
            final UnsubscribeRequest unsubscribeRequest,
            final AsyncHandler<UnsubscribeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		unsubscribe(unsubscribeRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(unsubscribeRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>DeleteTopic</code> action deletes a topic and all its
     * subscriptions. Deleting a topic might prevent some messages previously
     * sent to the topic from being delivered to subscribers. This action is
     * idempotent, so deleting a topic that does not exist does not result in
     * an error.
     * </p>
     *
     * @param deleteTopicRequest Container for the necessary parameters to
     *           execute the DeleteTopic operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTopic service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTopicAsync(final DeleteTopicRequest deleteTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteTopic(deleteTopicRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>DeleteTopic</code> action deletes a topic and all its
     * subscriptions. Deleting a topic might prevent some messages previously
     * sent to the topic from being delivered to subscribers. This action is
     * idempotent, so deleting a topic that does not exist does not result in
     * an error.
     * </p>
     *
     * @param deleteTopicRequest Container for the necessary parameters to
     *           execute the DeleteTopic operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTopic service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTopicAsync(
            final DeleteTopicRequest deleteTopicRequest,
            final AsyncHandler<DeleteTopicRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteTopic(deleteTopicRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteTopicRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>GetPlatformApplicationAttributes</code> action retrieves the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the GetPlatformApplicationAttributes
     *           operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(final GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPlatformApplicationAttributesResult>() {
            public GetPlatformApplicationAttributesResult call() throws Exception {
                return getPlatformApplicationAttributes(getPlatformApplicationAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>GetPlatformApplicationAttributes</code> action retrieves the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param getPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the GetPlatformApplicationAttributes
     *           operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetPlatformApplicationAttributes service method, as returned by
     *         AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            final GetPlatformApplicationAttributesRequest getPlatformApplicationAttributesRequest,
            final AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetPlatformApplicationAttributesResult>() {
            public GetPlatformApplicationAttributesResult call() throws Exception {
            	GetPlatformApplicationAttributesResult result;
                try {
            		result = getPlatformApplicationAttributes(getPlatformApplicationAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getPlatformApplicationAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>SetPlatformApplicationAttributes</code> action sets the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the SetPlatformApplicationAttributes
     *           operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         SetPlatformApplicationAttributes service method, as returned by
     *         AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPlatformApplicationAttributesAsync(final SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                setPlatformApplicationAttributes(setPlatformApplicationAttributesRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>SetPlatformApplicationAttributes</code> action sets the
     * attributes of the platform application object for the supported push
     * notification services, such as APNS and GCM. For more information, see
     * <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param setPlatformApplicationAttributesRequest Container for the
     *           necessary parameters to execute the SetPlatformApplicationAttributes
     *           operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetPlatformApplicationAttributes service method, as returned by
     *         AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPlatformApplicationAttributesAsync(
            final SetPlatformApplicationAttributesRequest setPlatformApplicationAttributesRequest,
            final AsyncHandler<SetPlatformApplicationAttributesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		setPlatformApplicationAttributes(setPlatformApplicationAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setPlatformApplicationAttributesRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>AddPermission</code> action adds a statement to a topic's
     * access control policy, granting access for the specified AWS accounts
     * to the specified actions.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(final AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                addPermission(addPermissionRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * The <code>AddPermission</code> action adds a statement to a topic's
     * access control policy, granting access for the specified AWS accounts
     * to the specified actions.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> addPermissionAsync(
            final AddPermissionRequest addPermissionRequest,
            final AsyncHandler<AddPermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		addPermission(addPermissionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addPermissionRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>ListEndpointsByPlatformApplication</code> action lists the
     * endpoints and endpoint attributes for devices in a supported push
     * notification service, such as GCM and APNS. The results for
     * <code>ListEndpointsByPlatformApplication</code> are paginated and
     * return a limited list of endpoints, up to 100. If additional records
     * are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the
     * NextToken string received from the previous call. When there are no
     * more records to return, NextToken will be null. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listEndpointsByPlatformApplicationRequest Container for the
     *           necessary parameters to execute the ListEndpointsByPlatformApplication
     *           operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(final ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEndpointsByPlatformApplicationResult>() {
            public ListEndpointsByPlatformApplicationResult call() throws Exception {
                return listEndpointsByPlatformApplication(listEndpointsByPlatformApplicationRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>ListEndpointsByPlatformApplication</code> action lists the
     * endpoints and endpoint attributes for devices in a supported push
     * notification service, such as GCM and APNS. The results for
     * <code>ListEndpointsByPlatformApplication</code> are paginated and
     * return a limited list of endpoints, up to 100. If additional records
     * are available after the first page results, then a NextToken string
     * will be returned. To receive the next page, you call
     * <code>ListEndpointsByPlatformApplication</code> again using the
     * NextToken string received from the previous call. When there are no
     * more records to return, NextToken will be null. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">
     * Using Amazon SNS Mobile Push Notifications </a> .
     * </p>
     *
     * @param listEndpointsByPlatformApplicationRequest Container for the
     *           necessary parameters to execute the ListEndpointsByPlatformApplication
     *           operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListEndpointsByPlatformApplication service method, as returned by
     *         AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            final ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest,
            final AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListEndpointsByPlatformApplicationResult>() {
            public ListEndpointsByPlatformApplicationResult call() throws Exception {
            	ListEndpointsByPlatformApplicationResult result;
                try {
            		result = listEndpointsByPlatformApplication(listEndpointsByPlatformApplicationRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listEndpointsByPlatformApplicationRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>ListSubscriptionsByTopic</code> action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     *
     * @param listSubscriptionsByTopicRequest Container for the necessary
     *           parameters to execute the ListSubscriptionsByTopic operation on
     *           AmazonSNS.
     * 
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(final ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsByTopicResult>() {
            public ListSubscriptionsByTopicResult call() throws Exception {
                return listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>ListSubscriptionsByTopic</code> action returns a list of the
     * subscriptions to a specific topic. Each call returns a limited list of
     * subscriptions, up to 100. If there are more subscriptions, a
     * <code>NextToken</code> is also returned. Use the
     * <code>NextToken</code> parameter in a new
     * <code>ListSubscriptionsByTopic</code> call to get further results.
     * </p>
     *
     * @param listSubscriptionsByTopicRequest Container for the necessary
     *           parameters to execute the ListSubscriptionsByTopic operation on
     *           AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListSubscriptionsByTopic service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            final ListSubscriptionsByTopicRequest listSubscriptionsByTopicRequest,
            final AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListSubscriptionsByTopicResult>() {
            public ListSubscriptionsByTopicResult call() throws Exception {
            	ListSubscriptionsByTopicResult result;
                try {
            		result = listSubscriptionsByTopic(listSubscriptionsByTopicRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listSubscriptionsByTopicRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * The <code>Publish</code> action sends a message to all of a topic's
     * subscribed endpoints. When a <code>messageId</code> is returned, the
     * message has been saved and Amazon SNS will attempt to deliver it to
     * the topic's subscribers shortly. The format of the outgoing message to
     * each subscribed endpoint depends on the notification protocol
     * selected.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone,
     * you must specify the EndpointArn. The EndpointArn is returned when
     * making a call with the <code>CreatePlatformEndpoint</code> action. The
     * second example below shows a request and response for publishing to a
     * mobile endpoint.
     * </p>
     *
     * @param publishRequest Container for the necessary parameters to
     *           execute the Publish operation on AmazonSNS.
     * 
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PublishResult> publishAsync(final PublishRequest publishRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishResult>() {
            public PublishResult call() throws Exception {
                return publish(publishRequest);
		    }
		});
    }

    
    /**
     * <p>
     * The <code>Publish</code> action sends a message to all of a topic's
     * subscribed endpoints. When a <code>messageId</code> is returned, the
     * message has been saved and Amazon SNS will attempt to deliver it to
     * the topic's subscribers shortly. The format of the outgoing message to
     * each subscribed endpoint depends on the notification protocol
     * selected.
     * </p>
     * <p>
     * To use the <code>Publish</code> action for sending a message to a
     * mobile endpoint, such as an app on a Kindle device or mobile phone,
     * you must specify the EndpointArn. The EndpointArn is returned when
     * making a call with the <code>CreatePlatformEndpoint</code> action. The
     * second example below shows a request and response for publishing to a
     * mobile endpoint.
     * </p>
     *
     * @param publishRequest Container for the necessary parameters to
     *           execute the Publish operation on AmazonSNS.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Publish
     *         service method, as returned by AmazonSNS.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSNS indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PublishResult> publishAsync(
            final PublishRequest publishRequest,
            final AsyncHandler<PublishRequest, PublishResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<PublishResult>() {
            public PublishResult call() throws Exception {
            	PublishResult result;
                try {
            		result = publish(publishRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(publishRequest, result);
               	return result;
		    }
		});
    }
    
}
        
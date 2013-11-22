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
package com.amazonaws.services.simpleemail;

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

import com.amazonaws.services.simpleemail.model.*;


/**
 * Asynchronous client for accessing AmazonSimpleEmailService.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon Simple Email Service <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon SES). This documentation is intended to be used in conjunction with the Amazon SES
 * Getting Started Guide and the Amazon SES Developer Guide.
 * </p>
 * <p>
 * For specific details on how to construct a service request, please consult the <a href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
 * Amazon SES Developer Guide </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>The endpoint for Amazon SES is located at: https://email.us-east-1.amazonaws.com
 * </p>
 */
public class AmazonSimpleEmailServiceAsyncClient extends AmazonSimpleEmailServiceClient
        implements AmazonSimpleEmailServiceAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService.  A credentials provider chain will be used
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
    public AmazonSimpleEmailServiceAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService.  A credentials provider chain will be used
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
     *                       client connects to AmazonSimpleEmailService
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonSimpleEmailServiceAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials.
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials,
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials provider.
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials provider
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonSimpleEmailService using the specified AWS account credentials
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
    public AmazonSimpleEmailServiceAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Deletes the specified identity (email address or domain) from the list
     * of verified identities.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIdentityResult> deleteIdentityAsync(final DeleteIdentityRequest deleteIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIdentityResult>() {
            public DeleteIdentityResult call() throws Exception {
                return deleteIdentity(deleteIdentityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified identity (email address or domain) from the list
     * of verified identities.
     * </p>
     *
     * @param deleteIdentityRequest Container for the necessary parameters to
     *           execute the DeleteIdentity operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIdentityResult> deleteIdentityAsync(
            final DeleteIdentityRequest deleteIdentityRequest,
            final AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIdentityResult>() {
            public DeleteIdentityResult call() throws Exception {
            	DeleteIdentityResult result;
                try {
            		result = deleteIdentity(deleteIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteIdentityRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     *
     * @param listVerifiedEmailAddressesRequest Container for the necessary
     *           parameters to execute the ListVerifiedEmailAddresses operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(final ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVerifiedEmailAddressesResult>() {
            public ListVerifiedEmailAddressesResult call() throws Exception {
                return listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list containing all of the email addresses that have been
     * verified.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The ListVerifiedEmailAddresses action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * ListIdentities action is now preferred.
     * </p>
     *
     * @param listVerifiedEmailAddressesRequest Container for the necessary
     *           parameters to execute the ListVerifiedEmailAddresses operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVerifiedEmailAddresses service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            final ListVerifiedEmailAddressesRequest listVerifiedEmailAddressesRequest,
            final AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListVerifiedEmailAddressesResult>() {
            public ListVerifiedEmailAddressesResult call() throws Exception {
            	ListVerifiedEmailAddressesResult result;
                try {
            		result = listVerifiedEmailAddresses(listVerifiedEmailAddressesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listVerifiedEmailAddressesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     *
     * @param getSendStatisticsRequest Container for the necessary parameters
     *           to execute the GetSendStatistics operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendStatisticsResult> getSendStatisticsAsync(final GetSendStatisticsRequest getSendStatisticsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSendStatisticsResult>() {
            public GetSendStatisticsResult call() throws Exception {
                return getSendStatistics(getSendStatisticsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the user's sending statistics. The result is a list of data
     * points, representing the last two weeks of sending activity.
     * </p>
     * <p>
     * Each data point in the list contains statistics for a 15-minute
     * interval.
     * </p>
     *
     * @param getSendStatisticsRequest Container for the necessary parameters
     *           to execute the GetSendStatistics operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendStatistics service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendStatisticsResult> getSendStatisticsAsync(
            final GetSendStatisticsRequest getSendStatisticsRequest,
            final AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSendStatisticsResult>() {
            public GetSendStatisticsResult call() throws Exception {
            	GetSendStatisticsResult result;
                try {
            		result = getSendStatistics(getSendStatisticsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getSendStatisticsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     *
     * @param verifyEmailIdentityRequest Container for the necessary
     *           parameters to execute the VerifyEmailIdentity operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(final VerifyEmailIdentityRequest verifyEmailIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyEmailIdentityResult>() {
            public VerifyEmailIdentityResult call() throws Exception {
                return verifyEmailIdentity(verifyEmailIdentityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     *
     * @param verifyEmailIdentityRequest Container for the necessary
     *           parameters to execute the VerifyEmailIdentity operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            final VerifyEmailIdentityRequest verifyEmailIdentityRequest,
            final AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyEmailIdentityResult>() {
            public VerifyEmailIdentityResult call() throws Exception {
            	VerifyEmailIdentityResult result;
                try {
            		result = verifyEmailIdentity(verifyEmailIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(verifyEmailIdentityRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes. For
     * more information about feedback notification, see the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param getIdentityNotificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityNotificationAttributes
     *           operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(final GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityNotificationAttributesResult>() {
            public GetIdentityNotificationAttributesResult call() throws Exception {
                return getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Given a list of verified identities (email addresses and/or domains),
     * returns a structure describing identity notification attributes. For
     * more information about feedback notification, see the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param getIdentityNotificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityNotificationAttributes
     *           operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityNotificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            final GetIdentityNotificationAttributesRequest getIdentityNotificationAttributesRequest,
            final AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityNotificationAttributesResult>() {
            public GetIdentityNotificationAttributesResult call() throws Exception {
            	GetIdentityNotificationAttributesResult result;
                try {
            		result = getIdentityNotificationAttributes(getIdentityNotificationAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getIdentityNotificationAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a set of DNS records, or <i>tokens</i> , that must be
     * published in the domain name's DNS to complete the DKIM verification
     * process. These tokens are DNS <code>CNAME</code> records that point to
     * DKIM public keys hosted by Amazon SES. To complete the DKIM
     * verification process, these tokens must be published in the domain's
     * DNS. The tokens must remain published in order for Easy DKIM signing
     * to function correctly.
     * </p>
     * <p>
     * After the tokens are added to the domain's DNS, Amazon SES will be
     * able to DKIM-sign email originating from that domain. To enable or
     * disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about Easy DKIM, go to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param verifyDomainDkimRequest Container for the necessary parameters
     *           to execute the VerifyDomainDkim operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainDkimResult> verifyDomainDkimAsync(final VerifyDomainDkimRequest verifyDomainDkimRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainDkimResult>() {
            public VerifyDomainDkimResult call() throws Exception {
                return verifyDomainDkim(verifyDomainDkimRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a set of DNS records, or <i>tokens</i> , that must be
     * published in the domain name's DNS to complete the DKIM verification
     * process. These tokens are DNS <code>CNAME</code> records that point to
     * DKIM public keys hosted by Amazon SES. To complete the DKIM
     * verification process, these tokens must be published in the domain's
     * DNS. The tokens must remain published in order for Easy DKIM signing
     * to function correctly.
     * </p>
     * <p>
     * After the tokens are added to the domain's DNS, Amazon SES will be
     * able to DKIM-sign email originating from that domain. To enable or
     * disable Easy DKIM signing for a domain, use the
     * <code>SetIdentityDkimEnabled</code> action.
     * </p>
     * <p>
     * For more information about Easy DKIM, go to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param verifyDomainDkimRequest Container for the necessary parameters
     *           to execute the VerifyDomainDkim operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainDkim service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            final VerifyDomainDkimRequest verifyDomainDkimRequest,
            final AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainDkimResult>() {
            public VerifyDomainDkimResult call() throws Exception {
            	VerifyDomainDkimResult result;
                try {
            		result = verifyDomainDkim(verifyDomainDkimRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(verifyDomainDkimRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the DNS records, or <i>tokens</i> , that must be present in
     * order for Easy DKIM to sign outgoing email messages.
     * </p>
     * <p>
     * This action takes a list of verified identities as input. It then
     * returns the following information for each identity:
     * </p>
     * 
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>The set of tokens that are required for Easy DKIM signing. These
     * tokens must be published in the domain name's DNS records in order for
     * DKIM verification to complete, and must remain published in order for
     * Easy DKIM signing to operate correctly. (This information is only
     * returned for domain name identities, not for email addresses.)</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain name's DNS. (This information is only returned
     * for domain name identities, not for email addresses.)</li>
     * 
     * </ul>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param getIdentityDkimAttributesRequest Container for the necessary
     *           parameters to execute the GetIdentityDkimAttributes operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(final GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityDkimAttributesResult>() {
            public GetIdentityDkimAttributesResult call() throws Exception {
                return getIdentityDkimAttributes(getIdentityDkimAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the DNS records, or <i>tokens</i> , that must be present in
     * order for Easy DKIM to sign outgoing email messages.
     * </p>
     * <p>
     * This action takes a list of verified identities as input. It then
     * returns the following information for each identity:
     * </p>
     * 
     * <ul>
     * <li>Whether Easy DKIM signing is enabled or disabled.</li>
     * <li>The set of tokens that are required for Easy DKIM signing. These
     * tokens must be published in the domain name's DNS records in order for
     * DKIM verification to complete, and must remain published in order for
     * Easy DKIM signing to operate correctly. (This information is only
     * returned for domain name identities, not for email addresses.)</li>
     * <li>Whether Amazon SES has successfully verified the DKIM tokens
     * published in the domain name's DNS. (This information is only returned
     * for domain name identities, not for email addresses.)</li>
     * 
     * </ul>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param getIdentityDkimAttributesRequest Container for the necessary
     *           parameters to execute the GetIdentityDkimAttributes operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityDkimAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            final GetIdentityDkimAttributesRequest getIdentityDkimAttributesRequest,
            final AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityDkimAttributesResult>() {
            public GetIdentityDkimAttributesResult call() throws Exception {
            	GetIdentityDkimAttributesResult result;
                try {
            		result = getIdentityDkimAttributes(getIdentityDkimAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getIdentityDkimAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The VerifyEmailIdentity
     * action is now preferred.
     * </p>
     *
     * @param verifyEmailAddressRequest Container for the necessary
     *           parameters to execute the VerifyEmailAddress operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> verifyEmailAddressAsync(final VerifyEmailAddressRequest verifyEmailAddressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                verifyEmailAddress(verifyEmailAddressRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The VerifyEmailAddress action is deprecated as of the
     * May 15, 2012 release of Domain Verification. The VerifyEmailIdentity
     * action is now preferred.
     * </p>
     *
     * @param verifyEmailAddressRequest Container for the necessary
     *           parameters to execute the VerifyEmailAddress operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> verifyEmailAddressAsync(
            final VerifyEmailAddressRequest verifyEmailAddressRequest,
            final AsyncHandler<VerifyEmailAddressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		verifyEmailAddress(verifyEmailAddressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(verifyEmailAddressRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses and domains. For more information, go to the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message:
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.
     * </p>
     * <p>
     * For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your <i>sending quota</i> - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the "Managing Your Sending
     * Activity" section of the<a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendRawEmailResult> sendRawEmailAsync(final SendRawEmailRequest sendRawEmailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendRawEmailResult>() {
            public SendRawEmailResult call() throws Exception {
                return sendRawEmail(sendRawEmailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails. The raw text of the message must comply with
     * Internet email standards; otherwise, the message cannot be sent.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses and domains. For more information, go to the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * The total size of the message cannot exceed 10 MB. This includes any
     * attachments that are part of the message.
     * </p>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message:
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.
     * </p>
     * <p>
     * For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your <i>sending quota</i> - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the "Managing Your Sending
     * Activity" section of the<a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendRawEmailResult> sendRawEmailAsync(
            final SendRawEmailRequest sendRawEmailRequest,
            final AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendRawEmailResult>() {
            public SendRawEmailResult call() throws Exception {
            	SendRawEmailResult result;
                try {
            		result = sendRawEmail(sendRawEmailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(sendRawEmailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(final ListIdentitiesRequest listIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentitiesResult>() {
            public ListIdentitiesResult call() throws Exception {
                return listIdentities(listIdentitiesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns a list containing all of the identities (email addresses and
     * domains) for a specific AWS Account, regardless of verification
     * status.
     * </p>
     *
     * @param listIdentitiesRequest Container for the necessary parameters to
     *           execute the ListIdentities operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListIdentities service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListIdentitiesResult> listIdentitiesAsync(
            final ListIdentitiesRequest listIdentitiesRequest,
            final AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ListIdentitiesResult>() {
            public ListIdentitiesResult call() throws Exception {
            	ListIdentitiesResult result;
                try {
            		result = listIdentities(listIdentitiesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(listIdentitiesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
     * </p>
     *
     * @param getIdentityVerificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityVerificationAttributes
     *           operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(final GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityVerificationAttributesResult>() {
            public GetIdentityVerificationAttributesResult call() throws Exception {
                return getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Given a list of identities (email addresses and/or domains), returns
     * the verification status and (for domain identities) the verification
     * token for each identity.
     * </p>
     *
     * @param getIdentityVerificationAttributesRequest Container for the
     *           necessary parameters to execute the GetIdentityVerificationAttributes
     *           operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetIdentityVerificationAttributes service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            final GetIdentityVerificationAttributesRequest getIdentityVerificationAttributesRequest,
            final AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetIdentityVerificationAttributesResult>() {
            public GetIdentityVerificationAttributesResult call() throws Exception {
            	GetIdentityVerificationAttributesResult result;
                try {
            		result = getIdentityVerificationAttributes(getIdentityVerificationAttributesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getIdentityVerificationAttributesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * 
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code> ), then Amazon SES will DKIM-sign all email
     * sent by addresses under that domain name (e.g.,
     * <code>user@example.com</code> ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon
     * SES will DKIM-sign all email sent by that email address.</li>
     * 
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code> ), you can
     * only enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code> ) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param setIdentityDkimEnabledRequest Container for the necessary
     *           parameters to execute the SetIdentityDkimEnabled operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(final SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityDkimEnabledResult>() {
            public SetIdentityDkimEnabledResult call() throws Exception {
                return setIdentityDkimEnabled(setIdentityDkimEnabledRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Enables or disables Easy DKIM signing of email sent from an identity:
     * </p>
     * 
     * <ul>
     * <li>If Easy DKIM signing is enabled for a domain name identity (e.g.,
     * <code>example.com</code> ), then Amazon SES will DKIM-sign all email
     * sent by addresses under that domain name (e.g.,
     * <code>user@example.com</code> ).</li>
     * <li>If Easy DKIM signing is enabled for an email address, then Amazon
     * SES will DKIM-sign all email sent by that email address.</li>
     * 
     * </ul>
     * <p>
     * For email addresses (e.g., <code>user@example.com</code> ), you can
     * only enable Easy DKIM signing if the corresponding domain (e.g.,
     * <code>example.com</code> ) has been set up for Easy DKIM using the AWS
     * Console or the <code>VerifyDomainDkim</code> action.
     * </p>
     * <p>
     * For more information about Easy DKIM signing, go to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param setIdentityDkimEnabledRequest Container for the necessary
     *           parameters to execute the SetIdentityDkimEnabled operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityDkimEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            final SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest,
            final AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityDkimEnabledResult>() {
            public SetIdentityDkimEnabledResult call() throws Exception {
            	SetIdentityDkimEnabledResult result;
                try {
            		result = setIdentityDkimEnabled(setIdentityDkimEnabledRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setIdentityDkimEnabledRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendQuotaResult> getSendQuotaAsync(final GetSendQuotaRequest getSendQuotaRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSendQuotaResult>() {
            public GetSendQuotaResult call() throws Exception {
                return getSendQuota(getSendQuotaRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the user's current sending limits.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetSendQuotaResult> getSendQuotaAsync(
            final GetSendQuotaRequest getSendQuotaRequest,
            final AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<GetSendQuotaResult>() {
            public GetSendQuotaResult call() throws Exception {
            	GetSendQuotaResult result;
                try {
            		result = getSendQuota(getSendQuotaRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(getSendQuotaRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Given an identity (email address or domain), enables or disables
     * whether Amazon SES forwards feedback notifications as email. Feedback
     * forwarding may only be disabled when both complaint and bounce topics
     * are set. For more information about feedback notification, see the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param setIdentityFeedbackForwardingEnabledRequest Container for the
     *           necessary parameters to execute the
     *           SetIdentityFeedbackForwardingEnabled operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(final SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityFeedbackForwardingEnabledResult>() {
            public SetIdentityFeedbackForwardingEnabledResult call() throws Exception {
                return setIdentityFeedbackForwardingEnabled(setIdentityFeedbackForwardingEnabledRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Given an identity (email address or domain), enables or disables
     * whether Amazon SES forwards feedback notifications as email. Feedback
     * forwarding may only be disabled when both complaint and bounce topics
     * are set. For more information about feedback notification, see the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param setIdentityFeedbackForwardingEnabledRequest Container for the
     *           necessary parameters to execute the
     *           SetIdentityFeedbackForwardingEnabled operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityFeedbackForwardingEnabled service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            final SetIdentityFeedbackForwardingEnabledRequest setIdentityFeedbackForwardingEnabledRequest,
            final AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityFeedbackForwardingEnabledResult>() {
            public SetIdentityFeedbackForwardingEnabledResult call() throws Exception {
            	SetIdentityFeedbackForwardingEnabledResult result;
                try {
            		result = setIdentityFeedbackForwardingEnabled(setIdentityFeedbackForwardingEnabledRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setIdentityFeedbackForwardingEnabledRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Verifies a domain.
     * </p>
     *
     * @param verifyDomainIdentityRequest Container for the necessary
     *           parameters to execute the VerifyDomainIdentity operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(final VerifyDomainIdentityRequest verifyDomainIdentityRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainIdentityResult>() {
            public VerifyDomainIdentityResult call() throws Exception {
                return verifyDomainIdentity(verifyDomainIdentityRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Verifies a domain.
     * </p>
     *
     * @param verifyDomainIdentityRequest Container for the necessary
     *           parameters to execute the VerifyDomainIdentity operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         VerifyDomainIdentity service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            final VerifyDomainIdentityRequest verifyDomainIdentityRequest,
            final AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<VerifyDomainIdentityResult>() {
            public VerifyDomainIdentityResult call() throws Exception {
            	VerifyDomainIdentityResult result;
                try {
            		result = verifyDomainIdentity(verifyDomainIdentityRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(verifyDomainIdentityRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses and domains. For more information, go to the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * The total size of the message cannot exceed 10 MB.
     * </p>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message:
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.
     * </p>
     * <p>
     * For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your <i>sending quota</i> - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the "Managing Your Sending
     * Activity" section of the<a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendEmailResult> sendEmailAsync(final SendEmailRequest sendEmailRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendEmailResult>() {
            public SendEmailResult call() throws Exception {
                return sendEmail(sendEmailRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses and domains. For more information, go to the
     * Amazon SES Developer Guide.
     * </p>
     * <p>
     * The total size of the message cannot exceed 10 MB.
     * </p>
     * <p>
     * Amazon SES has a limit on the total number of recipients per message:
     * The combined number of To:, CC: and BCC: email addresses cannot exceed
     * 50. If you need to send an email message to a larger audience, you can
     * divide your recipient list into groups of 50 or fewer, and then call
     * Amazon SES repeatedly to send the message to each group.
     * </p>
     * <p>
     * For every message that you send, the total number of recipients (To:,
     * CC: and BCC:) is counted against your <i>sending quota</i> - the
     * maximum number of emails you can send in a 24-hour period. For
     * information about your sending quota, go to the "Managing Your Sending
     * Activity" section of the<a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail operation on AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SendEmail service method, as returned by AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SendEmailResult> sendEmailAsync(
            final SendEmailRequest sendEmailRequest,
            final AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SendEmailResult>() {
            public SendEmailResult call() throws Exception {
            	SendEmailResult result;
                try {
            		result = sendEmail(sendEmailRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(sendEmailRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     *
     * @param deleteVerifiedEmailAddressRequest Container for the necessary
     *           parameters to execute the DeleteVerifiedEmailAddress operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVerifiedEmailAddressAsync(final DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
                deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest);
                return null;
		    }
		});
    }

    
    /**
     * <p>
     * Deletes the specified email address from the list of verified
     * addresses.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DeleteVerifiedEmailAddress action is deprecated
     * as of the May 15, 2012 release of Domain Verification. The
     * DeleteIdentity action is now preferred.
     * </p>
     *
     * @param deleteVerifiedEmailAddressRequest Container for the necessary
     *           parameters to execute the DeleteVerifiedEmailAddress operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVerifiedEmailAddress service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVerifiedEmailAddressAsync(
            final DeleteVerifiedEmailAddressRequest deleteVerifiedEmailAddressRequest,
            final AsyncHandler<DeleteVerifiedEmailAddressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<Void>() {
            public Void call() throws Exception {
            	try {
            		deleteVerifiedEmailAddress(deleteVerifiedEmailAddressRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteVerifiedEmailAddressRequest, null);
               	return null;
		    }
		});
    }
    
    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon SNS topic
     * to which Amazon SES will publish bounce and complaint notifications
     * for emails sent with that identity as the <code>Source</code> .
     * Publishing to topics may only be disabled when feedback
     * forwarding is enabled. For more information about feedback
     * notification, see the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param setIdentityNotificationTopicRequest Container for the necessary
     *           parameters to execute the SetIdentityNotificationTopic operation on
     *           AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(final SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityNotificationTopicResult>() {
            public SetIdentityNotificationTopicResult call() throws Exception {
                return setIdentityNotificationTopic(setIdentityNotificationTopicRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Given an identity (email address or domain), sets the Amazon SNS topic
     * to which Amazon SES will publish bounce and complaint notifications
     * for emails sent with that identity as the <code>Source</code> .
     * Publishing to topics may only be disabled when feedback
     * forwarding is enabled. For more information about feedback
     * notification, see the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
     * Amazon SES Developer Guide </a> .
     * </p>
     *
     * @param setIdentityNotificationTopicRequest Container for the necessary
     *           parameters to execute the SetIdentityNotificationTopic operation on
     *           AmazonSimpleEmailService.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetIdentityNotificationTopic service method, as returned by
     *         AmazonSimpleEmailService.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleEmailService indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            final SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest,
            final AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SetIdentityNotificationTopicResult>() {
            public SetIdentityNotificationTopicResult call() throws Exception {
            	SetIdentityNotificationTopicResult result;
                try {
            		result = setIdentityNotificationTopic(setIdentityNotificationTopicRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(setIdentityNotificationTopicRequest, result);
               	return result;
		    }
		});
    }
    
}
        
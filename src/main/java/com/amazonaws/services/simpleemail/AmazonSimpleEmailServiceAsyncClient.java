/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import com.amazonaws.services.simpleemail.model.*;


/**
 * Client for accessing AmazonSimpleEmailService.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * Amazon Simple Email Service <p>
 * This is the API Reference for Amazon Simple Email Service (Amazon
 * SES). This documentation is intended to be used in conjunction with
 * the Amazon SES Getting Started Guide and the Amazon SES Developer
 * Guide.
 * </p>
 * <p>
 * For specific details on how to construct a service request, please
 * consult the <a
 * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">
 * Amazon SES Developer Guide </a> .
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
     * Returns the user's current activity limits.
     * </p>
     *
     * @param getSendQuotaRequest Container for the necessary parameters to
     *           execute the GetSendQuota operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         GetSendQuota service method, as returned by AmazonSimpleEmailService.
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
     * Returns a list containing all of the email addresses that have been
     * verified.
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
     * Composes an email message based on input data, and then immediately
     * queues the message for sending.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses. For more information, go to the Amazon SES
     * Developer Guide.
     * </p>
     *
     * @param sendEmailRequest Container for the necessary parameters to
     *           execute the SendEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendEmail service method, as returned by AmazonSimpleEmailService.
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
     * Deletes the specified email address from the list of verified
     * addresses.
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
     * Verifies an email address. This action causes a confirmation email
     * message to be sent to the specified address.
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
     * Sends an email message, with header and content specified by the
     * client. The <code>SendRawEmail</code> action is useful for sending
     * multipart MIME emails, with attachments or inline content. The raw
     * text of the message must comply with Internet email standards;
     * otherwise, the message cannot be sent.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>If you have not yet requested production access to
     * Amazon SES, then you will only be able to send email to and from
     * verified email addresses. For more information, go to the Amazon SES
     * Developer Guide.
     * </p>
     *
     * @param sendRawEmailRequest Container for the necessary parameters to
     *           execute the SendRawEmail operation on AmazonSimpleEmailService.
     * 
     * @return A Java Future object containing the response from the
     *         SendRawEmail service method, as returned by AmazonSimpleEmailService.
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
    
}
        
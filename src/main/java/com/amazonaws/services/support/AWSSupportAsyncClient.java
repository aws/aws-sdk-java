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
package com.amazonaws.services.support;

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

import com.amazonaws.services.support.model.*;


/**
 * Asynchronous client for accessing AWSSupport.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * AWS Support <p>
 * The AWS Support API reference is intended for programmers who need detailed information about the AWS Support actions and data types. This service
 * enables you to manage your AWS Support cases programmatically. It uses HTTP methods that return results in JSON format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of <a href="https://aws.amazon.com/support/trustedadvisor"> Trusted Advisor </a> features. You can
 * retrieve a list of checks you can run on your resources, specify checks to run and refresh, and check the status of checks you have submitted.
 * </p>
 * <p>
 * The following list describes the AWS Support case management actions:
 * </p>
 * 
 * <ul>
 * <li> <b>Service names, issue categories, and available severity levels. </b> The actions <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> and <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"> DescribeSeverityLevels </a> enable you to obtain
 * AWS service names, service codes, service categories, and problem severity levels. You use these values when you call the <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"> CreateCase </a> action. </li>
 * <li> <b>Case Creation, case details, and case resolution</b> . The actions <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"> CreateCase </a> , <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"> DescribeCases </a> , and <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"> ResolveCase </a> enable you to create AWS Support cases,
 * retrieve them, and resolve them.</li>
 * <li> <b>Case communication</b> . The actions <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCommunications.html">
 * DescribeCommunications </a> and <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html">
 * AddCommunicationToCase </a> enable you to retrieve and add communication to AWS Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the actions available from the AWS Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"> DescribeTrustedAdvisorChecks </a>
 * returns the list of checks that you can run against your AWS resources.</li>
 * <li>Using the CheckId for a specific check returned by DescribeTrustedAdvisorChecks, you can call <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckResult.html"> DescribeTrustedAdvisorCheckResult </a>
 * </li>
 * and obtain a new result for the check you specified. <li> Using <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"> DescribeTrustedAdvisorCheckSummaries
 * </a> , you can get summaries for a set of Trusted Advisor checks.</li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"> RefreshTrustedAdvisorCheck </a>
 * enables you to request that Trusted Advisor run the check again. </li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckRefreshStatuses.html">
 * DescribeTrustedAdvisorCheckRefreshStatuses </a> gets statuses on the checks you are running. </li>
 * 
 * </ul>
 * <p>
 * For authentication of requests, the AWS Support uses <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature
 * Version 4 Signing Process </a> .
 * </p>
 * <p>
 * See the AWS Support <a href="http://docs.aws.amazon.com/awssupport/latest/developerguide/Welcome.html"> Developer Guide </a> for information about
 * how to use this service to manage create and manage your support cases, and how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
public class AWSSupportAsyncClient extends AWSSupportClient
        implements AWSSupportAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport.  A credentials provider chain will be used
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
    public AWSSupportAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport.  A credentials provider chain will be used
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
     *                       client connects to AWSSupport
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSSupportAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials.
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
    public AWSSupportAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials
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
    public AWSSupportAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials,
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
    public AWSSupportAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials provider.
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
    public AWSSupportAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials provider
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
    public AWSSupportAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials
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
    public AWSSupportAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AWSSupport using the specified AWS account credentials
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
    public AWSSupportAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * This action returns a list of cases that you specify by passing one or
     * more CaseIds. In addition, you can filter the cases by date by setting
     * values for the AfterTime and BeforeTime request parameters.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data types. </li>
     * <li>One or more <i>NextToken</i> objects, strings that specifies
     * where to paginate the returned records represented by
     * <i>CaseDetails</i> .</li>
     * </ol>
     *
     * @param describeCasesRequest Container for the necessary parameters to
     *           execute the DescribeCases operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCases service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCasesResult> describeCasesAsync(final DescribeCasesRequest describeCasesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCasesResult>() {
            public DescribeCasesResult call() throws Exception {
                return describeCases(describeCasesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action returns a list of cases that you specify by passing one or
     * more CaseIds. In addition, you can filter the cases by date by setting
     * values for the AfterTime and BeforeTime request parameters.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data types. </li>
     * <li>One or more <i>NextToken</i> objects, strings that specifies
     * where to paginate the returned records represented by
     * <i>CaseDetails</i> .</li>
     * </ol>
     *
     * @param describeCasesRequest Container for the necessary parameters to
     *           execute the DescribeCases operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCases service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCasesResult> describeCasesAsync(
            final DescribeCasesRequest describeCasesRequest,
            final AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCasesResult>() {
            public DescribeCasesResult call() throws Exception {
            	DescribeCasesResult result;
                try {
            		result = describeCases(describeCasesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeCasesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the status of all refresh requests Trusted Advisor checks
     * called using <a
     * m/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html">
     * RefreshTrustedAdvisorCheck </a> .
     * </p>
     *
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest Container for
     *           the necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckRefreshStatuses operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckRefreshStatuses service method, as returned
     *         by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(final DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorCheckRefreshStatusesResult>() {
            public DescribeTrustedAdvisorCheckRefreshStatusesResult call() throws Exception {
                return describeTrustedAdvisorCheckRefreshStatuses(describeTrustedAdvisorCheckRefreshStatusesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the status of all refresh requests Trusted Advisor checks
     * called using <a
     * m/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html">
     * RefreshTrustedAdvisorCheck </a> .
     * </p>
     *
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest Container for
     *           the necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckRefreshStatuses operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckRefreshStatuses service method, as returned
     *         by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            final DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest,
            final AsyncHandler<DescribeTrustedAdvisorCheckRefreshStatusesRequest, DescribeTrustedAdvisorCheckRefreshStatusesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorCheckRefreshStatusesResult>() {
            public DescribeTrustedAdvisorCheckRefreshStatusesResult call() throws Exception {
            	DescribeTrustedAdvisorCheckRefreshStatusesResult result;
                try {
            		result = describeTrustedAdvisorCheckRefreshStatuses(describeTrustedAdvisorCheckRefreshStatusesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTrustedAdvisorCheckRefreshStatusesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action returns the list of severity levels that you can assign to
     * an AWS Support case. The severity level for a case is also a field in
     * the <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data type included in any <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request.
     * </p>
     *
     * @param describeSeverityLevelsRequest Container for the necessary
     *           parameters to execute the DescribeSeverityLevels operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSeverityLevels service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(final DescribeSeverityLevelsRequest describeSeverityLevelsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSeverityLevelsResult>() {
            public DescribeSeverityLevelsResult call() throws Exception {
                return describeSeverityLevels(describeSeverityLevelsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action returns the list of severity levels that you can assign to
     * an AWS Support case. The severity level for a case is also a field in
     * the <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data type included in any <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request.
     * </p>
     *
     * @param describeSeverityLevelsRequest Container for the necessary
     *           parameters to execute the DescribeSeverityLevels operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSeverityLevels service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            final DescribeSeverityLevelsRequest describeSeverityLevelsRequest,
            final AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSeverityLevelsResult>() {
            public DescribeSeverityLevelsResult call() throws Exception {
            	DescribeSeverityLevelsResult result;
                try {
            		result = describeSeverityLevels(describeSeverityLevelsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeSeverityLevelsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action returns communications regarding the support case. You can
     * use the <i>AfterTime</i> and <i>BeforeTime</i> parameters to filter by
     * date. The <i>CaseId</i> parameter enables you to identify a specific
     * case by its <i>CaseId</i> number.
     * </p>
     * <p>
     * The <i>MaxResults</i> and <i>NextToken</i> parameters enable you to
     * control the pagination of the result set. Set <i>MaxResults</i> to the
     * number of cases you want displayed on each page, and use
     * <i>NextToken</i> to specify the resumption of pagination.
     * </p>
     *
     * @param describeCommunicationsRequest Container for the necessary
     *           parameters to execute the DescribeCommunications operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommunications service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommunicationsResult> describeCommunicationsAsync(final DescribeCommunicationsRequest describeCommunicationsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCommunicationsResult>() {
            public DescribeCommunicationsResult call() throws Exception {
                return describeCommunications(describeCommunicationsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action returns communications regarding the support case. You can
     * use the <i>AfterTime</i> and <i>BeforeTime</i> parameters to filter by
     * date. The <i>CaseId</i> parameter enables you to identify a specific
     * case by its <i>CaseId</i> number.
     * </p>
     * <p>
     * The <i>MaxResults</i> and <i>NextToken</i> parameters enable you to
     * control the pagination of the result set. Set <i>MaxResults</i> to the
     * number of cases you want displayed on each page, and use
     * <i>NextToken</i> to specify the resumption of pagination.
     * </p>
     *
     * @param describeCommunicationsRequest Container for the necessary
     *           parameters to execute the DescribeCommunications operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommunications service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommunicationsResult> describeCommunicationsAsync(
            final DescribeCommunicationsRequest describeCommunicationsRequest,
            final AsyncHandler<DescribeCommunicationsRequest, DescribeCommunicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeCommunicationsResult>() {
            public DescribeCommunicationsResult call() throws Exception {
            	DescribeCommunicationsResult result;
                try {
            		result = describeCommunications(describeCommunicationsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeCommunicationsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action adds additional customer communication to an AWS Support
     * case. You use the <i>CaseId</i> value to identify the case to which
     * you want to add communication. You can list a set of email addresses
     * to copy on the communication using the <i>CcEmailAddresses</i> value.
     * The <i>CommunicationBody</i> value contains the text of the
     * communication.
     * </p>
     * <p>
     * This action's response indicates the success or failure of the
     * request.
     * </p>
     * <p>
     * This action implements a subset of the behavior on the AWS Support <a
     * href="https://aws.amazon.com/support"> Your Support Cases </a> web
     * form.
     * </p>
     *
     * @param addCommunicationToCaseRequest Container for the necessary
     *           parameters to execute the AddCommunicationToCase operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         AddCommunicationToCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(final AddCommunicationToCaseRequest addCommunicationToCaseRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddCommunicationToCaseResult>() {
            public AddCommunicationToCaseResult call() throws Exception {
                return addCommunicationToCase(addCommunicationToCaseRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action adds additional customer communication to an AWS Support
     * case. You use the <i>CaseId</i> value to identify the case to which
     * you want to add communication. You can list a set of email addresses
     * to copy on the communication using the <i>CcEmailAddresses</i> value.
     * The <i>CommunicationBody</i> value contains the text of the
     * communication.
     * </p>
     * <p>
     * This action's response indicates the success or failure of the
     * request.
     * </p>
     * <p>
     * This action implements a subset of the behavior on the AWS Support <a
     * href="https://aws.amazon.com/support"> Your Support Cases </a> web
     * form.
     * </p>
     *
     * @param addCommunicationToCaseRequest Container for the necessary
     *           parameters to execute the AddCommunicationToCase operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddCommunicationToCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(
            final AddCommunicationToCaseRequest addCommunicationToCaseRequest,
            final AsyncHandler<AddCommunicationToCaseRequest, AddCommunicationToCaseResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<AddCommunicationToCaseResult>() {
            public AddCommunicationToCaseResult call() throws Exception {
            	AddCommunicationToCaseResult result;
                try {
            		result = addCommunicationToCase(addCommunicationToCaseRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(addCommunicationToCaseRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new case in the AWS Support Center. This action is modeled
     * on the behavior of the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>ServiceCode.</b> Represents a code for an AWS service.
     * You obtain the <i>ServiceCode</i> by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . </li>
     * <li> <b>CategoryCode</b> . Represents a category for the service
     * defined for the ServiceCode value. You also obtain the cateogory code
     * for a service by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . Each AWS service defines its own set of
     * category codes. </li>
     * <li> <b>SeverityCode</b> . Represents a value that specifies the
     * urgency of the case, and the time interval in which your service level
     * agreement specifies a response from AWS Support. You obtain the
     * SeverityCode by calling <a
     * n.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html">
     * DescribeSeverityLevels </a> .</li>
     * <li> <b>Subject</b> . Represents the <b>Subject</b> field on the AWS
     * Support Center <a href="https://aws.amazon.com/support/createCase">
     * Open a new case </a> page.</li>
     * <li> <b>CommunicationBody</b> . Represents the <b>Description</b>
     * field on the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>Language</b> . Specifies the human language in which AWS
     * Support handles the case. The API currently supports English and
     * Japanese.</li>
     * <li> <b>CcEmailAddresses</b> . Represents the AWS Support Center
     * <b>CC</b> field on the <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. You can list email addresses to be copied on any correspondence
     * about the case. The account that opens the case is already identified
     * by passing the AWS Credentials in the HTTP POST method or in a method
     * or function call from one of the programming languages supported by an
     * <a href="http://aws.amazon.com/tools/"> AWS SDK </a> . </li>
     * <li> <b>IssueType</b> . Indicates the type of issue for the case. You
     * can specify either "customer-service" or "technical." If you do not
     * indicate a value, this parameter defaults to "technical." </li>
     * </ol> <p>
     * <b>NOTE:</b>The AWS Support API does not currently support the ability
     * to add attachments to cases. You can, however, call
     * AddCommunicationToCase to add information to an open case.
     * </p>
     * <p>
     * A successful <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request returns an AWS Support case number. Case
     * numbers are used by <a
     * aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html">
     * DescribeCases </a> request to retrieve existing AWS Support support
     * cases.
     * </p>
     *
     * @param createCaseRequest Container for the necessary parameters to
     *           execute the CreateCase operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCaseResult> createCaseAsync(final CreateCaseRequest createCaseRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCaseResult>() {
            public CreateCaseResult call() throws Exception {
                return createCase(createCaseRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new case in the AWS Support Center. This action is modeled
     * on the behavior of the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>ServiceCode.</b> Represents a code for an AWS service.
     * You obtain the <i>ServiceCode</i> by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . </li>
     * <li> <b>CategoryCode</b> . Represents a category for the service
     * defined for the ServiceCode value. You also obtain the cateogory code
     * for a service by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . Each AWS service defines its own set of
     * category codes. </li>
     * <li> <b>SeverityCode</b> . Represents a value that specifies the
     * urgency of the case, and the time interval in which your service level
     * agreement specifies a response from AWS Support. You obtain the
     * SeverityCode by calling <a
     * n.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html">
     * DescribeSeverityLevels </a> .</li>
     * <li> <b>Subject</b> . Represents the <b>Subject</b> field on the AWS
     * Support Center <a href="https://aws.amazon.com/support/createCase">
     * Open a new case </a> page.</li>
     * <li> <b>CommunicationBody</b> . Represents the <b>Description</b>
     * field on the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>Language</b> . Specifies the human language in which AWS
     * Support handles the case. The API currently supports English and
     * Japanese.</li>
     * <li> <b>CcEmailAddresses</b> . Represents the AWS Support Center
     * <b>CC</b> field on the <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. You can list email addresses to be copied on any correspondence
     * about the case. The account that opens the case is already identified
     * by passing the AWS Credentials in the HTTP POST method or in a method
     * or function call from one of the programming languages supported by an
     * <a href="http://aws.amazon.com/tools/"> AWS SDK </a> . </li>
     * <li> <b>IssueType</b> . Indicates the type of issue for the case. You
     * can specify either "customer-service" or "technical." If you do not
     * indicate a value, this parameter defaults to "technical." </li>
     * </ol> <p>
     * <b>NOTE:</b>The AWS Support API does not currently support the ability
     * to add attachments to cases. You can, however, call
     * AddCommunicationToCase to add information to an open case.
     * </p>
     * <p>
     * A successful <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request returns an AWS Support case number. Case
     * numbers are used by <a
     * aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html">
     * DescribeCases </a> request to retrieve existing AWS Support support
     * cases.
     * </p>
     *
     * @param createCaseRequest Container for the necessary parameters to
     *           execute the CreateCase operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCaseResult> createCaseAsync(
            final CreateCaseRequest createCaseRequest,
            final AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateCaseResult>() {
            public CreateCaseResult call() throws Exception {
            	CreateCaseResult result;
                try {
            		result = createCase(createCaseRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createCaseRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action enables you to get a list of the available Trusted Advisor
     * checks. You must specify a language code. English ("en") and Japanese
     * ("jp") are currently supported. The response contains a list of <a
     * ssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html">
     * TrustedAdvisorCheckDescription </a> objects.
     * </p>
     *
     * @param describeTrustedAdvisorChecksRequest Container for the necessary
     *           parameters to execute the DescribeTrustedAdvisorChecks operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorChecks service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(final DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorChecksResult>() {
            public DescribeTrustedAdvisorChecksResult call() throws Exception {
                return describeTrustedAdvisorChecks(describeTrustedAdvisorChecksRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action enables you to get a list of the available Trusted Advisor
     * checks. You must specify a language code. English ("en") and Japanese
     * ("jp") are currently supported. The response contains a list of <a
     * ssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html">
     * TrustedAdvisorCheckDescription </a> objects.
     * </p>
     *
     * @param describeTrustedAdvisorChecksRequest Container for the necessary
     *           parameters to execute the DescribeTrustedAdvisorChecks operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorChecks service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(
            final DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest,
            final AsyncHandler<DescribeTrustedAdvisorChecksRequest, DescribeTrustedAdvisorChecksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorChecksResult>() {
            public DescribeTrustedAdvisorChecksResult call() throws Exception {
            	DescribeTrustedAdvisorChecksResult result;
                try {
            		result = describeTrustedAdvisorChecks(describeTrustedAdvisorChecksRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTrustedAdvisorChecksRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action responds with the results of a Trusted Advisor check. Once
     * you have obtained the list of available Trusted Advisor checks by
     * calling <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> , you specify the <i>CheckId</i> for
     * the check you want to retrieve from AWS Support.
     * </p>
     * <p>
     * The response for this action contains a JSON-formatted <a
     * latest/APIReference/API_DescribeTrustedAdvisorCheckResultResult.html">
     * TrustedAdvisorCheckResult </a> object
     * </p>
     * <p>
     * , which is a container for the following three objects:
     * </p>
     * <p>
     * </p>
     * <ol> <li> <a
     * t/latest/APIReference/API_TrustedAdvisorCategorySpecificSummary.html">
     * TrustedAdvisorCategorySpecificSummary </a> </li>
     * <li> <a
     * awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html">
     * TrustedAdvisorResourceDetail </a> </li>
     * <li> <a
     * ssupport/latest/APIReference/API_TrustedAdvisorResourcesSummary.html">
     * TrustedAdvisorResourcesSummary </a> </li>
     * </ol> <p>
     * In addition, the response contains the following fields:
     * </p>
     * <ol> <li> <b>Status</b> . Overall status of the check.</li>
     * <li> <b>Timestamp</b> . Time at which Trusted Advisor last ran the
     * check. </li>
     * <li> <b>CheckId</b> . Unique identifier for the specific check
     * returned by the request.</li>
     * </ol>
     *
     * @param describeTrustedAdvisorCheckResultRequest Container for the
     *           necessary parameters to execute the DescribeTrustedAdvisorCheckResult
     *           operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckResult service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(final DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorCheckResultResult>() {
            public DescribeTrustedAdvisorCheckResultResult call() throws Exception {
                return describeTrustedAdvisorCheckResult(describeTrustedAdvisorCheckResultRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action responds with the results of a Trusted Advisor check. Once
     * you have obtained the list of available Trusted Advisor checks by
     * calling <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> , you specify the <i>CheckId</i> for
     * the check you want to retrieve from AWS Support.
     * </p>
     * <p>
     * The response for this action contains a JSON-formatted <a
     * latest/APIReference/API_DescribeTrustedAdvisorCheckResultResult.html">
     * TrustedAdvisorCheckResult </a> object
     * </p>
     * <p>
     * , which is a container for the following three objects:
     * </p>
     * <p>
     * </p>
     * <ol> <li> <a
     * t/latest/APIReference/API_TrustedAdvisorCategorySpecificSummary.html">
     * TrustedAdvisorCategorySpecificSummary </a> </li>
     * <li> <a
     * awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html">
     * TrustedAdvisorResourceDetail </a> </li>
     * <li> <a
     * ssupport/latest/APIReference/API_TrustedAdvisorResourcesSummary.html">
     * TrustedAdvisorResourcesSummary </a> </li>
     * </ol> <p>
     * In addition, the response contains the following fields:
     * </p>
     * <ol> <li> <b>Status</b> . Overall status of the check.</li>
     * <li> <b>Timestamp</b> . Time at which Trusted Advisor last ran the
     * check. </li>
     * <li> <b>CheckId</b> . Unique identifier for the specific check
     * returned by the request.</li>
     * </ol>
     *
     * @param describeTrustedAdvisorCheckResultRequest Container for the
     *           necessary parameters to execute the DescribeTrustedAdvisorCheckResult
     *           operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckResult service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            final DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest,
            final AsyncHandler<DescribeTrustedAdvisorCheckResultRequest, DescribeTrustedAdvisorCheckResultResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorCheckResultResult>() {
            public DescribeTrustedAdvisorCheckResultResult call() throws Exception {
            	DescribeTrustedAdvisorCheckResultResult result;
                try {
            		result = describeTrustedAdvisorCheckResult(describeTrustedAdvisorCheckResultRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTrustedAdvisorCheckResultRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Takes a <i>CaseId</i> and returns the initial state of the case along
     * with the state of the case after the call to <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html">
     * ResolveCase </a> completed.
     * </p>
     *
     * @param resolveCaseRequest Container for the necessary parameters to
     *           execute the ResolveCase operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         ResolveCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResolveCaseResult> resolveCaseAsync(final ResolveCaseRequest resolveCaseRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResolveCaseResult>() {
            public ResolveCaseResult call() throws Exception {
                return resolveCase(resolveCaseRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Takes a <i>CaseId</i> and returns the initial state of the case along
     * with the state of the case after the call to <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html">
     * ResolveCase </a> completed.
     * </p>
     *
     * @param resolveCaseRequest Container for the necessary parameters to
     *           execute the ResolveCase operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResolveCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResolveCaseResult> resolveCaseAsync(
            final ResolveCaseRequest resolveCaseRequest,
            final AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<ResolveCaseResult>() {
            public ResolveCaseResult call() throws Exception {
            	ResolveCaseResult result;
                try {
            		result = resolveCase(resolveCaseRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(resolveCaseRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action enables you to query the service to request a refresh for
     * a specific Trusted Advisor check. Your request body contains a
     * <i>CheckId</i> for which you are querying. The response body contains
     * a <a
     * upport/latest/APIReference/API_RefreshTrustedAdvisorCheckResult.html">
     * RefreshTrustedAdvisorCheckResult </a> object containing <i>Status</i>
     * and <i>TimeUntilNextRefresh</i> fields.
     * </p>
     *
     * @param refreshTrustedAdvisorCheckRequest Container for the necessary
     *           parameters to execute the RefreshTrustedAdvisorCheck operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         RefreshTrustedAdvisorCheck service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(final RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RefreshTrustedAdvisorCheckResult>() {
            public RefreshTrustedAdvisorCheckResult call() throws Exception {
                return refreshTrustedAdvisorCheck(refreshTrustedAdvisorCheckRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action enables you to query the service to request a refresh for
     * a specific Trusted Advisor check. Your request body contains a
     * <i>CheckId</i> for which you are querying. The response body contains
     * a <a
     * upport/latest/APIReference/API_RefreshTrustedAdvisorCheckResult.html">
     * RefreshTrustedAdvisorCheckResult </a> object containing <i>Status</i>
     * and <i>TimeUntilNextRefresh</i> fields.
     * </p>
     *
     * @param refreshTrustedAdvisorCheckRequest Container for the necessary
     *           parameters to execute the RefreshTrustedAdvisorCheck operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RefreshTrustedAdvisorCheck service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(
            final RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest,
            final AsyncHandler<RefreshTrustedAdvisorCheckRequest, RefreshTrustedAdvisorCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<RefreshTrustedAdvisorCheckResult>() {
            public RefreshTrustedAdvisorCheckResult call() throws Exception {
            	RefreshTrustedAdvisorCheckResult result;
                try {
            		result = refreshTrustedAdvisorCheck(refreshTrustedAdvisorCheckRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(refreshTrustedAdvisorCheckRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServices service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServicesResult> describeServicesAsync(final DescribeServicesRequest describeServicesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServicesResult>() {
            public DescribeServicesResult call() throws Exception {
                return describeServices(describeServicesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServices service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServicesResult> describeServicesAsync(
            final DescribeServicesRequest describeServicesRequest,
            final AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServicesResult>() {
            public DescribeServicesResult call() throws Exception {
            	DescribeServicesResult result;
                try {
            		result = describeServices(describeServicesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeServicesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * This action enables you to get the latest summaries for Trusted
     * Advisor checks that you specify in your request. You submit the list
     * of Trusted Advisor checks for which you want summaries. You obtain
     * these <i>CheckIds</i> by submitting a <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> request.
     * </p>
     * <p>
     * The response body contains an array of <a
     * m/awssupport/latest/APIReference/API_TrustedAdvisorCheckSummary.html">
     * TrustedAdvisorCheckSummary </a> objects.
     * </p>
     *
     * @param describeTrustedAdvisorCheckSummariesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckSummaries operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckSummaries service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(final DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorCheckSummariesResult>() {
            public DescribeTrustedAdvisorCheckSummariesResult call() throws Exception {
                return describeTrustedAdvisorCheckSummaries(describeTrustedAdvisorCheckSummariesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * This action enables you to get the latest summaries for Trusted
     * Advisor checks that you specify in your request. You submit the list
     * of Trusted Advisor checks for which you want summaries. You obtain
     * these <i>CheckIds</i> by submitting a <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> request.
     * </p>
     * <p>
     * The response body contains an array of <a
     * m/awssupport/latest/APIReference/API_TrustedAdvisorCheckSummary.html">
     * TrustedAdvisorCheckSummary </a> objects.
     * </p>
     *
     * @param describeTrustedAdvisorCheckSummariesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckSummaries operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckSummaries service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            final DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest,
            final AsyncHandler<DescribeTrustedAdvisorCheckSummariesRequest, DescribeTrustedAdvisorCheckSummariesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeTrustedAdvisorCheckSummariesResult>() {
            public DescribeTrustedAdvisorCheckSummariesResult call() throws Exception {
            	DescribeTrustedAdvisorCheckSummariesResult result;
                try {
            		result = describeTrustedAdvisorCheckSummaries(describeTrustedAdvisorCheckSummariesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeTrustedAdvisorCheckSummariesRequest, result);
               	return result;
		    }
		});
    }
    
}
        
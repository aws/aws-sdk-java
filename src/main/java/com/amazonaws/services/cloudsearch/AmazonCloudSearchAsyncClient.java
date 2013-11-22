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
package com.amazonaws.services.cloudsearch;

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

import com.amazonaws.services.cloudsearch.model.*;


/**
 * Asynchronous client for accessing AmazonCloudSearch.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * Amazon CloudSearch Configuration Service <p>
 * You use the configuration service to create, configure, and manage search domains. Configuration service requests are submitted using the AWS Query
 * protocol. AWS Query requests are HTTP or HTTPS requests submitted via HTTP GET or POST with a query parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific: cloudsearch. <i>region</i> .amazonaws.com. For example,
 * cloudsearch.us-east-1.amazonaws.com. For a current list of supported regions and endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region"> Regions and Endpoints </a> .
 * </p>
 */
public class AmazonCloudSearchAsyncClient extends AmazonCloudSearchClient
        implements AmazonCloudSearchAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;


    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch.  A credentials provider chain will be used
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
    public AmazonCloudSearchAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudSearch
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudSearchAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials.
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
    public AmazonCloudSearchAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials
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
    public AmazonCloudSearchAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials,
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
    public AmazonCloudSearchAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials provider.
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials provider
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newCachedThreadPool());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials
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
    public AmazonCloudSearchAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Configures the default search field for the search domain. The default
     * search field is the text field that is searched when a search request
     * does not specify which fields to search. By default, it is configured
     * to include the contents of all of the domain's text fields.
     * </p>
     *
     * @param updateDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the UpdateDefaultSearchField operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDefaultSearchField service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDefaultSearchFieldResult> updateDefaultSearchFieldAsync(final UpdateDefaultSearchFieldRequest updateDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDefaultSearchFieldResult>() {
            public UpdateDefaultSearchFieldResult call() throws Exception {
                return updateDefaultSearchField(updateDefaultSearchFieldRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures the default search field for the search domain. The default
     * search field is the text field that is searched when a search request
     * does not specify which fields to search. By default, it is configured
     * to include the contents of all of the domain's text fields.
     * </p>
     *
     * @param updateDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the UpdateDefaultSearchField operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDefaultSearchField service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDefaultSearchFieldResult> updateDefaultSearchFieldAsync(
            final UpdateDefaultSearchFieldRequest updateDefaultSearchFieldRequest,
            final AsyncHandler<UpdateDefaultSearchFieldRequest, UpdateDefaultSearchFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateDefaultSearchFieldResult>() {
            public UpdateDefaultSearchFieldResult call() throws Exception {
            	UpdateDefaultSearchFieldResult result;
                try {
            		result = updateDefaultSearchField(updateDefaultSearchFieldRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateDefaultSearchFieldRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Removes a <code>RankExpression</code> from the search domain.
     * </p>
     *
     * @param deleteRankExpressionRequest Container for the necessary
     *           parameters to execute the DeleteRankExpression operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRankExpression service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRankExpressionResult> deleteRankExpressionAsync(final DeleteRankExpressionRequest deleteRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteRankExpressionResult>() {
            public DeleteRankExpressionResult call() throws Exception {
                return deleteRankExpression(deleteRankExpressionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Removes a <code>RankExpression</code> from the search domain.
     * </p>
     *
     * @param deleteRankExpressionRequest Container for the necessary
     *           parameters to execute the DeleteRankExpression operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRankExpression service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRankExpressionResult> deleteRankExpressionAsync(
            final DeleteRankExpressionRequest deleteRankExpressionRequest,
            final AsyncHandler<DeleteRankExpressionRequest, DeleteRankExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteRankExpressionResult>() {
            public DeleteRankExpressionResult call() throws Exception {
            	DeleteRankExpressionResult result;
                try {
            		result = deleteRankExpression(deleteRankExpressionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteRankExpressionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets the rank expressions configured for the search domain. Can be
     * limited to specific rank expressions by name. Shows all rank
     * expressions by default.
     * </p>
     *
     * @param describeRankExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeRankExpressions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRankExpressions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRankExpressionsResult> describeRankExpressionsAsync(final DescribeRankExpressionsRequest describeRankExpressionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRankExpressionsResult>() {
            public DescribeRankExpressionsResult call() throws Exception {
                return describeRankExpressions(describeRankExpressionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets the rank expressions configured for the search domain. Can be
     * limited to specific rank expressions by name. Shows all rank
     * expressions by default.
     * </p>
     *
     * @param describeRankExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeRankExpressions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRankExpressions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRankExpressionsResult> describeRankExpressionsAsync(
            final DescribeRankExpressionsRequest describeRankExpressionsRequest,
            final AsyncHandler<DescribeRankExpressionsRequest, DescribeRankExpressionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeRankExpressionsResult>() {
            public DescribeRankExpressionsResult call() throws Exception {
            	DescribeRankExpressionsResult result;
                try {
            		result = describeRankExpressions(describeRankExpressionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeRankExpressionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Creates a new search domain.
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(final CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDomainResult>() {
            public CreateDomainResult call() throws Exception {
                return createDomain(createDomainRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Creates a new search domain.
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDomainResult> createDomainAsync(
            final CreateDomainRequest createDomainRequest,
            final AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<CreateDomainResult>() {
            public CreateDomainResult call() throws Exception {
            	CreateDomainResult result;
                try {
            		result = createDomain(createDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(createDomainRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100 KB.
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(final UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateServiceAccessPoliciesResult>() {
            public UpdateServiceAccessPoliciesResult call() throws Exception {
                return updateServiceAccessPolicies(updateServiceAccessPoliciesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100 KB.
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateServiceAccessPoliciesResult> updateServiceAccessPoliciesAsync(
            final UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest,
            final AsyncHandler<UpdateServiceAccessPoliciesRequest, UpdateServiceAccessPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateServiceAccessPoliciesResult>() {
            public UpdateServiceAccessPoliciesResult call() throws Exception {
            	UpdateServiceAccessPoliciesResult result;
                try {
            		result = updateServiceAccessPolicies(updateServiceAccessPoliciesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateServiceAccessPoliciesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Configures an <code>IndexField</code> for the search domain. Used to
     * create new fields and modify existing ones. If the field exists, the
     * new configuration replaces the old one. You can configure a maximum of
     * 200 index fields.
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(final DefineIndexFieldRequest defineIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineIndexFieldResult>() {
            public DefineIndexFieldResult call() throws Exception {
                return defineIndexField(defineIndexFieldRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures an <code>IndexField</code> for the search domain. Used to
     * create new fields and modify existing ones. If the field exists, the
     * new configuration replaces the old one. You can configure a maximum of
     * 200 index fields.
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineIndexField service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineIndexFieldResult> defineIndexFieldAsync(
            final DefineIndexFieldRequest defineIndexFieldRequest,
            final AsyncHandler<DefineIndexFieldRequest, DefineIndexFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineIndexFieldResult>() {
            public DefineIndexFieldResult call() throws Exception {
            	DefineIndexFieldResult result;
                try {
            		result = defineIndexField(defineIndexFieldRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(defineIndexFieldRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Configures a <code>RankExpression</code> for the search domain. Used
     * to create new rank expressions and modify existing ones. If the
     * expression exists, the new configuration replaces the old one. You can
     * configure a maximum of 50 rank expressions.
     * </p>
     *
     * @param defineRankExpressionRequest Container for the necessary
     *           parameters to execute the DefineRankExpression operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DefineRankExpression service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineRankExpressionResult> defineRankExpressionAsync(final DefineRankExpressionRequest defineRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineRankExpressionResult>() {
            public DefineRankExpressionResult call() throws Exception {
                return defineRankExpression(defineRankExpressionRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures a <code>RankExpression</code> for the search domain. Used
     * to create new rank expressions and modify existing ones. If the
     * expression exists, the new configuration replaces the old one. You can
     * configure a maximum of 50 rank expressions.
     * </p>
     *
     * @param defineRankExpressionRequest Container for the necessary
     *           parameters to execute the DefineRankExpression operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DefineRankExpression service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DefineRankExpressionResult> defineRankExpressionAsync(
            final DefineRankExpressionRequest defineRankExpressionRequest,
            final AsyncHandler<DefineRankExpressionRequest, DefineRankExpressionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DefineRankExpressionResult>() {
            public DefineRankExpressionResult call() throws Exception {
            	DefineRankExpressionResult result;
                try {
            		result = defineRankExpression(defineRankExpressionRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(defineRankExpressionRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets the synonym dictionary configured for the search domain.
     * </p>
     *
     * @param describeSynonymOptionsRequest Container for the necessary
     *           parameters to execute the DescribeSynonymOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSynonymOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSynonymOptionsResult> describeSynonymOptionsAsync(final DescribeSynonymOptionsRequest describeSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSynonymOptionsResult>() {
            public DescribeSynonymOptionsResult call() throws Exception {
                return describeSynonymOptions(describeSynonymOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets the synonym dictionary configured for the search domain.
     * </p>
     *
     * @param describeSynonymOptionsRequest Container for the necessary
     *           parameters to execute the DescribeSynonymOptions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSynonymOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSynonymOptionsResult> describeSynonymOptionsAsync(
            final DescribeSynonymOptionsRequest describeSynonymOptionsRequest,
            final AsyncHandler<DescribeSynonymOptionsRequest, DescribeSynonymOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeSynonymOptionsResult>() {
            public DescribeSynonymOptionsResult call() throws Exception {
            	DescribeSynonymOptionsResult result;
                try {
            		result = describeSynonymOptions(describeSynonymOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeSynonymOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets the stopwords configured for the search domain.
     * </p>
     *
     * @param describeStopwordOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStopwordOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStopwordOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStopwordOptionsResult> describeStopwordOptionsAsync(final DescribeStopwordOptionsRequest describeStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStopwordOptionsResult>() {
            public DescribeStopwordOptionsResult call() throws Exception {
                return describeStopwordOptions(describeStopwordOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets the stopwords configured for the search domain.
     * </p>
     *
     * @param describeStopwordOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStopwordOptions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStopwordOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStopwordOptionsResult> describeStopwordOptionsAsync(
            final DescribeStopwordOptionsRequest describeStopwordOptionsRequest,
            final AsyncHandler<DescribeStopwordOptionsRequest, DescribeStopwordOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStopwordOptionsResult>() {
            public DescribeStopwordOptionsResult call() throws Exception {
            	DescribeStopwordOptionsResult result;
                try {
            		result = describeStopwordOptions(describeStopwordOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStopwordOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Permanently deletes a search domain and all of its data.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(final DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDomainResult>() {
            public DeleteDomainResult call() throws Exception {
                return deleteDomain(deleteDomainRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Permanently deletes a search domain and all of its data.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDomainResult> deleteDomainAsync(
            final DeleteDomainRequest deleteDomainRequest,
            final AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteDomainResult>() {
            public DeleteDomainResult call() throws Exception {
            	DeleteDomainResult result;
                try {
            		result = deleteDomain(deleteDomainRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteDomainRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets information about the resource-based policies that control access
     * to the domain's document and search services.
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(final DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceAccessPoliciesResult>() {
            public DescribeServiceAccessPoliciesResult call() throws Exception {
                return describeServiceAccessPolicies(describeServiceAccessPoliciesRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets information about the resource-based policies that control access
     * to the domain's document and search services.
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceAccessPolicies service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceAccessPoliciesResult> describeServiceAccessPoliciesAsync(
            final DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest,
            final AsyncHandler<DescribeServiceAccessPoliciesRequest, DescribeServiceAccessPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeServiceAccessPoliciesResult>() {
            public DescribeServiceAccessPoliciesResult call() throws Exception {
            	DescribeServiceAccessPoliciesResult result;
                try {
            		result = describeServiceAccessPolicies(describeServiceAccessPoliciesRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeServiceAccessPoliciesRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets the default search field configured for the search domain.
     * </p>
     *
     * @param describeDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the DescribeDefaultSearchField operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDefaultSearchField service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDefaultSearchFieldResult> describeDefaultSearchFieldAsync(final DescribeDefaultSearchFieldRequest describeDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDefaultSearchFieldResult>() {
            public DescribeDefaultSearchFieldResult call() throws Exception {
                return describeDefaultSearchField(describeDefaultSearchFieldRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets the default search field configured for the search domain.
     * </p>
     *
     * @param describeDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the DescribeDefaultSearchField operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDefaultSearchField service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDefaultSearchFieldResult> describeDefaultSearchFieldAsync(
            final DescribeDefaultSearchFieldRequest describeDefaultSearchFieldRequest,
            final AsyncHandler<DescribeDefaultSearchFieldRequest, DescribeDefaultSearchFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDefaultSearchFieldResult>() {
            public DescribeDefaultSearchFieldResult call() throws Exception {
            	DescribeDefaultSearchFieldResult result;
                try {
            		result = describeDefaultSearchField(describeDefaultSearchFieldRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDefaultSearchFieldRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10 KB.
     * </p>
     *
     * @param updateStopwordOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStopwordOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStopwordOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStopwordOptionsResult> updateStopwordOptionsAsync(final UpdateStopwordOptionsRequest updateStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStopwordOptionsResult>() {
            public UpdateStopwordOptionsResult call() throws Exception {
                return updateStopwordOptions(updateStopwordOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10 KB.
     * </p>
     *
     * @param updateStopwordOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStopwordOptions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStopwordOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStopwordOptionsResult> updateStopwordOptionsAsync(
            final UpdateStopwordOptionsRequest updateStopwordOptionsRequest,
            final AsyncHandler<UpdateStopwordOptionsRequest, UpdateStopwordOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStopwordOptionsResult>() {
            public UpdateStopwordOptionsResult call() throws Exception {
            	UpdateStopwordOptionsResult result;
                try {
            		result = updateStopwordOptions(updateStopwordOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateStopwordOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Configures a synonym dictionary for the search domain. The synonym
     * dictionary is used during indexing to configure mappings for terms
     * that occur in text fields. The maximum size of the synonym dictionary
     * is 100 KB.
     * </p>
     *
     * @param updateSynonymOptionsRequest Container for the necessary
     *           parameters to execute the UpdateSynonymOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSynonymOptions service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSynonymOptionsResult> updateSynonymOptionsAsync(final UpdateSynonymOptionsRequest updateSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateSynonymOptionsResult>() {
            public UpdateSynonymOptionsResult call() throws Exception {
                return updateSynonymOptions(updateSynonymOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures a synonym dictionary for the search domain. The synonym
     * dictionary is used during indexing to configure mappings for terms
     * that occur in text fields. The maximum size of the synonym dictionary
     * is 100 KB.
     * </p>
     *
     * @param updateSynonymOptionsRequest Container for the necessary
     *           parameters to execute the UpdateSynonymOptions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSynonymOptions service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSynonymOptionsResult> updateSynonymOptionsAsync(
            final UpdateSynonymOptionsRequest updateSynonymOptionsRequest,
            final AsyncHandler<UpdateSynonymOptionsRequest, UpdateSynonymOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateSynonymOptionsResult>() {
            public UpdateSynonymOptionsResult call() throws Exception {
            	UpdateSynonymOptionsResult result;
                try {
            		result = updateSynonymOptions(updateSynonymOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateSynonymOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500 KB.
     * </p>
     *
     * @param updateStemmingOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStemmingOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStemmingOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStemmingOptionsResult> updateStemmingOptionsAsync(final UpdateStemmingOptionsRequest updateStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStemmingOptionsResult>() {
            public UpdateStemmingOptionsResult call() throws Exception {
                return updateStemmingOptions(updateStemmingOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500 KB.
     * </p>
     *
     * @param updateStemmingOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStemmingOptions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStemmingOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStemmingOptionsResult> updateStemmingOptionsAsync(
            final UpdateStemmingOptionsRequest updateStemmingOptionsRequest,
            final AsyncHandler<UpdateStemmingOptionsRequest, UpdateStemmingOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UpdateStemmingOptionsResult>() {
            public UpdateStemmingOptionsResult call() throws Exception {
            	UpdateStemmingOptionsResult result;
                try {
            		result = updateStemmingOptions(updateStemmingOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(updateStemmingOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets the stemming dictionary configured for the search domain.
     * </p>
     *
     * @param describeStemmingOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStemmingOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStemmingOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStemmingOptionsResult> describeStemmingOptionsAsync(final DescribeStemmingOptionsRequest describeStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStemmingOptionsResult>() {
            public DescribeStemmingOptionsResult call() throws Exception {
                return describeStemmingOptions(describeStemmingOptionsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets the stemming dictionary configured for the search domain.
     * </p>
     *
     * @param describeStemmingOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStemmingOptions operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStemmingOptions service method, as returned by
     *         AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStemmingOptionsResult> describeStemmingOptionsAsync(
            final DescribeStemmingOptionsRequest describeStemmingOptionsRequest,
            final AsyncHandler<DescribeStemmingOptionsRequest, DescribeStemmingOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeStemmingOptionsResult>() {
            public DescribeStemmingOptionsResult call() throws Exception {
            	DescribeStemmingOptionsResult result;
                try {
            		result = describeStemmingOptions(describeStemmingOptionsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeStemmingOptionsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(final DescribeDomainsRequest describeDomainsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDomainsResult>() {
            public DescribeDomainsResult call() throws Exception {
                return describeDomains(describeDomainsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDomains service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDomainsResult> describeDomainsAsync(
            final DescribeDomainsRequest describeDomainsRequest,
            final AsyncHandler<DescribeDomainsRequest, DescribeDomainsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeDomainsResult>() {
            public DescribeDomainsResult call() throws Exception {
            	DescribeDomainsResult result;
                try {
            		result = describeDomains(describeDomainsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeDomainsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest text processing options and <code>IndexFields</code> . This
     * operation must be invoked to make options whose OptionStatus has
     * <code>OptionState</code> of <code>RequiresIndexDocuments</code>
     * visible in search results.
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(final IndexDocumentsRequest indexDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<IndexDocumentsResult>() {
            public IndexDocumentsResult call() throws Exception {
                return indexDocuments(indexDocumentsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest text processing options and <code>IndexFields</code> . This
     * operation must be invoked to make options whose OptionStatus has
     * <code>OptionState</code> of <code>RequiresIndexDocuments</code>
     * visible in search results.
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         IndexDocuments service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<IndexDocumentsResult> indexDocumentsAsync(
            final IndexDocumentsRequest indexDocumentsRequest,
            final AsyncHandler<IndexDocumentsRequest, IndexDocumentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<IndexDocumentsResult>() {
            public IndexDocumentsResult call() throws Exception {
            	IndexDocumentsResult result;
                try {
            		result = indexDocuments(indexDocumentsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(indexDocumentsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. Shows all fields by
     * default.
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(final DescribeIndexFieldsRequest describeIndexFieldsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIndexFieldsResult>() {
            public DescribeIndexFieldsResult call() throws Exception {
                return describeIndexFields(describeIndexFieldsRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. Shows all fields by
     * default.
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields operation on
     *           AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeIndexFields service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeIndexFieldsResult> describeIndexFieldsAsync(
            final DescribeIndexFieldsRequest describeIndexFieldsRequest,
            final AsyncHandler<DescribeIndexFieldsRequest, DescribeIndexFieldsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DescribeIndexFieldsResult>() {
            public DescribeIndexFieldsResult call() throws Exception {
            	DescribeIndexFieldsResult result;
                try {
            		result = describeIndexFields(describeIndexFieldsRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(describeIndexFieldsRequest, result);
               	return result;
		    }
		});
    }
    
    /**
     * <p>
     * Removes an <code>IndexField</code> from the search domain.
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(final DeleteIndexFieldRequest deleteIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIndexFieldResult>() {
            public DeleteIndexFieldResult call() throws Exception {
                return deleteIndexField(deleteIndexFieldRequest);
		    }
		});
    }

    
    /**
     * <p>
     * Removes an <code>IndexField</code> from the search domain.
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearch.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearch.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteIndexFieldResult> deleteIndexFieldAsync(
            final DeleteIndexFieldRequest deleteIndexFieldRequest,
            final AsyncHandler<DeleteIndexFieldRequest, DeleteIndexFieldResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<DeleteIndexFieldResult>() {
            public DeleteIndexFieldResult call() throws Exception {
            	DeleteIndexFieldResult result;
                try {
            		result = deleteIndexField(deleteIndexFieldRequest);
            	} catch (Exception ex) {
            	    asyncHandler.onError(ex);
    				throw ex;
            	}
            	asyncHandler.onSuccess(deleteIndexFieldRequest, result);
               	return result;
		    }
		});
    }
    
}
        
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
package com.amazonaws.services.cloudsearch;
            
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;

import com.amazonaws.services.cloudsearch.model.*;


/**
 * Client for accessing AmazonCloudSearch.  All calls made
 * using this client are non-blocking and will immediately return a Java Future.
 * Callers must use the Future object to determine when the service call has actually
 * completed.
 * Amazon CloudSearch Configuration Service <p>
 * You use the Configuration Service to create, configure, and manage
 * search domains. Amazon CloudSearch configuration requests are
 * submitted to <code>cloudsearch.us-east-1.amazonaws.com</code> using
 * the AWS Query protocol.
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
     * search field is used when a search request does not specify which
     * fields to search. By default, it is configured to include the contents
     * of all of the domain's text fields.
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
     * Creates a new search domain.
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDomain service method, as returned by AmazonCloudSearch.
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
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100KB.
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
     * Permanently deletes a search domain and all of its data.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDomain service method, as returned by AmazonCloudSearch.
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
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10KB.
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
     * Configures a synonym dictionary for the search domain. The synonym
     * dictionary is used during indexing to configure mappings for terms
     * that occur in text fields. The maximum size of the synonym dictionary
     * is 100KB.
     * </p>
     *
     * @param updateSynonymOptionsRequest Container for the necessary
     *           parameters to execute the UpdateSynonymOptions operation on
     *           AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSynonymOptions service method, as returned by AmazonCloudSearch.
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
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500KB.
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
     * Removes an <code>IndexField</code> from the search domain.
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField operation on AmazonCloudSearch.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteIndexField service method, as returned by AmazonCloudSearch.
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
    
}
        
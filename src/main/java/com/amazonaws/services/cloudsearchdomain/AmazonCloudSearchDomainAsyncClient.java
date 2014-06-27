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
package com.amazonaws.services.cloudsearchdomain;

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

import com.amazonaws.services.cloudsearchdomain.model.*;

/**
 * Asynchronous client for accessing AmazonCloudSearchDomain.
 * All asynchronous calls made using this client are non-blocking. Callers could either
 * process the result and handle the exceptions in the worker thread by providing a callback handler
 * when making the call, or use the returned Future object to check the result of the call in the calling thread.
 * <p>
 * You use the AmazonCloudSearch2013 API to upload documents to a search
 * domain and search those documents.
 * </p>
 * <p>
 * The endpoints for submitting <code>UploadDocuments</code> ,
 * <code>Search</code> , and <code>Suggest</code>
 * requests are domain-specific. To get the endpoints for your domain,
 * use the Amazon CloudSearch configuration service
 * <code>DescribeDomains</code> action. The domain endpoints are also
 * displayed on the domain dashboard in the Amazon CloudSearch console.
 * You submit suggest requests to the search endpoint.
 * </p>
 * <p>
 * For more information, see the
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide"> Amazon CloudSearch Developer Guide </a>
 * .
 * </p>
 */
public class AmazonCloudSearchDomainAsyncClient extends AmazonCloudSearchDomainClient
        implements AmazonCloudSearchDomainAsync {

    /**
     * Executor service for executing asynchronous requests.
     */
    private ExecutorService executorService;

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain.  A credentials provider chain will be used
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
    public AmazonCloudSearchDomainAsyncClient() {
        this(new DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudSearchDomain
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudSearchDomainAsyncClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials.
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {
        super(awsCredentials);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials,
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentials awsCredentials,
                ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials provider.
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials provider
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, new ClientConfiguration(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
                ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials
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
    public AmazonCloudSearchDomainAsyncClient(AWSCredentialsProvider awsCredentialsProvider,
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
     * Posts a batch of documents to a search domain for indexing. A
     * document batch is a collection of add and delete operations that
     * represent the documents you want to add, update, or delete from your
     * domain. Batches can be described in either JSON or XML. Each item that
     * you want Amazon CloudSearch to return as a search result (such as a
     * product) is represented as a document. Every document has a unique ID
     * and one or more fields that contain the data that you want to search
     * and return in results. Individual documents cannot contain more than
     * 1 MB of data. The entire batch cannot exceed 5 MB. To get the best
     * possible upload performance, group add and delete operations in
     * batches that are close the 5 MB limit. Submitting a large volume of
     * single-document batches can overload a domain's document service.
     * </p>
     * <p>
     * The endpoint for submitting <code>UploadDocuments</code> requests is
     * domain-specific. To get the document endpoint for your domain, use the
     * Amazon CloudSearch configuration service <code>DescribeDomains</code>
     * action. A domain's endpoints are also displayed on the domain
     * dashboard in the Amazon CloudSearch console.
     * </p>
     * <p>
     * For more information about formatting your data for Amazon
     * CloudSearch, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html"> Preparing Your Data </a> in the <i>Amazon CloudSearch Developer Guide</i> . For more information about uploading data for indexing, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html"> Uploading Data </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param uploadDocumentsRequest Container for the necessary parameters
     *           to execute the UploadDocuments operation on AmazonCloudSearchDomain.
     * 
     * @return A Java Future object containing the response from the
     *         UploadDocuments service method, as returned by
     *         AmazonCloudSearchDomain.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadDocumentsResult> uploadDocumentsAsync(final UploadDocumentsRequest uploadDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UploadDocumentsResult>() {
            public UploadDocumentsResult call() throws Exception {
                return uploadDocuments(uploadDocumentsRequest);
        }
    });
    }

    /**
     * <p>
     * Posts a batch of documents to a search domain for indexing. A
     * document batch is a collection of add and delete operations that
     * represent the documents you want to add, update, or delete from your
     * domain. Batches can be described in either JSON or XML. Each item that
     * you want Amazon CloudSearch to return as a search result (such as a
     * product) is represented as a document. Every document has a unique ID
     * and one or more fields that contain the data that you want to search
     * and return in results. Individual documents cannot contain more than
     * 1 MB of data. The entire batch cannot exceed 5 MB. To get the best
     * possible upload performance, group add and delete operations in
     * batches that are close the 5 MB limit. Submitting a large volume of
     * single-document batches can overload a domain's document service.
     * </p>
     * <p>
     * The endpoint for submitting <code>UploadDocuments</code> requests is
     * domain-specific. To get the document endpoint for your domain, use the
     * Amazon CloudSearch configuration service <code>DescribeDomains</code>
     * action. A domain's endpoints are also displayed on the domain
     * dashboard in the Amazon CloudSearch console.
     * </p>
     * <p>
     * For more information about formatting your data for Amazon
     * CloudSearch, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html"> Preparing Your Data </a> in the <i>Amazon CloudSearch Developer Guide</i> . For more information about uploading data for indexing, see <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html"> Uploading Data </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param uploadDocumentsRequest Container for the necessary parameters
     *           to execute the UploadDocuments operation on AmazonCloudSearchDomain.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UploadDocuments service method, as returned by
     *         AmazonCloudSearchDomain.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UploadDocumentsResult> uploadDocumentsAsync(
            final UploadDocumentsRequest uploadDocumentsRequest,
            final AsyncHandler<UploadDocumentsRequest, UploadDocumentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<UploadDocumentsResult>() {
            public UploadDocumentsResult call() throws Exception {
              UploadDocumentsResult result;
                try {
                result = uploadDocuments(uploadDocumentsRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(uploadDocumentsRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves autocomplete suggestions for a partial query string. You
     * can use suggestions enable you to display likely matches before users
     * finish typing. In Amazon CloudSearch, suggestions are based on the
     * contents of a particular text field. When you request suggestions,
     * Amazon CloudSearch finds all of the documents whose values in the
     * suggester field start with the specified query string. The beginning
     * of the field must match the query string to be considered a match.
     * </p>
     * <p>
     * For more information about configuring suggesters and retrieving
     * suggestions, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     * <p>
     * The endpoint for submitting <code>Suggest</code> requests is
     * domain-specific. You submit suggest requests to a domain's search
     * endpoint. To get the search endpoint for your domain, use the Amazon
     * CloudSearch configuration service <code>DescribeDomains</code> action.
     * A domain's endpoints are also displayed on the domain dashboard in the
     * Amazon CloudSearch console.
     * </p>
     *
     * @param suggestRequest Container for the necessary parameters to
     *           execute the Suggest operation on AmazonCloudSearchDomain.
     * 
     * @return A Java Future object containing the response from the Suggest
     *         service method, as returned by AmazonCloudSearchDomain.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SuggestResult> suggestAsync(final SuggestRequest suggestRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SuggestResult>() {
            public SuggestResult call() throws Exception {
                return suggest(suggestRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves autocomplete suggestions for a partial query string. You
     * can use suggestions enable you to display likely matches before users
     * finish typing. In Amazon CloudSearch, suggestions are based on the
     * contents of a particular text field. When you request suggestions,
     * Amazon CloudSearch finds all of the documents whose values in the
     * suggester field start with the specified query string. The beginning
     * of the field must match the query string to be considered a match.
     * </p>
     * <p>
     * For more information about configuring suggesters and retrieving
     * suggestions, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     * <p>
     * The endpoint for submitting <code>Suggest</code> requests is
     * domain-specific. You submit suggest requests to a domain's search
     * endpoint. To get the search endpoint for your domain, use the Amazon
     * CloudSearch configuration service <code>DescribeDomains</code> action.
     * A domain's endpoints are also displayed on the domain dashboard in the
     * Amazon CloudSearch console.
     * </p>
     *
     * @param suggestRequest Container for the necessary parameters to
     *           execute the Suggest operation on AmazonCloudSearchDomain.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Suggest
     *         service method, as returned by AmazonCloudSearchDomain.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SuggestResult> suggestAsync(
            final SuggestRequest suggestRequest,
            final AsyncHandler<SuggestRequest, SuggestResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SuggestResult>() {
            public SuggestResult call() throws Exception {
              SuggestResult result;
                try {
                result = suggest(suggestRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(suggestRequest, result);
                 return result;
        }
    });
    }
    
    /**
     * <p>
     * Retrieves a list of documents that match the specified search
     * criteria. How you specify the search criteria depends on which query
     * parser you use. Amazon CloudSearch supports four query parsers:
     * </p>
     * 
     * <ul>
     * <li> <code>simple</code> : search all <code>text</code> and
     * <code>text-array</code> fields for the specified string. Search for
     * phrases, individual terms, and prefixes. </li>
     * <li> <code>structured</code> : search specific fields, construct
     * compound queries using Boolean operators, and use advanced features
     * such as term boosting and proximity searching.</li>
     * <li> <code>lucene</code> : specify search criteria using the Apache
     * Lucene query parser syntax.</li>
     * <li> <code>dismax</code> : specify search criteria using the
     * simplified subset of the Apache Lucene query parser syntax defined by
     * the DisMax query parser.</li>
     * 
     * </ul>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html"> Searching Your Data </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     * <p>
     * The endpoint for submitting <code>Search</code> requests is
     * domain-specific. You submit search requests to a domain's search
     * endpoint. To get the search endpoint for your domain, use the Amazon
     * CloudSearch configuration service <code>DescribeDomains</code> action.
     * A domain's endpoints are also displayed on the domain dashboard in the
     * Amazon CloudSearch console.
     * </p>
     *
     * @param searchRequest Container for the necessary parameters to execute
     *           the Search operation on AmazonCloudSearchDomain.
     * 
     * @return A Java Future object containing the response from the Search
     *         service method, as returned by AmazonCloudSearchDomain.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SearchResult> searchAsync(final SearchRequest searchRequest) 
            throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchResult>() {
            public SearchResult call() throws Exception {
                return search(searchRequest);
        }
    });
    }

    /**
     * <p>
     * Retrieves a list of documents that match the specified search
     * criteria. How you specify the search criteria depends on which query
     * parser you use. Amazon CloudSearch supports four query parsers:
     * </p>
     * 
     * <ul>
     * <li> <code>simple</code> : search all <code>text</code> and
     * <code>text-array</code> fields for the specified string. Search for
     * phrases, individual terms, and prefixes. </li>
     * <li> <code>structured</code> : search specific fields, construct
     * compound queries using Boolean operators, and use advanced features
     * such as term boosting and proximity searching.</li>
     * <li> <code>lucene</code> : specify search criteria using the Apache
     * Lucene query parser syntax.</li>
     * <li> <code>dismax</code> : specify search criteria using the
     * simplified subset of the Apache Lucene query parser syntax defined by
     * the DisMax query parser.</li>
     * 
     * </ul>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html"> Searching Your Data </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     * <p>
     * The endpoint for submitting <code>Search</code> requests is
     * domain-specific. You submit search requests to a domain's search
     * endpoint. To get the search endpoint for your domain, use the Amazon
     * CloudSearch configuration service <code>DescribeDomains</code> action.
     * A domain's endpoints are also displayed on the domain dashboard in the
     * Amazon CloudSearch console.
     * </p>
     *
     * @param searchRequest Container for the necessary parameters to execute
     *           the Search operation on AmazonCloudSearchDomain.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Search
     *         service method, as returned by AmazonCloudSearchDomain.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<SearchResult> searchAsync(
            final SearchRequest searchRequest,
            final AsyncHandler<SearchRequest, SearchResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException {
        return executorService.submit(new Callable<SearchResult>() {
            public SearchResult call() throws Exception {
              SearchResult result;
                try {
                result = search(searchRequest);
              } catch (Exception ex) {
                  asyncHandler.onError(ex);
            throw ex;
              }
              asyncHandler.onSuccess(searchRequest, result);
                 return result;
        }
    });
    }
    
}
        
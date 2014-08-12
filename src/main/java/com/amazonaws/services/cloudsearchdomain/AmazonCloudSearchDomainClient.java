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

import java.io.*;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import static com.amazonaws.util.IOUtils.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.services.cloudsearchdomain.model.transform.*;

/**
 * Client for accessing AmazonCloudSearchDomain.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AmazonCloudSearchDomainClient extends AmazonWebServiceClient implements AmazonCloudSearchDomain {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudSearchDomain.class);

    /**
     * List of exception unmarshallers for all AmazonCloudSearchDomain exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonCloudSearchDomainClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonCloudSearchDomainClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCloudSearchDomainClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudSearchDomain
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudSearchDomainClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCloudSearchDomainClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudSearchDomain
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudSearchDomainClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchDomain using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudSearchDomain
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonCloudSearchDomainClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new DocumentServiceExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new SearchExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudsearchdomain/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudsearchdomain/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
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
     *           to execute the UploadDocuments service method on
     *           AmazonCloudSearchDomain.
     * 
     * @return The response from the UploadDocuments service method, as
     *         returned by AmazonCloudSearchDomain.
     * 
     * @throws DocumentServiceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UploadDocumentsResult uploadDocuments(UploadDocumentsRequest uploadDocumentsRequest) {
        ExecutionContext executionContext = createExecutionContext(uploadDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UploadDocumentsRequest> request = null;
        Response<UploadDocumentsResult> response = null;
        
        final InputStream isOrig = uploadDocumentsRequest.getDocuments();
        final InputStream isCurr = ReleasableInputStream.wrap(isOrig).disableClose();
        
        try {
            
            // Replaces the input stream with the one we just wrapped, so that
            // the close operation is disabled to avoid interference with any 
            // potential mark-and-reset operation
            uploadDocumentsRequest.setDocuments(isCurr);
            
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UploadDocumentsRequestMarshaller().marshall(uploadDocumentsRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<UploadDocumentsResult, JsonUnmarshallerContext> unmarshaller =
                new UploadDocumentsResultJsonUnmarshaller();
            JsonResponseHandler<UploadDocumentsResult> responseHandler =
                new JsonResponseHandler<UploadDocumentsResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            // Only releases our internal resources, not the original input stream
            closeQuietly(isCurr, log);
            // Restore the original input stream, so that the caller
            // (who is responsible) can close it
            uploadDocumentsRequest.setDocuments(isOrig);
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     *           execute the Suggest service method on AmazonCloudSearchDomain.
     * 
     * @return The response from the Suggest service method, as returned by
     *         AmazonCloudSearchDomain.
     * 
     * @throws SearchException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SuggestResult suggest(SuggestRequest suggestRequest) {
        ExecutionContext executionContext = createExecutionContext(suggestRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SuggestRequest> request = null;
        Response<SuggestResult> response = null;
        
        try {
            
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SuggestRequestMarshaller().marshall(suggestRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SuggestResult, JsonUnmarshallerContext> unmarshaller =
                new SuggestResultJsonUnmarshaller();
            JsonResponseHandler<SuggestResult> responseHandler =
                new JsonResponseHandler<SuggestResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
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
     *           the Search service method on AmazonCloudSearchDomain.
     * 
     * @return The response from the Search service method, as returned by
     *         AmazonCloudSearchDomain.
     * 
     * @throws SearchException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchDomain indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SearchResult search(SearchRequest searchRequest) {
        ExecutionContext executionContext = createExecutionContext(searchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRequest> request = null;
        Response<SearchResult> response = null;
        
        try {
            
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRequestMarshaller().marshall(searchRequest);
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }
            Unmarshaller<SearchResult, JsonUnmarshallerContext> unmarshaller =
                new SearchResultJsonUnmarshaller();
            JsonResponseHandler<SearchResult> responseHandler =
                new JsonResponseHandler<SearchResult>(unmarshaller);
            
            response = invoke(request, responseHandler, executionContext);
            
            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        
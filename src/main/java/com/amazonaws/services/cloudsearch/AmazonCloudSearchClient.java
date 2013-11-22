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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cloudsearch.model.*;
import com.amazonaws.services.cloudsearch.model.transform.*;


/**
 * Client for accessing AmazonCloudSearch.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
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
public class AmazonCloudSearchClient extends AmazonWebServiceClient implements AmazonCloudSearch {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonCloudSearch exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonCloudSearchClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
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
    public AmazonCloudSearchClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCloudSearchClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudSearch
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudSearchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearch using the specified AWS account credentials
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
     *                       client connects to AmazonCloudSearch
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BaseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTypeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudsearch.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudsearch/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudsearch/request.handler2s"));
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
     *           parameters to execute the UpdateDefaultSearchField service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateDefaultSearchField service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDefaultSearchFieldResult updateDefaultSearchField(UpdateDefaultSearchFieldRequest updateDefaultSearchFieldRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDefaultSearchFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateDefaultSearchFieldRequest> request = null;
        Response<UpdateDefaultSearchFieldResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateDefaultSearchFieldRequestMarshaller().marshall(updateDefaultSearchFieldRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateDefaultSearchFieldResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes a <code>RankExpression</code> from the search domain.
     * </p>
     *
     * @param deleteRankExpressionRequest Container for the necessary
     *           parameters to execute the DeleteRankExpression service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DeleteRankExpression service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteRankExpressionResult deleteRankExpression(DeleteRankExpressionRequest deleteRankExpressionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRankExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteRankExpressionRequest> request = null;
        Response<DeleteRankExpressionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteRankExpressionRequestMarshaller().marshall(deleteRankExpressionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteRankExpressionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the rank expressions configured for the search domain. Can be
     * limited to specific rank expressions by name. Shows all rank
     * expressions by default.
     * </p>
     *
     * @param describeRankExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeRankExpressions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeRankExpressions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRankExpressionsResult describeRankExpressions(DescribeRankExpressionsRequest describeRankExpressionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRankExpressionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeRankExpressionsRequest> request = null;
        Response<DescribeRankExpressionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeRankExpressionsRequestMarshaller().marshall(describeRankExpressionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeRankExpressionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new search domain.
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain service method on AmazonCloudSearch.
     * 
     * @return The response from the CreateDomain service method, as returned
     *         by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws LimitExceededException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateDomainRequestMarshaller().marshall(createDomainRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDomainResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100 KB.
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies service method
     *           on AmazonCloudSearch.
     * 
     * @return The response from the UpdateServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(updateServiceAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateServiceAccessPoliciesRequest> request = null;
        Response<UpdateServiceAccessPoliciesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateServiceAccessPoliciesRequestMarshaller().marshall(updateServiceAccessPoliciesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateServiceAccessPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           to execute the DefineIndexField service method on AmazonCloudSearch.
     * 
     * @return The response from the DefineIndexField service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest defineIndexFieldRequest) {
        ExecutionContext executionContext = createExecutionContext(defineIndexFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DefineIndexFieldRequest> request = null;
        Response<DefineIndexFieldResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DefineIndexFieldRequestMarshaller().marshall(defineIndexFieldRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DefineIndexFieldResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the DefineRankExpression service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DefineRankExpression service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineRankExpressionResult defineRankExpression(DefineRankExpressionRequest defineRankExpressionRequest) {
        ExecutionContext executionContext = createExecutionContext(defineRankExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DefineRankExpressionRequest> request = null;
        Response<DefineRankExpressionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DefineRankExpressionRequestMarshaller().marshall(defineRankExpressionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DefineRankExpressionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the synonym dictionary configured for the search domain.
     * </p>
     *
     * @param describeSynonymOptionsRequest Container for the necessary
     *           parameters to execute the DescribeSynonymOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeSynonymOptions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSynonymOptionsResult describeSynonymOptions(DescribeSynonymOptionsRequest describeSynonymOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSynonymOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeSynonymOptionsRequest> request = null;
        Response<DescribeSynonymOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeSynonymOptionsRequestMarshaller().marshall(describeSynonymOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeSynonymOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the stopwords configured for the search domain.
     * </p>
     *
     * @param describeStopwordOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStopwordOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeStopwordOptions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStopwordOptionsResult describeStopwordOptions(DescribeStopwordOptionsRequest describeStopwordOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStopwordOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeStopwordOptionsRequest> request = null;
        Response<DescribeStopwordOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeStopwordOptionsRequestMarshaller().marshall(describeStopwordOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStopwordOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Permanently deletes a search domain and all of its data.
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain service method on AmazonCloudSearch.
     * 
     * @return The response from the DeleteDomain service method, as returned
     *         by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteDomainRequestMarshaller().marshall(deleteDomainRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteDomainResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the resource-based policies that control access
     * to the domain's document and search services.
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           service method on AmazonCloudSearch.
     * 
     * @return The response from the DescribeServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeServiceAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeServiceAccessPoliciesRequest> request = null;
        Response<DescribeServiceAccessPoliciesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeServiceAccessPoliciesRequestMarshaller().marshall(describeServiceAccessPoliciesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeServiceAccessPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the default search field configured for the search domain.
     * </p>
     *
     * @param describeDefaultSearchFieldRequest Container for the necessary
     *           parameters to execute the DescribeDefaultSearchField service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeDefaultSearchField service
     *         method, as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDefaultSearchFieldResult describeDefaultSearchField(DescribeDefaultSearchFieldRequest describeDefaultSearchFieldRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDefaultSearchFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeDefaultSearchFieldRequest> request = null;
        Response<DescribeDefaultSearchFieldResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeDefaultSearchFieldRequestMarshaller().marshall(describeDefaultSearchFieldRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDefaultSearchFieldResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10 KB.
     * </p>
     *
     * @param updateStopwordOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStopwordOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateStopwordOptions service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStopwordOptionsResult updateStopwordOptions(UpdateStopwordOptionsRequest updateStopwordOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStopwordOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateStopwordOptionsRequest> request = null;
        Response<UpdateStopwordOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateStopwordOptionsRequestMarshaller().marshall(updateStopwordOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStopwordOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           parameters to execute the UpdateSynonymOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateSynonymOptions service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateSynonymOptionsResult updateSynonymOptions(UpdateSynonymOptionsRequest updateSynonymOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateSynonymOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateSynonymOptionsRequest> request = null;
        Response<UpdateSynonymOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateSynonymOptionsRequestMarshaller().marshall(updateSynonymOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateSynonymOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500 KB.
     * </p>
     *
     * @param updateStemmingOptionsRequest Container for the necessary
     *           parameters to execute the UpdateStemmingOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the UpdateStemmingOptions service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStemmingOptionsResult updateStemmingOptions(UpdateStemmingOptionsRequest updateStemmingOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStemmingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateStemmingOptionsRequest> request = null;
        Response<UpdateStemmingOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateStemmingOptionsRequestMarshaller().marshall(updateStemmingOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStemmingOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the stemming dictionary configured for the search domain.
     * </p>
     *
     * @param describeStemmingOptionsRequest Container for the necessary
     *           parameters to execute the DescribeStemmingOptions service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeStemmingOptions service method,
     *         as returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStemmingOptionsResult describeStemmingOptions(DescribeStemmingOptionsRequest describeStemmingOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStemmingOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeStemmingOptionsRequest> request = null;
        Response<DescribeStemmingOptionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeStemmingOptionsRequestMarshaller().marshall(describeStemmingOptionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStemmingOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains service method on AmazonCloudSearch.
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeDomainsRequest> request = null;
        Response<DescribeDomainsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeDomainsRequestMarshaller().marshall(describeDomainsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeDomainsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
     *           execute the IndexDocuments service method on AmazonCloudSearch.
     * 
     * @return The response from the IndexDocuments service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest indexDocumentsRequest) {
        ExecutionContext executionContext = createExecutionContext(indexDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<IndexDocumentsRequest> request = null;
        Response<IndexDocumentsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new IndexDocumentsRequestMarshaller().marshall(indexDocumentsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new IndexDocumentsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. Shows all fields by
     * default.
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields service method on
     *           AmazonCloudSearch.
     * 
     * @return The response from the DescribeIndexFields service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIndexFieldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeIndexFieldsRequest> request = null;
        Response<DescribeIndexFieldsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeIndexFieldsRequestMarshaller().marshall(describeIndexFieldsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeIndexFieldsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes an <code>IndexField</code> from the search domain.
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField service method on AmazonCloudSearch.
     * 
     * @return The response from the DeleteIndexField service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws ResourceNotFoundException
     * @throws InternalException
     * @throws InvalidTypeException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIndexFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteIndexFieldRequest> request = null;
        Response<DeleteIndexFieldResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteIndexFieldRequestMarshaller().marshall(deleteIndexFieldRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DeleteIndexFieldResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default.
     * </p>
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearch.
     * 
     * @throws BaseException
     * @throws InternalException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains() throws AmazonServiceException, AmazonClientException {
        return describeDomains(new DescribeDomainsRequest());
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "cloudsearch";
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
            Unmarshaller<X, StaxUnmarshallerContext> unmarshaller,
            ExecutionContext executionContext)
    {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        for (Entry<String, String> entry : originalRequest.copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(getSigner());
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        
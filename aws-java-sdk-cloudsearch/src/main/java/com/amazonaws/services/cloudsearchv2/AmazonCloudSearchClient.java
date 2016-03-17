/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.services.cloudsearchv2.model.transform.*;

/**
 * Client for accessing AmazonCloudSearchv2.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon CloudSearch Configuration Service <p>
 * You use the Amazon CloudSearch configuration service to create,
 * configure, and manage search domains. Configuration service requests
 * are submitted using the AWS Query protocol. AWS Query requests are
 * HTTP or HTTPS requests submitted via HTTP GET or POST with a query
 * parameter named Action.
 * </p>
 * <p>
 * The endpoint for configuration service requests is region-specific:
 * cloudsearch. <i>region</i> .amazonaws.com. For example,
 * cloudsearch.us-east-1.amazonaws.com. For a current list of supported
 * regions and endpoints, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#cloudsearch_region"> Regions and Endpoints </a>
 * .
 * </p>
 */
public class AmazonCloudSearchClient extends AmazonWebServiceClient implements AmazonCloudSearch {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonCloudSearchv2 exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, org.w3c.dom.Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, org.w3c.dom.Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchv2.  A credentials provider chain will be used
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
     * AmazonCloudSearchv2.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudSearchv2
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudSearchClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials.
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
     * AmazonCloudSearchv2 using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudSearchv2
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudSearchClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials provider.
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
     * AmazonCloudSearchv2 using the specified AWS account credentials
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
     *                       client connects to AmazonCloudSearchv2
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudSearchv2 using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudSearchv2
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonCloudSearchClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidTypeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DisabledOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BaseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudsearch.us-east-1.amazonaws.com/");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudsearchv2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudsearchv2/request.handler2s"));
    }

    /**
     * <p>
     * Gets the analysis schemes configured for a domain. An analysis scheme
     * defines language-specific text processing options for a
     * <code>text</code> field. Can be limited to specific analysis schemes
     * by name. By default, shows all analysis schemes and includes any
     * pending changes to the configuration. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAnalysisSchemesRequest Container for the necessary
     *           parameters to execute the DescribeAnalysisSchemes service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeAnalysisSchemes service method,
     *         as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAnalysisSchemesResult describeAnalysisSchemes(DescribeAnalysisSchemesRequest describeAnalysisSchemesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAnalysisSchemesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAnalysisSchemesRequest> request = null;
        Response<DescribeAnalysisSchemesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAnalysisSchemesRequestMarshaller().marshall(super.beforeMarshalling(describeAnalysisSchemesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeAnalysisSchemesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes an <code> IndexField </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteIndexFieldRequest Container for the necessary parameters
     *           to execute the DeleteIndexField service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteIndexField service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteIndexFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIndexFieldRequest> request = null;
        Response<DeleteIndexFieldResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIndexFieldRequestMarshaller().marshall(super.beforeMarshalling(deleteIndexFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteIndexFieldResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures the availability options for a domain. Enabling the
     * Multi-AZ option expands an Amazon CloudSearch domain to an additional
     * Availability Zone in the same Region to increase fault tolerance in
     * the event of a service disruption. Changes to the Multi-AZ option can
     * take about half an hour to become active. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the UpdateAvailabilityOptions service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the UpdateAvailabilityOptions service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws DisabledOperationException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateAvailabilityOptionsResult updateAvailabilityOptions(UpdateAvailabilityOptionsRequest updateAvailabilityOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAvailabilityOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAvailabilityOptionsRequest> request = null;
        Response<UpdateAvailabilityOptionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAvailabilityOptionsRequestMarshaller().marshall(super.beforeMarshalling(updateAvailabilityOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UpdateAvailabilityOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the index fields configured for the search
     * domain. Can be limited to specific fields by name. By default, shows
     * all fields and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Domain Information </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeIndexFieldsRequest Container for the necessary
     *           parameters to execute the DescribeIndexFields service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeIndexFields service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeIndexFieldsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeIndexFieldsRequest> request = null;
        Response<DescribeIndexFieldsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeIndexFieldsRequestMarshaller().marshall(super.beforeMarshalling(describeIndexFieldsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeIndexFieldsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures an <code> Expression </code> for the search domain. Used
     * to create new expressions and modify existing ones. If the expression
     * exists, the new configuration replaces the old one. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineExpressionRequest Container for the necessary parameters
     *           to execute the DefineExpression service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DefineExpression service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineExpressionResult defineExpression(DefineExpressionRequest defineExpressionRequest) {
        ExecutionContext executionContext = createExecutionContext(defineExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineExpressionRequest> request = null;
        Response<DefineExpressionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineExpressionRequestMarshaller().marshall(super.beforeMarshalling(defineExpressionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DefineExpressionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures a suggester for a domain. A suggester enables you to
     * display possible matches before users finish typing their queries.
     * When you configure a suggester, you must specify the name of the text
     * field you want to search for possible matches and a unique name for
     * the suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineSuggesterRequest Container for the necessary parameters
     *           to execute the DefineSuggester service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DefineSuggester service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineSuggesterResult defineSuggester(DefineSuggesterRequest defineSuggesterRequest) {
        ExecutionContext executionContext = createExecutionContext(defineSuggesterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineSuggesterRequest> request = null;
        Response<DefineSuggesterResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineSuggesterRequestMarshaller().marshall(super.beforeMarshalling(defineSuggesterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DefineSuggesterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures the access rules that control access to the domain's
     * document and search endpoints. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for an Amazon CloudSearch Domain </a>
     * .
     * </p>
     *
     * @param updateServiceAccessPoliciesRequest Container for the necessary
     *           parameters to execute the UpdateServiceAccessPolicies service method
     *           on AmazonCloudSearchv2.
     * 
     * @return The response from the UpdateServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(updateServiceAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceAccessPoliciesRequest> request = null;
        Response<UpdateServiceAccessPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceAccessPoliciesRequestMarshaller().marshall(super.beforeMarshalling(updateServiceAccessPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UpdateServiceAccessPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes an analysis scheme. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DeleteAnalysisScheme service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteAnalysisScheme service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteAnalysisSchemeResult deleteAnalysisScheme(DeleteAnalysisSchemeRequest deleteAnalysisSchemeRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAnalysisSchemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnalysisSchemeRequest> request = null;
        Response<DeleteAnalysisSchemeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnalysisSchemeRequestMarshaller().marshall(super.beforeMarshalling(deleteAnalysisSchemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteAnalysisSchemeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Tells the search domain to start indexing its documents using the
     * latest indexing options. This operation must be invoked to activate
     * options whose OptionStatus is <code>RequiresIndexDocuments</code> .
     * </p>
     *
     * @param indexDocumentsRequest Container for the necessary parameters to
     *           execute the IndexDocuments service method on AmazonCloudSearchv2.
     * 
     * @return The response from the IndexDocuments service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest indexDocumentsRequest) {
        ExecutionContext executionContext = createExecutionContext(indexDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IndexDocumentsRequest> request = null;
        Response<IndexDocumentsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IndexDocumentsRequestMarshaller().marshall(super.beforeMarshalling(indexDocumentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new IndexDocumentsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the suggesters configured for a domain. A suggester enables you
     * to display possible matches before users finish typing their queries.
     * Can be limited to specific suggesters by name. By default, shows all
     * suggesters and includes any pending changes to the configuration. Set
     * the <code>Deployed</code> option to <code>true</code> to show the
     * active configuration and exclude pending changes. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeSuggestersRequest Container for the necessary
     *           parameters to execute the DescribeSuggesters service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeSuggesters service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSuggestersResult describeSuggesters(DescribeSuggestersRequest describeSuggestersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSuggestersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSuggestersRequest> request = null;
        Response<DescribeSuggestersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSuggestersRequestMarshaller().marshall(super.beforeMarshalling(describeSuggestersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeSuggestersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures scaling parameters for a domain. A domain's scaling
     * parameters specify the desired search instance type and replication
     * count. Amazon CloudSearch will still automatically scale your domain
     * based on the volume of data and traffic, but not below the desired
     * instance type and replication count. If the Multi-AZ option is
     * enabled, these values control the resources used per Availability
     * Zone. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param updateScalingParametersRequest Container for the necessary
     *           parameters to execute the UpdateScalingParameters service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the UpdateScalingParameters service method,
     *         as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateScalingParametersResult updateScalingParameters(UpdateScalingParametersRequest updateScalingParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(updateScalingParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateScalingParametersRequest> request = null;
        Response<UpdateScalingParametersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateScalingParametersRequestMarshaller().marshall(super.beforeMarshalling(updateScalingParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new UpdateScalingParametersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     *
     * @param listDomainNamesRequest Container for the necessary parameters
     *           to execute the ListDomainNames service method on AmazonCloudSearchv2.
     * 
     * @return The response from the ListDomainNames service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainNamesResult listDomainNames(ListDomainNamesRequest listDomainNamesRequest) {
        ExecutionContext executionContext = createExecutionContext(listDomainNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDomainNamesRequest> request = null;
        Response<ListDomainNamesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDomainNamesRequestMarshaller().marshall(super.beforeMarshalling(listDomainNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new ListDomainNamesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures an <code> IndexField </code> for the search domain. Used
     * to create new fields and modify existing ones. You must specify the
     * name of the domain you are configuring and an index field
     * configuration. The index field configuration specifies a unique name,
     * the index field type, and the options you want to configure for the
     * field. The options you can specify depend on the <code> IndexFieldType
     * </code> . If the field exists, the new configuration replaces the old
     * one. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html"> Configuring Index Fields </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineIndexFieldRequest Container for the necessary parameters
     *           to execute the DefineIndexField service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DefineIndexField service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest defineIndexFieldRequest) {
        ExecutionContext executionContext = createExecutionContext(defineIndexFieldRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineIndexFieldRequest> request = null;
        Response<DefineIndexFieldResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineIndexFieldRequestMarshaller().marshall(super.beforeMarshalling(defineIndexFieldRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DefineIndexFieldResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a new search domain. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html"> Creating a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param createDomainRequest Container for the necessary parameters to
     *           execute the CreateDomain service method on AmazonCloudSearchv2.
     * 
     * @return The response from the CreateDomain service method, as returned
     *         by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestMarshaller().marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new CreateDomainResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes a suggester. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html"> Getting Search Suggestions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteSuggesterRequest Container for the necessary parameters
     *           to execute the DeleteSuggester service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteSuggester service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteSuggesterResult deleteSuggester(DeleteSuggesterRequest deleteSuggesterRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSuggesterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSuggesterRequest> request = null;
        Response<DeleteSuggesterResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSuggesterRequestMarshaller().marshall(super.beforeMarshalling(deleteSuggesterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteSuggesterResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Removes an <code> Expression </code> from the search domain. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteExpressionRequest Container for the necessary parameters
     *           to execute the DeleteExpression service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteExpression service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteExpressionResult deleteExpression(DeleteExpressionRequest deleteExpressionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExpressionRequest> request = null;
        Response<DeleteExpressionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExpressionRequestMarshaller().marshall(super.beforeMarshalling(deleteExpressionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteExpressionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the availability options configured for a domain. By default,
     * shows the configuration with any pending changes. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeAvailabilityOptionsRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityOptions service method
     *           on AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeAvailabilityOptions service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws DisabledOperationException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAvailabilityOptionsResult describeAvailabilityOptions(DescribeAvailabilityOptionsRequest describeAvailabilityOptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAvailabilityOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAvailabilityOptionsRequest> request = null;
        Response<DescribeAvailabilityOptionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAvailabilityOptionsRequestMarshaller().marshall(super.beforeMarshalling(describeAvailabilityOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeAvailabilityOptionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Configures an analysis scheme that can be applied to a
     * <code>text</code> or <code>text-array</code> field to define
     * language-specific text processing options. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html"> Configuring Analysis Schemes </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param defineAnalysisSchemeRequest Container for the necessary
     *           parameters to execute the DefineAnalysisScheme service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DefineAnalysisScheme service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws InvalidTypeException
     * @throws ResourceNotFoundException
     * @throws LimitExceededException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DefineAnalysisSchemeResult defineAnalysisScheme(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) {
        ExecutionContext executionContext = createExecutionContext(defineAnalysisSchemeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DefineAnalysisSchemeRequest> request = null;
        Response<DefineAnalysisSchemeResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DefineAnalysisSchemeRequestMarshaller().marshall(super.beforeMarshalling(defineAnalysisSchemeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DefineAnalysisSchemeResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Indexes the search suggestions. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters"> Configuring Suggesters </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param buildSuggestersRequest Container for the necessary parameters
     *           to execute the BuildSuggesters service method on AmazonCloudSearchv2.
     * 
     * @return The response from the BuildSuggesters service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BuildSuggestersResult buildSuggesters(BuildSuggestersRequest buildSuggestersRequest) {
        ExecutionContext executionContext = createExecutionContext(buildSuggestersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BuildSuggestersRequest> request = null;
        Response<BuildSuggestersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BuildSuggestersRequestMarshaller().marshall(super.beforeMarshalling(buildSuggestersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new BuildSuggestersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the access policies that control access to the
     * domain's document and search endpoints. By default, shows the
     * configuration with any pending changes. Set the <code>Deployed</code>
     * option to <code>true</code> to show the active configuration and
     * exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html"> Configuring Access for a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeServiceAccessPoliciesRequest Container for the
     *           necessary parameters to execute the DescribeServiceAccessPolicies
     *           service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeServiceAccessPolicies service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeServiceAccessPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeServiceAccessPoliciesRequest> request = null;
        Response<DescribeServiceAccessPoliciesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeServiceAccessPoliciesRequestMarshaller().marshall(super.beforeMarshalling(describeServiceAccessPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeServiceAccessPoliciesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Permanently deletes a search domain and all of its data. Once a
     * domain has been deleted, it cannot be recovered. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html"> Deleting a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param deleteDomainRequest Container for the necessary parameters to
     *           execute the DeleteDomain service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DeleteDomain service method, as returned
     *         by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestMarshaller().marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DeleteDomainResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the expressions configured for the search domain. Can be limited
     * to specific expressions by name. By default, shows all expressions and
     * includes any pending changes to the configuration. Set the
     * <code>Deployed</code> option to <code>true</code> to show the active
     * configuration and exclude pending changes. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html"> Configuring Expressions </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeExpressionsRequest Container for the necessary
     *           parameters to execute the DescribeExpressions service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeExpressions service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeExpressionsResult describeExpressions(DescribeExpressionsRequest describeExpressionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeExpressionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExpressionsRequest> request = null;
        Response<DescribeExpressionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExpressionsRequestMarshaller().marshall(super.beforeMarshalling(describeExpressionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeExpressionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default. To get
     * the number of searchable documents in a domain, use the console or
     * submit a <code>matchall</code> request to your domain's search
     * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
     * more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeDomainsRequest Container for the necessary parameters
     *           to execute the DescribeDomains service method on AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDomainsRequest> request = null;
        Response<DescribeDomainsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDomainsRequestMarshaller().marshall(super.beforeMarshalling(describeDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeDomainsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Gets the scaling parameters configured for a domain. A domain's
     * scaling parameters specify the desired search instance type and
     * replication count. For more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html"> Configuring Scaling Options </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     *
     * @param describeScalingParametersRequest Container for the necessary
     *           parameters to execute the DescribeScalingParameters service method on
     *           AmazonCloudSearchv2.
     * 
     * @return The response from the DescribeScalingParameters service
     *         method, as returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws ResourceNotFoundException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeScalingParametersResult describeScalingParameters(DescribeScalingParametersRequest describeScalingParametersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeScalingParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingParametersRequest> request = null;
        Response<DescribeScalingParametersResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingParametersRequestMarshaller().marshall(super.beforeMarshalling(describeScalingParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            response = invoke(request, new DescribeScalingParametersResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();

        } finally {
            
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Lists all search domains owned by an account.
     * </p>
     * 
     * @return The response from the ListDomainNames service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDomainNamesResult listDomainNames() throws AmazonServiceException, AmazonClientException {
        return listDomainNames(new ListDomainNamesRequest());
    }
    
    /**
     * <p>
     * Gets information about the search domains owned by this account. Can
     * be limited to specific domains. Shows all domains by default. To get
     * the number of searchable documents in a domain, use the console or
     * submit a <code>matchall</code> request to your domain's search
     * endpoint: <code>q=matchall&q.parser=structured&size=0</code> . For
     * more information, see
     * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html"> Getting Information about a Search Domain </a>
     * in the <i>Amazon CloudSearch Developer Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeDomains service method, as
     *         returned by AmazonCloudSearchv2.
     * 
     * @throws InternalException
     * @throws BaseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearchv2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDomainsResult describeDomains() throws AmazonServiceException, AmazonClientException {
        return describeDomains(new DescribeDomainsRequest());
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

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);
        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        
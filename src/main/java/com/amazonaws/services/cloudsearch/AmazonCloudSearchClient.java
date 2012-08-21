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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.cloudsearch.model.*;
import com.amazonaws.services.cloudsearch.model.transform.*;


/**
 * Client for accessing AmazonCloudSearch.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * Amazon CloudSearch Configuration Service <p>
 * You use the Configuration Service to create, configure, and manage search domains. Amazon CloudSearch configuration requests are submitted to
 * <code>cloudsearch.us-east-1.amazonaws.com</code> using the AWS Query protocol.
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

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


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
     * @see DefaultAWSCredentialsProvider
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
     * @see DefaultAWSCredentialsProvider
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
        setEndpoint("cloudsearch.us-east-1.amazonaws.com/");

        signer = new AWS4Signer();
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudsearch/request.handlers"));
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
    public UpdateDefaultSearchFieldResult updateDefaultSearchField(UpdateDefaultSearchFieldRequest updateDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateDefaultSearchFieldRequest> request = new UpdateDefaultSearchFieldRequestMarshaller().marshall(updateDefaultSearchFieldRequest);
        return invoke(request, new UpdateDefaultSearchFieldResultStaxUnmarshaller());
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteRankExpressionResult deleteRankExpression(DeleteRankExpressionRequest deleteRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteRankExpressionRequest> request = new DeleteRankExpressionRequestMarshaller().marshall(deleteRankExpressionRequest);
        return invoke(request, new DeleteRankExpressionResultStaxUnmarshaller());
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
    public DescribeRankExpressionsResult describeRankExpressions(DescribeRankExpressionsRequest describeRankExpressionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeRankExpressionsRequest> request = new DescribeRankExpressionsRequestMarshaller().marshall(describeRankExpressionsRequest);
        return invoke(request, new DescribeRankExpressionsResultStaxUnmarshaller());
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
    public CreateDomainResult createDomain(CreateDomainRequest createDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateDomainRequest> request = new CreateDomainRequestMarshaller().marshall(createDomainRequest);
        return invoke(request, new CreateDomainResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Configures the policies that control access to the domain's document
     * and search services. The maximum size of an access policy document is
     * 100KB.
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
    public UpdateServiceAccessPoliciesResult updateServiceAccessPolicies(UpdateServiceAccessPoliciesRequest updateServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateServiceAccessPoliciesRequest> request = new UpdateServiceAccessPoliciesRequestMarshaller().marshall(updateServiceAccessPoliciesRequest);
        return invoke(request, new UpdateServiceAccessPoliciesResultStaxUnmarshaller());
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
    public DefineIndexFieldResult defineIndexField(DefineIndexFieldRequest defineIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DefineIndexFieldRequest> request = new DefineIndexFieldRequestMarshaller().marshall(defineIndexFieldRequest);
        return invoke(request, new DefineIndexFieldResultStaxUnmarshaller());
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
    public DefineRankExpressionResult defineRankExpression(DefineRankExpressionRequest defineRankExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DefineRankExpressionRequest> request = new DefineRankExpressionRequestMarshaller().marshall(defineRankExpressionRequest);
        return invoke(request, new DefineRankExpressionResultStaxUnmarshaller());
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
    public DescribeSynonymOptionsResult describeSynonymOptions(DescribeSynonymOptionsRequest describeSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeSynonymOptionsRequest> request = new DescribeSynonymOptionsRequestMarshaller().marshall(describeSynonymOptionsRequest);
        return invoke(request, new DescribeSynonymOptionsResultStaxUnmarshaller());
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
    public DescribeStopwordOptionsResult describeStopwordOptions(DescribeStopwordOptionsRequest describeStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStopwordOptionsRequest> request = new DescribeStopwordOptionsRequestMarshaller().marshall(describeStopwordOptionsRequest);
        return invoke(request, new DescribeStopwordOptionsResultStaxUnmarshaller());
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
    public DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteDomainRequest> request = new DeleteDomainRequestMarshaller().marshall(deleteDomainRequest);
        return invoke(request, new DeleteDomainResultStaxUnmarshaller());
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
    public DescribeServiceAccessPoliciesResult describeServiceAccessPolicies(DescribeServiceAccessPoliciesRequest describeServiceAccessPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeServiceAccessPoliciesRequest> request = new DescribeServiceAccessPoliciesRequestMarshaller().marshall(describeServiceAccessPoliciesRequest);
        return invoke(request, new DescribeServiceAccessPoliciesResultStaxUnmarshaller());
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
    public DescribeDefaultSearchFieldResult describeDefaultSearchField(DescribeDefaultSearchFieldRequest describeDefaultSearchFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeDefaultSearchFieldRequest> request = new DescribeDefaultSearchFieldRequestMarshaller().marshall(describeDefaultSearchFieldRequest);
        return invoke(request, new DescribeDefaultSearchFieldResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Configures stopwords for the search domain. Stopwords are used during
     * indexing and when processing search requests. The maximum size of the
     * stopwords dictionary is 10KB.
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
    public UpdateStopwordOptionsResult updateStopwordOptions(UpdateStopwordOptionsRequest updateStopwordOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateStopwordOptionsRequest> request = new UpdateStopwordOptionsRequestMarshaller().marshall(updateStopwordOptionsRequest);
        return invoke(request, new UpdateStopwordOptionsResultStaxUnmarshaller());
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
    public UpdateSynonymOptionsResult updateSynonymOptions(UpdateSynonymOptionsRequest updateSynonymOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateSynonymOptionsRequest> request = new UpdateSynonymOptionsRequestMarshaller().marshall(updateSynonymOptionsRequest);
        return invoke(request, new UpdateSynonymOptionsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Configures a stemming dictionary for the search domain. The stemming
     * dictionary is used during indexing and when processing search
     * requests. The maximum size of the stemming dictionary is 500KB.
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
    public UpdateStemmingOptionsResult updateStemmingOptions(UpdateStemmingOptionsRequest updateStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateStemmingOptionsRequest> request = new UpdateStemmingOptionsRequestMarshaller().marshall(updateStemmingOptionsRequest);
        return invoke(request, new UpdateStemmingOptionsResultStaxUnmarshaller());
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
    public DescribeStemmingOptionsResult describeStemmingOptions(DescribeStemmingOptionsRequest describeStemmingOptionsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStemmingOptionsRequest> request = new DescribeStemmingOptionsRequestMarshaller().marshall(describeStemmingOptionsRequest);
        return invoke(request, new DescribeStemmingOptionsResultStaxUnmarshaller());
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
    public DescribeDomainsResult describeDomains(DescribeDomainsRequest describeDomainsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeDomainsRequest> request = new DescribeDomainsRequestMarshaller().marshall(describeDomainsRequest);
        return invoke(request, new DescribeDomainsResultStaxUnmarshaller());
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
    public IndexDocumentsResult indexDocuments(IndexDocumentsRequest indexDocumentsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<IndexDocumentsRequest> request = new IndexDocumentsRequestMarshaller().marshall(indexDocumentsRequest);
        return invoke(request, new IndexDocumentsResultStaxUnmarshaller());
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
    public DescribeIndexFieldsResult describeIndexFields(DescribeIndexFieldsRequest describeIndexFieldsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeIndexFieldsRequest> request = new DescribeIndexFieldsRequestMarshaller().marshall(describeIndexFieldsRequest);
        return invoke(request, new DescribeIndexFieldsResultStaxUnmarshaller());
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudSearch indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteIndexFieldResult deleteIndexField(DeleteIndexFieldRequest deleteIndexFieldRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteIndexFieldRequest> request = new DeleteIndexFieldRequestMarshaller().marshall(deleteIndexFieldRequest);
        return invoke(request, new DeleteIndexFieldResultStaxUnmarshaller());
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
    
    /**
     * Overrides the default endpoint for this client ("https://cloudsearch.us-east-1.amazonaws.com/") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudsearch.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://cloudsearch.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "cloudsearch.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://cloudsearch.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
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

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller) {
        request.setEndpoint(endpoint);
        for (Entry<String, String> entry : request.getOriginalRequest().copyPrivateRequestParameters().entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
        	credentials = originalRequest.getRequestCredentials();
        }

        ExecutionContext executionContext = createExecutionContext();
        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);
        
        StaxResponseHandler<X> responseHandler = new StaxResponseHandler<X>(unmarshaller);
        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        
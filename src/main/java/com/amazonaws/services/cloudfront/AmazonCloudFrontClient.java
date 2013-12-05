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
package com.amazonaws.services.cloudfront;

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

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.services.cloudfront.model.transform.*;


/**
 * Client for accessing AmazonCloudFront.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * 
 */
public class AmazonCloudFrontClient extends AmazonWebServiceClient implements AmazonCloudFront {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonCloudFront exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFront.  A credentials provider chain will be used
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
    public AmazonCloudFrontClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFront.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudFront
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudFrontClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCloudFrontClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudFront
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudFrontClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFront using the specified AWS account credentials
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
     *                       client connects to AmazonCloudFront
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new TooManyCookieNamesInWhiteListExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PreconditionFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CNAMEAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidViewerCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrustedSignerDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTrustedSignersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequiredProtocolExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalUpdateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidErrorCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCloudFrontOriginAccessIdentitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCacheBehaviorsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyInvalidationsInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDefaultRootObjectExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIfMatchVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCertificatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRelativePathExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchInvalidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidResponseCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingBodyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchCloudFrontOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InconsistentQuantitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchStreamingDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidForwardCookiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionCNAMEsExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudfront.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudfront/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudfront/request.handler2s"));
    }

    
    /**
     * <p>
     * List streaming distributions.
     * </p>
     *
     * @param listStreamingDistributionsRequest Container for the necessary
     *           parameters to execute the ListStreamingDistributions service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the ListStreamingDistributions service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidArgumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStreamingDistributionsResult listStreamingDistributions(ListStreamingDistributionsRequest listStreamingDistributionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listStreamingDistributionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListStreamingDistributionsRequest> request = null;
        Response<ListStreamingDistributionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListStreamingDistributionsRequestMarshaller().marshall(listStreamingDistributionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStreamingDistributionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Update an origin access identity.
     * </p>
     *
     * @param updateCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           UpdateCloudFrontOriginAccessIdentity service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the UpdateCloudFrontOriginAccessIdentity
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws MissingBodyException
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(updateCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateCloudFrontOriginAccessIdentityRequest> request = null;
        Response<UpdateCloudFrontOriginAccessIdentityResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateCloudFrontOriginAccessIdentityRequestMarshaller().marshall(updateCloudFrontOriginAccessIdentityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateCloudFrontOriginAccessIdentityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Create a new invalidation.
     * </p>
     *
     * @param createInvalidationRequest Container for the necessary
     *           parameters to execute the CreateInvalidation service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the CreateInvalidation service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws TooManyInvalidationsInProgressException
     * @throws MissingBodyException
     * @throws NoSuchDistributionException
     * @throws BatchTooLargeException
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInvalidationResult createInvalidation(CreateInvalidationRequest createInvalidationRequest) {
        ExecutionContext executionContext = createExecutionContext(createInvalidationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateInvalidationRequest> request = null;
        Response<CreateInvalidationResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateInvalidationRequestMarshaller().marshall(createInvalidationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateInvalidationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Delete a streaming distribution.
     * </p>
     *
     * @param deleteStreamingDistributionRequest Container for the necessary
     *           parameters to execute the DeleteStreamingDistribution service method
     *           on AmazonCloudFront.
     * 
     * 
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchStreamingDistributionException
     * @throws StreamingDistributionNotDisabledException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStreamingDistribution(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteStreamingDistributionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteStreamingDistributionRequestMarshaller().marshall(deleteStreamingDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     *
     * @param getDistributionConfigRequest Container for the necessary
     *           parameters to execute the GetDistributionConfig service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the GetDistributionConfig service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDistributionConfigResult getDistributionConfig(GetDistributionConfigRequest getDistributionConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getDistributionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetDistributionConfigRequest> request = null;
        Response<GetDistributionConfigResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetDistributionConfigRequestMarshaller().marshall(getDistributionConfigRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetDistributionConfigResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     *
     * @param updateStreamingDistributionRequest Container for the necessary
     *           parameters to execute the UpdateStreamingDistribution service method
     *           on AmazonCloudFront.
     * 
     * @return The response from the UpdateStreamingDistribution service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws MissingBodyException
     * @throws PreconditionFailedException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws TooManyTrustedSignersException
     * @throws NoSuchStreamingDistributionException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStreamingDistributionResult updateStreamingDistribution(UpdateStreamingDistributionRequest updateStreamingDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateStreamingDistributionRequest> request = null;
        Response<UpdateStreamingDistributionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateStreamingDistributionRequestMarshaller().marshall(updateStreamingDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStreamingDistributionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     *
     * @param getDistributionRequest Container for the necessary parameters
     *           to execute the GetDistribution service method on AmazonCloudFront.
     * 
     * @return The response from the GetDistribution service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDistributionResult getDistribution(GetDistributionRequest getDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(getDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetDistributionRequest> request = null;
        Response<GetDistributionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetDistributionRequestMarshaller().marshall(getDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetDistributionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * List invalidation batches.
     * </p>
     *
     * @param listInvalidationsRequest Container for the necessary parameters
     *           to execute the ListInvalidations service method on AmazonCloudFront.
     * 
     * @return The response from the ListInvalidations service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchDistributionException
     * @throws InvalidArgumentException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInvalidationsResult listInvalidations(ListInvalidationsRequest listInvalidationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listInvalidationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListInvalidationsRequest> request = null;
        Response<ListInvalidationsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListInvalidationsRequestMarshaller().marshall(listInvalidationsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListInvalidationsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Update a distribution.
     * </p>
     *
     * @param updateDistributionRequest Container for the necessary
     *           parameters to execute the UpdateDistribution service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the UpdateDistribution service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidResponseCodeException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws NoSuchOriginException
     * @throws PreconditionFailedException
     * @throws InconsistentQuantitiesException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyTrustedSignersException
     * @throws NoSuchDistributionException
     * @throws InvalidViewerCertificateException
     * @throws TooManyOriginsException
     * @throws InvalidRequiredProtocolException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws InvalidForwardCookiesException
     * @throws TrustedSignerDoesNotExistException
     * @throws TooManyCertificatesException
     * @throws InvalidRelativePathException
     * @throws InvalidErrorCodeException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDistributionResult updateDistribution(UpdateDistributionRequest updateDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateDistributionRequest> request = null;
        Response<UpdateDistributionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateDistributionRequestMarshaller().marshall(updateDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateDistributionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Delete a distribution.
     * </p>
     *
     * @param deleteDistributionRequest Container for the necessary
     *           parameters to execute the DeleteDistribution service method on
     *           AmazonCloudFront.
     * 
     * 
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchDistributionException
     * @throws DistributionNotDisabledException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDistribution(DeleteDistributionRequest deleteDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteDistributionRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteDistributionRequestMarshaller().marshall(deleteDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Create a new origin access identity.
     * </p>
     *
     * @param createCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           CreateCloudFrontOriginAccessIdentity service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the CreateCloudFrontOriginAccessIdentity
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     * @throws MissingBodyException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(createCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateCloudFrontOriginAccessIdentityRequest> request = null;
        Response<CreateCloudFrontOriginAccessIdentityResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateCloudFrontOriginAccessIdentityRequestMarshaller().marshall(createCloudFrontOriginAccessIdentityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateCloudFrontOriginAccessIdentityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Get the information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionRequest Container for the necessary
     *           parameters to execute the GetStreamingDistribution service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the GetStreamingDistribution service method,
     *         as returned by AmazonCloudFront.
     * 
     * @throws NoSuchStreamingDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest getStreamingDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(getStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetStreamingDistributionRequest> request = null;
        Response<GetStreamingDistributionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetStreamingDistributionRequestMarshaller().marshall(getStreamingDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetStreamingDistributionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * List distributions.
     * </p>
     *
     * @param listDistributionsRequest Container for the necessary parameters
     *           to execute the ListDistributions service method on AmazonCloudFront.
     * 
     * @return The response from the ListDistributions service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws InvalidArgumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDistributionsResult listDistributions(ListDistributionsRequest listDistributionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listDistributionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListDistributionsRequest> request = null;
        Response<ListDistributionsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListDistributionsRequestMarshaller().marshall(listDistributionsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListDistributionsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Create a new streaming distribution.
     * </p>
     *
     * @param createStreamingDistributionRequest Container for the necessary
     *           parameters to execute the CreateStreamingDistribution service method
     *           on AmazonCloudFront.
     * 
     * @return The response from the CreateStreamingDistribution service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws TooManyTrustedSignersException
     * @throws MissingBodyException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws CNAMEAlreadyExistsException
     * @throws AccessDeniedException
     * @throws TooManyStreamingDistributionsException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidOriginException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest createStreamingDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(createStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateStreamingDistributionRequest> request = null;
        Response<CreateStreamingDistributionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateStreamingDistributionRequestMarshaller().marshall(createStreamingDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStreamingDistributionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * List origin access identities.
     * </p>
     *
     * @param listCloudFrontOriginAccessIdentitiesRequest Container for the
     *           necessary parameters to execute the
     *           ListCloudFrontOriginAccessIdentities service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the ListCloudFrontOriginAccessIdentities
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidArgumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest) {
        ExecutionContext executionContext = createExecutionContext(listCloudFrontOriginAccessIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListCloudFrontOriginAccessIdentitiesRequest> request = null;
        Response<ListCloudFrontOriginAccessIdentitiesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListCloudFrontOriginAccessIdentitiesRequestMarshaller().marshall(listCloudFrontOriginAccessIdentitiesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListCloudFrontOriginAccessIdentitiesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     *
     * @param deleteCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           DeleteCloudFrontOriginAccessIdentity service method on
     *           AmazonCloudFront.
     * 
     * 
     * @throws InvalidIfMatchVersionException
     * @throws CloudFrontOriginAccessIdentityInUseException
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCloudFrontOriginAccessIdentity(DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteCloudFrontOriginAccessIdentityRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteCloudFrontOriginAccessIdentityRequestMarshaller().marshall(deleteCloudFrontOriginAccessIdentityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Create a new distribution.
     * </p>
     *
     * @param createDistributionRequest Container for the necessary
     *           parameters to execute the CreateDistribution service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the CreateDistribution service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidResponseCodeException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws InvalidForwardCookiesException
     * @throws TooManyDistributionsException
     * @throws NoSuchOriginException
     * @throws InconsistentQuantitiesException
     * @throws InvalidArgumentException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidOriginException
     * @throws TooManyCertificatesException
     * @throws InvalidRelativePathException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyTrustedSignersException
     * @throws InvalidErrorCodeException
     * @throws InvalidViewerCertificateException
     * @throws AccessDeniedException
     * @throws TooManyOriginsException
     * @throws DistributionAlreadyExistsException
     * @throws InvalidRequiredProtocolException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDistributionResult createDistribution(CreateDistributionRequest createDistributionRequest) {
        ExecutionContext executionContext = createExecutionContext(createDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateDistributionRequest> request = null;
        Response<CreateDistributionResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateDistributionRequestMarshaller().marshall(createDistributionRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateDistributionResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     *
     * @param getInvalidationRequest Container for the necessary parameters
     *           to execute the GetInvalidation service method on AmazonCloudFront.
     * 
     * @return The response from the GetInvalidation service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchInvalidationException
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetInvalidationResult getInvalidation(GetInvalidationRequest getInvalidationRequest) {
        ExecutionContext executionContext = createExecutionContext(getInvalidationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetInvalidationRequest> request = null;
        Response<GetInvalidationResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetInvalidationRequestMarshaller().marshall(getInvalidationRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetInvalidationResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityConfigRequest Container for
     *           the necessary parameters to execute the
     *           GetCloudFrontOriginAccessIdentityConfig service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the GetCloudFrontOriginAccessIdentityConfig
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getCloudFrontOriginAccessIdentityConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetCloudFrontOriginAccessIdentityConfigRequest> request = null;
        Response<GetCloudFrontOriginAccessIdentityConfigResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetCloudFrontOriginAccessIdentityConfigRequestMarshaller().marshall(getCloudFrontOriginAccessIdentityConfigRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the GetCloudFrontOriginAccessIdentity
     *           service method on AmazonCloudFront.
     * 
     * @return The response from the GetCloudFrontOriginAccessIdentity
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest) {
        ExecutionContext executionContext = createExecutionContext(getCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetCloudFrontOriginAccessIdentityRequest> request = null;
        Response<GetCloudFrontOriginAccessIdentityResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetCloudFrontOriginAccessIdentityRequestMarshaller().marshall(getCloudFrontOriginAccessIdentityRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetCloudFrontOriginAccessIdentityResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionConfigRequest Container for the
     *           necessary parameters to execute the GetStreamingDistributionConfig
     *           service method on AmazonCloudFront.
     * 
     * @return The response from the GetStreamingDistributionConfig service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws NoSuchStreamingDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStreamingDistributionConfigResult getStreamingDistributionConfig(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest) {
        ExecutionContext executionContext = createExecutionContext(getStreamingDistributionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetStreamingDistributionConfigRequest> request = null;
        Response<GetStreamingDistributionConfigResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetStreamingDistributionConfigRequestMarshaller().marshall(getStreamingDistributionConfigRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetStreamingDistributionConfigResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
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
        
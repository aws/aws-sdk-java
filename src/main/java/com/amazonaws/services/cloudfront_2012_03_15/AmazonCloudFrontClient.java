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
package com.amazonaws.services.cloudfront_2012_03_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.w3c.dom.Node;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.CloudFrontSigner;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.cloudfront_2012_03_15.model.AccessDeniedException;
import com.amazonaws.services.cloudfront_2012_03_15.model.BatchTooLargeException;
import com.amazonaws.services.cloudfront_2012_03_15.model.CNAMEAlreadyExistsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.CloudFrontOriginAccessIdentityAlreadyExistsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.CloudFrontOriginAccessIdentityInUseException;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateCloudFrontOriginAccessIdentityResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateInvalidationRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateInvalidationResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateStreamingDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.DeleteCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.DeleteDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.DeleteStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.DistributionAlreadyExistsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.DistributionNotDisabledException;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityConfigRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityConfigResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionConfigRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionConfigResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetInvalidationRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetInvalidationResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionConfigRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionConfigResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.IllegalUpdateException;
import com.amazonaws.services.cloudfront_2012_03_15.model.InvalidArgumentException;
import com.amazonaws.services.cloudfront_2012_03_15.model.InvalidDefaultRootObjectException;
import com.amazonaws.services.cloudfront_2012_03_15.model.InvalidIfMatchVersionException;
import com.amazonaws.services.cloudfront_2012_03_15.model.InvalidOriginAccessIdentityException;
import com.amazonaws.services.cloudfront_2012_03_15.model.InvalidOriginException;
import com.amazonaws.services.cloudfront_2012_03_15.model.InvalidRequiredProtocolException;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListCloudFrontOriginAccessIdentitiesRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListCloudFrontOriginAccessIdentitiesResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListDistributionsRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListDistributionsResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListInvalidationsRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListInvalidationsResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListStreamingDistributionsRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListStreamingDistributionsResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.MissingBodyException;
import com.amazonaws.services.cloudfront_2012_03_15.model.NoSuchCloudFrontOriginAccessIdentityException;
import com.amazonaws.services.cloudfront_2012_03_15.model.NoSuchDistributionException;
import com.amazonaws.services.cloudfront_2012_03_15.model.NoSuchInvalidationException;
import com.amazonaws.services.cloudfront_2012_03_15.model.NoSuchStreamingDistributionException;
import com.amazonaws.services.cloudfront_2012_03_15.model.PreconditionFailedException;
import com.amazonaws.services.cloudfront_2012_03_15.model.StreamingDistributionAlreadyExistsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.StreamingDistributionNotDisabledException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyCloudFrontOriginAccessIdentitiesException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyDistributionCNAMEsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyDistributionsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyInvalidationsInProgressException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyStreamingDistributionCNAMEsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyStreamingDistributionsException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TooManyTrustedSignersException;
import com.amazonaws.services.cloudfront_2012_03_15.model.TrustedSignerDoesNotExistException;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateCloudFrontOriginAccessIdentityResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateStreamingDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.AccessDeniedExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.BatchTooLargeExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CNAMEAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CloudFrontOriginAccessIdentityAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CloudFrontOriginAccessIdentityInUseExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateCloudFrontOriginAccessIdentityRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateCloudFrontOriginAccessIdentityResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateDistributionResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateInvalidationRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateInvalidationResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateStreamingDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.CreateStreamingDistributionResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.DeleteCloudFrontOriginAccessIdentityRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.DeleteDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.DeleteStreamingDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.DistributionAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.DistributionNotDisabledExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetCloudFrontOriginAccessIdentityConfigRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetCloudFrontOriginAccessIdentityRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetCloudFrontOriginAccessIdentityResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetDistributionConfigRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetDistributionConfigResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetDistributionResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetInvalidationRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetInvalidationResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetStreamingDistributionConfigRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetStreamingDistributionConfigResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetStreamingDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.GetStreamingDistributionResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.IllegalUpdateExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.InvalidArgumentExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.InvalidDefaultRootObjectExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.InvalidIfMatchVersionExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.InvalidOriginAccessIdentityExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.InvalidOriginExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.InvalidRequiredProtocolExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListCloudFrontOriginAccessIdentitiesRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListCloudFrontOriginAccessIdentitiesResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListDistributionsRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListDistributionsResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListInvalidationsRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListInvalidationsResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListStreamingDistributionsRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.ListStreamingDistributionsResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.MissingBodyExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.NoSuchCloudFrontOriginAccessIdentityExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.NoSuchDistributionExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.NoSuchInvalidationExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.NoSuchStreamingDistributionExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.PreconditionFailedExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.StreamingDistributionAlreadyExistsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.StreamingDistributionNotDisabledExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyCloudFrontOriginAccessIdentitiesExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyDistributionCNAMEsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyDistributionsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyInvalidationsInProgressExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyStreamingDistributionCNAMEsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyStreamingDistributionsExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TooManyTrustedSignersExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.TrustedSignerDoesNotExistExceptionUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.UpdateCloudFrontOriginAccessIdentityRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.UpdateCloudFrontOriginAccessIdentityResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.UpdateDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.UpdateDistributionResultStaxUnmarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.UpdateStreamingDistributionRequestMarshaller;
import com.amazonaws.services.cloudfront_2012_03_15.model.transform.UpdateStreamingDistributionResultStaxUnmarshaller;
import com.amazonaws.transform.StandardErrorUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;


/**
 * Client for accessing AmazonCloudFront.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 *
 * @deprecated The Amazon CloudFront client in this namespace uses an older API version.
 *             This client is available to help customers as they migrate to the new API version.
 */
@Deprecated
public class AmazonCloudFrontClient extends AmazonWebServiceClient implements AmazonCloudFront {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonCloudFront exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();


    /** AWS signer for authenticating requests. */
    private CloudFrontSigner signer;


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
        exceptionUnmarshallers.add(new TooManyDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PreconditionFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CNAMEAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrustedSignerDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTrustedSignersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequiredProtocolExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalUpdateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCloudFrontOriginAccessIdentitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyInvalidationsInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDefaultRootObjectExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIfMatchVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchInvalidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingBodyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchCloudFrontOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchStreamingDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionCNAMEsExceptionUnmarshaller());

        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("cloudfront.amazonaws.com/");

        signer = new CloudFrontSigner();


        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services.cloudfront_2012_03_15request.handlers"));
    }
    
    /* (non-Javadoc)
     * @see com.amazonaws.AmazonWebServiceClient#getServiceAbbreviation()
     */
    @Override
    protected String getServiceAbbreviation() {
        return "cloudfront";
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
    public void deleteCloudFrontOriginAccessIdentity(DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteCloudFrontOriginAccessIdentityRequest> request = new DeleteCloudFrontOriginAccessIdentityRequestMarshaller().marshall(deleteCloudFrontOriginAccessIdentityRequest);
        invoke(request, null);
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
    public GetStreamingDistributionConfigResult getStreamingDistributionConfig(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetStreamingDistributionConfigRequest> request = new GetStreamingDistributionConfigRequestMarshaller().marshall(getStreamingDistributionConfigRequest);
        return invoke(request, new GetStreamingDistributionConfigResultStaxUnmarshaller());
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
    public GetInvalidationResult getInvalidation(GetInvalidationRequest getInvalidationRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetInvalidationRequest> request = new GetInvalidationRequestMarshaller().marshall(getInvalidationRequest);
        return invoke(request, new GetInvalidationResultStaxUnmarshaller());
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
    public void deleteStreamingDistribution(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteStreamingDistributionRequest> request = new DeleteStreamingDistributionRequestMarshaller().marshall(deleteStreamingDistributionRequest);
        invoke(request, null);
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
    public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest createStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<CreateStreamingDistributionRequest> request = new CreateStreamingDistributionRequestMarshaller().marshall(createStreamingDistributionRequest);
        return invoke(request, new CreateStreamingDistributionResultStaxUnmarshaller());
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
     * @throws InvalidDefaultRootObjectException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws TooManyDistributionsException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidOriginException
     * @throws TooManyTrustedSignersException
     * @throws AccessDeniedException
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
    public CreateDistributionResult createDistribution(CreateDistributionRequest createDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<CreateDistributionRequest> request = new CreateDistributionRequestMarshaller().marshall(createDistributionRequest);
        return invoke(request, new CreateDistributionResultStaxUnmarshaller());
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
    public void deleteDistribution(DeleteDistributionRequest deleteDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteDistributionRequest> request = new DeleteDistributionRequestMarshaller().marshall(deleteDistributionRequest);
        invoke(request, null);
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
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws PreconditionFailedException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws TooManyTrustedSignersException
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
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
    public UpdateDistributionResult updateDistribution(UpdateDistributionRequest updateDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateDistributionRequest> request = new UpdateDistributionRequestMarshaller().marshall(updateDistributionRequest);
        return invoke(request, new UpdateDistributionResultStaxUnmarshaller());
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
     * @throws TooManyTrustedSignersException
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws MissingBodyException
     * @throws NoSuchStreamingDistributionException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStreamingDistributionResult updateStreamingDistribution(UpdateStreamingDistributionRequest updateStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateStreamingDistributionRequest> request = new UpdateStreamingDistributionRequestMarshaller().marshall(updateStreamingDistributionRequest);
        return invoke(request, new UpdateStreamingDistributionResultStaxUnmarshaller());
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
    public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<CreateCloudFrontOriginAccessIdentityRequest> request = new CreateCloudFrontOriginAccessIdentityRequestMarshaller().marshall(createCloudFrontOriginAccessIdentityRequest);
        return invoke(request, new CreateCloudFrontOriginAccessIdentityResultStaxUnmarshaller());
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
    public GetDistributionResult getDistribution(GetDistributionRequest getDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetDistributionRequest> request = new GetDistributionRequestMarshaller().marshall(getDistributionRequest);
        return invoke(request, new GetDistributionResultStaxUnmarshaller());
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
    public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetCloudFrontOriginAccessIdentityConfigRequest> request = new GetCloudFrontOriginAccessIdentityConfigRequestMarshaller().marshall(getCloudFrontOriginAccessIdentityConfigRequest);
        return invoke(request, new GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller());
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
    public GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest getStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetStreamingDistributionRequest> request = new GetStreamingDistributionRequestMarshaller().marshall(getStreamingDistributionRequest);
        return invoke(request, new GetStreamingDistributionResultStaxUnmarshaller());
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
    public ListDistributionsResult listDistributions(ListDistributionsRequest listDistributionsRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<ListDistributionsRequest> request = new ListDistributionsRequestMarshaller().marshall(listDistributionsRequest);
        return invoke(request, new ListDistributionsResultStaxUnmarshaller());
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateCloudFrontOriginAccessIdentityRequest> request = new UpdateCloudFrontOriginAccessIdentityRequestMarshaller().marshall(updateCloudFrontOriginAccessIdentityRequest);
        return invoke(request, new UpdateCloudFrontOriginAccessIdentityResultStaxUnmarshaller());
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
    public GetDistributionConfigResult getDistributionConfig(GetDistributionConfigRequest getDistributionConfigRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetDistributionConfigRequest> request = new GetDistributionConfigRequestMarshaller().marshall(getDistributionConfigRequest);
        return invoke(request, new GetDistributionConfigResultStaxUnmarshaller());
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
    public GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<GetCloudFrontOriginAccessIdentityRequest> request = new GetCloudFrontOriginAccessIdentityRequestMarshaller().marshall(getCloudFrontOriginAccessIdentityRequest);
        return invoke(request, new GetCloudFrontOriginAccessIdentityResultStaxUnmarshaller());
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInvalidationResult createInvalidation(CreateInvalidationRequest createInvalidationRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<CreateInvalidationRequest> request = new CreateInvalidationRequestMarshaller().marshall(createInvalidationRequest);
        return invoke(request, new CreateInvalidationResultStaxUnmarshaller());
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
    public ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<ListCloudFrontOriginAccessIdentitiesRequest> request = new ListCloudFrontOriginAccessIdentitiesRequestMarshaller().marshall(listCloudFrontOriginAccessIdentitiesRequest);
        return invoke(request, new ListCloudFrontOriginAccessIdentitiesResultStaxUnmarshaller());
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
    public ListStreamingDistributionsResult listStreamingDistributions(ListStreamingDistributionsRequest listStreamingDistributionsRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<ListStreamingDistributionsRequest> request = new ListStreamingDistributionsRequestMarshaller().marshall(listStreamingDistributionsRequest);
        return invoke(request, new ListStreamingDistributionsResultStaxUnmarshaller());
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
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInvalidationsResult listInvalidations(ListInvalidationsRequest listInvalidationsRequest)
            throws AmazonServiceException, AmazonClientException {
        Request<ListInvalidationsRequest> request = new ListInvalidationsRequestMarshaller().marshall(listInvalidationsRequest);
        return invoke(request, new ListInvalidationsResultStaxUnmarshaller());
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

        Response<X> res = client.execute(request, responseHandler, errorResponseHandler, executionContext);
        return res.getAwsResponse();
    }
}

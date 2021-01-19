/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfront;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.cloudfront.AmazonCloudFrontClientBuilder;
import com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.services.cloudfront.model.transform.*;

/**
 * Client for accessing CloudFront. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about
 * CloudFront API actions, data types, and errors. For detailed information about CloudFront features, see the <i>Amazon
 * CloudFront Developer Guide</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFrontClient extends AmazonWebServiceClient implements AmazonCloudFront {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudFront.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudfront";

    private volatile AmazonCloudFrontWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on CloudFront. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudFrontClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudFrontClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudFront (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudFrontClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudFrontClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudFrontClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudFrontClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudFront (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonCloudFrontClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudFrontClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudFront (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonCloudFrontClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to CloudFront (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudFrontClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFrontClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFrontClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudFrontClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudFrontClientBuilder builder() {
        return AmazonCloudFrontClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on CloudFront using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new StreamingDistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchInvalidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchFieldLevelEncryptionConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OriginRequestPolicyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyKeyGroupsAssociatedToDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidMinimumProtocolVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyInvalidationsInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionConfigsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPublicKeysExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCacheBehaviorsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingBodyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTTLOrderExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsWithSingleFunctionARNExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RealtimeLogConfigInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidResponseCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionConfigAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginKeepaliveTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyQueryStringParametersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionEncryptionEntitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionConfigInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchRealtimeLogConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidProtocolSettingsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidForwardCookiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPublicKeysInKeyGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CNAMEAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalUpdateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCookieNamesInWhiteListExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrustedKeyGroupDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidViewerCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCachePoliciesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyQueryStringsInCachePolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CachePolicyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDefaultRootObjectExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCloudFrontOriginAccessIdentitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionContentTypeProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRelativePathExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsWithLambdaAssociationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHeadersForS3OriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new RealtimeLogConfigAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsAssociatedToOriginRequestPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CannotChangeImmutablePublicKeyFieldsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionQueryArgProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCookiesInOriginRequestPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalDeleteExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGeoRestrictionParameterExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TrustedSignerDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidWebACLIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyHeadersInForwardedValuesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginReadTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OriginRequestPolicyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsAssociatedToKeyGroupExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidErrorCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionFieldPatternsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequiredProtocolExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchOriginRequestPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyQueryStringsInOriginRequestPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTrustedSignersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PublicKeyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PreconditionFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyKeyGroupsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CachePolicyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginCustomHeadersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLocationCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileSizeExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCertificatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueryArgProfileEmptyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyRealtimeLogConfigsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidQueryStringParametersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyHeadersInCachePolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchFieldLevelEncryptionProfileExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchResourceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InconsistentQuantitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLambdaFunctionAssociationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLambdaFunctionAssociationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginGroupsPerDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCookiesInCachePolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginRequestPoliciesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchCachePolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new KeyGroupAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchStreamingDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsAssociatedToFieldLevelEncryptionConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsAssociatedToCachePolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PublicKeyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIfMatchVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTaggingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyHeadersInOriginRequestPolicyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchCloudFrontOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.cloudfront.model.AmazonCloudFrontException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://cloudfront.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudfront/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudfront/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a cache policy.
     * </p>
     * <p>
     * After you create a cache policy, you can attach it to one or more cache behaviors. When it’s attached to a cache
     * behavior, the cache policy determines the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values that CloudFront includes in the <i>cache key</i>. These values can include HTTP headers, cookies, and
     * URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.
     * </p>
     * </li>
     * <li>
     * <p>
     * The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront
     * cache.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The headers, cookies, and query strings that are included in the cache key are automatically included in requests
     * that CloudFront sends to the origin. CloudFront sends a request when it can’t find an object in its cache that
     * matches the request’s cache key. If you want to send values to the origin but <i>not</i> include them in the
     * cache key, use <code>OriginRequestPolicy</code>.
     * </p>
     * <p>
     * For more information about cache policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html"
     * >Controlling the cache key</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCachePolicyRequest
     * @return Result of the CreateCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws CachePolicyAlreadyExistsException
     *         A cache policy with this name already exists. You must provide a unique name. To modify an existing cache
     *         policy, use <code>UpdateCachePolicy</code>.
     * @throws TooManyCachePoliciesException
     *         You have reached the maximum number of cache policies for this AWS account. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyHeadersInCachePolicyException
     *         The number of headers in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInCachePolicyException
     *         The number of cookies in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInCachePolicyException
     *         The number of query strings in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.CreateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCachePolicyResult createCachePolicy(CreateCachePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCachePolicy(request);
    }

    @SdkInternalApi
    final CreateCachePolicyResult executeCreateCachePolicy(CreateCachePolicyRequest createCachePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createCachePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCachePolicyRequest> request = null;
        Response<CreateCachePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCachePolicyRequestMarshaller().marshall(super.beforeMarshalling(createCachePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCachePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateCachePolicyResult> responseHandler = new StaxResponseHandler<CreateCachePolicyResult>(
                    new CreateCachePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity (OAI). An origin access identity is a special
     *        CloudFront user that you can associate with Amazon S3 origins, so that you can secure all or just some of
     *        your Amazon S3 content. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        > Restricting Access to Amazon S3 Content by Using an Origin Access Identity</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.
     * @return Result of the CreateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     *         If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *         identity but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *         original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     *         Processing your request would cause you to exceed the maximum number of origin access identities allowed.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCloudFrontOriginAccessIdentity(request);
    }

    @SdkInternalApi
    final CreateCloudFrontOriginAccessIdentityResult executeCreateCloudFrontOriginAccessIdentity(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(createCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCloudFrontOriginAccessIdentityRequest> request = null;
        Response<CreateCloudFrontOriginAccessIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCloudFrontOriginAccessIdentityRequestMarshaller().marshall(super
                        .beforeMarshalling(createCloudFrontOriginAccessIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCloudFrontOriginAccessIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateCloudFrontOriginAccessIdentityResult> responseHandler = new StaxResponseHandler<CreateCloudFrontOriginAccessIdentityResult>(
                    new CreateCloudFrontOriginAccessIdentityResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to
     * be delivered from, and the details about how to track and manage content delivery. Send a <code>POST</code>
     * request to the <code>/<i>CloudFront API version</i>/distribution</code>/<code>distribution ID</code> resource.
     * </p>
     * <important>
     * <p>
     * When you update a distribution, there are more required fields than when you create a distribution. When you
     * update your distribution by using <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_UpdateDistribution.html"
     * >UpdateDistribution</a>, follow the steps included in the documentation to get the current configuration and then
     * make your updates. This helps to make sure that you include all of the required fields. To view a summary, see <a
     * href
     * ="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </important>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return Result of the CreateDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution with is associated with another
     *         distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     *         A viewer certificate specified is not valid.
     * @throws InvalidMinimumProtocolVersionException
     *         The minimum protocol version specified is not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     *         An invalid error code was specified.
     * @throws InvalidResponseCodeException
     *         A response code is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyOriginGroupsPerDistributionException
     *         Processing your request would cause you to exceed the maximum number of origin groups allowed.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     *         Your request contains too many headers in forwarded values.
     * @throws InvalidHeadersForS3OriginException
     *         The headers specified are not valid for an Amazon S3 origin.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     *         The location code specified is not valid.
     * @throws InvalidGeoRestrictionParameterException
     *         The specified geo restriction parameter is not valid.
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     *         The TTL order specified is not valid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @throws TooManyOriginCustomHeadersException
     *         Your request contains too many origin custom headers.
     * @throws TooManyQueryStringParametersException
     *         Your request contains too many query string parameters.
     * @throws InvalidQueryStringParametersException
     *         The query string parameters specified are not valid.
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyDistributionsWithSingleFunctionARNException
     *         The maximum number of distributions have been associated with the specified Lambda function.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     *         The read timeout specified for the origin is not valid.
     * @throws InvalidOriginKeepaliveTimeoutException
     *         The keep alive timeout specified for the origin is not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws TooManyDistributionsAssociatedToCachePolicyException
     *         The maximum number of distributions have been associated with the specified cache policy. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws TooManyDistributionsAssociatedToOriginRequestPolicyException
     *         The maximum number of distributions have been associated with the specified origin request policy. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyDistributionsAssociatedToKeyGroupException
     *         The number of distributions that reference this key group is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyKeyGroupsAssociatedToDistributionException
     *         The number of key groups referenced by this distribution is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TrustedKeyGroupDoesNotExistException
     *         The specified key group does not exist.
     * @sample AmazonCloudFront.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDistributionResult createDistribution(CreateDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDistribution(request);
    }

    @SdkInternalApi
    final CreateDistributionResult executeCreateDistribution(CreateDistributionRequest createDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(createDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistributionRequest> request = null;
        Response<CreateDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDistributionRequestMarshaller().marshall(super.beforeMarshalling(createDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateDistributionResult> responseHandler = new StaxResponseHandler<CreateDistributionResult>(
                    new CreateDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new distribution with tags.
     * </p>
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags.
     * @return Result of the CreateDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution with is associated with another
     *         distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     *         A viewer certificate specified is not valid.
     * @throws InvalidMinimumProtocolVersionException
     *         The minimum protocol version specified is not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     *         An invalid error code was specified.
     * @throws InvalidResponseCodeException
     *         A response code is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyOriginGroupsPerDistributionException
     *         Processing your request would cause you to exceed the maximum number of origin groups allowed.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     *         Your request contains too many headers in forwarded values.
     * @throws InvalidHeadersForS3OriginException
     *         The headers specified are not valid for an Amazon S3 origin.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     *         The location code specified is not valid.
     * @throws InvalidGeoRestrictionParameterException
     *         The specified geo restriction parameter is not valid.
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     *         The TTL order specified is not valid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @throws TooManyOriginCustomHeadersException
     *         Your request contains too many origin custom headers.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws TooManyQueryStringParametersException
     *         Your request contains too many query string parameters.
     * @throws InvalidQueryStringParametersException
     *         The query string parameters specified are not valid.
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyDistributionsWithSingleFunctionARNException
     *         The maximum number of distributions have been associated with the specified Lambda function.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     *         The read timeout specified for the origin is not valid.
     * @throws InvalidOriginKeepaliveTimeoutException
     *         The keep alive timeout specified for the origin is not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws TooManyDistributionsAssociatedToCachePolicyException
     *         The maximum number of distributions have been associated with the specified cache policy. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws TooManyDistributionsAssociatedToOriginRequestPolicyException
     *         The maximum number of distributions have been associated with the specified origin request policy. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyDistributionsAssociatedToKeyGroupException
     *         The number of distributions that reference this key group is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyKeyGroupsAssociatedToDistributionException
     *         The number of key groups referenced by this distribution is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TrustedKeyGroupDoesNotExistException
     *         The specified key group does not exist.
     * @sample AmazonCloudFront.CreateDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDistributionWithTags(request);
    }

    @SdkInternalApi
    final CreateDistributionWithTagsResult executeCreateDistributionWithTags(CreateDistributionWithTagsRequest createDistributionWithTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createDistributionWithTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDistributionWithTagsRequest> request = null;
        Response<CreateDistributionWithTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDistributionWithTagsRequestMarshaller().marshall(super.beforeMarshalling(createDistributionWithTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDistributionWithTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateDistributionWithTagsResult> responseHandler = new StaxResponseHandler<CreateDistributionWithTagsResult>(
                    new CreateDistributionWithTagsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new field-level encryption configuration.
     * </p>
     * 
     * @param createFieldLevelEncryptionConfigRequest
     * @return Result of the CreateFieldLevelEncryptionConfig operation returned by the service.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws FieldLevelEncryptionConfigAlreadyExistsException
     *         The specified configuration for field-level encryption already exists.
     * @throws TooManyFieldLevelEncryptionConfigsException
     *         The maximum number of configurations for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     *         The maximum number of query arg profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     *         The maximum number of content type profiles for field-level encryption have been created.
     * @throws QueryArgProfileEmptyException
     *         No profile specified for the field-level encryption query argument.
     * @sample AmazonCloudFront.CreateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFieldLevelEncryptionConfigResult createFieldLevelEncryptionConfig(CreateFieldLevelEncryptionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFieldLevelEncryptionConfig(request);
    }

    @SdkInternalApi
    final CreateFieldLevelEncryptionConfigResult executeCreateFieldLevelEncryptionConfig(
            CreateFieldLevelEncryptionConfigRequest createFieldLevelEncryptionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createFieldLevelEncryptionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFieldLevelEncryptionConfigRequest> request = null;
        Response<CreateFieldLevelEncryptionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFieldLevelEncryptionConfigRequestMarshaller().marshall(super.beforeMarshalling(createFieldLevelEncryptionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFieldLevelEncryptionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateFieldLevelEncryptionConfigResult> responseHandler = new StaxResponseHandler<CreateFieldLevelEncryptionConfigResult>(
                    new CreateFieldLevelEncryptionConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a field-level encryption profile.
     * </p>
     * 
     * @param createFieldLevelEncryptionProfileRequest
     * @return Result of the CreateFieldLevelEncryptionProfile operation returned by the service.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws FieldLevelEncryptionProfileAlreadyExistsException
     *         The specified profile for field-level encryption already exists.
     * @throws FieldLevelEncryptionProfileSizeExceededException
     *         The maximum size of a profile for field-level encryption was exceeded.
     * @throws TooManyFieldLevelEncryptionProfilesException
     *         The maximum number of profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     *         The maximum number of encryption entities for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     *         The maximum number of field patterns for field-level encryption have been created.
     * @sample AmazonCloudFront.CreateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFieldLevelEncryptionProfileResult createFieldLevelEncryptionProfile(CreateFieldLevelEncryptionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFieldLevelEncryptionProfile(request);
    }

    @SdkInternalApi
    final CreateFieldLevelEncryptionProfileResult executeCreateFieldLevelEncryptionProfile(
            CreateFieldLevelEncryptionProfileRequest createFieldLevelEncryptionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createFieldLevelEncryptionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFieldLevelEncryptionProfileRequest> request = null;
        Response<CreateFieldLevelEncryptionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFieldLevelEncryptionProfileRequestMarshaller().marshall(super.beforeMarshalling(createFieldLevelEncryptionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFieldLevelEncryptionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateFieldLevelEncryptionProfileResult> responseHandler = new StaxResponseHandler<CreateFieldLevelEncryptionProfileResult>(
                    new CreateFieldLevelEncryptionProfileResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return Result of the CreateInvalidation operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws BatchTooLargeException
     *         Invalidation batch specified is too large.
     * @throws TooManyInvalidationsInProgressException
     *         You have exceeded the maximum number of allowable InProgress invalidation batch requests, or invalidation
     *         objects.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateInvalidation" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateInvalidationResult createInvalidation(CreateInvalidationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInvalidation(request);
    }

    @SdkInternalApi
    final CreateInvalidationResult executeCreateInvalidation(CreateInvalidationRequest createInvalidationRequest) {

        ExecutionContext executionContext = createExecutionContext(createInvalidationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInvalidationRequest> request = null;
        Response<CreateInvalidationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInvalidationRequestMarshaller().marshall(super.beforeMarshalling(createInvalidationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInvalidation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateInvalidationResult> responseHandler = new StaxResponseHandler<CreateInvalidationResult>(
                    new CreateInvalidationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a key group that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">CloudFront signed
     * URLs and signed cookies</a>.
     * </p>
     * <p>
     * To create a key group, you must specify at least one public key for the key group. After you create a key group,
     * you can reference it from one or more cache behaviors. When you reference a key group in a cache behavior,
     * CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or
     * cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or
     * cookie contains information about which public key CloudFront should use to verify the signature. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving private
     * content</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createKeyGroupRequest
     * @return Result of the CreateKeyGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws KeyGroupAlreadyExistsException
     *         A key group with this name already exists. You must provide a unique name. To modify an existing key
     *         group, use <code>UpdateKeyGroup</code>.
     * @throws TooManyKeyGroupsException
     *         You have reached the maximum number of key groups for this AWS account. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyPublicKeysInKeyGroupException
     *         The number of public keys in this key group is more than the maximum allowed. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.CreateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateKeyGroupResult createKeyGroup(CreateKeyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKeyGroup(request);
    }

    @SdkInternalApi
    final CreateKeyGroupResult executeCreateKeyGroup(CreateKeyGroupRequest createKeyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createKeyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyGroupRequest> request = null;
        Response<CreateKeyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyGroupRequestMarshaller().marshall(super.beforeMarshalling(createKeyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateKeyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateKeyGroupResult> responseHandler = new StaxResponseHandler<CreateKeyGroupResult>(
                    new CreateKeyGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables additional CloudWatch metrics for the specified CloudFront distribution. The additional metrics incur an
     * additional cost.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html#monitoring-console.distributions-additional"
     * >Viewing additional CloudFront distribution metrics</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createMonitoringSubscriptionRequest
     * @return Result of the CreateMonitoringSubscription operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @sample AmazonCloudFront.CreateMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateMonitoringSubscriptionResult createMonitoringSubscription(CreateMonitoringSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMonitoringSubscription(request);
    }

    @SdkInternalApi
    final CreateMonitoringSubscriptionResult executeCreateMonitoringSubscription(CreateMonitoringSubscriptionRequest createMonitoringSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(createMonitoringSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMonitoringSubscriptionRequest> request = null;
        Response<CreateMonitoringSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMonitoringSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(createMonitoringSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMonitoringSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateMonitoringSubscriptionResult> responseHandler = new StaxResponseHandler<CreateMonitoringSubscriptionResult>(
                    new CreateMonitoringSubscriptionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an origin request policy.
     * </p>
     * <p>
     * After you create an origin request policy, you can attach it to one or more cache behaviors. When it’s attached
     * to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it
     * sends to the origin. Each request that CloudFront sends to the origin includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The request body and the URL path (without the domain name) from the viewer request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The headers that CloudFront automatically includes in every origin request, including <code>Host</code>,
     * <code>User-Agent</code>, and <code>X-Amz-Cf-Id</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request
     * policy. These can include items from the viewer request and, in the case of headers, additional ones that are
     * added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * <p>
     * CloudFront sends a request when it can’t find a valid object in its cache that matches the request. If you want
     * to send values to the origin and also include them in the cache key, use <code>CachePolicy</code>.
     * </p>
     * <p>
     * For more information about origin request policies, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html"
     * >Controlling origin requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createOriginRequestPolicyRequest
     * @return Result of the CreateOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws OriginRequestPolicyAlreadyExistsException
     *         An origin request policy with this name already exists. You must provide a unique name. To modify an
     *         existing origin request policy, use <code>UpdateOriginRequestPolicy</code>.
     * @throws TooManyOriginRequestPoliciesException
     *         You have reached the maximum number of origin request policies for this AWS account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyHeadersInOriginRequestPolicyException
     *         The number of headers in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInOriginRequestPolicyException
     *         The number of cookies in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInOriginRequestPolicyException
     *         The number of query strings in the origin request policy exceeds the maximum. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.CreateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOriginRequestPolicyResult createOriginRequestPolicy(CreateOriginRequestPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOriginRequestPolicy(request);
    }

    @SdkInternalApi
    final CreateOriginRequestPolicyResult executeCreateOriginRequestPolicy(CreateOriginRequestPolicyRequest createOriginRequestPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createOriginRequestPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOriginRequestPolicyRequest> request = null;
        Response<CreateOriginRequestPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOriginRequestPolicyRequestMarshaller().marshall(super.beforeMarshalling(createOriginRequestPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOriginRequestPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateOriginRequestPolicyResult> responseHandler = new StaxResponseHandler<CreateOriginRequestPolicyResult>(
                    new CreateOriginRequestPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uploads a public key to CloudFront that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @param createPublicKeyRequest
     * @return Result of the CreatePublicKey operation returned by the service.
     * @throws PublicKeyAlreadyExistsException
     *         The specified public key already exists.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws TooManyPublicKeysException
     *         The maximum number of public keys for field-level encryption have been created. To create a new public
     *         key, delete one of the existing keys.
     * @sample AmazonCloudFront.CreatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePublicKeyResult createPublicKey(CreatePublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePublicKey(request);
    }

    @SdkInternalApi
    final CreatePublicKeyResult executeCreatePublicKey(CreatePublicKeyRequest createPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(createPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicKeyRequest> request = null;
        Response<CreatePublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePublicKeyRequestMarshaller().marshall(super.beforeMarshalling(createPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreatePublicKeyResult> responseHandler = new StaxResponseHandler<CreatePublicKeyResult>(
                    new CreatePublicKeyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a real-time log configuration.
     * </p>
     * <p>
     * After you create a real-time log configuration, you can attach it to one or more cache behaviors to send
     * real-time log data to the specified Amazon Kinesis data stream.
     * </p>
     * <p>
     * For more information about real-time log configurations, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html">Real-time logs</a>
     * in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createRealtimeLogConfigRequest
     * @return Result of the CreateRealtimeLogConfig operation returned by the service.
     * @throws RealtimeLogConfigAlreadyExistsException
     *         A real-time log configuration with this name already exists. You must provide a unique name. To modify an
     *         existing real-time log configuration, use <code>UpdateRealtimeLogConfig</code>.
     * @throws TooManyRealtimeLogConfigsException
     *         You have reached the maximum number of real-time log configurations for this AWS account. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.CreateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRealtimeLogConfigResult createRealtimeLogConfig(CreateRealtimeLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRealtimeLogConfig(request);
    }

    @SdkInternalApi
    final CreateRealtimeLogConfigResult executeCreateRealtimeLogConfig(CreateRealtimeLogConfigRequest createRealtimeLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createRealtimeLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRealtimeLogConfigRequest> request = null;
        Response<CreateRealtimeLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRealtimeLogConfigRequestMarshaller().marshall(super.beforeMarshalling(createRealtimeLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRealtimeLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateRealtimeLogConfigResult> responseHandler = new StaxResponseHandler<CreateRealtimeLogConfigResult>(
                    new CreateRealtimeLogConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return Result of the CreateStreamingDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws StreamingDistributionAlreadyExistsException
     *         The caller reference you attempted to create the streaming distribution with is associated with another
     *         distribution
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamingDistribution(request);
    }

    @SdkInternalApi
    final CreateStreamingDistributionResult executeCreateStreamingDistribution(CreateStreamingDistributionRequest createStreamingDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingDistributionRequest> request = null;
        Response<CreateStreamingDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamingDistributionRequestMarshaller().marshall(super.beforeMarshalling(createStreamingDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamingDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStreamingDistributionResult> responseHandler = new StaxResponseHandler<CreateStreamingDistributionResult>(
                    new CreateStreamingDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * This API is deprecated. Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information, <a href="http://forums.aws.amazon.com/ann.jspa?annID=7356">read the
     * announcement</a> on the Amazon CloudFront discussion forum.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return Result of the CreateStreamingDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws StreamingDistributionAlreadyExistsException
     *         The caller reference you attempted to create the streaming distribution with is associated with another
     *         distribution
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @sample AmazonCloudFront.CreateStreamingDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateStreamingDistributionWithTags"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStreamingDistributionWithTagsResult createStreamingDistributionWithTags(CreateStreamingDistributionWithTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamingDistributionWithTags(request);
    }

    @SdkInternalApi
    final CreateStreamingDistributionWithTagsResult executeCreateStreamingDistributionWithTags(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamingDistributionWithTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingDistributionWithTagsRequest> request = null;
        Response<CreateStreamingDistributionWithTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamingDistributionWithTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(createStreamingDistributionWithTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamingDistributionWithTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStreamingDistributionWithTagsResult> responseHandler = new StaxResponseHandler<CreateStreamingDistributionWithTagsResult>(
                    new CreateStreamingDistributionWithTagsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a cache policy.
     * </p>
     * <p>
     * You cannot delete a cache policy if it’s attached to a cache behavior. First update your distributions to remove
     * the cache policy from all cache behaviors, then delete the cache policy.
     * </p>
     * <p>
     * To delete a cache policy, you must provide the policy’s identifier and version. To get these values, you can use
     * <code>ListCachePolicies</code> or <code>GetCachePolicy</code>.
     * </p>
     * 
     * @param deleteCachePolicyRequest
     * @return Result of the DeleteCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws IllegalDeleteException
     *         You cannot delete a managed policy.
     * @throws CachePolicyInUseException
     *         Cannot delete the cache policy because it is attached to one or more cache behaviors.
     * @sample AmazonCloudFront.DeleteCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCachePolicyResult deleteCachePolicy(DeleteCachePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCachePolicy(request);
    }

    @SdkInternalApi
    final DeleteCachePolicyResult executeDeleteCachePolicy(DeleteCachePolicyRequest deleteCachePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCachePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCachePolicyRequest> request = null;
        Response<DeleteCachePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCachePolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteCachePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCachePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCachePolicyResult> responseHandler = new StaxResponseHandler<DeleteCachePolicyResult>(
                    new DeleteCachePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        Deletes a origin access identity.
     * @return Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws CloudFrontOriginAccessIdentityInUseException
     *         The Origin Access Identity specified is already in use.
     * @sample AmazonCloudFront.DeleteCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCloudFrontOriginAccessIdentityResult deleteCloudFrontOriginAccessIdentity(DeleteCloudFrontOriginAccessIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCloudFrontOriginAccessIdentity(request);
    }

    @SdkInternalApi
    final DeleteCloudFrontOriginAccessIdentityResult executeDeleteCloudFrontOriginAccessIdentity(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCloudFrontOriginAccessIdentityRequest> request = null;
        Response<DeleteCloudFrontOriginAccessIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCloudFrontOriginAccessIdentityRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteCloudFrontOriginAccessIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCloudFrontOriginAccessIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteCloudFrontOriginAccessIdentityResult> responseHandler = new StaxResponseHandler<DeleteCloudFrontOriginAccessIdentityResult>(
                    new DeleteCloudFrontOriginAccessIdentityResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param deleteDistributionRequest
     *        This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the
     *        following steps.</p>
     *        <p>
     *        <b>To delete a web distribution using the CloudFront API:</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Disable the web distribution
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution Config</code> request to get the current configuration and the
     *        <code>Etag</code> header for the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the XML document that was returned in the response to your <code>GET Distribution Config</code>
     *        request to change the value of <code>Enabled</code> to <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution.
     *        In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP
     *        <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when
     *        you submitted the <code>GET Distribution Config</code> request in Step 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution
     *        was successfully disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When
     *        propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header
     *        to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     *        <code>GET Distribution Config</code> request in Step 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was
     *        successfully deleted.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For information about deleting a distribution using the CloudFront console, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Result of the DeleteDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws DistributionNotDisabledException
     *         The specified CloudFront distribution is not disabled. You must disable the distribution before you can
     *         delete it.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDistributionResult deleteDistribution(DeleteDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDistribution(request);
    }

    @SdkInternalApi
    final DeleteDistributionResult executeDeleteDistribution(DeleteDistributionRequest deleteDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDistributionRequest> request = null;
        Response<DeleteDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDistributionRequestMarshaller().marshall(super.beforeMarshalling(deleteDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteDistributionResult> responseHandler = new StaxResponseHandler<DeleteDistributionResult>(
                    new DeleteDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove a field-level encryption configuration.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionConfigRequest
     * @return Result of the DeleteFieldLevelEncryptionConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionConfigInUseException
     *         The specified configuration for field-level encryption is in use.
     * @sample AmazonCloudFront.DeleteFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFieldLevelEncryptionConfigResult deleteFieldLevelEncryptionConfig(DeleteFieldLevelEncryptionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFieldLevelEncryptionConfig(request);
    }

    @SdkInternalApi
    final DeleteFieldLevelEncryptionConfigResult executeDeleteFieldLevelEncryptionConfig(
            DeleteFieldLevelEncryptionConfigRequest deleteFieldLevelEncryptionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFieldLevelEncryptionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFieldLevelEncryptionConfigRequest> request = null;
        Response<DeleteFieldLevelEncryptionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFieldLevelEncryptionConfigRequestMarshaller().marshall(super.beforeMarshalling(deleteFieldLevelEncryptionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFieldLevelEncryptionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteFieldLevelEncryptionConfigResult> responseHandler = new StaxResponseHandler<DeleteFieldLevelEncryptionConfigResult>(
                    new DeleteFieldLevelEncryptionConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove a field-level encryption profile.
     * </p>
     * 
     * @param deleteFieldLevelEncryptionProfileRequest
     * @return Result of the DeleteFieldLevelEncryptionProfile operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionProfileInUseException
     *         The specified profile for field-level encryption is in use.
     * @sample AmazonCloudFront.DeleteFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFieldLevelEncryptionProfileResult deleteFieldLevelEncryptionProfile(DeleteFieldLevelEncryptionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFieldLevelEncryptionProfile(request);
    }

    @SdkInternalApi
    final DeleteFieldLevelEncryptionProfileResult executeDeleteFieldLevelEncryptionProfile(
            DeleteFieldLevelEncryptionProfileRequest deleteFieldLevelEncryptionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFieldLevelEncryptionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFieldLevelEncryptionProfileRequest> request = null;
        Response<DeleteFieldLevelEncryptionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFieldLevelEncryptionProfileRequestMarshaller().marshall(super.beforeMarshalling(deleteFieldLevelEncryptionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFieldLevelEncryptionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteFieldLevelEncryptionProfileResult> responseHandler = new StaxResponseHandler<DeleteFieldLevelEncryptionProfileResult>(
                    new DeleteFieldLevelEncryptionProfileResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a key group.
     * </p>
     * <p>
     * You cannot delete a key group that is referenced in a cache behavior. First update your distributions to remove
     * the key group from all cache behaviors, then delete the key group.
     * </p>
     * <p>
     * To delete a key group, you must provide the key group’s identifier and version. To get these values, use
     * <code>ListKeyGroups</code> followed by <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * 
     * @param deleteKeyGroupRequest
     * @return Result of the DeleteKeyGroup operation returned by the service.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws ResourceInUseException
     *         Cannot delete this resource because it is in use.
     * @sample AmazonCloudFront.DeleteKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteKeyGroupResult deleteKeyGroup(DeleteKeyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKeyGroup(request);
    }

    @SdkInternalApi
    final DeleteKeyGroupResult executeDeleteKeyGroup(DeleteKeyGroupRequest deleteKeyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKeyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeyGroupRequest> request = null;
        Response<DeleteKeyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeyGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteKeyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKeyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteKeyGroupResult> responseHandler = new StaxResponseHandler<DeleteKeyGroupResult>(
                    new DeleteKeyGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables additional CloudWatch metrics for the specified CloudFront distribution.
     * </p>
     * 
     * @param deleteMonitoringSubscriptionRequest
     * @return Result of the DeleteMonitoringSubscription operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @sample AmazonCloudFront.DeleteMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteMonitoringSubscriptionResult deleteMonitoringSubscription(DeleteMonitoringSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMonitoringSubscription(request);
    }

    @SdkInternalApi
    final DeleteMonitoringSubscriptionResult executeDeleteMonitoringSubscription(DeleteMonitoringSubscriptionRequest deleteMonitoringSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMonitoringSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMonitoringSubscriptionRequest> request = null;
        Response<DeleteMonitoringSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMonitoringSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(deleteMonitoringSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMonitoringSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteMonitoringSubscriptionResult> responseHandler = new StaxResponseHandler<DeleteMonitoringSubscriptionResult>(
                    new DeleteMonitoringSubscriptionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an origin request policy.
     * </p>
     * <p>
     * You cannot delete an origin request policy if it’s attached to any cache behaviors. First update your
     * distributions to remove the origin request policy from all cache behaviors, then delete the origin request
     * policy.
     * </p>
     * <p>
     * To delete an origin request policy, you must provide the policy’s identifier and version. To get the identifier,
     * you can use <code>ListOriginRequestPolicies</code> or <code>GetOriginRequestPolicy</code>.
     * </p>
     * 
     * @param deleteOriginRequestPolicyRequest
     * @return Result of the DeleteOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws IllegalDeleteException
     *         You cannot delete a managed policy.
     * @throws OriginRequestPolicyInUseException
     *         Cannot delete the origin request policy because it is attached to one or more cache behaviors.
     * @sample AmazonCloudFront.DeleteOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOriginRequestPolicyResult deleteOriginRequestPolicy(DeleteOriginRequestPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOriginRequestPolicy(request);
    }

    @SdkInternalApi
    final DeleteOriginRequestPolicyResult executeDeleteOriginRequestPolicy(DeleteOriginRequestPolicyRequest deleteOriginRequestPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOriginRequestPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOriginRequestPolicyRequest> request = null;
        Response<DeleteOriginRequestPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOriginRequestPolicyRequestMarshaller().marshall(super.beforeMarshalling(deleteOriginRequestPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOriginRequestPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteOriginRequestPolicyResult> responseHandler = new StaxResponseHandler<DeleteOriginRequestPolicyResult>(
                    new DeleteOriginRequestPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove a public key you previously added to CloudFront.
     * </p>
     * 
     * @param deletePublicKeyRequest
     * @return Result of the DeletePublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws PublicKeyInUseException
     *         The specified public key is in use.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeletePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeletePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePublicKeyResult deletePublicKey(DeletePublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePublicKey(request);
    }

    @SdkInternalApi
    final DeletePublicKeyResult executeDeletePublicKey(DeletePublicKeyRequest deletePublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePublicKeyRequest> request = null;
        Response<DeletePublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePublicKeyRequestMarshaller().marshall(super.beforeMarshalling(deletePublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeletePublicKeyResult> responseHandler = new StaxResponseHandler<DeletePublicKeyResult>(
                    new DeletePublicKeyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a real-time log configuration.
     * </p>
     * <p>
     * You cannot delete a real-time log configuration if it’s attached to a cache behavior. First update your
     * distributions to remove the real-time log configuration from all cache behaviors, then delete the real-time log
     * configuration.
     * </p>
     * <p>
     * To delete a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name
     * (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to delete.
     * </p>
     * 
     * @param deleteRealtimeLogConfigRequest
     * @return Result of the DeleteRealtimeLogConfig operation returned by the service.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws RealtimeLogConfigInUseException
     *         Cannot delete the real-time log configuration because it is attached to one or more cache behaviors.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.DeleteRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRealtimeLogConfigResult deleteRealtimeLogConfig(DeleteRealtimeLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRealtimeLogConfig(request);
    }

    @SdkInternalApi
    final DeleteRealtimeLogConfigResult executeDeleteRealtimeLogConfig(DeleteRealtimeLogConfigRequest deleteRealtimeLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRealtimeLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRealtimeLogConfigRequest> request = null;
        Response<DeleteRealtimeLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRealtimeLogConfigRequestMarshaller().marshall(super.beforeMarshalling(deleteRealtimeLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRealtimeLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteRealtimeLogConfigResult> responseHandler = new StaxResponseHandler<DeleteRealtimeLogConfigResult>(
                    new DeleteRealtimeLogConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following
     * steps.
     * </p>
     * <p>
     * <b>To delete an RTMP distribution using the CloudFront API</b>:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Disable the RTMP distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to get the current configuration and the
     * <code>Etag</code> header for the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GET Streaming Distribution Config</code>
     * request to change the value of <code>Enabled</code> to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>PUT Streaming Distribution Config</code> request to update the configuration for your
     * distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the
     * HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you
     * submitted the <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>PUT Streaming Distribution Config</code> request to confirm that the
     * distribution was successfully disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to confirm that your changes have propagated.
     * When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DELETE Streaming Distribution</code> request. Set the value of the HTTP <code>If-Match</code>
     * header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to your <code>DELETE Streaming Distribution</code> request to confirm that the distribution
     * was successfully deleted.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For information about deleting a distribution using the CloudFront console, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return Result of the DeleteStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws StreamingDistributionNotDisabledException
     *         The specified CloudFront distribution is not disabled. You must disable the distribution before you can
     *         delete it.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStreamingDistributionResult deleteStreamingDistribution(DeleteStreamingDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStreamingDistribution(request);
    }

    @SdkInternalApi
    final DeleteStreamingDistributionResult executeDeleteStreamingDistribution(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamingDistributionRequest> request = null;
        Response<DeleteStreamingDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamingDistributionRequestMarshaller().marshall(super.beforeMarshalling(deleteStreamingDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStreamingDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteStreamingDistributionResult> responseHandler = new StaxResponseHandler<DeleteStreamingDistributionResult>(
                    new DeleteStreamingDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a cache policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy’s identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a cache policy, you must provide the policy’s identifier. If the cache policy is attached to a
     * distribution’s cache behavior, you can get the policy’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyRequest
     * @return Result of the GetCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @sample AmazonCloudFront.GetCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCachePolicyResult getCachePolicy(GetCachePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetCachePolicy(request);
    }

    @SdkInternalApi
    final GetCachePolicyResult executeGetCachePolicy(GetCachePolicyRequest getCachePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getCachePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCachePolicyRequest> request = null;
        Response<GetCachePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCachePolicyRequestMarshaller().marshall(super.beforeMarshalling(getCachePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCachePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCachePolicyResult> responseHandler = new StaxResponseHandler<GetCachePolicyResult>(
                    new GetCachePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a cache policy configuration.
     * </p>
     * <p>
     * To get a cache policy configuration, you must provide the policy’s identifier. If the cache policy is attached to
     * a distribution’s cache behavior, you can get the policy’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the cache policy is not attached to a cache behavior, you can get the identifier
     * using <code>ListCachePolicies</code>.
     * </p>
     * 
     * @param getCachePolicyConfigRequest
     * @return Result of the GetCachePolicyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @sample AmazonCloudFront.GetCachePolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCachePolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCachePolicyConfigResult getCachePolicyConfig(GetCachePolicyConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetCachePolicyConfig(request);
    }

    @SdkInternalApi
    final GetCachePolicyConfigResult executeGetCachePolicyConfig(GetCachePolicyConfigRequest getCachePolicyConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getCachePolicyConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCachePolicyConfigRequest> request = null;
        Response<GetCachePolicyConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCachePolicyConfigRequestMarshaller().marshall(super.beforeMarshalling(getCachePolicyConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCachePolicyConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCachePolicyConfigResult> responseHandler = new StaxResponseHandler<GetCachePolicyConfigResult>(
                    new GetCachePolicyConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @return Result of the GetCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeGetCloudFrontOriginAccessIdentity(request);
    }

    @SdkInternalApi
    final GetCloudFrontOriginAccessIdentityResult executeGetCloudFrontOriginAccessIdentity(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(getCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFrontOriginAccessIdentityRequest> request = null;
        Response<GetCloudFrontOriginAccessIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCloudFrontOriginAccessIdentityRequestMarshaller().marshall(super.beforeMarshalling(getCloudFrontOriginAccessIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCloudFrontOriginAccessIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCloudFrontOriginAccessIdentityResult> responseHandler = new StaxResponseHandler<GetCloudFrontOriginAccessIdentityResult>(
                    new GetCloudFrontOriginAccessIdentityResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The origin access identity's configuration information. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CloudFrontOriginAccessIdentityConfig.html"
     *        >CloudFrontOriginAccessIdentityConfig</a>.
     * @return Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentityConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetCloudFrontOriginAccessIdentityConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetCloudFrontOriginAccessIdentityConfig(request);
    }

    @SdkInternalApi
    final GetCloudFrontOriginAccessIdentityConfigResult executeGetCloudFrontOriginAccessIdentityConfig(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getCloudFrontOriginAccessIdentityConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCloudFrontOriginAccessIdentityConfigRequest> request = null;
        Response<GetCloudFrontOriginAccessIdentityConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCloudFrontOriginAccessIdentityConfigRequestMarshaller().marshall(super
                        .beforeMarshalling(getCloudFrontOriginAccessIdentityConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCloudFrontOriginAccessIdentityConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetCloudFrontOriginAccessIdentityConfigResult> responseHandler = new StaxResponseHandler<GetCloudFrontOriginAccessIdentityConfigResult>(
                    new GetCloudFrontOriginAccessIdentityConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @return Result of the GetDistribution operation returned by the service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistribution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDistributionResult getDistribution(GetDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistribution(request);
    }

    @SdkInternalApi
    final GetDistributionResult executeGetDistribution(GetDistributionRequest getDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionRequest> request = null;
        Response<GetDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionRequestMarshaller().marshall(super.beforeMarshalling(getDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetDistributionResult> responseHandler = new StaxResponseHandler<GetDistributionResult>(
                    new GetDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @return Result of the GetDistributionConfig operation returned by the service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDistributionConfigResult getDistributionConfig(GetDistributionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetDistributionConfig(request);
    }

    @SdkInternalApi
    final GetDistributionConfigResult executeGetDistributionConfig(GetDistributionConfigRequest getDistributionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getDistributionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDistributionConfigRequest> request = null;
        Response<GetDistributionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDistributionConfigRequestMarshaller().marshall(super.beforeMarshalling(getDistributionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDistributionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetDistributionConfigResult> responseHandler = new StaxResponseHandler<GetDistributionConfigResult>(
                    new GetDistributionConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionRequest
     * @return Result of the GetFieldLevelEncryption operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryption
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryption"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFieldLevelEncryptionResult getFieldLevelEncryption(GetFieldLevelEncryptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetFieldLevelEncryption(request);
    }

    @SdkInternalApi
    final GetFieldLevelEncryptionResult executeGetFieldLevelEncryption(GetFieldLevelEncryptionRequest getFieldLevelEncryptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionRequest> request = null;
        Response<GetFieldLevelEncryptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFieldLevelEncryptionRequestMarshaller().marshall(super.beforeMarshalling(getFieldLevelEncryptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFieldLevelEncryption");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetFieldLevelEncryptionResult> responseHandler = new StaxResponseHandler<GetFieldLevelEncryptionResult>(
                    new GetFieldLevelEncryptionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionConfigRequest
     * @return Result of the GetFieldLevelEncryptionConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFieldLevelEncryptionConfigResult getFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetFieldLevelEncryptionConfig(request);
    }

    @SdkInternalApi
    final GetFieldLevelEncryptionConfigResult executeGetFieldLevelEncryptionConfig(GetFieldLevelEncryptionConfigRequest getFieldLevelEncryptionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionConfigRequest> request = null;
        Response<GetFieldLevelEncryptionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFieldLevelEncryptionConfigRequestMarshaller().marshall(super.beforeMarshalling(getFieldLevelEncryptionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFieldLevelEncryptionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetFieldLevelEncryptionConfigResult> responseHandler = new StaxResponseHandler<GetFieldLevelEncryptionConfigResult>(
                    new GetFieldLevelEncryptionConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption profile information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileRequest
     * @return Result of the GetFieldLevelEncryptionProfile operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFieldLevelEncryptionProfileResult getFieldLevelEncryptionProfile(GetFieldLevelEncryptionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetFieldLevelEncryptionProfile(request);
    }

    @SdkInternalApi
    final GetFieldLevelEncryptionProfileResult executeGetFieldLevelEncryptionProfile(GetFieldLevelEncryptionProfileRequest getFieldLevelEncryptionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionProfileRequest> request = null;
        Response<GetFieldLevelEncryptionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFieldLevelEncryptionProfileRequestMarshaller().marshall(super.beforeMarshalling(getFieldLevelEncryptionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFieldLevelEncryptionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetFieldLevelEncryptionProfileResult> responseHandler = new StaxResponseHandler<GetFieldLevelEncryptionProfileResult>(
                    new GetFieldLevelEncryptionProfileResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get the field-level encryption profile configuration information.
     * </p>
     * 
     * @param getFieldLevelEncryptionProfileConfigRequest
     * @return Result of the GetFieldLevelEncryptionProfileConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @sample AmazonCloudFront.GetFieldLevelEncryptionProfileConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFieldLevelEncryptionProfileConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetFieldLevelEncryptionProfileConfigResult getFieldLevelEncryptionProfileConfig(GetFieldLevelEncryptionProfileConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetFieldLevelEncryptionProfileConfig(request);
    }

    @SdkInternalApi
    final GetFieldLevelEncryptionProfileConfigResult executeGetFieldLevelEncryptionProfileConfig(
            GetFieldLevelEncryptionProfileConfigRequest getFieldLevelEncryptionProfileConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getFieldLevelEncryptionProfileConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetFieldLevelEncryptionProfileConfigRequest> request = null;
        Response<GetFieldLevelEncryptionProfileConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetFieldLevelEncryptionProfileConfigRequestMarshaller().marshall(super
                        .beforeMarshalling(getFieldLevelEncryptionProfileConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetFieldLevelEncryptionProfileConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetFieldLevelEncryptionProfileConfigResult> responseHandler = new StaxResponseHandler<GetFieldLevelEncryptionProfileConfigResult>(
                    new GetFieldLevelEncryptionProfileConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @return Result of the GetInvalidation operation returned by the service.
     * @throws NoSuchInvalidationException
     *         The specified invalidation does not exist.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetInvalidation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInvalidationResult getInvalidation(GetInvalidationRequest request) {
        request = beforeClientExecution(request);
        return executeGetInvalidation(request);
    }

    @SdkInternalApi
    final GetInvalidationResult executeGetInvalidation(GetInvalidationRequest getInvalidationRequest) {

        ExecutionContext executionContext = createExecutionContext(getInvalidationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInvalidationRequest> request = null;
        Response<GetInvalidationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInvalidationRequestMarshaller().marshall(super.beforeMarshalling(getInvalidationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInvalidation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetInvalidationResult> responseHandler = new StaxResponseHandler<GetInvalidationResult>(
                    new GetInvalidationResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a key group, including the date and time when the key group was last modified.
     * </p>
     * <p>
     * To get a key group, you must provide the key group’s identifier. If the key group is referenced in a
     * distribution’s cache behavior, you can get the key group’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupRequest
     * @return Result of the GetKeyGroup operation returned by the service.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.GetKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyGroupResult getKeyGroup(GetKeyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyGroup(request);
    }

    @SdkInternalApi
    final GetKeyGroupResult executeGetKeyGroup(GetKeyGroupRequest getKeyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyGroupRequest> request = null;
        Response<GetKeyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyGroupRequestMarshaller().marshall(super.beforeMarshalling(getKeyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetKeyGroupResult> responseHandler = new StaxResponseHandler<GetKeyGroupResult>(new GetKeyGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a key group configuration.
     * </p>
     * <p>
     * To get a key group configuration, you must provide the key group’s identifier. If the key group is referenced in
     * a distribution’s cache behavior, you can get the key group’s identifier using <code>ListDistributions</code> or
     * <code>GetDistribution</code>. If the key group is not referenced in a cache behavior, you can get the identifier
     * using <code>ListKeyGroups</code>.
     * </p>
     * 
     * @param getKeyGroupConfigRequest
     * @return Result of the GetKeyGroupConfig operation returned by the service.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.GetKeyGroupConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetKeyGroupConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetKeyGroupConfigResult getKeyGroupConfig(GetKeyGroupConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyGroupConfig(request);
    }

    @SdkInternalApi
    final GetKeyGroupConfigResult executeGetKeyGroupConfig(GetKeyGroupConfigRequest getKeyGroupConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyGroupConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyGroupConfigRequest> request = null;
        Response<GetKeyGroupConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyGroupConfigRequestMarshaller().marshall(super.beforeMarshalling(getKeyGroupConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKeyGroupConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetKeyGroupConfigResult> responseHandler = new StaxResponseHandler<GetKeyGroupConfigResult>(
                    new GetKeyGroupConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about whether additional CloudWatch metrics are enabled for the specified CloudFront
     * distribution.
     * </p>
     * 
     * @param getMonitoringSubscriptionRequest
     * @return Result of the GetMonitoringSubscription operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @sample AmazonCloudFront.GetMonitoringSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetMonitoringSubscription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMonitoringSubscriptionResult getMonitoringSubscription(GetMonitoringSubscriptionRequest request) {
        request = beforeClientExecution(request);
        return executeGetMonitoringSubscription(request);
    }

    @SdkInternalApi
    final GetMonitoringSubscriptionResult executeGetMonitoringSubscription(GetMonitoringSubscriptionRequest getMonitoringSubscriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(getMonitoringSubscriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMonitoringSubscriptionRequest> request = null;
        Response<GetMonitoringSubscriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMonitoringSubscriptionRequestMarshaller().marshall(super.beforeMarshalling(getMonitoringSubscriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMonitoringSubscription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetMonitoringSubscriptionResult> responseHandler = new StaxResponseHandler<GetMonitoringSubscriptionResult>(
                    new GetMonitoringSubscriptionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an origin request policy, including the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy’s identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * The date and time when the policy was last modified.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get an origin request policy, you must provide the policy’s identifier. If the origin request policy is
     * attached to a distribution’s cache behavior, you can get the policy’s identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyRequest
     * @return Result of the GetOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @sample AmazonCloudFront.GetOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOriginRequestPolicyResult getOriginRequestPolicy(GetOriginRequestPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetOriginRequestPolicy(request);
    }

    @SdkInternalApi
    final GetOriginRequestPolicyResult executeGetOriginRequestPolicy(GetOriginRequestPolicyRequest getOriginRequestPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getOriginRequestPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOriginRequestPolicyRequest> request = null;
        Response<GetOriginRequestPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOriginRequestPolicyRequestMarshaller().marshall(super.beforeMarshalling(getOriginRequestPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOriginRequestPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetOriginRequestPolicyResult> responseHandler = new StaxResponseHandler<GetOriginRequestPolicyResult>(
                    new GetOriginRequestPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets an origin request policy configuration.
     * </p>
     * <p>
     * To get an origin request policy configuration, you must provide the policy’s identifier. If the origin request
     * policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using
     * <code>ListDistributions</code> or <code>GetDistribution</code>. If the origin request policy is not attached to a
     * cache behavior, you can get the identifier using <code>ListOriginRequestPolicies</code>.
     * </p>
     * 
     * @param getOriginRequestPolicyConfigRequest
     * @return Result of the GetOriginRequestPolicyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @sample AmazonCloudFront.GetOriginRequestPolicyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicyConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOriginRequestPolicyConfigResult getOriginRequestPolicyConfig(GetOriginRequestPolicyConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetOriginRequestPolicyConfig(request);
    }

    @SdkInternalApi
    final GetOriginRequestPolicyConfigResult executeGetOriginRequestPolicyConfig(GetOriginRequestPolicyConfigRequest getOriginRequestPolicyConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getOriginRequestPolicyConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOriginRequestPolicyConfigRequest> request = null;
        Response<GetOriginRequestPolicyConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOriginRequestPolicyConfigRequestMarshaller().marshall(super.beforeMarshalling(getOriginRequestPolicyConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOriginRequestPolicyConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetOriginRequestPolicyConfigResult> responseHandler = new StaxResponseHandler<GetOriginRequestPolicyConfigResult>(
                    new GetOriginRequestPolicyConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a public key.
     * </p>
     * 
     * @param getPublicKeyRequest
     * @return Result of the GetPublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @sample AmazonCloudFront.GetPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPublicKeyResult getPublicKey(GetPublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPublicKey(request);
    }

    @SdkInternalApi
    final GetPublicKeyResult executeGetPublicKey(GetPublicKeyRequest getPublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicKeyRequest> request = null;
        Response<GetPublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPublicKeyRequestMarshaller().marshall(super.beforeMarshalling(getPublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetPublicKeyResult> responseHandler = new StaxResponseHandler<GetPublicKeyResult>(new GetPublicKeyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a public key configuration.
     * </p>
     * 
     * @param getPublicKeyConfigRequest
     * @return Result of the GetPublicKeyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @sample AmazonCloudFront.GetPublicKeyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetPublicKeyConfig" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPublicKeyConfigResult getPublicKeyConfig(GetPublicKeyConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetPublicKeyConfig(request);
    }

    @SdkInternalApi
    final GetPublicKeyConfigResult executeGetPublicKeyConfig(GetPublicKeyConfigRequest getPublicKeyConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getPublicKeyConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPublicKeyConfigRequest> request = null;
        Response<GetPublicKeyConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPublicKeyConfigRequestMarshaller().marshall(super.beforeMarshalling(getPublicKeyConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPublicKeyConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetPublicKeyConfigResult> responseHandler = new StaxResponseHandler<GetPublicKeyConfigResult>(
                    new GetPublicKeyConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a real-time log configuration.
     * </p>
     * <p>
     * To get a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name (ARN).
     * You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log
     * configuration to get.
     * </p>
     * 
     * @param getRealtimeLogConfigRequest
     * @return Result of the GetRealtimeLogConfig operation returned by the service.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRealtimeLogConfigResult getRealtimeLogConfig(GetRealtimeLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetRealtimeLogConfig(request);
    }

    @SdkInternalApi
    final GetRealtimeLogConfigResult executeGetRealtimeLogConfig(GetRealtimeLogConfigRequest getRealtimeLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getRealtimeLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRealtimeLogConfigRequest> request = null;
        Response<GetRealtimeLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRealtimeLogConfigRequestMarshaller().marshall(super.beforeMarshalling(getRealtimeLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRealtimeLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetRealtimeLogConfigResult> responseHandler = new StaxResponseHandler<GetRealtimeLogConfigResult>(
                    new GetRealtimeLogConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     * </p>
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return Result of the GetStreamingDistribution operation returned by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamingDistribution(request);
    }

    @SdkInternalApi
    final GetStreamingDistributionResult executeGetStreamingDistribution(GetStreamingDistributionRequest getStreamingDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingDistributionRequest> request = null;
        Response<GetStreamingDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamingDistributionRequestMarshaller().marshall(super.beforeMarshalling(getStreamingDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamingDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetStreamingDistributionResult> responseHandler = new StaxResponseHandler<GetStreamingDistributionResult>(
                    new GetStreamingDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @return Result of the GetStreamingDistributionConfig operation returned by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistributionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetStreamingDistributionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStreamingDistributionConfigResult getStreamingDistributionConfig(GetStreamingDistributionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamingDistributionConfig(request);
    }

    @SdkInternalApi
    final GetStreamingDistributionConfigResult executeGetStreamingDistributionConfig(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamingDistributionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingDistributionConfigRequest> request = null;
        Response<GetStreamingDistributionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamingDistributionConfigRequestMarshaller().marshall(super.beforeMarshalling(getStreamingDistributionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamingDistributionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetStreamingDistributionConfigResult> responseHandler = new StaxResponseHandler<GetStreamingDistributionConfigResult>(
                    new GetStreamingDistributionConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of cache policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies
     * created in your AWS account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listCachePoliciesRequest
     * @return Result of the ListCachePolicies operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListCachePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCachePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCachePoliciesResult listCachePolicies(ListCachePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListCachePolicies(request);
    }

    @SdkInternalApi
    final ListCachePoliciesResult executeListCachePolicies(ListCachePoliciesRequest listCachePoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCachePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCachePoliciesRequest> request = null;
        Response<ListCachePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCachePoliciesRequestMarshaller().marshall(super.beforeMarshalling(listCachePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCachePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListCachePoliciesResult> responseHandler = new StaxResponseHandler<ListCachePoliciesResult>(
                    new ListCachePoliciesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return Result of the ListCloudFrontOriginAccessIdentities operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListCloudFrontOriginAccessIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListCloudFrontOriginAccessIdentities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(ListCloudFrontOriginAccessIdentitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListCloudFrontOriginAccessIdentities(request);
    }

    @SdkInternalApi
    final ListCloudFrontOriginAccessIdentitiesResult executeListCloudFrontOriginAccessIdentities(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCloudFrontOriginAccessIdentitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCloudFrontOriginAccessIdentitiesRequest> request = null;
        Response<ListCloudFrontOriginAccessIdentitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCloudFrontOriginAccessIdentitiesRequestMarshaller().marshall(super
                        .beforeMarshalling(listCloudFrontOriginAccessIdentitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCloudFrontOriginAccessIdentities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListCloudFrontOriginAccessIdentitiesResult> responseHandler = new StaxResponseHandler<ListCloudFrontOriginAccessIdentitiesResult>(
                    new ListCloudFrontOriginAccessIdentitiesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List CloudFront distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return Result of the ListDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDistributionsResult listDistributions(ListDistributionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributions(request);
    }

    @SdkInternalApi
    final ListDistributionsResult executeListDistributions(ListDistributionsRequest listDistributionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsRequest> request = null;
        Response<ListDistributionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionsRequestMarshaller().marshall(super.beforeMarshalling(listDistributionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDistributionsResult> responseHandler = new StaxResponseHandler<ListDistributionsResult>(
                    new ListDistributionsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified
     * cache policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByCachePolicyIdRequest
     * @return Result of the ListDistributionsByCachePolicyId operation returned by the service.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListDistributionsByCachePolicyId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByCachePolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributionsByCachePolicyIdResult listDistributionsByCachePolicyId(ListDistributionsByCachePolicyIdRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributionsByCachePolicyId(request);
    }

    @SdkInternalApi
    final ListDistributionsByCachePolicyIdResult executeListDistributionsByCachePolicyId(
            ListDistributionsByCachePolicyIdRequest listDistributionsByCachePolicyIdRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionsByCachePolicyIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsByCachePolicyIdRequest> request = null;
        Response<ListDistributionsByCachePolicyIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionsByCachePolicyIdRequestMarshaller().marshall(super.beforeMarshalling(listDistributionsByCachePolicyIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributionsByCachePolicyId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDistributionsByCachePolicyIdResult> responseHandler = new StaxResponseHandler<ListDistributionsByCachePolicyIdResult>(
                    new ListDistributionsByCachePolicyIdResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that references the specified key
     * group.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByKeyGroupRequest
     * @return Result of the ListDistributionsByKeyGroup operation returned by the service.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListDistributionsByKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByKeyGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributionsByKeyGroupResult listDistributionsByKeyGroup(ListDistributionsByKeyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributionsByKeyGroup(request);
    }

    @SdkInternalApi
    final ListDistributionsByKeyGroupResult executeListDistributionsByKeyGroup(ListDistributionsByKeyGroupRequest listDistributionsByKeyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionsByKeyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsByKeyGroupRequest> request = null;
        Response<ListDistributionsByKeyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionsByKeyGroupRequestMarshaller().marshall(super.beforeMarshalling(listDistributionsByKeyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributionsByKeyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDistributionsByKeyGroupResult> responseHandler = new StaxResponseHandler<ListDistributionsByKeyGroupResult>(
                    new ListDistributionsByKeyGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified
     * origin request policy.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByOriginRequestPolicyIdRequest
     * @return Result of the ListDistributionsByOriginRequestPolicyId operation returned by the service.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListDistributionsByOriginRequestPolicyId
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByOriginRequestPolicyId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributionsByOriginRequestPolicyIdResult listDistributionsByOriginRequestPolicyId(ListDistributionsByOriginRequestPolicyIdRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributionsByOriginRequestPolicyId(request);
    }

    @SdkInternalApi
    final ListDistributionsByOriginRequestPolicyIdResult executeListDistributionsByOriginRequestPolicyId(
            ListDistributionsByOriginRequestPolicyIdRequest listDistributionsByOriginRequestPolicyIdRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionsByOriginRequestPolicyIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsByOriginRequestPolicyIdRequest> request = null;
        Response<ListDistributionsByOriginRequestPolicyIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionsByOriginRequestPolicyIdRequestMarshaller().marshall(super
                        .beforeMarshalling(listDistributionsByOriginRequestPolicyIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributionsByOriginRequestPolicyId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDistributionsByOriginRequestPolicyIdResult> responseHandler = new StaxResponseHandler<ListDistributionsByOriginRequestPolicyIdResult>(
                    new ListDistributionsByOriginRequestPolicyIdResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of distributions that have a cache behavior that’s associated with the specified real-time log
     * configuration.
     * </p>
     * <p>
     * You can specify the real-time log configuration by its name or its Amazon Resource Name (ARN). You must provide
     * at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to list
     * distributions for.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listDistributionsByRealtimeLogConfigRequest
     * @return Result of the ListDistributionsByRealtimeLogConfig operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListDistributionsByRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributionsByRealtimeLogConfigResult listDistributionsByRealtimeLogConfig(ListDistributionsByRealtimeLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributionsByRealtimeLogConfig(request);
    }

    @SdkInternalApi
    final ListDistributionsByRealtimeLogConfigResult executeListDistributionsByRealtimeLogConfig(
            ListDistributionsByRealtimeLogConfigRequest listDistributionsByRealtimeLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionsByRealtimeLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsByRealtimeLogConfigRequest> request = null;
        Response<ListDistributionsByRealtimeLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionsByRealtimeLogConfigRequestMarshaller().marshall(super
                        .beforeMarshalling(listDistributionsByRealtimeLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributionsByRealtimeLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDistributionsByRealtimeLogConfigResult> responseHandler = new StaxResponseHandler<ListDistributionsByRealtimeLogConfigResult>(
                    new ListDistributionsByRealtimeLogConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the distributions that are associated with a specified AWS WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified AWS WAF web ACL.
     * @return Result of the ListDistributionsByWebACLId operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @sample AmazonCloudFront.ListDistributionsByWebACLId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListDistributionsByWebACLId"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDistributionsByWebACLIdResult listDistributionsByWebACLId(ListDistributionsByWebACLIdRequest request) {
        request = beforeClientExecution(request);
        return executeListDistributionsByWebACLId(request);
    }

    @SdkInternalApi
    final ListDistributionsByWebACLIdResult executeListDistributionsByWebACLId(ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest) {

        ExecutionContext executionContext = createExecutionContext(listDistributionsByWebACLIdRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDistributionsByWebACLIdRequest> request = null;
        Response<ListDistributionsByWebACLIdResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDistributionsByWebACLIdRequestMarshaller().marshall(super.beforeMarshalling(listDistributionsByWebACLIdRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDistributionsByWebACLId");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListDistributionsByWebACLIdResult> responseHandler = new StaxResponseHandler<ListDistributionsByWebACLIdResult>(
                    new ListDistributionsByWebACLIdResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all field-level encryption configurations that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionConfigsRequest
     * @return Result of the ListFieldLevelEncryptionConfigs operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListFieldLevelEncryptionConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFieldLevelEncryptionConfigsResult listFieldLevelEncryptionConfigs(ListFieldLevelEncryptionConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListFieldLevelEncryptionConfigs(request);
    }

    @SdkInternalApi
    final ListFieldLevelEncryptionConfigsResult executeListFieldLevelEncryptionConfigs(
            ListFieldLevelEncryptionConfigsRequest listFieldLevelEncryptionConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFieldLevelEncryptionConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFieldLevelEncryptionConfigsRequest> request = null;
        Response<ListFieldLevelEncryptionConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFieldLevelEncryptionConfigsRequestMarshaller().marshall(super.beforeMarshalling(listFieldLevelEncryptionConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFieldLevelEncryptionConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListFieldLevelEncryptionConfigsResult> responseHandler = new StaxResponseHandler<ListFieldLevelEncryptionConfigsResult>(
                    new ListFieldLevelEncryptionConfigsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
     * </p>
     * 
     * @param listFieldLevelEncryptionProfilesRequest
     * @return Result of the ListFieldLevelEncryptionProfiles operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListFieldLevelEncryptionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListFieldLevelEncryptionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFieldLevelEncryptionProfilesResult listFieldLevelEncryptionProfiles(ListFieldLevelEncryptionProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListFieldLevelEncryptionProfiles(request);
    }

    @SdkInternalApi
    final ListFieldLevelEncryptionProfilesResult executeListFieldLevelEncryptionProfiles(
            ListFieldLevelEncryptionProfilesRequest listFieldLevelEncryptionProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFieldLevelEncryptionProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFieldLevelEncryptionProfilesRequest> request = null;
        Response<ListFieldLevelEncryptionProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFieldLevelEncryptionProfilesRequestMarshaller().marshall(super.beforeMarshalling(listFieldLevelEncryptionProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFieldLevelEncryptionProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListFieldLevelEncryptionProfilesResult> responseHandler = new StaxResponseHandler<ListFieldLevelEncryptionProfilesResult>(
                    new ListFieldLevelEncryptionProfilesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return Result of the ListInvalidations operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListInvalidations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListInvalidations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListInvalidationsResult listInvalidations(ListInvalidationsRequest request) {
        request = beforeClientExecution(request);
        return executeListInvalidations(request);
    }

    @SdkInternalApi
    final ListInvalidationsResult executeListInvalidations(ListInvalidationsRequest listInvalidationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listInvalidationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInvalidationsRequest> request = null;
        Response<ListInvalidationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInvalidationsRequestMarshaller().marshall(super.beforeMarshalling(listInvalidationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInvalidations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListInvalidationsResult> responseHandler = new StaxResponseHandler<ListInvalidationsResult>(
                    new ListInvalidationsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of key groups.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listKeyGroupsRequest
     * @return Result of the ListKeyGroups operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListKeyGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListKeyGroupsResult listKeyGroups(ListKeyGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListKeyGroups(request);
    }

    @SdkInternalApi
    final ListKeyGroupsResult executeListKeyGroups(ListKeyGroupsRequest listKeyGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeyGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeyGroupsRequest> request = null;
        Response<ListKeyGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeyGroupsRequestMarshaller().marshall(super.beforeMarshalling(listKeyGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeyGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListKeyGroupsResult> responseHandler = new StaxResponseHandler<ListKeyGroupsResult>(new ListKeyGroupsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of origin request policies.
     * </p>
     * <p>
     * You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies
     * created in your AWS account.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listOriginRequestPoliciesRequest
     * @return Result of the ListOriginRequestPolicies operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListOriginRequestPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginRequestPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOriginRequestPoliciesResult listOriginRequestPolicies(ListOriginRequestPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListOriginRequestPolicies(request);
    }

    @SdkInternalApi
    final ListOriginRequestPoliciesResult executeListOriginRequestPolicies(ListOriginRequestPoliciesRequest listOriginRequestPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listOriginRequestPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOriginRequestPoliciesRequest> request = null;
        Response<ListOriginRequestPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOriginRequestPoliciesRequestMarshaller().marshall(super.beforeMarshalling(listOriginRequestPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOriginRequestPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListOriginRequestPoliciesResult> responseHandler = new StaxResponseHandler<ListOriginRequestPoliciesResult>(
                    new ListOriginRequestPoliciesResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param listPublicKeysRequest
     * @return Result of the ListPublicKeys operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListPublicKeys" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPublicKeysResult listPublicKeys(ListPublicKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListPublicKeys(request);
    }

    @SdkInternalApi
    final ListPublicKeysResult executeListPublicKeys(ListPublicKeysRequest listPublicKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listPublicKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPublicKeysRequest> request = null;
        Response<ListPublicKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPublicKeysRequestMarshaller().marshall(super.beforeMarshalling(listPublicKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPublicKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPublicKeysResult> responseHandler = new StaxResponseHandler<ListPublicKeysResult>(
                    new ListPublicKeysResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of real-time log configurations.
     * </p>
     * <p>
     * You can optionally specify the maximum number of items to receive in the response. If the total number of items
     * in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the
     * next page of items, send a subsequent request that specifies the <code>NextMarker</code> value from the current
     * response as the <code>Marker</code> value in the subsequent request.
     * </p>
     * 
     * @param listRealtimeLogConfigsRequest
     * @return Result of the ListRealtimeLogConfigs operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @sample AmazonCloudFront.ListRealtimeLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListRealtimeLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRealtimeLogConfigsResult listRealtimeLogConfigs(ListRealtimeLogConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListRealtimeLogConfigs(request);
    }

    @SdkInternalApi
    final ListRealtimeLogConfigsResult executeListRealtimeLogConfigs(ListRealtimeLogConfigsRequest listRealtimeLogConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRealtimeLogConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRealtimeLogConfigsRequest> request = null;
        Response<ListRealtimeLogConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRealtimeLogConfigsRequestMarshaller().marshall(super.beforeMarshalling(listRealtimeLogConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRealtimeLogConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListRealtimeLogConfigsResult> responseHandler = new StaxResponseHandler<ListRealtimeLogConfigsResult>(
                    new ListRealtimeLogConfigsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return Result of the ListStreamingDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @sample AmazonCloudFront.ListStreamingDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListStreamingDistributions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStreamingDistributionsResult listStreamingDistributions(ListStreamingDistributionsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamingDistributions(request);
    }

    @SdkInternalApi
    final ListStreamingDistributionsResult executeListStreamingDistributions(ListStreamingDistributionsRequest listStreamingDistributionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamingDistributionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamingDistributionsRequest> request = null;
        Response<ListStreamingDistributionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamingDistributionsRequestMarshaller().marshall(super.beforeMarshalling(listStreamingDistributionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamingDistributions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStreamingDistributionsResult> responseHandler = new StaxResponseHandler<ListStreamingDistributionsResult>(
                    new ListStreamingDistributionsResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List tags for a CloudFront resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListTagsForResourceResult> responseHandler = new StaxResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestMarshaller().marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TagResourceResult> responseHandler = new StaxResponseHandler<TagResourceResult>(new TagResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidTaggingException
     *         The tagging specified is not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @sample AmazonCloudFront.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestMarshaller().marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UntagResourceResult> responseHandler = new StaxResponseHandler<UntagResourceResult>(new UntagResourceResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a cache policy configuration.
     * </p>
     * <p>
     * When you update a cache policy configuration, all the fields are updated with the values provided in the request.
     * You cannot update some fields independent of others. To update a cache policy configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetCachePolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the cache policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateCachePolicy</code> by providing the entire cache policy configuration, including the fields that
     * you modified and those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateCachePolicyRequest
     * @return Result of the UpdateCachePolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws CachePolicyAlreadyExistsException
     *         A cache policy with this name already exists. You must provide a unique name. To modify an existing cache
     *         policy, use <code>UpdateCachePolicy</code>.
     * @throws TooManyHeadersInCachePolicyException
     *         The number of headers in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInCachePolicyException
     *         The number of cookies in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInCachePolicyException
     *         The number of query strings in the cache policy exceeds the maximum. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateCachePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCachePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateCachePolicyResult updateCachePolicy(UpdateCachePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCachePolicy(request);
    }

    @SdkInternalApi
    final UpdateCachePolicyResult executeUpdateCachePolicy(UpdateCachePolicyRequest updateCachePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCachePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCachePolicyRequest> request = null;
        Response<UpdateCachePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCachePolicyRequestMarshaller().marshall(super.beforeMarshalling(updateCachePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCachePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateCachePolicyResult> responseHandler = new StaxResponseHandler<UpdateCachePolicyResult>(
                    new UpdateCachePolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.UpdateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateCloudFrontOriginAccessIdentity"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCloudFrontOriginAccessIdentity(request);
    }

    @SdkInternalApi
    final UpdateCloudFrontOriginAccessIdentityResult executeUpdateCloudFrontOriginAccessIdentity(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCloudFrontOriginAccessIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCloudFrontOriginAccessIdentityRequest> request = null;
        Response<UpdateCloudFrontOriginAccessIdentityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCloudFrontOriginAccessIdentityRequestMarshaller().marshall(super
                        .beforeMarshalling(updateCloudFrontOriginAccessIdentityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCloudFrontOriginAccessIdentity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateCloudFrontOriginAccessIdentityResult> responseHandler = new StaxResponseHandler<UpdateCloudFrontOriginAccessIdentityResult>(
                    new UpdateCloudFrontOriginAccessIdentityResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for a web distribution.
     * </p>
     * <important>
     * <p>
     * When you update a distribution, there are more required fields than when you create a distribution. When you
     * update your distribution by using this API action, follow the steps here to get the current configuration and
     * then make your updates, to make sure that you include all of the required fields. To view a summary, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * The update process includes getting the current distribution configuration, updating the XML document that is
     * returned to make your changes, and then submitting an <code>UpdateDistribution</code> request to make the
     * updates.
     * </p>
     * <p>
     * For information about updating a distribution using the CloudFront console instead, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-creating-console.html"
     * >Creating a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * <b>To update a web distribution using the CloudFront API</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistributionConfig.html">
     * GetDistributionConfig</a> request to get the current configuration and an <code>Etag</code> header for the
     * distribution.
     * </p>
     * <note>
     * <p>
     * If you update the distribution again, you must get a new <code>Etag</code> header.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GetDistributionConfig</code> request to
     * include your changes.
     * </p>
     * <important>
     * <p>
     * When you edit the XML file, be aware of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must strip out the ETag parameter that is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * Additional fields are required when you update a distribution. There may be fields included in the XML file for
     * features that you haven't configured for your distribution. This is expected and required to successfully update
     * the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't change the value of <code>CallerReference</code>. If you try to change this value, CloudFront returns
     * an <code>IllegalUpdate</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * The new configuration replaces the existing configuration; the values that you specify in an
     * <code>UpdateDistribution</code> request are not merged into your existing configuration. When you add, delete, or
     * replace values in an element that allows multiple values (for example, <code>CNAME</code>), you must specify all
     * of the values that you want to appear in the updated distribution. In addition, you must update the corresponding
     * <code>Quantity</code> element.
     * </p>
     * </li>
     * </ul>
     * </important></li>
     * <li>
     * <p>
     * Submit an <code>UpdateDistribution</code> request to update the configuration for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In the request body, include the XML document that you updated in Step 2. The request body must include an XML
     * document with a <code>DistributionConfig</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * Set the value of the HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that
     * CloudFront returned when you submitted the <code>GetDistributionConfig</code> request in Step 1.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>UpdateDistribution</code> request to confirm that the configuration was
     * successfully updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * Optional: Submit a <a
     * href="https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistribution.html">GetDistribution</a>
     * request to confirm that your changes have propagated. When propagation is complete, the value of
     * <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return Result of the UpdateDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     *         An invalid error code was specified.
     * @throws InvalidResponseCodeException
     *         A response code is not valid.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     *         A viewer certificate specified is not valid.
     * @throws InvalidMinimumProtocolVersionException
     *         The minimum protocol version specified is not valid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyOriginGroupsPerDistributionException
     *         Processing your request would cause you to exceed the maximum number of origin groups allowed.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     *         Your request contains too many headers in forwarded values.
     * @throws InvalidHeadersForS3OriginException
     *         The headers specified are not valid for an Amazon S3 origin.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     *         The location code specified is not valid.
     * @throws InvalidGeoRestrictionParameterException
     *         The specified geo restriction parameter is not valid.
     * @throws InvalidTTLOrderException
     *         The TTL order specified is not valid.
     * @throws InvalidWebACLIdException
     *         A web ACL ID specified is not valid. To specify a web ACL created using the latest version of AWS WAF,
     *         use the ACL ARN, for example
     *         <code>arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a</code>
     *         . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     *         <code>473e64fd-f30b-4765-81a0-62ad96dd167a</code>.
     * @throws TooManyOriginCustomHeadersException
     *         Your request contains too many origin custom headers.
     * @throws TooManyQueryStringParametersException
     *         Your request contains too many query string parameters.
     * @throws InvalidQueryStringParametersException
     *         The query string parameters specified are not valid.
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyDistributionsWithSingleFunctionARNException
     *         The maximum number of distributions have been associated with the specified Lambda function.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     *         The read timeout specified for the origin is not valid.
     * @throws InvalidOriginKeepaliveTimeoutException
     *         The keep alive timeout specified for the origin is not valid.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @throws NoSuchCachePolicyException
     *         The cache policy does not exist.
     * @throws TooManyDistributionsAssociatedToCachePolicyException
     *         The maximum number of distributions have been associated with the specified cache policy. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws TooManyDistributionsAssociatedToOriginRequestPolicyException
     *         The maximum number of distributions have been associated with the specified origin request policy. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyDistributionsAssociatedToKeyGroupException
     *         The number of distributions that reference this key group is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyKeyGroupsAssociatedToDistributionException
     *         The number of key groups referenced by this distribution is more than the maximum allowed. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html"
     *         >Quotas</a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TrustedKeyGroupDoesNotExistException
     *         The specified key group does not exist.
     * @sample AmazonCloudFront.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateDistribution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDistributionResult updateDistribution(UpdateDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDistribution(request);
    }

    @SdkInternalApi
    final UpdateDistributionResult executeUpdateDistribution(UpdateDistributionRequest updateDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDistributionRequest> request = null;
        Response<UpdateDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDistributionRequestMarshaller().marshall(super.beforeMarshalling(updateDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateDistributionResult> responseHandler = new StaxResponseHandler<UpdateDistributionResult>(
                    new UpdateDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a field-level encryption configuration.
     * </p>
     * 
     * @param updateFieldLevelEncryptionConfigRequest
     * @return Result of the UpdateFieldLevelEncryptionConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     *         The maximum number of query arg profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     *         The maximum number of content type profiles for field-level encryption have been created.
     * @throws QueryArgProfileEmptyException
     *         No profile specified for the field-level encryption query argument.
     * @sample AmazonCloudFront.UpdateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFieldLevelEncryptionConfigResult updateFieldLevelEncryptionConfig(UpdateFieldLevelEncryptionConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFieldLevelEncryptionConfig(request);
    }

    @SdkInternalApi
    final UpdateFieldLevelEncryptionConfigResult executeUpdateFieldLevelEncryptionConfig(
            UpdateFieldLevelEncryptionConfigRequest updateFieldLevelEncryptionConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFieldLevelEncryptionConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFieldLevelEncryptionConfigRequest> request = null;
        Response<UpdateFieldLevelEncryptionConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFieldLevelEncryptionConfigRequestMarshaller().marshall(super.beforeMarshalling(updateFieldLevelEncryptionConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFieldLevelEncryptionConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateFieldLevelEncryptionConfigResult> responseHandler = new StaxResponseHandler<UpdateFieldLevelEncryptionConfigResult>(
                    new UpdateFieldLevelEncryptionConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a field-level encryption profile.
     * </p>
     * 
     * @param updateFieldLevelEncryptionProfileRequest
     * @return Result of the UpdateFieldLevelEncryptionProfile operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws FieldLevelEncryptionProfileAlreadyExistsException
     *         The specified profile for field-level encryption already exists.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionProfileSizeExceededException
     *         The maximum size of a profile for field-level encryption was exceeded.
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     *         The maximum number of encryption entities for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     *         The maximum number of field patterns for field-level encryption have been created.
     * @sample AmazonCloudFront.UpdateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateFieldLevelEncryptionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFieldLevelEncryptionProfileResult updateFieldLevelEncryptionProfile(UpdateFieldLevelEncryptionProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFieldLevelEncryptionProfile(request);
    }

    @SdkInternalApi
    final UpdateFieldLevelEncryptionProfileResult executeUpdateFieldLevelEncryptionProfile(
            UpdateFieldLevelEncryptionProfileRequest updateFieldLevelEncryptionProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFieldLevelEncryptionProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFieldLevelEncryptionProfileRequest> request = null;
        Response<UpdateFieldLevelEncryptionProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFieldLevelEncryptionProfileRequestMarshaller().marshall(super.beforeMarshalling(updateFieldLevelEncryptionProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFieldLevelEncryptionProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateFieldLevelEncryptionProfileResult> responseHandler = new StaxResponseHandler<UpdateFieldLevelEncryptionProfileResult>(
                    new UpdateFieldLevelEncryptionProfileResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a key group.
     * </p>
     * <p>
     * When you update a key group, all the fields are updated with the values provided in the request. You cannot
     * update some fields independent of others. To update a key group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Get the current key group with <code>GetKeyGroup</code> or <code>GetKeyGroupConfig</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the key group that you want to update. For example, add or remove public key IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateKeyGroup</code> with the entire key group object, including the fields that you modified and
     * those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateKeyGroupRequest
     * @return Result of the UpdateKeyGroup operation returned by the service.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchResourceException
     *         A resource that was specified is not valid.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws KeyGroupAlreadyExistsException
     *         A key group with this name already exists. You must provide a unique name. To modify an existing key
     *         group, use <code>UpdateKeyGroup</code>.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws TooManyPublicKeysInKeyGroupException
     *         The number of public keys in this key group is more than the maximum allowed. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateKeyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateKeyGroup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateKeyGroupResult updateKeyGroup(UpdateKeyGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateKeyGroup(request);
    }

    @SdkInternalApi
    final UpdateKeyGroupResult executeUpdateKeyGroup(UpdateKeyGroupRequest updateKeyGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateKeyGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKeyGroupRequest> request = null;
        Response<UpdateKeyGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKeyGroupRequestMarshaller().marshall(super.beforeMarshalling(updateKeyGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateKeyGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateKeyGroupResult> responseHandler = new StaxResponseHandler<UpdateKeyGroupResult>(
                    new UpdateKeyGroupResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an origin request policy configuration.
     * </p>
     * <p>
     * When you update an origin request policy configuration, all the fields are updated with the values provided in
     * the request. You cannot update some fields independent of others. To update an origin request policy
     * configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <code>GetOriginRequestPolicyConfig</code> to get the current configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the fields in the origin request policy configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call <code>UpdateOriginRequestPolicy</code> by providing the entire origin request policy configuration,
     * including the fields that you modified and those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateOriginRequestPolicyRequest
     * @return Result of the UpdateOriginRequestPolicy operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws NoSuchOriginRequestPolicyException
     *         The origin request policy does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws OriginRequestPolicyAlreadyExistsException
     *         An origin request policy with this name already exists. You must provide a unique name. To modify an
     *         existing origin request policy, use <code>UpdateOriginRequestPolicy</code>.
     * @throws TooManyHeadersInOriginRequestPolicyException
     *         The number of headers in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyCookiesInOriginRequestPolicyException
     *         The number of cookies in the origin request policy exceeds the maximum. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas</a>
     *         (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @throws TooManyQueryStringsInOriginRequestPolicyException
     *         The number of query strings in the origin request policy exceeds the maximum. For more information, see
     *         <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html">Quotas
     *         </a> (formerly known as limits) in the <i>Amazon CloudFront Developer Guide</i>.
     * @sample AmazonCloudFront.UpdateOriginRequestPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginRequestPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOriginRequestPolicyResult updateOriginRequestPolicy(UpdateOriginRequestPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOriginRequestPolicy(request);
    }

    @SdkInternalApi
    final UpdateOriginRequestPolicyResult executeUpdateOriginRequestPolicy(UpdateOriginRequestPolicyRequest updateOriginRequestPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOriginRequestPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOriginRequestPolicyRequest> request = null;
        Response<UpdateOriginRequestPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOriginRequestPolicyRequestMarshaller().marshall(super.beforeMarshalling(updateOriginRequestPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOriginRequestPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateOriginRequestPolicyResult> responseHandler = new StaxResponseHandler<UpdateOriginRequestPolicyResult>(
                    new UpdateOriginRequestPolicyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update public key information. Note that the only value you can change is the comment.
     * </p>
     * 
     * @param updatePublicKeyRequest
     * @return Result of the UpdatePublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CannotChangeImmutablePublicKeyFieldsException
     *         You can't change the value of a public key.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.UpdatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdatePublicKey" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePublicKeyResult updatePublicKey(UpdatePublicKeyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePublicKey(request);
    }

    @SdkInternalApi
    final UpdatePublicKeyResult executeUpdatePublicKey(UpdatePublicKeyRequest updatePublicKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePublicKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePublicKeyRequest> request = null;
        Response<UpdatePublicKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePublicKeyRequestMarshaller().marshall(super.beforeMarshalling(updatePublicKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePublicKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdatePublicKeyResult> responseHandler = new StaxResponseHandler<UpdatePublicKeyResult>(
                    new UpdatePublicKeyResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a real-time log configuration.
     * </p>
     * <p>
     * When you update a real-time log configuration, all the parameters are updated with the values provided in the
     * request. You cannot update some parameters independent of others. To update a real-time log configuration:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Call <code>GetRealtimeLogConfig</code> to get the current real-time log configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Locally modify the parameters in the real-time log configuration that you want to update.
     * </p>
     * </li>
     * <li>
     * <p>
     * Call this API (<code>UpdateRealtimeLogConfig</code>) by providing the entire real-time log configuration,
     * including the parameters that you modified and those that you didn’t.
     * </p>
     * </li>
     * </ol>
     * <p>
     * You cannot update a real-time log configuration’s <code>Name</code> or <code>ARN</code>.
     * </p>
     * 
     * @param updateRealtimeLogConfigRequest
     * @return Result of the UpdateRealtimeLogConfig operation returned by the service.
     * @throws NoSuchRealtimeLogConfigException
     *         The real-time log configuration does not exist.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.UpdateRealtimeLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateRealtimeLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRealtimeLogConfigResult updateRealtimeLogConfig(UpdateRealtimeLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRealtimeLogConfig(request);
    }

    @SdkInternalApi
    final UpdateRealtimeLogConfigResult executeUpdateRealtimeLogConfig(UpdateRealtimeLogConfigRequest updateRealtimeLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRealtimeLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRealtimeLogConfigRequest> request = null;
        Response<UpdateRealtimeLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRealtimeLogConfigRequestMarshaller().marshall(super.beforeMarshalling(updateRealtimeLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRealtimeLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateRealtimeLogConfigResult> responseHandler = new StaxResponseHandler<UpdateRealtimeLogConfigResult>(
                    new UpdateRealtimeLogConfigResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

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
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return Result of the UpdateStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     *         The CNAME specified is already defined for CloudFront.
     * @throws IllegalUpdateException
     *         The update contains modifications that are not allowed.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request header fields evaluated to <code>false</code>.
     * @throws TooManyStreamingDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws InvalidArgumentException
     *         An argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.UpdateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateStreamingDistribution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateStreamingDistributionResult updateStreamingDistribution(UpdateStreamingDistributionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStreamingDistribution(request);
    }

    @SdkInternalApi
    final UpdateStreamingDistributionResult executeUpdateStreamingDistribution(UpdateStreamingDistributionRequest updateStreamingDistributionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStreamingDistributionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamingDistributionRequest> request = null;
        Response<UpdateStreamingDistributionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamingDistributionRequestMarshaller().marshall(super.beforeMarshalling(updateStreamingDistributionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStreamingDistribution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateStreamingDistributionResult> responseHandler = new StaxResponseHandler<UpdateStreamingDistributionResult>(
                    new UpdateStreamingDistributionResultStaxUnmarshaller());

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @Override
    public AmazonCloudFrontWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonCloudFrontWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}

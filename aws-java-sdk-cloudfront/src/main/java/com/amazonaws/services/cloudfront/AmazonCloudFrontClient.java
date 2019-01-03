/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        exceptionUnmarshallers.add(new TrustedSignerDoesNotExistExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchInvalidationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidWebACLIdExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchFieldLevelEncryptionConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyHeadersInForwardedValuesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginReadTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidMinimumProtocolVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyInvalidationsInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionConfigsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPublicKeysExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidErrorCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCacheBehaviorsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionFieldPatternsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new MissingBodyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTTLOrderExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequiredProtocolExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTrustedSignersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new BatchTooLargeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidResponseCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionConfigAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginKeepaliveTimeoutExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PublicKeyInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StreamingDistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PreconditionFailedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyQueryStringParametersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionEncryptionEntitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionConfigInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyStreamingDistributionCNAMEsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CloudFrontOriginAccessIdentityAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidProtocolSettingsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginCustomHeadersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLocationCodeExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidForwardCookiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileSizeExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCertificatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new QueryArgProfileEmptyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidQueryStringParametersExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CNAMEAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new IllegalUpdateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCookieNamesInWhiteListExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchFieldLevelEncryptionProfileExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchResourceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InconsistentQuantitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidLambdaFunctionAssociationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyLambdaFunctionAssociationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidViewerCertificateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new DistributionNotDisabledExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyOriginGroupsPerDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidDefaultRootObjectExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AccessDeniedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchStreamingDistributionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyCloudFrontOriginAccessIdentitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchPublicKeyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionContentTypeProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRelativePathExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsAssociatedToFieldLevelEncryptionConfigExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsWithLambdaAssociationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidHeadersForS3OriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyDistributionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CannotChangeImmutablePublicKeyFieldsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyFieldLevelEncryptionQueryArgProfilesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PublicKeyAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new FieldLevelEncryptionProfileInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidIfMatchVersionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidTaggingExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOriginExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NoSuchCloudFrontOriginAccessIdentityExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidGeoRestrictionParameterExceptionUnmarshaller());
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
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
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
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateCloudFrontOriginAccessIdentity"
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
     * update your distribution by using <a>UpdateDistribution</a>, follow the steps included in the documentation to
     * get the current configuration and then make your updates. This helps to make sure that you include all of the
     * required fields. To view a summary, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
     * >Required Fields for Create Distribution and Update Distribution</a> in the <i>Amazon CloudFront Developer
     * Guide</i>.
     * </p>
     * </important>
     * <p>
     * If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront
     * distribution. For more information, see <a>CreateStreamingDistribution</a>.
     * </p>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return Result of the CreateDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
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
     * @throws InvalidMinimumProtocolVersionException
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
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
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
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     * @throws InvalidOriginKeepaliveTimeoutException
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @sample AmazonCloudFront.CreateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateDistribution" target="_top">AWS
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
     * @throws InvalidMinimumProtocolVersionException
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
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
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
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws InvalidTaggingException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     * @throws InvalidOriginKeepaliveTimeoutException
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @sample AmazonCloudFront.CreateDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateDistributionWithTags"
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
     *         The argument is invalid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateFieldLevelEncryptionConfig"
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
     *         The argument is invalid.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateFieldLevelEncryptionProfile"
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
     *         The argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws BatchTooLargeException
     * @throws TooManyInvalidationsInProgressException
     *         You have exceeded the maximum number of allowable InProgress invalidation batch requests, or invalidation
     *         objects.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateInvalidation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateInvalidation" target="_top">AWS
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
     * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10
     * public keys with one AWS account.
     * </p>
     * 
     * @param createPublicKeyRequest
     * @return Result of the CreatePublicKey operation returned by the service.
     * @throws PublicKeyAlreadyExistsException
     *         The specified public key already exists.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws TooManyPublicKeysException
     *         The maximum number of public keys for field-level encryption have been created. To create a new public
     *         key, delete one of the existing keys.
     * @sample AmazonCloudFront.CreatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreatePublicKey" target="_top">AWS API
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
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution
     * streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.
     * </p>
     * <p>
     * To create a new web distribution, submit a <code>POST</code> request to the <i>CloudFront API
     * version</i>/distribution resource. The request body must include a document with a
     * <i>StreamingDistributionConfig</i> element. The response echoes the <code>StreamingDistributionConfig</code>
     * element and returns other information about the RTMP distribution.
     * </p>
     * <p>
     * To get the status of your request, use the <i>GET StreamingDistribution</i> API action. When the value of
     * <code>Enabled</code> is <code>true</code> and the value of <code>Status</code> is <code>Deployed</code>, your
     * distribution is ready. A distribution usually deploys in less than 15 minutes.
     * </p>
     * <p>
     * For more information about web distributions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-rtmp.html">Working with RTMP
     * Distributions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML
     * document that you include in the request body when you create or update a web distribution or an RTMP
     * distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too
     * easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs
     * and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions
     * and to notify you when there's a mismatch between the number of values you say you're specifying in the
     * <code>Quantity</code> element and the number of values specified.
     * </p>
     * </important>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return Result of the CreateStreamingDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
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
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.CreateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateStreamingDistribution"
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
     * Create a new streaming distribution with tags.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return Result of the CreateStreamingDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
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
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidTaggingException
     * @sample AmazonCloudFront.CreateStreamingDistributionWithTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CreateStreamingDistributionWithTags"
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
     * Delete an origin access identity.
     * </p>
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        Deletes a origin access identity.
     * @return Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws CloudFrontOriginAccessIdentityInUseException
     * @sample AmazonCloudFront.DeleteCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteCloudFrontOriginAccessIdentity"
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
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Result of the DeleteDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws DistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteDistribution" target="_top">AWS
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
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionConfigInUseException
     *         The specified configuration for field-level encryption is in use.
     * @sample AmazonCloudFront.DeleteFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteFieldLevelEncryptionConfig"
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
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionProfileInUseException
     *         The specified profile for field-level encryption is in use.
     * @sample AmazonCloudFront.DeleteFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteFieldLevelEncryptionProfile"
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
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeletePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeletePublicKey" target="_top">AWS API
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
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return Result of the DeleteStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws StreamingDistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/DeleteStreamingDistribution"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetCloudFrontOriginAccessIdentity"
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
     *        The origin access identity's configuration information. For more information, see
     *        <a>CloudFrontOriginAccessIdentityConfigComplexType</a>.
     * @return Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentityConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetCloudFrontOriginAccessIdentityConfig"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetDistribution" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetDistributionConfig"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetFieldLevelEncryption"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetFieldLevelEncryptionConfig"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetFieldLevelEncryptionProfile"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetFieldLevelEncryptionProfileConfig"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetInvalidation" target="_top">AWS API
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
     * Get the public key information.
     * </p>
     * 
     * @param getPublicKeyRequest
     * @return Result of the GetPublicKey operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @sample AmazonCloudFront.GetPublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetPublicKey" target="_top">AWS API
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
     * Return public key configuration informaation
     * </p>
     * 
     * @param getPublicKeyConfigRequest
     * @return Result of the GetPublicKeyConfig operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @sample AmazonCloudFront.GetPublicKeyConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetPublicKeyConfig" target="_top">AWS
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetStreamingDistribution"
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/GetStreamingDistributionConfig"
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
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return Result of the ListCloudFrontOriginAccessIdentities operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListCloudFrontOriginAccessIdentities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListCloudFrontOriginAccessIdentities"
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
     * List distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return Result of the ListDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListDistributions" target="_top">AWS
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
     * List the distributions that are associated with a specified AWS WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified AWS WAF web ACL.
     * @return Result of the ListDistributionsByWebACLId operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidWebACLIdException
     * @sample AmazonCloudFront.ListDistributionsByWebACLId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListDistributionsByWebACLId"
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
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListFieldLevelEncryptionConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListFieldLevelEncryptionConfigs"
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
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListFieldLevelEncryptionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListFieldLevelEncryptionProfiles"
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
     *         The argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListInvalidations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListInvalidations" target="_top">AWS
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
     * List all public keys that have been added to CloudFront for this account.
     * </p>
     * 
     * @param listPublicKeysRequest
     * @return Result of the ListPublicKeys operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListPublicKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListPublicKeys" target="_top">AWS API
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
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return Result of the ListStreamingDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListStreamingDistributions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListStreamingDistributions"
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
     *         The argument is invalid.
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @sample AmazonCloudFront.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/ListTagsForResource" target="_top">AWS
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
     *         The argument is invalid.
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @sample AmazonCloudFront.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/TagResource" target="_top">AWS API
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
     *         The argument is invalid.
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @sample AmazonCloudFront.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UntagResource" target="_top">AWS API
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
     * Update an origin access identity.
     * </p>
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.UpdateCloudFrontOriginAccessIdentity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateCloudFrontOriginAccessIdentity"
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
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
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
     * For information about updating a distribution using the CloudFront console instead, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-creating-console.html"
     * >Creating a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * <b>To update a web distribution using the CloudFront API</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>GetDistributionConfig</a> request to get the current configuration and an <code>Etag</code> header
     * for the distribution.
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
     * Optional: Submit a <a>GetDistribution</a> request to confirm that your changes have propagated. When propagation
     * is complete, the value of <code>Status</code> is <code>Deployed</code>.
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
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
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
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @throws TooManyDistributionsWithLambdaAssociationsException
     *         Processing your request would cause the maximum number of distributions with Lambda function associations
     *         per owner to be exceeded.
     * @throws TooManyLambdaFunctionAssociationsException
     *         Your request contains more Lambda function associations than are allowed per distribution.
     * @throws InvalidLambdaFunctionAssociationException
     *         The specified Lambda function association is invalid.
     * @throws InvalidOriginReadTimeoutException
     * @throws InvalidOriginKeepaliveTimeoutException
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws IllegalFieldLevelEncryptionConfigAssociationWithCacheBehaviorException
     *         The specified configuration for field-level encryption can't be associated with the specified cache
     *         behavior.
     * @throws TooManyDistributionsAssociatedToFieldLevelEncryptionConfigException
     *         The maximum number of distributions have been associated with the specified configuration for field-level
     *         encryption.
     * @sample AmazonCloudFront.UpdateDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateDistribution" target="_top">AWS
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
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws NoSuchFieldLevelEncryptionConfigException
     *         The specified configuration for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws TooManyFieldLevelEncryptionQueryArgProfilesException
     *         The maximum number of query arg profiles for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionContentTypeProfilesException
     *         The maximum number of content type profiles for field-level encryption have been created.
     * @throws QueryArgProfileEmptyException
     *         No profile specified for the field-level encryption query argument.
     * @sample AmazonCloudFront.UpdateFieldLevelEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateFieldLevelEncryptionConfig"
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
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws NoSuchFieldLevelEncryptionProfileException
     *         The specified profile for field-level encryption doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws FieldLevelEncryptionProfileSizeExceededException
     *         The maximum size of a profile for field-level encryption was exceeded.
     * @throws TooManyFieldLevelEncryptionEncryptionEntitiesException
     *         The maximum number of encryption entities for field-level encryption have been created.
     * @throws TooManyFieldLevelEncryptionFieldPatternsException
     *         The maximum number of field patterns for field-level encryption have been created.
     * @sample AmazonCloudFront.UpdateFieldLevelEncryptionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateFieldLevelEncryptionProfile"
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
     *         The argument is invalid.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws NoSuchPublicKeyException
     *         The specified public key doesn't exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.UpdatePublicKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdatePublicKey" target="_top">AWS API
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
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return Result of the UpdateStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the <code>Content-Type</code> header
     *         is set.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers don't exist.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> don't match.
     * @sample AmazonCloudFront.UpdateStreamingDistribution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/UpdateStreamingDistribution"
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

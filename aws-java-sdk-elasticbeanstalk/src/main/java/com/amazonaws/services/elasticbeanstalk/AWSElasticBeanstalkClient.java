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
package com.amazonaws.services.elasticbeanstalk;

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

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.services.elasticbeanstalk.model.transform.*;

/**
 * Client for accessing Elastic Beanstalk. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications
 * running on the Amazon Web Services cloud.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic
 * Beanstalk</a> details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href="http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl</a>. To install the Software
 * Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line tools that enable you to
 * access the API, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports, go to <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">Regions and Endpoints</a> in
 * the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSElasticBeanstalkClient extends AmazonWebServiceClient implements AWSElasticBeanstalk {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSElasticBeanstalk.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "elasticbeanstalk";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSElasticBeanstalkClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk. A credentials provider chain will be used
     * that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to Elastic Beanstalk (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticBeanstalkClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AWSElasticBeanstalkClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Beanstalk (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticBeanstalkClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Beanstalk (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Elastic Beanstalk (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSElasticBeanstalkClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSElasticBeanstalkClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSElasticBeanstalkClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSElasticBeanstalkClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSElasticBeanstalkClientBuilder builder() {
        return AWSElasticBeanstalkClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSElasticBeanstalkClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Elastic Beanstalk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSElasticBeanstalkClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new S3LocationNotInServiceRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ManagedActionInvalidStateExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientPrivilegesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyPlatformsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationVersionsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CodeBuildNotInServiceRegionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new S3SubscriptionRequiredExceptionUnmarshaller());
        exceptionUnmarshallers.add(new SourceBundleDeletionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyConfigurationTemplatesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceTypeNotSupportedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyTagsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyApplicationsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyEnvironmentsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TooManyBucketsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ElasticBeanstalkServiceExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PlatformVersionStillReferencedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.elasticbeanstalk.model.AWSElasticBeanstalkException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://elasticbeanstalk.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/elasticbeanstalk/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/elasticbeanstalk/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels in-progress environment configuration update or application version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest
     * @return Result of the AbortEnvironmentUpdate operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.AbortEnvironmentUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/AbortEnvironmentUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AbortEnvironmentUpdateResult abortEnvironmentUpdate(AbortEnvironmentUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeAbortEnvironmentUpdate(request);
    }

    @SdkInternalApi
    final AbortEnvironmentUpdateResult executeAbortEnvironmentUpdate(AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(abortEnvironmentUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AbortEnvironmentUpdateRequest> request = null;
        Response<AbortEnvironmentUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AbortEnvironmentUpdateRequestMarshaller().marshall(super.beforeMarshalling(abortEnvironmentUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AbortEnvironmentUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AbortEnvironmentUpdateResult> responseHandler = new StaxResponseHandler<AbortEnvironmentUpdateResult>(
                    new AbortEnvironmentUpdateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public AbortEnvironmentUpdateResult abortEnvironmentUpdate() {
        return abortEnvironmentUpdate(new AbortEnvironmentUpdateRequest());
    }

    /**
     * <p>
     * Applies a scheduled managed action immediately. A managed action can be applied only if its status is
     * <code>Scheduled</code>. Get the status and action ID of a managed action with
     * <a>DescribeEnvironmentManagedActions</a>.
     * </p>
     * 
     * @param applyEnvironmentManagedActionRequest
     *        Request to execute a scheduled managed action immediately.
     * @return Result of the ApplyEnvironmentManagedAction operation returned by the service.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @throws ManagedActionInvalidStateException
     *         Cannot modify the managed action in its current state.
     * @sample AWSElasticBeanstalk.ApplyEnvironmentManagedAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ApplyEnvironmentManagedAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ApplyEnvironmentManagedActionResult applyEnvironmentManagedAction(ApplyEnvironmentManagedActionRequest request) {
        request = beforeClientExecution(request);
        return executeApplyEnvironmentManagedAction(request);
    }

    @SdkInternalApi
    final ApplyEnvironmentManagedActionResult executeApplyEnvironmentManagedAction(ApplyEnvironmentManagedActionRequest applyEnvironmentManagedActionRequest) {

        ExecutionContext executionContext = createExecutionContext(applyEnvironmentManagedActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApplyEnvironmentManagedActionRequest> request = null;
        Response<ApplyEnvironmentManagedActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApplyEnvironmentManagedActionRequestMarshaller().marshall(super.beforeMarshalling(applyEnvironmentManagedActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApplyEnvironmentManagedAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ApplyEnvironmentManagedActionResult> responseHandler = new StaxResponseHandler<ApplyEnvironmentManagedActionResult>(
                    new ApplyEnvironmentManagedActionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest
     *        Results message indicating whether a CNAME is available.
     * @return Result of the CheckDNSAvailability operation returned by the service.
     * @sample AWSElasticBeanstalk.CheckDNSAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CheckDNSAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CheckDNSAvailabilityResult checkDNSAvailability(CheckDNSAvailabilityRequest request) {
        request = beforeClientExecution(request);
        return executeCheckDNSAvailability(request);
    }

    @SdkInternalApi
    final CheckDNSAvailabilityResult executeCheckDNSAvailability(CheckDNSAvailabilityRequest checkDNSAvailabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(checkDNSAvailabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CheckDNSAvailabilityRequest> request = null;
        Response<CheckDNSAvailabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CheckDNSAvailabilityRequestMarshaller().marshall(super.beforeMarshalling(checkDNSAvailabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CheckDNSAvailability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CheckDNSAvailabilityResult> responseHandler = new StaxResponseHandler<CheckDNSAvailabilityResult>(
                    new CheckDNSAvailabilityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create or update a group of environments that each run a separate component of a single application. Takes a list
     * of version labels that specify application source bundles for each of the environments to create or update. The
     * name of each environment and other required information must be included in the source bundles in an environment
     * manifest named <code>env.yaml</code>. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html">Compose
     * Environments</a> for details.
     * </p>
     * 
     * @param composeEnvironmentsRequest
     *        Request to create or update a group of environments.
     * @return Result of the ComposeEnvironments operation returned by the service.
     * @throws TooManyEnvironmentsException
     *         The specified account has reached its limit of environments.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.ComposeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ComposeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ComposeEnvironmentsResult composeEnvironments(ComposeEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeComposeEnvironments(request);
    }

    @SdkInternalApi
    final ComposeEnvironmentsResult executeComposeEnvironments(ComposeEnvironmentsRequest composeEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(composeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ComposeEnvironmentsRequest> request = null;
        Response<ComposeEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ComposeEnvironmentsRequestMarshaller().marshall(super.beforeMarshalling(composeEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ComposeEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ComposeEnvironmentsResult> responseHandler = new StaxResponseHandler<ComposeEnvironmentsResult>(
                    new ComposeEnvironmentsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application that has one configuration template named <code>default</code> and no application
     * versions.
     * </p>
     * 
     * @param createApplicationRequest
     *        Request to create an application.
     * @return Result of the CreateApplication operation returned by the service.
     * @throws TooManyApplicationsException
     *         The specified account has reached its limit of applications.
     * @sample AWSElasticBeanstalk.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationResult createApplication(CreateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplication(request);
    }

    @SdkInternalApi
    final CreateApplicationResult executeCreateApplication(CreateApplicationRequest createApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestMarshaller().marshall(super.beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateApplicationResult> responseHandler = new StaxResponseHandler<CreateApplicationResult>(
                    new CreateApplicationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an application version for the specified application. You can create an application version from a source
     * bundle in Amazon S3, a commit in AWS CodeCommit, or the output of an AWS CodeBuild build as follows:
     * </p>
     * <p>
     * Specify a commit in an AWS CodeCommit repository with <code>SourceBuildInformation</code>.
     * </p>
     * <p>
     * Specify a build in an AWS CodeBuild with <code>SourceBuildInformation</code> and <code>BuildConfiguration</code>.
     * </p>
     * <p>
     * Specify a source bundle in S3 with <code>SourceBundle</code>
     * </p>
     * <p>
     * Omit both <code>SourceBuildInformation</code> and <code>SourceBundle</code> to use the default sample
     * application.
     * </p>
     * <note>
     * <p>
     * Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that
     * Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an
     * environment from the application version.
     * </p>
     * </note>
     * 
     * @param createApplicationVersionRequest
     * @return Result of the CreateApplicationVersion operation returned by the service.
     * @throws TooManyApplicationsException
     *         The specified account has reached its limit of applications.
     * @throws TooManyApplicationVersionsException
     *         The specified account has reached its limit of application versions.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which the service is running. The following
     *         regions are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         IAD/us-east-1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PDX/us-west-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DUB/eu-west-1
     *         </p>
     *         </li>
     * @throws CodeBuildNotInServiceRegionException
     *         AWS CodeBuild is not available in the specified region.
     * @sample AWSElasticBeanstalk.CreateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateApplicationVersionResult createApplicationVersion(CreateApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateApplicationVersion(request);
    }

    @SdkInternalApi
    final CreateApplicationVersionResult executeCreateApplicationVersion(CreateApplicationVersionRequest createApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationVersionRequest> request = null;
        Response<CreateApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationVersionRequestMarshaller().marshall(super.beforeMarshalling(createApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateApplicationVersionResult> responseHandler = new StaxResponseHandler<CreateApplicationVersionResult>(
                    new CreateApplicationVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a specific application and are used to deploy
     * different versions of the application with the same configuration settings.
     * </p>
     * <p>
     * Templates aren't associated with any environment. The <code>EnvironmentName</code> response element is always
     * <code>null</code>.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeConfigurationSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAvailableSolutionStacks</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest
     *        Request to create a configuration template.
     * @return Result of the CreateConfigurationTemplate operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @throws TooManyConfigurationTemplatesException
     *         The specified account has reached its limit of configuration templates.
     * @sample AWSElasticBeanstalk.CreateConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfigurationTemplateResult createConfigurationTemplate(CreateConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfigurationTemplate(request);
    }

    @SdkInternalApi
    final CreateConfigurationTemplateResult executeCreateConfigurationTemplate(CreateConfigurationTemplateRequest createConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfigurationTemplateRequest> request = null;
        Response<CreateConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfigurationTemplateRequestMarshaller().marshall(super.beforeMarshalling(createConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateConfigurationTemplateResult> responseHandler = new StaxResponseHandler<CreateConfigurationTemplateResult>(
                    new CreateConfigurationTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launches an environment for the specified application using the specified configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws TooManyEnvironmentsException
     *         The specified account has reached its limit of environments.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEnvironment(request);
    }

    @SdkInternalApi
    final CreateEnvironmentResult executeCreateEnvironment(CreateEnvironmentRequest createEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEnvironmentRequest> request = null;
        Response<CreateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEnvironmentRequestMarshaller().marshall(super.beforeMarshalling(createEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateEnvironmentResult> responseHandler = new StaxResponseHandler<CreateEnvironmentResult>(
                    new CreateEnvironmentResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new version of your custom platform.
     * </p>
     * 
     * @param createPlatformVersionRequest
     *        Request to create a new platform version.
     * @return Result of the CreatePlatformVersion operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @throws TooManyPlatformsException
     *         You have exceeded the maximum number of allowed platforms associated with the account.
     * @sample AWSElasticBeanstalk.CreatePlatformVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreatePlatformVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePlatformVersionResult createPlatformVersion(CreatePlatformVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePlatformVersion(request);
    }

    @SdkInternalApi
    final CreatePlatformVersionResult executeCreatePlatformVersion(CreatePlatformVersionRequest createPlatformVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createPlatformVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePlatformVersionRequest> request = null;
        Response<CreatePlatformVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePlatformVersionRequestMarshaller().marshall(super.beforeMarshalling(createPlatformVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePlatformVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreatePlatformVersionResult> responseHandler = new StaxResponseHandler<CreatePlatformVersionResult>(
                    new CreatePlatformVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a bucket in Amazon S3 to store application versions, logs, and other files used by Elastic Beanstalk
     * environments. The Elastic Beanstalk console and EB CLI call this API the first time you create an environment in
     * a region. If the storage location already exists, <code>CreateStorageLocation</code> still returns the bucket
     * name but does not create a new bucket.
     * </p>
     * 
     * @param createStorageLocationRequest
     * @return Result of the CreateStorageLocation operation returned by the service.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @throws S3SubscriptionRequiredException
     *         The specified account does not have a subscription to Amazon S3.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.CreateStorageLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateStorageLocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStorageLocationResult createStorageLocation(CreateStorageLocationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStorageLocation(request);
    }

    @SdkInternalApi
    final CreateStorageLocationResult executeCreateStorageLocation(CreateStorageLocationRequest createStorageLocationRequest) {

        ExecutionContext executionContext = createExecutionContext(createStorageLocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageLocationRequest> request = null;
        Response<CreateStorageLocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorageLocationRequestMarshaller().marshall(super.beforeMarshalling(createStorageLocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStorageLocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStorageLocationResult> responseHandler = new StaxResponseHandler<CreateStorageLocationResult>(
                    new CreateStorageLocationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateStorageLocationResult createStorageLocation() {
        return createStorageLocation(new CreateStorageLocationRequest());
    }

    /**
     * <p>
     * Deletes the specified application along with all associated versions and configurations. The application versions
     * will not be deleted from your Amazon S3 bucket.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application that has a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     *        Request to delete an application.
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @sample AWSElasticBeanstalk.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationResult deleteApplication(DeleteApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplication(request);
    }

    @SdkInternalApi
    final DeleteApplicationResult executeDeleteApplication(DeleteApplicationRequest deleteApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestMarshaller().marshall(super.beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteApplicationResult> responseHandler = new StaxResponseHandler<DeleteApplicationResult>(
                    new DeleteApplicationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application version that is associated with a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationVersionRequest
     *        Request to delete an application version.
     * @return Result of the DeleteApplicationVersion operation returned by the service.
     * @throws SourceBundleDeletionException
     *         Unable to delete the Amazon S3 source bundle associated with the application version. The application
     *         version was deleted successfully.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @throws S3LocationNotInServiceRegionException
     *         The specified S3 bucket does not belong to the S3 region in which the service is running. The following
     *         regions are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         IAD/us-east-1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PDX/us-west-2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DUB/eu-west-1
     *         </p>
     *         </li>
     * @sample AWSElasticBeanstalk.DeleteApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteApplicationVersionResult deleteApplicationVersion(DeleteApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteApplicationVersion(request);
    }

    @SdkInternalApi
    final DeleteApplicationVersionResult executeDeleteApplicationVersion(DeleteApplicationVersionRequest deleteApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationVersionRequest> request = null;
        Response<DeleteApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationVersionRequestMarshaller().marshall(super.beforeMarshalling(deleteApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteApplicationVersionResult> responseHandler = new StaxResponseHandler<DeleteApplicationVersionResult>(
                    new DeleteApplicationVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>
     * <p>
     * When you launch an environment using a configuration template, the environment gets a copy of the template. You
     * can delete or modify the environment's copy of the template without affecting the running environment.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationTemplateRequest
     *        Request to delete a configuration template.
     * @return Result of the DeleteConfigurationTemplate operation returned by the service.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @sample AWSElasticBeanstalk.DeleteConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfigurationTemplateResult deleteConfigurationTemplate(DeleteConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfigurationTemplate(request);
    }

    @SdkInternalApi
    final DeleteConfigurationTemplateResult executeDeleteConfigurationTemplate(DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfigurationTemplateRequest> request = null;
        Response<DeleteConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfigurationTemplateRequestMarshaller().marshall(super.beforeMarshalling(deleteConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteConfigurationTemplateResult> responseHandler = new StaxResponseHandler<DeleteConfigurationTemplateResult>(
                    new DeleteConfigurationTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a draft configuration set. You can get the
     * draft configuration using <a>DescribeConfigurationSettings</a> while the update is in progress or if the update
     * fails. The <code>DeploymentStatus</code> for the draft configuration indicates whether the deployment is in
     * process or has failed. The draft configuration remains in existence until it is deleted with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest
     *        Request to delete a draft environment configuration.
     * @return Result of the DeleteEnvironmentConfiguration operation returned by the service.
     * @sample AWSElasticBeanstalk.DeleteEnvironmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteEnvironmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEnvironmentConfigurationResult deleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEnvironmentConfiguration(request);
    }

    @SdkInternalApi
    final DeleteEnvironmentConfigurationResult executeDeleteEnvironmentConfiguration(DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEnvironmentConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEnvironmentConfigurationRequest> request = null;
        Response<DeleteEnvironmentConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEnvironmentConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteEnvironmentConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEnvironmentConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteEnvironmentConfigurationResult> responseHandler = new StaxResponseHandler<DeleteEnvironmentConfigurationResult>(
                    new DeleteEnvironmentConfigurationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified version of a custom platform.
     * </p>
     * 
     * @param deletePlatformVersionRequest
     * @return Result of the DeletePlatformVersion operation returned by the service.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @throws PlatformVersionStillReferencedException
     *         You cannot delete the platform version because there are still environments running on it.
     * @sample AWSElasticBeanstalk.DeletePlatformVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeletePlatformVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePlatformVersionResult deletePlatformVersion(DeletePlatformVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePlatformVersion(request);
    }

    @SdkInternalApi
    final DeletePlatformVersionResult executeDeletePlatformVersion(DeletePlatformVersionRequest deletePlatformVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePlatformVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePlatformVersionRequest> request = null;
        Response<DeletePlatformVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePlatformVersionRequestMarshaller().marshall(super.beforeMarshalling(deletePlatformVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePlatformVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeletePlatformVersionResult> responseHandler = new StaxResponseHandler<DeletePlatformVersionResult>(
                    new DeletePlatformVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns attributes related to AWS Elastic Beanstalk that are associated with the calling AWS account.
     * </p>
     * <p>
     * The result currently has one set of attributes—resource quotas.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeAccountAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountAttributes(request);
    }

    @SdkInternalApi
    final DescribeAccountAttributesResult executeDescribeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestMarshaller().marshall(super.beforeMarshalling(describeAccountAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAccountAttributesResult> responseHandler = new StaxResponseHandler<DescribeAccountAttributesResult>(
                    new DescribeAccountAttributesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve a list of application versions.
     * </p>
     * 
     * @param describeApplicationVersionsRequest
     *        Request to describe application versions.
     * @return Result of the DescribeApplicationVersions operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeApplicationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeApplicationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationVersionsResult describeApplicationVersions(DescribeApplicationVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationVersions(request);
    }

    @SdkInternalApi
    final DescribeApplicationVersionsResult executeDescribeApplicationVersions(DescribeApplicationVersionsRequest describeApplicationVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationVersionsRequest> request = null;
        Response<DescribeApplicationVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationVersionsRequestMarshaller().marshall(super.beforeMarshalling(describeApplicationVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeApplicationVersionsResult> responseHandler = new StaxResponseHandler<DescribeApplicationVersionsResult>(
                    new DescribeApplicationVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeApplicationVersionsResult describeApplicationVersions() {
        return describeApplicationVersions(new DescribeApplicationVersionsRequest());
    }

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest
     *        Request to describe one or more applications.
     * @return Result of the DescribeApplications operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeApplications"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationsResult describeApplications(DescribeApplicationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplications(request);
    }

    @SdkInternalApi
    final DescribeApplicationsResult executeDescribeApplications(DescribeApplicationsRequest describeApplicationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationsRequest> request = null;
        Response<DescribeApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationsRequestMarshaller().marshall(super.beforeMarshalling(describeApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplications");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeApplicationsResult> responseHandler = new StaxResponseHandler<DescribeApplicationsResult>(
                    new DescribeApplicationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeApplicationsResult describeApplications() {
        return describeApplications(new DescribeApplicationsRequest());
    }

    /**
     * <p>
     * Describes the configuration options that are used in a particular configuration template or environment, or that
     * a specified solution stack defines. The description includes the values the options, their default values, and an
     * indication of the required action on a running environment if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest
     *        Result message containing a list of application version descriptions.
     * @return Result of the DescribeConfigurationOptions operation returned by the service.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.DescribeConfigurationOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationOptions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationOptionsResult describeConfigurationOptions(DescribeConfigurationOptionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationOptions(request);
    }

    @SdkInternalApi
    final DescribeConfigurationOptionsResult executeDescribeConfigurationOptions(DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationOptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationOptionsRequest> request = null;
        Response<DescribeConfigurationOptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationOptionsRequestMarshaller().marshall(super.beforeMarshalling(describeConfigurationOptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationOptions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeConfigurationOptionsResult> responseHandler = new StaxResponseHandler<DescribeConfigurationOptionsResult>(
                    new DescribeConfigurationOptionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the settings for the specified configuration set, that is, either a configuration
     * template or the configuration set associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a running environment, it is possible to
     * receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft
     * configuration of an environment that is either in the process of deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteEnvironmentConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest
     *        Result message containing all of the configuration settings for a specified solution stack or
     *        configuration template.
     * @return Result of the DescribeConfigurationSettings operation returned by the service.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.DescribeConfigurationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeConfigurationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConfigurationSettingsResult describeConfigurationSettings(DescribeConfigurationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConfigurationSettings(request);
    }

    @SdkInternalApi
    final DescribeConfigurationSettingsResult executeDescribeConfigurationSettings(DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConfigurationSettingsRequest> request = null;
        Response<DescribeConfigurationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConfigurationSettingsRequestMarshaller().marshall(super.beforeMarshalling(describeConfigurationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConfigurationSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeConfigurationSettingsResult> responseHandler = new StaxResponseHandler<DescribeConfigurationSettingsResult>(
                    new DescribeConfigurationSettingsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the overall health of the specified environment. The <b>DescribeEnvironmentHealth</b>
     * operation is only available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest
     *        See the example below to learn how to create a request body.
     * @return Result of the DescribeEnvironmentHealth operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters is not valid. Please correct the input parameters and try the operation
     *         again.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentHealthResult describeEnvironmentHealth(DescribeEnvironmentHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironmentHealth(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentHealthResult executeDescribeEnvironmentHealth(DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentHealthRequest> request = null;
        Response<DescribeEnvironmentHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentHealthRequestMarshaller().marshall(super.beforeMarshalling(describeEnvironmentHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironmentHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEnvironmentHealthResult> responseHandler = new StaxResponseHandler<DescribeEnvironmentHealthResult>(
                    new DescribeEnvironmentHealthResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists an environment's completed and failed managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionHistoryRequest
     *        Request to list completed and failed managed actions.
     * @return Result of the DescribeEnvironmentManagedActionHistory operation returned by the service.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentManagedActionHistory
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentManagedActionHistoryResult describeEnvironmentManagedActionHistory(DescribeEnvironmentManagedActionHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironmentManagedActionHistory(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentManagedActionHistoryResult executeDescribeEnvironmentManagedActionHistory(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentManagedActionHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentManagedActionHistoryRequest> request = null;
        Response<DescribeEnvironmentManagedActionHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentManagedActionHistoryRequestMarshaller().marshall(super
                        .beforeMarshalling(describeEnvironmentManagedActionHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironmentManagedActionHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEnvironmentManagedActionHistoryResult> responseHandler = new StaxResponseHandler<DescribeEnvironmentManagedActionHistoryResult>(
                    new DescribeEnvironmentManagedActionHistoryResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists an environment's upcoming and in-progress managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionsRequest
     *        Request to list an environment's upcoming and in-progress managed actions.
     * @return Result of the DescribeEnvironmentManagedActions operation returned by the service.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentManagedActions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentManagedActionsResult describeEnvironmentManagedActions(DescribeEnvironmentManagedActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironmentManagedActions(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentManagedActionsResult executeDescribeEnvironmentManagedActions(
            DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentManagedActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentManagedActionsRequest> request = null;
        Response<DescribeEnvironmentManagedActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentManagedActionsRequestMarshaller().marshall(super.beforeMarshalling(describeEnvironmentManagedActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironmentManagedActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEnvironmentManagedActionsResult> responseHandler = new StaxResponseHandler<DescribeEnvironmentManagedActionsResult>(
                    new DescribeEnvironmentManagedActionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest
     *        Request to describe the resources in an environment.
     * @return Result of the DescribeEnvironmentResources operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.DescribeEnvironmentResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentResourcesResult describeEnvironmentResources(DescribeEnvironmentResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironmentResources(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentResourcesResult executeDescribeEnvironmentResources(DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentResourcesRequest> request = null;
        Response<DescribeEnvironmentResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentResourcesRequestMarshaller().marshall(super.beforeMarshalling(describeEnvironmentResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironmentResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEnvironmentResourcesResult> responseHandler = new StaxResponseHandler<DescribeEnvironmentResourcesResult>(
                    new DescribeEnvironmentResourcesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     *        Request to describe one or more environments.
     * @return Result of the DescribeEnvironments operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEnvironmentsResult describeEnvironments(DescribeEnvironmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEnvironments(request);
    }

    @SdkInternalApi
    final DescribeEnvironmentsResult executeDescribeEnvironments(DescribeEnvironmentsRequest describeEnvironmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEnvironmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEnvironmentsRequest> request = null;
        Response<DescribeEnvironmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEnvironmentsRequestMarshaller().marshall(super.beforeMarshalling(describeEnvironmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEnvironments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEnvironmentsResult> responseHandler = new StaxResponseHandler<DescribeEnvironmentsResult>(
                    new DescribeEnvironmentsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEnvironmentsResult describeEnvironments() {
        return describeEnvironments(new DescribeEnvironmentsRequest());
    }

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6 weeks.
     * </p>
     * <note>
     * <p>
     * This action returns the most recent 1,000 events from the specified <code>NextToken</code>.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     *        Request to retrieve a list of events for an environment.
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AWSElasticBeanstalk.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEvents(request);
    }

    @SdkInternalApi
    final DescribeEventsResult executeDescribeEvents(DescribeEventsRequest describeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventsRequest> request = null;
        Response<DescribeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventsRequestMarshaller().marshall(super.beforeMarshalling(describeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeEventsResult> responseHandler = new StaxResponseHandler<DescribeEventsResult>(
                    new DescribeEventsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    /**
     * <p>
     * Retrieves detailed information about the health of instances in your AWS Elastic Beanstalk. This operation
     * requires <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced.html">enhanced health
     * reporting</a>.
     * </p>
     * 
     * @param describeInstancesHealthRequest
     *        Parameters for a call to <code>DescribeInstancesHealth</code>.
     * @return Result of the DescribeInstancesHealth operation returned by the service.
     * @throws InvalidRequestException
     *         One or more input parameters is not valid. Please correct the input parameters and try the operation
     *         again.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribeInstancesHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeInstancesHealth"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstancesHealthResult describeInstancesHealth(DescribeInstancesHealthRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstancesHealth(request);
    }

    @SdkInternalApi
    final DescribeInstancesHealthResult executeDescribeInstancesHealth(DescribeInstancesHealthRequest describeInstancesHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstancesHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancesHealthRequest> request = null;
        Response<DescribeInstancesHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancesHealthRequestMarshaller().marshall(super.beforeMarshalling(describeInstancesHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstancesHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeInstancesHealthResult> responseHandler = new StaxResponseHandler<DescribeInstancesHealthResult>(
                    new DescribeInstancesHealthResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the version of the platform.
     * </p>
     * 
     * @param describePlatformVersionRequest
     * @return Result of the DescribePlatformVersion operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.DescribePlatformVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribePlatformVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePlatformVersionResult describePlatformVersion(DescribePlatformVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePlatformVersion(request);
    }

    @SdkInternalApi
    final DescribePlatformVersionResult executeDescribePlatformVersion(DescribePlatformVersionRequest describePlatformVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(describePlatformVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePlatformVersionRequest> request = null;
        Response<DescribePlatformVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePlatformVersionRequestMarshaller().marshall(super.beforeMarshalling(describePlatformVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePlatformVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribePlatformVersionResult> responseHandler = new StaxResponseHandler<DescribePlatformVersionResult>(
                    new DescribePlatformVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the available solution stack names, with the public version first and then in reverse
     * chronological order.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     * @return Result of the ListAvailableSolutionStacks operation returned by the service.
     * @sample AWSElasticBeanstalk.ListAvailableSolutionStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListAvailableSolutionStacks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks(ListAvailableSolutionStacksRequest request) {
        request = beforeClientExecution(request);
        return executeListAvailableSolutionStacks(request);
    }

    @SdkInternalApi
    final ListAvailableSolutionStacksResult executeListAvailableSolutionStacks(ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest) {

        ExecutionContext executionContext = createExecutionContext(listAvailableSolutionStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAvailableSolutionStacksRequest> request = null;
        Response<ListAvailableSolutionStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAvailableSolutionStacksRequestMarshaller().marshall(super.beforeMarshalling(listAvailableSolutionStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAvailableSolutionStacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListAvailableSolutionStacksResult> responseHandler = new StaxResponseHandler<ListAvailableSolutionStacksResult>(
                    new ListAvailableSolutionStacksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListAvailableSolutionStacksResult listAvailableSolutionStacks() {
        return listAvailableSolutionStacks(new ListAvailableSolutionStacksRequest());
    }

    /**
     * <p>
     * Lists the available platforms.
     * </p>
     * 
     * @param listPlatformVersionsRequest
     * @return Result of the ListPlatformVersions operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ElasticBeanstalkServiceException
     *         A generic service exception has occurred.
     * @sample AWSElasticBeanstalk.ListPlatformVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListPlatformVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPlatformVersionsResult listPlatformVersions(ListPlatformVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListPlatformVersions(request);
    }

    @SdkInternalApi
    final ListPlatformVersionsResult executeListPlatformVersions(ListPlatformVersionsRequest listPlatformVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPlatformVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPlatformVersionsRequest> request = null;
        Response<ListPlatformVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPlatformVersionsRequestMarshaller().marshall(super.beforeMarshalling(listPlatformVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPlatformVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListPlatformVersionsResult> responseHandler = new StaxResponseHandler<ListPlatformVersionsResult>(
                    new ListPlatformVersionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the tags applied to an AWS Elastic Beanstalk resource. The response contains a list of tag key-value
     * pairs.
     * </p>
     * <p>
     * Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
     * environment tagging, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html">Tagging Resources in
     * Your Elastic Beanstalk Environment</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN).
     * @throws ResourceTypeNotSupportedException
     *         The type of the specified Amazon Resource Name (ARN) isn't supported for this operation.
     * @sample AWSElasticBeanstalk.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
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
     * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a
     * specified environment and forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest
     * @return Result of the RebuildEnvironment operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.RebuildEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RebuildEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RebuildEnvironmentResult rebuildEnvironment(RebuildEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeRebuildEnvironment(request);
    }

    @SdkInternalApi
    final RebuildEnvironmentResult executeRebuildEnvironment(RebuildEnvironmentRequest rebuildEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(rebuildEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebuildEnvironmentRequest> request = null;
        Response<RebuildEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebuildEnvironmentRequestMarshaller().marshall(super.beforeMarshalling(rebuildEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RebuildEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RebuildEnvironmentResult> responseHandler = new StaxResponseHandler<RebuildEnvironmentResult>(
                    new RebuildEnvironmentResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last lines from the application server log
     * files of every Amazon EC2 instance in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the application server log files for every
     * Amazon EC2 instance into a <code>.zip</code> file. Legacy and .NET containers do not support bundle logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RetrieveEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest
     *        Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
     * @return Result of the RequestEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalk.RequestEnvironmentInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RequestEnvironmentInfo"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RequestEnvironmentInfoResult requestEnvironmentInfo(RequestEnvironmentInfoRequest request) {
        request = beforeClientExecution(request);
        return executeRequestEnvironmentInfo(request);
    }

    @SdkInternalApi
    final RequestEnvironmentInfoResult executeRequestEnvironmentInfo(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest) {

        ExecutionContext executionContext = createExecutionContext(requestEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RequestEnvironmentInfoRequest> request = null;
        Response<RequestEnvironmentInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RequestEnvironmentInfoRequestMarshaller().marshall(super.beforeMarshalling(requestEnvironmentInfoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RequestEnvironmentInfo");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RequestEnvironmentInfoResult> responseHandler = new StaxResponseHandler<RequestEnvironmentInfoResult>(
                    new RequestEnvironmentInfoResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Causes the environment to restart the application container server running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest
     * @return Result of the RestartAppServer operation returned by the service.
     * @sample AWSElasticBeanstalk.RestartAppServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RestartAppServer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestartAppServerResult restartAppServer(RestartAppServerRequest request) {
        request = beforeClientExecution(request);
        return executeRestartAppServer(request);
    }

    @SdkInternalApi
    final RestartAppServerResult executeRestartAppServer(RestartAppServerRequest restartAppServerRequest) {

        ExecutionContext executionContext = createExecutionContext(restartAppServerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestartAppServerRequest> request = null;
        Response<RestartAppServerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestartAppServerRequestMarshaller().marshall(super.beforeMarshalling(restartAppServerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestartAppServer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RestartAppServerResult> responseHandler = new StaxResponseHandler<RestartAppServerResult>(
                    new RestartAppServerResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a> request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RequestEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest
     *        Request to download logs retrieved with <a>RequestEnvironmentInfo</a>.
     * @return Result of the RetrieveEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalk.RetrieveEnvironmentInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/RetrieveEnvironmentInfo"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RetrieveEnvironmentInfoResult retrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest request) {
        request = beforeClientExecution(request);
        return executeRetrieveEnvironmentInfo(request);
    }

    @SdkInternalApi
    final RetrieveEnvironmentInfoResult executeRetrieveEnvironmentInfo(RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest) {

        ExecutionContext executionContext = createExecutionContext(retrieveEnvironmentInfoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RetrieveEnvironmentInfoRequest> request = null;
        Response<RetrieveEnvironmentInfoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RetrieveEnvironmentInfoRequestMarshaller().marshall(super.beforeMarshalling(retrieveEnvironmentInfoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RetrieveEnvironmentInfo");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RetrieveEnvironmentInfoResult> responseHandler = new StaxResponseHandler<RetrieveEnvironmentInfoResult>(
                    new RetrieveEnvironmentInfoResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest
     *        Swaps the CNAMEs of two environments.
     * @return Result of the SwapEnvironmentCNAMEs operation returned by the service.
     * @sample AWSElasticBeanstalk.SwapEnvironmentCNAMEs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/SwapEnvironmentCNAMEs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SwapEnvironmentCNAMEsResult swapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest request) {
        request = beforeClientExecution(request);
        return executeSwapEnvironmentCNAMEs(request);
    }

    @SdkInternalApi
    final SwapEnvironmentCNAMEsResult executeSwapEnvironmentCNAMEs(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest) {

        ExecutionContext executionContext = createExecutionContext(swapEnvironmentCNAMEsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SwapEnvironmentCNAMEsRequest> request = null;
        Response<SwapEnvironmentCNAMEsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SwapEnvironmentCNAMEsRequestMarshaller().marshall(super.beforeMarshalling(swapEnvironmentCNAMEsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SwapEnvironmentCNAMEs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SwapEnvironmentCNAMEsResult> responseHandler = new StaxResponseHandler<SwapEnvironmentCNAMEsResult>(
                    new SwapEnvironmentCNAMEsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public SwapEnvironmentCNAMEsResult swapEnvironmentCNAMEs() {
        return swapEnvironmentCNAMEs(new SwapEnvironmentCNAMEsRequest());
    }

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest
     *        Request to terminate an environment.
     * @return Result of the TerminateEnvironment operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.TerminateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/TerminateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TerminateEnvironmentResult terminateEnvironment(TerminateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateEnvironment(request);
    }

    @SdkInternalApi
    final TerminateEnvironmentResult executeTerminateEnvironment(TerminateEnvironmentRequest terminateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateEnvironmentRequest> request = null;
        Response<TerminateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateEnvironmentRequestMarshaller().marshall(super.beforeMarshalling(terminateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TerminateEnvironmentResult> responseHandler = new StaxResponseHandler<TerminateEnvironmentResult>(
                    new TerminateEnvironmentResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * these properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     *        Request to update an application.
     * @return Result of the UpdateApplication operation returned by the service.
     * @sample AWSElasticBeanstalk.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationResult updateApplication(UpdateApplicationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplication(request);
    }

    @SdkInternalApi
    final UpdateApplicationResult executeUpdateApplication(UpdateApplicationRequest updateApplicationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller().marshall(super.beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplication");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateApplicationResult> responseHandler = new StaxResponseHandler<UpdateApplicationResult>(
                    new UpdateApplicationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies lifecycle settings for an application.
     * </p>
     * 
     * @param updateApplicationResourceLifecycleRequest
     * @return Result of the UpdateApplicationResourceLifecycle operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @sample AWSElasticBeanstalk.UpdateApplicationResourceLifecycle
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplicationResourceLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationResourceLifecycleResult updateApplicationResourceLifecycle(UpdateApplicationResourceLifecycleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplicationResourceLifecycle(request);
    }

    @SdkInternalApi
    final UpdateApplicationResourceLifecycleResult executeUpdateApplicationResourceLifecycle(
            UpdateApplicationResourceLifecycleRequest updateApplicationResourceLifecycleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationResourceLifecycleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationResourceLifecycleRequest> request = null;
        Response<UpdateApplicationResourceLifecycleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationResourceLifecycleRequestMarshaller()
                        .marshall(super.beforeMarshalling(updateApplicationResourceLifecycleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplicationResourceLifecycle");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateApplicationResourceLifecycleResult> responseHandler = new StaxResponseHandler<UpdateApplicationResourceLifecycleResult>(
                    new UpdateApplicationResourceLifecycleResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified application version to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationVersionRequest
     * @return Result of the UpdateApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalk.UpdateApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateApplicationVersionResult updateApplicationVersion(UpdateApplicationVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateApplicationVersion(request);
    }

    @SdkInternalApi
    final UpdateApplicationVersionResult executeUpdateApplicationVersion(UpdateApplicationVersionRequest updateApplicationVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateApplicationVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationVersionRequest> request = null;
        Response<UpdateApplicationVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationVersionRequestMarshaller().marshall(super.beforeMarshalling(updateApplicationVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateApplicationVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateApplicationVersionResult> responseHandler = new StaxResponseHandler<UpdateApplicationVersionResult>(
                    new UpdateApplicationVersionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified configuration template to have the specified properties or configuration option values.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>ApplicationName</code>) is not provided, its value remains unchanged. To clear
     * such properties, specify an empty string.
     * </p>
     * </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest
     *        The result message containing the options for the specified solution stack.
     * @return Result of the UpdateConfigurationTemplate operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.UpdateConfigurationTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateConfigurationTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfigurationTemplateResult updateConfigurationTemplate(UpdateConfigurationTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfigurationTemplate(request);
    }

    @SdkInternalApi
    final UpdateConfigurationTemplateResult executeUpdateConfigurationTemplate(UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfigurationTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfigurationTemplateRequest> request = null;
        Response<UpdateConfigurationTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfigurationTemplateRequestMarshaller().marshall(super.beforeMarshalling(updateConfigurationTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfigurationTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateConfigurationTemplateResult> responseHandler = new StaxResponseHandler<UpdateConfigurationTemplateResult>(
                    new UpdateConfigurationTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the environment description, deploys a new application version, updates the configuration settings to an
     * entirely new configuration template, or updates select configuration option values in the running environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual settings, a draft configuration is
     * created and <a>DescribeConfigurationSettings</a> for this environment returns two setting descriptions with
     * different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest
     *        Request to update an environment.
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEnvironment(request);
    }

    @SdkInternalApi
    final UpdateEnvironmentResult executeUpdateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEnvironmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEnvironmentRequest> request = null;
        Response<UpdateEnvironmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEnvironmentRequestMarshaller().marshall(super.beforeMarshalling(updateEnvironmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEnvironment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateEnvironmentResult> responseHandler = new StaxResponseHandler<UpdateEnvironmentResult>(
                    new UpdateEnvironmentResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two lists can be passed:
     * <code>TagsToAdd</code> for tags to add or update, and <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Currently, Elastic Beanstalk only supports tagging of Elastic Beanstalk environments. For details about
     * environment tagging, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.tagging.html">Tagging Resources in
     * Your Elastic Beanstalk Environment</a>.
     * </p>
     * <p>
     * If you create a custom IAM user policy to control permission to this operation, specify one of the following two
     * virtual actions (or both) instead of the API operation name:
     * </p>
     * <dl>
     * <dt>elasticbeanstalk:AddTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a list of tags to add in the
     * <code>TagsToAdd</code> parameter.
     * </p>
     * </dd>
     * <dt>elasticbeanstalk:RemoveTags</dt>
     * <dd>
     * <p>
     * Controls permission to call <code>UpdateTagsForResource</code> and pass a list of tag keys to remove in the
     * <code>TagsToRemove</code> parameter.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For details about creating a custom user policy, see <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies"
     * >Creating a Custom User Policy</a>.
     * </p>
     * 
     * @param updateTagsForResourceRequest
     * @return Result of the UpdateTagsForResource operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws OperationInProgressException
     *         Unable to perform the specified operation because another operation that effects an element in this
     *         activity is already in progress.
     * @throws TooManyTagsException
     *         The number of tags in the resource would exceed the number of tags that each resource can have.</p>
     *         <p>
     *         To calculate this, the operation considers both the number of tags the resource already has and the tags
     *         this operation would add if it succeeded.
     * @throws ResourceNotFoundException
     *         A resource doesn't exist for the specified Amazon Resource Name (ARN).
     * @throws ResourceTypeNotSupportedException
     *         The type of the specified Amazon Resource Name (ARN) isn't supported for this operation.
     * @sample AWSElasticBeanstalk.UpdateTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTagsForResourceResult updateTagsForResource(UpdateTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTagsForResource(request);
    }

    @SdkInternalApi
    final UpdateTagsForResourceResult executeUpdateTagsForResource(UpdateTagsForResourceRequest updateTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTagsForResourceRequest> request = null;
        Response<UpdateTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTagsForResourceRequestMarshaller().marshall(super.beforeMarshalling(updateTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateTagsForResourceResult> responseHandler = new StaxResponseHandler<UpdateTagsForResourceResult>(
                    new UpdateTagsForResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template or environment, and determines whether
     * those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings associated with the selection of option
     * values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest
     *        A list of validation messages for a specified configuration template.
     * @return Result of the ValidateConfigurationSettings operation returned by the service.
     * @throws InsufficientPrivilegesException
     *         The specified account does not have sufficient privileges for one or more AWS services.
     * @throws TooManyBucketsException
     *         The specified account has reached its limit of Amazon S3 buckets.
     * @sample AWSElasticBeanstalk.ValidateConfigurationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ValidateConfigurationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateConfigurationSettingsResult validateConfigurationSettings(ValidateConfigurationSettingsRequest request) {
        request = beforeClientExecution(request);
        return executeValidateConfigurationSettings(request);
    }

    @SdkInternalApi
    final ValidateConfigurationSettingsResult executeValidateConfigurationSettings(ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest) {

        ExecutionContext executionContext = createExecutionContext(validateConfigurationSettingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateConfigurationSettingsRequest> request = null;
        Response<ValidateConfigurationSettingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateConfigurationSettingsRequestMarshaller().marshall(super.beforeMarshalling(validateConfigurationSettingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Elastic Beanstalk");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateConfigurationSettings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ValidateConfigurationSettingsResult> responseHandler = new StaxResponseHandler<ValidateConfigurationSettingsResult>(
                    new ValidateConfigurationSettingsResultStaxUnmarshaller());
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

}

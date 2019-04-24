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
package com.amazonaws.services.cloudformation;

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

import com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder;
import com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.model.transform.*;

/**
 * Client for accessing AWS CloudFormation. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation allows you to create and manage AWS infrastructure deployments predictably and repeatedly. You can
 * use AWS CloudFormation to leverage AWS products, such as Amazon Elastic Compute Cloud, Amazon Elastic Block Store,
 * Amazon Simple Notification Service, Elastic Load Balancing, and Auto Scaling to build highly-reliable, highly
 * scalable, cost-effective applications without creating or configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines
 * a collection of resources as a single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the resources for you.
 * </p>
 * <p>
 * For more information about AWS CloudFormation, see the <a href="http://aws.amazon.com/cloudformation/">AWS
 * CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific
 * AWS product, you can find the product's technical documentation at <a
 * href="https://docs.aws.amazon.com/">docs.aws.amazon.com</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFormationClient extends AmazonWebServiceClient implements AmazonCloudFormation {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudFormation.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudformation";

    private volatile AmazonCloudFormationWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     * @deprecated use {@link AmazonCloudFormationClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonCloudFormationClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation. A credentials provider chain will be
     * used that searches for credentials in this order:
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
     *        The client configuration options controlling how this client connects to AWS CloudFormation (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonCloudFormationClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFormationClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonCloudFormationClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonCloudFormationClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonCloudFormationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CloudFormation (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudFormationClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFormationClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonCloudFormationClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CloudFormation (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonCloudFormationClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS CloudFormation (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonCloudFormationClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonCloudFormationClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonCloudFormationClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonCloudFormationClientBuilder builder() {
        return AmazonCloudFormationClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudFormationClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudFormationClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new InvalidChangeSetStatusExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StackSetNotEmptyExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidOperationExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TokenAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ChangeSetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new NameAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StackSetNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCapabilitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StackInstanceNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StaleRequestExceptionUnmarshaller());
        exceptionUnmarshallers.add(new OperationIdAlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new CreatedButModifiedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.cloudformation.model.AmazonCloudFormationException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://cloudformation.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudformation/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudformation/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and
     * reverts to the previous stack configuration.
     * </p>
     * <note>
     * <p>
     * You can cancel only stacks that are in the UPDATE_IN_PROGRESS state.
     * </p>
     * </note>
     * 
     * @param cancelUpdateStackRequest
     *        The input for the <a>CancelUpdateStack</a> action.
     * @return Result of the CancelUpdateStack operation returned by the service.
     * @throws TokenAlreadyExistsException
     *         A client request token already exists.
     * @sample AmazonCloudFormation.CancelUpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CancelUpdateStack"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest request) {
        request = beforeClientExecution(request);
        return executeCancelUpdateStack(request);
    }

    @SdkInternalApi
    final CancelUpdateStackResult executeCancelUpdateStack(CancelUpdateStackRequest cancelUpdateStackRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelUpdateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelUpdateStackRequest> request = null;
        Response<CancelUpdateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelUpdateStackRequestMarshaller().marshall(super.beforeMarshalling(cancelUpdateStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelUpdateStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CancelUpdateStackResult> responseHandler = new StaxResponseHandler<CancelUpdateStackResult>(
                    new CancelUpdateStackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code> state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of the failure, you can manually <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the rollback, you can return your stack to a working
     * state (the <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS CloudFormation cannot roll back all
     * changes after a failed stack update. For example, you might have a stack that is rolling back to an old database
     * instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was
     * deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update
     * rollback to fail.
     * </p>
     * 
     * @param continueUpdateRollbackRequest
     *        The input for the <a>ContinueUpdateRollback</a> action.
     * @return Result of the ContinueUpdateRollback operation returned by the service.
     * @throws TokenAlreadyExistsException
     *         A client request token already exists.
     * @sample AmazonCloudFormation.ContinueUpdateRollback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ContinueUpdateRollback"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ContinueUpdateRollbackResult continueUpdateRollback(ContinueUpdateRollbackRequest request) {
        request = beforeClientExecution(request);
        return executeContinueUpdateRollback(request);
    }

    @SdkInternalApi
    final ContinueUpdateRollbackResult executeContinueUpdateRollback(ContinueUpdateRollbackRequest continueUpdateRollbackRequest) {

        ExecutionContext executionContext = createExecutionContext(continueUpdateRollbackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ContinueUpdateRollbackRequest> request = null;
        Response<ContinueUpdateRollbackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ContinueUpdateRollbackRequestMarshaller().marshall(super.beforeMarshalling(continueUpdateRollbackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ContinueUpdateRollback");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ContinueUpdateRollbackResult> responseHandler = new StaxResponseHandler<ContinueUpdateRollbackResult>(
                    new ContinueUpdateRollbackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a list of changes that will be applied to a stack so that you can review the changes before executing
     * them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set
     * for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If
     * you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the
     * information that you submit in the change set and lists the differences. Use change sets to understand which
     * resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before
     * you create or update a stack.
     * </p>
     * <p>
     * To create a change set for a stack that doesn't exist, for the <code>ChangeSetType</code> parameter, specify
     * <code>CREATE</code>. To create a change set for an existing stack, specify <code>UPDATE</code> for the
     * <code>ChangeSetType</code> parameter. After the <code>CreateChangeSet</code> call successfully completes, AWS
     * CloudFormation starts creating the change set. To check the status of the change set or to review it, use the
     * <a>DescribeChangeSet</a> action.
     * </p>
     * <p>
     * When you are satisfied with the changes the change set will make, execute the change set by using the
     * <a>ExecuteChangeSet</a> action. AWS CloudFormation doesn't make changes until you execute the change set.
     * </p>
     * 
     * @param createChangeSetRequest
     *        The input for the <a>CreateChangeSet</a> action.
     * @return Result of the CreateChangeSet operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that weren't specified in the Capabilities parameter.
     * @throws LimitExceededException
     *         The quota for the resource has already been reached.</p>
     *         <p>
     *         For information on resource and stack limitations, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
     *         >Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * @sample AmazonCloudFormation.CreateChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateChangeSetResult createChangeSet(CreateChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChangeSet(request);
    }

    @SdkInternalApi
    final CreateChangeSetResult executeCreateChangeSet(CreateChangeSetRequest createChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChangeSetRequest> request = null;
        Response<CreateChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChangeSetRequestMarshaller().marshall(super.beforeMarshalling(createChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateChangeSetResult> responseHandler = new StaxResponseHandler<CreateChangeSetResult>(
                    new CreateChangeSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts.
     * You can check the status of the stack via the <a>DescribeStacks</a> API.
     * </p>
     * 
     * @param createStackRequest
     *        The input for <a>CreateStack</a> action.
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         The quota for the resource has already been reached.</p>
     *         <p>
     *         For information on resource and stack limitations, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
     *         >Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws TokenAlreadyExistsException
     *         A client request token already exists.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that weren't specified in the Capabilities parameter.
     * @sample AmazonCloudFormation.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStackResult createStack(CreateStackRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStack(request);
    }

    @SdkInternalApi
    final CreateStackResult executeCreateStack(CreateStackRequest createStackRequest) {

        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackRequestMarshaller().marshall(super.beforeMarshalling(createStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStackResult> responseHandler = new StaxResponseHandler<CreateStackResult>(new CreateStackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a
     * stack in a specific account and region. <code>Accounts</code> and <code>Regions</code> are required
     * parameters—you must specify at least one account and one region.
     * </p>
     * 
     * @param createStackInstancesRequest
     * @return Result of the CreateStackInstances operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws OperationInProgressException
     *         Another operation is currently in progress for this stack set. Only one operation can be performed for a
     *         stack set at a given time.
     * @throws OperationIdAlreadyExistsException
     *         The specified operation ID already exists.
     * @throws StaleRequestException
     *         Another operation has been performed on this stack set since the specified operation was performed.
     * @throws InvalidOperationException
     *         The specified operation isn't valid.
     * @throws LimitExceededException
     *         The quota for the resource has already been reached.</p>
     *         <p>
     *         For information on resource and stack limitations, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
     *         >Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * @sample AmazonCloudFormation.CreateStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStackInstancesResult createStackInstances(CreateStackInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStackInstances(request);
    }

    @SdkInternalApi
    final CreateStackInstancesResult executeCreateStackInstances(CreateStackInstancesRequest createStackInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(createStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackInstancesRequest> request = null;
        Response<CreateStackInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackInstancesRequestMarshaller().marshall(super.beforeMarshalling(createStackInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStackInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStackInstancesResult> responseHandler = new StaxResponseHandler<CreateStackInstancesResult>(
                    new CreateStackInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stack set.
     * </p>
     * 
     * @param createStackSetRequest
     * @return Result of the CreateStackSet operation returned by the service.
     * @throws NameAlreadyExistsException
     *         The specified name is already in use.
     * @throws CreatedButModifiedException
     *         The specified resource exists, but has been changed.
     * @throws LimitExceededException
     *         The quota for the resource has already been reached.</p>
     *         <p>
     *         For information on resource and stack limitations, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html"
     *         >Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * @sample AmazonCloudFormation.CreateStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStackSetResult createStackSet(CreateStackSetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStackSet(request);
    }

    @SdkInternalApi
    final CreateStackSetResult executeCreateStackSet(CreateStackSetRequest createStackSetRequest) {

        ExecutionContext executionContext = createExecutionContext(createStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackSetRequest> request = null;
        Response<CreateStackSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackSetRequestMarshaller().marshall(super.beforeMarshalling(createStackSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStackSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStackSetResult> responseHandler = new StaxResponseHandler<CreateStackSetResult>(
                    new CreateStackSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully deleted the change set.
     * </p>
     * 
     * @param deleteChangeSetRequest
     *        The input for the <a>DeleteChangeSet</a> action.
     * @return Result of the DeleteChangeSet operation returned by the service.
     * @throws InvalidChangeSetStatusException
     *         The specified change set can't be used to update the stack. For example, the change set status might be
     *         <code>CREATE_IN_PROGRESS</code>, or the stack status might be <code>UPDATE_IN_PROGRESS</code>.
     * @sample AmazonCloudFormation.DeleteChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteChangeSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteChangeSetResult deleteChangeSet(DeleteChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChangeSet(request);
    }

    @SdkInternalApi
    final DeleteChangeSetResult executeDeleteChangeSet(DeleteChangeSetRequest deleteChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChangeSetRequest> request = null;
        Response<DeleteChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChangeSetRequestMarshaller().marshall(super.beforeMarshalling(deleteChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteChangeSetResult> responseHandler = new StaxResponseHandler<DeleteChangeSetResult>(
                    new DeleteChangeSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
     * show up in the <a>DescribeStacks</a> API if the deletion has been completed successfully.
     * </p>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @return Result of the DeleteStack operation returned by the service.
     * @throws TokenAlreadyExistsException
     *         A client request token already exists.
     * @sample AmazonCloudFormation.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStackResult deleteStack(DeleteStackRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStack(request);
    }

    @SdkInternalApi
    final DeleteStackResult executeDeleteStack(DeleteStackRequest deleteStackRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackRequest> request = null;
        Response<DeleteStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackRequestMarshaller().marshall(super.beforeMarshalling(deleteStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteStackResult> responseHandler = new StaxResponseHandler<DeleteStackResult>(new DeleteStackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes stack instances for the specified accounts, in the specified regions.
     * </p>
     * 
     * @param deleteStackInstancesRequest
     * @return Result of the DeleteStackInstances operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws OperationInProgressException
     *         Another operation is currently in progress for this stack set. Only one operation can be performed for a
     *         stack set at a given time.
     * @throws OperationIdAlreadyExistsException
     *         The specified operation ID already exists.
     * @throws StaleRequestException
     *         Another operation has been performed on this stack set since the specified operation was performed.
     * @throws InvalidOperationException
     *         The specified operation isn't valid.
     * @sample AmazonCloudFormation.DeleteStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStackInstancesResult deleteStackInstances(DeleteStackInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStackInstances(request);
    }

    @SdkInternalApi
    final DeleteStackInstancesResult executeDeleteStackInstances(DeleteStackInstancesRequest deleteStackInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackInstancesRequest> request = null;
        Response<DeleteStackInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackInstancesRequestMarshaller().marshall(super.beforeMarshalling(deleteStackInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStackInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteStackInstancesResult> responseHandler = new StaxResponseHandler<DeleteStackInstancesResult>(
                    new DeleteStackInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For
     * more information about how to do this, see <a>DeleteStackInstances</a>.
     * </p>
     * 
     * @param deleteStackSetRequest
     * @return Result of the DeleteStackSet operation returned by the service.
     * @throws StackSetNotEmptyException
     *         You can't yet delete this stack set, because it still contains one or more stack instances. Delete all
     *         stack instances from the stack set before deleting the stack set.
     * @throws OperationInProgressException
     *         Another operation is currently in progress for this stack set. Only one operation can be performed for a
     *         stack set at a given time.
     * @sample AmazonCloudFormation.DeleteStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeleteStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteStackSetResult deleteStackSet(DeleteStackSetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStackSet(request);
    }

    @SdkInternalApi
    final DeleteStackSetResult executeDeleteStackSet(DeleteStackSetRequest deleteStackSetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackSetRequest> request = null;
        Response<DeleteStackSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackSetRequestMarshaller().marshall(super.beforeMarshalling(deleteStackSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStackSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteStackSetResult> responseHandler = new StaxResponseHandler<DeleteStackSetResult>(
                    new DeleteStackSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
     * your account. For more information about account limits, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cloudformation-limits.html">AWS
     * CloudFormation Limits</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonCloudFormation.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeAccountLimits"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccountLimits(request);
    }

    @SdkInternalApi
    final DescribeAccountLimitsResult executeDescribeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAccountLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountLimitsRequest> request = null;
        Response<DescribeAccountLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountLimitsRequestMarshaller().marshall(super.beforeMarshalling(describeAccountLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccountLimits");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAccountLimitsResult> responseHandler = new StaxResponseHandler<DescribeAccountLimitsResult>(
                    new DescribeAccountLimitsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
     * change set. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param describeChangeSetRequest
     *        The input for the <a>DescribeChangeSet</a> action.
     * @return Result of the DescribeChangeSet operation returned by the service.
     * @throws ChangeSetNotFoundException
     *         The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the
     *         <code>ListChangeSets</code> action.
     * @sample AmazonCloudFormation.DescribeChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeChangeSet(request);
    }

    @SdkInternalApi
    final DescribeChangeSetResult executeDescribeChangeSet(DescribeChangeSetRequest describeChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeChangeSetRequest> request = null;
        Response<DescribeChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeChangeSetRequestMarshaller().marshall(super.beforeMarshalling(describeChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeChangeSetResult> responseHandler = new StaxResponseHandler<DescribeChangeSetResult>(
                    new DescribeChangeSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a
     * stack's actual configuration differs, or has <i>drifted</i>, from it's expected configuration, as defined in the
     * stack template and any values specified as template parameters. A stack is considered to have drifted if one or
     * more of its resources have drifted. For more information on stack and resource drift, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <a>DetectStackDrift</a> to initiate a stack drift detection operation. <code>DetectStackDrift</code> returns
     * a <code>StackDriftDetectionId</code> you can use to monitor the progress of the operation using
     * <code>DescribeStackDriftDetectionStatus</code>. Once the drift detection operation has completed, use
     * <a>DescribeStackResourceDrifts</a> to return drift information about the stack and its resources.
     * </p>
     * 
     * @param describeStackDriftDetectionStatusRequest
     * @return Result of the DescribeStackDriftDetectionStatus operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStackDriftDetectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackDriftDetectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackDriftDetectionStatusResult describeStackDriftDetectionStatus(DescribeStackDriftDetectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackDriftDetectionStatus(request);
    }

    @SdkInternalApi
    final DescribeStackDriftDetectionStatusResult executeDescribeStackDriftDetectionStatus(
            DescribeStackDriftDetectionStatusRequest describeStackDriftDetectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackDriftDetectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackDriftDetectionStatusRequest> request = null;
        Response<DescribeStackDriftDetectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackDriftDetectionStatusRequestMarshaller().marshall(super.beforeMarshalling(describeStackDriftDetectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackDriftDetectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackDriftDetectionStatusResult> responseHandler = new StaxResponseHandler<DescribeStackDriftDetectionStatusResult>(
                    new DescribeStackDriftDetectionStatusResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all stack related events for a specified stack in reverse chronological order. For more information about
     * a stack's event history, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html">Stacks</a> in the AWS
     * CloudFormation User Guide.
     * </p>
     * <note>
     * <p>
     * You can list events for stacks that have failed to create or have been deleted by specifying the unique stack
     * identifier (stack ID).
     * </p>
     * </note>
     * 
     * @param describeStackEventsRequest
     *        The input for <a>DescribeStackEvents</a> action.
     * @return Result of the DescribeStackEvents operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStackEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackEvents(request);
    }

    @SdkInternalApi
    final DescribeStackEventsResult executeDescribeStackEvents(DescribeStackEventsRequest describeStackEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackEventsRequest> request = null;
        Response<DescribeStackEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackEventsRequestMarshaller().marshall(super.beforeMarshalling(describeStackEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackEventsResult> responseHandler = new StaxResponseHandler<DescribeStackEventsResult>(
                    new DescribeStackEventsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the stack instance that's associated with the specified stack set, AWS account, and region.
     * </p>
     * <p>
     * For a list of stack instances that are associated with a specific stack set, use <a>ListStackInstances</a>.
     * </p>
     * 
     * @param describeStackInstanceRequest
     * @return Result of the DescribeStackInstance operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws StackInstanceNotFoundException
     *         The specified stack instance doesn't exist.
     * @sample AmazonCloudFormation.DescribeStackInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackInstanceResult describeStackInstance(DescribeStackInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackInstance(request);
    }

    @SdkInternalApi
    final DescribeStackInstanceResult executeDescribeStackInstance(DescribeStackInstanceRequest describeStackInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackInstanceRequest> request = null;
        Response<DescribeStackInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackInstanceRequestMarshaller().marshall(super.beforeMarshalling(describeStackInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackInstanceResult> responseHandler = new StaxResponseHandler<DescribeStackInstanceResult>(
                    new DescribeStackInstanceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * 
     * @param describeStackResourceRequest
     *        The input for <a>DescribeStackResource</a> action.
     * @return Result of the DescribeStackResource operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStackResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackResourceResult describeStackResource(DescribeStackResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackResource(request);
    }

    @SdkInternalApi
    final DescribeStackResourceResult executeDescribeStackResource(DescribeStackResourceRequest describeStackResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourceRequest> request = null;
        Response<DescribeStackResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackResourceRequestMarshaller().marshall(super.beforeMarshalling(describeStackResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackResourceResult> responseHandler = new StaxResponseHandler<DescribeStackResourceResult>(
                    new DescribeStackResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns drift information for the resources that have been checked for drift in the specified stack. This
     * includes actual and expected configuration values for resources where AWS CloudFormation detects configuration
     * drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * Use <a>DetectStackResourceDrift</a> to detect drift on individual resources, or <a>DetectStackDrift</a> to detect
     * drift on all supported resources for a given stack.
     * </p>
     * 
     * @param describeStackResourceDriftsRequest
     * @return Result of the DescribeStackResourceDrifts operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStackResourceDrifts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResourceDrifts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackResourceDriftsResult describeStackResourceDrifts(DescribeStackResourceDriftsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackResourceDrifts(request);
    }

    @SdkInternalApi
    final DescribeStackResourceDriftsResult executeDescribeStackResourceDrifts(DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackResourceDriftsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourceDriftsRequest> request = null;
        Response<DescribeStackResourceDriftsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackResourceDriftsRequestMarshaller().marshall(super.beforeMarshalling(describeStackResourceDriftsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackResourceDrifts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackResourceDriftsResult> responseHandler = new StaxResponseHandler<DescribeStackResourceDriftsResult>(
                    new DescribeStackResourceDriftsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If <code>StackName</code> is specified, all the
     * associated resources that are part of the stack are returned. If <code>PhysicalResourceId</code> is specified,
     * the associated resources of the stack that the resource belongs to are returned.
     * </p>
     * <note>
     * <p>
     * Only the first 100 resources will be returned. If your stack has more resources than this, you should use
     * <code>ListStackResources</code> instead.
     * </p>
     * </note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource information for up to 90 days after the
     * stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or <code>PhysicalResourceId</code>, but not both. In addition, you
     * can specify <code>LogicalResourceId</code> to filter the returned result. For more information about resources,
     * the <code>LogicalResourceId</code> and <code>PhysicalResourceId</code>, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/">AWS CloudFormation User Guide</a>.
     * </p>
     * <note>
     * <p>
     * A <code>ValidationError</code> is returned if you specify both <code>StackName</code> and
     * <code>PhysicalResourceId</code> in the same request.
     * </p>
     * </note>
     * 
     * @param describeStackResourcesRequest
     *        The input for <a>DescribeStackResources</a> action.
     * @return Result of the DescribeStackResources operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStackResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackResources(request);
    }

    @SdkInternalApi
    final DescribeStackResourcesResult executeDescribeStackResources(DescribeStackResourcesRequest describeStackResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourcesRequest> request = null;
        Response<DescribeStackResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackResourcesRequestMarshaller().marshall(super.beforeMarshalling(describeStackResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackResourcesResult> responseHandler = new StaxResponseHandler<DescribeStackResourcesResult>(
                    new DescribeStackResourcesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of the specified stack set.
     * </p>
     * 
     * @param describeStackSetRequest
     * @return Result of the DescribeStackSet operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @sample AmazonCloudFormation.DescribeStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackSetResult describeStackSet(DescribeStackSetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackSet(request);
    }

    @SdkInternalApi
    final DescribeStackSetResult executeDescribeStackSet(DescribeStackSetRequest describeStackSetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackSetRequest> request = null;
        Response<DescribeStackSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackSetRequestMarshaller().marshall(super.beforeMarshalling(describeStackSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackSetResult> responseHandler = new StaxResponseHandler<DescribeStackSetResult>(
                    new DescribeStackSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of the specified stack set operation.
     * </p>
     * 
     * @param describeStackSetOperationRequest
     * @return Result of the DescribeStackSetOperation operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws OperationNotFoundException
     *         The specified ID refers to an operation that doesn't exist.
     * @sample AmazonCloudFormation.DescribeStackSetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackSetOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStackSetOperationResult describeStackSetOperation(DescribeStackSetOperationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStackSetOperation(request);
    }

    @SdkInternalApi
    final DescribeStackSetOperationResult executeDescribeStackSetOperation(DescribeStackSetOperationRequest describeStackSetOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStackSetOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackSetOperationRequest> request = null;
        Response<DescribeStackSetOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackSetOperationRequestMarshaller().marshall(super.beforeMarshalling(describeStackSetOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStackSetOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStackSetOperationResult> responseHandler = new StaxResponseHandler<DescribeStackSetOperationResult>(
                    new DescribeStackSetOperationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was specified, then it returns the description
     * for all the stacks created.
     * </p>
     * <note>
     * <p>
     * If the stack does not exist, an <code>AmazonCloudFormationException</code> is returned.
     * </p>
     * </note>
     * 
     * @param describeStacksRequest
     *        The input for <a>DescribeStacks</a> action.
     * @return Result of the DescribeStacks operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStacks" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeStacksResult describeStacks(DescribeStacksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStacks(request);
    }

    @SdkInternalApi
    final DescribeStacksResult executeDescribeStacks(DescribeStacksRequest describeStacksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStacksRequestMarshaller().marshall(super.beforeMarshalling(describeStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeStacksResult> responseHandler = new StaxResponseHandler<DescribeStacksResult>(
                    new DescribeStacksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeStacksResult describeStacks() {
        return describeStacks(new DescribeStacksRequest());
    }

    /**
     * <p>
     * Detects whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected configuration,
     * as defined in the stack template and any values specified as template parameters. For each resource in the stack
     * that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its
     * expected template configuration. Only resource properties explicitly defined in the stack template are checked
     * for drift. A stack is considered to have drifted if one or more of its resources differ from their expected
     * template configurations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackDrift</code> to detect drift on all supported resources for a given stack, or
     * <a>DetectStackResourceDrift</a> to detect drift on individual resources.
     * </p>
     * <p>
     * For a list of stack resources that currently support drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * <code>DetectStackDrift</code> can take up to several minutes, depending on the number of resources contained
     * within the stack. Use <a>DescribeStackDriftDetectionStatus</a> to monitor the progress of a detect stack drift
     * operation. Once the drift detection operation has completed, use <a>DescribeStackResourceDrifts</a> to return
     * drift information about the stack and its resources.
     * </p>
     * <p>
     * When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that
     * stack. Perform <code>DetectStackDrift</code> directly on the nested stack itself.
     * </p>
     * 
     * @param detectStackDriftRequest
     * @return Result of the DetectStackDrift operation returned by the service.
     * @sample AmazonCloudFormation.DetectStackDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackDrift"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetectStackDriftResult detectStackDrift(DetectStackDriftRequest request) {
        request = beforeClientExecution(request);
        return executeDetectStackDrift(request);
    }

    @SdkInternalApi
    final DetectStackDriftResult executeDetectStackDrift(DetectStackDriftRequest detectStackDriftRequest) {

        ExecutionContext executionContext = createExecutionContext(detectStackDriftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectStackDriftRequest> request = null;
        Response<DetectStackDriftResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectStackDriftRequestMarshaller().marshall(super.beforeMarshalling(detectStackDriftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectStackDrift");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetectStackDriftResult> responseHandler = new StaxResponseHandler<DetectStackDriftResult>(
                    new DetectStackDriftResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about whether a resource's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. This
     * information includes actual and expected property values for resources in which AWS CloudFormation detects drift.
     * Only resource properties explicitly defined in the stack template are checked for drift. For more information
     * about stack and resource drift, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * <p>
     * Use <code>DetectStackResourceDrift</code> to detect drift on individual resources, or <a>DetectStackDrift</a> to
     * detect drift on all resources in a given stack that support drift detection.
     * </p>
     * <p>
     * Resources that do not currently support drift detection cannot be checked. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param detectStackResourceDriftRequest
     * @return Result of the DetectStackResourceDrift operation returned by the service.
     * @sample AmazonCloudFormation.DetectStackResourceDrift
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DetectStackResourceDrift"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetectStackResourceDriftResult detectStackResourceDrift(DetectStackResourceDriftRequest request) {
        request = beforeClientExecution(request);
        return executeDetectStackResourceDrift(request);
    }

    @SdkInternalApi
    final DetectStackResourceDriftResult executeDetectStackResourceDrift(DetectStackResourceDriftRequest detectStackResourceDriftRequest) {

        ExecutionContext executionContext = createExecutionContext(detectStackResourceDriftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetectStackResourceDriftRequest> request = null;
        Response<DetectStackResourceDriftResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetectStackResourceDriftRequestMarshaller().marshall(super.beforeMarshalling(detectStackResourceDriftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetectStackResourceDrift");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetectStackResourceDriftResult> responseHandler = new StaxResponseHandler<DetectStackResourceDriftResult>(
                    new DetectStackResourceDriftResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a
     * query string that describes the resources required to run the template.
     * </p>
     * 
     * @param estimateTemplateCostRequest
     *        The input for an <a>EstimateTemplateCost</a> action.
     * @return Result of the EstimateTemplateCost operation returned by the service.
     * @sample AmazonCloudFormation.EstimateTemplateCost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/EstimateTemplateCost"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest request) {
        request = beforeClientExecution(request);
        return executeEstimateTemplateCost(request);
    }

    @SdkInternalApi
    final EstimateTemplateCostResult executeEstimateTemplateCost(EstimateTemplateCostRequest estimateTemplateCostRequest) {

        ExecutionContext executionContext = createExecutionContext(estimateTemplateCostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EstimateTemplateCostRequest> request = null;
        Response<EstimateTemplateCostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EstimateTemplateCostRequestMarshaller().marshall(super.beforeMarshalling(estimateTemplateCostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EstimateTemplateCost");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EstimateTemplateCostResult> responseHandler = new StaxResponseHandler<EstimateTemplateCostResult>(
                    new EstimateTemplateCostResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public EstimateTemplateCostResult estimateTemplateCost() {
        return estimateTemplateCost(new EstimateTemplateCostRequest());
    }

    /**
     * <p>
     * Updates a stack using the input information that was provided when the specified change set was created. After
     * the call successfully completes, AWS CloudFormation starts updating the stack. Use the <a>DescribeStacks</a>
     * action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because
     * they aren't valid for the updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You
     * can't specify a temporary stack policy that overrides the current policy.
     * </p>
     * 
     * @param executeChangeSetRequest
     *        The input for the <a>ExecuteChangeSet</a> action.
     * @return Result of the ExecuteChangeSet operation returned by the service.
     * @throws InvalidChangeSetStatusException
     *         The specified change set can't be used to update the stack. For example, the change set status might be
     *         <code>CREATE_IN_PROGRESS</code>, or the stack status might be <code>UPDATE_IN_PROGRESS</code>.
     * @throws ChangeSetNotFoundException
     *         The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the
     *         <code>ListChangeSets</code> action.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that weren't specified in the Capabilities parameter.
     * @throws TokenAlreadyExistsException
     *         A client request token already exists.
     * @sample AmazonCloudFormation.ExecuteChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ExecuteChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteChangeSetResult executeChangeSet(ExecuteChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteChangeSet(request);
    }

    @SdkInternalApi
    final ExecuteChangeSetResult executeExecuteChangeSet(ExecuteChangeSetRequest executeChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(executeChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteChangeSetRequest> request = null;
        Response<ExecuteChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteChangeSetRequestMarshaller().marshall(super.beforeMarshalling(executeChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ExecuteChangeSetResult> responseHandler = new StaxResponseHandler<ExecuteChangeSetResult>(
                    new ExecuteChangeSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @return Result of the GetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormation.GetStackPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetStackPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetStackPolicyResult getStackPolicy(GetStackPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetStackPolicy(request);
    }

    @SdkInternalApi
    final GetStackPolicyResult executeGetStackPolicy(GetStackPolicyRequest getStackPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStackPolicyRequest> request = null;
        Response<GetStackPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStackPolicyRequestMarshaller().marshall(super.beforeMarshalling(getStackPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStackPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetStackPolicyResult> responseHandler = new StaxResponseHandler<GetStackPolicyResult>(
                    new GetStackPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.
     * </p>
     * <note>
     * <p>
     * If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * </note>
     * 
     * @param getTemplateRequest
     *        The input for a <a>GetTemplate</a> action.
     * @return Result of the GetTemplate operation returned by the service.
     * @throws ChangeSetNotFoundException
     *         The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the
     *         <code>ListChangeSets</code> action.
     * @sample AmazonCloudFormation.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplate(request);
    }

    @SdkInternalApi
    final GetTemplateResult executeGetTemplate(GetTemplateRequest getTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateRequestMarshaller().marshall(super.beforeMarshalling(getTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTemplateResult> responseHandler = new StaxResponseHandler<GetTemplateResult>(new GetTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a new or existing template. The <code>GetTemplateSummary</code> action is useful for
     * viewing parameter information, such as default parameter values and parameter types, before you create or update
     * a stack or stack set.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a template, or you can get template
     * information for a stack set, or a running or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template information for up to 90 days after the
     * stack has been deleted. If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @return Result of the GetTemplateSummary operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @sample AmazonCloudFormation.GetTemplateSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplateSummary"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTemplateSummaryResult getTemplateSummary(GetTemplateSummaryRequest request) {
        request = beforeClientExecution(request);
        return executeGetTemplateSummary(request);
    }

    @SdkInternalApi
    final GetTemplateSummaryResult executeGetTemplateSummary(GetTemplateSummaryRequest getTemplateSummaryRequest) {

        ExecutionContext executionContext = createExecutionContext(getTemplateSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateSummaryRequest> request = null;
        Response<GetTemplateSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateSummaryRequestMarshaller().marshall(super.beforeMarshalling(getTemplateSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTemplateSummary");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTemplateSummaryResult> responseHandler = new StaxResponseHandler<GetTemplateSummaryResult>(
                    new GetTemplateSummaryResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetTemplateSummaryResult getTemplateSummary() {
        return getTemplateSummary(new GetTemplateSummaryRequest());
    }

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change
     * sets that are in the <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * 
     * @param listChangeSetsRequest
     *        The input for the <a>ListChangeSets</a> action.
     * @return Result of the ListChangeSets operation returned by the service.
     * @sample AmazonCloudFormation.ListChangeSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListChangeSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListChangeSetsResult listChangeSets(ListChangeSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListChangeSets(request);
    }

    @SdkInternalApi
    final ListChangeSetsResult executeListChangeSets(ListChangeSetsRequest listChangeSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChangeSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChangeSetsRequest> request = null;
        Response<ListChangeSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChangeSetsRequestMarshaller().marshall(super.beforeMarshalling(listChangeSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChangeSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListChangeSetsResult> responseHandler = new StaxResponseHandler<ListChangeSetsResult>(
                    new ListChangeSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all exported output values in the account and region in which you call this action. Use this action to see
     * the exported output values that you can import into other stacks. To import values, use the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html"> AWS
     * CloudFormation Export Stack Output Values</a>.
     * </p>
     * 
     * @param listExportsRequest
     * @return Result of the ListExports operation returned by the service.
     * @sample AmazonCloudFormation.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListExportsResult listExports(ListExportsRequest request) {
        request = beforeClientExecution(request);
        return executeListExports(request);
    }

    @SdkInternalApi
    final ListExportsResult executeListExports(ListExportsRequest listExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExportsRequest> request = null;
        Response<ListExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExportsRequestMarshaller().marshall(super.beforeMarshalling(listExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListExportsResult> responseHandler = new StaxResponseHandler<ListExportsResult>(new ListExportsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
     * use this action to see which stacks are using it. To see the exported output values in your account, see
     * <a>ListExports</a>.
     * </p>
     * <p>
     * For more information about importing an exported output value, see the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * 
     * @param listImportsRequest
     * @return Result of the ListImports operation returned by the service.
     * @sample AmazonCloudFormation.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListImportsResult listImports(ListImportsRequest request) {
        request = beforeClientExecution(request);
        return executeListImports(request);
    }

    @SdkInternalApi
    final ListImportsResult executeListImports(ListImportsRequest listImportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listImportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListImportsRequest> request = null;
        Response<ListImportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListImportsRequestMarshaller().marshall(super.beforeMarshalling(listImportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListImports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListImportsResult> responseHandler = new StaxResponseHandler<ListImportsResult>(new ListImportsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about stack instances that are associated with the specified stack set. You can
     * filter for stack instances that are associated with a specific AWS account name or region.
     * </p>
     * 
     * @param listStackInstancesRequest
     * @return Result of the ListStackInstances operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @sample AmazonCloudFormation.ListStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStackInstancesResult listStackInstances(ListStackInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeListStackInstances(request);
    }

    @SdkInternalApi
    final ListStackInstancesResult executeListStackInstances(ListStackInstancesRequest listStackInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackInstancesRequest> request = null;
        Response<ListStackInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackInstancesRequestMarshaller().marshall(super.beforeMarshalling(listStackInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStackInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStackInstancesResult> responseHandler = new StaxResponseHandler<ListStackInstancesResult>(
                    new ListStackInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * 
     * @param listStackResourcesRequest
     *        The input for the <a>ListStackResource</a> action.
     * @return Result of the ListStackResources operation returned by the service.
     * @sample AmazonCloudFormation.ListStackResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStackResourcesResult listStackResources(ListStackResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListStackResources(request);
    }

    @SdkInternalApi
    final ListStackResourcesResult executeListStackResources(ListStackResourcesRequest listStackResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackResourcesRequest> request = null;
        Response<ListStackResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackResourcesRequestMarshaller().marshall(super.beforeMarshalling(listStackResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStackResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStackResourcesResult> responseHandler = new StaxResponseHandler<ListStackResourcesResult>(
                    new ListStackResourcesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about the results of a stack set operation.
     * </p>
     * 
     * @param listStackSetOperationResultsRequest
     * @return Result of the ListStackSetOperationResults operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws OperationNotFoundException
     *         The specified ID refers to an operation that doesn't exist.
     * @sample AmazonCloudFormation.ListStackSetOperationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperationResults"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStackSetOperationResultsResult listStackSetOperationResults(ListStackSetOperationResultsRequest request) {
        request = beforeClientExecution(request);
        return executeListStackSetOperationResults(request);
    }

    @SdkInternalApi
    final ListStackSetOperationResultsResult executeListStackSetOperationResults(ListStackSetOperationResultsRequest listStackSetOperationResultsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStackSetOperationResultsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackSetOperationResultsRequest> request = null;
        Response<ListStackSetOperationResultsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackSetOperationResultsRequestMarshaller().marshall(super.beforeMarshalling(listStackSetOperationResultsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStackSetOperationResults");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStackSetOperationResultsResult> responseHandler = new StaxResponseHandler<ListStackSetOperationResultsResult>(
                    new ListStackSetOperationResultsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about operations performed on a stack set.
     * </p>
     * 
     * @param listStackSetOperationsRequest
     * @return Result of the ListStackSetOperations operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @sample AmazonCloudFormation.ListStackSetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSetOperations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStackSetOperationsResult listStackSetOperations(ListStackSetOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeListStackSetOperations(request);
    }

    @SdkInternalApi
    final ListStackSetOperationsResult executeListStackSetOperations(ListStackSetOperationsRequest listStackSetOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStackSetOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackSetOperationsRequest> request = null;
        Response<ListStackSetOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackSetOperationsRequestMarshaller().marshall(super.beforeMarshalling(listStackSetOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStackSetOperations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStackSetOperationsResult> responseHandler = new StaxResponseHandler<ListStackSetOperationsResult>(
                    new ListStackSetOperationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns summary information about stack sets that are associated with the user.
     * </p>
     * 
     * @param listStackSetsRequest
     * @return Result of the ListStackSets operation returned by the service.
     * @sample AmazonCloudFormation.ListStackSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackSets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStackSetsResult listStackSets(ListStackSetsRequest request) {
        request = beforeClientExecution(request);
        return executeListStackSets(request);
    }

    @SdkInternalApi
    final ListStackSetsResult executeListStackSets(ListStackSetsRequest listStackSetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStackSetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackSetsRequest> request = null;
        Response<ListStackSetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackSetsRequestMarshaller().marshall(super.beforeMarshalling(listStackSetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStackSets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStackSetsResult> responseHandler = new StaxResponseHandler<ListStackSetsResult>(new ListStackSetsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary
     * information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and
     * stacks that have been deleted).
     * </p>
     * 
     * @param listStacksRequest
     *        The input for <a>ListStacks</a> action.
     * @return Result of the ListStacks operation returned by the service.
     * @sample AmazonCloudFormation.ListStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStacks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStacksResult listStacks(ListStacksRequest request) {
        request = beforeClientExecution(request);
        return executeListStacks(request);
    }

    @SdkInternalApi
    final ListStacksResult executeListStacks(ListStacksRequest listStacksRequest) {

        ExecutionContext executionContext = createExecutionContext(listStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStacksRequest> request = null;
        Response<ListStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStacksRequestMarshaller().marshall(super.beforeMarshalling(listStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStacks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStacksResult> responseHandler = new StaxResponseHandler<ListStacksResult>(new ListStacksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListStacksResult listStacks() {
        return listStacks(new ListStacksRequest());
    }

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * 
     * @param setStackPolicyRequest
     *        The input for the <a>SetStackPolicy</a> action.
     * @return Result of the SetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormation.SetStackPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetStackPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetStackPolicyResult setStackPolicy(SetStackPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeSetStackPolicy(request);
    }

    @SdkInternalApi
    final SetStackPolicyResult executeSetStackPolicy(SetStackPolicyRequest setStackPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(setStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetStackPolicyRequest> request = null;
        Response<SetStackPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetStackPolicyRequestMarshaller().marshall(super.beforeMarshalling(setStackPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetStackPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetStackPolicyResult> responseHandler = new StaxResponseHandler<SetStackPolicyResult>(
                    new SetStackPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in
     * conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or
     * update until resources receive the required number of signals or the timeout period is exceeded. The
     * SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2
     * instance.
     * </p>
     * 
     * @param signalResourceRequest
     *        The input for the <a>SignalResource</a> action.
     * @return Result of the SignalResource operation returned by the service.
     * @sample AmazonCloudFormation.SignalResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SignalResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SignalResourceResult signalResource(SignalResourceRequest request) {
        request = beforeClientExecution(request);
        return executeSignalResource(request);
    }

    @SdkInternalApi
    final SignalResourceResult executeSignalResource(SignalResourceRequest signalResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(signalResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignalResourceRequest> request = null;
        Response<SignalResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignalResourceRequestMarshaller().marshall(super.beforeMarshalling(signalResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SignalResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SignalResourceResult> responseHandler = new StaxResponseHandler<SignalResourceResult>(
                    new SignalResourceResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops an in-progress operation on a stack set and its associated stack instances.
     * </p>
     * 
     * @param stopStackSetOperationRequest
     * @return Result of the StopStackSetOperation operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws OperationNotFoundException
     *         The specified ID refers to an operation that doesn't exist.
     * @throws InvalidOperationException
     *         The specified operation isn't valid.
     * @sample AmazonCloudFormation.StopStackSetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StopStackSetOperation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StopStackSetOperationResult stopStackSetOperation(StopStackSetOperationRequest request) {
        request = beforeClientExecution(request);
        return executeStopStackSetOperation(request);
    }

    @SdkInternalApi
    final StopStackSetOperationResult executeStopStackSetOperation(StopStackSetOperationRequest stopStackSetOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(stopStackSetOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStackSetOperationRequest> request = null;
        Response<StopStackSetOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStackSetOperationRequestMarshaller().marshall(super.beforeMarshalling(stopStackSetOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopStackSetOperation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<StopStackSetOperationResult> responseHandler = new StaxResponseHandler<StopStackSetOperationResult>(
                    new StopStackSetOperationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You
     * can check the status of the stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack, and monitoring the progress of the
     * update, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">Updating a
     * Stack</a>.
     * </p>
     * 
     * @param updateStackRequest
     *        The input for an <a>UpdateStack</a> action.
     * @return Result of the UpdateStack operation returned by the service.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that weren't specified in the Capabilities parameter.
     * @throws TokenAlreadyExistsException
     *         A client request token already exists.
     * @sample AmazonCloudFormation.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStackResult updateStack(UpdateStackRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStack(request);
    }

    @SdkInternalApi
    final UpdateStackResult executeUpdateStack(UpdateStackRequest updateStackRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackRequest> request = null;
        Response<UpdateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackRequestMarshaller().marshall(super.beforeMarshalling(updateStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStack");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateStackResult> responseHandler = new StaxResponseHandler<UpdateStackResult>(new UpdateStackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the parameter values for stack instances for the specified accounts, within the specified regions. A
     * stack instance refers to a stack in a specific account and region.
     * </p>
     * <p>
     * You can only update stack instances in regions and accounts where they already exist; to create additional stack
     * instances, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html"
     * >CreateStackInstances</a>.
     * </p>
     * <p>
     * During stack set updates, any parameters overridden for a stack instance are not updated, but retain their
     * overridden value.
     * </p>
     * <p>
     * You can only update the parameter <i>values</i> that are specified in the stack set; to add or delete a parameter
     * itself, use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html">UpdateStackSet
     * </a> to update the stack set template. If you add a parameter to a template, before you can override the
     * parameter value specified in the stack set you must first use <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated template and parameter value specified in the
     * stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter
     * value using <code>UpdateStackInstances</code>.
     * </p>
     * 
     * @param updateStackInstancesRequest
     * @return Result of the UpdateStackInstances operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws StackInstanceNotFoundException
     *         The specified stack instance doesn't exist.
     * @throws OperationInProgressException
     *         Another operation is currently in progress for this stack set. Only one operation can be performed for a
     *         stack set at a given time.
     * @throws OperationIdAlreadyExistsException
     *         The specified operation ID already exists.
     * @throws StaleRequestException
     *         Another operation has been performed on this stack set since the specified operation was performed.
     * @throws InvalidOperationException
     *         The specified operation isn't valid.
     * @sample AmazonCloudFormation.UpdateStackInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateStackInstancesResult updateStackInstances(UpdateStackInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStackInstances(request);
    }

    @SdkInternalApi
    final UpdateStackInstancesResult executeUpdateStackInstances(UpdateStackInstancesRequest updateStackInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStackInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackInstancesRequest> request = null;
        Response<UpdateStackInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackInstancesRequestMarshaller().marshall(super.beforeMarshalling(updateStackInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStackInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateStackInstancesResult> responseHandler = new StaxResponseHandler<UpdateStackInstancesResult>(
                    new UpdateStackInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the stack set, and associated stack instances in the specified accounts and regions.
     * </p>
     * <p>
     * Even if the stack set operation created by updating the stack set fails (completely or partially, below or above
     * a specified failure tolerance), the stack set is updated with your changes. Subsequent
     * <a>CreateStackInstances</a> calls on the specified stack set use the updated stack set.
     * </p>
     * 
     * @param updateStackSetRequest
     * @return Result of the UpdateStackSet operation returned by the service.
     * @throws StackSetNotFoundException
     *         The specified stack set doesn't exist.
     * @throws OperationInProgressException
     *         Another operation is currently in progress for this stack set. Only one operation can be performed for a
     *         stack set at a given time.
     * @throws OperationIdAlreadyExistsException
     *         The specified operation ID already exists.
     * @throws StaleRequestException
     *         Another operation has been performed on this stack set since the specified operation was performed.
     * @throws InvalidOperationException
     *         The specified operation isn't valid.
     * @throws StackInstanceNotFoundException
     *         The specified stack instance doesn't exist.
     * @sample AmazonCloudFormation.UpdateStackSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateStackSet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateStackSetResult updateStackSet(UpdateStackSetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStackSet(request);
    }

    @SdkInternalApi
    final UpdateStackSetResult executeUpdateStackSet(UpdateStackSetRequest updateStackSetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStackSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackSetRequest> request = null;
        Response<UpdateStackSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackSetRequestMarshaller().marshall(super.beforeMarshalling(updateStackSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStackSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateStackSetResult> responseHandler = new StaxResponseHandler<UpdateStackSetResult>(
                    new UpdateStackSetResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination
     * protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a Stack From Being Deleted</a>
     * in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * <p>
     * For <a href="AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested stacks</a>, termination
     * protection is set on the root stack and cannot be changed directly on the nested stack.
     * </p>
     * 
     * @param updateTerminationProtectionRequest
     * @return Result of the UpdateTerminationProtection operation returned by the service.
     * @sample AmazonCloudFormation.UpdateTerminationProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateTerminationProtection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateTerminationProtectionResult updateTerminationProtection(UpdateTerminationProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateTerminationProtection(request);
    }

    @SdkInternalApi
    final UpdateTerminationProtectionResult executeUpdateTerminationProtection(UpdateTerminationProtectionRequest updateTerminationProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateTerminationProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTerminationProtectionRequest> request = null;
        Response<UpdateTerminationProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTerminationProtectionRequestMarshaller().marshall(super.beforeMarshalling(updateTerminationProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateTerminationProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateTerminationProtectionResult> responseHandler = new StaxResponseHandler<UpdateTerminationProtectionResult>(
                    new UpdateTerminationProtectionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS
     * CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a
     * template validation error.
     * </p>
     * 
     * @param validateTemplateRequest
     *        The input for <a>ValidateTemplate</a> action.
     * @return Result of the ValidateTemplate operation returned by the service.
     * @sample AmazonCloudFormation.ValidateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ValidateTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeValidateTemplate(request);
    }

    @SdkInternalApi
    final ValidateTemplateResult executeValidateTemplate(ValidateTemplateRequest validateTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(validateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateTemplateRequest> request = null;
        Response<ValidateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateTemplateRequestMarshaller().marshall(super.beforeMarshalling(validateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFormation");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ValidateTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ValidateTemplateResult> responseHandler = new StaxResponseHandler<ValidateTemplateResult>(
                    new ValidateTemplateResultStaxUnmarshaller());
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
    public AmazonCloudFormationWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonCloudFormationWaiters(this);
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

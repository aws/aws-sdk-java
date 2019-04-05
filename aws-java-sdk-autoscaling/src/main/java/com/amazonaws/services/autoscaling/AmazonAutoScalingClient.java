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
package com.amazonaws.services.autoscaling;

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

import com.amazonaws.services.autoscaling.AmazonAutoScalingClientBuilder;
import com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.services.autoscaling.model.transform.*;

/**
 * Client for accessing Auto Scaling. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>Amazon EC2 Auto Scaling</fullname>
 * <p>
 * Amazon EC2 Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined
 * policies, schedules, and health checks. Use this service with AWS Auto Scaling, Amazon CloudWatch, and Elastic Load
 * Balancing.
 * </p>
 * <p>
 * For more information, including information about granting IAM users required permissions for Amazon EC2 Auto Scaling
 * actions, see the <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html">Amazon EC2 Auto
 * Scaling User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAutoScalingClient extends AmazonWebServiceClient implements AmazonAutoScaling {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAutoScaling.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "autoscaling";

    private volatile AmazonAutoScalingWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    /**
     * List of exception unmarshallers for all modeled exceptions
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on Auto Scaling. A credentials provider chain will be used that
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
     * @deprecated use {@link AmazonAutoScalingClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonAutoScalingClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling. A credentials provider chain will be used that
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
     *        The client configuration options controlling how this client connects to Auto Scaling (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAutoScalingClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonAutoScalingClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonAutoScalingClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Auto Scaling (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAutoScalingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Auto Scaling (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AmazonAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Auto Scaling (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonAutoScalingClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonAutoScalingClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonAutoScalingClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonAutoScalingClientBuilder builder() {
        return AmazonAutoScalingClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAutoScalingClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Auto Scaling using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAutoScalingClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScalingActivityInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceContentionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ServiceLinkedRoleFailureExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.autoscaling.model.AmazonAutoScalingException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://autoscaling.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/autoscaling/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/autoscaling/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Amazon EC2 Auto Scaling increases the desired capacity of the group by the number of
     * instances being attached. If the number of instances being attached plus the desired capacity of the group
     * exceeds the maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-instance-asg.html">Attach EC2 Instances to
     * Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     * @return Result of the AttachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.AttachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AttachInstancesResult attachInstances(AttachInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeAttachInstances(request);
    }

    @SdkInternalApi
    final AttachInstancesResult executeAttachInstances(AttachInstancesRequest attachInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(attachInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachInstancesRequest> request = null;
        Response<AttachInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachInstancesRequestMarshaller().marshall(super.beforeMarshalling(attachInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachInstancesResult> responseHandler = new StaxResponseHandler<AttachInstancesResult>(
                    new AttachInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * To describe the target groups for an Auto Scaling group, use <a>DescribeLoadBalancerTargetGroups</a>. To detach
     * the target group from the Auto Scaling group, use <a>DetachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * With Application Load Balancers and Network Load Balancers, instances are registered as targets with a target
     * group. With Classic Load Balancers, instances are registered with the load balancer. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html">Attaching a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     * @return Result of the AttachLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.AttachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachLoadBalancerTargetGroupsResult attachLoadBalancerTargetGroups(AttachLoadBalancerTargetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeAttachLoadBalancerTargetGroups(request);
    }

    @SdkInternalApi
    final AttachLoadBalancerTargetGroupsResult executeAttachLoadBalancerTargetGroups(AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(attachLoadBalancerTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancerTargetGroupsRequest> request = null;
        Response<AttachLoadBalancerTargetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachLoadBalancerTargetGroupsRequestMarshaller().marshall(super.beforeMarshalling(attachLoadBalancerTargetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachLoadBalancerTargetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachLoadBalancerTargetGroupsResult> responseHandler = new StaxResponseHandler<AttachLoadBalancerTargetGroupsResult>(
                    new AttachLoadBalancerTargetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches one or more Classic Load Balancers to the specified Auto Scaling group.
     * </p>
     * <p>
     * To attach an Application Load Balancer or a Network Load Balancer instead, see
     * <a>AttachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use <a>DescribeLoadBalancers</a>. To detach the load
     * balancer from the Auto Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html">Attaching a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     * @return Result of the AttachLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.AttachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AttachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request) {
        request = beforeClientExecution(request);
        return executeAttachLoadBalancers(request);
    }

    @SdkInternalApi
    final AttachLoadBalancersResult executeAttachLoadBalancers(AttachLoadBalancersRequest attachLoadBalancersRequest) {

        ExecutionContext executionContext = createExecutionContext(attachLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachLoadBalancersRequest> request = null;
        Response<AttachLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachLoadBalancersRequestMarshaller().marshall(super.beforeMarshalling(attachLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AttachLoadBalancers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<AttachLoadBalancersResult> responseHandler = new StaxResponseHandler<AttachLoadBalancersResult>(
                    new AttachLoadBalancersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public AttachLoadBalancersResult attachLoadBalancers() {
        return attachLoadBalancers(new AttachLoadBalancersRequest());
    }

    /**
     * <p>
     * Deletes one or more scheduled actions for the specified Auto Scaling group.
     * </p>
     * 
     * @param batchDeleteScheduledActionRequest
     * @return Result of the BatchDeleteScheduledAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.BatchDeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchDeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchDeleteScheduledActionResult batchDeleteScheduledAction(BatchDeleteScheduledActionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchDeleteScheduledAction(request);
    }

    @SdkInternalApi
    final BatchDeleteScheduledActionResult executeBatchDeleteScheduledAction(BatchDeleteScheduledActionRequest batchDeleteScheduledActionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchDeleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchDeleteScheduledActionRequest> request = null;
        Response<BatchDeleteScheduledActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchDeleteScheduledActionRequestMarshaller().marshall(super.beforeMarshalling(batchDeleteScheduledActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchDeleteScheduledAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchDeleteScheduledActionResult> responseHandler = new StaxResponseHandler<BatchDeleteScheduledActionResult>(
                    new BatchDeleteScheduledActionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates one or more scheduled scaling actions for an Auto Scaling group. If you leave a parameter
     * unspecified when updating a scheduled scaling action, the corresponding value remains unchanged.
     * </p>
     * 
     * @param batchPutScheduledUpdateGroupActionRequest
     * @return Result of the BatchPutScheduledUpdateGroupAction operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.BatchPutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/BatchPutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchPutScheduledUpdateGroupActionResult batchPutScheduledUpdateGroupAction(BatchPutScheduledUpdateGroupActionRequest request) {
        request = beforeClientExecution(request);
        return executeBatchPutScheduledUpdateGroupAction(request);
    }

    @SdkInternalApi
    final BatchPutScheduledUpdateGroupActionResult executeBatchPutScheduledUpdateGroupAction(
            BatchPutScheduledUpdateGroupActionRequest batchPutScheduledUpdateGroupActionRequest) {

        ExecutionContext executionContext = createExecutionContext(batchPutScheduledUpdateGroupActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchPutScheduledUpdateGroupActionRequest> request = null;
        Response<BatchPutScheduledUpdateGroupActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchPutScheduledUpdateGroupActionRequestMarshaller()
                        .marshall(super.beforeMarshalling(batchPutScheduledUpdateGroupActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchPutScheduledUpdateGroupAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<BatchPutScheduledUpdateGroupActionResult> responseHandler = new StaxResponseHandler<BatchPutScheduledUpdateGroupActionResult>(
                    new BatchPutScheduledUpdateGroupActionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     * @return Result of the CompleteLifecycleAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.CompleteLifecycleAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CompleteLifecycleAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CompleteLifecycleActionResult completeLifecycleAction(CompleteLifecycleActionRequest request) {
        request = beforeClientExecution(request);
        return executeCompleteLifecycleAction(request);
    }

    @SdkInternalApi
    final CompleteLifecycleActionResult executeCompleteLifecycleAction(CompleteLifecycleActionRequest completeLifecycleActionRequest) {

        ExecutionContext executionContext = createExecutionContext(completeLifecycleActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CompleteLifecycleActionRequest> request = null;
        Response<CompleteLifecycleActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CompleteLifecycleActionRequestMarshaller().marshall(super.beforeMarshalling(completeLifecycleActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CompleteLifecycleAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CompleteLifecycleActionResult> responseHandler = new StaxResponseHandler<CompleteLifecycleActionResult>(
                    new CompleteLifecycleActionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, the call fails. For information about viewing this
     * limit, see <a>DescribeAccountLimits</a>. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * Limits</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     * @return Result of the CreateAutoScalingGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.CreateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAutoScalingGroupResult createAutoScalingGroup(CreateAutoScalingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAutoScalingGroup(request);
    }

    @SdkInternalApi
    final CreateAutoScalingGroupResult executeCreateAutoScalingGroup(CreateAutoScalingGroupRequest createAutoScalingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutoScalingGroupRequest> request = null;
        Response<CreateAutoScalingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAutoScalingGroupRequestMarshaller().marshall(super.beforeMarshalling(createAutoScalingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAutoScalingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateAutoScalingGroupResult> responseHandler = new StaxResponseHandler<CreateAutoScalingGroupResult>(
                    new CreateAutoScalingGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, the call fails. For information about viewing this
     * limit, see <a>DescribeAccountLimits</a>. For information about updating this limit, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * Limits</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchConfiguration.html">Launch Configurations</a>
     * in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     * @return Result of the CreateLaunchConfiguration operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.CreateLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateLaunchConfigurationResult createLaunchConfiguration(CreateLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLaunchConfiguration(request);
    }

    @SdkInternalApi
    final CreateLaunchConfigurationResult executeCreateLaunchConfiguration(CreateLaunchConfigurationRequest createLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLaunchConfigurationRequest> request = null;
        Response<CreateLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLaunchConfigurationRequestMarshaller().marshall(super.beforeMarshalling(createLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateLaunchConfigurationResult> responseHandler = new StaxResponseHandler<CreateLaunchConfigurationResult>(
                    new CreateLaunchConfigurationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
     * you do not get an error message.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     * @return Result of the CreateOrUpdateTags operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @sample AmazonAutoScaling.CreateOrUpdateTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CreateOrUpdateTags" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOrUpdateTags(request);
    }

    @SdkInternalApi
    final CreateOrUpdateTagsResult executeCreateOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(createOrUpdateTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOrUpdateTagsRequest> request = null;
        Response<CreateOrUpdateTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOrUpdateTagsRequestMarshaller().marshall(super.beforeMarshalling(createOrUpdateTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOrUpdateTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateOrUpdateTagsResult> responseHandler = new StaxResponseHandler<CreateOrUpdateTagsResult>(
                    new CreateOrUpdateTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must specify the option to force the deletion
     * in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
     * that no longer has an associated action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call <a>DetachInstances</a> with the list of
     * instances and the option to decrement the desired capacity. This ensures that Amazon EC2 Auto Scaling does not
     * launch replacement instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call <a>UpdateAutoScalingGroup</a> and set the
     * minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     * @return Result of the DeleteAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAutoScalingGroupResult deleteAutoScalingGroup(DeleteAutoScalingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAutoScalingGroup(request);
    }

    @SdkInternalApi
    final DeleteAutoScalingGroupResult executeDeleteAutoScalingGroup(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAutoScalingGroupRequest> request = null;
        Response<DeleteAutoScalingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAutoScalingGroupRequestMarshaller().marshall(super.beforeMarshalling(deleteAutoScalingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAutoScalingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteAutoScalingGroupResult> responseHandler = new StaxResponseHandler<DeleteAutoScalingGroupResult>(
                    new DeleteAutoScalingGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     * @return Result of the DeleteLaunchConfiguration operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteLaunchConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLaunchConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLaunchConfigurationResult deleteLaunchConfiguration(DeleteLaunchConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLaunchConfiguration(request);
    }

    @SdkInternalApi
    final DeleteLaunchConfigurationResult executeDeleteLaunchConfiguration(DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLaunchConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLaunchConfigurationRequest> request = null;
        Response<DeleteLaunchConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLaunchConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteLaunchConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLaunchConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteLaunchConfigurationResult> responseHandler = new StaxResponseHandler<DeleteLaunchConfigurationResult>(
                    new DeleteLaunchConfigurationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first (<code>ABANDON</code> for launching
     * instances, <code>CONTINUE</code> for terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     * @return Result of the DeleteLifecycleHook operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteLifecycleHook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLifecycleHookResult deleteLifecycleHook(DeleteLifecycleHookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLifecycleHook(request);
    }

    @SdkInternalApi
    final DeleteLifecycleHookResult executeDeleteLifecycleHook(DeleteLifecycleHookRequest deleteLifecycleHookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLifecycleHookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLifecycleHookRequest> request = null;
        Response<DeleteLifecycleHookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLifecycleHookRequestMarshaller().marshall(super.beforeMarshalling(deleteLifecycleHookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLifecycleHook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteLifecycleHookResult> responseHandler = new StaxResponseHandler<DeleteLifecycleHookResult>(
                    new DeleteLifecycleHookResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     * @return Result of the DeleteNotificationConfiguration operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteNotificationConfigurationResult deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteNotificationConfiguration(request);
    }

    @SdkInternalApi
    final DeleteNotificationConfigurationResult executeDeleteNotificationConfiguration(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteNotificationConfigurationRequest> request = null;
        Response<DeleteNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteNotificationConfigurationRequestMarshaller().marshall(super.beforeMarshalling(deleteNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteNotificationConfigurationResult> responseHandler = new StaxResponseHandler<DeleteNotificationConfigurationResult>(
                    new DeleteNotificationConfigurationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an
     * associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicy(request);
    }

    @SdkInternalApi
    final DeletePolicyResult executeDeletePolicy(DeletePolicyRequest deletePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<DeletePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestMarshaller().marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeletePolicyResult> responseHandler = new StaxResponseHandler<DeletePolicyResult>(new DeletePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     * @return Result of the DeleteScheduledAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DeleteScheduledAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteScheduledAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteScheduledAction(request);
    }

    @SdkInternalApi
    final DeleteScheduledActionResult executeDeleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteScheduledActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteScheduledActionRequest> request = null;
        Response<DeleteScheduledActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteScheduledActionRequestMarshaller().marshall(super.beforeMarshalling(deleteScheduledActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteScheduledAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteScheduledActionResult> responseHandler = new StaxResponseHandler<DeleteScheduledActionResult>(
                    new DeleteScheduledActionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @sample AmazonAutoScaling.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteTags(request);
    }

    @SdkInternalApi
    final DeleteTagsResult executeDeleteTags(DeleteTagsRequest deleteTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTagsRequest> request = null;
        Response<DeleteTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTagsRequestMarshaller().marshall(super.beforeMarshalling(deleteTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DeleteTagsResult> responseHandler = new StaxResponseHandler<DeleteTagsResult>(new DeleteTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the current Amazon EC2 Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html">Amazon EC2 Auto Scaling
     * Limits</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAccountLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAccountLimits"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
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

    @Override
    public DescribeAccountLimitsResult describeAccountLimits() {
        return describeAccountLimits(new DescribeAccountLimitsRequest());
    }

    /**
     * <p>
     * Describes the policy adjustment types for use with <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return Result of the DescribeAdjustmentTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAdjustmentTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAdjustmentTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAdjustmentTypesResult describeAdjustmentTypes(DescribeAdjustmentTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAdjustmentTypes(request);
    }

    @SdkInternalApi
    final DescribeAdjustmentTypesResult executeDescribeAdjustmentTypes(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAdjustmentTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAdjustmentTypesRequest> request = null;
        Response<DescribeAdjustmentTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAdjustmentTypesRequestMarshaller().marshall(super.beforeMarshalling(describeAdjustmentTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAdjustmentTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAdjustmentTypesResult> responseHandler = new StaxResponseHandler<DescribeAdjustmentTypesResult>(
                    new DescribeAdjustmentTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeAdjustmentTypesResult describeAdjustmentTypes() {
        return describeAdjustmentTypes(new DescribeAdjustmentTypesRequest());
    }

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     * @return Result of the DescribeAutoScalingGroups operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups(DescribeAutoScalingGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutoScalingGroups(request);
    }

    @SdkInternalApi
    final DescribeAutoScalingGroupsResult executeDescribeAutoScalingGroups(DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutoScalingGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingGroupsRequest> request = null;
        Response<DescribeAutoScalingGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoScalingGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeAutoScalingGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutoScalingGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAutoScalingGroupsResult> responseHandler = new StaxResponseHandler<DescribeAutoScalingGroupsResult>(
                    new DescribeAutoScalingGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups() {
        return describeAutoScalingGroups(new DescribeAutoScalingGroupsRequest());
    }

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     * @return Result of the DescribeAutoScalingInstances operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingInstances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances(DescribeAutoScalingInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutoScalingInstances(request);
    }

    @SdkInternalApi
    final DescribeAutoScalingInstancesResult executeDescribeAutoScalingInstances(DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutoScalingInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingInstancesRequest> request = null;
        Response<DescribeAutoScalingInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoScalingInstancesRequestMarshaller().marshall(super.beforeMarshalling(describeAutoScalingInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutoScalingInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAutoScalingInstancesResult> responseHandler = new StaxResponseHandler<DescribeAutoScalingInstancesResult>(
                    new DescribeAutoScalingInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances() {
        return describeAutoScalingInstances(new DescribeAutoScalingInstancesRequest());
    }

    /**
     * <p>
     * Describes the notification types that are supported by Amazon EC2 Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return Result of the DescribeAutoScalingNotificationTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingNotificationTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingNotificationTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(DescribeAutoScalingNotificationTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutoScalingNotificationTypes(request);
    }

    @SdkInternalApi
    final DescribeAutoScalingNotificationTypesResult executeDescribeAutoScalingNotificationTypes(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutoScalingNotificationTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoScalingNotificationTypesRequest> request = null;
        Response<DescribeAutoScalingNotificationTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoScalingNotificationTypesRequestMarshaller().marshall(super
                        .beforeMarshalling(describeAutoScalingNotificationTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutoScalingNotificationTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeAutoScalingNotificationTypesResult> responseHandler = new StaxResponseHandler<DescribeAutoScalingNotificationTypesResult>(
                    new DescribeAutoScalingNotificationTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes() {
        return describeAutoScalingNotificationTypes(new DescribeAutoScalingNotificationTypesRequest());
    }

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     * @return Result of the DescribeLaunchConfigurations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLaunchConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLaunchConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations(DescribeLaunchConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLaunchConfigurations(request);
    }

    @SdkInternalApi
    final DescribeLaunchConfigurationsResult executeDescribeLaunchConfigurations(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLaunchConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLaunchConfigurationsRequest> request = null;
        Response<DescribeLaunchConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLaunchConfigurationsRequestMarshaller().marshall(super.beforeMarshalling(describeLaunchConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLaunchConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLaunchConfigurationsResult> responseHandler = new StaxResponseHandler<DescribeLaunchConfigurationsResult>(
                    new DescribeLaunchConfigurationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations() {
        return describeLaunchConfigurations(new DescribeLaunchConfigurationsRequest());
    }

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * <p>
     * The following hook types are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_LAUNCHING
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling:EC2_INSTANCE_TERMINATING
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return Result of the DescribeLifecycleHookTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHookTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHookTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLifecycleHookTypes(request);
    }

    @SdkInternalApi
    final DescribeLifecycleHookTypesResult executeDescribeLifecycleHookTypes(DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLifecycleHookTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLifecycleHookTypesRequest> request = null;
        Response<DescribeLifecycleHookTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLifecycleHookTypesRequestMarshaller().marshall(super.beforeMarshalling(describeLifecycleHookTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLifecycleHookTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLifecycleHookTypesResult> responseHandler = new StaxResponseHandler<DescribeLifecycleHookTypesResult>(
                    new DescribeLifecycleHookTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes() {
        return describeLifecycleHookTypes(new DescribeLifecycleHookTypesRequest());
    }

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     * @return Result of the DescribeLifecycleHooks operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHooks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLifecycleHooksResult describeLifecycleHooks(DescribeLifecycleHooksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLifecycleHooks(request);
    }

    @SdkInternalApi
    final DescribeLifecycleHooksResult executeDescribeLifecycleHooks(DescribeLifecycleHooksRequest describeLifecycleHooksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLifecycleHooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLifecycleHooksRequest> request = null;
        Response<DescribeLifecycleHooksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLifecycleHooksRequestMarshaller().marshall(super.beforeMarshalling(describeLifecycleHooksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLifecycleHooks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLifecycleHooksResult> responseHandler = new StaxResponseHandler<DescribeLifecycleHooksResult>(
                    new DescribeLifecycleHooksResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     * @return Result of the DescribeLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBalancerTargetGroupsResult describeLoadBalancerTargetGroups(DescribeLoadBalancerTargetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBalancerTargetGroups(request);
    }

    @SdkInternalApi
    final DescribeLoadBalancerTargetGroupsResult executeDescribeLoadBalancerTargetGroups(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBalancerTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancerTargetGroupsRequest> request = null;
        Response<DescribeLoadBalancerTargetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBalancerTargetGroupsRequestMarshaller().marshall(super.beforeMarshalling(describeLoadBalancerTargetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBalancerTargetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoadBalancerTargetGroupsResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancerTargetGroupsResult>(
                    new DescribeLoadBalancerTargetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation describes only Classic Load Balancers. If you have Application Load Balancers or Network Load
     * Balancers, use <a>DescribeLoadBalancerTargetGroups</a> instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     * @return Result of the DescribeLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoadBalancers(request);
    }

    @SdkInternalApi
    final DescribeLoadBalancersResult executeDescribeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoadBalancersRequest> request = null;
        Response<DescribeLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoadBalancersRequestMarshaller().marshall(super.beforeMarshalling(describeLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoadBalancers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeLoadBalancersResult> responseHandler = new StaxResponseHandler<DescribeLoadBalancersResult>(
                    new DescribeLoadBalancersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * The <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request this metric
     * when calling <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return Result of the DescribeMetricCollectionTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeMetricCollectionTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeMetricCollectionTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMetricCollectionTypes(request);
    }

    @SdkInternalApi
    final DescribeMetricCollectionTypesResult executeDescribeMetricCollectionTypes(DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMetricCollectionTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMetricCollectionTypesRequest> request = null;
        Response<DescribeMetricCollectionTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMetricCollectionTypesRequestMarshaller().marshall(super.beforeMarshalling(describeMetricCollectionTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMetricCollectionTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeMetricCollectionTypesResult> responseHandler = new StaxResponseHandler<DescribeMetricCollectionTypesResult>(
                    new DescribeMetricCollectionTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes() {
        return describeMetricCollectionTypes(new DescribeMetricCollectionTypesRequest());
    }

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     * @return Result of the DescribeNotificationConfigurations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeNotificationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeNotificationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeNotificationConfigurations(request);
    }

    @SdkInternalApi
    final DescribeNotificationConfigurationsResult executeDescribeNotificationConfigurations(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeNotificationConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeNotificationConfigurationsRequest> request = null;
        Response<DescribeNotificationConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeNotificationConfigurationsRequestMarshaller()
                        .marshall(super.beforeMarshalling(describeNotificationConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeNotificationConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeNotificationConfigurationsResult> responseHandler = new StaxResponseHandler<DescribeNotificationConfigurationsResult>(
                    new DescribeNotificationConfigurationsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations() {
        return describeNotificationConfigurations(new DescribeNotificationConfigurationsRequest());
    }

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     * @return Result of the DescribePolicies operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.DescribePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribePolicies" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePoliciesResult describePolicies(DescribePoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePolicies(request);
    }

    @SdkInternalApi
    final DescribePoliciesResult executeDescribePolicies(DescribePoliciesRequest describePoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(describePoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePoliciesRequest> request = null;
        Response<DescribePoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePoliciesRequestMarshaller().marshall(super.beforeMarshalling(describePoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribePoliciesResult> responseHandler = new StaxResponseHandler<DescribePoliciesResult>(
                    new DescribePoliciesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribePoliciesResult describePolicies() {
        return describePolicies(new DescribePoliciesRequest());
    }

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return Result of the DescribeScalingActivities operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScalingActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingActivities"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingActivities(request);
    }

    @SdkInternalApi
    final DescribeScalingActivitiesResult executeDescribeScalingActivities(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingActivitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingActivitiesRequest> request = null;
        Response<DescribeScalingActivitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingActivitiesRequestMarshaller().marshall(super.beforeMarshalling(describeScalingActivitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingActivities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeScalingActivitiesResult> responseHandler = new StaxResponseHandler<DescribeScalingActivitiesResult>(
                    new DescribeScalingActivitiesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeScalingActivitiesResult describeScalingActivities() {
        return describeScalingActivities(new DescribeScalingActivitiesRequest());
    }

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a> and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return Result of the DescribeScalingProcessTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScalingProcessTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScalingProcessTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScalingProcessTypesResult describeScalingProcessTypes(DescribeScalingProcessTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScalingProcessTypes(request);
    }

    @SdkInternalApi
    final DescribeScalingProcessTypesResult executeDescribeScalingProcessTypes(DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScalingProcessTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScalingProcessTypesRequest> request = null;
        Response<DescribeScalingProcessTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScalingProcessTypesRequestMarshaller().marshall(super.beforeMarshalling(describeScalingProcessTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScalingProcessTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeScalingProcessTypesResult> responseHandler = new StaxResponseHandler<DescribeScalingProcessTypesResult>(
                    new DescribeScalingProcessTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeScalingProcessTypesResult describeScalingProcessTypes() {
        return describeScalingProcessTypes(new DescribeScalingProcessTypesRequest());
    }

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have
     * already run, use <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     * @return Result of the DescribeScheduledActions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeScheduledActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScheduledActions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeScheduledActions(request);
    }

    @SdkInternalApi
    final DescribeScheduledActionsResult executeDescribeScheduledActions(DescribeScheduledActionsRequest describeScheduledActionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeScheduledActionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeScheduledActionsRequest> request = null;
        Response<DescribeScheduledActionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeScheduledActionsRequestMarshaller().marshall(super.beforeMarshalling(describeScheduledActionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeScheduledActions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeScheduledActionsResult> responseHandler = new StaxResponseHandler<DescribeScheduledActionsResult>(
                    new DescribeScheduledActionsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeScheduledActionsResult describeScheduledActions() {
        return describeScheduledActions(new DescribeScheduledActionsRequest());
    }

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
     * group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
     * to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information for a particular tag only if it matches
     * all the filters. If there's no match, no special message is returned.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestMarshaller().marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTagsResult> responseHandler = new StaxResponseHandler<DescribeTagsResult>(new DescribeTagsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTagsResult describeTags() {
        return describeTags(new DescribeTagsRequest());
    }

    /**
     * <p>
     * Describes the termination policies supported by Amazon EC2 Auto Scaling.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html">Controlling Which Auto
     * Scaling Instances Terminate During Scale In</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return Result of the DescribeTerminationPolicyTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DescribeTerminationPolicyTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTerminationPolicyTypes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTerminationPolicyTypes(request);
    }

    @SdkInternalApi
    final DescribeTerminationPolicyTypesResult executeDescribeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTerminationPolicyTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTerminationPolicyTypesRequest> request = null;
        Response<DescribeTerminationPolicyTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTerminationPolicyTypesRequestMarshaller().marshall(super.beforeMarshalling(describeTerminationPolicyTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTerminationPolicyTypes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DescribeTerminationPolicyTypesResult> responseHandler = new StaxResponseHandler<DescribeTerminationPolicyTypesResult>(
                    new DescribeTerminationPolicyTypesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes() {
        return describeTerminationPolicyTypes(new DescribeTerminationPolicyTypesRequest());
    }

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independent of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Amazon EC2 Auto Scaling launches instances to
     * replace the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic Load Balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/detach-instance-asg.html">Detach EC2 Instances from
     * Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     * @return Result of the DetachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachInstances" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DetachInstancesResult detachInstances(DetachInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeDetachInstances(request);
    }

    @SdkInternalApi
    final DetachInstancesResult executeDetachInstances(DetachInstancesRequest detachInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(detachInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachInstancesRequest> request = null;
        Response<DetachInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachInstancesRequestMarshaller().marshall(super.beforeMarshalling(detachInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachInstances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachInstancesResult> responseHandler = new StaxResponseHandler<DetachInstancesResult>(
                    new DetachInstancesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return Result of the DetachLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancerTargetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancerTargetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachLoadBalancerTargetGroupsResult detachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDetachLoadBalancerTargetGroups(request);
    }

    @SdkInternalApi
    final DetachLoadBalancerTargetGroupsResult executeDetachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(detachLoadBalancerTargetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachLoadBalancerTargetGroupsRequest> request = null;
        Response<DetachLoadBalancerTargetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachLoadBalancerTargetGroupsRequestMarshaller().marshall(super.beforeMarshalling(detachLoadBalancerTargetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachLoadBalancerTargetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachLoadBalancerTargetGroupsResult> responseHandler = new StaxResponseHandler<DetachLoadBalancerTargetGroupsResult>(
                    new DetachLoadBalancerTargetGroupsResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches one or more Classic Load Balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * This operation detaches only Classic Load Balancers. If you have Application Load Balancers or Network Load
     * Balancers, use <a>DetachLoadBalancerTargetGroups</a> instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. The instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     * @return Result of the DetachLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DetachLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DetachLoadBalancersResult detachLoadBalancers(DetachLoadBalancersRequest request) {
        request = beforeClientExecution(request);
        return executeDetachLoadBalancers(request);
    }

    @SdkInternalApi
    final DetachLoadBalancersResult executeDetachLoadBalancers(DetachLoadBalancersRequest detachLoadBalancersRequest) {

        ExecutionContext executionContext = createExecutionContext(detachLoadBalancersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachLoadBalancersRequest> request = null;
        Response<DetachLoadBalancersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachLoadBalancersRequestMarshaller().marshall(super.beforeMarshalling(detachLoadBalancersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DetachLoadBalancers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DetachLoadBalancersResult> responseHandler = new StaxResponseHandler<DetachLoadBalancersResult>(
                    new DetachLoadBalancersResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DetachLoadBalancersResult detachLoadBalancers() {
        return detachLoadBalancers(new DetachLoadBalancersRequest());
    }

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     * @return Result of the DisableMetricsCollection operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.DisableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DisableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisableMetricsCollectionResult disableMetricsCollection(DisableMetricsCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeDisableMetricsCollection(request);
    }

    @SdkInternalApi
    final DisableMetricsCollectionResult executeDisableMetricsCollection(DisableMetricsCollectionRequest disableMetricsCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(disableMetricsCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableMetricsCollectionRequest> request = null;
        Response<DisableMetricsCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableMetricsCollectionRequestMarshaller().marshall(super.beforeMarshalling(disableMetricsCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisableMetricsCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<DisableMetricsCollectionResult> responseHandler = new StaxResponseHandler<DisableMetricsCollectionResult>(
                    new DisableMetricsCollectionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables group metrics for the specified Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html">Monitoring Your Auto
     * Scaling Groups and Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     * @return Result of the EnableMetricsCollection operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.EnableMetricsCollection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnableMetricsCollection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public EnableMetricsCollectionResult enableMetricsCollection(EnableMetricsCollectionRequest request) {
        request = beforeClientExecution(request);
        return executeEnableMetricsCollection(request);
    }

    @SdkInternalApi
    final EnableMetricsCollectionResult executeEnableMetricsCollection(EnableMetricsCollectionRequest enableMetricsCollectionRequest) {

        ExecutionContext executionContext = createExecutionContext(enableMetricsCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableMetricsCollectionRequest> request = null;
        Response<EnableMetricsCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableMetricsCollectionRequestMarshaller().marshall(super.beforeMarshalling(enableMetricsCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnableMetricsCollection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EnableMetricsCollectionResult> responseHandler = new StaxResponseHandler<EnableMetricsCollectionResult>(
                    new EnableMetricsCollectionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves the specified instances into the standby state.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily Removing
     * Instances from Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     * @return Result of the EnterStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.EnterStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnterStandby" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public EnterStandbyResult enterStandby(EnterStandbyRequest request) {
        request = beforeClientExecution(request);
        return executeEnterStandby(request);
    }

    @SdkInternalApi
    final EnterStandbyResult executeEnterStandby(EnterStandbyRequest enterStandbyRequest) {

        ExecutionContext executionContext = createExecutionContext(enterStandbyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnterStandbyRequest> request = null;
        Response<EnterStandbyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnterStandbyRequestMarshaller().marshall(super.beforeMarshalling(enterStandbyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "EnterStandby");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<EnterStandbyResult> responseHandler = new StaxResponseHandler<EnterStandbyResult>(new EnterStandbyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     * @return Result of the ExecutePolicy operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.ExecutePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExecutePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExecutePolicyResult executePolicy(ExecutePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeExecutePolicy(request);
    }

    @SdkInternalApi
    final ExecutePolicyResult executeExecutePolicy(ExecutePolicyRequest executePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(executePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecutePolicyRequest> request = null;
        Response<ExecutePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecutePolicyRequestMarshaller().marshall(super.beforeMarshalling(executePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecutePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ExecutePolicyResult> responseHandler = new StaxResponseHandler<ExecutePolicyResult>(new ExecutePolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Moves the specified instances out of the standby state.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html">Temporarily Removing
     * Instances from Your Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     * @return Result of the ExitStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.ExitStandby
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ExitStandby" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ExitStandbyResult exitStandby(ExitStandbyRequest request) {
        request = beforeClientExecution(request);
        return executeExitStandby(request);
    }

    @SdkInternalApi
    final ExitStandbyResult executeExitStandby(ExitStandbyRequest exitStandbyRequest) {

        ExecutionContext executionContext = createExecutionContext(exitStandbyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExitStandbyRequest> request = null;
        Response<ExitStandbyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExitStandbyRequestMarshaller().marshall(super.beforeMarshalling(exitStandbyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExitStandby");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ExitStandbyResult> responseHandler = new StaxResponseHandler<ExitStandbyResult>(new ExitStandbyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling group.
     * </p>
     * <p>
     * A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an instance when the instance launches
     * (before it is put into service) or as the instance terminates (before it is fully terminated).
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state using using
     * <a>RecordLifecycleActionHeartbeat</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action using <a>CompleteLifecycleAction</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html">Amazon EC2 Auto Scaling
     * Lifecycle Hooks</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails.
     * </p>
     * <p>
     * You can view the lifecycle hooks for an Auto Scaling group using <a>DescribeLifecycleHooks</a>. If you are no
     * longer using a lifecycle hook, you can delete it using <a>DeleteLifecycleHook</a>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     * @return Result of the PutLifecycleHook operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutLifecycleHook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutLifecycleHook" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest request) {
        request = beforeClientExecution(request);
        return executePutLifecycleHook(request);
    }

    @SdkInternalApi
    final PutLifecycleHookResult executePutLifecycleHook(PutLifecycleHookRequest putLifecycleHookRequest) {

        ExecutionContext executionContext = createExecutionContext(putLifecycleHookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLifecycleHookRequest> request = null;
        Response<PutLifecycleHookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLifecycleHookRequestMarshaller().marshall(super.beforeMarshalling(putLifecycleHookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLifecycleHook");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutLifecycleHookResult> responseHandler = new StaxResponseHandler<PutLifecycleHookResult>(
                    new PutLifecycleHookResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
     * specified topic can have messages delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html">Getting Amazon SNS
     * Notifications When Your Auto Scaling Group Scales</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     * @return Result of the PutNotificationConfiguration operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.PutNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutNotificationConfigurationResult putNotificationConfiguration(PutNotificationConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executePutNotificationConfiguration(request);
    }

    @SdkInternalApi
    final PutNotificationConfigurationResult executePutNotificationConfiguration(PutNotificationConfigurationRequest putNotificationConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(putNotificationConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutNotificationConfigurationRequest> request = null;
        Response<PutNotificationConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutNotificationConfigurationRequestMarshaller().marshall(super.beforeMarshalling(putNotificationConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutNotificationConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutNotificationConfigurationResult> responseHandler = new StaxResponseHandler<PutNotificationConfigurationResult>(
                    new PutNotificationConfigurationResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name
     * and set the parameters to change. Any existing parameter not changed in an update to an existing policy is not
     * changed in this update request.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutScalingPolicy(request);
    }

    @SdkInternalApi
    final PutScalingPolicyResult executePutScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putScalingPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScalingPolicyRequest> request = null;
        Response<PutScalingPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScalingPolicyRequestMarshaller().marshall(super.beforeMarshalling(putScalingPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutScalingPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutScalingPolicyResult> responseHandler = new StaxResponseHandler<PutScalingPolicyResult>(
                    new PutScalingPolicyResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group. If you leave a parameter unspecified
     * when updating a scheduled scaling action, the corresponding value remains unchanged.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html">Scheduled Scaling</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     * @return Result of the PutScheduledUpdateGroupAction operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.PutScheduledUpdateGroupAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PutScheduledUpdateGroupAction"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutScheduledUpdateGroupActionResult putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest request) {
        request = beforeClientExecution(request);
        return executePutScheduledUpdateGroupAction(request);
    }

    @SdkInternalApi
    final PutScheduledUpdateGroupActionResult executePutScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) {

        ExecutionContext executionContext = createExecutionContext(putScheduledUpdateGroupActionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutScheduledUpdateGroupActionRequest> request = null;
        Response<PutScheduledUpdateGroupActionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutScheduledUpdateGroupActionRequestMarshaller().marshall(super.beforeMarshalling(putScheduledUpdateGroupActionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutScheduledUpdateGroupAction");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<PutScheduledUpdateGroupActionResult> responseHandler = new StaxResponseHandler<PutScheduledUpdateGroupActionResult>(
                    new PutScheduledUpdateGroupActionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
     * timeout by the length of time defined using <a>PutLifecycleHook</a>.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Amazon EC2 Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Amazon EC2 Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     * @return Result of the RecordLifecycleActionHeartbeat operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.RecordLifecycleActionHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/RecordLifecycleActionHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) {
        request = beforeClientExecution(request);
        return executeRecordLifecycleActionHeartbeat(request);
    }

    @SdkInternalApi
    final RecordLifecycleActionHeartbeatResult executeRecordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest) {

        ExecutionContext executionContext = createExecutionContext(recordLifecycleActionHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RecordLifecycleActionHeartbeatRequest> request = null;
        Response<RecordLifecycleActionHeartbeatResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RecordLifecycleActionHeartbeatRequestMarshaller().marshall(super.beforeMarshalling(recordLifecycleActionHeartbeatRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RecordLifecycleActionHeartbeat");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<RecordLifecycleActionHeartbeatResult> responseHandler = new StaxResponseHandler<RecordLifecycleActionHeartbeatResult>(
                    new RecordLifecycleActionHeartbeatResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes the specified suspended automatic scaling processes, or all suspended process, for the specified Auto
     * Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * Resuming Scaling Processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     * @return Result of the ResumeProcesses operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.ResumeProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/ResumeProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResumeProcessesResult resumeProcesses(ResumeProcessesRequest request) {
        request = beforeClientExecution(request);
        return executeResumeProcesses(request);
    }

    @SdkInternalApi
    final ResumeProcessesResult executeResumeProcesses(ResumeProcessesRequest resumeProcessesRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeProcessesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeProcessesRequest> request = null;
        Response<ResumeProcessesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeProcessesRequestMarshaller().marshall(super.beforeMarshalling(resumeProcessesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeProcesses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ResumeProcessesResult> responseHandler = new StaxResponseHandler<ResumeProcessesResult>(
                    new ResumeProcessesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html">What Is Amazon
     * EC2 Auto Scaling?</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     * @return Result of the SetDesiredCapacity operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetDesiredCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetDesiredCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetDesiredCapacityResult setDesiredCapacity(SetDesiredCapacityRequest request) {
        request = beforeClientExecution(request);
        return executeSetDesiredCapacity(request);
    }

    @SdkInternalApi
    final SetDesiredCapacityResult executeSetDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest) {

        ExecutionContext executionContext = createExecutionContext(setDesiredCapacityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetDesiredCapacityRequest> request = null;
        Response<SetDesiredCapacityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetDesiredCapacityRequestMarshaller().marshall(super.beforeMarshalling(setDesiredCapacityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetDesiredCapacity");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetDesiredCapacityResult> responseHandler = new StaxResponseHandler<SetDesiredCapacityResult>(
                    new SetDesiredCapacityResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html">Health
     * Checks for Auto Scaling Instances</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     * @return Result of the SetInstanceHealth operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetInstanceHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceHealth" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SetInstanceHealthResult setInstanceHealth(SetInstanceHealthRequest request) {
        request = beforeClientExecution(request);
        return executeSetInstanceHealth(request);
    }

    @SdkInternalApi
    final SetInstanceHealthResult executeSetInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest) {

        ExecutionContext executionContext = createExecutionContext(setInstanceHealthRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetInstanceHealthRequest> request = null;
        Response<SetInstanceHealthResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetInstanceHealthRequestMarshaller().marshall(super.beforeMarshalling(setInstanceHealthRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetInstanceHealth");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetInstanceHealthResult> responseHandler = new StaxResponseHandler<SetInstanceHealthResult>(
                    new SetInstanceHealthResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the instance protection settings of the specified instances.
     * </p>
     * <p>
     * For more information about preventing instances that are part of an Auto Scaling group from terminating on scale
     * in, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection"
     * >Instance Protection</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     * @return Result of the SetInstanceProtection operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Amazon EC2 Auto Scaling resources (for example, Auto Scaling
     *         groups, launch configurations, or lifecycle hooks). For more information, see
     *         <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SetInstanceProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SetInstanceProtection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeSetInstanceProtection(request);
    }

    @SdkInternalApi
    final SetInstanceProtectionResult executeSetInstanceProtection(SetInstanceProtectionRequest setInstanceProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(setInstanceProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetInstanceProtectionRequest> request = null;
        Response<SetInstanceProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetInstanceProtectionRequestMarshaller().marshall(super.beforeMarshalling(setInstanceProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SetInstanceProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SetInstanceProtectionResult> responseHandler = new StaxResponseHandler<SetInstanceProtectionResult>(
                    new SetInstanceProtectionResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends the specified automatic scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * If you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent other
     * process types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html">Suspending and
     * Resuming Scaling Processes</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     * @return Result of the SuspendProcesses operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.SuspendProcesses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SuspendProcesses" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SuspendProcessesResult suspendProcesses(SuspendProcessesRequest request) {
        request = beforeClientExecution(request);
        return executeSuspendProcesses(request);
    }

    @SdkInternalApi
    final SuspendProcessesResult executeSuspendProcesses(SuspendProcessesRequest suspendProcessesRequest) {

        ExecutionContext executionContext = createExecutionContext(suspendProcessesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SuspendProcessesRequest> request = null;
        Response<SuspendProcessesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SuspendProcessesRequestMarshaller().marshall(super.beforeMarshalling(suspendProcessesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SuspendProcesses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<SuspendProcessesResult> responseHandler = new StaxResponseHandler<SuspendProcessesResult>(
                    new SuspendProcessesResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not terminated immediately.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     * @return Result of the TerminateInstanceInAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @sample AmazonAutoScaling.TerminateInstanceInAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TerminateInstanceInAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(TerminateInstanceInAutoScalingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateInstanceInAutoScalingGroup(request);
    }

    @SdkInternalApi
    final TerminateInstanceInAutoScalingGroupResult executeTerminateInstanceInAutoScalingGroup(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateInstanceInAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateInstanceInAutoScalingGroupRequest> request = null;
        Response<TerminateInstanceInAutoScalingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateInstanceInAutoScalingGroupRequestMarshaller().marshall(super
                        .beforeMarshalling(terminateInstanceInAutoScalingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateInstanceInAutoScalingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<TerminateInstanceInAutoScalingGroupResult> responseHandler = new StaxResponseHandler<TerminateInstanceInAutoScalingGroupResult>(
                    new TerminateInstanceInAutoScalingGroupResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * The new settings take effect on any scaling activities after this call returns. Scaling activities that are
     * currently in progress aren't affected.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with <code>InstanceMonitoring</code> set to
     * <code>false</code>, you must first disable the collection of group metrics. Otherwise, you get an error. If you
     * have previously enabled the collection of group metrics, you can disable it using
     * <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MinSize</code> is larger than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value of <code>MinSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MaxSize</code> is smaller than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value of <code>MaxSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAutoScalingGroupRequest
     * @return Result of the UpdateAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Amazon EC2 Auto Scaling resource (for example, an Auto Scaling
     *         group, instance, or load balancer).
     * @throws ServiceLinkedRoleFailureException
     *         The service-linked role is not yet ready for use.
     * @sample AmazonAutoScaling.UpdateAutoScalingGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/UpdateAutoScalingGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAutoScalingGroupResult updateAutoScalingGroup(UpdateAutoScalingGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAutoScalingGroup(request);
    }

    @SdkInternalApi
    final UpdateAutoScalingGroupResult executeUpdateAutoScalingGroup(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAutoScalingGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAutoScalingGroupRequest> request = null;
        Response<UpdateAutoScalingGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAutoScalingGroupRequestMarshaller().marshall(super.beforeMarshalling(updateAutoScalingGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Auto Scaling");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAutoScalingGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateAutoScalingGroupResult> responseHandler = new StaxResponseHandler<UpdateAutoScalingGroupResult>(
                    new UpdateAutoScalingGroupResultStaxUnmarshaller());
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
    public AmazonAutoScalingWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonAutoScalingWaiters(this);
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

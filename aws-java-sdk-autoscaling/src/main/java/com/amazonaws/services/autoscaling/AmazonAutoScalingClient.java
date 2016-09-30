/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
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
import com.amazonaws.services.autoscaling.waiters.AmazonAutoScalingWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.services.autoscaling.model.transform.*;

/**
 * Client for accessing Auto Scaling. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <fullname>Auto Scaling</fullname>
 * <p>
 * Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined policies,
 * schedules, and health checks. Use this service in conjunction with the Amazon CloudWatch and Elastic Load Balancing
 * services.
 * </p>
 */
@ThreadSafe
public class AmazonAutoScalingClient extends AmazonWebServiceClient implements AmazonAutoScaling {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAutoScaling.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "autoscaling";

    private volatile AmazonAutoScalingWaiters waiters;

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

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
     */
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
     */
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
     */
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
     */
    public AmazonAutoScalingClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
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
     */
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
     */
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
     */
    public AmazonAutoScalingClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
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
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ScalingActivityInProgressExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidNextTokenExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new ResourceContentionExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller(com.amazonaws.services.autoscaling.model.AmazonAutoScalingException.class));

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://autoscaling.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/autoscaling/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/autoscaling/request.handler2s"));
    }

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Auto Scaling increases the desired capacity of the group by the number of instances
     * being attached. If the number of instances being attached plus the desired capacity of the group exceeds the
     * maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic load balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html">Attach EC2 Instances
     * to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     *        Contains the parameters for AttachInstances.
     * @return Result of the AttachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.AttachInstances
     */
    @Override
    public AttachInstancesResult attachInstances(AttachInstancesRequest attachInstancesRequest) {
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
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html">Attach a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     *        Contains the parameters for AttachLoadBalancerTargetGroups.
     * @return Result of the AttachLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.AttachLoadBalancerTargetGroups
     */
    @Override
    public AttachLoadBalancerTargetGroupsResult attachLoadBalancerTargetGroups(AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest) {
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
     * Attaches one or more Classic load balancers to the specified Auto Scaling group.
     * </p>
     * <p>
     * To attach an Application load balancer instead, see <a>AttachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use <a>DescribeLoadBalancers</a>. To detach the load
     * balancer from the Auto Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html">Attach a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     *        Contains the parameters for AttachLoadBalancers.
     * @return Result of the AttachLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.AttachLoadBalancers
     */
    @Override
    public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest attachLoadBalancersRequest) {
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
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
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
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     *        Contains the parameters for CompleteLifecycleAction.
     * @return Result of the CompleteLifecycleAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.CompleteLifecycleAction
     */
    @Override
    public CompleteLifecycleActionResult completeLifecycleAction(CompleteLifecycleActionRequest completeLifecycleActionRequest) {
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
     * If you exceed your maximum limit of Auto Scaling groups, which by default is 20 per region, the call fails. For
     * information about viewing and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html">Auto Scaling Groups</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     *        Contains the parameters for CreateAutoScalingGroup.
     * @return Result of the CreateAutoScalingGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.CreateAutoScalingGroup
     */
    @Override
    public CreateAutoScalingGroupResult createAutoScalingGroup(CreateAutoScalingGroupRequest createAutoScalingGroupRequest) {
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
     * If you exceed your maximum limit of launch configurations, which by default is 100 per region, the call fails.
     * For information about viewing and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/LaunchConfiguration.html">Launch
     * Configurations</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     *        Contains the parameters for CreateLaunchConfiguration.
     * @return Result of the CreateLaunchConfiguration operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.CreateLaunchConfiguration
     */
    @Override
    public CreateLaunchConfigurationResult createLaunchConfiguration(CreateLaunchConfigurationRequest createLaunchConfigurationRequest) {
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
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     *        Contains the parameters for CreateOrUpdateTags.
     * @return Result of the CreateOrUpdateTags operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.CreateOrUpdateTags
     */
    @Override
    public CreateOrUpdateTagsResult createOrUpdateTags(CreateOrUpdateTagsRequest createOrUpdateTagsRequest) {
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
     * instances and the option to decrement the desired capacity so that Auto Scaling does not launch replacement
     * instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call <a>UpdateAutoScalingGroup</a> and set the
     * minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     *        Contains the parameters for DeleteAutoScalingGroup.
     * @return Result of the DeleteAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeleteAutoScalingGroup
     */
    @Override
    public DeleteAutoScalingGroupResult deleteAutoScalingGroup(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest) {
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
     *        Contains the parameters for DeleteLaunchConfiguration.
     * @return Result of the DeleteLaunchConfiguration operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeleteLaunchConfiguration
     */
    @Override
    public DeleteLaunchConfigurationResult deleteLaunchConfiguration(DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest) {
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
     *        Contains the parameters for DeleteLifecycleHook.
     * @return Result of the DeleteLifecycleHook operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeleteLifecycleHook
     */
    @Override
    public DeleteLifecycleHookResult deleteLifecycleHook(DeleteLifecycleHookRequest deleteLifecycleHookRequest) {
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
     *        Contains the parameters for DeleteNotificationConfiguration.
     * @return Result of the DeleteNotificationConfiguration operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeleteNotificationConfiguration
     */
    @Override
    public DeleteNotificationConfigurationResult deleteNotificationConfiguration(DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest) {
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
     * Deletes the specified Auto Scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an
     * associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     *        Contains the parameters for DeletePolicy.
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeletePolicy
     */
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest) {
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
     *        Contains the parameters for DeleteScheduledAction.
     * @return Result of the DeleteScheduledAction operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeleteScheduledAction
     */
    @Override
    public DeleteScheduledActionResult deleteScheduledAction(DeleteScheduledActionRequest deleteScheduledActionRequest) {
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
     *        Contains the parameters for DeleteTags.
     * @return Result of the DeleteTags operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DeleteTags
     */
    @Override
    public DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest) {
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
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeAccountLimits
     */
    @Override
    public DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest) {
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
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeAdjustmentTypes
     */
    @Override
    public DescribeAdjustmentTypesResult describeAdjustmentTypes(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest) {
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
     *        Contains the parameters for DescribeAutoScalingGroups.
     * @return Result of the DescribeAutoScalingGroups operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingGroups
     */
    @Override
    public DescribeAutoScalingGroupsResult describeAutoScalingGroups(DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) {
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
     *        Contains the parameters for DescribeAutoScalingInstances.
     * @return Result of the DescribeAutoScalingInstances operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingInstances
     */
    @Override
    public DescribeAutoScalingInstancesResult describeAutoScalingInstances(DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) {
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
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return Result of the DescribeAutoScalingNotificationTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeAutoScalingNotificationTypes
     */
    @Override
    public DescribeAutoScalingNotificationTypesResult describeAutoScalingNotificationTypes(
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
     *        Contains the parameters for DescribeLaunchConfigurations.
     * @return Result of the DescribeLaunchConfigurations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeLaunchConfigurations
     */
    @Override
    public DescribeLaunchConfigurationsResult describeLaunchConfigurations(DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest) {
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
     * 
     * @param describeLifecycleHookTypesRequest
     * @return Result of the DescribeLifecycleHookTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHookTypes
     */
    @Override
    public DescribeLifecycleHookTypesResult describeLifecycleHookTypes(DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest) {
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
     *        Contains the parameters for DescribeLifecycleHooks.
     * @return Result of the DescribeLifecycleHooks operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeLifecycleHooks
     */
    @Override
    public DescribeLifecycleHooksResult describeLifecycleHooks(DescribeLifecycleHooksRequest describeLifecycleHooksRequest) {
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
     *        Contains the parameters for DescribeLoadBalancerTargetGroups.
     * @return Result of the DescribeLoadBalancerTargetGroups operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancerTargetGroups
     */
    @Override
    public DescribeLoadBalancerTargetGroupsResult describeLoadBalancerTargetGroups(
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
     * Note that this operation describes only Classic load balancers. If you have Application load balancers, use
     * <a>DescribeLoadBalancerTargetGroups</a> instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @return Result of the DescribeLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeLoadBalancers
     */
    @Override
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) {
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
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request
     * this metric when calling <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return Result of the DescribeMetricCollectionTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeMetricCollectionTypes
     */
    @Override
    public DescribeMetricCollectionTypesResult describeMetricCollectionTypes(DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest) {
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
     *        Contains the parameters for DescribeNotificationConfigurations.
     * @return Result of the DescribeNotificationConfigurations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeNotificationConfigurations
     */
    @Override
    public DescribeNotificationConfigurationsResult describeNotificationConfigurations(
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
     *        Contains the parameters for DescribePolicies.
     * @return Result of the DescribePolicies operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribePolicies
     */
    @Override
    public DescribePoliciesResult describePolicies(DescribePoliciesRequest describePoliciesRequest) {
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
     *        Contains the parameters for DescribeScalingActivities.
     * @return Result of the DescribeScalingActivities operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeScalingActivities
     */
    @Override
    public DescribeScalingActivitiesResult describeScalingActivities(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) {
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
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeScalingProcessTypes
     */
    @Override
    public DescribeScalingProcessTypesResult describeScalingProcessTypes(DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest) {
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
     *        Contains the parameters for DescribeScheduledActions.
     * @return Result of the DescribeScheduledActions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeScheduledActions
     */
    @Override
    public DescribeScheduledActionsResult describeScheduledActions(DescribeScheduledActionsRequest describeScheduledActionsRequest) {
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
     *        Contains the parameters for DescribeTags.
     * @return Result of the DescribeTags operation returned by the service.
     * @throws InvalidNextTokenException
     *         The <code>NextToken</code> value is not valid.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeTags
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) {
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
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return Result of the DescribeTerminationPolicyTypes operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DescribeTerminationPolicyTypes
     */
    @Override
    public DescribeTerminationPolicyTypesResult describeTerminationPolicyTypes(DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest) {
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
     * After the instances are detached, you can manage them independently from the rest of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Auto Scaling launches instances to replace
     * the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic load balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html">Detach EC2 Instances
     * from Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     *        Contains the parameters for DetachInstances.
     * @return Result of the DetachInstances operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DetachInstances
     */
    @Override
    public DetachInstancesResult detachInstances(DetachInstancesRequest detachInstancesRequest) {
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
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancerTargetGroups
     */
    @Override
    public DetachLoadBalancerTargetGroupsResult detachLoadBalancerTargetGroups(DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest) {
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
     * Detaches one or more Classic load balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that this operation detaches only Classic load balancers. If you have Application load balancers, use
     * <a>DetachLoadBalancerTargetGroups</a> instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. Note that the instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     *        Contains the parameters for DetachLoadBalancers.
     * @return Result of the DetachLoadBalancers operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DetachLoadBalancers
     */
    @Override
    public DetachLoadBalancersResult detachLoadBalancers(DetachLoadBalancersRequest detachLoadBalancersRequest) {
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
     *        Contains the parameters for DisableMetricsCollection.
     * @return Result of the DisableMetricsCollection operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.DisableMetricsCollection
     */
    @Override
    public DisableMetricsCollectionResult disableMetricsCollection(DisableMetricsCollectionRequest disableMetricsCollectionRequest) {
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
     * href="http://docs.aws.amazon.com/AutoScaling/latest/userguide/as-instance-monitoring.html">Monitoring Your Auto
     * Scaling Groups and Instances</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     *        Contains the parameters for EnableMetricsCollection.
     * @return Result of the EnableMetricsCollection operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.EnableMetricsCollection
     */
    @Override
    public EnableMetricsCollectionResult enableMetricsCollection(EnableMetricsCollectionRequest enableMetricsCollectionRequest) {
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
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     *        Contains the parameters for EnteStandby.
     * @return Result of the EnterStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.EnterStandby
     */
    @Override
    public EnterStandbyResult enterStandby(EnterStandbyRequest enterStandbyRequest) {
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
     *        Contains the parameters for ExecutePolicy.
     * @return Result of the ExecutePolicy operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.ExecutePolicy
     */
    @Override
    public ExecutePolicyResult executePolicy(ExecutePolicyRequest executePolicyRequest) {
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
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     *        Contains the parameters for ExitStandby.
     * @return Result of the ExitStandby operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.ExitStandby
     */
    @Override
    public ExitStandbyResult exitStandby(ExitStandbyRequest exitStandbyRequest) {
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
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an action on an instance that is not actively in
     * service; for example, either when the instance launches or before the instance terminates.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
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
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails. For information about updating this limit, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     *        Contains the parameters for PutLifecycleHook.
     * @return Result of the PutLifecycleHook operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.PutLifecycleHook
     */
    @Override
    public PutLifecycleHookResult putLifecycleHook(PutLifecycleHookRequest putLifecycleHookRequest) {
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
     * For more information see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html">Getting SNS
     * Notifications When Your Auto Scaling Group Scales</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     *        Contains the parameters for PutNotificationConfiguration.
     * @return Result of the PutNotificationConfiguration operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.PutNotificationConfiguration
     */
    @Override
    public PutNotificationConfigurationResult putNotificationConfiguration(PutNotificationConfigurationRequest putNotificationConfigurationRequest) {
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
     * and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy
     * is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For
     * information about updating this limit, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Contains the parameters for PutScalingPolicy.
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.PutScalingPolicy
     */
    @Override
    public PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest) {
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
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling
     * action, if you leave a parameter unspecified, the corresponding value remains unchanged in the affected Auto
     * Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html">Scheduled Scaling</a> in
     * the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     *        Contains the parameters for PutScheduledUpdateGroupAction.
     * @return Result of the PutScheduledUpdateGroupAction operation returned by the service.
     * @throws AlreadyExistsException
     *         You already have an Auto Scaling group or launch configuration with this name.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.PutScheduledUpdateGroupAction
     */
    @Override
    public PutScheduledUpdateGroupActionResult putScheduledUpdateGroupAction(PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest) {
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
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
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
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     *        Contains the parameters for RecordLifecycleActionHeartbeat.
     * @return Result of the RecordLifecycleActionHeartbeat operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.RecordLifecycleActionHeartbeat
     */
    @Override
    public RecordLifecycleActionHeartbeatResult recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest) {
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
     * Resumes the specified suspended Auto Scaling processes, or all suspended process, for the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html">Suspending and Resuming
     * Auto Scaling Processes</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     *        Contains the parameters for SuspendProcesses and ResumeProcesses.
     * @return Result of the ResumeProcesses operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.ResumeProcesses
     */
    @Override
    public ResumeProcessesResult resumeProcesses(ResumeProcessesRequest resumeProcessesRequest) {
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
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/WhatIsAutoScaling.html">What Is Auto
     * Scaling?</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     *        Contains the parameters for SetDesiredCapacity.
     * @return Result of the SetDesiredCapacity operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.SetDesiredCapacity
     */
    @Override
    public SetDesiredCapacityResult setDesiredCapacity(SetDesiredCapacityRequest setDesiredCapacityRequest) {
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
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health Checks</a> in the
     * <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     *        Contains the parameters for SetInstanceHealth.
     * @return Result of the SetInstanceHealth operation returned by the service.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.SetInstanceHealth
     */
    @Override
    public SetInstanceHealthResult setInstanceHealth(SetInstanceHealthRequest setInstanceHealthRequest) {
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
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html#instance-protection"
     * >Instance Protection</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     *        Contains the parameters for SetInstanceProtection.
     * @return Result of the SetInstanceProtection operation returned by the service.
     * @throws LimitExceededException
     *         You have already reached a limit for your Auto Scaling resources (for example, groups, launch
     *         configurations, or lifecycle hooks). For more information, see <a>DescribeAccountLimits</a>.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.SetInstanceProtection
     */
    @Override
    public SetInstanceProtectionResult setInstanceProtection(SetInstanceProtectionRequest setInstanceProtectionRequest) {
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
     * Suspends the specified Auto Scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent
     * other process types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html">Suspending and Resuming
     * Auto Scaling Processes</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     *        Contains the parameters for SuspendProcesses and ResumeProcesses.
     * @return Result of the SuspendProcesses operation returned by the service.
     * @throws ResourceInUseException
     *         The operation can't be performed because the resource is in use.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.SuspendProcesses
     */
    @Override
    public SuspendProcessesResult suspendProcesses(SuspendProcessesRequest suspendProcessesRequest) {
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
     *        Contains the parameters for TerminateInstanceInAutoScalingGroup.
     * @return Result of the TerminateInstanceInAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.TerminateInstanceInAutoScalingGroup
     */
    @Override
    public TerminateInstanceInAutoScalingGroupResult terminateInstanceInAutoScalingGroup(
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
     * To update an Auto Scaling group with a launch configuration with <code>InstanceMonitoring</code> set to
     * <code>False</code>, you must first disable the collection of group metrics. Otherwise, you will get an error. If
     * you have previously enabled the collection of group metrics, you can disable it using
     * <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any launch configuration settings take effect
     * on any triggers after this call returns. Scaling activities that are currently in progress aren't affected.
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
     *        Contains the parameters for UpdateAutoScalingGroup.
     * @return Result of the UpdateAutoScalingGroup operation returned by the service.
     * @throws ScalingActivityInProgressException
     *         The operation can't be performed because there are scaling activities in progress.
     * @throws ResourceContentionException
     *         You already have a pending update to an Auto Scaling resource (for example, a group, instance, or load
     *         balancer).
     * @sample AmazonAutoScaling.UpdateAutoScalingGroup
     */
    @Override
    public UpdateAutoScalingGroupResult updateAutoScalingGroup(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest) {
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

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

}

/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.cloudformation;

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
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.model.transform.*;

/**
 * Client for accessing AWS CloudFormation. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation enables you to create and manage AWS infrastructure
 * deployments predictably and repeatedly. AWS CloudFormation helps you leverage
 * AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and Auto Scaling to
 * build highly-reliable, highly scalable, cost effective applications without
 * worrying about creating and configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies
 * in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/cloudformation/">CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional
 * technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="http://aws.amazon.com/documentation/"
 * >http://aws.amazon.com/documentation/</a>.
 * </p>
 */
public class AmazonCloudFormationClient extends AmazonWebServiceClient
        implements AmazonCloudFormation {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonCloudFormation.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudformation";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "cloudformation";

    /**
     * List of exception unmarshallers for all AWS CloudFormation exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudFormationClient() {
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation.
     * A credentials provider chain will be used that searches for credentials
     * in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS CloudFormation (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudFormationClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonCloudFormationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS CloudFormation (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonCloudFormationClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonCloudFormationClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS CloudFormation (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonCloudFormationClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS CloudFormation
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to AWS CloudFormation (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonCloudFormationClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers
                .add(new InsufficientCapabilitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("https://cloudformation.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/cloudformation/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/cloudformation/request.handler2s"));
    }

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the previous
     * stack configuration.
     * </p>
     * <note>You can cancel only stacks that are in the UPDATE_IN_PROGRESS
     * state.</note>
     * 
     * @param cancelUpdateStackRequest
     *        The input for the <a>CancelUpdateStack</a> action.
     * @sample AmazonCloudFormation.CancelUpdateStack
     */
    @Override
    public void cancelUpdateStack(
            CancelUpdateStackRequest cancelUpdateStackRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelUpdateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelUpdateStackRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelUpdateStackRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(cancelUpdateStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> API.
     * </p>
     * 
     * @param createStackRequest
     *        The input for <a>CreateStack</a> action.
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         Quota for the resource has already been reached.
     * @throws AlreadyExistsException
     *         Resource with the name requested already exists.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that were not
     *         specified in the Capabilities parameter.
     * @sample AmazonCloudFormation.CreateStack
     */
    @Override
    public CreateStackResult createStack(CreateStackRequest createStackRequest) {
        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStackRequestMarshaller().marshall(super
                        .beforeMarshalling(createStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<CreateStackResult> responseHandler = new StaxResponseHandler<CreateStackResult>(
                    new CreateStackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the
     * <a>DescribeStacks</a> API if the deletion has been completed
     * successfully.
     * </p>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @sample AmazonCloudFormation.DeleteStack
     */
    @Override
    public void deleteStack(DeleteStackRequest deleteStackRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStackRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStackRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum
     * number of stacks that you can create in your account.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @return Result of the DescribeAccountLimits operation returned by the
     *         service.
     * @sample AmazonCloudFormation.DescribeAccountLimits
     */
    @Override
    public DescribeAccountLimitsResult describeAccountLimits(
            DescribeAccountLimitsRequest describeAccountLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAccountLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountLimitsRequest> request = null;
        Response<DescribeAccountLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountLimitsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAccountLimitsRequest));
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

    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"
     * >Stacks</a> in the AWS CloudFormation User Guide.
     * </p>
     * <note>You can list events for stacks that have failed to create or have
     * been deleted by specifying the unique stack identifier (stack ID).</note>
     * 
     * @param describeStackEventsRequest
     *        The input for <a>DescribeStackEvents</a> action.
     * @return Result of the DescribeStackEvents operation returned by the
     *         service.
     * @sample AmazonCloudFormation.DescribeStackEvents
     */
    @Override
    public DescribeStackEventsResult describeStackEvents(
            DescribeStackEventsRequest describeStackEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackEventsRequest> request = null;
        Response<DescribeStackEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackEventsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeStackEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     * 
     * @param describeStackResourceRequest
     *        The input for <a>DescribeStackResource</a> action.
     * @return Result of the DescribeStackResource operation returned by the
     *         service.
     * @sample AmazonCloudFormation.DescribeStackResource
     */
    @Override
    public DescribeStackResourceResult describeStackResource(
            DescribeStackResourceRequest describeStackResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourceRequest> request = null;
        Response<DescribeStackResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeStackResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code> is
     * specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <note>Only the first 100 resources will be returned. If your stack has
     * more resources than this, you should use <code>ListStackResources</code>
     * instead.</note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code>, but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result. For
     * more information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code>, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.
     * </p>
     * <note>A <code>ValidationError</code> is returned if you specify both
     * <code>StackName</code> and <code>PhysicalResourceId</code> in the same
     * request.</note>
     * 
     * @param describeStackResourcesRequest
     *        The input for <a>DescribeStackResources</a> action.
     * @return Result of the DescribeStackResources operation returned by the
     *         service.
     * @sample AmazonCloudFormation.DescribeStackResources
     */
    @Override
    public DescribeStackResourcesResult describeStackResources(
            DescribeStackResourcesRequest describeStackResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStackResourcesRequest> request = null;
        Response<DescribeStackResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStackResourcesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeStackResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     * 
     * @param describeStacksRequest
     *        The input for <a>DescribeStacks</a> action.
     * @return Result of the DescribeStacks operation returned by the service.
     * @sample AmazonCloudFormation.DescribeStacks
     */
    @Override
    public DescribeStacksResult describeStacks(
            DescribeStacksRequest describeStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStacksRequestMarshaller().marshall(super
                        .beforeMarshalling(describeStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns the estimated monthly cost of a template. The return value is an
     * AWS Simple Monthly Calculator URL with a query string that describes the
     * resources required to run the template.
     * </p>
     * 
     * @param estimateTemplateCostRequest
     * @return Result of the EstimateTemplateCost operation returned by the
     *         service.
     * @sample AmazonCloudFormation.EstimateTemplateCost
     */
    @Override
    public EstimateTemplateCostResult estimateTemplateCost(
            EstimateTemplateCostRequest estimateTemplateCostRequest) {
        ExecutionContext executionContext = createExecutionContext(estimateTemplateCostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EstimateTemplateCostRequest> request = null;
        Response<EstimateTemplateCostResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EstimateTemplateCostRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(estimateTemplateCostRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns the stack policy for a specified stack. If a stack doesn't have a
     * policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @return Result of the GetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormation.GetStackPolicy
     */
    @Override
    public GetStackPolicyResult getStackPolicy(
            GetStackPolicyRequest getStackPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStackPolicyRequest> request = null;
        Response<GetStackPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStackPolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(getStackPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns the template body for a specified stack. You can get the template
     * for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <note> If the template does not exist, a <code>ValidationError</code> is
     * returned. </note>
     * 
     * @param getTemplateRequest
     *        The input for a <a>GetTemplate</a> action.
     * @return Result of the GetTemplate operation returned by the service.
     * @sample AmazonCloudFormation.GetTemplate
     */
    @Override
    public GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateRequestMarshaller().marshall(super
                        .beforeMarshalling(getTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<GetTemplateResult> responseHandler = new StaxResponseHandler<GetTemplateResult>(
                    new GetTemplateResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types, before
     * you create or update a stack.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a
     * template, or you can get template information for a running or deleted
     * stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template
     * information for up to 90 days after the stack has been deleted. If the
     * template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @return Result of the GetTemplateSummary operation returned by the
     *         service.
     * @sample AmazonCloudFormation.GetTemplateSummary
     */
    @Override
    public GetTemplateSummaryResult getTemplateSummary(
            GetTemplateSummaryRequest getTemplateSummaryRequest) {
        ExecutionContext executionContext = createExecutionContext(getTemplateSummaryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTemplateSummaryRequest> request = null;
        Response<GetTemplateSummaryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTemplateSummaryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getTemplateSummaryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for
     * up to 90 days after the stack has been deleted.
     * </p>
     * 
     * @param listStackResourcesRequest
     *        The input for the <a>ListStackResource</a> action.
     * @return Result of the ListStackResources operation returned by the
     *         service.
     * @sample AmazonCloudFormation.ListStackResources
     */
    @Override
    public ListStackResourcesResult listStackResources(
            ListStackResourcesRequest listStackResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(listStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStackResourcesRequest> request = null;
        Response<ListStackResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStackResourcesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listStackResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been deleted).
     * </p>
     * 
     * @param listStacksRequest
     *        The input for <a>ListStacks</a> action.
     * @return Result of the ListStacks operation returned by the service.
     * @sample AmazonCloudFormation.ListStacks
     */
    @Override
    public ListStacksResult listStacks(ListStacksRequest listStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(listStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStacksRequest> request = null;
        Response<ListStacksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStacksRequestMarshaller().marshall(super
                        .beforeMarshalling(listStacksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<ListStacksResult> responseHandler = new StaxResponseHandler<ListStacksResult>(
                    new ListStacksResultStaxUnmarshaller());
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
     * @sample AmazonCloudFormation.SetStackPolicy
     */
    @Override
    public void setStackPolicy(SetStackPolicyRequest setStackPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(setStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetStackPolicyRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetStackPolicyRequestMarshaller().marshall(super
                        .beforeMarshalling(setStackPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a creation
     * policy or update policy. AWS CloudFormation doesn't proceed with a stack
     * creation or update until resources receive the required number of signals
     * or the timeout period is exceeded. The SignalResource API is useful in
     * cases where you want to send signals from anywhere other than an Amazon
     * EC2 instance.
     * </p>
     * 
     * @param signalResourceRequest
     *        The input for the <a>SignalResource</a> action.
     * @sample AmazonCloudFormation.SignalResource
     */
    @Override
    public void signalResource(SignalResourceRequest signalResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(signalResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SignalResourceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SignalResourceRequestMarshaller().marshall(super
                        .beforeMarshalling(signalResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<Void> responseHandler = new StaxResponseHandler<Void>(
                    null);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * <a>GetTemplate</a> action.
     * </p>
     * <p>
     * Tags that were associated with this stack during creation time will still
     * be associated with the stack after an <code>UpdateStack</code> operation.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack,
     * and monitoring the progress of the update, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"
     * >Updating a Stack</a>.
     * </p>
     * 
     * @param updateStackRequest
     *        The input for <a>UpdateStack</a> action.
     * @return Result of the UpdateStack operation returned by the service.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that were not
     *         specified in the Capabilities parameter.
     * @sample AmazonCloudFormation.UpdateStack
     */
    @Override
    public UpdateStackResult updateStack(UpdateStackRequest updateStackRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStackRequest> request = null;
        Response<UpdateStackResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStackRequestMarshaller().marshall(super
                        .beforeMarshalling(updateStackRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            StaxResponseHandler<UpdateStackResult> responseHandler = new StaxResponseHandler<UpdateStackResult>(
                    new UpdateStackResultStaxUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates a specified template.
     * </p>
     * 
     * @param validateTemplateRequest
     *        The input for <a>ValidateTemplate</a> action.
     * @return Result of the ValidateTemplate operation returned by the service.
     * @sample AmazonCloudFormation.ValidateTemplate
     */
    @Override
    public ValidateTemplateResult validateTemplate(
            ValidateTemplateRequest validateTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(validateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidateTemplateRequest> request = null;
        Response<ValidateTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidateTemplateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(validateTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        DefaultErrorResponseHandler errorResponseHandler = new DefaultErrorResponseHandler(
                exceptionUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}

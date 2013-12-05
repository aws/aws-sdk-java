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
package com.amazonaws.services.cloudformation;

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

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.model.transform.*;


/**
 * Client for accessing AmazonCloudFormation.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS CloudFormation <p>
 * AWS CloudFormation enables you to create and manage AWS infrastructure deployments predictably and repeatedly. AWS CloudFormation helps you leverage
 * AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and Auto Scaling to build highly-reliable, highly scalable, cost effective applications without
 * worrying about creating and configuring the underlying the AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/cloudformation/"> CloudFormation Product Page </a> .
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific AWS product, you can find the
 * product's technical documentation at <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>You must call the AWS CloudFormation API as a regular IAM user. AWS CloudFormation does not support calling the API with an IAM role
 * </p>
 */
public class AmazonCloudFormationClient extends AmazonWebServiceClient implements AmazonCloudFormation {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    /**
     * List of exception unmarshallers for all AmazonCloudFormation exceptions.
     */
    protected final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers
            = new ArrayList<Unmarshaller<AmazonServiceException, Node>>();

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation.  A credentials provider chain will be used
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
    public AmazonCloudFormationClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation.  A credentials provider chain will be used
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
     *                       client connects to AmazonCloudFormation
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonCloudFormationClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonCloudFormationClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonCloudFormation
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudFormationClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonCloudFormation using the specified AWS account credentials
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
     *                       client connects to AmazonCloudFormation
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonCloudFormationClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        exceptionUnmarshallers.add(new AlreadyExistsExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InsufficientCapabilitiesExceptionUnmarshaller());
        exceptionUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("cloudformation.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudformation/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/cloudformation/request.handler2s"));
    }

    
    /**
     * <p>
     * Validates a specified template.
     * </p>
     *
     * @param validateTemplateRequest Container for the necessary parameters
     *           to execute the ValidateTemplate service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the ValidateTemplate service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest validateTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(validateTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ValidateTemplateRequest> request = null;
        Response<ValidateTemplateResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ValidateTemplateRequestMarshaller().marshall(validateTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ValidateTemplateResultStaxUnmarshaller(), executionContext);
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
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks service method on AmazonCloudFormation.
     * 
     * @return The response from the DescribeStacks service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeStacksRequest> request = null;
        Response<DescribeStacksResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeStacksRequestMarshaller().marshall(describeStacksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStacksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the template body for a specified stack. You can get the
     * template for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> If the template does not exist, a ValidationError is
     * returned.
     * </p>
     *
     * @param getTemplateRequest Container for the necessary parameters to
     *           execute the GetTemplate service method on AmazonCloudFormation.
     * 
     * @return The response from the GetTemplate service method, as returned
     *         by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(getTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetTemplateRequest> request = null;
        Response<GetTemplateResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetTemplateRequestMarshaller().marshall(getTemplateRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetTemplateResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't
     * have a policy, a null value is returned.
     * </p>
     *
     * @param getStackPolicyRequest Container for the necessary parameters to
     *           execute the GetStackPolicy service method on AmazonCloudFormation.
     * 
     * @return The response from the GetStackPolicy service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStackPolicyResult getStackPolicy(GetStackPolicyRequest getStackPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(getStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<GetStackPolicyRequest> request = null;
        Response<GetStackPolicyResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new GetStackPolicyRequestMarshaller().marshall(getStackPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new GetStackPolicyResultStaxUnmarshaller(), executionContext);
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
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     *
     * @param listStacksRequest Container for the necessary parameters to
     *           execute the ListStacks service method on AmazonCloudFormation.
     * 
     * @return The response from the ListStacks service method, as returned
     *         by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStacksResult listStacks(ListStacksRequest listStacksRequest) {
        ExecutionContext executionContext = createExecutionContext(listStacksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListStacksRequest> request = null;
        Response<ListStacksResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListStacksRequestMarshaller().marshall(listStacksRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStacksResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of
     * the stack via the DescribeStacks API.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account
     * per region.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack service method on AmazonCloudFormation.
     * 
     * @return The response from the CreateStack service method, as returned
     *         by AmazonCloudFormation.
     * 
     * @throws AlreadyExistsException
     * @throws LimitExceededException
     * @throws InsufficientCapabilitiesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStackResult createStack(CreateStackRequest createStackRequest) {
        ExecutionContext executionContext = createExecutionContext(createStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CreateStackRequest> request = null;
        Response<CreateStackResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CreateStackRequestMarshaller().marshall(createStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new CreateStackResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     *
     * @param setStackPolicyRequest Container for the necessary parameters to
     *           execute the SetStackPolicy service method on AmazonCloudFormation.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setStackPolicy(SetStackPolicyRequest setStackPolicyRequest) {
        ExecutionContext executionContext = createExecutionContext(setStackPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<SetStackPolicyRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new SetStackPolicyRequestMarshaller().marshall(setStackPolicyRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     *
     * @param estimateTemplateCostRequest Container for the necessary
     *           parameters to execute the EstimateTemplateCost service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the EstimateTemplateCost service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest estimateTemplateCostRequest) {
        ExecutionContext executionContext = createExecutionContext(estimateTemplateCostRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<EstimateTemplateCostRequest> request = null;
        Response<EstimateTemplateCostResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new EstimateTemplateCostRequestMarshaller().marshall(estimateTemplateCostRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new EstimateTemplateCostResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     *
     * @param describeStackEventsRequest Container for the necessary
     *           parameters to execute the DescribeStackEvents service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the DescribeStackEvents service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest describeStackEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeStackEventsRequest> request = null;
        Response<DescribeStackEventsResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeStackEventsRequestMarshaller().marshall(describeStackEventsRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackEventsResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns a description of the specified resource in the specified
     * stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param describeStackResourceRequest Container for the necessary
     *           parameters to execute the DescribeStackResource service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the DescribeStackResource service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackResourceResult describeStackResource(DescribeStackResourceRequest describeStackResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeStackResourceRequest> request = null;
        Response<DescribeStackResourceResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeStackResourceRequestMarshaller().marshall(describeStackResourceRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackResourceResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack will roll back the update and revert to the
     * previous stack configuration.
     * </p>
     * <p>
     * <b>NOTE:</b>Only stacks that are in the UPDATE_IN_PROGRESS state can
     * be canceled.
     * </p>
     *
     * @param cancelUpdateStackRequest Container for the necessary parameters
     *           to execute the CancelUpdateStack service method on
     *           AmazonCloudFormation.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelUpdateStack(CancelUpdateStackRequest cancelUpdateStackRequest) {
        ExecutionContext executionContext = createExecutionContext(cancelUpdateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<CancelUpdateStackRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new CancelUpdateStackRequestMarshaller().marshall(cancelUpdateStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the DescribeStacks action.
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>Note: </b> You cannot update <a
     * com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html">
     * AWS::S3::Bucket </a> resources, for example, to add or modify tags.
     * </p>
     * <p>
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
     * </p>
     * <p>
     * Tags that were associated with this stack during creation time will
     * still be associated with the stack after an <code>UpdateStack</code>
     * operation.
     * </p>
     * <p>
     * For more information about creating an update template, updating a
     * stack, and monitoring the progress of the update, see <a
     * om/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">
     * Updating a Stack </a> .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack service method on AmazonCloudFormation.
     * 
     * @return The response from the UpdateStack service method, as returned
     *         by AmazonCloudFormation.
     * 
     * @throws InsufficientCapabilitiesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStackResult updateStack(UpdateStackRequest updateStackRequest) {
        ExecutionContext executionContext = createExecutionContext(updateStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<UpdateStackRequest> request = null;
        Response<UpdateStackResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new UpdateStackRequestMarshaller().marshall(updateStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new UpdateStackResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <p>
     * <b>NOTE:</b>Only the first 100 resources will be returned. If your
     * stack has more resources than this, you should use ListStackResources
     * instead.
     * </p>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns
     * resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     *
     * @param describeStackResourcesRequest Container for the necessary
     *           parameters to execute the DescribeStackResources service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the DescribeStackResources service method,
     *         as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest describeStackResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DescribeStackResourcesRequest> request = null;
        Response<DescribeStackResourcesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DescribeStackResourcesRequestMarshaller().marshall(describeStackResourcesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new DescribeStackResourcesResultStaxUnmarshaller(), executionContext);
            return response.getAwsResponse();
        } finally {
            endClientExecution(awsRequestMetrics, request, response);
        }
    }
    
    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the DescribeStacks
     * API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AmazonCloudFormation.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteStackRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<DeleteStackRequest> request = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new DeleteStackRequestMarshaller().marshall(deleteStackRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            invoke(request, null, executionContext);
        } finally {
            endClientExecution(awsRequestMetrics, request, null);
        }
    }
    
    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     *
     * @param listStackResourcesRequest Container for the necessary
     *           parameters to execute the ListStackResources service method on
     *           AmazonCloudFormation.
     * 
     * @return The response from the ListStackResources service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStackResourcesResult listStackResources(ListStackResourcesRequest listStackResourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(listStackResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        Request<ListStackResourcesRequest> request = null;
        Response<ListStackResourcesResult> response = null;
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        try {
            request = new ListStackResourcesRequestMarshaller().marshall(listStackResourcesRequest);
            // Binds the request metrics to the current request.
            request.setAWSRequestMetrics(awsRequestMetrics);
            response = invoke(request, new ListStackResourcesResultStaxUnmarshaller(), executionContext);
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
     * @return The response from the DescribeStacks service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks() throws AmazonServiceException, AmazonClientException {
        return describeStacks(new DescribeStacksRequest());
    }
    
    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been
     * deleted).
     * </p>
     * 
     * @return The response from the ListStacks service method, as returned
     *         by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStacksResult listStacks() throws AmazonServiceException, AmazonClientException {
        return listStacks(new ListStacksRequest());
    }
    
    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simple Monthly Calculator URL with a query string that
     * describes the resources required to run the template.
     * </p>
     * 
     * @return The response from the EstimateTemplateCost service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EstimateTemplateCostResult estimateTemplateCost() throws AmazonServiceException, AmazonClientException {
        return estimateTemplateCost(new EstimateTemplateCostRequest());
    }
    
    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>Events are returned, even if the stack never existed or
     * has been successfully deleted.
     * </p>
     * 
     * @return The response from the DescribeStackEvents service method, as
     *         returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackEventsResult describeStackEvents() throws AmazonServiceException, AmazonClientException {
        return describeStackEvents(new DescribeStackEventsRequest());
    }
    
    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <p>
     * <b>NOTE:</b>Only the first 100 resources will be returned. If your
     * stack has more resources than this, you should use ListStackResources
     * instead.
     * </p>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns
     * resource information for up to 90 days after the stack has been
     * deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b>A ValidationError is returned if you specify both
     * StackName and PhysicalResourceId in the same request.
     * </p>
     * 
     * @return The response from the DescribeStackResources service method,
     *         as returned by AmazonCloudFormation.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackResourcesResult describeStackResources() throws AmazonServiceException, AmazonClientException {
        return describeStackResources(new DescribeStackResourcesRequest());
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
        
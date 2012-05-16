/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.model.transform.*;


/**
 * Client for accessing AmazonCloudFormation.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * AWS CloudFormation <p>
 * This is the AWS CloudFormation API Reference. The major sections of this guide are described in the following table.
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/APIReference/API_Operations.html"> Actions </a> : Alphabetical list of
 * CloudFormation actions</li>
 * <li> <a href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/APIReference/API_Types.html"> Data Types </a> : Alphabetical list of
 * CloudFormation data types</li>
 * <li> <a href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/APIReference/CommonParameters.html"> Common Parameters </a> : Parameters
 * that all Query actions can use</li>
 * <li> <a href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/APIReference/CommonErrors.html"> Common Errors </a> : Client and server
 * errors that all actions can return</li>
 * 
 * </ul>
 * <p>
 * This guide is for programmers who need detailed information about the CloudFormation APIs. You use AWS CloudFormation to create and manage AWS
 * infrastructure deployments predictably and repeatedly. CloudFormation helps you leverage AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and
 * Auto Scaling to build highly-reliable, highly scalable, cost effective applications without worrying about creating and configuring the underlying the
 * AWS infrastructure.
 * </p>
 * <p>
 * Through the use of a template file you write, and a few AWS CloudFormation commands or API actions, AWS CloudFormation enables you to manage a
 * collection of resources together as a single unit called a stack. AWS CloudFormation creates and deletes all member resources of the stack together
 * and manages all dependencies between the resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/cloudformation/"> CloudFormation Product Page </a> .
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional technical information about a specific AWS product, you can find the
 * product's technical documentation at <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a> .
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
    
    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


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
        setEndpoint("cloudformation.us-east-1.amazonaws.com");

        signer = new AWS4Signer();
        
        signer.setServiceName("cloudformation");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/cloudformation/request.handlers"));
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
    public ListStacksResult listStacks(ListStacksRequest listStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListStacksRequest> request = new ListStacksRequestMarshaller().marshall(listStacksRequest);
        return invoke(request, new ListStacksResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Creates a stack as specified in the template. After the call
     * completes successfully, the stack creation starts. You can check the
     * status of the stack via the DescribeStacks API.
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
    public CreateStackResult createStack(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<CreateStackRequest> request = new CreateStackRequestMarshaller().marshall(createStackRequest);
        return invoke(request, new CreateStackResultStaxUnmarshaller());
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
    public ValidateTemplateResult validateTemplate(ValidateTemplateRequest validateTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ValidateTemplateRequest> request = new ValidateTemplateRequestMarshaller().marshall(validateTemplateRequest);
        return invoke(request, new ValidateTemplateResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is
     * an AWS Simply Monthly Calculator URL with a query string that
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
    public EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest estimateTemplateCostRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<EstimateTemplateCostRequest> request = new EstimateTemplateCostRequestMarshaller().marshall(estimateTemplateCostRequest);
        return invoke(request, new EstimateTemplateCostResultStaxUnmarshaller());
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
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStacksRequest> request = new DescribeStacksRequestMarshaller().marshall(describeStacksRequest);
        return invoke(request, new DescribeStacksResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns all the stack related events for the AWS account. If
     * <code>StackName</code> is specified, returns events related to all the
     * stacks with the given name. If <code>StackName</code> is not
     * specified, returns all the events for the account. For more
     * information about a stack's event history, go to the <a
     * http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">
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
    public DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest describeStackEventsRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStackEventsRequest> request = new DescribeStackEventsRequestMarshaller().marshall(describeStackEventsRequest);
        return invoke(request, new DescribeStackEventsResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns the template body for a specified stack name. You can get the
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
    public GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<GetTemplateRequest> request = new GetTemplateRequestMarshaller().marshall(getTemplateRequest);
        return invoke(request, new GetTemplateResultStaxUnmarshaller());
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
    public DescribeStackResourceResult describeStackResource(DescribeStackResourceRequest describeStackResourceRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStackResourceRequest> request = new DescribeStackResourceRequestMarshaller().marshall(describeStackResourceRequest);
        return invoke(request, new DescribeStackResourceResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully,
     * stack deletion starts. Deleted stacks do not show up in the
     * DescribeStacks API if the deletion has been completed successfully.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AmazonCloudFormation.
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
    public void deleteStack(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DeleteStackRequest> request = new DeleteStackRequestMarshaller().marshall(deleteStackRequest);
        invoke(request, null);
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
    public ListStackResourcesResult listStackResources(ListStackResourcesRequest listStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<ListStackResourcesRequest> request = new ListStackResourcesRequestMarshaller().marshall(listStackResourcesRequest);
        return invoke(request, new ListStackResourcesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code>
     * is specified, all the associated resources of the stack the resource
     * belongs to are returned.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResources returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify <code>StackName</code> or
     * <code>PhysicalResourceId.</code> In addition, you can specify
     * <code>LogicalResourceId</code> to filter the returned result. For more
     * information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code> , go to the <a
     * http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b> A ValidationError is returned if you specify both
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
    public DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest describeStackResourcesRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<DescribeStackResourcesRequest> request = new DescribeStackResourcesRequestMarshaller().marshall(describeStackResourcesRequest);
        return invoke(request, new DescribeStackResourcesResultStaxUnmarshaller());
    }
    
    /**
     * <p>
     * Updates a stack as specified in the template. After the call
     * completes successfully, the stack update starts. You can check the
     * status of the stack via the DescribeStacks action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * GetTemplate action.
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
    public UpdateStackResult updateStack(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException {
        Request<UpdateStackRequest> request = new UpdateStackRequestMarshaller().marshall(updateStackRequest);
        return invoke(request, new UpdateStackResultStaxUnmarshaller());
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
     * an AWS Simply Monthly Calculator URL with a query string that
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
     * Returns all the stack related events for the AWS account. If
     * <code>StackName</code> is specified, returns events related to all the
     * stacks with the given name. If <code>StackName</code> is not
     * specified, returns all the events for the account. For more
     * information about a stack's event history, go to the <a
     * http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">
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
     * is specified, all the associated resources of the stack the resource
     * belongs to are returned.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResources returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify <code>StackName</code> or
     * <code>PhysicalResourceId.</code> In addition, you can specify
     * <code>LogicalResourceId</code> to filter the returned result. For more
     * information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code> , go to the <a
     * http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">
     * AWS CloudFormation User Guide </a> .
     * </p>
     * <p>
     * <b>NOTE:</b> A ValidationError is returned if you specify both
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
     * Overrides the default endpoint for this client and explicitly provides 
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.   
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: 
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * 
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName 
     *            The name of the AWS service to use when signing requests.
     * @param regionId 
     *            The ID of the region in which this service resides.
     *      
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
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
        
        return (X)client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }
}
        
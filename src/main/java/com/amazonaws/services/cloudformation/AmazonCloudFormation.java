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

import com.amazonaws.*;
import com.amazonaws.services.cloudformation.model.*;


/**
 * Interface for accessing AmazonCloudFormation.
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
 */
public interface AmazonCloudFormation {

    /**
     * Overrides the default endpoint for this client ("https://cloudformation.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudformation.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://cloudformation.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "cloudformation.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://cloudformation.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
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
            throws AmazonServiceException, AmazonClientException;

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
    public CreateStackResult createStack(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
    public EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest estimateTemplateCostRequest) 
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFormation indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException;

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
            throws AmazonServiceException, AmazonClientException;

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
     * If you do not provide either a stack or resource id, information for
     * all stacks and resources will be returned, up to a limit of 100
     * records.
     * </p>
     * <p>
     * <b>NOTE:</b> To list more than 100 resources use ListStackResources
     * instead.
     * </p>
     * <p>
     * You can specify either <code>StackName</code> or
     * <code>PhysicalResourceId.</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the <a
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
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the DescribeStacks action.
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
    public UpdateStackResult updateStack(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public ListStacksResult listStacks() throws AmazonServiceException, AmazonClientException;
    
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
    public EstimateTemplateCostResult estimateTemplateCost() throws AmazonServiceException, AmazonClientException;
    
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
    public DescribeStacksResult describeStacks() throws AmazonServiceException, AmazonClientException;
    
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
    public DescribeStackEventsResult describeStackEvents() throws AmazonServiceException, AmazonClientException;
    
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
     * If you do not provide either a stack or resource id, information for
     * all stacks and resources will be returned, up to a limit of 100
     * records.
     * </p>
     * <p>
     * <b>NOTE:</b> To list more than 100 resources use ListStackResources
     * instead.
     * </p>
     * <p>
     * You can specify either <code>StackName</code> or
     * <code>PhysicalResourceId.</code> , but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result.
     * For more information about resources, the
     * <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> ,
     * go to the <a
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
    public DescribeStackResourcesResult describeStackResources() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        
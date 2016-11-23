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
package com.amazonaws.services.cloudformation;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.services.cloudformation.waiters.AmazonCloudFormationWaiters;

/**
 * Interface for accessing AWS CloudFormation.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudformation.AbstractAmazonCloudFormation} instead.
 * </p>
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
 * href="http://docs.aws.amazon.com/http:/docs.aws.amazon.com/">http://docs.aws.amazon.com/</a>.
 * </p>
 */
public interface AmazonCloudFormation {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudformation";

    /**
     * Overrides the default endpoint for this client ("https://cloudformation.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudformation.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://cloudformation.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "cloudformation.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://cloudformation.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudFormation#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @sample AmazonCloudFormation.CancelUpdateStack
     */
    CancelUpdateStackResult cancelUpdateStack(CancelUpdateStackRequest cancelUpdateStackRequest);

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code> state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of the failure, you can manually <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     * @sample AmazonCloudFormation.ContinueUpdateRollback
     */
    ContinueUpdateRollbackResult continueUpdateRollback(ContinueUpdateRollbackRequest continueUpdateRollbackRequest);

    /**
     * <p>
     * Creates a list of changes for a stack. AWS CloudFormation generates the change set by comparing the template's
     * information with the information that you submit. A change set can help you understand which resources AWS
     * CloudFormation will change, and how it will change them, before you update your stack. Change sets allow you to
     * check before making a change to avoid deleting or replacing critical resources.
     * </p>
     * <p>
     * AWS CloudFormation doesn't make any changes to the stack when you create a change set. To make the specified
     * changes, you must execute the change set by using the <a>ExecuteChangeSet</a> action.
     * </p>
     * <p>
     * After the call successfully completes, AWS CloudFormation starts creating the change set. To check the status of
     * the change set, use the <a>DescribeChangeSet</a> action.
     * </p>
     * 
     * @param createChangeSetRequest
     *        The input for the <a>CreateChangeSet</a> action.
     * @return Result of the CreateChangeSet operation returned by the service.
     * @throws AlreadyExistsException
     *         Resource with the name requested already exists.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that were not specified in the Capabilities parameter.
     * @throws LimitExceededException
     *         Quota for the resource has already been reached.
     * @sample AmazonCloudFormation.CreateChangeSet
     */
    CreateChangeSetResult createChangeSet(CreateChangeSetRequest createChangeSetRequest);

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
     *         Quota for the resource has already been reached.
     * @throws AlreadyExistsException
     *         Resource with the name requested already exists.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that were not specified in the Capabilities parameter.
     * @sample AmazonCloudFormation.CreateStack
     */
    CreateStackResult createStack(CreateStackRequest createStackRequest);

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
     *         The specified change set cannot be used to update the stack. For example, the change set status might be
     *         <code>CREATE_IN_PROGRESS</code> or the stack status might be <code>UPDATE_IN_PROGRESS</code>.
     * @sample AmazonCloudFormation.DeleteChangeSet
     */
    DeleteChangeSetResult deleteChangeSet(DeleteChangeSetRequest deleteChangeSetRequest);

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not
     * show up in the <a>DescribeStacks</a> API if the deletion has been completed successfully.
     * </p>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @return Result of the DeleteStack operation returned by the service.
     * @sample AmazonCloudFormation.DeleteStack
     */
    DeleteStackResult deleteStack(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in
     * your account.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @return Result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonCloudFormation.DescribeAccountLimits
     */
    DescribeAccountLimitsResult describeAccountLimits(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the
     * change set. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
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
     */
    DescribeChangeSetResult describeChangeSet(DescribeChangeSetRequest describeChangeSetRequest);

    /**
     * <p>
     * Returns all stack related events for a specified stack in reverse chronological order. For more information about
     * a stack's event history, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html">Stacks</a> in the AWS
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
     */
    DescribeStackEventsResult describeStackEvents(DescribeStackEventsRequest describeStackEventsRequest);

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
     */
    DescribeStackResourceResult describeStackResource(DescribeStackResourceRequest describeStackResourceRequest);

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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/">AWS CloudFormation User Guide</a>.
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
     */
    DescribeStackResourcesResult describeStackResources(DescribeStackResourcesRequest describeStackResourcesRequest);

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
     */
    DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest);

    /**
     * Simplified method form for invoking the DescribeStacks operation.
     *
     * @see #describeStacks(DescribeStacksRequest)
     */
    DescribeStacksResult describeStacks();

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
     */
    EstimateTemplateCostResult estimateTemplateCost(EstimateTemplateCostRequest estimateTemplateCostRequest);

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation.
     *
     * @see #estimateTemplateCost(EstimateTemplateCostRequest)
     */
    EstimateTemplateCostResult estimateTemplateCost();

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
     *         The specified change set cannot be used to update the stack. For example, the change set status might be
     *         <code>CREATE_IN_PROGRESS</code> or the stack status might be <code>UPDATE_IN_PROGRESS</code>.
     * @throws ChangeSetNotFoundException
     *         The specified change set name or ID doesn't exit. To view valid change sets for a stack, use the
     *         <code>ListChangeSets</code> action.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that were not specified in the Capabilities parameter.
     * @sample AmazonCloudFormation.ExecuteChangeSet
     */
    ExecuteChangeSetResult executeChangeSet(ExecuteChangeSetRequest executeChangeSetRequest);

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
     * </p>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @return Result of the GetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormation.GetStackPolicy
     */
    GetStackPolicyResult getStackPolicy(GetStackPolicyRequest getStackPolicyRequest);

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
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Returns information about a new or existing template. The <code>GetTemplateSummary</code> action is useful for
     * viewing parameter information, such as default parameter values and parameter types, before you create or update
     * a stack.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a template, or you can get template
     * information for a running or deleted stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template information for up to 90 days after the
     * stack has been deleted. If the template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @return Result of the GetTemplateSummary operation returned by the service.
     * @sample AmazonCloudFormation.GetTemplateSummary
     */
    GetTemplateSummaryResult getTemplateSummary(GetTemplateSummaryRequest getTemplateSummaryRequest);

    /**
     * Simplified method form for invoking the GetTemplateSummary operation.
     *
     * @see #getTemplateSummary(GetTemplateSummaryRequest)
     */
    GetTemplateSummaryResult getTemplateSummary();

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
     */
    ListChangeSetsResult listChangeSets(ListChangeSetsRequest listChangeSetsRequest);

    /**
     * <p>
     * Lists all exported output values in the account and region in which you call this action. Use this action to see
     * the exported output values that you can import into other stacks. To import values, use the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-exports.html"> AWS
     * CloudFormation Export Stack Output Values</a>.
     * </p>
     * 
     * @param listExportsRequest
     * @return Result of the ListExports operation returned by the service.
     * @sample AmazonCloudFormation.ListExports
     */
    ListExportsResult listExports(ListExportsRequest listExportsRequest);

    /**
     * <p>
     * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first
     * use this action to see which stacks are using it. To see the exported output values in your account, see
     * <a>ListExports</a>.
     * </p>
     * <p>
     * For more information about importing an exported output value, see the <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-importvalue.html">
     * <code>Fn::ImportValue</code> </a> function.
     * </p>
     * 
     * @param listImportsRequest
     * @return Result of the ListImports operation returned by the service.
     * @sample AmazonCloudFormation.ListImports
     */
    ListImportsResult listImports(ListImportsRequest listImportsRequest);

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
     */
    ListStackResourcesResult listStackResources(ListStackResourcesRequest listStackResourcesRequest);

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
     */
    ListStacksResult listStacks(ListStacksRequest listStacksRequest);

    /**
     * Simplified method form for invoking the ListStacks operation.
     *
     * @see #listStacks(ListStacksRequest)
     */
    ListStacksResult listStacks();

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * 
     * @param setStackPolicyRequest
     *        The input for the <a>SetStackPolicy</a> action.
     * @return Result of the SetStackPolicy operation returned by the service.
     * @sample AmazonCloudFormation.SetStackPolicy
     */
    SetStackPolicyResult setStackPolicy(SetStackPolicyRequest setStackPolicyRequest);

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
     */
    SignalResourceResult signalResource(SignalResourceRequest signalResourceRequest);

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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html">Updating a
     * Stack</a>.
     * </p>
     * 
     * @param updateStackRequest
     *        The input for an <a>UpdateStack</a> action.
     * @return Result of the UpdateStack operation returned by the service.
     * @throws InsufficientCapabilitiesException
     *         The template contains resources with capabilities that were not specified in the Capabilities parameter.
     * @sample AmazonCloudFormation.UpdateStack
     */
    UpdateStackResult updateStack(UpdateStackRequest updateStackRequest);

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
     */
    ValidateTemplateResult validateTemplate(ValidateTemplateRequest validateTemplateRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonCloudFormationWaiters waiters();

}

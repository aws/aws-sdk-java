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
package com.amazonaws.services.inspector;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.inspector.model.*;

/**
 * Interface for accessing Amazon Inspector.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.inspector.AbstractAmazonInspector} instead.
 * </p>
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
 * For more information, see <a
 * href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"> Amazon Inspector User
 * Guide</a>.
 * </p>
 */
public interface AmazonInspector {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "inspector";

    /**
     * Overrides the default endpoint for this client ("https://inspector.us-east-1.amazonaws.com"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "inspector.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://inspector.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "inspector.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://inspector.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonInspector#setEndpoint(String)}, sets the regional endpoint for this client's
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
     * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
     * </p>
     * 
     * @param addAttributesToFindingsRequest
     * @return Result of the AddAttributesToFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.AddAttributesToFindings
     */
    AddAttributesToFindingsResult addAttributesToFindings(AddAttributesToFindingsRequest addAttributesToFindingsRequest);

    /**
     * <p>
     * Creates a new assessment target using the ARN of the resource group that is generated by
     * <a>CreateResourceGroup</a>. You can create up to 50 assessment targets per AWS account. You can run up to 500
     * concurrent agents per AWS account. For more information, see <a
     * href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_applications.html"> Amazon Inspector
     * Assessment Targets</a>.
     * </p>
     * 
     * @param createAssessmentTargetRequest
     * @return Result of the CreateAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.CreateAssessmentTarget
     */
    CreateAssessmentTargetResult createAssessmentTarget(CreateAssessmentTargetRequest createAssessmentTargetRequest);

    /**
     * <p>
     * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param createAssessmentTemplateRequest
     * @return Result of the CreateAssessmentTemplate operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.CreateAssessmentTemplate
     */
    CreateAssessmentTemplateResult createAssessmentTemplate(CreateAssessmentTemplateRequest createAssessmentTemplateRequest);

    /**
     * <p>
     * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2
     * instances to be included in an Amazon Inspector assessment target. The created resource group is then used to
     * create an Amazon Inspector assessment target. For more information, see <a>CreateAssessmentTarget</a>.
     * </p>
     * 
     * @param createResourceGroupRequest
     * @return Result of the CreateResourceGroup operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.CreateResourceGroup
     */
    CreateResourceGroupResult createResourceGroup(CreateResourceGroupRequest createResourceGroupRequest);

    /**
     * <p>
     * Deletes the assessment run that is specified by the ARN of the assessment run.
     * </p>
     * 
     * @param deleteAssessmentRunRequest
     * @return Result of the DeleteAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.DeleteAssessmentRun
     */
    DeleteAssessmentRunResult deleteAssessmentRun(DeleteAssessmentRunRequest deleteAssessmentRunRequest);

    /**
     * <p>
     * Deletes the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param deleteAssessmentTargetRequest
     * @return Result of the DeleteAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.DeleteAssessmentTarget
     */
    DeleteAssessmentTargetResult deleteAssessmentTarget(DeleteAssessmentTargetRequest deleteAssessmentTargetRequest);

    /**
     * <p>
     * Deletes the assessment template that is specified by the ARN of the assessment template.
     * </p>
     * 
     * @param deleteAssessmentTemplateRequest
     * @return Result of the DeleteAssessmentTemplate operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.DeleteAssessmentTemplate
     */
    DeleteAssessmentTemplateResult deleteAssessmentTemplate(DeleteAssessmentTemplateRequest deleteAssessmentTemplateRequest);

    /**
     * <p>
     * Describes the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param describeAssessmentRunsRequest
     * @return Result of the DescribeAssessmentRuns operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentRuns
     */
    DescribeAssessmentRunsResult describeAssessmentRuns(DescribeAssessmentRunsRequest describeAssessmentRunsRequest);

    /**
     * <p>
     * Describes the assessment targets that are specified by the ARNs of the assessment targets.
     * </p>
     * 
     * @param describeAssessmentTargetsRequest
     * @return Result of the DescribeAssessmentTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTargets
     */
    DescribeAssessmentTargetsResult describeAssessmentTargets(DescribeAssessmentTargetsRequest describeAssessmentTargetsRequest);

    /**
     * <p>
     * Describes the assessment templates that are specified by the ARNs of the assessment templates.
     * </p>
     * 
     * @param describeAssessmentTemplatesRequest
     * @return Result of the DescribeAssessmentTemplates operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTemplates
     */
    DescribeAssessmentTemplatesResult describeAssessmentTemplates(DescribeAssessmentTemplatesRequest describeAssessmentTemplatesRequest);

    /**
     * <p>
     * Describes the IAM role that enables Amazon Inspector to access your AWS account.
     * </p>
     * 
     * @param describeCrossAccountAccessRoleRequest
     * @return Result of the DescribeCrossAccountAccessRole operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonInspector.DescribeCrossAccountAccessRole
     */
    DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(DescribeCrossAccountAccessRoleRequest describeCrossAccountAccessRoleRequest);

    /**
     * <p>
     * Describes the findings that are specified by the ARNs of the findings.
     * </p>
     * 
     * @param describeFindingsRequest
     * @return Result of the DescribeFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeFindings
     */
    DescribeFindingsResult describeFindings(DescribeFindingsRequest describeFindingsRequest);

    /**
     * <p>
     * Describes the resource groups that are specified by the ARNs of the resource groups.
     * </p>
     * 
     * @param describeResourceGroupsRequest
     * @return Result of the DescribeResourceGroups operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeResourceGroups
     */
    DescribeResourceGroupsResult describeResourceGroups(DescribeResourceGroupsRequest describeResourceGroupsRequest);

    /**
     * <p>
     * Describes the rules packages that are specified by the ARNs of the rules packages.
     * </p>
     * 
     * @param describeRulesPackagesRequest
     * @return Result of the DescribeRulesPackages operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeRulesPackages
     */
    DescribeRulesPackagesResult describeRulesPackages(DescribeRulesPackagesRequest describeRulesPackagesRequest);

    /**
     * <p>
     * Information about the data that is collected for the specified assessment run.
     * </p>
     * 
     * @param getTelemetryMetadataRequest
     * @return Result of the GetTelemetryMetadata operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.GetTelemetryMetadata
     */
    GetTelemetryMetadataResult getTelemetryMetadata(GetTelemetryMetadataRequest getTelemetryMetadataRequest);

    /**
     * <p>
     * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param listAssessmentRunAgentsRequest
     * @return Result of the ListAssessmentRunAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentRunAgents
     */
    ListAssessmentRunAgentsResult listAssessmentRunAgents(ListAssessmentRunAgentsRequest listAssessmentRunAgentsRequest);

    /**
     * <p>
     * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the
     * assessment templates.
     * </p>
     * 
     * @param listAssessmentRunsRequest
     * @return Result of the ListAssessmentRuns operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentRuns
     */
    ListAssessmentRunsResult listAssessmentRuns(ListAssessmentRunsRequest listAssessmentRunsRequest);

    /**
     * <p>
     * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets,
     * see <a href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_applications.html">Amazon Inspector
     * Assessment Targets</a>.
     * </p>
     * 
     * @param listAssessmentTargetsRequest
     * @return Result of the ListAssessmentTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.ListAssessmentTargets
     */
    ListAssessmentTargetsResult listAssessmentTargets(ListAssessmentTargetsRequest listAssessmentTargetsRequest);

    /**
     * <p>
     * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the
     * assessment targets.
     * </p>
     * 
     * @param listAssessmentTemplatesRequest
     * @return Result of the ListAssessmentTemplates operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentTemplates
     */
    ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest listAssessmentTemplatesRequest);

    /**
     * <p>
     * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment
     * template. For more information, see <a>SubscribeToEvent</a> and <a>UnsubscribeFromEvent</a>.
     * </p>
     * 
     * @param listEventSubscriptionsRequest
     * @return Result of the ListEventSubscriptions operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListEventSubscriptions
     */
    ListEventSubscriptionsResult listEventSubscriptions(ListEventSubscriptionsRequest listEventSubscriptionsRequest);

    /**
     * <p>
     * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListFindings
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists all available Amazon Inspector rules packages.
     * </p>
     * 
     * @param listRulesPackagesRequest
     * @return Result of the ListRulesPackages operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.ListRulesPackages
     */
    ListRulesPackagesResult listRulesPackages(ListRulesPackagesRequest listRulesPackagesRequest);

    /**
     * <p>
     * Lists all tags associated with an assessment template.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
     * </p>
     * 
     * @param previewAgentsRequest
     * @return Result of the PreviewAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @sample AmazonInspector.PreviewAgents
     */
    PreviewAgentsResult previewAgents(PreviewAgentsRequest previewAgentsRequest);

    /**
     * <p>
     * Registers the IAM role that Amazon Inspector uses to list your EC2 instances at the start of the assessment run
     * or when you call the <a>PreviewAgents</a> action.
     * </p>
     * 
     * @param registerCrossAccountAccessRoleRequest
     * @return Result of the RegisterCrossAccountAccessRole operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @sample AmazonInspector.RegisterCrossAccountAccessRole
     */
    RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(RegisterCrossAccountAccessRoleRequest registerCrossAccountAccessRoleRequest);

    /**
     * <p>
     * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings
     * where an attribute with the specified key exists.
     * </p>
     * 
     * @param removeAttributesFromFindingsRequest
     * @return Result of the RemoveAttributesFromFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.RemoveAttributesFromFindings
     */
    RemoveAttributesFromFindingsResult removeAttributesFromFindings(RemoveAttributesFromFindingsRequest removeAttributesFromFindingsRequest);

    /**
     * <p>
     * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment
     * template.
     * </p>
     * 
     * @param setTagsForResourceRequest
     * @return Result of the SetTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.SetTagsForResource
     */
    SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest setTagsForResourceRequest);

    /**
     * <p>
     * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you
     * must not exceed the limit of running up to 500 concurrent agents per AWS account.
     * </p>
     * 
     * @param startAssessmentRunRequest
     * @return Result of the StartAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @throws AgentsAlreadyRunningAssessmentException
     *         You started an assessment run, but one of the instances is already participating in another assessment
     *         run.
     * @sample AmazonInspector.StartAssessmentRun
     */
    StartAssessmentRunResult startAssessmentRun(StartAssessmentRunRequest startAssessmentRunRequest);

    /**
     * <p>
     * Stops the assessment run that is specified by the ARN of the assessment run.
     * </p>
     * 
     * @param stopAssessmentRunRequest
     * @return Result of the StopAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.StopAssessmentRun
     */
    StopAssessmentRunResult stopAssessmentRun(StopAssessmentRunRequest stopAssessmentRunRequest);

    /**
     * <p>
     * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
     * a specified SNS topic.
     * </p>
     * 
     * @param subscribeToEventRequest
     * @return Result of the SubscribeToEvent operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.SubscribeToEvent
     */
    SubscribeToEventResult subscribeToEvent(SubscribeToEventRequest subscribeToEventRequest);

    /**
     * <p>
     * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
     * a specified SNS topic.
     * </p>
     * 
     * @param unsubscribeFromEventRequest
     * @return Result of the UnsubscribeFromEvent operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.UnsubscribeFromEvent
     */
    UnsubscribeFromEventResult unsubscribeFromEvent(UnsubscribeFromEventRequest unsubscribeFromEventRequest);

    /**
     * <p>
     * Updates the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param updateAssessmentTargetRequest
     * @return Result of the UpdateAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.UpdateAssessmentTarget
     */
    UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest updateAssessmentTargetRequest);

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

}

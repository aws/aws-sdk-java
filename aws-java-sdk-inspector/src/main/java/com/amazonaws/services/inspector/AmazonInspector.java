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
package com.amazonaws.services.inspector;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.inspector.model.*;

/**
 * Interface for accessing Amazon Inspector.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of the applications you
 * run in AWS and to identify potential security issues. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"
 * > Amazon Inspector User Guide</a>.
 * </p>
 */
public interface AmazonInspector {

    /**
     * Overrides the default endpoint for this client
     * ("https://inspector.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "inspector.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://inspector.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "inspector.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://inspector.us-east-1.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonInspector#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Assigns attributes (key and value pair) to the findings specified by the
     * findings' ARNs.
     * </p>
     * 
     * @param addAttributesToFindingsRequest
     * @return Result of the AddAttributesToFindings operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.AddAttributesToFindings
     */
    AddAttributesToFindingsResult addAttributesToFindings(
            AddAttributesToFindingsRequest addAttributesToFindingsRequest);

    /**
     * <p>
     * Attaches the rules package specified by the rules package ARN to the
     * assessment specified by the assessment ARN.
     * </p>
     * 
     * @param attachAssessmentAndRulesPackageRequest
     * @return Result of the AttachAssessmentAndRulesPackage operation returned
     *         by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.AttachAssessmentAndRulesPackage
     */
    AttachAssessmentAndRulesPackageResult attachAssessmentAndRulesPackage(
            AttachAssessmentAndRulesPackageRequest attachAssessmentAndRulesPackageRequest);

    /**
     * <p>
     * Creates a new application using the resource group ARN generated by
     * <a>CreateResourceGroup</a>. You can create up to 50 applications per AWS
     * account. You can run up to 500 concurrent agents per AWS account. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/inspector/latest/userguide//inspector_applications.html"
     * > Inspector Applications.</a>
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.CreateApplication
     */
    CreateApplicationResult createApplication(
            CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an assessment for the application specified by the application
     * ARN. You can create up to 500 assessments per AWS account.
     * </p>
     * 
     * @param createAssessmentRequest
     * @return Result of the CreateAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.CreateAssessment
     */
    CreateAssessmentResult createAssessment(
            CreateAssessmentRequest createAssessmentRequest);

    /**
     * <p>
     * Creates a resource group using the specified set of tags (key and value
     * pairs) that are used to select the EC2 instances to be included in an
     * Inspector application. The created resource group is then used to create
     * an Inspector application.
     * </p>
     * 
     * @param createResourceGroupRequest
     * @return Result of the CreateResourceGroup operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @sample AmazonInspector.CreateResourceGroup
     */
    CreateResourceGroupResult createResourceGroup(
            CreateResourceGroupRequest createResourceGroupRequest);

    /**
     * <p>
     * Deletes the application specified by the application ARN.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws OperationInProgressException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DeleteApplication
     */
    DeleteApplicationResult deleteApplication(
            DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @return Result of the DeleteAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws OperationInProgressException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DeleteAssessment
     */
    DeleteAssessmentResult deleteAssessment(
            DeleteAssessmentRequest deleteAssessmentRequest);

    /**
     * <p>
     * Deletes the assessment run specified by the run ARN.
     * </p>
     * 
     * @param deleteRunRequest
     * @return Result of the DeleteRun operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DeleteRun
     */
    DeleteRunResult deleteRun(DeleteRunRequest deleteRunRequest);

    /**
     * <p>
     * Describes the application specified by the application ARN.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeApplication
     */
    DescribeApplicationResult describeApplication(
            DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Describes the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param describeAssessmentRequest
     * @return Result of the DescribeAssessment operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeAssessment
     */
    DescribeAssessmentResult describeAssessment(
            DescribeAssessmentRequest describeAssessmentRequest);

    /**
     * <p>
     * Describes the IAM role that enables Inspector to access your AWS account.
     * </p>
     * 
     * @param describeCrossAccountAccessRoleRequest
     * @return Result of the DescribeCrossAccountAccessRole operation returned
     *         by the service.
     * @throws InternalException
     * @throws AccessDeniedException
     * @sample AmazonInspector.DescribeCrossAccountAccessRole
     */
    DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(
            DescribeCrossAccountAccessRoleRequest describeCrossAccountAccessRoleRequest);

    /**
     * <p>
     * Describes the finding specified by the finding ARN.
     * </p>
     * 
     * @param describeFindingRequest
     * @return Result of the DescribeFinding operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeFinding
     */
    DescribeFindingResult describeFinding(
            DescribeFindingRequest describeFindingRequest);

    /**
     * <p>
     * Describes the resource group specified by the resource group ARN.
     * </p>
     * 
     * @param describeResourceGroupRequest
     * @return Result of the DescribeResourceGroup operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeResourceGroup
     */
    DescribeResourceGroupResult describeResourceGroup(
            DescribeResourceGroupRequest describeResourceGroupRequest);

    /**
     * <p>
     * Describes the rules package specified by the rules package ARN.
     * </p>
     * 
     * @param describeRulesPackageRequest
     * @return Result of the DescribeRulesPackage operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeRulesPackage
     */
    DescribeRulesPackageResult describeRulesPackage(
            DescribeRulesPackageRequest describeRulesPackageRequest);

    /**
     * <p>
     * Describes the assessment run specified by the run ARN.
     * </p>
     * 
     * @param describeRunRequest
     * @return Result of the DescribeRun operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeRun
     */
    DescribeRunResult describeRun(DescribeRunRequest describeRunRequest);

    /**
     * <p>
     * Detaches the rules package specified by the rules package ARN from the
     * assessment specified by the assessment ARN.
     * </p>
     * 
     * @param detachAssessmentAndRulesPackageRequest
     * @return Result of the DetachAssessmentAndRulesPackage operation returned
     *         by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DetachAssessmentAndRulesPackage
     */
    DetachAssessmentAndRulesPackageResult detachAssessmentAndRulesPackage(
            DetachAssessmentAndRulesPackageRequest detachAssessmentAndRulesPackageRequest);

    /**
     * <p>
     * Returns the metadata about the telemetry (application behavioral data)
     * for the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param getAssessmentTelemetryRequest
     * @return Result of the GetAssessmentTelemetry operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.GetAssessmentTelemetry
     */
    GetAssessmentTelemetryResult getAssessmentTelemetry(
            GetAssessmentTelemetryRequest getAssessmentTelemetryRequest);

    /**
     * <p>
     * Lists the ARNs of the applications within this AWS account. For more
     * information about applications, see <a href=
     * "https://docs.aws.amazon.com/inspector/latest/userguide//inspector_applications.html"
     * >Inspector Applications</a>.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @sample AmazonInspector.ListApplications
     */
    ListApplicationsResult listApplications(
            ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the agents of the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param listAssessmentAgentsRequest
     * @return Result of the ListAssessmentAgents operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAssessmentAgents
     */
    ListAssessmentAgentsResult listAssessmentAgents(
            ListAssessmentAgentsRequest listAssessmentAgentsRequest);

    /**
     * <p>
     * Lists the assessments corresponding to applications specified by the
     * applications' ARNs.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @return Result of the ListAssessments operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAssessments
     */
    ListAssessmentsResult listAssessments(
            ListAssessmentsRequest listAssessmentsRequest);

    /**
     * <p>
     * Lists the assessments attached to the rules package specified by the
     * rules package ARN.
     * </p>
     * 
     * @param listAttachedAssessmentsRequest
     * @return Result of the ListAttachedAssessments operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAttachedAssessments
     */
    ListAttachedAssessmentsResult listAttachedAssessments(
            ListAttachedAssessmentsRequest listAttachedAssessmentsRequest);

    /**
     * <p>
     * Lists the rules packages attached to the assessment specified by the
     * assessment ARN.
     * </p>
     * 
     * @param listAttachedRulesPackagesRequest
     * @return Result of the ListAttachedRulesPackages operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAttachedRulesPackages
     */
    ListAttachedRulesPackagesResult listAttachedRulesPackages(
            ListAttachedRulesPackagesRequest listAttachedRulesPackagesRequest);

    /**
     * <p>
     * Lists findings generated by the assessment run specified by the run ARNs.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListFindings
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists all available Inspector rules packages.
     * </p>
     * 
     * @param listRulesPackagesRequest
     * @return Result of the ListRulesPackages operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @sample AmazonInspector.ListRulesPackages
     */
    ListRulesPackagesResult listRulesPackages(
            ListRulesPackagesRequest listRulesPackagesRequest);

    /**
     * <p>
     * Lists the assessment runs associated with the assessments specified by
     * the assessment ARNs.
     * </p>
     * 
     * @param listRunsRequest
     * @return Result of the ListRuns operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListRuns
     */
    ListRunsResult listRuns(ListRunsRequest listRunsRequest);

    /**
     * <p>
     * Lists all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Translates a textual identifier into a user-readable text in a specified
     * locale.
     * </p>
     * 
     * @param localizeTextRequest
     * @return Result of the LocalizeText operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.LocalizeText
     */
    LocalizeTextResult localizeText(LocalizeTextRequest localizeTextRequest);

    /**
     * <p>
     * Previews the agents installed on the EC2 instances that are included in
     * the application created with the specified resource group.
     * </p>
     * 
     * @param previewAgentsForResourceGroupRequest
     * @return Result of the PreviewAgentsForResourceGroup operation returned by
     *         the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @throws InvalidCrossAccountRoleException
     * @sample AmazonInspector.PreviewAgentsForResourceGroup
     */
    PreviewAgentsForResourceGroupResult previewAgentsForResourceGroup(
            PreviewAgentsForResourceGroupRequest previewAgentsForResourceGroupRequest);

    /**
     * <p>
     * Register the role that Inspector uses to list your EC2 instances during
     * the assessment.
     * </p>
     * 
     * @param registerCrossAccountAccessRoleRequest
     * @return Result of the RegisterCrossAccountAccessRole operation returned
     *         by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws InvalidCrossAccountRoleException
     * @sample AmazonInspector.RegisterCrossAccountAccessRole
     */
    RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(
            RegisterCrossAccountAccessRoleRequest registerCrossAccountAccessRoleRequest);

    /**
     * <p>
     * Removes the entire attribute (key and value pair) from the findings
     * specified by the finding ARNs where an attribute with the specified key
     * exists.
     * </p>
     * 
     * @param removeAttributesFromFindingsRequest
     * @return Result of the RemoveAttributesFromFindings operation returned by
     *         the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.RemoveAttributesFromFindings
     */
    RemoveAttributesFromFindingsResult removeAttributesFromFindings(
            RemoveAttributesFromFindingsRequest removeAttributesFromFindingsRequest);

    /**
     * <p>
     * Starts the analysis of the application’s behavior against selected rule
     * packages for the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param runAssessmentRequest
     * @return Result of the RunAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.RunAssessment
     */
    RunAssessmentResult runAssessment(RunAssessmentRequest runAssessmentRequest);

    /**
     * <p>
     * Sets tags (key and value pairs) to the assessment specified by the
     * assessment ARN.
     * </p>
     * 
     * @param setTagsForResourceRequest
     * @return Result of the SetTagsForResource operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.SetTagsForResource
     */
    SetTagsForResourceResult setTagsForResource(
            SetTagsForResourceRequest setTagsForResourceRequest);

    /**
     * <p>
     * Starts data collection for the assessment specified by the assessment
     * ARN. For this API to function properly, you must not exceed the limit of
     * running up to 500 concurrent agents per AWS account.
     * </p>
     * 
     * @param startDataCollectionRequest
     * @return Result of the StartDataCollection operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @throws InvalidCrossAccountRoleException
     * @sample AmazonInspector.StartDataCollection
     */
    StartDataCollectionResult startDataCollection(
            StartDataCollectionRequest startDataCollectionRequest);

    /**
     * <p>
     * Stop data collection for the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param stopDataCollectionRequest
     * @return Result of the StopDataCollection operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.StopDataCollection
     */
    StopDataCollectionResult stopDataCollection(
            StopDataCollectionRequest stopDataCollectionRequest);

    /**
     * <p>
     * Updates application specified by the application ARN.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.UpdateApplication
     */
    UpdateApplicationResult updateApplication(
            UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @return Result of the UpdateAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.UpdateAssessment
     */
    UpdateAssessmentResult updateAssessment(
            UpdateAssessmentRequest updateAssessmentRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}

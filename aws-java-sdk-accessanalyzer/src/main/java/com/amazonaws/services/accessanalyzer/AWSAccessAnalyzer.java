/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.accessanalyzer.model.*;

/**
 * Interface for accessing Access Analyzer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.accessanalyzer.AbstractAWSAccessAnalyzer} instead.
 * </p>
 * <p>
 * <p>
 * AWS IAM Access Analyzer helps identify potential resource-access risks by enabling you to identify any policies that
 * grant access to an external principal. It does this by using logic-based reasoning to analyze resource-based policies
 * in your AWS environment. An external principal can be another AWS account, a root user, an IAM user or role, a
 * federated user, an AWS service, or an anonymous user. You can also use Access Analyzer to preview and validate public
 * and cross-account access to your resources before deploying permissions changes. This guide describes the AWS IAM
 * Access Analyzer operations that you can call programmatically. For general information about Access Analyzer, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html">AWS IAM Access Analyzer</a> in
 * the <b>IAM User Guide</b>.
 * </p>
 * <p>
 * To start using Access Analyzer, you first need to create an analyzer.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAccessAnalyzer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "access-analyzer";

    /**
     * <p>
     * Retroactively applies the archive rule to existing findings that meet the archive rule criteria.
     * </p>
     * 
     * @param applyArchiveRuleRequest
     *        Retroactively applies an archive rule.
     * @return Result of the ApplyArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ApplyArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ApplyArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    ApplyArchiveRuleResult applyArchiveRule(ApplyArchiveRuleRequest applyArchiveRuleRequest);

    /**
     * <p>
     * Cancels the requested policy generation.
     * </p>
     * 
     * @param cancelPolicyGenerationRequest
     * @return Result of the CancelPolicyGeneration operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.CancelPolicyGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CancelPolicyGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    CancelPolicyGenerationResult cancelPolicyGeneration(CancelPolicyGenerationRequest cancelPolicyGenerationRequest);

    /**
     * <p>
     * Creates an access preview that allows you to preview Access Analyzer findings for your resource before deploying
     * resource permissions.
     * </p>
     * 
     * @param createAccessPreviewRequest
     * @return Result of the CreateAccessPreview operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Service quote met error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.CreateAccessPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAccessPreview"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAccessPreviewResult createAccessPreview(CreateAccessPreviewRequest createAccessPreviewRequest);

    /**
     * <p>
     * Creates an analyzer for your account.
     * </p>
     * 
     * @param createAnalyzerRequest
     *        Creates an analyzer.
     * @return Result of the CreateAnalyzer operation returned by the service.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Service quote met error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.CreateAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAnalyzerResult createAnalyzer(CreateAnalyzerRequest createAnalyzerRequest);

    /**
     * <p>
     * Creates an archive rule for the specified analyzer. Archive rules automatically archive new findings that meet
     * the criteria you define when you create the rule.
     * </p>
     * <p>
     * To learn about filter keys that you can use to create an archive rule, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-reference-filter-keys.html">Access
     * Analyzer filter keys</a> in the <b>IAM User Guide</b>.
     * </p>
     * 
     * @param createArchiveRuleRequest
     *        Creates an archive rule.
     * @return Result of the CreateArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Service quote met error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.CreateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateArchiveRuleResult createArchiveRule(CreateArchiveRuleRequest createArchiveRuleRequest);

    /**
     * <p>
     * Deletes the specified analyzer. When you delete an analyzer, Access Analyzer is disabled for the account or
     * organization in the current or specific Region. All findings that were generated by the analyzer are deleted. You
     * cannot undo this action.
     * </p>
     * 
     * @param deleteAnalyzerRequest
     *        Deletes an analyzer.
     * @return Result of the DeleteAnalyzer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.DeleteAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAnalyzerResult deleteAnalyzer(DeleteAnalyzerRequest deleteAnalyzerRequest);

    /**
     * <p>
     * Deletes the specified archive rule.
     * </p>
     * 
     * @param deleteArchiveRuleRequest
     *        Deletes an archive rule.
     * @return Result of the DeleteArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.DeleteArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteArchiveRuleResult deleteArchiveRule(DeleteArchiveRuleRequest deleteArchiveRuleRequest);

    /**
     * <p>
     * Retrieves information about an access preview for the specified analyzer.
     * </p>
     * 
     * @param getAccessPreviewRequest
     * @return Result of the GetAccessPreview operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetAccessPreview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAccessPreview"
     *      target="_top">AWS API Documentation</a>
     */
    GetAccessPreviewResult getAccessPreview(GetAccessPreviewRequest getAccessPreviewRequest);

    /**
     * <p>
     * Retrieves information about a resource that was analyzed.
     * </p>
     * 
     * @param getAnalyzedResourceRequest
     *        Retrieves an analyzed resource.
     * @return Result of the GetAnalyzedResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetAnalyzedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzedResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetAnalyzedResourceResult getAnalyzedResource(GetAnalyzedResourceRequest getAnalyzedResourceRequest);

    /**
     * <p>
     * Retrieves information about the specified analyzer.
     * </p>
     * 
     * @param getAnalyzerRequest
     *        Retrieves an analyzer.
     * @return Result of the GetAnalyzer operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzer" target="_top">AWS API
     *      Documentation</a>
     */
    GetAnalyzerResult getAnalyzer(GetAnalyzerRequest getAnalyzerRequest);

    /**
     * <p>
     * Retrieves information about an archive rule.
     * </p>
     * <p>
     * To learn about filter keys that you can use to create an archive rule, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-reference-filter-keys.html">Access
     * Analyzer filter keys</a> in the <b>IAM User Guide</b>.
     * </p>
     * 
     * @param getArchiveRuleRequest
     *        Retrieves an archive rule.
     * @return Result of the GetArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetArchiveRule" target="_top">AWS
     *      API Documentation</a>
     */
    GetArchiveRuleResult getArchiveRule(GetArchiveRuleRequest getArchiveRuleRequest);

    /**
     * <p>
     * Retrieves information about the specified finding.
     * </p>
     * 
     * @param getFindingRequest
     *        Retrieves a finding.
     * @return Result of the GetFinding operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetFinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFinding" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingResult getFinding(GetFindingRequest getFindingRequest);

    /**
     * <p>
     * Retrieves the policy that was generated using <code>StartPolicyGeneration</code>.
     * </p>
     * 
     * @param getGeneratedPolicyRequest
     * @return Result of the GetGeneratedPolicy operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.GetGeneratedPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetGeneratedPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetGeneratedPolicyResult getGeneratedPolicy(GetGeneratedPolicyRequest getGeneratedPolicyRequest);

    /**
     * <p>
     * Retrieves a list of access preview findings generated by the specified access preview.
     * </p>
     * 
     * @param listAccessPreviewFindingsRequest
     * @return Result of the ListAccessPreviewFindings operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListAccessPreviewFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAccessPreviewFindings"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccessPreviewFindingsResult listAccessPreviewFindings(ListAccessPreviewFindingsRequest listAccessPreviewFindingsRequest);

    /**
     * <p>
     * Retrieves a list of access previews for the specified analyzer.
     * </p>
     * 
     * @param listAccessPreviewsRequest
     * @return Result of the ListAccessPreviews operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListAccessPreviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAccessPreviews"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccessPreviewsResult listAccessPreviews(ListAccessPreviewsRequest listAccessPreviewsRequest);

    /**
     * <p>
     * Retrieves a list of resources of the specified type that have been analyzed by the specified analyzer..
     * </p>
     * 
     * @param listAnalyzedResourcesRequest
     *        Retrieves a list of resources that have been analyzed.
     * @return Result of the ListAnalyzedResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListAnalyzedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzedResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnalyzedResourcesResult listAnalyzedResources(ListAnalyzedResourcesRequest listAnalyzedResourcesRequest);

    /**
     * <p>
     * Retrieves a list of analyzers.
     * </p>
     * 
     * @param listAnalyzersRequest
     *        Retrieves a list of analyzers.
     * @return Result of the ListAnalyzers operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListAnalyzers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzers" target="_top">AWS
     *      API Documentation</a>
     */
    ListAnalyzersResult listAnalyzers(ListAnalyzersRequest listAnalyzersRequest);

    /**
     * <p>
     * Retrieves a list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param listArchiveRulesRequest
     *        Retrieves a list of archive rules created for the specified analyzer.
     * @return Result of the ListArchiveRules operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListArchiveRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListArchiveRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListArchiveRulesResult listArchiveRules(ListArchiveRulesRequest listArchiveRulesRequest);

    /**
     * <p>
     * Retrieves a list of findings generated by the specified analyzer.
     * </p>
     * <p>
     * To learn about filter keys that you can use to retrieve a list of findings, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access-analyzer-reference-filter-keys.html">Access
     * Analyzer filter keys</a> in the <b>IAM User Guide</b>.
     * </p>
     * 
     * @param listFindingsRequest
     *        Retrieves a list of findings generated by the specified analyzer.
     * @return Result of the ListFindings operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListFindings" target="_top">AWS
     *      API Documentation</a>
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists all of the policy generations requested in the last seven days.
     * </p>
     * 
     * @param listPolicyGenerationsRequest
     * @return Result of the ListPolicyGenerations operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListPolicyGenerations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListPolicyGenerations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPolicyGenerationsResult listPolicyGenerations(ListPolicyGenerationsRequest listPolicyGenerationsRequest);

    /**
     * <p>
     * Retrieves a list of tags applied to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Retrieves a list of tags applied to the specified resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts the policy generation request.
     * </p>
     * 
     * @param startPolicyGenerationRequest
     * @return Result of the StartPolicyGeneration operation returned by the service.
     * @throws ConflictException
     *         A conflict exception error.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Service quote met error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.StartPolicyGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/StartPolicyGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    StartPolicyGenerationResult startPolicyGeneration(StartPolicyGenerationRequest startPolicyGenerationRequest);

    /**
     * <p>
     * Immediately starts a scan of the policies applied to the specified resource.
     * </p>
     * 
     * @param startResourceScanRequest
     *        Starts a scan of the policies applied to the specified resource.
     * @return Result of the StartResourceScan operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.StartResourceScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/StartResourceScan"
     *      target="_top">AWS API Documentation</a>
     */
    StartResourceScanResult startResourceScan(StartResourceScanRequest startResourceScanRequest);

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds a tag to the specified resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from the specified resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the criteria and values for the specified archive rule.
     * </p>
     * 
     * @param updateArchiveRuleRequest
     *        Updates the specified archive rule.
     * @return Result of the UpdateArchiveRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.UpdateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateArchiveRuleResult updateArchiveRule(UpdateArchiveRuleRequest updateArchiveRuleRequest);

    /**
     * <p>
     * Updates the status for the specified findings.
     * </p>
     * 
     * @param updateFindingsRequest
     *        Updates findings with the new values provided in the request.
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateFindings" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFindingsResult updateFindings(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * Requests the validation of a policy and returns a list of findings. The findings help you identify issues and
     * provide actionable recommendations to resolve the issue and enable you to author functional policies that meet
     * security best practices.
     * </p>
     * 
     * @param validatePolicyRequest
     * @return Result of the ValidatePolicy operation returned by the service.
     * @throws ValidationException
     *         Validation exception error.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ThrottlingException
     *         Throttling limit exceeded error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSAccessAnalyzer.ValidatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ValidatePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    ValidatePolicyResult validatePolicy(ValidatePolicyRequest validatePolicyRequest);

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

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.accessanalyzer.model.*;

/**
 * Interface for accessing Access Analyzer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.accessanalyzer.AbstractAWSAccessAnalyzerAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IAM Access Analyzer helps identify potential resource-access risks by enabling you to identify any policies that
 * grant access to an external principal. It does this by using logic-based reasoning to analyze resource-based policies
 * in your AWS environment. An external principal can be another AWS account, a root user, an IAM user or role, a
 * federated user, an AWS service, or an anonymous user. This guide describes the AWS IAM Access Analyzer operations
 * that you can call programmatically. For general information about Access Analyzer, see the <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/what-is-access-analyzer.html">AWS IAM Access Analyzer section
 * of the IAM User Guide</a>.
 * </p>
 * <p>
 * To start using Access Analyzer, you first need to create an analyzer.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAccessAnalyzerAsync extends AWSAccessAnalyzer {

    /**
     * <p>
     * Creates an analyzer for your account.
     * </p>
     * 
     * @param createAnalyzerRequest
     *        Creates an analyzer.
     * @return A Java Future containing the result of the CreateAnalyzer operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.CreateAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnalyzerResult> createAnalyzerAsync(CreateAnalyzerRequest createAnalyzerRequest);

    /**
     * <p>
     * Creates an analyzer for your account.
     * </p>
     * 
     * @param createAnalyzerRequest
     *        Creates an analyzer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnalyzer operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.CreateAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnalyzerResult> createAnalyzerAsync(CreateAnalyzerRequest createAnalyzerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnalyzerRequest, CreateAnalyzerResult> asyncHandler);

    /**
     * <p>
     * Creates an archive rule for the specified analyzer. Archive rules automatically archive findings that meet the
     * criteria you define when you create the rule.
     * </p>
     * 
     * @param createArchiveRuleRequest
     *        Creates an archive rule.
     * @return A Java Future containing the result of the CreateArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.CreateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateArchiveRuleResult> createArchiveRuleAsync(CreateArchiveRuleRequest createArchiveRuleRequest);

    /**
     * <p>
     * Creates an archive rule for the specified analyzer. Archive rules automatically archive findings that meet the
     * criteria you define when you create the rule.
     * </p>
     * 
     * @param createArchiveRuleRequest
     *        Creates an archive rule.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.CreateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CreateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateArchiveRuleResult> createArchiveRuleAsync(CreateArchiveRuleRequest createArchiveRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateArchiveRuleRequest, CreateArchiveRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified analyzer. When you delete an analyzer, Access Analyzer is disabled for the account in the
     * current or specific Region. All findings that were generated by the analyzer are deleted. You cannot undo this
     * action.
     * </p>
     * 
     * @param deleteAnalyzerRequest
     *        Deletes an analyzer.
     * @return A Java Future containing the result of the DeleteAnalyzer operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.DeleteAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnalyzerResult> deleteAnalyzerAsync(DeleteAnalyzerRequest deleteAnalyzerRequest);

    /**
     * <p>
     * Deletes the specified analyzer. When you delete an analyzer, Access Analyzer is disabled for the account in the
     * current or specific Region. All findings that were generated by the analyzer are deleted. You cannot undo this
     * action.
     * </p>
     * 
     * @param deleteAnalyzerRequest
     *        Deletes an analyzer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnalyzer operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.DeleteAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteAnalyzer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnalyzerResult> deleteAnalyzerAsync(DeleteAnalyzerRequest deleteAnalyzerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnalyzerRequest, DeleteAnalyzerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified archive rule.
     * </p>
     * 
     * @param deleteArchiveRuleRequest
     *        Deletes an archive rule.
     * @return A Java Future containing the result of the DeleteArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.DeleteArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteArchiveRuleResult> deleteArchiveRuleAsync(DeleteArchiveRuleRequest deleteArchiveRuleRequest);

    /**
     * <p>
     * Deletes the specified archive rule.
     * </p>
     * 
     * @param deleteArchiveRuleRequest
     *        Deletes an archive rule.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.DeleteArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DeleteArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteArchiveRuleResult> deleteArchiveRuleAsync(DeleteArchiveRuleRequest deleteArchiveRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteArchiveRuleRequest, DeleteArchiveRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a resource that was analyzed.
     * </p>
     * 
     * @param getAnalyzedResourceRequest
     *        Retrieves an analyzed resource.
     * @return A Java Future containing the result of the GetAnalyzedResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.GetAnalyzedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzedResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAnalyzedResourceResult> getAnalyzedResourceAsync(GetAnalyzedResourceRequest getAnalyzedResourceRequest);

    /**
     * <p>
     * Retrieves information about a resource that was analyzed.
     * </p>
     * 
     * @param getAnalyzedResourceRequest
     *        Retrieves an analyzed resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnalyzedResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.GetAnalyzedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzedResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAnalyzedResourceResult> getAnalyzedResourceAsync(GetAnalyzedResourceRequest getAnalyzedResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnalyzedResourceRequest, GetAnalyzedResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified analyzer.
     * </p>
     * 
     * @param getAnalyzerRequest
     *        Retrieves an analyzer.
     * @return A Java Future containing the result of the GetAnalyzer operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.GetAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnalyzerResult> getAnalyzerAsync(GetAnalyzerRequest getAnalyzerRequest);

    /**
     * <p>
     * Retrieves information about the specified analyzer.
     * </p>
     * 
     * @param getAnalyzerRequest
     *        Retrieves an analyzer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnalyzer operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.GetAnalyzer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetAnalyzer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAnalyzerResult> getAnalyzerAsync(GetAnalyzerRequest getAnalyzerRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnalyzerRequest, GetAnalyzerResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an archive rule.
     * </p>
     * 
     * @param getArchiveRuleRequest
     *        Retrieves an archive rule.
     * @return A Java Future containing the result of the GetArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.GetArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetArchiveRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveRuleResult> getArchiveRuleAsync(GetArchiveRuleRequest getArchiveRuleRequest);

    /**
     * <p>
     * Retrieves information about an archive rule.
     * </p>
     * 
     * @param getArchiveRuleRequest
     *        Retrieves an archive rule.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.GetArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetArchiveRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetArchiveRuleResult> getArchiveRuleAsync(GetArchiveRuleRequest getArchiveRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchiveRuleRequest, GetArchiveRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified finding.
     * </p>
     * 
     * @param getFindingRequest
     *        Retrieves a finding.
     * @return A Java Future containing the result of the GetFinding operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.GetFinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFinding" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingResult> getFindingAsync(GetFindingRequest getFindingRequest);

    /**
     * <p>
     * Retrieves information about the specified finding.
     * </p>
     * 
     * @param getFindingRequest
     *        Retrieves a finding.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFinding operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.GetFinding
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/GetFinding" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingResult> getFindingAsync(GetFindingRequest getFindingRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingRequest, GetFindingResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of resources of the specified type that have been analyzed by the specified analyzer..
     * </p>
     * 
     * @param listAnalyzedResourcesRequest
     *        Retrieves a list of resources that have been analyzed.
     * @return A Java Future containing the result of the ListAnalyzedResources operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.ListAnalyzedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnalyzedResourcesResult> listAnalyzedResourcesAsync(ListAnalyzedResourcesRequest listAnalyzedResourcesRequest);

    /**
     * <p>
     * Retrieves a list of resources of the specified type that have been analyzed by the specified analyzer..
     * </p>
     * 
     * @param listAnalyzedResourcesRequest
     *        Retrieves a list of resources that have been analyzed.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnalyzedResources operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.ListAnalyzedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnalyzedResourcesResult> listAnalyzedResourcesAsync(ListAnalyzedResourcesRequest listAnalyzedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnalyzedResourcesRequest, ListAnalyzedResourcesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of analyzers.
     * </p>
     * 
     * @param listAnalyzersRequest
     *        Retrieves a list of analyzers.
     * @return A Java Future containing the result of the ListAnalyzers operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.ListAnalyzers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAnalyzersResult> listAnalyzersAsync(ListAnalyzersRequest listAnalyzersRequest);

    /**
     * <p>
     * Retrieves a list of analyzers.
     * </p>
     * 
     * @param listAnalyzersRequest
     *        Retrieves a list of analyzers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnalyzers operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.ListAnalyzers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListAnalyzers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAnalyzersResult> listAnalyzersAsync(ListAnalyzersRequest listAnalyzersRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnalyzersRequest, ListAnalyzersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param listArchiveRulesRequest
     *        Retrieves a list of archive rules created for the specified analyzer.
     * @return A Java Future containing the result of the ListArchiveRules operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.ListArchiveRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListArchiveRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListArchiveRulesResult> listArchiveRulesAsync(ListArchiveRulesRequest listArchiveRulesRequest);

    /**
     * <p>
     * Retrieves a list of archive rules created for the specified analyzer.
     * </p>
     * 
     * @param listArchiveRulesRequest
     *        Retrieves a list of archive rules created for the specified analyzer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListArchiveRules operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.ListArchiveRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListArchiveRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListArchiveRulesResult> listArchiveRulesAsync(ListArchiveRulesRequest listArchiveRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListArchiveRulesRequest, ListArchiveRulesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of findings generated by the specified analyzer.
     * </p>
     * 
     * @param listFindingsRequest
     *        Retrieves a list of findings generated by the specified analyzer.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Retrieves a list of findings generated by the specified analyzer.
     * </p>
     * 
     * @param listFindingsRequest
     *        Retrieves a list of findings generated by the specified analyzer.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of tags applied to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Retrieves a list of tags applied to the specified resource.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves a list of tags applied to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        Retrieves a list of tags applied to the specified resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Immediately starts a scan of the policies applied to the specified resource.
     * </p>
     * 
     * @param startResourceScanRequest
     *        Starts a scan of the policies applied to the specified resource.
     * @return A Java Future containing the result of the StartResourceScan operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.StartResourceScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/StartResourceScan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartResourceScanResult> startResourceScanAsync(StartResourceScanRequest startResourceScanRequest);

    /**
     * <p>
     * Immediately starts a scan of the policies applied to the specified resource.
     * </p>
     * 
     * @param startResourceScanRequest
     *        Starts a scan of the policies applied to the specified resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartResourceScan operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.StartResourceScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/StartResourceScan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartResourceScanResult> startResourceScanAsync(StartResourceScanRequest startResourceScanRequest,
            com.amazonaws.handlers.AsyncHandler<StartResourceScanRequest, StartResourceScanResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds a tag to the specified resource.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Adds a tag to the specified resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from the specified resource.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Removes a tag from the specified resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the criteria and values for the specified archive rule.
     * </p>
     * 
     * @param updateArchiveRuleRequest
     *        Updates the specified archive rule.
     * @return A Java Future containing the result of the UpdateArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.UpdateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateArchiveRuleResult> updateArchiveRuleAsync(UpdateArchiveRuleRequest updateArchiveRuleRequest);

    /**
     * <p>
     * Updates the criteria and values for the specified archive rule.
     * </p>
     * 
     * @param updateArchiveRuleRequest
     *        Updates the specified archive rule.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateArchiveRule operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.UpdateArchiveRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateArchiveRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateArchiveRuleResult> updateArchiveRuleAsync(UpdateArchiveRuleRequest updateArchiveRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateArchiveRuleRequest, UpdateArchiveRuleResult> asyncHandler);

    /**
     * <p>
     * Updates the status for the specified findings.
     * </p>
     * 
     * @param updateFindingsRequest
     *        Updates findings with the new values provided in the request.
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSAccessAnalyzerAsync.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * Updates the status for the specified findings.
     * </p>
     * 
     * @param updateFindingsRequest
     *        Updates findings with the new values provided in the request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSAccessAnalyzerAsyncHandler.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UpdateFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler);

}

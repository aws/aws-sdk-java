/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;

/**
 * Interface for accessing AWS X-Ray asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.xray.AbstractAWSXRayAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services X-Ray provides APIs for managing debug traces and retrieving service maps and other data created
 * by processing those traces.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSXRayAsync extends AWSXRay {

    /**
     * <p>
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
     * a single request. Use <code>GetTraceSummaries</code> to get a list of trace IDs.
     * </p>
     * 
     * @param batchGetTracesRequest
     * @return A Java Future containing the result of the BatchGetTraces operation returned by the service.
     * @sample AWSXRayAsync.BatchGetTraces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/BatchGetTraces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest batchGetTracesRequest);

    /**
     * <p>
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
     * a single request. Use <code>GetTraceSummaries</code> to get a list of trace IDs.
     * </p>
     * 
     * @param batchGetTracesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetTraces operation returned by the service.
     * @sample AWSXRayAsyncHandler.BatchGetTraces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/BatchGetTraces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetTracesResult> batchGetTracesAsync(BatchGetTracesRequest batchGetTracesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetTracesRequest, BatchGetTracesResult> asyncHandler);

    /**
     * <p>
     * Creates a group resource with a name and a filter expression.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSXRayAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a group resource with a name and a filter expression.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSXRayAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with <a
     * href="https://docs.aws.amazon.com/xray/latest/api/API_GetSamplingRules.html">GetSamplingRules</a>, and evaluate
     * each rule in ascending order of <i>priority</i> for each request. If a rule matches, the service records a trace,
     * borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with <a
     * href="https://docs.aws.amazon.com/xray/latest/api/API_GetSamplingTargets.html">GetSamplingTargets</a> to get
     * updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of
     * borrowing from the reservoir.
     * </p>
     * 
     * @param createSamplingRuleRequest
     * @return A Java Future containing the result of the CreateSamplingRule operation returned by the service.
     * @sample AWSXRayAsync.CreateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSamplingRuleResult> createSamplingRuleAsync(CreateSamplingRuleRequest createSamplingRuleRequest);

    /**
     * <p>
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with <a
     * href="https://docs.aws.amazon.com/xray/latest/api/API_GetSamplingRules.html">GetSamplingRules</a>, and evaluate
     * each rule in ascending order of <i>priority</i> for each request. If a rule matches, the service records a trace,
     * borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with <a
     * href="https://docs.aws.amazon.com/xray/latest/api/API_GetSamplingTargets.html">GetSamplingTargets</a> to get
     * updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of
     * borrowing from the reservoir.
     * </p>
     * 
     * @param createSamplingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSamplingRule operation returned by the service.
     * @sample AWSXRayAsyncHandler.CreateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSamplingRuleResult> createSamplingRuleAsync(CreateSamplingRuleRequest createSamplingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSamplingRuleRequest, CreateSamplingRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a group resource.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSXRayAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a group resource.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSXRayAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource policy from the target Amazon Web Services account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSXRayAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a resource policy from the target Amazon Web Services account.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSXRayAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a sampling rule.
     * </p>
     * 
     * @param deleteSamplingRuleRequest
     * @return A Java Future containing the result of the DeleteSamplingRule operation returned by the service.
     * @sample AWSXRayAsync.DeleteSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSamplingRuleResult> deleteSamplingRuleAsync(DeleteSamplingRuleRequest deleteSamplingRuleRequest);

    /**
     * <p>
     * Deletes a sampling rule.
     * </p>
     * 
     * @param deleteSamplingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSamplingRule operation returned by the service.
     * @sample AWSXRayAsyncHandler.DeleteSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSamplingRuleResult> deleteSamplingRuleAsync(DeleteSamplingRuleRequest deleteSamplingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSamplingRuleRequest, DeleteSamplingRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current encryption configuration for X-Ray data.
     * </p>
     * 
     * @param getEncryptionConfigRequest
     * @return A Java Future containing the result of the GetEncryptionConfig operation returned by the service.
     * @sample AWSXRayAsync.GetEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEncryptionConfigResult> getEncryptionConfigAsync(GetEncryptionConfigRequest getEncryptionConfigRequest);

    /**
     * <p>
     * Retrieves the current encryption configuration for X-Ray data.
     * </p>
     * 
     * @param getEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEncryptionConfig operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEncryptionConfigResult> getEncryptionConfigAsync(GetEncryptionConfigRequest getEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetEncryptionConfigRequest, GetEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Retrieves group resource details.
     * </p>
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSXRayAsync.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Retrieves group resource details.
     * </p>
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves all active group details.
     * </p>
     * 
     * @param getGroupsRequest
     * @return A Java Future containing the result of the GetGroups operation returned by the service.
     * @sample AWSXRayAsync.GetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupsResult> getGroupsAsync(GetGroupsRequest getGroupsRequest);

    /**
     * <p>
     * Retrieves all active group details.
     * </p>
     * 
     * @param getGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroups operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupsResult> getGroupsAsync(GetGroupsRequest getGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupsRequest, GetGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the summary information of an insight. This includes impact to clients and root cause services, the top
     * anomalous services, the category, the state of the insight, and the start and end time of the insight.
     * </p>
     * 
     * @param getInsightRequest
     * @return A Java Future containing the result of the GetInsight operation returned by the service.
     * @sample AWSXRayAsync.GetInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResult> getInsightAsync(GetInsightRequest getInsightRequest);

    /**
     * <p>
     * Retrieves the summary information of an insight. This includes impact to clients and root cause services, the top
     * anomalous services, the category, the state of the insight, and the start and end time of the insight.
     * </p>
     * 
     * @param getInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsight operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResult> getInsightAsync(GetInsightRequest getInsightRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightRequest, GetInsightResult> asyncHandler);

    /**
     * <p>
     * X-Ray reevaluates insights periodically until they're resolved, and records each intermediate state as an event.
     * You can review an insight's events in the Impact Timeline on the Inspect page in the X-Ray console.
     * </p>
     * 
     * @param getInsightEventsRequest
     * @return A Java Future containing the result of the GetInsightEvents operation returned by the service.
     * @sample AWSXRayAsync.GetInsightEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightEventsResult> getInsightEventsAsync(GetInsightEventsRequest getInsightEventsRequest);

    /**
     * <p>
     * X-Ray reevaluates insights periodically until they're resolved, and records each intermediate state as an event.
     * You can review an insight's events in the Impact Timeline on the Inspect page in the X-Ray console.
     * </p>
     * 
     * @param getInsightEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightEvents operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetInsightEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightEventsResult> getInsightEventsAsync(GetInsightEventsRequest getInsightEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightEventsRequest, GetInsightEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a service graph structure filtered by the specified insight. The service graph is limited to only
     * structural information. For a complete service graph, use this API with the GetServiceGraph API.
     * </p>
     * 
     * @param getInsightImpactGraphRequest
     * @return A Java Future containing the result of the GetInsightImpactGraph operation returned by the service.
     * @sample AWSXRayAsync.GetInsightImpactGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightImpactGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightImpactGraphResult> getInsightImpactGraphAsync(GetInsightImpactGraphRequest getInsightImpactGraphRequest);

    /**
     * <p>
     * Retrieves a service graph structure filtered by the specified insight. The service graph is limited to only
     * structural information. For a complete service graph, use this API with the GetServiceGraph API.
     * </p>
     * 
     * @param getInsightImpactGraphRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightImpactGraph operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetInsightImpactGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightImpactGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightImpactGraphResult> getInsightImpactGraphAsync(GetInsightImpactGraphRequest getInsightImpactGraphRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightImpactGraphRequest, GetInsightImpactGraphResult> asyncHandler);

    /**
     * <p>
     * Retrieves the summaries of all insights in the specified group matching the provided filter values.
     * </p>
     * 
     * @param getInsightSummariesRequest
     * @return A Java Future containing the result of the GetInsightSummaries operation returned by the service.
     * @sample AWSXRayAsync.GetInsightSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightSummaries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightSummariesResult> getInsightSummariesAsync(GetInsightSummariesRequest getInsightSummariesRequest);

    /**
     * <p>
     * Retrieves the summaries of all insights in the specified group matching the provided filter values.
     * </p>
     * 
     * @param getInsightSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightSummaries operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetInsightSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetInsightSummaries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightSummariesResult> getInsightSummariesAsync(GetInsightSummariesRequest getInsightSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightSummariesRequest, GetInsightSummariesResult> asyncHandler);

    /**
     * <p>
     * Retrieves all sampling rules.
     * </p>
     * 
     * @param getSamplingRulesRequest
     * @return A Java Future containing the result of the GetSamplingRules operation returned by the service.
     * @sample AWSXRayAsync.GetSamplingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSamplingRulesResult> getSamplingRulesAsync(GetSamplingRulesRequest getSamplingRulesRequest);

    /**
     * <p>
     * Retrieves all sampling rules.
     * </p>
     * 
     * @param getSamplingRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSamplingRules operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetSamplingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSamplingRulesResult> getSamplingRulesAsync(GetSamplingRulesRequest getSamplingRulesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSamplingRulesRequest, GetSamplingRulesResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about recent sampling results for all sampling rules.
     * </p>
     * 
     * @param getSamplingStatisticSummariesRequest
     * @return A Java Future containing the result of the GetSamplingStatisticSummaries operation returned by the
     *         service.
     * @sample AWSXRayAsync.GetSamplingStatisticSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingStatisticSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSamplingStatisticSummariesResult> getSamplingStatisticSummariesAsync(
            GetSamplingStatisticSummariesRequest getSamplingStatisticSummariesRequest);

    /**
     * <p>
     * Retrieves information about recent sampling results for all sampling rules.
     * </p>
     * 
     * @param getSamplingStatisticSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSamplingStatisticSummaries operation returned by the
     *         service.
     * @sample AWSXRayAsyncHandler.GetSamplingStatisticSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingStatisticSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSamplingStatisticSummariesResult> getSamplingStatisticSummariesAsync(
            GetSamplingStatisticSummariesRequest getSamplingStatisticSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSamplingStatisticSummariesRequest, GetSamplingStatisticSummariesResult> asyncHandler);

    /**
     * <p>
     * Requests a sampling quota for rules that the service is using to sample requests.
     * </p>
     * 
     * @param getSamplingTargetsRequest
     * @return A Java Future containing the result of the GetSamplingTargets operation returned by the service.
     * @sample AWSXRayAsync.GetSamplingTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSamplingTargetsResult> getSamplingTargetsAsync(GetSamplingTargetsRequest getSamplingTargetsRequest);

    /**
     * <p>
     * Requests a sampling quota for rules that the service is using to sample requests.
     * </p>
     * 
     * @param getSamplingTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSamplingTargets operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetSamplingTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSamplingTargetsResult> getSamplingTargetsAsync(GetSamplingTargetsRequest getSamplingTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSamplingTargetsRequest, GetSamplingTargetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a document that describes services that process incoming requests, and downstream services that they
     * call as a result. Root services process incoming requests and make calls to downstream services. Root services
     * are applications that use the <a href="https://docs.aws.amazon.com/xray/index.html">Amazon Web Services X-Ray
     * SDK</a>. Downstream services can be other applications, Amazon Web Services resources, HTTP web APIs, or SQL
     * databases.
     * </p>
     * 
     * @param getServiceGraphRequest
     * @return A Java Future containing the result of the GetServiceGraph operation returned by the service.
     * @sample AWSXRayAsync.GetServiceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetServiceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest getServiceGraphRequest);

    /**
     * <p>
     * Retrieves a document that describes services that process incoming requests, and downstream services that they
     * call as a result. Root services process incoming requests and make calls to downstream services. Root services
     * are applications that use the <a href="https://docs.aws.amazon.com/xray/index.html">Amazon Web Services X-Ray
     * SDK</a>. Downstream services can be other applications, Amazon Web Services resources, HTTP web APIs, or SQL
     * databases.
     * </p>
     * 
     * @param getServiceGraphRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceGraph operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetServiceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetServiceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceGraphResult> getServiceGraphAsync(GetServiceGraphRequest getServiceGraphRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceGraphRequest, GetServiceGraphResult> asyncHandler);

    /**
     * <p>
     * Get an aggregation of service statistics defined by a specific time range.
     * </p>
     * 
     * @param getTimeSeriesServiceStatisticsRequest
     * @return A Java Future containing the result of the GetTimeSeriesServiceStatistics operation returned by the
     *         service.
     * @sample AWSXRayAsync.GetTimeSeriesServiceStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTimeSeriesServiceStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTimeSeriesServiceStatisticsResult> getTimeSeriesServiceStatisticsAsync(
            GetTimeSeriesServiceStatisticsRequest getTimeSeriesServiceStatisticsRequest);

    /**
     * <p>
     * Get an aggregation of service statistics defined by a specific time range.
     * </p>
     * 
     * @param getTimeSeriesServiceStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTimeSeriesServiceStatistics operation returned by the
     *         service.
     * @sample AWSXRayAsyncHandler.GetTimeSeriesServiceStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTimeSeriesServiceStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTimeSeriesServiceStatisticsResult> getTimeSeriesServiceStatisticsAsync(
            GetTimeSeriesServiceStatisticsRequest getTimeSeriesServiceStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTimeSeriesServiceStatisticsRequest, GetTimeSeriesServiceStatisticsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a service graph for one or more specific trace IDs.
     * </p>
     * 
     * @param getTraceGraphRequest
     * @return A Java Future containing the result of the GetTraceGraph operation returned by the service.
     * @sample AWSXRayAsync.GetTraceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest getTraceGraphRequest);

    /**
     * <p>
     * Retrieves a service graph for one or more specific trace IDs.
     * </p>
     * 
     * @param getTraceGraphRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTraceGraph operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetTraceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTraceGraphResult> getTraceGraphAsync(GetTraceGraphRequest getTraceGraphRequest,
            com.amazonaws.handlers.AsyncHandler<GetTraceGraphRequest, GetTraceGraphResult> asyncHandler);

    /**
     * <p>
     * Retrieves IDs and annotations for traces available for a specified time frame using an optional filter. To get
     * the full traces, pass the trace IDs to <code>BatchGetTraces</code>.
     * </p>
     * <p>
     * A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come
     * from a known user. For example, the following filter expression targets traces that pass through
     * <code>api.example.com</code>:
     * </p>
     * <p>
     * <code>service("api.example.com")</code>
     * </p>
     * <p>
     * This filter expression finds traces that have an annotation named <code>account</code> with the value
     * <code>12345</code>:
     * </p>
     * <p>
     * <code>annotation.account = "12345"</code>
     * </p>
     * <p>
     * For a full list of indexed fields and keywords that you can use in filter expressions, see <a
     * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html">Using Filter Expressions</a> in
     * the <i>Amazon Web Services X-Ray Developer Guide</i>.
     * </p>
     * 
     * @param getTraceSummariesRequest
     * @return A Java Future containing the result of the GetTraceSummaries operation returned by the service.
     * @sample AWSXRayAsync.GetTraceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceSummaries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest getTraceSummariesRequest);

    /**
     * <p>
     * Retrieves IDs and annotations for traces available for a specified time frame using an optional filter. To get
     * the full traces, pass the trace IDs to <code>BatchGetTraces</code>.
     * </p>
     * <p>
     * A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come
     * from a known user. For example, the following filter expression targets traces that pass through
     * <code>api.example.com</code>:
     * </p>
     * <p>
     * <code>service("api.example.com")</code>
     * </p>
     * <p>
     * This filter expression finds traces that have an annotation named <code>account</code> with the value
     * <code>12345</code>:
     * </p>
     * <p>
     * <code>annotation.account = "12345"</code>
     * </p>
     * <p>
     * For a full list of indexed fields and keywords that you can use in filter expressions, see <a
     * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html">Using Filter Expressions</a> in
     * the <i>Amazon Web Services X-Ray Developer Guide</i>.
     * </p>
     * 
     * @param getTraceSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTraceSummaries operation returned by the service.
     * @sample AWSXRayAsyncHandler.GetTraceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceSummaries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTraceSummariesResult> getTraceSummariesAsync(GetTraceSummariesRequest getTraceSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<GetTraceSummariesRequest, GetTraceSummariesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of resource policies in the target Amazon Web Services account.
     * </p>
     * 
     * @param listResourcePoliciesRequest
     * @return A Java Future containing the result of the ListResourcePolicies operation returned by the service.
     * @sample AWSXRayAsync.ListResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ListResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcePoliciesResult> listResourcePoliciesAsync(ListResourcePoliciesRequest listResourcePoliciesRequest);

    /**
     * <p>
     * Returns the list of resource policies in the target Amazon Web Services account.
     * </p>
     * 
     * @param listResourcePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourcePolicies operation returned by the service.
     * @sample AWSXRayAsyncHandler.ListResourcePolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ListResourcePolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcePoliciesResult> listResourcePoliciesAsync(ListResourcePoliciesRequest listResourcePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcePoliciesRequest, ListResourcePoliciesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags that are applied to the specified Amazon Web Services X-Ray group or sampling rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSXRayAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags that are applied to the specified Amazon Web Services X-Ray group or sampling rule.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSXRayAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the encryption configuration for X-Ray data.
     * </p>
     * 
     * @param putEncryptionConfigRequest
     * @return A Java Future containing the result of the PutEncryptionConfig operation returned by the service.
     * @sample AWSXRayAsync.PutEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEncryptionConfigResult> putEncryptionConfigAsync(PutEncryptionConfigRequest putEncryptionConfigRequest);

    /**
     * <p>
     * Updates the encryption configuration for X-Ray data.
     * </p>
     * 
     * @param putEncryptionConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEncryptionConfig operation returned by the service.
     * @sample AWSXRayAsyncHandler.PutEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEncryptionConfigResult> putEncryptionConfigAsync(PutEncryptionConfigRequest putEncryptionConfigRequest,
            com.amazonaws.handlers.AsyncHandler<PutEncryptionConfigRequest, PutEncryptionConfigResult> asyncHandler);

    /**
     * <p>
     * Sets the resource policy to grant one or more Amazon Web Services services and accounts permissions to access
     * X-Ray. Each resource policy will be associated with a specific Amazon Web Services account. Each Amazon Web
     * Services account can have a maximum of 5 resource policies, and each policy name must be unique within that
     * account. The maximum size of each resource policy is 5KB.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSXRayAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Sets the resource policy to grant one or more Amazon Web Services services and accounts permissions to access
     * X-Ray. Each resource policy will be associated with a specific Amazon Web Services account. Each Amazon Web
     * Services account can have a maximum of 5 resource policies, and each policy name must be unique within that
     * account. The maximum size of each resource policy is 5KB.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSXRayAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutResourcePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Used by the Amazon Web Services X-Ray daemon to upload telemetry.
     * </p>
     * 
     * @param putTelemetryRecordsRequest
     * @return A Java Future containing the result of the PutTelemetryRecords operation returned by the service.
     * @sample AWSXRayAsync.PutTelemetryRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTelemetryRecords" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest putTelemetryRecordsRequest);

    /**
     * <p>
     * Used by the Amazon Web Services X-Ray daemon to upload telemetry.
     * </p>
     * 
     * @param putTelemetryRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTelemetryRecords operation returned by the service.
     * @sample AWSXRayAsyncHandler.PutTelemetryRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTelemetryRecords" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTelemetryRecordsResult> putTelemetryRecordsAsync(PutTelemetryRecordsRequest putTelemetryRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<PutTelemetryRecordsRequest, PutTelemetryRecordsResult> asyncHandler);

    /**
     * <p>
     * Uploads segment documents to Amazon Web Services X-Ray. The <a
     * href="https://docs.aws.amazon.com/xray/index.html">X-Ray SDK</a> generates segment documents and sends them to
     * the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress
     * segment, or an array of subsegments.
     * </p>
     * <p>
     * Segments must include the following fields. For the full segment document schema, see <a
     * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">Amazon Web Services X-Ray
     * Segment Documents</a> in the <i>Amazon Web Services X-Ray Developer Guide</i>.
     * </p>
     * <p class="title">
     * <b>Required segment document fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in-progress segment when your application receives a
     * request that will take a long time to serve, to trace that the request was received. When the response is sent,
     * send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, for instance, <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putTraceSegmentsRequest
     * @return A Java Future containing the result of the PutTraceSegments operation returned by the service.
     * @sample AWSXRayAsync.PutTraceSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest putTraceSegmentsRequest);

    /**
     * <p>
     * Uploads segment documents to Amazon Web Services X-Ray. The <a
     * href="https://docs.aws.amazon.com/xray/index.html">X-Ray SDK</a> generates segment documents and sends them to
     * the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress
     * segment, or an array of subsegments.
     * </p>
     * <p>
     * Segments must include the following fields. For the full segment document schema, see <a
     * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">Amazon Web Services X-Ray
     * Segment Documents</a> in the <i>Amazon Web Services X-Ray Developer Guide</i>.
     * </p>
     * <p class="title">
     * <b>Required segment document fields</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code> - The name of the service that handled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code> - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal
     * digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>trace_id</code> - A unique identifier that connects all segments and subsegments originating from a single
     * client request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_time</code> - Time the segment or subsegment was created, in floating point seconds in epoch time,
     * accurate to milliseconds. For example, <code>1480615200.010</code> or <code>1.480615200010E9</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>end_time</code> - Time the segment or subsegment was closed. For example, <code>1480615200.090</code> or
     * <code>1.480615200090E9</code>. Specify either an <code>end_time</code> or <code>in_progress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>in_progress</code> - Set to <code>true</code> instead of specifying an <code>end_time</code> to record that
     * a segment has been started, but is not complete. Send an in-progress segment when your application receives a
     * request that will take a long time to serve, to trace that the request was received. When the response is sent,
     * send the complete segment to overwrite the in-progress segment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A <code>trace_id</code> consists of three numbers separated by hyphens. For example,
     * 1-58406520-a006649127e371903a2de979. This includes:
     * </p>
     * <p class="title">
     * <b>Trace ID Format</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number, for instance, <code>1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd,
     * 2016 PST in epoch time is <code>1480615200</code> seconds, or <code>58406520</code> in hexadecimal.
     * </p>
     * </li>
     * <li>
     * <p>
     * A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param putTraceSegmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTraceSegments operation returned by the service.
     * @sample AWSXRayAsyncHandler.PutTraceSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTraceSegmentsResult> putTraceSegmentsAsync(PutTraceSegmentsRequest putTraceSegmentsRequest,
            com.amazonaws.handlers.AsyncHandler<PutTraceSegmentsRequest, PutTraceSegmentsResult> asyncHandler);

    /**
     * <p>
     * Applies tags to an existing Amazon Web Services X-Ray group or sampling rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSXRayAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies tags to an existing Amazon Web Services X-Ray group or sampling rule.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSXRayAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from an Amazon Web Services X-Ray group or sampling rule. You cannot edit or delete system tags
     * (those with an <code>aws:</code> prefix).
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSXRayAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from an Amazon Web Services X-Ray group or sampling rule. You cannot edit or delete system tags
     * (those with an <code>aws:</code> prefix).
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSXRayAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a group resource.
     * </p>
     * 
     * @param updateGroupRequest
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSXRayAsync.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Updates a group resource.
     * </p>
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSXRayAsyncHandler.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies a sampling rule's configuration.
     * </p>
     * 
     * @param updateSamplingRuleRequest
     * @return A Java Future containing the result of the UpdateSamplingRule operation returned by the service.
     * @sample AWSXRayAsync.UpdateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSamplingRuleResult> updateSamplingRuleAsync(UpdateSamplingRuleRequest updateSamplingRuleRequest);

    /**
     * <p>
     * Modifies a sampling rule's configuration.
     * </p>
     * 
     * @param updateSamplingRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSamplingRule operation returned by the service.
     * @sample AWSXRayAsyncHandler.UpdateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSamplingRuleResult> updateSamplingRuleAsync(UpdateSamplingRuleRequest updateSamplingRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSamplingRuleRequest, UpdateSamplingRuleResult> asyncHandler);

}

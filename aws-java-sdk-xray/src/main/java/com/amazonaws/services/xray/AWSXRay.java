/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.xray.model.*;

/**
 * Interface for accessing AWS X-Ray.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.xray.AbstractAWSXRay} instead.
 * </p>
 * <p>
 * <p>
 * AWS X-Ray provides APIs for managing debug traces and retrieving service maps and other data created by processing
 * those traces.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSXRay {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "xray";

    /**
     * Overrides the default endpoint for this client ("xray.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "xray.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "xray.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "xray.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "xray.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSXRay#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from
     * a single request. Use <code>GetTraceSummaries</code> to get a list of trace IDs.
     * </p>
     * 
     * @param batchGetTracesRequest
     * @return Result of the BatchGetTraces operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.BatchGetTraces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/BatchGetTraces" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetTracesResult batchGetTraces(BatchGetTracesRequest batchGetTracesRequest);

    /**
     * <p>
     * Creates a group resource with a name and a filter expression.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with
     * <a>GetSamplingRules</a>, and evaluate each rule in ascending order of <i>priority</i> for each request. If a rule
     * matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports
     * back to X-Ray with <a>GetSamplingTargets</a> to get updated versions of each in-use rule. The updated rule
     * contains a trace quota that the service can use instead of borrowing from the reservoir.
     * </p>
     * 
     * @param createSamplingRuleRequest
     * @return Result of the CreateSamplingRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @throws RuleLimitExceededException
     *         You have reached the maximum number of sampling rules.
     * @sample AWSXRay.CreateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSamplingRuleResult createSamplingRule(CreateSamplingRuleRequest createSamplingRuleRequest);

    /**
     * <p>
     * Deletes a group resource.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a sampling rule.
     * </p>
     * 
     * @param deleteSamplingRuleRequest
     * @return Result of the DeleteSamplingRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.DeleteSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/DeleteSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSamplingRuleResult deleteSamplingRule(DeleteSamplingRuleRequest deleteSamplingRuleRequest);

    /**
     * <p>
     * Retrieves the current encryption configuration for X-Ray data.
     * </p>
     * 
     * @param getEncryptionConfigRequest
     * @return Result of the GetEncryptionConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    GetEncryptionConfigResult getEncryptionConfig(GetEncryptionConfigRequest getEncryptionConfigRequest);

    /**
     * <p>
     * Retrieves group resource details.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Retrieves all active group details.
     * </p>
     * 
     * @param getGroupsRequest
     * @return Result of the GetGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupsResult getGroups(GetGroupsRequest getGroupsRequest);

    /**
     * <p>
     * Retrieves all sampling rules.
     * </p>
     * 
     * @param getSamplingRulesRequest
     * @return Result of the GetSamplingRules operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetSamplingRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingRules" target="_top">AWS API
     *      Documentation</a>
     */
    GetSamplingRulesResult getSamplingRules(GetSamplingRulesRequest getSamplingRulesRequest);

    /**
     * <p>
     * Retrieves information about recent sampling results for all sampling rules.
     * </p>
     * 
     * @param getSamplingStatisticSummariesRequest
     * @return Result of the GetSamplingStatisticSummaries operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetSamplingStatisticSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingStatisticSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    GetSamplingStatisticSummariesResult getSamplingStatisticSummaries(GetSamplingStatisticSummariesRequest getSamplingStatisticSummariesRequest);

    /**
     * <p>
     * Requests a sampling quota for rules that the service is using to sample requests.
     * </p>
     * 
     * @param getSamplingTargetsRequest
     * @return Result of the GetSamplingTargets operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetSamplingTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingTargets" target="_top">AWS API
     *      Documentation</a>
     */
    GetSamplingTargetsResult getSamplingTargets(GetSamplingTargetsRequest getSamplingTargetsRequest);

    /**
     * <p>
     * Retrieves a document that describes services that process incoming requests, and downstream services that they
     * call as a result. Root services process incoming requests and make calls to downstream services. Root services
     * are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP
     * web APIs, or SQL databases.
     * </p>
     * 
     * @param getServiceGraphRequest
     * @return Result of the GetServiceGraph operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetServiceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetServiceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceGraphResult getServiceGraph(GetServiceGraphRequest getServiceGraphRequest);

    /**
     * <p>
     * Retrieves a service graph for one or more specific trace IDs.
     * </p>
     * 
     * @param getTraceGraphRequest
     * @return Result of the GetTraceGraph operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetTraceGraph
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceGraph" target="_top">AWS API
     *      Documentation</a>
     */
    GetTraceGraphResult getTraceGraph(GetTraceGraphRequest getTraceGraphRequest);

    /**
     * <p>
     * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the
     * full traces, pass the trace IDs to <code>BatchGetTraces</code>.
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
     * href="http://docs.aws.amazon.com/xray/latest/devguide/xray-console-filters.html">Using Filter Expressions</a> in
     * the <i>AWS X-Ray Developer Guide</i>.
     * </p>
     * 
     * @param getTraceSummariesRequest
     * @return Result of the GetTraceSummaries operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.GetTraceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTraceSummaries" target="_top">AWS API
     *      Documentation</a>
     */
    GetTraceSummariesResult getTraceSummaries(GetTraceSummariesRequest getTraceSummariesRequest);

    /**
     * <p>
     * Updates the encryption configuration for X-Ray data.
     * </p>
     * 
     * @param putEncryptionConfigRequest
     * @return Result of the PutEncryptionConfig operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.PutEncryptionConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutEncryptionConfig" target="_top">AWS API
     *      Documentation</a>
     */
    PutEncryptionConfigResult putEncryptionConfig(PutEncryptionConfigRequest putEncryptionConfigRequest);

    /**
     * <p>
     * Used by the AWS X-Ray daemon to upload telemetry.
     * </p>
     * 
     * @param putTelemetryRecordsRequest
     * @return Result of the PutTelemetryRecords operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.PutTelemetryRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTelemetryRecords" target="_top">AWS API
     *      Documentation</a>
     */
    PutTelemetryRecordsResult putTelemetryRecords(PutTelemetryRecordsRequest putTelemetryRecordsRequest);

    /**
     * <p>
     * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray
     * daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or
     * an array of subsegments.
     * </p>
     * <p>
     * Segments must include the following fields. For the full segment document schema, see <a
     * href="https://docs.aws.amazon.com/xray/latest/devguide/xray-api-segmentdocuments.html">AWS X-Ray Segment
     * Documents</a> in the <i>AWS X-Ray Developer Guide</i>.
     * </p>
     * <p class="title">
     * <b>Required Segment Document Fields</b>
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
     * a segment has been started, but is not complete. Send an in progress segment when your application receives a
     * request that will take a long time to serve, to trace the fact that the request was received. When the response
     * is sent, send the complete segment to overwrite the in-progress segment.
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
     * The version number, i.e. <code>1</code>.
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
     * @return Result of the PutTraceSegments operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.PutTraceSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTraceSegments" target="_top">AWS API
     *      Documentation</a>
     */
    PutTraceSegmentsResult putTraceSegments(PutTraceSegmentsRequest putTraceSegmentsRequest);

    /**
     * <p>
     * Updates a group resource.
     * </p>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Modifies a sampling rule's configuration.
     * </p>
     * 
     * @param updateSamplingRuleRequest
     * @return Result of the UpdateSamplingRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is missing required parameters or has invalid parameters.
     * @throws ThrottledException
     *         The request exceeds the maximum number of requests per second.
     * @sample AWSXRay.UpdateSamplingRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateSamplingRule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSamplingRuleResult updateSamplingRule(UpdateSamplingRuleRequest updateSamplingRuleRequest);

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

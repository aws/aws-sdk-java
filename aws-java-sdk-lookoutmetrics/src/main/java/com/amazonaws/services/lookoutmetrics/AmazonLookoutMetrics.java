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
package com.amazonaws.services.lookoutmetrics;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lookoutmetrics.model.*;

/**
 * Interface for accessing LookoutMetrics.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutmetrics.AbstractAmazonLookoutMetrics} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Amazon Lookout for Metrics API Reference</i>. For an introduction to the service with tutorials for
 * getting started, visit <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev">Amazon Lookout for Metrics
 * Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLookoutMetrics {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lookoutmetrics";

    /**
     * <p>
     * Activates an anomaly detector.
     * </p>
     * 
     * @param activateAnomalyDetectorRequest
     * @return Result of the ActivateAnomalyDetector operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @sample AmazonLookoutMetrics.ActivateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ActivateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    ActivateAnomalyDetectorResult activateAnomalyDetector(ActivateAnomalyDetectorRequest activateAnomalyDetectorRequest);

    /**
     * <p>
     * Runs a backtest for anomaly detection for the specified resource.
     * </p>
     * 
     * @param backTestAnomalyDetectorRequest
     * @return Result of the BackTestAnomalyDetector operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.BackTestAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/BackTestAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    BackTestAnomalyDetectorResult backTestAnomalyDetector(BackTestAnomalyDetectorRequest backTestAnomalyDetectorRequest);

    /**
     * <p>
     * Creates an alert for an anomaly detector.
     * </p>
     * 
     * @param createAlertRequest
     * @return Result of the CreateAlert operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service's quotas. Check the service quotas and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.CreateAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAlert" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAlertResult createAlert(CreateAlertRequest createAlertRequest);

    /**
     * <p>
     * Creates an anomaly detector.
     * </p>
     * 
     * @param createAnomalyDetectorRequest
     * @return Result of the CreateAnomalyDetector operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service's quotas. Check the service quotas and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.CreateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAnomalyDetectorResult createAnomalyDetector(CreateAnomalyDetectorRequest createAnomalyDetectorRequest);

    /**
     * <p>
     * Creates a dataset.
     * </p>
     * 
     * @param createMetricSetRequest
     * @return Result of the CreateMetricSet operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ServiceQuotaExceededException
     *         The request exceeded the service's quotas. Check the service quotas and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.CreateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMetricSetResult createMetricSet(CreateMetricSetRequest createMetricSetRequest);

    /**
     * <p>
     * Deletes an alert.
     * </p>
     * 
     * @param deleteAlertRequest
     * @return Result of the DeleteAlert operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DeleteAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAlert" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAlertResult deleteAlert(DeleteAlertRequest deleteAlertRequest);

    /**
     * <p>
     * Deletes a detector. Deleting an anomaly detector will delete all of its corresponding resources including any
     * configured datasets and alerts.
     * </p>
     * 
     * @param deleteAnomalyDetectorRequest
     * @return Result of the DeleteAnomalyDetector operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DeleteAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAnomalyDetectorResult deleteAnomalyDetector(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest);

    /**
     * <p>
     * Describes an alert.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param describeAlertRequest
     * @return Result of the DescribeAlert operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.DescribeAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAlert" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAlertResult describeAlert(DescribeAlertRequest describeAlertRequest);

    /**
     * <p>
     * Returns information about the status of the specified anomaly detection jobs.
     * </p>
     * 
     * @param describeAnomalyDetectionExecutionsRequest
     * @return Result of the DescribeAnomalyDetectionExecutions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DescribeAnomalyDetectionExecutions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetectionExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAnomalyDetectionExecutionsResult describeAnomalyDetectionExecutions(
            DescribeAnomalyDetectionExecutionsRequest describeAnomalyDetectionExecutionsRequest);

    /**
     * <p>
     * Describes a detector.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param describeAnomalyDetectorRequest
     * @return Result of the DescribeAnomalyDetector operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.DescribeAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAnomalyDetectorResult describeAnomalyDetector(DescribeAnomalyDetectorRequest describeAnomalyDetectorRequest);

    /**
     * <p>
     * Describes a dataset.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param describeMetricSetRequest
     * @return Result of the DescribeMetricSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.DescribeMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeMetricSet"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMetricSetResult describeMetricSet(DescribeMetricSetRequest describeMetricSetRequest);

    /**
     * <p>
     * Returns details about a group of anomalous metrics.
     * </p>
     * 
     * @param getAnomalyGroupRequest
     * @return Result of the GetAnomalyGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.GetAnomalyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetAnomalyGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetAnomalyGroupResult getAnomalyGroup(GetAnomalyGroupRequest getAnomalyGroupRequest);

    /**
     * <p>
     * Get feedback for an anomaly group.
     * </p>
     * 
     * @param getFeedbackRequest
     * @return Result of the GetFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.GetFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    GetFeedbackResult getFeedback(GetFeedbackRequest getFeedbackRequest);

    /**
     * <p>
     * Returns a selection of sample records from an Amazon S3 datasource.
     * </p>
     * 
     * @param getSampleDataRequest
     * @return Result of the GetSampleData operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.GetSampleData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetSampleData" target="_top">AWS
     *      API Documentation</a>
     */
    GetSampleDataResult getSampleData(GetSampleDataRequest getSampleDataRequest);

    /**
     * <p>
     * Lists the alerts attached to a detector.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param listAlertsRequest
     * @return Result of the ListAlerts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @sample AmazonLookoutMetrics.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    ListAlertsResult listAlerts(ListAlertsRequest listAlertsRequest);

    /**
     * <p>
     * Lists the detectors in the current AWS Region.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param listAnomalyDetectorsRequest
     * @return Result of the ListAnomalyDetectors operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.ListAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnomalyDetectorsResult listAnomalyDetectors(ListAnomalyDetectorsRequest listAnomalyDetectorsRequest);

    /**
     * <p>
     * Returns a list of anomaly groups.
     * </p>
     * 
     * @param listAnomalyGroupSummariesRequest
     * @return Result of the ListAnomalyGroupSummaries operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.ListAnomalyGroupSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnomalyGroupSummariesResult listAnomalyGroupSummaries(ListAnomalyGroupSummariesRequest listAnomalyGroupSummariesRequest);

    /**
     * <p>
     * Gets a list of anomalous metrics for a measure in an anomaly group.
     * </p>
     * 
     * @param listAnomalyGroupTimeSeriesRequest
     * @return Result of the ListAnomalyGroupTimeSeries operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.ListAnomalyGroupTimeSeries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupTimeSeries"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnomalyGroupTimeSeriesResult listAnomalyGroupTimeSeries(ListAnomalyGroupTimeSeriesRequest listAnomalyGroupTimeSeriesRequest);

    /**
     * <p>
     * Lists the datasets in the current AWS Region.
     * </p>
     * <p>
     * Amazon Lookout for Metrics API actions are eventually consistent. If you do a read operation on a resource
     * immediately after creating or modifying it, use retries to allow time for the write operation to complete.
     * </p>
     * 
     * @param listMetricSetsRequest
     * @return Result of the ListMetricSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AmazonLookoutMetrics.ListMetricSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListMetricSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListMetricSetsResult listMetricSets(ListMetricSetsRequest listMetricSetsRequest);

    /**
     * <p>
     * Gets a list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> for a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @sample AmazonLookoutMetrics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Add feedback for an anomalous metric.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    PutFeedbackResult putFeedback(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to a detector,
     * dataset, or alert.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @sample AmazonLookoutMetrics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> from a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @sample AmazonLookoutMetrics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a detector. After activation, you can only change a detector's ingestion delay and description.
     * </p>
     * 
     * @param updateAnomalyDetectorRequest
     * @return Result of the UpdateAnomalyDetector operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.UpdateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAnomalyDetectorResult updateAnomalyDetector(UpdateAnomalyDetectorRequest updateAnomalyDetectorRequest);

    /**
     * <p>
     * Updates a dataset.
     * </p>
     * 
     * @param updateMetricSetRequest
     * @return Result of the UpdateMetricSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource cannot be found. Check the ARN of the resource and try again.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by the AWS service. Check your input values and try
     *         again.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws AccessDeniedException
     *         You do not have sufficient permissions to perform this action.
     * @throws TooManyRequestsException
     *         The request was denied due to too many requests being submitted at the same time.
     * @sample AmazonLookoutMetrics.UpdateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMetricSetResult updateMetricSet(UpdateMetricSetRequest updateMetricSetRequest);

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

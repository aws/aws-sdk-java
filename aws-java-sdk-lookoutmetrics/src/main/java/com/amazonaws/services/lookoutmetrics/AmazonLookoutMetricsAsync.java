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

import com.amazonaws.services.lookoutmetrics.model.*;

/**
 * Interface for accessing LookoutMetrics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutmetrics.AbstractAmazonLookoutMetricsAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Amazon Lookout for Metrics API Reference</i>. For an introduction to the service with tutorials for
 * getting started, visit <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev">Amazon Lookout for Metrics
 * Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLookoutMetricsAsync extends AmazonLookoutMetrics {

    /**
     * <p>
     * Activates an anomaly detector.
     * </p>
     * 
     * @param activateAnomalyDetectorRequest
     * @return A Java Future containing the result of the ActivateAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ActivateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ActivateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateAnomalyDetectorResult> activateAnomalyDetectorAsync(ActivateAnomalyDetectorRequest activateAnomalyDetectorRequest);

    /**
     * <p>
     * Activates an anomaly detector.
     * </p>
     * 
     * @param activateAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ActivateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ActivateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateAnomalyDetectorResult> activateAnomalyDetectorAsync(ActivateAnomalyDetectorRequest activateAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateAnomalyDetectorRequest, ActivateAnomalyDetectorResult> asyncHandler);

    /**
     * <p>
     * Runs a backtest for anomaly detection for the specified resource.
     * </p>
     * 
     * @param backTestAnomalyDetectorRequest
     * @return A Java Future containing the result of the BackTestAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.BackTestAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/BackTestAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BackTestAnomalyDetectorResult> backTestAnomalyDetectorAsync(BackTestAnomalyDetectorRequest backTestAnomalyDetectorRequest);

    /**
     * <p>
     * Runs a backtest for anomaly detection for the specified resource.
     * </p>
     * 
     * @param backTestAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BackTestAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.BackTestAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/BackTestAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BackTestAnomalyDetectorResult> backTestAnomalyDetectorAsync(BackTestAnomalyDetectorRequest backTestAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<BackTestAnomalyDetectorRequest, BackTestAnomalyDetectorResult> asyncHandler);

    /**
     * <p>
     * Creates an alert for an anomaly detector.
     * </p>
     * 
     * @param createAlertRequest
     * @return A Java Future containing the result of the CreateAlert operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.CreateAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAlert" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlertResult> createAlertAsync(CreateAlertRequest createAlertRequest);

    /**
     * <p>
     * Creates an alert for an anomaly detector.
     * </p>
     * 
     * @param createAlertRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlert operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.CreateAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAlert" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlertResult> createAlertAsync(CreateAlertRequest createAlertRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAlertRequest, CreateAlertResult> asyncHandler);

    /**
     * <p>
     * Creates an anomaly detector.
     * </p>
     * 
     * @param createAnomalyDetectorRequest
     * @return A Java Future containing the result of the CreateAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.CreateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnomalyDetectorResult> createAnomalyDetectorAsync(CreateAnomalyDetectorRequest createAnomalyDetectorRequest);

    /**
     * <p>
     * Creates an anomaly detector.
     * </p>
     * 
     * @param createAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.CreateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnomalyDetectorResult> createAnomalyDetectorAsync(CreateAnomalyDetectorRequest createAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnomalyDetectorRequest, CreateAnomalyDetectorResult> asyncHandler);

    /**
     * <p>
     * Creates a dataset.
     * </p>
     * 
     * @param createMetricSetRequest
     * @return A Java Future containing the result of the CreateMetricSet operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.CreateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMetricSetResult> createMetricSetAsync(CreateMetricSetRequest createMetricSetRequest);

    /**
     * <p>
     * Creates a dataset.
     * </p>
     * 
     * @param createMetricSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMetricSet operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.CreateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMetricSetResult> createMetricSetAsync(CreateMetricSetRequest createMetricSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMetricSetRequest, CreateMetricSetResult> asyncHandler);

    /**
     * <p>
     * Deletes an alert.
     * </p>
     * 
     * @param deleteAlertRequest
     * @return A Java Future containing the result of the DeleteAlert operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.DeleteAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAlert" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlertResult> deleteAlertAsync(DeleteAlertRequest deleteAlertRequest);

    /**
     * <p>
     * Deletes an alert.
     * </p>
     * 
     * @param deleteAlertRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlert operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.DeleteAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAlert" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlertResult> deleteAlertAsync(DeleteAlertRequest deleteAlertRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlertRequest, DeleteAlertResult> asyncHandler);

    /**
     * <p>
     * Deletes a detector. Deleting an anomaly detector will delete all of its corresponding resources including any
     * configured datasets and alerts.
     * </p>
     * 
     * @param deleteAnomalyDetectorRequest
     * @return A Java Future containing the result of the DeleteAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.DeleteAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest);

    /**
     * <p>
     * Deletes a detector. Deleting an anomaly detector will delete all of its corresponding resources including any
     * configured datasets and alerts.
     * </p>
     * 
     * @param deleteAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.DeleteAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DeleteAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnomalyDetectorResult> deleteAnomalyDetectorAsync(DeleteAnomalyDetectorRequest deleteAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnomalyDetectorRequest, DeleteAnomalyDetectorResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAlert operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.DescribeAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAlert" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlertResult> describeAlertAsync(DescribeAlertRequest describeAlertRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlert operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.DescribeAlert
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAlert" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlertResult> describeAlertAsync(DescribeAlertRequest describeAlertRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlertRequest, DescribeAlertResult> asyncHandler);

    /**
     * <p>
     * Returns information about the status of the specified anomaly detection jobs.
     * </p>
     * 
     * @param describeAnomalyDetectionExecutionsRequest
     * @return A Java Future containing the result of the DescribeAnomalyDetectionExecutions operation returned by the
     *         service.
     * @sample AmazonLookoutMetricsAsync.DescribeAnomalyDetectionExecutions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetectionExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyDetectionExecutionsResult> describeAnomalyDetectionExecutionsAsync(
            DescribeAnomalyDetectionExecutionsRequest describeAnomalyDetectionExecutionsRequest);

    /**
     * <p>
     * Returns information about the status of the specified anomaly detection jobs.
     * </p>
     * 
     * @param describeAnomalyDetectionExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnomalyDetectionExecutions operation returned by the
     *         service.
     * @sample AmazonLookoutMetricsAsyncHandler.DescribeAnomalyDetectionExecutions
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetectionExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyDetectionExecutionsResult> describeAnomalyDetectionExecutionsAsync(
            DescribeAnomalyDetectionExecutionsRequest describeAnomalyDetectionExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectionExecutionsRequest, DescribeAnomalyDetectionExecutionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.DescribeAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyDetectorResult> describeAnomalyDetectorAsync(DescribeAnomalyDetectorRequest describeAnomalyDetectorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.DescribeAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAnomalyDetectorResult> describeAnomalyDetectorAsync(DescribeAnomalyDetectorRequest describeAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAnomalyDetectorRequest, DescribeAnomalyDetectorResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeMetricSet operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.DescribeMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeMetricSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricSetResult> describeMetricSetAsync(DescribeMetricSetRequest describeMetricSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMetricSet operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.DescribeMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeMetricSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMetricSetResult> describeMetricSetAsync(DescribeMetricSetRequest describeMetricSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricSetRequest, DescribeMetricSetResult> asyncHandler);

    /**
     * <p>
     * Returns details about a group of anomalous metrics.
     * </p>
     * 
     * @param getAnomalyGroupRequest
     * @return A Java Future containing the result of the GetAnomalyGroup operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.GetAnomalyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetAnomalyGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAnomalyGroupResult> getAnomalyGroupAsync(GetAnomalyGroupRequest getAnomalyGroupRequest);

    /**
     * <p>
     * Returns details about a group of anomalous metrics.
     * </p>
     * 
     * @param getAnomalyGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnomalyGroup operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.GetAnomalyGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetAnomalyGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAnomalyGroupResult> getAnomalyGroupAsync(GetAnomalyGroupRequest getAnomalyGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnomalyGroupRequest, GetAnomalyGroupResult> asyncHandler);

    /**
     * <p>
     * Get feedback for an anomaly group.
     * </p>
     * 
     * @param getFeedbackRequest
     * @return A Java Future containing the result of the GetFeedback operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.GetFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFeedbackResult> getFeedbackAsync(GetFeedbackRequest getFeedbackRequest);

    /**
     * <p>
     * Get feedback for an anomaly group.
     * </p>
     * 
     * @param getFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFeedback operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.GetFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFeedbackResult> getFeedbackAsync(GetFeedbackRequest getFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<GetFeedbackRequest, GetFeedbackResult> asyncHandler);

    /**
     * <p>
     * Returns a selection of sample records from an Amazon S3 datasource.
     * </p>
     * 
     * @param getSampleDataRequest
     * @return A Java Future containing the result of the GetSampleData operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.GetSampleData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetSampleData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSampleDataResult> getSampleDataAsync(GetSampleDataRequest getSampleDataRequest);

    /**
     * <p>
     * Returns a selection of sample records from an Amazon S3 datasource.
     * </p>
     * 
     * @param getSampleDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSampleData operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.GetSampleData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetSampleData" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSampleDataResult> getSampleDataAsync(GetSampleDataRequest getSampleDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetSampleDataRequest, GetSampleDataResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListAlerts operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest listAlertsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlerts operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest listAlertsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlertsRequest, ListAlertsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListAnomalyDetectors operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ListAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomalyDetectorsResult> listAnomalyDetectorsAsync(ListAnomalyDetectorsRequest listAnomalyDetectorsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnomalyDetectors operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ListAnomalyDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomalyDetectorsResult> listAnomalyDetectorsAsync(ListAnomalyDetectorsRequest listAnomalyDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnomalyDetectorsRequest, ListAnomalyDetectorsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of anomaly groups.
     * </p>
     * 
     * @param listAnomalyGroupSummariesRequest
     * @return A Java Future containing the result of the ListAnomalyGroupSummaries operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ListAnomalyGroupSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomalyGroupSummariesResult> listAnomalyGroupSummariesAsync(
            ListAnomalyGroupSummariesRequest listAnomalyGroupSummariesRequest);

    /**
     * <p>
     * Returns a list of anomaly groups.
     * </p>
     * 
     * @param listAnomalyGroupSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnomalyGroupSummaries operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ListAnomalyGroupSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomalyGroupSummariesResult> listAnomalyGroupSummariesAsync(
            ListAnomalyGroupSummariesRequest listAnomalyGroupSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnomalyGroupSummariesRequest, ListAnomalyGroupSummariesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of anomalous metrics for a measure in an anomaly group.
     * </p>
     * 
     * @param listAnomalyGroupTimeSeriesRequest
     * @return A Java Future containing the result of the ListAnomalyGroupTimeSeries operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ListAnomalyGroupTimeSeries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupTimeSeries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomalyGroupTimeSeriesResult> listAnomalyGroupTimeSeriesAsync(
            ListAnomalyGroupTimeSeriesRequest listAnomalyGroupTimeSeriesRequest);

    /**
     * <p>
     * Gets a list of anomalous metrics for a measure in an anomaly group.
     * </p>
     * 
     * @param listAnomalyGroupTimeSeriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnomalyGroupTimeSeries operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ListAnomalyGroupTimeSeries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupTimeSeries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnomalyGroupTimeSeriesResult> listAnomalyGroupTimeSeriesAsync(
            ListAnomalyGroupTimeSeriesRequest listAnomalyGroupTimeSeriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnomalyGroupTimeSeriesRequest, ListAnomalyGroupTimeSeriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMetricSets operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ListMetricSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListMetricSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricSetsResult> listMetricSetsAsync(ListMetricSetsRequest listMetricSetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMetricSets operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ListMetricSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListMetricSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMetricSetsResult> listMetricSetsAsync(ListMetricSetsRequest listMetricSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMetricSetsRequest, ListMetricSetsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> for a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets a list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> for a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Add feedback for an anomalous metric.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Add feedback for an anomalous metric.
     * </p>
     * 
     * @param putFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFeedback operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutFeedbackResult> putFeedbackAsync(PutFeedbackRequest putFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<PutFeedbackRequest, PutFeedbackResult> asyncHandler);

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to a detector,
     * dataset, or alert.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to a detector,
     * dataset, or alert.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> from a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> from a
     * detector, dataset, or alert.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a detector. After activation, you can only change a detector's ingestion delay and description.
     * </p>
     * 
     * @param updateAnomalyDetectorRequest
     * @return A Java Future containing the result of the UpdateAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.UpdateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnomalyDetectorResult> updateAnomalyDetectorAsync(UpdateAnomalyDetectorRequest updateAnomalyDetectorRequest);

    /**
     * <p>
     * Updates a detector. After activation, you can only change a detector's ingestion delay and description.
     * </p>
     * 
     * @param updateAnomalyDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnomalyDetector operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.UpdateAnomalyDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateAnomalyDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnomalyDetectorResult> updateAnomalyDetectorAsync(UpdateAnomalyDetectorRequest updateAnomalyDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnomalyDetectorRequest, UpdateAnomalyDetectorResult> asyncHandler);

    /**
     * <p>
     * Updates a dataset.
     * </p>
     * 
     * @param updateMetricSetRequest
     * @return A Java Future containing the result of the UpdateMetricSet operation returned by the service.
     * @sample AmazonLookoutMetricsAsync.UpdateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMetricSetResult> updateMetricSetAsync(UpdateMetricSetRequest updateMetricSetRequest);

    /**
     * <p>
     * Updates a dataset.
     * </p>
     * 
     * @param updateMetricSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMetricSet operation returned by the service.
     * @sample AmazonLookoutMetricsAsyncHandler.UpdateMetricSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/UpdateMetricSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMetricSetResult> updateMetricSetAsync(UpdateMetricSetRequest updateMetricSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMetricSetRequest, UpdateMetricSetResult> asyncHandler);

}

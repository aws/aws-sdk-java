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
package com.amazonaws.services.cloudwatchrum;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchrum.model.*;

/**
 * Interface for accessing CloudWatch RUM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudwatchrum.AbstractAWSCloudWatchRUMAsync} instead.
 * </p>
 * <p>
 * <p>
 * With Amazon CloudWatch RUM, you can perform real-user monitoring to collect client-side data about your web
 * application performance from actual user sessions in real time. The data collected includes page load times,
 * client-side errors, and user behavior. When you view this data, you can see it all aggregated together and also see
 * breakdowns by the browsers and devices that your customers use.
 * </p>
 * <p>
 * You can use the collected data to quickly identify and debug client-side performance issues. CloudWatch RUM helps you
 * visualize anomalies in your application performance and find relevant debugging data such as error messages, stack
 * traces, and user sessions. You can also use RUM to understand the range of end-user impact including the number of
 * users, geolocations, and browsers used.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudWatchRUMAsync extends AWSCloudWatchRUM {

    /**
     * <p>
     * Specifies the extended metrics that you want a CloudWatch RUM app monitor to send to a destination. Valid
     * destinations include CloudWatch and Evidently.
     * </p>
     * <p>
     * By default, RUM app monitors send some metrics to CloudWatch. These default metrics are listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-metrics.html">CloudWatch
     * metrics that you can collect with CloudWatch RUM</a>.
     * </p>
     * <p>
     * If you also send extended metrics, you can send metrics to Evidently as well as CloudWatch, and you can also
     * optionally send the metrics with additional dimensions. The valid dimension names for the additional dimensions
     * are <code>BrowserName</code>, <code>CountryCode</code>, <code>DeviceType</code>, <code>FileType</code>,
     * <code>OSName</code>, and <code>PageId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html">
     * Extended metrics that you can send to CloudWatch and CloudWatch Evidently</a>.
     * </p>
     * <p>
     * The maximum number of metric definitions that you can specify in one <code>BatchCreateRumMetricDefinitions</code>
     * operation is 200.
     * </p>
     * <p>
     * The maximum number of metric definitions that one destination can contain is 2000.
     * </p>
     * <p>
     * Extended metrics sent are charged as CloudWatch custom metrics. Each combination of additional dimension name and
     * dimension value counts as a custom metric. For more information, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * You must have already created a destination for the metrics before you send them. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html">
     * PutRumMetricsDestination</a>.
     * </p>
     * <p>
     * If some metric definitions specified in a <code>BatchCreateRumMetricDefinitions</code> operations are not valid,
     * those metric definitions fail and return errors, but all valid metric definitions in the same operation still
     * succeed.
     * </p>
     * 
     * @param batchCreateRumMetricDefinitionsRequest
     * @return A Java Future containing the result of the BatchCreateRumMetricDefinitions operation returned by the
     *         service.
     * @sample AWSCloudWatchRUMAsync.BatchCreateRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchCreateRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateRumMetricDefinitionsResult> batchCreateRumMetricDefinitionsAsync(
            BatchCreateRumMetricDefinitionsRequest batchCreateRumMetricDefinitionsRequest);

    /**
     * <p>
     * Specifies the extended metrics that you want a CloudWatch RUM app monitor to send to a destination. Valid
     * destinations include CloudWatch and Evidently.
     * </p>
     * <p>
     * By default, RUM app monitors send some metrics to CloudWatch. These default metrics are listed in <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-metrics.html">CloudWatch
     * metrics that you can collect with CloudWatch RUM</a>.
     * </p>
     * <p>
     * If you also send extended metrics, you can send metrics to Evidently as well as CloudWatch, and you can also
     * optionally send the metrics with additional dimensions. The valid dimension names for the additional dimensions
     * are <code>BrowserName</code>, <code>CountryCode</code>, <code>DeviceType</code>, <code>FileType</code>,
     * <code>OSName</code>, and <code>PageId</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html">
     * Extended metrics that you can send to CloudWatch and CloudWatch Evidently</a>.
     * </p>
     * <p>
     * The maximum number of metric definitions that you can specify in one <code>BatchCreateRumMetricDefinitions</code>
     * operation is 200.
     * </p>
     * <p>
     * The maximum number of metric definitions that one destination can contain is 2000.
     * </p>
     * <p>
     * Extended metrics sent are charged as CloudWatch custom metrics. Each combination of additional dimension name and
     * dimension value counts as a custom metric. For more information, see <a
     * href="https://aws.amazon.com/cloudwatch/pricing/">Amazon CloudWatch Pricing</a>.
     * </p>
     * <p>
     * You must have already created a destination for the metrics before you send them. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_PutRumMetricsDestination.html">
     * PutRumMetricsDestination</a>.
     * </p>
     * <p>
     * If some metric definitions specified in a <code>BatchCreateRumMetricDefinitions</code> operations are not valid,
     * those metric definitions fail and return errors, but all valid metric definitions in the same operation still
     * succeed.
     * </p>
     * 
     * @param batchCreateRumMetricDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateRumMetricDefinitions operation returned by the
     *         service.
     * @sample AWSCloudWatchRUMAsyncHandler.BatchCreateRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchCreateRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateRumMetricDefinitionsResult> batchCreateRumMetricDefinitionsAsync(
            BatchCreateRumMetricDefinitionsRequest batchCreateRumMetricDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateRumMetricDefinitionsRequest, BatchCreateRumMetricDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified metrics from being sent to an extended metrics destination.
     * </p>
     * <p>
     * If some metric definition IDs specified in a <code>BatchDeleteRumMetricDefinitions</code> operations are not
     * valid, those metric definitions fail and return errors, but all valid metric definition IDs in the same operation
     * are still deleted.
     * </p>
     * <p>
     * The maximum number of metric definitions that you can specify in one <code>BatchDeleteRumMetricDefinitions</code>
     * operation is 200.
     * </p>
     * 
     * @param batchDeleteRumMetricDefinitionsRequest
     * @return A Java Future containing the result of the BatchDeleteRumMetricDefinitions operation returned by the
     *         service.
     * @sample AWSCloudWatchRUMAsync.BatchDeleteRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchDeleteRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteRumMetricDefinitionsResult> batchDeleteRumMetricDefinitionsAsync(
            BatchDeleteRumMetricDefinitionsRequest batchDeleteRumMetricDefinitionsRequest);

    /**
     * <p>
     * Removes the specified metrics from being sent to an extended metrics destination.
     * </p>
     * <p>
     * If some metric definition IDs specified in a <code>BatchDeleteRumMetricDefinitions</code> operations are not
     * valid, those metric definitions fail and return errors, but all valid metric definition IDs in the same operation
     * are still deleted.
     * </p>
     * <p>
     * The maximum number of metric definitions that you can specify in one <code>BatchDeleteRumMetricDefinitions</code>
     * operation is 200.
     * </p>
     * 
     * @param batchDeleteRumMetricDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteRumMetricDefinitions operation returned by the
     *         service.
     * @sample AWSCloudWatchRUMAsyncHandler.BatchDeleteRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchDeleteRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteRumMetricDefinitionsResult> batchDeleteRumMetricDefinitionsAsync(
            BatchDeleteRumMetricDefinitionsRequest batchDeleteRumMetricDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteRumMetricDefinitionsRequest, BatchDeleteRumMetricDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of metrics and dimensions that a RUM app monitor is sending to a single destination.
     * </p>
     * 
     * @param batchGetRumMetricDefinitionsRequest
     * @return A Java Future containing the result of the BatchGetRumMetricDefinitions operation returned by the
     *         service.
     * @sample AWSCloudWatchRUMAsync.BatchGetRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchGetRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRumMetricDefinitionsResult> batchGetRumMetricDefinitionsAsync(
            BatchGetRumMetricDefinitionsRequest batchGetRumMetricDefinitionsRequest);

    /**
     * <p>
     * Retrieves the list of metrics and dimensions that a RUM app monitor is sending to a single destination.
     * </p>
     * 
     * @param batchGetRumMetricDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetRumMetricDefinitions operation returned by the
     *         service.
     * @sample AWSCloudWatchRUMAsyncHandler.BatchGetRumMetricDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/BatchGetRumMetricDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetRumMetricDefinitionsResult> batchGetRumMetricDefinitionsAsync(
            BatchGetRumMetricDefinitionsRequest batchGetRumMetricDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetRumMetricDefinitionsRequest, BatchGetRumMetricDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Creates a Amazon CloudWatch RUM app monitor, which collects telemetry data from your application and sends that
     * data to RUM. The data includes performance and reliability information such as page load time, client-side
     * errors, and user behavior.
     * </p>
     * <p>
     * You use this operation only to create a new app monitor. To update an existing app monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_UpdateAppMonitor.html"
     * >UpdateAppMonitor</a> instead.
     * </p>
     * <p>
     * After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code snippet to add
     * to your web application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html">How
     * do I find a code snippet that I've already generated?</a>
     * </p>
     * 
     * @param createAppMonitorRequest
     * @return A Java Future containing the result of the CreateAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.CreateAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/CreateAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppMonitorResult> createAppMonitorAsync(CreateAppMonitorRequest createAppMonitorRequest);

    /**
     * <p>
     * Creates a Amazon CloudWatch RUM app monitor, which collects telemetry data from your application and sends that
     * data to RUM. The data includes performance and reliability information such as page load time, client-side
     * errors, and user behavior.
     * </p>
     * <p>
     * You use this operation only to create a new app monitor. To update an existing app monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_UpdateAppMonitor.html"
     * >UpdateAppMonitor</a> instead.
     * </p>
     * <p>
     * After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code snippet to add
     * to your web application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html">How
     * do I find a code snippet that I've already generated?</a>
     * </p>
     * 
     * @param createAppMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.CreateAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/CreateAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppMonitorResult> createAppMonitorAsync(CreateAppMonitorRequest createAppMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppMonitorRequest, CreateAppMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing app monitor. This immediately stops the collection of data.
     * </p>
     * 
     * @param deleteAppMonitorRequest
     * @return A Java Future containing the result of the DeleteAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.DeleteAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppMonitorResult> deleteAppMonitorAsync(DeleteAppMonitorRequest deleteAppMonitorRequest);

    /**
     * <p>
     * Deletes an existing app monitor. This immediately stops the collection of data.
     * </p>
     * 
     * @param deleteAppMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.DeleteAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppMonitorResult> deleteAppMonitorAsync(DeleteAppMonitorRequest deleteAppMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppMonitorRequest, DeleteAppMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes a destination for CloudWatch RUM extended metrics, so that the specified app monitor stops sending
     * extended metrics to that destination.
     * </p>
     * 
     * @param deleteRumMetricsDestinationRequest
     * @return A Java Future containing the result of the DeleteRumMetricsDestination operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.DeleteRumMetricsDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteRumMetricsDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRumMetricsDestinationResult> deleteRumMetricsDestinationAsync(
            DeleteRumMetricsDestinationRequest deleteRumMetricsDestinationRequest);

    /**
     * <p>
     * Deletes a destination for CloudWatch RUM extended metrics, so that the specified app monitor stops sending
     * extended metrics to that destination.
     * </p>
     * 
     * @param deleteRumMetricsDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRumMetricsDestination operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.DeleteRumMetricsDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DeleteRumMetricsDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRumMetricsDestinationResult> deleteRumMetricsDestinationAsync(
            DeleteRumMetricsDestinationRequest deleteRumMetricsDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRumMetricsDestinationRequest, DeleteRumMetricsDestinationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the complete configuration information for one app monitor.
     * </p>
     * 
     * @param getAppMonitorRequest
     * @return A Java Future containing the result of the GetAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.GetAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppMonitorResult> getAppMonitorAsync(GetAppMonitorRequest getAppMonitorRequest);

    /**
     * <p>
     * Retrieves the complete configuration information for one app monitor.
     * </p>
     * 
     * @param getAppMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.GetAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppMonitorResult> getAppMonitorAsync(GetAppMonitorRequest getAppMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppMonitorRequest, GetAppMonitorResult> asyncHandler);

    /**
     * <p>
     * Retrieves the raw performance events that RUM has collected from your web application, so that you can do your
     * own processing or analysis of this data.
     * </p>
     * 
     * @param getAppMonitorDataRequest
     * @return A Java Future containing the result of the GetAppMonitorData operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.GetAppMonitorData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitorData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppMonitorDataResult> getAppMonitorDataAsync(GetAppMonitorDataRequest getAppMonitorDataRequest);

    /**
     * <p>
     * Retrieves the raw performance events that RUM has collected from your web application, so that you can do your
     * own processing or analysis of this data.
     * </p>
     * 
     * @param getAppMonitorDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppMonitorData operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.GetAppMonitorData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitorData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppMonitorDataResult> getAppMonitorDataAsync(GetAppMonitorDataRequest getAppMonitorDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppMonitorDataRequest, GetAppMonitorDataResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the Amazon CloudWatch RUM app monitors in the account.
     * </p>
     * 
     * @param listAppMonitorsRequest
     * @return A Java Future containing the result of the ListAppMonitors operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.ListAppMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListAppMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppMonitorsResult> listAppMonitorsAsync(ListAppMonitorsRequest listAppMonitorsRequest);

    /**
     * <p>
     * Returns a list of the Amazon CloudWatch RUM app monitors in the account.
     * </p>
     * 
     * @param listAppMonitorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppMonitors operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.ListAppMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListAppMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppMonitorsResult> listAppMonitorsAsync(ListAppMonitorsRequest listAppMonitorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppMonitorsRequest, ListAppMonitorsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of destinations that you have created to receive RUM extended metrics, for the specified app
     * monitor.
     * </p>
     * <p>
     * For more information about extended metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_AddRumMetrcs.html">AddRumMetrics</a>.
     * </p>
     * 
     * @param listRumMetricsDestinationsRequest
     * @return A Java Future containing the result of the ListRumMetricsDestinations operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.ListRumMetricsDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListRumMetricsDestinations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRumMetricsDestinationsResult> listRumMetricsDestinationsAsync(
            ListRumMetricsDestinationsRequest listRumMetricsDestinationsRequest);

    /**
     * <p>
     * Returns a list of destinations that you have created to receive RUM extended metrics, for the specified app
     * monitor.
     * </p>
     * <p>
     * For more information about extended metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_AddRumMetrcs.html">AddRumMetrics</a>.
     * </p>
     * 
     * @param listRumMetricsDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRumMetricsDestinations operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.ListRumMetricsDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListRumMetricsDestinations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRumMetricsDestinationsResult> listRumMetricsDestinationsAsync(
            ListRumMetricsDestinationsRequest listRumMetricsDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRumMetricsDestinationsRequest, ListRumMetricsDestinationsResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with a CloudWatch RUM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with a CloudWatch RUM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sends telemetry events about your application performance and user behavior to CloudWatch RUM. The code snippet
     * that RUM generates for you to add to your application includes <code>PutRumEvents</code> operations to send this
     * data to RUM.
     * </p>
     * <p>
     * Each <code>PutRumEvents</code> operation can send a batch of events from one user session.
     * </p>
     * 
     * @param putRumEventsRequest
     * @return A Java Future containing the result of the PutRumEvents operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.PutRumEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRumEventsResult> putRumEventsAsync(PutRumEventsRequest putRumEventsRequest);

    /**
     * <p>
     * Sends telemetry events about your application performance and user behavior to CloudWatch RUM. The code snippet
     * that RUM generates for you to add to your application includes <code>PutRumEvents</code> operations to send this
     * data to RUM.
     * </p>
     * <p>
     * Each <code>PutRumEvents</code> operation can send a batch of events from one user session.
     * </p>
     * 
     * @param putRumEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRumEvents operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.PutRumEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRumEventsResult> putRumEventsAsync(PutRumEventsRequest putRumEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutRumEventsRequest, PutRumEventsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a destination to receive extended metrics from CloudWatch RUM. You can send extended metrics
     * to CloudWatch or to a CloudWatch Evidently experiment.
     * </p>
     * <p>
     * For more information about extended metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_AddRumMetrics.html">AddRumMetrics</a>.
     * </p>
     * 
     * @param putRumMetricsDestinationRequest
     * @return A Java Future containing the result of the PutRumMetricsDestination operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.PutRumMetricsDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumMetricsDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutRumMetricsDestinationResult> putRumMetricsDestinationAsync(PutRumMetricsDestinationRequest putRumMetricsDestinationRequest);

    /**
     * <p>
     * Creates or updates a destination to receive extended metrics from CloudWatch RUM. You can send extended metrics
     * to CloudWatch or to a CloudWatch Evidently experiment.
     * </p>
     * <p>
     * For more information about extended metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_AddRumMetrics.html">AddRumMetrics</a>.
     * </p>
     * 
     * @param putRumMetricsDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRumMetricsDestination operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.PutRumMetricsDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumMetricsDestination" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutRumMetricsDestinationResult> putRumMetricsDestinationAsync(PutRumMetricsDestinationRequest putRumMetricsDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<PutRumMetricsDestinationRequest, PutRumMetricsDestinationResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch RUM resource. Currently, the only
     * resources that can be tagged app monitors.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified CloudWatch RUM resource. Currently, the only
     * resources that can be tagged app monitors.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the alarm. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon
     * Web Services resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing app monitor. When you use this operation, only the parts of the app
     * monitor configuration that you specify in this operation are changed. For any parameters that you omit, the
     * existing values are kept.
     * </p>
     * <p>
     * You can't use this operation to change the tags of an existing app monitor. To change the tags of an existing app
     * monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * <p>
     * To create a new app monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_CreateAppMonitor.html"
     * >CreateAppMonitor</a>.
     * </p>
     * <p>
     * After you update an app monitor, sign in to the CloudWatch RUM console to get the updated JavaScript code snippet
     * to add to your web application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html">How
     * do I find a code snippet that I've already generated?</a>
     * </p>
     * 
     * @param updateAppMonitorRequest
     * @return A Java Future containing the result of the UpdateAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.UpdateAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppMonitorResult> updateAppMonitorAsync(UpdateAppMonitorRequest updateAppMonitorRequest);

    /**
     * <p>
     * Updates the configuration of an existing app monitor. When you use this operation, only the parts of the app
     * monitor configuration that you specify in this operation are changed. For any parameters that you omit, the
     * existing values are kept.
     * </p>
     * <p>
     * You can't use this operation to change the tags of an existing app monitor. To change the tags of an existing app
     * monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * <p>
     * To create a new app monitor, use <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_CreateAppMonitor.html"
     * >CreateAppMonitor</a>.
     * </p>
     * <p>
     * After you update an app monitor, sign in to the CloudWatch RUM console to get the updated JavaScript code snippet
     * to add to your web application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html">How
     * do I find a code snippet that I've already generated?</a>
     * </p>
     * 
     * @param updateAppMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppMonitor operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.UpdateAppMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateAppMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppMonitorResult> updateAppMonitorAsync(UpdateAppMonitorRequest updateAppMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppMonitorRequest, UpdateAppMonitorResult> asyncHandler);

    /**
     * <p>
     * Modifies one existing metric definition for CloudWatch RUM extended metrics. For more information about extended
     * metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchCreateRumMetricsDefinitions.html"
     * >BatchCreateRumMetricsDefinitions</a>.
     * </p>
     * 
     * @param updateRumMetricDefinitionRequest
     * @return A Java Future containing the result of the UpdateRumMetricDefinition operation returned by the service.
     * @sample AWSCloudWatchRUMAsync.UpdateRumMetricDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateRumMetricDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRumMetricDefinitionResult> updateRumMetricDefinitionAsync(
            UpdateRumMetricDefinitionRequest updateRumMetricDefinitionRequest);

    /**
     * <p>
     * Modifies one existing metric definition for CloudWatch RUM extended metrics. For more information about extended
     * metrics, see <a
     * href="https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_BatchCreateRumMetricsDefinitions.html"
     * >BatchCreateRumMetricsDefinitions</a>.
     * </p>
     * 
     * @param updateRumMetricDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRumMetricDefinition operation returned by the service.
     * @sample AWSCloudWatchRUMAsyncHandler.UpdateRumMetricDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/UpdateRumMetricDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRumMetricDefinitionResult> updateRumMetricDefinitionAsync(
            UpdateRumMetricDefinitionRequest updateRumMetricDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRumMetricDefinitionRequest, UpdateRumMetricDefinitionResult> asyncHandler);

}

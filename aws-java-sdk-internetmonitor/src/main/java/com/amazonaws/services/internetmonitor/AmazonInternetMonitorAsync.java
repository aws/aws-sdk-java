/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.internetmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.internetmonitor.model.*;

/**
 * Interface for accessing Amazon CloudWatch Internet Monitor asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.internetmonitor.AbstractAmazonInternetMonitorAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon CloudWatch Internet Monitor provides visibility into how internet issues impact the performance and
 * availability between your applications hosted on Amazon Web Services and your end users. It can reduce the time it
 * takes for you to diagnose internet issues from days to minutes. Internet Monitor uses the connectivity data that
 * Amazon Web Services captures from its global networking footprint to calculate a baseline of performance and
 * availability for internet traffic. This is the same data that Amazon Web Services uses to monitor internet uptime and
 * availability. With those measurements as a baseline, Internet Monitor raises awareness for you when there are
 * significant problems for your end users in the different geographic locations where your application runs.
 * </p>
 * <p>
 * Internet Monitor publishes internet measurements to CloudWatch Logs and CloudWatch Metrics, to easily support using
 * CloudWatch tools with health information for geographies and networks specific to your application. Internet Monitor
 * sends health events to Amazon EventBridge so that you can set up notifications. If an issue is caused by the Amazon
 * Web Services network, you also automatically receive an Amazon Web Services Health Dashboard notification with the
 * steps that Amazon Web Services is taking to mitigate the problem.
 * </p>
 * <p>
 * To use Internet Monitor, you create a <i>monitor</i> and associate your application's resources with it - VPCs, NLBs,
 * CloudFront distributions, or WorkSpaces directories - so Internet Monitor can determine where your application's
 * internet traffic is. Internet Monitor then provides internet measurements from Amazon Web Services that are specific
 * to the locations and ASNs (typically, internet service providers or ISPs) that communicate with your application.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using Amazon
 * CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonInternetMonitorAsync extends AmazonInternetMonitor {

    /**
     * <p>
     * Creates a monitor in Amazon CloudWatch Internet Monitor. A monitor is built based on information from the
     * application resources that you add: VPCs, Network Load Balancers (NLBs), Amazon CloudFront distributions, and
     * Amazon WorkSpaces directories. Internet Monitor then publishes internet measurements from Amazon Web Services
     * that are specific to the <i>city-networks</i>. That is, the locations and ASNs (typically internet service
     * providers or ISPs), where clients access your application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using
     * Amazon CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * When you create a monitor, you choose the percentage of traffic that you want to monitor. You can also set a
     * maximum limit for the number of city-networks where client traffic is monitored, that caps the total traffic that
     * Internet Monitor monitors. A city-network maximum is the limit of city-networks, but you only pay for the number
     * of city-networks that are actually monitored. You can update your monitor at any time to change the percentage of
     * traffic to monitor or the city-networks maximum. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param createMonitorRequest
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsync.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Creates a monitor in Amazon CloudWatch Internet Monitor. A monitor is built based on information from the
     * application resources that you add: VPCs, Network Load Balancers (NLBs), Amazon CloudFront distributions, and
     * Amazon WorkSpaces directories. Internet Monitor then publishes internet measurements from Amazon Web Services
     * that are specific to the <i>city-networks</i>. That is, the locations and ASNs (typically internet service
     * providers or ISPs), where clients access your application. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html">Using
     * Amazon CloudWatch Internet Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * When you create a monitor, you choose the percentage of traffic that you want to monitor. You can also set a
     * maximum limit for the number of city-networks where client traffic is monitored, that caps the total traffic that
     * Internet Monitor monitors. A city-network maximum is the limit of city-networks, but you only pay for the number
     * of city-networks that are actually monitored. You can update your monitor at any time to change the percentage of
     * traffic to monitor or the city-networks maximum. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param createMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes a monitor in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsync.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest);

    /**
     * <p>
     * Deletes a monitor in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler);

    /**
     * <p>
     * Gets information that Amazon CloudWatch Internet Monitor has created and stored about a health event for a
     * specified monitor. This information includes the impacted locations, and all the information related to the
     * event, by location.
     * </p>
     * <p>
     * The information returned includes the impact on performance, availability, and round-trip time, information about
     * the network providers (ASNs), the event type, and so on.
     * </p>
     * <p>
     * Information rolled up at the global traffic level is also returned, including the impact type and total traffic
     * impact.
     * </p>
     * 
     * @param getHealthEventRequest
     * @return A Java Future containing the result of the GetHealthEvent operation returned by the service.
     * @sample AmazonInternetMonitorAsync.GetHealthEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetHealthEvent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthEventResult> getHealthEventAsync(GetHealthEventRequest getHealthEventRequest);

    /**
     * <p>
     * Gets information that Amazon CloudWatch Internet Monitor has created and stored about a health event for a
     * specified monitor. This information includes the impacted locations, and all the information related to the
     * event, by location.
     * </p>
     * <p>
     * The information returned includes the impact on performance, availability, and round-trip time, information about
     * the network providers (ASNs), the event type, and so on.
     * </p>
     * <p>
     * Information rolled up at the global traffic level is also returned, including the impact type and total traffic
     * impact.
     * </p>
     * 
     * @param getHealthEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthEvent operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.GetHealthEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetHealthEvent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthEventResult> getHealthEventAsync(GetHealthEventRequest getHealthEventRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthEventRequest, GetHealthEventResult> asyncHandler);

    /**
     * <p>
     * Gets information that Amazon CloudWatch Internet Monitor has generated about an internet event. Internet Monitor
     * displays information about recent global health events, called internet events, on a global outages map that is
     * available to all Amazon Web Services customers.
     * </p>
     * <p>
     * The information returned here includes the impacted location, when the event started and (if the event is over)
     * ended, the type of event (<code>PERFORMANCE</code> or <code>AVAILABILITY</code>), and the status (
     * <code>ACTIVE</code> or <code>RESOLVED</code>).
     * </p>
     * 
     * @param getInternetEventRequest
     * @return A Java Future containing the result of the GetInternetEvent operation returned by the service.
     * @sample AmazonInternetMonitorAsync.GetInternetEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetInternetEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInternetEventResult> getInternetEventAsync(GetInternetEventRequest getInternetEventRequest);

    /**
     * <p>
     * Gets information that Amazon CloudWatch Internet Monitor has generated about an internet event. Internet Monitor
     * displays information about recent global health events, called internet events, on a global outages map that is
     * available to all Amazon Web Services customers.
     * </p>
     * <p>
     * The information returned here includes the impacted location, when the event started and (if the event is over)
     * ended, the type of event (<code>PERFORMANCE</code> or <code>AVAILABILITY</code>), and the status (
     * <code>ACTIVE</code> or <code>RESOLVED</code>).
     * </p>
     * 
     * @param getInternetEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInternetEvent operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.GetInternetEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetInternetEvent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInternetEventResult> getInternetEventAsync(GetInternetEventRequest getInternetEventRequest,
            com.amazonaws.handlers.AsyncHandler<GetInternetEventRequest, GetInternetEventResult> asyncHandler);

    /**
     * <p>
     * Gets information about a monitor in Amazon CloudWatch Internet Monitor based on a monitor name. The information
     * returned includes the Amazon Resource Name (ARN), create time, modified time, resources included in the monitor,
     * and status information.
     * </p>
     * 
     * @param getMonitorRequest
     * @return A Java Future containing the result of the GetMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsync.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest getMonitorRequest);

    /**
     * <p>
     * Gets information about a monitor in Amazon CloudWatch Internet Monitor based on a monitor name. The information
     * returned includes the Amazon Resource Name (ARN), create time, modified time, resources included in the monitor,
     * and status information.
     * </p>
     * 
     * @param getMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest getMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<GetMonitorRequest, GetMonitorResult> asyncHandler);

    /**
     * <p>
     * Return the data for a query with the Amazon CloudWatch Internet Monitor query interface. Specify the query that
     * you want to return results for by providing a <code>QueryId</code> and a monitor name.
     * </p>
     * <p>
     * For more information about using the query interface, including examples, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AmazonInternetMonitorAsync.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Return the data for a query with the Amazon CloudWatch Internet Monitor query interface. Specify the query that
     * you want to return results for by providing a <code>QueryId</code> and a monitor name.
     * </p>
     * <p>
     * For more information about using the query interface, including examples, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param getQueryResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of a query for the Amazon CloudWatch Internet Monitor query interface, for a specified
     * query ID and monitor. When you run a query, check the status to make sure that the query has
     * <code>SUCCEEDED</code> before you review the results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUEUED</code>: The query is scheduled to run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The query is in progress but not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The query completed sucessfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The query failed due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>: The query was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getQueryStatusRequest
     * @return A Java Future containing the result of the GetQueryStatus operation returned by the service.
     * @sample AmazonInternetMonitorAsync.GetQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryStatusResult> getQueryStatusAsync(GetQueryStatusRequest getQueryStatusRequest);

    /**
     * <p>
     * Returns the current status of a query for the Amazon CloudWatch Internet Monitor query interface, for a specified
     * query ID and monitor. When you run a query, check the status to make sure that the query has
     * <code>SUCCEEDED</code> before you review the results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>QUEUED</code>: The query is scheduled to run.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The query is in progress but not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The query completed sucessfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The query failed due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>: The query was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getQueryStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryStatus operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.GetQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryStatusResult> getQueryStatusAsync(GetQueryStatusRequest getQueryStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryStatusRequest, GetQueryStatusResult> asyncHandler);

    /**
     * <p>
     * Lists all health events for a monitor in Amazon CloudWatch Internet Monitor. Returns information for health
     * events including the event start and end times, and the status.
     * </p>
     * <note>
     * <p>
     * Health events that have start times during the time frame that is requested are not included in the list of
     * health events.
     * </p>
     * </note>
     * 
     * @param listHealthEventsRequest
     * @return A Java Future containing the result of the ListHealthEvents operation returned by the service.
     * @sample AmazonInternetMonitorAsync.ListHealthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListHealthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHealthEventsResult> listHealthEventsAsync(ListHealthEventsRequest listHealthEventsRequest);

    /**
     * <p>
     * Lists all health events for a monitor in Amazon CloudWatch Internet Monitor. Returns information for health
     * events including the event start and end times, and the status.
     * </p>
     * <note>
     * <p>
     * Health events that have start times during the time frame that is requested are not included in the list of
     * health events.
     * </p>
     * </note>
     * 
     * @param listHealthEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHealthEvents operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.ListHealthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListHealthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHealthEventsResult> listHealthEventsAsync(ListHealthEventsRequest listHealthEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHealthEventsRequest, ListHealthEventsResult> asyncHandler);

    /**
     * <p>
     * Lists internet events that cause performance or availability issues for client locations. Amazon CloudWatch
     * Internet Monitor displays information about recent global health events, called internet events, on a global
     * outages map that is available to all Amazon Web Services customers.
     * </p>
     * <p>
     * You can constrain the list of internet events returned by providing a start time and end time to define a total
     * time frame for events you want to list. Both start time and end time specify the time when an event started. End
     * time is optional. If you don't include it, the default end time is the current time.
     * </p>
     * <p>
     * You can also limit the events returned to a specific status (<code>ACTIVE</code> or <code>RESOLVED</code>) or
     * type (<code>PERFORMANCE</code> or <code>AVAILABILITY</code>).
     * </p>
     * 
     * @param listInternetEventsRequest
     * @return A Java Future containing the result of the ListInternetEvents operation returned by the service.
     * @sample AmazonInternetMonitorAsync.ListInternetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListInternetEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInternetEventsResult> listInternetEventsAsync(ListInternetEventsRequest listInternetEventsRequest);

    /**
     * <p>
     * Lists internet events that cause performance or availability issues for client locations. Amazon CloudWatch
     * Internet Monitor displays information about recent global health events, called internet events, on a global
     * outages map that is available to all Amazon Web Services customers.
     * </p>
     * <p>
     * You can constrain the list of internet events returned by providing a start time and end time to define a total
     * time frame for events you want to list. Both start time and end time specify the time when an event started. End
     * time is optional. If you don't include it, the default end time is the current time.
     * </p>
     * <p>
     * You can also limit the events returned to a specific status (<code>ACTIVE</code> or <code>RESOLVED</code>) or
     * type (<code>PERFORMANCE</code> or <code>AVAILABILITY</code>).
     * </p>
     * 
     * @param listInternetEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInternetEvents operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.ListInternetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListInternetEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInternetEventsResult> listInternetEventsAsync(ListInternetEventsRequest listInternetEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInternetEventsRequest, ListInternetEventsResult> asyncHandler);

    /**
     * <p>
     * Lists all of your monitors for Amazon CloudWatch Internet Monitor and their statuses, along with the Amazon
     * Resource Name (ARN) and name of each monitor.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AmazonInternetMonitorAsync.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Lists all of your monitors for Amazon CloudWatch Internet Monitor and their statuses, along with the Amazon
     * Resource Name (ARN) and name of each monitor.
     * </p>
     * 
     * @param listMonitorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonInternetMonitorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Start a query to return data for a specific query type for the Amazon CloudWatch Internet Monitor query
     * interface. Specify a time period for the data that you want returned by using <code>StartTime</code> and
     * <code>EndTime</code>. You filter the query results to return by providing parameters that you specify with
     * <code>FilterParameters</code>.
     * </p>
     * <p>
     * For more information about using the query interface, including examples, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param startQueryRequest
     * @return A Java Future containing the result of the StartQuery operation returned by the service.
     * @sample AmazonInternetMonitorAsync.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest startQueryRequest);

    /**
     * <p>
     * Start a query to return data for a specific query type for the Amazon CloudWatch Internet Monitor query
     * interface. Specify a time period for the data that you want returned by using <code>StartTime</code> and
     * <code>EndTime</code>. You filter the query results to return by providing parameters that you specify with
     * <code>FilterParameters</code>.
     * </p>
     * <p>
     * For more information about using the query interface, including examples, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param startQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartQuery operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest startQueryRequest,
            com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler);

    /**
     * <p>
     * Stop a query that is progress for a specific monitor.
     * </p>
     * 
     * @param stopQueryRequest
     * @return A Java Future containing the result of the StopQuery operation returned by the service.
     * @sample AmazonInternetMonitorAsync.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest stopQueryRequest);

    /**
     * <p>
     * Stop a query that is progress for a specific monitor.
     * </p>
     * 
     * @param stopQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopQuery operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopQueryResult> stopQueryAsync(StopQueryRequest stopQueryRequest,
            com.amazonaws.handlers.AsyncHandler<StopQueryRequest, StopQueryResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor. You can add
     * a maximum of 50 tags in Internet Monitor.
     * </p>
     * <p>
     * A minimum of one tag is required for this call. It returns an error if you use the <code>TagResource</code>
     * request with 0 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonInternetMonitorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor. You can add
     * a maximum of 50 tags in Internet Monitor.
     * </p>
     * <p>
     * A minimum of one tag is required for this call. It returns an error if you use the <code>TagResource</code>
     * request with 0 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonInternetMonitorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a monitor. You can update a monitor to change the percentage of traffic to monitor or the maximum number
     * of city-networks (locations and ASNs), to add or remove resources, or to change the status of the monitor. Note
     * that you can't change the name of a monitor.
     * </p>
     * <p>
     * The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are
     * actually monitored. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return A Java Future containing the result of the UpdateMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsync.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest updateMonitorRequest);

    /**
     * <p>
     * Updates a monitor. You can update a monitor to change the percentage of traffic to monitor or the maximum number
     * of city-networks (locations and ASNs), to add or remove resources, or to change the status of the monitor. Note
     * that you can't change the name of a monitor.
     * </p>
     * <p>
     * The city-network maximum that you choose is the limit, but you only pay for the number of city-networks that are
     * actually monitored. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/IMCityNetworksMaximum.html">Choosing a
     * city-network maximum value</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param updateMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMonitor operation returned by the service.
     * @sample AmazonInternetMonitorAsyncHandler.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest updateMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResult> asyncHandler);

}

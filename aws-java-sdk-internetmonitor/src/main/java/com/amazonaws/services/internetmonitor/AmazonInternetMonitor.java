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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.internetmonitor.model.*;

/**
 * Interface for accessing Amazon CloudWatch Internet Monitor.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.internetmonitor.AbstractAmazonInternetMonitor} instead.
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
public interface AmazonInternetMonitor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "internetmonitor";

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
     * @return Result of the CreateMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested resource is in use.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMonitorResult createMonitor(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Deletes a monitor in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return Result of the DeleteMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMonitorResult deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

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
     * @return Result of the GetHealthEvent operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetHealthEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetHealthEvent" target="_top">AWS
     *      API Documentation</a>
     */
    GetHealthEventResult getHealthEvent(GetHealthEventRequest getHealthEventRequest);

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
     * @return Result of the GetInternetEvent operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetInternetEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetInternetEvent"
     *      target="_top">AWS API Documentation</a>
     */
    GetInternetEventResult getInternetEvent(GetInternetEventRequest getInternetEventRequest);

    /**
     * <p>
     * Gets information about a monitor in Amazon CloudWatch Internet Monitor based on a monitor name. The information
     * returned includes the Amazon Resource Name (ARN), create time, modified time, resources included in the monitor,
     * and status information.
     * </p>
     * 
     * @param getMonitorRequest
     * @return Result of the GetMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    GetMonitorResult getMonitor(GetMonitorRequest getMonitorRequest);

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
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryResults"
     *      target="_top">AWS API Documentation</a>
     */
    GetQueryResultsResult getQueryResults(GetQueryResultsRequest getQueryResultsRequest);

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
     * @return Result of the GetQueryStatus operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.GetQueryStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/GetQueryStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetQueryStatusResult getQueryStatus(GetQueryStatusRequest getQueryStatusRequest);

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
     * @return Result of the ListHealthEvents operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.ListHealthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListHealthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListHealthEventsResult listHealthEvents(ListHealthEventsRequest listHealthEventsRequest);

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
     * @return Result of the ListInternetEvents operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.ListInternetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListInternetEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListInternetEventsResult listInternetEvents(ListInternetEventsRequest listInternetEventsRequest);

    /**
     * <p>
     * Lists all of your monitors for Amazon CloudWatch Internet Monitor and their statuses, along with the Amazon
     * Resource Name (ARN) and name of each monitor.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return Result of the ListMonitors operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    ListMonitorsResult listMonitors(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Lists the tags for a resource. Tags are supported only for monitors in Amazon CloudWatch Internet Monitor.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws TooManyRequestsException
     *         There were too many requests.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws NotFoundException
     *         The request specifies something that doesn't exist.
     * @throws BadRequestException
     *         A bad request was received.
     * @throws InternalServerErrorException
     *         There was an internal server error.
     * @sample AmazonInternetMonitor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the StartQuery operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.StartQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StartQuery" target="_top">AWS API
     *      Documentation</a>
     */
    StartQueryResult startQuery(StartQueryRequest startQueryRequest);

    /**
     * <p>
     * Stop a query that is progress for a specific monitor.
     * </p>
     * 
     * @param stopQueryRequest
     * @return Result of the StopQuery operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.StopQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StopQuery" target="_top">AWS API
     *      Documentation</a>
     */
    StopQueryResult stopQuery(StopQueryRequest stopQueryRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyRequestsException
     *         There were too many requests.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws NotFoundException
     *         The request specifies something that doesn't exist.
     * @throws BadRequestException
     *         A bad request was received.
     * @throws InternalServerErrorException
     *         There was an internal server error.
     * @sample AmazonInternetMonitor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws TooManyRequestsException
     *         There were too many requests.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws NotFoundException
     *         The request specifies something that doesn't exist.
     * @throws BadRequestException
     *         A bad request was received.
     * @throws InternalServerErrorException
     *         There was an internal server error.
     * @sample AmazonInternetMonitor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateMonitor operation returned by the service.
     * @throws InternalServerException
     *         An internal error occurred.
     * @throws ResourceNotFoundException
     *         The request specifies a resource that doesn't exist.
     * @throws AccessDeniedException
     *         You don't have sufficient permission to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The request exceeded a service quota.
     * @throws ValidationException
     *         Invalid request.
     * @sample AmazonInternetMonitor.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMonitorResult updateMonitor(UpdateMonitorRequest updateMonitorRequest);

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

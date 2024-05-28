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
package com.amazonaws.services.networkmonitor;

import javax.annotation.Generated;

import com.amazonaws.services.networkmonitor.model.*;

/**
 * Interface for accessing Amazon CloudWatch Network Monitor asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.networkmonitor.AbstractAmazonNetworkMonitorAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon CloudWatch Network Monitor is an Amazon Web Services active network monitoring service that identifies if a
 * network issues exists within the Amazon Web Services network or your own company network. Within Network Monitor
 * you'll choose the source VPCs and subnets from the Amazon Web Services network in which you operate and then you'll
 * choose the destination IP addresses from your on-premises network. From these sources and destinations, Network
 * Monitor creates a monitor containing all the possible source and destination combinations, each of which is called a
 * probe, within a single monitor. These probes then monitor network traffic to help you identify where network issues
 * might be affecting your traffic.
 * </p>
 * <p>
 * Before you begin, ensure the Amazon Web Services CLI is configured in the Amazon Web Services Account where you will
 * create the Network Monitor resource. Network Monitor doesn’t support creation on cross-account resources, but you can
 * create a Network Monitor in any subnet belonging to a VPC owned by your Account.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/what-is-network-monitor.html">Using Amazon
 * CloudWatch Network Monitor</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonNetworkMonitorAsync extends AmazonNetworkMonitor {

    /**
     * <p>
     * Creates a monitor between a source subnet and destination IP address. Within a monitor you'll create one or more
     * probes that monitor network traffic between your source Amazon Web Services VPC subnets and your destination IP
     * addresses. Each probe then aggregates and sends metrics to Amazon CloudWatch.
     * </p>
     * <p>
     * You can also create a monitor with probes using this command. For each probe, you define the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>source</code>—The subnet IDs where the probes will be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination</code>— The target destination IP address for the probe.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationPort</code>—Required only if the protocol is <code>TCP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>—The communication protocol between the source and destination. This will be either
     * <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>packetSize</code>—The size of the packets. This must be a number between <code>56</code> and
     * <code>8500</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>tags</code> —Key-value pairs created and assigned to the probe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMonitorRequest
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Creates a monitor between a source subnet and destination IP address. Within a monitor you'll create one or more
     * probes that monitor network traffic between your source Amazon Web Services VPC subnets and your destination IP
     * addresses. Each probe then aggregates and sends metrics to Amazon CloudWatch.
     * </p>
     * <p>
     * You can also create a monitor with probes using this command. For each probe, you define the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>source</code>—The subnet IDs where the probes will be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination</code>— The target destination IP address for the probe.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationPort</code>—Required only if the protocol is <code>TCP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>—The communication protocol between the source and destination. This will be either
     * <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>packetSize</code>—The size of the packets. This must be a number between <code>56</code> and
     * <code>8500</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>tags</code> —Key-value pairs created and assigned to the probe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler);

    /**
     * <p>
     * Create a probe within a monitor. Once you create a probe, and it begins monitoring your network traffic, you'll
     * incur billing charges for that probe. This action requires the <code>monitorName</code> parameter. Run
     * <code>ListMonitors</code> to get a list of monitor names. Note the name of the <code>monitorName</code> you want
     * to create the probe for.
     * </p>
     * 
     * @param createProbeRequest
     * @return A Java Future containing the result of the CreateProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.CreateProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProbeResult> createProbeAsync(CreateProbeRequest createProbeRequest);

    /**
     * <p>
     * Create a probe within a monitor. Once you create a probe, and it begins monitoring your network traffic, you'll
     * incur billing charges for that probe. This action requires the <code>monitorName</code> parameter. Run
     * <code>ListMonitors</code> to get a list of monitor names. Note the name of the <code>monitorName</code> you want
     * to create the probe for.
     * </p>
     * 
     * @param createProbeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.CreateProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProbeResult> createProbeAsync(CreateProbeRequest createProbeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProbeRequest, CreateProbeResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified monitor.
     * </p>
     * <p>
     * This action requires the <code>monitorName</code> parameter. Run <code>ListMonitors</code> to get a list of
     * monitor names.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest);

    /**
     * <p>
     * Deletes a specified monitor.
     * </p>
     * <p>
     * This action requires the <code>monitorName</code> parameter. Run <code>ListMonitors</code> to get a list of
     * monitor names.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified probe. Once a probe is deleted you'll no longer incur any billing fees for that probe.
     * </p>
     * <p>
     * This action requires both the <code>monitorName</code> and <code>probeId</code> parameters. Run
     * <code>ListMonitors</code> to get a list of monitor names. Run <code>GetMonitor</code> to get a list of probes and
     * probe IDs. You can only delete a single probe at a time using this action.
     * </p>
     * 
     * @param deleteProbeRequest
     * @return A Java Future containing the result of the DeleteProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.DeleteProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/DeleteProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProbeResult> deleteProbeAsync(DeleteProbeRequest deleteProbeRequest);

    /**
     * <p>
     * Deletes the specified probe. Once a probe is deleted you'll no longer incur any billing fees for that probe.
     * </p>
     * <p>
     * This action requires both the <code>monitorName</code> and <code>probeId</code> parameters. Run
     * <code>ListMonitors</code> to get a list of monitor names. Run <code>GetMonitor</code> to get a list of probes and
     * probe IDs. You can only delete a single probe at a time using this action.
     * </p>
     * 
     * @param deleteProbeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.DeleteProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/DeleteProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProbeResult> deleteProbeAsync(DeleteProbeRequest deleteProbeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProbeRequest, DeleteProbeResult> asyncHandler);

    /**
     * <p>
     * Returns details about a specific monitor.
     * </p>
     * <p>
     * This action requires the <code>monitorName</code> parameter. Run <code>ListMonitors</code> to get a list of
     * monitor names.
     * </p>
     * 
     * @param getMonitorRequest
     * @return A Java Future containing the result of the GetMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest getMonitorRequest);

    /**
     * <p>
     * Returns details about a specific monitor.
     * </p>
     * <p>
     * This action requires the <code>monitorName</code> parameter. Run <code>ListMonitors</code> to get a list of
     * monitor names.
     * </p>
     * 
     * @param getMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest getMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<GetMonitorRequest, GetMonitorResult> asyncHandler);

    /**
     * <p>
     * Returns the details about a probe. This action requires both the <code>monitorName</code> and
     * <code>probeId</code> parameters. Run <code>ListMonitors</code> to get a list of monitor names. Run
     * <code>GetMonitor</code> to get a list of probes and probe IDs.
     * </p>
     * 
     * @param getProbeRequest
     * @return A Java Future containing the result of the GetProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.GetProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProbeResult> getProbeAsync(GetProbeRequest getProbeRequest);

    /**
     * <p>
     * Returns the details about a probe. This action requires both the <code>monitorName</code> and
     * <code>probeId</code> parameters. Run <code>ListMonitors</code> to get a list of monitor names. Run
     * <code>GetMonitor</code> to get a list of probes and probe IDs.
     * </p>
     * 
     * @param getProbeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.GetProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProbeResult> getProbeAsync(GetProbeRequest getProbeRequest,
            com.amazonaws.handlers.AsyncHandler<GetProbeRequest, GetProbeResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all of your monitors.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Returns a list of all of your monitors.
     * </p>
     * 
     * @param listMonitorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags assigned to this resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags assigned to this resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds key-value pairs to a monitor or probe.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds key-value pairs to a monitor or probe.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a key-value pair from a monitor or probe.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a key-value pair from a monitor or probe.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the <code>aggregationPeriod</code> for a monitor. Monitors support an <code>aggregationPeriod</code> of
     * either <code>30</code> or <code>60</code> seconds. This action requires the <code>monitorName</code> and
     * <code>probeId</code> parameter. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return A Java Future containing the result of the UpdateMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest updateMonitorRequest);

    /**
     * <p>
     * Updates the <code>aggregationPeriod</code> for a monitor. Monitors support an <code>aggregationPeriod</code> of
     * either <code>30</code> or <code>60</code> seconds. This action requires the <code>monitorName</code> and
     * <code>probeId</code> parameter. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     * 
     * @param updateMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMonitor operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest updateMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResult> asyncHandler);

    /**
     * <p>
     * Updates a monitor probe. This action requires both the <code>monitorName</code> and <code>probeId</code>
     * parameters. Run <code>ListMonitors</code> to get a list of monitor names. Run <code>GetMonitor</code> to get a
     * list of probes and probe IDs.
     * </p>
     * <p>
     * You can update the following para create a monitor with probes using this command. For each probe, you define the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code>—The state of the probe.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination</code>— The target destination IP address for the probe.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationPort</code>—Required only if the protocol is <code>TCP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>—The communication protocol between the source and destination. This will be either
     * <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>packetSize</code>—The size of the packets. This must be a number between <code>56</code> and
     * <code>8500</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>tags</code> —Key-value pairs created and assigned to the probe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateProbeRequest
     * @return A Java Future containing the result of the UpdateProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsync.UpdateProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProbeResult> updateProbeAsync(UpdateProbeRequest updateProbeRequest);

    /**
     * <p>
     * Updates a monitor probe. This action requires both the <code>monitorName</code> and <code>probeId</code>
     * parameters. Run <code>ListMonitors</code> to get a list of monitor names. Run <code>GetMonitor</code> to get a
     * list of probes and probe IDs.
     * </p>
     * <p>
     * You can update the following para create a monitor with probes using this command. For each probe, you define the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code>—The state of the probe.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destination</code>— The target destination IP address for the probe.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>destinationPort</code>—Required only if the protocol is <code>TCP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>protocol</code>—The communication protocol between the source and destination. This will be either
     * <code>TCP</code> or <code>ICMP</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>packetSize</code>—The size of the packets. This must be a number between <code>56</code> and
     * <code>8500</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) <code>tags</code> —Key-value pairs created and assigned to the probe.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateProbeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProbe operation returned by the service.
     * @sample AmazonNetworkMonitorAsyncHandler.UpdateProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateProbe" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProbeResult> updateProbeAsync(UpdateProbeRequest updateProbeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProbeRequest, UpdateProbeResult> asyncHandler);

}

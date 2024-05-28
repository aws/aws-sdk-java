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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.networkmonitor.model.*;

/**
 * Interface for accessing Amazon CloudWatch Network Monitor.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.networkmonitor.AbstractAmazonNetworkMonitor} instead.
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
public interface AmazonNetworkMonitor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "networkmonitor";

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
     * @return Result of the CreateMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @sample AmazonNetworkMonitor.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMonitorResult createMonitor(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Create a probe within a monitor. Once you create a probe, and it begins monitoring your network traffic, you'll
     * incur billing charges for that probe. This action requires the <code>monitorName</code> parameter. Run
     * <code>ListMonitors</code> to get a list of monitor names. Note the name of the <code>monitorName</code> you want
     * to create the probe for.
     * </p>
     * 
     * @param createProbeRequest
     * @return Result of the CreateProbe operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @sample AmazonNetworkMonitor.CreateProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/CreateProbe" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProbeResult createProbe(CreateProbeRequest createProbeRequest);

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
     * @return Result of the DeleteMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonNetworkMonitor.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/DeleteMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMonitorResult deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

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
     * @return Result of the DeleteProbe operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @sample AmazonNetworkMonitor.DeleteProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/DeleteProbe" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProbeResult deleteProbe(DeleteProbeRequest deleteProbeRequest);

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
     * @return Result of the GetMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonNetworkMonitor.GetMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    GetMonitorResult getMonitor(GetMonitorRequest getMonitorRequest);

    /**
     * <p>
     * Returns the details about a probe. This action requires both the <code>monitorName</code> and
     * <code>probeId</code> parameters. Run <code>ListMonitors</code> to get a list of monitor names. Run
     * <code>GetMonitor</code> to get a list of probes and probe IDs.
     * </p>
     * 
     * @param getProbeRequest
     * @return Result of the GetProbe operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonNetworkMonitor.GetProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/GetProbe" target="_top">AWS API
     *      Documentation</a>
     */
    GetProbeResult getProbe(GetProbeRequest getProbeRequest);

    /**
     * <p>
     * Returns a list of all of your monitors.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return Result of the ListMonitors operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonNetworkMonitor.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListMonitors" target="_top">AWS
     *      API Documentation</a>
     */
    ListMonitorsResult listMonitors(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Lists the tags assigned to this resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @sample AmazonNetworkMonitor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds key-value pairs to a monitor or probe.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @sample AmazonNetworkMonitor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a key-value pair from a monitor or probe.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         This operation attempted to create a resource that already exists.
     * @sample AmazonNetworkMonitor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the <code>aggregationPeriod</code> for a monitor. Monitors support an <code>aggregationPeriod</code> of
     * either <code>30</code> or <code>60</code> seconds. This action requires the <code>monitorName</code> and
     * <code>probeId</code> parameter. Run <code>ListMonitors</code> to get a list of monitor names.
     * </p>
     * 
     * @param updateMonitorRequest
     * @return Result of the UpdateMonitor operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @sample AmazonNetworkMonitor.UpdateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateMonitor" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMonitorResult updateMonitor(UpdateMonitorRequest updateMonitorRequest);

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
     * @return Result of the UpdateProbe operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource does not exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling
     * @throws ValidationException
     *         One of the parameters for the request is not valid.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ServiceQuotaExceededException
     *         This request exceeds a service quota.
     * @sample AmazonNetworkMonitor.UpdateProbe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmonitor-2023-08-01/UpdateProbe" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateProbeResult updateProbe(UpdateProbeRequest updateProbeRequest);

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

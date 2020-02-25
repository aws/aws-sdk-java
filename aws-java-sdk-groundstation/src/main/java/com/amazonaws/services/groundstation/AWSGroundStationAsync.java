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
package com.amazonaws.services.groundstation;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;

/**
 * Interface for accessing AWS Ground Station asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.groundstation.AbstractAWSGroundStationAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
 * control satellite communications, downlink and process satellite data, and scale your satellite operations
 * efficiently and cost-effectively without having to build or manage your own ground station infrastructure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGroundStationAsync extends AWSGroundStation {

    /**
     * <p>
     * Cancels a contact with a specified contact ID.
     * </p>
     * 
     * @param cancelContactRequest
     * @return A Java Future containing the result of the CancelContact operation returned by the service.
     * @sample AWSGroundStationAsync.CancelContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CancelContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelContactResult> cancelContactAsync(CancelContactRequest cancelContactRequest);

    /**
     * <p>
     * Cancels a contact with a specified contact ID.
     * </p>
     * 
     * @param cancelContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelContact operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.CancelContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CancelContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelContactResult> cancelContactAsync(CancelContactRequest cancelContactRequest,
            com.amazonaws.handlers.AsyncHandler<CancelContactRequest, CancelContactResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>Config</code> with the specified <code>configData</code> parameters.
     * </p>
     * <p>
     * Only one type of <code>configData</code> can be specified.
     * </p>
     * 
     * @param createConfigRequest
     * @return A Java Future containing the result of the CreateConfig operation returned by the service.
     * @sample AWSGroundStationAsync.CreateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigResult> createConfigAsync(CreateConfigRequest createConfigRequest);

    /**
     * <p>
     * Creates a <code>Config</code> with the specified <code>configData</code> parameters.
     * </p>
     * <p>
     * Only one type of <code>configData</code> can be specified.
     * </p>
     * 
     * @param createConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfig operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.CreateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigResult> createConfigAsync(CreateConfigRequest createConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigRequest, CreateConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>DataflowEndpoint</code> group containing the specified list of <code>DataflowEndpoint</code>
     * objects.
     * </p>
     * <p>
     * The <code>name</code> field in each endpoint is used in your mission profile <code>DataflowEndpointConfig</code>
     * to specify which endpoints to use during a contact.
     * </p>
     * <p>
     * When a contact uses multiple <code>DataflowEndpointConfig</code> objects, each <code>Config</code> must match a
     * <code>DataflowEndpoint</code> in the same group.
     * </p>
     * 
     * @param createDataflowEndpointGroupRequest
     * @return A Java Future containing the result of the CreateDataflowEndpointGroup operation returned by the service.
     * @sample AWSGroundStationAsync.CreateDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataflowEndpointGroupResult> createDataflowEndpointGroupAsync(
            CreateDataflowEndpointGroupRequest createDataflowEndpointGroupRequest);

    /**
     * <p>
     * Creates a <code>DataflowEndpoint</code> group containing the specified list of <code>DataflowEndpoint</code>
     * objects.
     * </p>
     * <p>
     * The <code>name</code> field in each endpoint is used in your mission profile <code>DataflowEndpointConfig</code>
     * to specify which endpoints to use during a contact.
     * </p>
     * <p>
     * When a contact uses multiple <code>DataflowEndpointConfig</code> objects, each <code>Config</code> must match a
     * <code>DataflowEndpoint</code> in the same group.
     * </p>
     * 
     * @param createDataflowEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataflowEndpointGroup operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.CreateDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataflowEndpointGroupResult> createDataflowEndpointGroupAsync(
            CreateDataflowEndpointGroupRequest createDataflowEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataflowEndpointGroupRequest, CreateDataflowEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a mission profile.
     * </p>
     * <p>
     * <code>dataflowEdges</code> is a list of lists of strings. Each lower level list of strings has two elements: a
     * <i>from</i> ARN and a <i>to</i> ARN.
     * </p>
     * 
     * @param createMissionProfileRequest
     * @return A Java Future containing the result of the CreateMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsync.CreateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMissionProfileResult> createMissionProfileAsync(CreateMissionProfileRequest createMissionProfileRequest);

    /**
     * <p>
     * Creates a mission profile.
     * </p>
     * <p>
     * <code>dataflowEdges</code> is a list of lists of strings. Each lower level list of strings has two elements: a
     * <i>from</i> ARN and a <i>to</i> ARN.
     * </p>
     * 
     * @param createMissionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.CreateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMissionProfileResult> createMissionProfileAsync(CreateMissionProfileRequest createMissionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMissionProfileRequest, CreateMissionProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a <code>Config</code>.
     * </p>
     * 
     * @param deleteConfigRequest
     * @return A Java Future containing the result of the DeleteConfig operation returned by the service.
     * @sample AWSGroundStationAsync.DeleteConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigResult> deleteConfigAsync(DeleteConfigRequest deleteConfigRequest);

    /**
     * <p>
     * Deletes a <code>Config</code>.
     * </p>
     * 
     * @param deleteConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfig operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.DeleteConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigResult> deleteConfigAsync(DeleteConfigRequest deleteConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigRequest, DeleteConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataflow endpoint group.
     * </p>
     * 
     * @param deleteDataflowEndpointGroupRequest
     * @return A Java Future containing the result of the DeleteDataflowEndpointGroup operation returned by the service.
     * @sample AWSGroundStationAsync.DeleteDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataflowEndpointGroupResult> deleteDataflowEndpointGroupAsync(
            DeleteDataflowEndpointGroupRequest deleteDataflowEndpointGroupRequest);

    /**
     * <p>
     * Deletes a dataflow endpoint group.
     * </p>
     * 
     * @param deleteDataflowEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataflowEndpointGroup operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.DeleteDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataflowEndpointGroupResult> deleteDataflowEndpointGroupAsync(
            DeleteDataflowEndpointGroupRequest deleteDataflowEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataflowEndpointGroupRequest, DeleteDataflowEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a mission profile.
     * </p>
     * 
     * @param deleteMissionProfileRequest
     * @return A Java Future containing the result of the DeleteMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsync.DeleteMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMissionProfileResult> deleteMissionProfileAsync(DeleteMissionProfileRequest deleteMissionProfileRequest);

    /**
     * <p>
     * Deletes a mission profile.
     * </p>
     * 
     * @param deleteMissionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.DeleteMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMissionProfileResult> deleteMissionProfileAsync(DeleteMissionProfileRequest deleteMissionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMissionProfileRequest, DeleteMissionProfileResult> asyncHandler);

    /**
     * <p>
     * Describes an existing contact.
     * </p>
     * 
     * @param describeContactRequest
     * @return A Java Future containing the result of the DescribeContact operation returned by the service.
     * @sample AWSGroundStationAsync.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DescribeContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest describeContactRequest);

    /**
     * <p>
     * Describes an existing contact.
     * </p>
     * 
     * @param describeContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContact operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DescribeContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContactResult> describeContactAsync(DescribeContactRequest describeContactRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContactRequest, DescribeContactResult> asyncHandler);

    /**
     * <p>
     * Returns <code>Config</code> information.
     * </p>
     * <p>
     * Only one <code>Config</code> response can be returned.
     * </p>
     * 
     * @param getConfigRequest
     * @return A Java Future containing the result of the GetConfig operation returned by the service.
     * @sample AWSGroundStationAsync.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest);

    /**
     * <p>
     * Returns <code>Config</code> information.
     * </p>
     * <p>
     * Only one <code>Config</code> response can be returned.
     * </p>
     * 
     * @param getConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfig operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler);

    /**
     * <p>
     * Returns the dataflow endpoint group.
     * </p>
     * 
     * @param getDataflowEndpointGroupRequest
     * @return A Java Future containing the result of the GetDataflowEndpointGroup operation returned by the service.
     * @sample AWSGroundStationAsync.GetDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataflowEndpointGroupResult> getDataflowEndpointGroupAsync(GetDataflowEndpointGroupRequest getDataflowEndpointGroupRequest);

    /**
     * <p>
     * Returns the dataflow endpoint group.
     * </p>
     * 
     * @param getDataflowEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataflowEndpointGroup operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.GetDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataflowEndpointGroupResult> getDataflowEndpointGroupAsync(GetDataflowEndpointGroupRequest getDataflowEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataflowEndpointGroupRequest, GetDataflowEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Returns the number of minutes used by account.
     * </p>
     * 
     * @param getMinuteUsageRequest
     * @return A Java Future containing the result of the GetMinuteUsage operation returned by the service.
     * @sample AWSGroundStationAsync.GetMinuteUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMinuteUsage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMinuteUsageResult> getMinuteUsageAsync(GetMinuteUsageRequest getMinuteUsageRequest);

    /**
     * <p>
     * Returns the number of minutes used by account.
     * </p>
     * 
     * @param getMinuteUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMinuteUsage operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.GetMinuteUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMinuteUsage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMinuteUsageResult> getMinuteUsageAsync(GetMinuteUsageRequest getMinuteUsageRequest,
            com.amazonaws.handlers.AsyncHandler<GetMinuteUsageRequest, GetMinuteUsageResult> asyncHandler);

    /**
     * <p>
     * Returns a mission profile.
     * </p>
     * 
     * @param getMissionProfileRequest
     * @return A Java Future containing the result of the GetMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsync.GetMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMissionProfileResult> getMissionProfileAsync(GetMissionProfileRequest getMissionProfileRequest);

    /**
     * <p>
     * Returns a mission profile.
     * </p>
     * 
     * @param getMissionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.GetMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMissionProfileResult> getMissionProfileAsync(GetMissionProfileRequest getMissionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetMissionProfileRequest, GetMissionProfileResult> asyncHandler);

    /**
     * <p>
     * Returns a satellite.
     * </p>
     * 
     * @param getSatelliteRequest
     * @return A Java Future containing the result of the GetSatellite operation returned by the service.
     * @sample AWSGroundStationAsync.GetSatellite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetSatellite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSatelliteResult> getSatelliteAsync(GetSatelliteRequest getSatelliteRequest);

    /**
     * <p>
     * Returns a satellite.
     * </p>
     * 
     * @param getSatelliteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSatellite operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.GetSatellite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetSatellite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSatelliteResult> getSatelliteAsync(GetSatelliteRequest getSatelliteRequest,
            com.amazonaws.handlers.AsyncHandler<GetSatelliteRequest, GetSatelliteResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>Config</code> objects.
     * </p>
     * 
     * @param listConfigsRequest
     * @return A Java Future containing the result of the ListConfigs operation returned by the service.
     * @sample AWSGroundStationAsync.ListConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListConfigs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConfigsResult> listConfigsAsync(ListConfigsRequest listConfigsRequest);

    /**
     * <p>
     * Returns a list of <code>Config</code> objects.
     * </p>
     * 
     * @param listConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigs operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListConfigs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConfigsResult> listConfigsAsync(ListConfigsRequest listConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigsRequest, ListConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of contacts.
     * </p>
     * <p>
     * If <code>statusList</code> contains AVAILABLE, the request must include <code>groundStation</code>,
     * <code>missionprofileArn</code>, and <code>satelliteArn</code>.
     * </p>
     * 
     * @param listContactsRequest
     * @return A Java Future containing the result of the ListContacts operation returned by the service.
     * @sample AWSGroundStationAsync.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest listContactsRequest);

    /**
     * <p>
     * Returns a list of contacts.
     * </p>
     * <p>
     * If <code>statusList</code> contains AVAILABLE, the request must include <code>groundStation</code>,
     * <code>missionprofileArn</code>, and <code>satelliteArn</code>.
     * </p>
     * 
     * @param listContactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContacts operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContactsResult> listContactsAsync(ListContactsRequest listContactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContactsRequest, ListContactsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DataflowEndpoint</code> groups.
     * </p>
     * 
     * @param listDataflowEndpointGroupsRequest
     * @return A Java Future containing the result of the ListDataflowEndpointGroups operation returned by the service.
     * @sample AWSGroundStationAsync.ListDataflowEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListDataflowEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataflowEndpointGroupsResult> listDataflowEndpointGroupsAsync(
            ListDataflowEndpointGroupsRequest listDataflowEndpointGroupsRequest);

    /**
     * <p>
     * Returns a list of <code>DataflowEndpoint</code> groups.
     * </p>
     * 
     * @param listDataflowEndpointGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataflowEndpointGroups operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListDataflowEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListDataflowEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataflowEndpointGroupsResult> listDataflowEndpointGroupsAsync(
            ListDataflowEndpointGroupsRequest listDataflowEndpointGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataflowEndpointGroupsRequest, ListDataflowEndpointGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of ground stations.
     * </p>
     * 
     * @param listGroundStationsRequest
     * @return A Java Future containing the result of the ListGroundStations operation returned by the service.
     * @sample AWSGroundStationAsync.ListGroundStations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListGroundStations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroundStationsResult> listGroundStationsAsync(ListGroundStationsRequest listGroundStationsRequest);

    /**
     * <p>
     * Returns a list of ground stations.
     * </p>
     * 
     * @param listGroundStationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroundStations operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListGroundStations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListGroundStations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGroundStationsResult> listGroundStationsAsync(ListGroundStationsRequest listGroundStationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroundStationsRequest, ListGroundStationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of mission profiles.
     * </p>
     * 
     * @param listMissionProfilesRequest
     * @return A Java Future containing the result of the ListMissionProfiles operation returned by the service.
     * @sample AWSGroundStationAsync.ListMissionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListMissionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMissionProfilesResult> listMissionProfilesAsync(ListMissionProfilesRequest listMissionProfilesRequest);

    /**
     * <p>
     * Returns a list of mission profiles.
     * </p>
     * 
     * @param listMissionProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMissionProfiles operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListMissionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListMissionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMissionProfilesResult> listMissionProfilesAsync(ListMissionProfilesRequest listMissionProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMissionProfilesRequest, ListMissionProfilesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of satellites.
     * </p>
     * 
     * @param listSatellitesRequest
     * @return A Java Future containing the result of the ListSatellites operation returned by the service.
     * @sample AWSGroundStationAsync.ListSatellites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListSatellites" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSatellitesResult> listSatellitesAsync(ListSatellitesRequest listSatellitesRequest);

    /**
     * <p>
     * Returns a list of satellites.
     * </p>
     * 
     * @param listSatellitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSatellites operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListSatellites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListSatellites" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSatellitesResult> listSatellitesAsync(ListSatellitesRequest listSatellitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSatellitesRequest, ListSatellitesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGroundStationAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Reserves a contact using specified parameters.
     * </p>
     * 
     * @param reserveContactRequest
     * @return A Java Future containing the result of the ReserveContact operation returned by the service.
     * @sample AWSGroundStationAsync.ReserveContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ReserveContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ReserveContactResult> reserveContactAsync(ReserveContactRequest reserveContactRequest);

    /**
     * <p>
     * Reserves a contact using specified parameters.
     * </p>
     * 
     * @param reserveContactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReserveContact operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.ReserveContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ReserveContact" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ReserveContactResult> reserveContactAsync(ReserveContactRequest reserveContactRequest,
            com.amazonaws.handlers.AsyncHandler<ReserveContactRequest, ReserveContactResult> asyncHandler);

    /**
     * <p>
     * Assigns a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGroundStationAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deassigns a resource tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGroundStationAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deassigns a resource tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the <code>Config</code> used when scheduling contacts.
     * </p>
     * <p>
     * Updating a <code>Config</code> will not update the execution parameters for existing future contacts scheduled
     * with this <code>Config</code>.
     * </p>
     * 
     * @param updateConfigRequest
     * @return A Java Future containing the result of the UpdateConfig operation returned by the service.
     * @sample AWSGroundStationAsync.UpdateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigResult> updateConfigAsync(UpdateConfigRequest updateConfigRequest);

    /**
     * <p>
     * Updates the <code>Config</code> used when scheduling contacts.
     * </p>
     * <p>
     * Updating a <code>Config</code> will not update the execution parameters for existing future contacts scheduled
     * with this <code>Config</code>.
     * </p>
     * 
     * @param updateConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfig operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.UpdateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigResult> updateConfigAsync(UpdateConfigRequest updateConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigRequest, UpdateConfigResult> asyncHandler);

    /**
     * <p>
     * Updates a mission profile.
     * </p>
     * <p>
     * Updating a mission profile will not update the execution parameters for existing future contacts.
     * </p>
     * 
     * @param updateMissionProfileRequest
     * @return A Java Future containing the result of the UpdateMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsync.UpdateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMissionProfileResult> updateMissionProfileAsync(UpdateMissionProfileRequest updateMissionProfileRequest);

    /**
     * <p>
     * Updates a mission profile.
     * </p>
     * <p>
     * Updating a mission profile will not update the execution parameters for existing future contacts.
     * </p>
     * 
     * @param updateMissionProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMissionProfile operation returned by the service.
     * @sample AWSGroundStationAsyncHandler.UpdateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMissionProfileResult> updateMissionProfileAsync(UpdateMissionProfileRequest updateMissionProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMissionProfileRequest, UpdateMissionProfileResult> asyncHandler);

}

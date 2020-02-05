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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.groundstation.model.*;

/**
 * Interface for accessing AWS Ground Station.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.groundstation.AbstractAWSGroundStation} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the AWS Ground Station API Reference. AWS Ground Station is a fully managed service that enables you to
 * control satellite communications, downlink and process satellite data, and scale your satellite operations
 * efficiently and cost-effectively without having to build or manage your own ground station infrastructure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGroundStation {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "groundstation";

    /**
     * <p>
     * Cancels a contact with a specified contact ID.
     * </p>
     * 
     * @param cancelContactRequest
     * @return Result of the CancelContact operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CancelContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CancelContact" target="_top">AWS
     *      API Documentation</a>
     */
    CancelContactResult cancelContact(CancelContactRequest cancelContactRequest);

    /**
     * <p>
     * Creates a <code>Config</code> with the specified <code>configData</code> parameters.
     * </p>
     * <p>
     * Only one type of <code>configData</code> can be specified.
     * </p>
     * 
     * @param createConfigRequest
     * @return Result of the CreateConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceLimitExceededException
     *         Account limits for this resource have been exceeded.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CreateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    CreateConfigResult createConfig(CreateConfigRequest createConfigRequest);

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
     * @return Result of the CreateDataflowEndpointGroup operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CreateDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDataflowEndpointGroupResult createDataflowEndpointGroup(CreateDataflowEndpointGroupRequest createDataflowEndpointGroupRequest);

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
     * @return Result of the CreateMissionProfile operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.CreateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/CreateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMissionProfileResult createMissionProfile(CreateMissionProfileRequest createMissionProfileRequest);

    /**
     * <p>
     * Deletes a <code>Config</code>.
     * </p>
     * 
     * @param deleteConfigRequest
     * @return Result of the DeleteConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DeleteConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteConfig" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteConfigResult deleteConfig(DeleteConfigRequest deleteConfigRequest);

    /**
     * <p>
     * Deletes a dataflow endpoint group.
     * </p>
     * 
     * @param deleteDataflowEndpointGroupRequest
     * @return Result of the DeleteDataflowEndpointGroup operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DeleteDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDataflowEndpointGroupResult deleteDataflowEndpointGroup(DeleteDataflowEndpointGroupRequest deleteDataflowEndpointGroupRequest);

    /**
     * <p>
     * Deletes a mission profile.
     * </p>
     * 
     * @param deleteMissionProfileRequest
     * @return Result of the DeleteMissionProfile operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DeleteMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DeleteMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMissionProfileResult deleteMissionProfile(DeleteMissionProfileRequest deleteMissionProfileRequest);

    /**
     * <p>
     * Describes an existing contact.
     * </p>
     * 
     * @param describeContactRequest
     * @return Result of the DescribeContact operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.DescribeContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DescribeContact" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeContactResult describeContact(DescribeContactRequest describeContactRequest);

    /**
     * <p>
     * Returns <code>Config</code> information.
     * </p>
     * <p>
     * Only one <code>Config</code> response can be returned.
     * </p>
     * 
     * @param getConfigRequest
     * @return Result of the GetConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    GetConfigResult getConfig(GetConfigRequest getConfigRequest);

    /**
     * <p>
     * Returns the dataflow endpoint group.
     * </p>
     * 
     * @param getDataflowEndpointGroupRequest
     * @return Result of the GetDataflowEndpointGroup operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetDataflowEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetDataflowEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataflowEndpointGroupResult getDataflowEndpointGroup(GetDataflowEndpointGroupRequest getDataflowEndpointGroupRequest);

    /**
     * <p>
     * Returns the number of minutes used by account.
     * </p>
     * 
     * @param getMinuteUsageRequest
     * @return Result of the GetMinuteUsage operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetMinuteUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMinuteUsage" target="_top">AWS
     *      API Documentation</a>
     */
    GetMinuteUsageResult getMinuteUsage(GetMinuteUsageRequest getMinuteUsageRequest);

    /**
     * <p>
     * Returns a mission profile.
     * </p>
     * 
     * @param getMissionProfileRequest
     * @return Result of the GetMissionProfile operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    GetMissionProfileResult getMissionProfile(GetMissionProfileRequest getMissionProfileRequest);

    /**
     * <p>
     * Returns a satellite.
     * </p>
     * 
     * @param getSatelliteRequest
     * @return Result of the GetSatellite operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.GetSatellite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GetSatellite" target="_top">AWS API
     *      Documentation</a>
     */
    GetSatelliteResult getSatellite(GetSatelliteRequest getSatelliteRequest);

    /**
     * <p>
     * Returns a list of <code>Config</code> objects.
     * </p>
     * 
     * @param listConfigsRequest
     * @return Result of the ListConfigs operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListConfigs" target="_top">AWS API
     *      Documentation</a>
     */
    ListConfigsResult listConfigs(ListConfigsRequest listConfigsRequest);

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
     * @return Result of the ListContacts operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListContacts" target="_top">AWS API
     *      Documentation</a>
     */
    ListContactsResult listContacts(ListContactsRequest listContactsRequest);

    /**
     * <p>
     * Returns a list of <code>DataflowEndpoint</code> groups.
     * </p>
     * 
     * @param listDataflowEndpointGroupsRequest
     * @return Result of the ListDataflowEndpointGroups operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListDataflowEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListDataflowEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataflowEndpointGroupsResult listDataflowEndpointGroups(ListDataflowEndpointGroupsRequest listDataflowEndpointGroupsRequest);

    /**
     * <p>
     * Returns a list of ground stations.
     * </p>
     * 
     * @param listGroundStationsRequest
     * @return Result of the ListGroundStations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListGroundStations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListGroundStations"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroundStationsResult listGroundStations(ListGroundStationsRequest listGroundStationsRequest);

    /**
     * <p>
     * Returns a list of mission profiles.
     * </p>
     * 
     * @param listMissionProfilesRequest
     * @return Result of the ListMissionProfiles operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListMissionProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListMissionProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListMissionProfilesResult listMissionProfiles(ListMissionProfilesRequest listMissionProfilesRequest);

    /**
     * <p>
     * Returns a list of satellites.
     * </p>
     * 
     * @param listSatellitesRequest
     * @return Result of the ListSatellites operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListSatellites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListSatellites" target="_top">AWS
     *      API Documentation</a>
     */
    ListSatellitesResult listSatellites(ListSatellitesRequest listSatellitesRequest);

    /**
     * <p>
     * Returns a list of tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Reserves a contact using specified parameters.
     * </p>
     * 
     * @param reserveContactRequest
     * @return Result of the ReserveContact operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.ReserveContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ReserveContact" target="_top">AWS
     *      API Documentation</a>
     */
    ReserveContactResult reserveContact(ReserveContactRequest reserveContactRequest);

    /**
     * <p>
     * Assigns a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deassigns a resource tag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.UpdateConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateConfig" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateConfigResult updateConfig(UpdateConfigRequest updateConfigRequest);

    /**
     * <p>
     * Updates a mission profile.
     * </p>
     * <p>
     * Updating a mission profile will not update the execution parameters for existing future contacts.
     * </p>
     * 
     * @param updateMissionProfileRequest
     * @return Result of the UpdateMissionProfile operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws DependencyException
     *         Dependency encountered an error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @sample AWSGroundStation.UpdateMissionProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateMissionProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMissionProfileResult updateMissionProfile(UpdateMissionProfileRequest updateMissionProfileRequest);

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

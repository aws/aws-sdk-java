/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks;

import com.amazonaws.*;
import com.amazonaws.services.opsworks.model.*;


/**
 * Interface for accessing AWSOpsWorks.
 * AWS OpsWorks
 */
public interface AWSOpsWorks {

    /**
     * Overrides the default endpoint for this client ("https://opsworks.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://opsworks.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://opsworks.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Updates a specified user's SSH name and public key.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new stack.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack service method on AWSOpsWorks.
     * 
     * @return The response from the CreateStack service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStackResult createStack(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a specified instance.
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebootInstance(RebootInstanceRequest rebootInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies a stack's permissions.
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission service method on AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setPermission(SetPermissionRequest setPermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a set of instances associated with a
     * specified ID or IDs.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeInstances service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the permissions for a specified stack. You must specify at
     * least one of the two request values.
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribePermissions service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePermissionsResult describePermissions(DescribePermissionsRequest describePermissionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified instance.
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteInstance(DeleteInstanceRequest deleteInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a clone of a specified stack.
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack service method on AWSOpsWorks.
     * 
     * @return The response from the CloneStack service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CloneStackResult cloneStack(CloneStackRequest cloneStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an instance in a specified stack.
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance service method on AWSOpsWorks.
     * 
     * @return The response from the CreateInstance service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data.
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopInstance(StopInstanceRequest stopInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified app.
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApp(UpdateAppRequest updateAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApp(DeleteAppRequest deleteAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeCommands service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCommandsResult describeCommands(DescribeCommandsRequest describeCommandsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateStack(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user.
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile service method on AWSOpsWorks.
     * 
     * @return The response from the CreateUserProfile service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a generated hostname for the specified layer, based on the
     * current hostname theme.
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the GetHostnameSuggestion service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest getHostnameSuggestionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeRaidArrays service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest describeRaidArraysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeLayers service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLayersResult describeLayers(DescribeLayersRequest describeLayersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeLoadBasedAutoScaling service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer.
     * </p>
     * <p>
     * <b>NOTE:</b>To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified layer. You must first remove all associated
     * instances.
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLayer(DeleteLayerRequest deleteLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance.
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an app for a specified stack.
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp service method on AWSOpsWorks.
     * 
     * @return The response from the CreateApp service method, as returned by
     *         AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAppResult createApp(CreateAppRequest createAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeTimeBasedAutoScaling service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe specified users.
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeUserProfiles service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest describeUserProfilesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateInstance(UpdateInstanceRequest updateInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes OpsWorks service errors.
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeServiceErrors service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest describeServiceErrorsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeDeployments service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest describeDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateLayer(UpdateLayerRequest updateLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a specified instance.
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startInstance(StartInstanceRequest startInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeElasticIps service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest describeElasticIpsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeStacks service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeApps service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAppsResult describeApps(DescribeAppsRequest describeAppsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a layer.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer service method on AWSOpsWorks.
     * 
     * @return The response from the CreateLayer service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLayerResult createLayer(CreateLayerRequest createLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances and
     * layers.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts stack's instances.
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startStack(StartStackRequest startStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack service method on AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopStack(StopStackRequest stopStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deploys a stack or app.
     * </p>
     * 
     * <ul>
     * <li>App deployment generates a <code>deploy</code> event, which runs
     * the associated recipes and passes them a JSON stack configuration
     * object that includes information about the app. </li>
     * <li>Stack deployment runs the <code>deploy</code> recipes but does
     * not raise an event.</li>
     * 
     * </ul>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment service method on AWSOpsWorks.
     * 
     * @return The response from the CreateDeployment service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
        
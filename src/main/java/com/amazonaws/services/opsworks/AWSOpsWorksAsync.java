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
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.opsworks.model.*;

/**
 * Interface for accessing AWSOpsWorks asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS OpsWorks 
 */       
public interface AWSOpsWorksAsync extends AWSOpsWorks {
    /**
     * <p>
     * Updates a specified user's SSH name and public key.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified user's SSH name and public key.
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest,
            AsyncHandler<UpdateUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new stack.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new stack.
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest,
            AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a specified instance.
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a specified instance.
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest,
            AsyncHandler<RebootInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies a stack's permissions.
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPermissionAsync(SetPermissionRequest setPermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies a stack's permissions.
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setPermissionAsync(SetPermissionRequest setPermissionRequest,
            AsyncHandler<SetPermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a set of instances associated with a
     * specified ID or IDs.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a set of instances associated with a
     * specified ID or IDs.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest,
            AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the permissions for a specified stack. You must specify at
     * least one of the two request values.
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePermissionsResult> describePermissionsAsync(DescribePermissionsRequest describePermissionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the permissions for a specified stack. You must specify at
     * least one of the two request values.
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePermissionsResult> describePermissionsAsync(DescribePermissionsRequest describePermissionsRequest,
            AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified instance.
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified instance.
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            AsyncHandler<DeleteInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a clone of a specified stack.
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CloneStackResult> cloneStackAsync(CloneStackRequest cloneStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a clone of a specified stack.
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CloneStackResult> cloneStackAsync(CloneStackRequest cloneStackRequest,
            AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an instance in a specified stack.
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an instance in a specified stack.
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest,
            AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data.
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopInstanceAsync(StopInstanceRequest stopInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data.
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopInstanceAsync(StopInstanceRequest stopInstanceRequest,
            AsyncHandler<StopInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified app.
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAppAsync(UpdateAppRequest updateAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified app.
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateAppAsync(UpdateAppRequest updateAppRequest,
            AsyncHandler<UpdateAppRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAppAsync(DeleteAppRequest deleteAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            AsyncHandler<DeleteAppRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommandsResult> describeCommandsAsync(DescribeCommandsRequest describeCommandsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommandsResult> describeCommandsAsync(DescribeCommandsRequest describeCommandsRequest,
            AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateStackAsync(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateStackAsync(UpdateStackRequest updateStackRequest,
            AsyncHandler<UpdateStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user.
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user.
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest,
            AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a generated hostname for the specified layer, based on the
     * current hostname theme.
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(GetHostnameSuggestionRequest getHostnameSuggestionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a generated hostname for the specified layer, based on the
     * current hostname theme.
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(GetHostnameSuggestionRequest getHostnameSuggestionRequest,
            AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRaidArraysResult> describeRaidArraysAsync(DescribeRaidArraysRequest describeRaidArraysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRaidArraysResult> describeRaidArraysAsync(DescribeRaidArraysRequest describeRaidArraysRequest,
            AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLayersResult> describeLayersAsync(DescribeLayersRequest describeLayersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLayersResult> describeLayersAsync(DescribeLayersRequest describeLayersRequest,
            AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLoadBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest,
            AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler)
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
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBasedAutoScalingAsync(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) 
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
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setLoadBasedAutoScalingAsync(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest,
            AsyncHandler<SetLoadBasedAutoScalingRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified layer. You must first remove all associated
     * instances.
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLayerAsync(DeleteLayerRequest deleteLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified layer. You must first remove all associated
     * instances.
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteLayerAsync(DeleteLayerRequest deleteLayerRequest,
            AsyncHandler<DeleteLayerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest,
            AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance.
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTimeBasedAutoScalingAsync(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance.
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> setTimeBasedAutoScalingAsync(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest,
            AsyncHandler<SetTimeBasedAutoScalingRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an app for a specified stack.
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an app for a specified stack.
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTimeBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTimeBasedAutoScaling service method, as returned by
     *         AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest,
            AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user.
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest,
            AsyncHandler<DeleteUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe specified users.
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUserProfilesResult> describeUserProfilesAsync(DescribeUserProfilesRequest describeUserProfilesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe specified users.
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUserProfilesResult> describeUserProfilesAsync(DescribeUserProfilesRequest describeUserProfilesRequest,
            AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateInstanceAsync(UpdateInstanceRequest updateInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateInstanceAsync(UpdateInstanceRequest updateInstanceRequest,
            AsyncHandler<UpdateInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes OpsWorks service errors.
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(DescribeServiceErrorsRequest describeServiceErrorsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes OpsWorks service errors.
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(DescribeServiceErrorsRequest describeServiceErrorsRequest,
            AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeploymentsResult> describeDeploymentsAsync(DescribeDeploymentsRequest describeDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDeploymentsResult> describeDeploymentsAsync(DescribeDeploymentsRequest describeDeploymentsRequest,
            AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLayerAsync(UpdateLayerRequest updateLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateLayerAsync(UpdateLayerRequest updateLayerRequest,
            AsyncHandler<UpdateLayerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a specified instance.
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startInstanceAsync(StartInstanceRequest startInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a specified instance.
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startInstanceAsync(StartInstanceRequest startInstanceRequest,
            AsyncHandler<StartInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticIpsResult> describeElasticIpsAsync(DescribeElasticIpsRequest describeElasticIpsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's <a
     * aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">
     * Elastic IP addresses </a> .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticIpsResult> describeElasticIpsAsync(DescribeElasticIpsRequest describeElasticIpsRequest,
            AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest,
            AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAppsResult> describeAppsAsync(DescribeAppsRequest describeAppsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAppsResult> describeAppsAsync(DescribeAppsRequest describeAppsRequest,
            AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a layer.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLayerResult> createLayerAsync(CreateLayerRequest createLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a layer.
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateLayerResult> createLayerAsync(CreateLayerRequest createLayerRequest,
            AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances and
     * layers.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances and
     * layers.
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStackAsync(DeleteStackRequest deleteStackRequest,
            AsyncHandler<DeleteStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts stack's instances.
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startStackAsync(StartStackRequest startStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts stack's instances.
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> startStackAsync(StartStackRequest startStackRequest,
            AsyncHandler<StartStackRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopStackAsync(StopStackRequest stopStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> stopStackAsync(StopStackRequest stopStackRequest,
            AsyncHandler<StopStackRequest, Void> asyncHandler)
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
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest) 
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
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        
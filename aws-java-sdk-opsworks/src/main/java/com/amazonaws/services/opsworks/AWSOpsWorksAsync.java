/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS OpsWorks <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i> . This guide provides
 * descriptions, syntax, and usage examples about AWS OpsWorks actions
 * and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an
 * integrated experience for overseeing the complete application
 * lifecycle. For information about this product, go to the
 * <a href="http://aws.amazon.com/opsworks/"> AWS OpsWorks </a>
 * details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS
 * Command Line Interface (CLI) or by using one of the AWS SDKs to
 * implement applications in your preferred language. For more
 * information, see:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html"> AWS CLI </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html"> AWS SDK for Java </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm"> AWS SDK for .NET </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html"> AWS SDK for PHP 2 </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSRubySDK/latest/AWS/OpsWorks/Client.html"> AWS SDK for Ruby </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforjavascript/"> AWS SDK for Node.js </a>
 * </li>
 * <li>
 * <a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html"> AWS SDK for Python(Boto) </a>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint,
 * opsworks.us-east-1.amazonaws.com (HTTPS), so you must connect to that
 * endpoint. You can then use the API to direct AWS OpsWorks to create
 * stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call CreateStack, CloneStack, or UpdateStack we recommend you
 * use the <code>ConfigurationManager</code> parameter to specify the
 * Chef version, 0.9, 11.4, or 11.10. The default value is currently
 * 11.10. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html"> Chef Versions </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>You can still specify Chef 0.9 for your stack, but new
 * features are not available for Chef 0.9 stacks, and support is
 * scheduled to end on July 24, 2014. We do not recommend using Chef 0.9
 * for new stacks, and we recommend migrating your existing Chef 0.9
 * stacks to Chef 11.10 as soon as possible.
 * </p>
 */
public interface AWSOpsWorksAsync extends AWSOpsWorks {
    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterRdsDbInstanceAsync(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterRdsDbInstanceAsync(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest,
            AsyncHandler<DeregisterRdsDbInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the RegisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerRdsDbInstanceAsync(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the RegisterRdsDbInstance operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> registerRdsDbInstanceAsync(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest,
            AsyncHandler<RegisterRdsDbInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateMyUserProfileRequest Container for the necessary
     *           parameters to execute the UpdateMyUserProfile operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateMyUserProfileAsync(UpdateMyUserProfileRequest updateMyUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateMyUserProfileRequest Container for the necessary
     *           parameters to execute the UpdateMyUserProfile operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateMyUserProfileAsync(UpdateMyUserProfileRequest updateMyUserProfileRequest,
            AsyncHandler<UpdateMyUserProfileRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered
     * by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterVolumeRequest Container for the necessary parameters
     *           to execute the DeregisterVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterVolumeAsync(DeregisterVolumeRequest deregisterVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered
     * by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterVolumeRequest Container for the necessary parameters
     *           to execute the DeregisterVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterVolumeAsync(DeregisterVolumeRequest deregisterVolumeRequest,
            AsyncHandler<DeregisterVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies a user's permissions. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"> Security and Permissions </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetPermission service method, as returned by AWSOpsWorks.
     * 
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
     * Specifies a user's permissions. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"> Security and Permissions </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Requests a description of a set of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AWSOpsWorks.
     * 
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
     * Requests a description of a set of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePermissions service method, as returned by AWSOpsWorks.
     * 
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
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Deletes a specified instance, which terminates the associated Amazon
     * EC2 instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"> Deleting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInstance service method, as returned by AWSOpsWorks.
     * 
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
     * Deletes a specified instance, which terminates the associated Amazon
     * EC2 instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"> Deleting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Creates a clone of a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"> Clone a Stack </a>
     * . By default, all parameters are set to the values used by the parent
     * stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CloneStack service method, as returned by AWSOpsWorks.
     * 
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
     * Creates a clone of a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"> Clone a Stack </a>
     * . By default, all parameters are set to the values used by the parent
     * stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param detachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the DetachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DetachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachElasticLoadBalancerAsync(DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param detachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the DetachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachElasticLoadBalancerAsync(DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest,
            AsyncHandler<DetachElasticLoadBalancerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstance service method, as returned by AWSOpsWorks.
     * 
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
     * You can stop an Amazon EBS-backed instance without losing data. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateApp service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRdsDbInstancesRequest Container for the necessary
     *           parameters to execute the DescribeRdsDbInstances operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRdsDbInstances service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRdsDbInstancesRequest Container for the necessary
     *           parameters to execute the DescribeRdsDbInstances operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRdsDbInstances service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest,
            AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommands service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the
     * stack by calling RegisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param associateElasticIpRequest Container for the necessary
     *           parameters to execute the AssociateElasticIp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateElasticIpAsync(AssociateElasticIpRequest associateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the
     * stack by calling RegisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param associateElasticIpRequest Container for the necessary
     *           parameters to execute the AssociateElasticIp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateElasticIpAsync(AssociateElasticIpRequest associateElasticIpRequest,
            AsyncHandler<AssociateElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains
     * registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignVolumeRequest Container for the necessary parameters to
     *           execute the UnassignVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignVolumeAsync(UnassignVolumeRequest unassignVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains
     * registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignVolumeRequest Container for the necessary parameters to
     *           execute the UnassignVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignVolumeAsync(UnassignVolumeRequest unassignVolumeRequest,
            AsyncHandler<UnassignVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRaidArrays service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Gets a generated host name for the specified layer, based on the
     * current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostnameSuggestion service method, as returned by AWSOpsWorks.
     * 
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
     * Gets a generated host name for the specified layer, based on the
     * current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Specify the load-based auto scaling configuration for a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetLoadBasedAutoScaling service method, as returned by AWSOpsWorks.
     * 
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
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Assigns one of the stack's registered Amazon EBS volumes to a
     * specified instance. The volume must first be registered with the stack
     * by calling RegisterVolume. After you register the volume, you must
     * call UpdateVolume to specify a mount point before calling
     * <code>AssignVolume</code> . For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignVolumeRequest Container for the necessary parameters to
     *           execute the AssignVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AssignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignVolumeAsync(AssignVolumeRequest assignVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a
     * specified instance. The volume must first be registered with the stack
     * by calling RegisterVolume. After you register the volume, you must
     * call UpdateVolume to specify a mount point before calling
     * <code>AssignVolume</code> . For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignVolumeRequest Container for the necessary parameters to
     *           execute the AssignVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssignVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignVolumeAsync(AssignVolumeRequest assignVolumeRequest,
            AsyncHandler<AssignVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignInstanceRequest Container for the necessary parameters
     *           to execute the UnassignInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignInstanceAsync(UnassignInstanceRequest unassignInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignInstanceRequest Container for the necessary parameters
     *           to execute the UnassignInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignInstanceAsync(UnassignInstanceRequest unassignInstanceRequest,
            AsyncHandler<UnassignInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b>This action can be used only with Windows stacks.
     * </p>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     *
     * @param grantAccessRequest Container for the necessary parameters to
     *           execute the GrantAccess operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         GrantAccess service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GrantAccessResult> grantAccessAsync(GrantAccessRequest grantAccessRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b>This action can be used only with Windows stacks.
     * </p>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     *
     * @param grantAccessRequest Container for the necessary parameters to
     *           execute the GrantAccess operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GrantAccess service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GrantAccessResult> grantAccessAsync(GrantAccessRequest grantAccessRequest,
            AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServiceErrors service method, as returned by AWSOpsWorks.
     * 
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
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Updates a registered Elastic IP address's name. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateElasticIpRequest Container for the necessary parameters
     *           to execute the UpdateElasticIp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateElasticIpAsync(UpdateElasticIpRequest updateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateElasticIpRequest Container for the necessary parameters
     *           to execute the UpdateElasticIp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateElasticIpAsync(UpdateElasticIpRequest updateElasticIpRequest,
            AsyncHandler<UpdateElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateLayer service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Starts a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstance service method, as returned by AWSOpsWorks.
     * 
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
     * Starts a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Creates a layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"> How to Create a Layer </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You should use CreateLayer for noncustom layer types
     * such as PHP App Server only if the stack does not have an existing
     * layer of that type. A stack can have at most one instance of each
     * noncustom layer; if you attempt to create a second instance,
     * CreateLayer fails. A stack can have an arbitrary number of custom
     * layers, so you can call CreateLayer as many times as you like for that
     * layer type.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateLayer service method, as returned by AWSOpsWorks.
     * 
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
     * Creates a layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"> How to Create a Layer </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You should use CreateLayer for noncustom layer types
     * such as PHP App Server only if the stack does not have an existing
     * layer of that type. A stack can have at most one instance of each
     * noncustom layer; if you attempt to create a second instance,
     * CreateLayer fails. A stack can have an arbitrary number of custom
     * layers, so you can call CreateLayer as many times as you like for that
     * layer type.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param disassociateElasticIpRequest Container for the necessary
     *           parameters to execute the DisassociateElasticIp operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateElasticIpAsync(DisassociateElasticIpRequest disassociateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param disassociateElasticIpRequest Container for the necessary
     *           parameters to execute the DisassociateElasticIp operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateElasticIpAsync(DisassociateElasticIpRequest disassociateElasticIpRequest,
            AsyncHandler<DisassociateElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances,
     * layers, and apps or deregister registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"> Shut Down a Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteStack service method, as returned by AWSOpsWorks.
     * 
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
     * Deletes a specified stack. You must first delete all instances,
     * layers, and apps or deregister registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"> Shut Down a Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes the available AWS OpsWorks agent versions. You must specify
     * a stack ID or a configuration manager.
     * <code>DescribeAgentVersions</code> returns a list of available agent
     * versions for the specified stack or configuration manager.
     * </p>
     *
     * @param describeAgentVersionsRequest Container for the necessary
     *           parameters to execute the DescribeAgentVersions operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAgentVersions service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(DescribeAgentVersionsRequest describeAgentVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the available AWS OpsWorks agent versions. You must specify
     * a stack ID or a configuration manager.
     * <code>DescribeAgentVersions</code> returns a list of available agent
     * versions for the specified stack or configuration manager.
     * </p>
     *
     * @param describeAgentVersionsRequest Container for the necessary
     *           parameters to execute the DescribeAgentVersions operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAgentVersions service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(DescribeAgentVersionsRequest describeAgentVersionsRequest,
            AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StartStack service method, as returned by AWSOpsWorks.
     * 
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
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Registers an Amazon EBS volume with a specified stack. A volume can
     * be registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling DeregisterVolume.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerVolumeRequest Container for the necessary parameters to
     *           execute the RegisterVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterVolumeResult> registerVolumeAsync(RegisterVolumeRequest registerVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can
     * be registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling DeregisterVolume.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerVolumeRequest Container for the necessary parameters to
     *           execute the RegisterVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterVolumeResult> registerVolumeAsync(RegisterVolumeRequest registerVolumeRequest,
            AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the UpdateRdsDbInstance operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateRdsDbInstanceAsync(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the UpdateRdsDbInstance operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateRdsDbInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateRdsDbInstanceAsync(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest,
            AsyncHandler<UpdateRdsDbInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers instances with a specified stack that were created outside
     * of AWS OpsWorks.
     * </p>
     * <p>
     * <b>NOTE:</b>We do not recommend using this action to register
     * instances. The complete registration operation has two primary steps,
     * installing the AWS OpsWorks agent on the instance and registering the
     * instance with the stack. RegisterInstance handles only the second
     * step. You should instead use the AWS CLI register command, which
     * performs the entire registration operation. For more information, see
     * Registering an Instance with an AWS OpsWorks Stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerInstanceRequest Container for the necessary parameters
     *           to execute the RegisterInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest registerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers instances with a specified stack that were created outside
     * of AWS OpsWorks.
     * </p>
     * <p>
     * <b>NOTE:</b>We do not recommend using this action to register
     * instances. The complete registration operation has two primary steps,
     * installing the AWS OpsWorks agent on the instance and registering the
     * instance with the stack. RegisterInstance handles only the second
     * step. You should instead use the AWS CLI register command, which
     * performs the entire registration operation. For more information, see
     * Registering an Instance with an AWS OpsWorks Stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerInstanceRequest Container for the necessary parameters
     *           to execute the RegisterInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest registerInstanceRequest,
            AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateUserProfile service method, as returned by AWSOpsWorks.
     * 
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
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Reboots a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstance service method, as returned by AWSOpsWorks.
     * 
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
     * Reboots a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Creates a new stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"> Create a New Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStack service method, as returned by AWSOpsWorks.
     * 
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
     * Creates a new stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"> Create a New Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Creates an instance in a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstance service method, as returned by AWSOpsWorks.
     * 
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
     * Creates an instance in a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteApp service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackProvisioningParametersRequest Container for the
     *           necessary parameters to execute the
     *           DescribeStackProvisioningParameters operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackProvisioningParameters service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackProvisioningParametersRequest Container for the
     *           necessary parameters to execute the
     *           DescribeStackProvisioningParameters operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackProvisioningParameters service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest,
            AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterElasticIpRequest Container for the necessary
     *           parameters to execute the DeregisterElasticIp operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterElasticIpAsync(DeregisterElasticIpRequest deregisterElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterElasticIpRequest Container for the necessary
     *           parameters to execute the DeregisterElasticIp operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterElasticIpAsync(DeregisterElasticIpRequest deregisterElasticIpRequest,
            AsyncHandler<DeregisterElasticIpRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"> Elastic Load Balancing </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must create the Elastic Load Balancing instance
     * separately, by using the Elastic Load Balancing console, API, or CLI.
     * For more information, see Elastic Load Balancing Developer Guide.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param attachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the AttachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AttachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachElasticLoadBalancerAsync(AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"> Elastic Load Balancing </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must create the Elastic Load Balancing instance
     * separately, by using the Elastic Load Balancing console, API, or CLI.
     * For more information, see Elastic Load Balancing Developer Guide.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param attachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the AttachElasticLoadBalancer operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachElasticLoadBalancer service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachElasticLoadBalancerAsync(AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest,
            AsyncHandler<AttachElasticLoadBalancerRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateStack service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateUserProfile service method, as returned by AWSOpsWorks.
     * 
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
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeLayers service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes load-based auto scaling configurations for specified
     * layers.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes load-based auto scaling configurations for specified
     * layers.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeElasticLoadBalancers operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticLoadBalancers service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeElasticLoadBalancers operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticLoadBalancers service method, as returned by
     *         AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest,
            AsyncHandler<DescribeElasticLoadBalancersRequest, DescribeElasticLoadBalancersResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * 
     * <ul>
     * <li>You can assign registered on-premises instances to any layer
     * type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom
     * layers.</li>
     * <li>You cannot use this action with instances that were created with
     * AWS OpsWorks.</li>
     * 
     * </ul>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignInstanceRequest Container for the necessary parameters to
     *           execute the AssignInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         AssignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignInstanceAsync(AssignInstanceRequest assignInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * 
     * <ul>
     * <li>You can assign registered on-premises instances to any layer
     * type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom
     * layers.</li>
     * <li>You cannot use this action with instances that were created with
     * AWS OpsWorks.</li>
     * 
     * </ul>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignInstanceRequest Container for the necessary parameters to
     *           execute the AssignInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssignInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignInstanceAsync(AssignInstanceRequest assignInstanceRequest,
            AsyncHandler<AssignInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This
     * action removes the instance from the stack and returns it to your
     * control. This action can not be used with instances that were created
     * with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterInstanceAsync(DeregisterInstanceRequest deregisterInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This
     * action removes the instance from the stack and returns it to your
     * control. This action can not be used with instances that were created
     * with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterInstance operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterInstance service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterInstanceAsync(DeregisterInstanceRequest deregisterInstanceRequest,
            AsyncHandler<DeregisterInstanceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"> How to Delete a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteLayer service method, as returned by AWSOpsWorks.
     * 
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
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"> How to Delete a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         SetTimeBasedAutoScaling service method, as returned by AWSOpsWorks.
     * 
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
     * instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeMyUserProfileRequest Container for the necessary
     *           parameters to execute the DescribeMyUserProfile operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(DescribeMyUserProfileRequest describeMyUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeMyUserProfileRequest Container for the necessary
     *           parameters to execute the DescribeMyUserProfile operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMyUserProfile service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(DescribeMyUserProfileRequest describeMyUserProfileRequest,
            AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateApp service method, as returned by AWSOpsWorks.
     * 
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
     * Creates an app for a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Updates an Amazon EBS volume's name or mount point. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateVolumeRequest Container for the necessary parameters to
     *           execute the UpdateVolume operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateVolumeAsync(UpdateVolumeRequest updateVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateVolumeRequest Container for the necessary parameters to
     *           execute the UpdateVolume operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateVolume service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> updateVolumeAsync(UpdateVolumeRequest updateVolumeRequest,
            AsyncHandler<UpdateVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteUserProfile service method, as returned by AWSOpsWorks.
     * 
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
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUserProfiles service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateInstance service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Requests a description of a specified set of deployments.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDeployments service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Registers an Elastic IP address with a specified stack. An address
     * can be registered with only one stack at a time. If the address is
     * already registered, you must first deregister it by calling
     * DeregisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerElasticIpRequest Container for the necessary parameters
     *           to execute the RegisterElasticIp operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterElasticIpResult> registerElasticIpAsync(RegisterElasticIpRequest registerElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address
     * can be registered with only one stack at a time. If the address is
     * already registered, you must first deregister it by calling
     * DeregisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerElasticIpRequest Container for the necessary parameters
     *           to execute the RegisterElasticIp operation on AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterElasticIp service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterElasticIpResult> registerElasticIpAsync(RegisterElasticIpRequest registerElasticIpRequest,
            AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP addresses </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeElasticIps service method, as returned by AWSOpsWorks.
     * 
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
     * Describes
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP addresses </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStacks service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeApps service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code>
     * or <code>online</code> .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackSummaryRequest Container for the necessary
     *           parameters to execute the DescribeStackSummary operation on
     *           AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackSummary service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackSummaryResult> describeStackSummaryAsync(DescribeStackSummaryRequest describeStackSummaryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code>
     * or <code>online</code> .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackSummaryRequest Container for the necessary
     *           parameters to execute the DescribeStackSummary operation on
     *           AWSOpsWorks.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStackSummary service method, as returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStackSummaryResult> describeStackSummaryAsync(DescribeStackSummaryRequest describeStackSummaryRequest,
            AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         StopStack service method, as returned by AWSOpsWorks.
     * 
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
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
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
     * Runs deployment or stack commands. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"> Deploying Apps </a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"> Run Stack Commands </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment operation on AWSOpsWorks.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDeployment service method, as returned by AWSOpsWorks.
     * 
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
     * Runs deployment or stack commands. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"> Deploying Apps </a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"> Run Stack Commands </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
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
        
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
package com.amazonaws.services.synthetics;

import javax.annotation.Generated;

import com.amazonaws.services.synthetics.model.*;

/**
 * Interface for accessing Synthetics asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.synthetics.AbstractAWSSyntheticsAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudWatch Synthetics</fullname>
 * <p>
 * You can use Amazon CloudWatch Synthetics to continually monitor your services. You can create and manage
 * <i>canaries</i>, which are modular, lightweight scripts that monitor your endpoints and APIs from the outside-in. You
 * can set up your canaries to run 24 hours a day, once per minute. The canaries help you check the availability and
 * latency of your web services and troubleshoot anomalies by investigating load time data, screenshots of the UI, logs,
 * and metrics. The canaries seamlessly integrate with CloudWatch ServiceLens to help you trace the causes of impacted
 * nodes in your applications. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ServiceLens.html">Using ServiceLens to Monitor
 * the Health of Your Applications</a> in the <i>Amazon CloudWatch User Guide</i>.
 * </p>
 * <p>
 * Before you create and manage canaries, be aware of the security considerations. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
 * Considerations for Synthetics Canaries</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSyntheticsAsync extends AWSSynthetics {

    /**
     * <p>
     * Associates a canary with a group. Using groups can help you with managing and automating your canaries, and you
     * can also view aggregated run results and statistics for all canaries in a group.
     * </p>
     * <p>
     * You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param associateResourceRequest
     * @return A Java Future containing the result of the AssociateResource operation returned by the service.
     * @sample AWSSyntheticsAsync.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/AssociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceResult> associateResourceAsync(AssociateResourceRequest associateResourceRequest);

    /**
     * <p>
     * Associates a canary with a group. Using groups can help you with managing and automating your canaries, and you
     * can also view aggregated run results and statistics for all canaries in a group.
     * </p>
     * <p>
     * You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param associateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateResource operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.AssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/AssociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateResourceResult> associateResourceAsync(AssociateResourceRequest associateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateResourceRequest, AssociateResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help
     * you check the availability and latency of your web services and troubleshoot anomalies by investigating load time
     * data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.
     * </p>
     * <p>
     * Do not use <code>CreateCanary</code> to modify an existing canary. Use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_UpdateCanary.html">UpdateCanary</a>
     * instead.
     * </p>
     * <p>
     * To create canaries, you must have the <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a
     * new IAM role for the canary, you also need the <code>iam:CreateRole</code>, <code>iam:CreatePolicy</code> and
     * <code>iam:AttachRolePolicy</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
     * >Necessary Roles and Permissions</a>.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param createCanaryRequest
     * @return A Java Future containing the result of the CreateCanary operation returned by the service.
     * @sample AWSSyntheticsAsync.CreateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCanaryResult> createCanaryAsync(CreateCanaryRequest createCanaryRequest);

    /**
     * <p>
     * Creates a canary. Canaries are scripts that monitor your endpoints and APIs from the outside-in. Canaries help
     * you check the availability and latency of your web services and troubleshoot anomalies by investigating load time
     * data, screenshots of the UI, logs, and metrics. You can set up a canary to run continuously or just once.
     * </p>
     * <p>
     * Do not use <code>CreateCanary</code> to modify an existing canary. Use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_UpdateCanary.html">UpdateCanary</a>
     * instead.
     * </p>
     * <p>
     * To create canaries, you must have the <code>CloudWatchSyntheticsFullAccess</code> policy. If you are creating a
     * new IAM role for the canary, you also need the <code>iam:CreateRole</code>, <code>iam:CreatePolicy</code> and
     * <code>iam:AttachRolePolicy</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Roles"
     * >Necessary Roles and Permissions</a>.
     * </p>
     * <p>
     * Do not include secrets or proprietary information in your canary names. The canary name makes up part of the
     * Amazon Resource Name (ARN) for the canary, and the ARN is included in outbound calls over the internet. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/servicelens_canaries_security.html">Security
     * Considerations for Synthetics Canaries</a>.
     * </p>
     * 
     * @param createCanaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCanary operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.CreateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCanaryResult> createCanaryAsync(CreateCanaryRequest createCanaryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCanaryRequest, CreateCanaryResult> asyncHandler);

    /**
     * <p>
     * Creates a group which you can use to associate canaries with each other, including cross-Region canaries. Using
     * groups can help you with managing and automating your canaries, and you can also view aggregated run results and
     * statistics for all canaries in a group.
     * </p>
     * <p>
     * Groups are global resources. When you create a group, it is replicated across Amazon Web Services Regions, and
     * you can view it and add canaries to it from any Region. Although the group ARN format reflects the Region name
     * where it was created, a group is not constrained to any Region. This means that you can put canaries from
     * multiple Regions into the same group, and then use that group to view and manage all of those canaries in a
     * single view.
     * </p>
     * <p>
     * Groups are supported in all Regions except the Regions that are disabled by default. For more information about
     * these Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a Region</a>.
     * </p>
     * <p>
     * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account. Any single
     * canary can be a member of up to 10 groups.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSSyntheticsAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a group which you can use to associate canaries with each other, including cross-Region canaries. Using
     * groups can help you with managing and automating your canaries, and you can also view aggregated run results and
     * statistics for all canaries in a group.
     * </p>
     * <p>
     * Groups are global resources. When you create a group, it is replicated across Amazon Web Services Regions, and
     * you can view it and add canaries to it from any Region. Although the group ARN format reflects the Region name
     * where it was created, a group is not constrained to any Region. This means that you can put canaries from
     * multiple Regions into the same group, and then use that group to view and manage all of those canaries in a
     * single view.
     * </p>
     * <p>
     * Groups are supported in all Regions except the Regions that are disabled by default. For more information about
     * these Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande-manage.html#rande-manage-enable">Enabling a Region</a>.
     * </p>
     * <p>
     * Each group can contain as many as 10 canaries. You can have as many as 20 groups in your account. Any single
     * canary can be a member of up to 10 groups.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the specified canary.
     * </p>
     * <p>
     * If you specify <code>DeleteLambda</code> to <code>true</code>, CloudWatch Synthetics also deletes the Lambda
     * functions and layers that are used by the canary.
     * </p>
     * <p>
     * Other resources used and created by the canary are not automatically deleted. After you delete a canary that you
     * do not intend to use again, you should also delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The CloudWatch alarms created for this canary. These alarms have a name of
     * <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 objects and buckets, such as the canary's artifact location.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM roles created for the canary. If they were created in the console, these roles have the name
     * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudWatch Logs log groups created for the canary. These logs groups have the name
     * <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you delete a canary, you might want to use <code>GetCanary</code> to display the information about this
     * canary. Make note of the information returned by this operation so that you can delete these resources after you
     * delete the canary.
     * </p>
     * 
     * @param deleteCanaryRequest
     * @return A Java Future containing the result of the DeleteCanary operation returned by the service.
     * @sample AWSSyntheticsAsync.DeleteCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCanaryResult> deleteCanaryAsync(DeleteCanaryRequest deleteCanaryRequest);

    /**
     * <p>
     * Permanently deletes the specified canary.
     * </p>
     * <p>
     * If you specify <code>DeleteLambda</code> to <code>true</code>, CloudWatch Synthetics also deletes the Lambda
     * functions and layers that are used by the canary.
     * </p>
     * <p>
     * Other resources used and created by the canary are not automatically deleted. After you delete a canary that you
     * do not intend to use again, you should also delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The CloudWatch alarms created for this canary. These alarms have a name of
     * <code>Synthetics-SharpDrop-Alarm-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon S3 objects and buckets, such as the canary's artifact location.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM roles created for the canary. If they were created in the console, these roles have the name
     * <code> role/service-role/CloudWatchSyntheticsRole-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * CloudWatch Logs log groups created for the canary. These logs groups have the name
     * <code>/aws/lambda/cwsyn-<i>MyCanaryName</i> </code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Before you delete a canary, you might want to use <code>GetCanary</code> to display the information about this
     * canary. Make note of the information returned by this operation so that you can delete these resources after you
     * delete the canary.
     * </p>
     * 
     * @param deleteCanaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCanary operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.DeleteCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCanaryResult> deleteCanaryAsync(DeleteCanaryRequest deleteCanaryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCanaryRequest, DeleteCanaryResult> asyncHandler);

    /**
     * <p>
     * Deletes a group. The group doesn't need to be empty to be deleted. If there are canaries in the group, they are
     * not deleted when you delete the group.
     * </p>
     * <p>
     * Groups are a global resource that appear in all Regions, but the request to delete a group must be made from its
     * home Region. You can find the home Region of a group within its ARN.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSSyntheticsAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a group. The group doesn't need to be empty to be deleted. If there are canaries in the group, they are
     * not deleted when you delete the group.
     * </p>
     * <p>
     * Groups are a global resource that appear in all Regions, but the request to delete a group must be made from its
     * home Region. You can find the home Region of a group within its ARN.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * This operation returns a list of the canaries in your account, along with full details about each canary.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesRequest
     * @return A Java Future containing the result of the DescribeCanaries operation returned by the service.
     * @sample AWSSyntheticsAsync.DescribeCanaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanaries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCanariesResult> describeCanariesAsync(DescribeCanariesRequest describeCanariesRequest);

    /**
     * <p>
     * This operation returns a list of the canaries in your account, along with full details about each canary.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCanaries operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.DescribeCanaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanaries" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCanariesResult> describeCanariesAsync(DescribeCanariesRequest describeCanariesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCanariesRequest, DescribeCanariesResult> asyncHandler);

    /**
     * <p>
     * Use this operation to see information from the most recent run of each canary that you have created.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesLastRunRequest
     * @return A Java Future containing the result of the DescribeCanariesLastRun operation returned by the service.
     * @sample AWSSyntheticsAsync.DescribeCanariesLastRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanariesLastRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCanariesLastRunResult> describeCanariesLastRunAsync(DescribeCanariesLastRunRequest describeCanariesLastRunRequest);

    /**
     * <p>
     * Use this operation to see information from the most recent run of each canary that you have created.
     * </p>
     * <p>
     * This operation supports resource-level authorization using an IAM policy and the <code>Names</code> parameter. If
     * you specify the <code>Names</code> parameter, the operation is successful only if you have authorization to view
     * all the canaries that you specify in your request. If you do not have permission to view any of the canaries, the
     * request fails with a 403 response.
     * </p>
     * <p>
     * You are required to use the <code>Names</code> parameter if you are logged on to a user or role that has an IAM
     * policy that restricts which canaries that you are allowed to view. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Restricted.html">
     * Limiting a user to viewing specific canaries</a>.
     * </p>
     * 
     * @param describeCanariesLastRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCanariesLastRun operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.DescribeCanariesLastRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanariesLastRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCanariesLastRunResult> describeCanariesLastRunAsync(DescribeCanariesLastRunRequest describeCanariesLastRunRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCanariesLastRunRequest, DescribeCanariesLastRunResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Synthetics canary runtime versions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param describeRuntimeVersionsRequest
     * @return A Java Future containing the result of the DescribeRuntimeVersions operation returned by the service.
     * @sample AWSSyntheticsAsync.DescribeRuntimeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeRuntimeVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuntimeVersionsResult> describeRuntimeVersionsAsync(DescribeRuntimeVersionsRequest describeRuntimeVersionsRequest);

    /**
     * <p>
     * Returns a list of Synthetics canary runtime versions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html">
     * Canary Runtime Versions</a>.
     * </p>
     * 
     * @param describeRuntimeVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRuntimeVersions operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.DescribeRuntimeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeRuntimeVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuntimeVersionsResult> describeRuntimeVersionsAsync(DescribeRuntimeVersionsRequest describeRuntimeVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuntimeVersionsRequest, DescribeRuntimeVersionsResult> asyncHandler);

    /**
     * <p>
     * Removes a canary from a group. You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @return A Java Future containing the result of the DisassociateResource operation returned by the service.
     * @sample AWSSyntheticsAsync.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DisassociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceResult> disassociateResourceAsync(DisassociateResourceRequest disassociateResourceRequest);

    /**
     * <p>
     * Removes a canary from a group. You must run this operation in the Region where the canary exists.
     * </p>
     * 
     * @param disassociateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateResource operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.DisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DisassociateResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateResourceResult> disassociateResourceAsync(DisassociateResourceRequest disassociateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateResourceRequest, DisassociateResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves complete information about one canary. You must specify the name of the canary that you want. To get a
     * list of canaries and their names, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * 
     * @param getCanaryRequest
     * @return A Java Future containing the result of the GetCanary operation returned by the service.
     * @sample AWSSyntheticsAsync.GetCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCanaryResult> getCanaryAsync(GetCanaryRequest getCanaryRequest);

    /**
     * <p>
     * Retrieves complete information about one canary. You must specify the name of the canary that you want. To get a
     * list of canaries and their names, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DescribeCanaries.html"
     * >DescribeCanaries</a>.
     * </p>
     * 
     * @param getCanaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCanary operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.GetCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCanaryResult> getCanaryAsync(GetCanaryRequest getCanaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetCanaryRequest, GetCanaryResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of runs for a specified canary.
     * </p>
     * 
     * @param getCanaryRunsRequest
     * @return A Java Future containing the result of the GetCanaryRuns operation returned by the service.
     * @sample AWSSyntheticsAsync.GetCanaryRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanaryRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCanaryRunsResult> getCanaryRunsAsync(GetCanaryRunsRequest getCanaryRunsRequest);

    /**
     * <p>
     * Retrieves a list of runs for a specified canary.
     * </p>
     * 
     * @param getCanaryRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCanaryRuns operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.GetCanaryRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanaryRuns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCanaryRunsResult> getCanaryRunsAsync(GetCanaryRunsRequest getCanaryRunsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCanaryRunsRequest, GetCanaryRunsResult> asyncHandler);

    /**
     * <p>
     * Returns information about one group. Groups are a global resource, so you can use this operation from any Region.
     * </p>
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSSyntheticsAsync.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Returns information about one group. Groups are a global resource, so you can use this operation from any Region.
     * </p>
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the groups that the specified canary is associated with. The canary that you specify must be in
     * the current Region.
     * </p>
     * 
     * @param listAssociatedGroupsRequest
     * @return A Java Future containing the result of the ListAssociatedGroups operation returned by the service.
     * @sample AWSSyntheticsAsync.ListAssociatedGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListAssociatedGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedGroupsResult> listAssociatedGroupsAsync(ListAssociatedGroupsRequest listAssociatedGroupsRequest);

    /**
     * <p>
     * Returns a list of the groups that the specified canary is associated with. The canary that you specify must be in
     * the current Region.
     * </p>
     * 
     * @param listAssociatedGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedGroups operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.ListAssociatedGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListAssociatedGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedGroupsResult> listAssociatedGroupsAsync(ListAssociatedGroupsRequest listAssociatedGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedGroupsRequest, ListAssociatedGroupsResult> asyncHandler);

    /**
     * <p>
     * This operation returns a list of the ARNs of the canaries that are associated with the specified group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @return A Java Future containing the result of the ListGroupResources operation returned by the service.
     * @sample AWSSyntheticsAsync.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest listGroupResourcesRequest);

    /**
     * <p>
     * This operation returns a list of the ARNs of the canaries that are associated with the specified group.
     * </p>
     * 
     * @param listGroupResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupResources operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.ListGroupResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroupResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGroupResourcesResult> listGroupResourcesAsync(ListGroupResourcesRequest listGroupResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupResourcesRequest, ListGroupResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all groups in the account, displaying their names, unique IDs, and ARNs. The groups from all
     * Regions are returned.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSSyntheticsAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Returns a list of all groups in the account, displaying their names, unique IDs, and ARNs. The groups from all
     * Regions are returned.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with a canary or group.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSyntheticsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with a canary or group.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to run a canary that has already been created. The frequency of the canary runs is determined
     * by the value of the canary's <code>Schedule</code>. To see a canary's schedule, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_GetCanary.html">GetCanary</a>.
     * </p>
     * 
     * @param startCanaryRequest
     * @return A Java Future containing the result of the StartCanary operation returned by the service.
     * @sample AWSSyntheticsAsync.StartCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StartCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCanaryResult> startCanaryAsync(StartCanaryRequest startCanaryRequest);

    /**
     * <p>
     * Use this operation to run a canary that has already been created. The frequency of the canary runs is determined
     * by the value of the canary's <code>Schedule</code>. To see a canary's schedule, use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_GetCanary.html">GetCanary</a>.
     * </p>
     * 
     * @param startCanaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCanary operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.StartCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StartCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartCanaryResult> startCanaryAsync(StartCanaryRequest startCanaryRequest,
            com.amazonaws.handlers.AsyncHandler<StartCanaryRequest, StartCanaryResult> asyncHandler);

    /**
     * <p>
     * Stops the canary to prevent all future runs. If the canary is currently running,the run that is in progress
     * completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a
     * completed run.
     * </p>
     * <p>
     * You can use <code>StartCanary</code> to start it running again with the canary’s current schedule at any point in
     * the future.
     * </p>
     * 
     * @param stopCanaryRequest
     * @return A Java Future containing the result of the StopCanary operation returned by the service.
     * @sample AWSSyntheticsAsync.StopCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StopCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopCanaryResult> stopCanaryAsync(StopCanaryRequest stopCanaryRequest);

    /**
     * <p>
     * Stops the canary to prevent all future runs. If the canary is currently running,the run that is in progress
     * completes on its own, publishes metrics, and uploads artifacts, but it is not recorded in Synthetics as a
     * completed run.
     * </p>
     * <p>
     * You can use <code>StartCanary</code> to start it running again with the canary’s current schedule at any point in
     * the future.
     * </p>
     * 
     * @param stopCanaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCanary operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.StopCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/StopCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopCanaryResult> stopCanaryAsync(StopCanaryRequest stopCanaryRequest,
            com.amazonaws.handlers.AsyncHandler<StopCanaryRequest, StopCanaryResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified canary or group.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a canary or group.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSyntheticsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified canary or group.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag
     * key that is already associated with the resource, the new tag value that you specify replaces the previous value
     * for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a canary or group.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/TagResource" target="_top">AWS API
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
     * @sample AWSSyntheticsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UntagResource" target="_top">AWS API
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
     * @sample AWSSyntheticsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of a canary that has already been created.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary,
     * use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateCanaryRequest
     * @return A Java Future containing the result of the UpdateCanary operation returned by the service.
     * @sample AWSSyntheticsAsync.UpdateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UpdateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCanaryResult> updateCanaryAsync(UpdateCanaryRequest updateCanaryRequest);

    /**
     * <p>
     * Updates the configuration of a canary that has already been created.
     * </p>
     * <p>
     * You can't use this operation to update the tags of an existing canary. To change the tags of an existing canary,
     * use <a
     * href="https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateCanaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCanary operation returned by the service.
     * @sample AWSSyntheticsAsyncHandler.UpdateCanary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/UpdateCanary" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCanaryResult> updateCanaryAsync(UpdateCanaryRequest updateCanaryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCanaryRequest, UpdateCanaryResult> asyncHandler);

}

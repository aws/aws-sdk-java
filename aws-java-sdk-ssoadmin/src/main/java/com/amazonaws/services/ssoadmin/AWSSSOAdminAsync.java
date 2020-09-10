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
package com.amazonaws.services.ssoadmin;

import javax.annotation.Generated;

import com.amazonaws.services.ssoadmin.model.*;

/**
 * Interface for accessing SSO Admin asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssoadmin.AbstractAWSSSOAdminAsync} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSOAdminAsync extends AWSSSOAdmin {

    /**
     * <p>
     * Attaches an IAM managed policy ARN to a permission set.
     * </p>
     * 
     * @param attachManagedPolicyToPermissionSetRequest
     * @return A Java Future containing the result of the AttachManagedPolicyToPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.AttachManagedPolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachManagedPolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachManagedPolicyToPermissionSetResult> attachManagedPolicyToPermissionSetAsync(
            AttachManagedPolicyToPermissionSetRequest attachManagedPolicyToPermissionSetRequest);

    /**
     * <p>
     * Attaches an IAM managed policy ARN to a permission set.
     * </p>
     * 
     * @param attachManagedPolicyToPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachManagedPolicyToPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.AttachManagedPolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachManagedPolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachManagedPolicyToPermissionSetResult> attachManagedPolicyToPermissionSetAsync(
            AttachManagedPolicyToPermissionSetRequest attachManagedPolicyToPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Assigns access to a principal for a specified AWS account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * The term <i>principal</i> here refers to a user or group that is defined in AWS SSO.
     * </p>
     * </note>
     * 
     * @param createAccountAssignmentRequest
     * @return A Java Future containing the result of the CreateAccountAssignment operation returned by the service.
     * @sample AWSSSOAdminAsync.CreateAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountAssignmentResult> createAccountAssignmentAsync(CreateAccountAssignmentRequest createAccountAssignmentRequest);

    /**
     * <p>
     * Assigns access to a principal for a specified AWS account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * The term <i>principal</i> here refers to a user or group that is defined in AWS SSO.
     * </p>
     * </note>
     * 
     * @param createAccountAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccountAssignment operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreateAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountAssignmentResult> createAccountAssignmentAsync(CreateAccountAssignmentRequest createAccountAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccountAssignmentRequest, CreateAccountAssignmentResult> asyncHandler);

    /**
     * <p>
     * Creates a permission set within a specified SSO instance.
     * </p>
     * 
     * @param createPermissionSetRequest
     * @return A Java Future containing the result of the CreatePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsync.CreatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionSetResult> createPermissionSetAsync(CreatePermissionSetRequest createPermissionSetRequest);

    /**
     * <p>
     * Creates a permission set within a specified SSO instance.
     * </p>
     * 
     * @param createPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePermissionSetResult> createPermissionSetAsync(CreatePermissionSetRequest createPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePermissionSetRequest, CreatePermissionSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a principal's access from a specified AWS account using a specified permission set.
     * </p>
     * 
     * @param deleteAccountAssignmentRequest
     * @return A Java Future containing the result of the DeleteAccountAssignment operation returned by the service.
     * @sample AWSSSOAdminAsync.DeleteAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountAssignmentResult> deleteAccountAssignmentAsync(DeleteAccountAssignmentRequest deleteAccountAssignmentRequest);

    /**
     * <p>
     * Deletes a principal's access from a specified AWS account using a specified permission set.
     * </p>
     * 
     * @param deleteAccountAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccountAssignment operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountAssignmentResult> deleteAccountAssignmentAsync(DeleteAccountAssignmentRequest deleteAccountAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResult> asyncHandler);

    /**
     * <p>
     * Deletes the inline policy from a specified permission set.
     * </p>
     * 
     * @param deleteInlinePolicyFromPermissionSetRequest
     * @return A Java Future containing the result of the DeleteInlinePolicyFromPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.DeleteInlinePolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInlinePolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInlinePolicyFromPermissionSetResult> deleteInlinePolicyFromPermissionSetAsync(
            DeleteInlinePolicyFromPermissionSetRequest deleteInlinePolicyFromPermissionSetRequest);

    /**
     * <p>
     * Deletes the inline policy from a specified permission set.
     * </p>
     * 
     * @param deleteInlinePolicyFromPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInlinePolicyFromPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.DeleteInlinePolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInlinePolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInlinePolicyFromPermissionSetResult> deleteInlinePolicyFromPermissionSetAsync(
            DeleteInlinePolicyFromPermissionSetRequest deleteInlinePolicyFromPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInlinePolicyFromPermissionSetRequest, DeleteInlinePolicyFromPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified permission set.
     * </p>
     * 
     * @param deletePermissionSetRequest
     * @return A Java Future containing the result of the DeletePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsync.DeletePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionSetResult> deletePermissionSetAsync(DeletePermissionSetRequest deletePermissionSetRequest);

    /**
     * <p>
     * Deletes the specified permission set.
     * </p>
     * 
     * @param deletePermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeletePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionSetResult> deletePermissionSetAsync(DeletePermissionSetRequest deletePermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionSetRequest, DeletePermissionSetResult> asyncHandler);

    /**
     * <p>
     * Describes the status of the assignment creation request.
     * </p>
     * 
     * @param describeAccountAssignmentCreationStatusRequest
     * @return A Java Future containing the result of the DescribeAccountAssignmentCreationStatus operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.DescribeAccountAssignmentCreationStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAssignmentCreationStatusResult> describeAccountAssignmentCreationStatusAsync(
            DescribeAccountAssignmentCreationStatusRequest describeAccountAssignmentCreationStatusRequest);

    /**
     * <p>
     * Describes the status of the assignment creation request.
     * </p>
     * 
     * @param describeAccountAssignmentCreationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAssignmentCreationStatus operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeAccountAssignmentCreationStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAssignmentCreationStatusResult> describeAccountAssignmentCreationStatusAsync(
            DescribeAccountAssignmentCreationStatusRequest describeAccountAssignmentCreationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResult> asyncHandler);

    /**
     * <p>
     * Describes the status of the assignment deletion request.
     * </p>
     * 
     * @param describeAccountAssignmentDeletionStatusRequest
     * @return A Java Future containing the result of the DescribeAccountAssignmentDeletionStatus operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.DescribeAccountAssignmentDeletionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAssignmentDeletionStatusResult> describeAccountAssignmentDeletionStatusAsync(
            DescribeAccountAssignmentDeletionStatusRequest describeAccountAssignmentDeletionStatusRequest);

    /**
     * <p>
     * Describes the status of the assignment deletion request.
     * </p>
     * 
     * @param describeAccountAssignmentDeletionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAssignmentDeletionStatus operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeAccountAssignmentDeletionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAssignmentDeletionStatusResult> describeAccountAssignmentDeletionStatusAsync(
            DescribeAccountAssignmentDeletionStatusRequest describeAccountAssignmentDeletionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResult> asyncHandler);

    /**
     * <p>
     * Gets the details of the permission set.
     * </p>
     * 
     * @param describePermissionSetRequest
     * @return A Java Future containing the result of the DescribePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsync.DescribePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePermissionSetResult> describePermissionSetAsync(DescribePermissionSetRequest describePermissionSetRequest);

    /**
     * <p>
     * Gets the details of the permission set.
     * </p>
     * 
     * @param describePermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DescribePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePermissionSetResult> describePermissionSetAsync(DescribePermissionSetRequest describePermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePermissionSetRequest, DescribePermissionSetResult> asyncHandler);

    /**
     * <p>
     * Describes the status for the given permission set provisioning request.
     * </p>
     * 
     * @param describePermissionSetProvisioningStatusRequest
     * @return A Java Future containing the result of the DescribePermissionSetProvisioningStatus operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.DescribePermissionSetProvisioningStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePermissionSetProvisioningStatusResult> describePermissionSetProvisioningStatusAsync(
            DescribePermissionSetProvisioningStatusRequest describePermissionSetProvisioningStatusRequest);

    /**
     * <p>
     * Describes the status for the given permission set provisioning request.
     * </p>
     * 
     * @param describePermissionSetProvisioningStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePermissionSetProvisioningStatus operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.DescribePermissionSetProvisioningStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePermissionSetProvisioningStatusResult> describePermissionSetProvisioningStatusAsync(
            DescribePermissionSetProvisioningStatusRequest describePermissionSetProvisioningStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResult> asyncHandler);

    /**
     * <p>
     * Detaches the attached IAM managed policy ARN from the specified permission set.
     * </p>
     * 
     * @param detachManagedPolicyFromPermissionSetRequest
     * @return A Java Future containing the result of the DetachManagedPolicyFromPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.DetachManagedPolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachManagedPolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachManagedPolicyFromPermissionSetResult> detachManagedPolicyFromPermissionSetAsync(
            DetachManagedPolicyFromPermissionSetRequest detachManagedPolicyFromPermissionSetRequest);

    /**
     * <p>
     * Detaches the attached IAM managed policy ARN from the specified permission set.
     * </p>
     * 
     * @param detachManagedPolicyFromPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachManagedPolicyFromPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.DetachManagedPolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachManagedPolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachManagedPolicyFromPermissionSetResult> detachManagedPolicyFromPermissionSetAsync(
            DetachManagedPolicyFromPermissionSetRequest detachManagedPolicyFromPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Obtains the inline policy assigned to the permission set.
     * </p>
     * 
     * @param getInlinePolicyForPermissionSetRequest
     * @return A Java Future containing the result of the GetInlinePolicyForPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.GetInlinePolicyForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetInlinePolicyForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInlinePolicyForPermissionSetResult> getInlinePolicyForPermissionSetAsync(
            GetInlinePolicyForPermissionSetRequest getInlinePolicyForPermissionSetRequest);

    /**
     * <p>
     * Obtains the inline policy assigned to the permission set.
     * </p>
     * 
     * @param getInlinePolicyForPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInlinePolicyForPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.GetInlinePolicyForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetInlinePolicyForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInlinePolicyForPermissionSetResult> getInlinePolicyForPermissionSetAsync(
            GetInlinePolicyForPermissionSetRequest getInlinePolicyForPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetInlinePolicyForPermissionSetRequest, GetInlinePolicyForPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Lists the status of the AWS account assignment creation requests for a specified SSO instance.
     * </p>
     * 
     * @param listAccountAssignmentCreationStatusRequest
     * @return A Java Future containing the result of the ListAccountAssignmentCreationStatus operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.ListAccountAssignmentCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentCreationStatusResult> listAccountAssignmentCreationStatusAsync(
            ListAccountAssignmentCreationStatusRequest listAccountAssignmentCreationStatusRequest);

    /**
     * <p>
     * Lists the status of the AWS account assignment creation requests for a specified SSO instance.
     * </p>
     * 
     * @param listAccountAssignmentCreationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountAssignmentCreationStatus operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.ListAccountAssignmentCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentCreationStatusResult> listAccountAssignmentCreationStatusAsync(
            ListAccountAssignmentCreationStatusRequest listAccountAssignmentCreationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the status of the AWS account assignment deletion requests for a specified SSO instance.
     * </p>
     * 
     * @param listAccountAssignmentDeletionStatusRequest
     * @return A Java Future containing the result of the ListAccountAssignmentDeletionStatus operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.ListAccountAssignmentDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentDeletionStatusResult> listAccountAssignmentDeletionStatusAsync(
            ListAccountAssignmentDeletionStatusRequest listAccountAssignmentDeletionStatusRequest);

    /**
     * <p>
     * Lists the status of the AWS account assignment deletion requests for a specified SSO instance.
     * </p>
     * 
     * @param listAccountAssignmentDeletionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountAssignmentDeletionStatus operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.ListAccountAssignmentDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentDeletionStatusResult> listAccountAssignmentDeletionStatusAsync(
            ListAccountAssignmentDeletionStatusRequest listAccountAssignmentDeletionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the assignee of the specified AWS account with the specified permission set.
     * </p>
     * 
     * @param listAccountAssignmentsRequest
     * @return A Java Future containing the result of the ListAccountAssignments operation returned by the service.
     * @sample AWSSSOAdminAsync.ListAccountAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentsResult> listAccountAssignmentsAsync(ListAccountAssignmentsRequest listAccountAssignmentsRequest);

    /**
     * <p>
     * Lists the assignee of the specified AWS account with the specified permission set.
     * </p>
     * 
     * @param listAccountAssignmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountAssignments operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListAccountAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentsResult> listAccountAssignmentsAsync(ListAccountAssignmentsRequest listAccountAssignmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentsRequest, ListAccountAssignmentsResult> asyncHandler);

    /**
     * <p>
     * Lists all the AWS accounts where the specified permission set is provisioned.
     * </p>
     * 
     * @param listAccountsForProvisionedPermissionSetRequest
     * @return A Java Future containing the result of the ListAccountsForProvisionedPermissionSet operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.ListAccountsForProvisionedPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountsForProvisionedPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsForProvisionedPermissionSetResult> listAccountsForProvisionedPermissionSetAsync(
            ListAccountsForProvisionedPermissionSetRequest listAccountsForProvisionedPermissionSetRequest);

    /**
     * <p>
     * Lists all the AWS accounts where the specified permission set is provisioned.
     * </p>
     * 
     * @param listAccountsForProvisionedPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountsForProvisionedPermissionSet operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.ListAccountsForProvisionedPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountsForProvisionedPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsForProvisionedPermissionSetResult> listAccountsForProvisionedPermissionSetAsync(
            ListAccountsForProvisionedPermissionSetRequest listAccountsForProvisionedPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AWSSSOAdminAsync.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists the SSO instances that the caller has access to.
     * </p>
     * 
     * @param listInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the IAM managed policy that is attached to a specified permission set.
     * </p>
     * 
     * @param listManagedPoliciesInPermissionSetRequest
     * @return A Java Future containing the result of the ListManagedPoliciesInPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.ListManagedPoliciesInPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListManagedPoliciesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedPoliciesInPermissionSetResult> listManagedPoliciesInPermissionSetAsync(
            ListManagedPoliciesInPermissionSetRequest listManagedPoliciesInPermissionSetRequest);

    /**
     * <p>
     * Lists the IAM managed policy that is attached to a specified permission set.
     * </p>
     * 
     * @param listManagedPoliciesInPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListManagedPoliciesInPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.ListManagedPoliciesInPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListManagedPoliciesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedPoliciesInPermissionSetResult> listManagedPoliciesInPermissionSetAsync(
            ListManagedPoliciesInPermissionSetRequest listManagedPoliciesInPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Lists the status of the permission set provisioning requests for a specified SSO instance.
     * </p>
     * 
     * @param listPermissionSetProvisioningStatusRequest
     * @return A Java Future containing the result of the ListPermissionSetProvisioningStatus operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.ListPermissionSetProvisioningStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionSetProvisioningStatusResult> listPermissionSetProvisioningStatusAsync(
            ListPermissionSetProvisioningStatusRequest listPermissionSetProvisioningStatusRequest);

    /**
     * <p>
     * Lists the status of the permission set provisioning requests for a specified SSO instance.
     * </p>
     * 
     * @param listPermissionSetProvisioningStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionSetProvisioningStatus operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.ListPermissionSetProvisioningStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionSetProvisioningStatusResult> listPermissionSetProvisioningStatusAsync(
            ListPermissionSetProvisioningStatusRequest listPermissionSetProvisioningStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the <a>PermissionSet</a>s in an SSO instance.
     * </p>
     * 
     * @param listPermissionSetsRequest
     * @return A Java Future containing the result of the ListPermissionSets operation returned by the service.
     * @sample AWSSSOAdminAsync.ListPermissionSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionSetsResult> listPermissionSetsAsync(ListPermissionSetsRequest listPermissionSetsRequest);

    /**
     * <p>
     * Lists the <a>PermissionSet</a>s in an SSO instance.
     * </p>
     * 
     * @param listPermissionSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionSets operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListPermissionSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionSetsResult> listPermissionSetsAsync(ListPermissionSetsRequest listPermissionSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionSetsRequest, ListPermissionSetsResult> asyncHandler);

    /**
     * <p>
     * Lists all the permission sets that are provisioned to a specified AWS account.
     * </p>
     * 
     * @param listPermissionSetsProvisionedToAccountRequest
     * @return A Java Future containing the result of the ListPermissionSetsProvisionedToAccount operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.ListPermissionSetsProvisionedToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetsProvisionedToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionSetsProvisionedToAccountResult> listPermissionSetsProvisionedToAccountAsync(
            ListPermissionSetsProvisionedToAccountRequest listPermissionSetsProvisionedToAccountRequest);

    /**
     * <p>
     * Lists all the permission sets that are provisioned to a specified AWS account.
     * </p>
     * 
     * @param listPermissionSetsProvisionedToAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissionSetsProvisionedToAccount operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.ListPermissionSetsProvisionedToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetsProvisionedToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionSetsProvisionedToAccountResult> listPermissionSetsProvisionedToAccountAsync(
            ListPermissionSetsProvisionedToAccountRequest listPermissionSetsProvisionedToAccountRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that are attached to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSSOAdminAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that are attached to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * The process by which a specified permission set is provisioned to the specified target.
     * </p>
     * 
     * @param provisionPermissionSetRequest
     * @return A Java Future containing the result of the ProvisionPermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsync.ProvisionPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ProvisionPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ProvisionPermissionSetResult> provisionPermissionSetAsync(ProvisionPermissionSetRequest provisionPermissionSetRequest);

    /**
     * <p>
     * The process by which a specified permission set is provisioned to the specified target.
     * </p>
     * 
     * @param provisionPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ProvisionPermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ProvisionPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ProvisionPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ProvisionPermissionSetResult> provisionPermissionSetAsync(ProvisionPermissionSetRequest provisionPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<ProvisionPermissionSetRequest, ProvisionPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Attaches an IAM inline policy to a permission set.
     * </p>
     * 
     * @param putInlinePolicyToPermissionSetRequest
     * @return A Java Future containing the result of the PutInlinePolicyToPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.PutInlinePolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutInlinePolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInlinePolicyToPermissionSetResult> putInlinePolicyToPermissionSetAsync(
            PutInlinePolicyToPermissionSetRequest putInlinePolicyToPermissionSetRequest);

    /**
     * <p>
     * Attaches an IAM inline policy to a permission set.
     * </p>
     * 
     * @param putInlinePolicyToPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutInlinePolicyToPermissionSet operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.PutInlinePolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutInlinePolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutInlinePolicyToPermissionSetResult> putInlinePolicyToPermissionSetAsync(
            PutInlinePolicyToPermissionSetRequest putInlinePolicyToPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<PutInlinePolicyToPermissionSetRequest, PutInlinePolicyToPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Associates a set of tags with a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSSOAdminAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a set of tags with a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Disassociates a set of tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSSOAdminAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Disassociates a set of tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing permission set.
     * </p>
     * 
     * @param updatePermissionSetRequest
     * @return A Java Future containing the result of the UpdatePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsync.UpdatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionSetResult> updatePermissionSetAsync(UpdatePermissionSetRequest updatePermissionSetRequest);

    /**
     * <p>
     * Updates an existing permission set.
     * </p>
     * 
     * @param updatePermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePermissionSet operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.UpdatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePermissionSetResult> updatePermissionSetAsync(UpdatePermissionSetRequest updatePermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePermissionSetRequest, UpdatePermissionSetResult> asyncHandler);

}

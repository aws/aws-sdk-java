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
package com.amazonaws.services.ssoadmin;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ssoadmin.model.*;

/**
 * Interface for accessing SSO Admin.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ssoadmin.AbstractAWSSSOAdmin} instead.
 * </p>
 * <p>
 * <p>
 * AWS IAM Identity Center (successor to AWS Single Sign-On) helps you securely create, or connect, your workforce
 * identities and manage their access centrally across AWS accounts and applications. IAM Identity Center is the
 * recommended approach for workforce authentication and authorization in AWS, for organizations of any size and type.
 * </p>
 * <note>
 * <p>
 * Although AWS Single Sign-On was renamed, the <code>sso</code> and <code>identitystore</code> API namespaces will
 * continue to retain their original name for backward compatibility purposes. For more information, see <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html#renamed">IAM Identity Center rename</a>.
 * </p>
 * </note>
 * <p>
 * This reference guide provides information on single sign-on operations which could be used for access management of
 * AWS accounts. For information about IAM Identity Center features, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/userguide/what-is.html">IAM Identity Center User Guide</a>.
 * </p>
 * <p>
 * Many operations in the IAM Identity Center APIs rely on identifiers for users and groups, known as principals. For
 * more information about how to work with principals and principal IDs in IAM Identity Center, see the <a
 * href="https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/welcome.html">Identity Store API
 * Reference</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .Net, iOS, Android, and more). The SDKs provide a convenient way to create programmatic access to IAM Identity
 * Center and other AWS services. For more information about the AWS SDKs, including how to download and install them,
 * see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSOAdmin {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sso";

    /**
     * <p>
     * Attaches the specified customer managed policy to the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param attachCustomerManagedPolicyReferenceToPermissionSetRequest
     * @return Result of the AttachCustomerManagedPolicyReferenceToPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.AttachCustomerManagedPolicyReferenceToPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachCustomerManagedPolicyReferenceToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    AttachCustomerManagedPolicyReferenceToPermissionSetResult attachCustomerManagedPolicyReferenceToPermissionSet(
            AttachCustomerManagedPolicyReferenceToPermissionSetRequest attachCustomerManagedPolicyReferenceToPermissionSetRequest);

    /**
     * <p>
     * Attaches an AWS managed policy ARN to a permission set.
     * </p>
     * <note>
     * <p>
     * If the permission set is already referenced by one or more account assignments, you will need to call
     * <code> <a>ProvisionPermissionSet</a> </code> after this operation. Calling <code>ProvisionPermissionSet</code>
     * applies the corresponding IAM policy updates to all assigned accounts.
     * </p>
     * </note>
     * 
     * @param attachManagedPolicyToPermissionSetRequest
     * @return Result of the AttachManagedPolicyToPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.AttachManagedPolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachManagedPolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    AttachManagedPolicyToPermissionSetResult attachManagedPolicyToPermissionSet(
            AttachManagedPolicyToPermissionSetRequest attachManagedPolicyToPermissionSetRequest);

    /**
     * <p>
     * Assigns access to a principal for a specified AWS account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * The term <i>principal</i> here refers to a user or group that is defined in IAM Identity Center.
     * </p>
     * </note> <note>
     * <p>
     * As part of a successful <code>CreateAccountAssignment</code> call, the specified permission set will
     * automatically be provisioned to the account in the form of an IAM policy. That policy is attached to the IAM role
     * created in IAM Identity Center. If the permission set is subsequently updated, the corresponding IAM policies
     * attached to roles in your accounts will not be updated automatically. In this case, you must call
     * <code> <a>ProvisionPermissionSet</a> </code> to make these updates.
     * </p>
     * </note> <note>
     * <p>
     * After a successful response, call <code>DescribeAccountAssignmentCreationStatus</code> to describe the status of
     * an assignment creation request.
     * </p>
     * </note>
     * 
     * @param createAccountAssignmentRequest
     * @return Result of the CreateAccountAssignment operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAccountAssignmentResult createAccountAssignment(CreateAccountAssignmentRequest createAccountAssignmentRequest);

    /**
     * <p>
     * Enables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance. You
     * can also specify new attributes to add to your ABAC configuration during the enabling process. For more
     * information about ABAC, see <a href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a>
     * in the <i>IAM Identity Center User Guide</i>.
     * </p>
     * <note>
     * <p>
     * After a successful response, call <code>DescribeInstanceAccessControlAttributeConfiguration</code> to validate
     * that <code>InstanceAccessControlAttributeConfiguration</code> was created.
     * </p>
     * </note>
     * 
     * @param createInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the CreateInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInstanceAccessControlAttributeConfigurationResult createInstanceAccessControlAttributeConfiguration(
            CreateInstanceAccessControlAttributeConfigurationRequest createInstanceAccessControlAttributeConfigurationRequest);

    /**
     * <p>
     * Creates a permission set within a specified IAM Identity Center instance.
     * </p>
     * <note>
     * <p>
     * To grant users and groups access to AWS account resources, use <code> <a>CreateAccountAssignment</a> </code>.
     * </p>
     * </note>
     * 
     * @param createPermissionSetRequest
     * @return Result of the CreatePermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePermissionSetResult createPermissionSet(CreatePermissionSetRequest createPermissionSetRequest);

    /**
     * <p>
     * Deletes a principal's access from a specified AWS account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * After a successful response, call <code>DescribeAccountAssignmentCreationStatus</code> to describe the status of
     * an assignment deletion request.
     * </p>
     * </note>
     * 
     * @param deleteAccountAssignmentRequest
     * @return Result of the DeleteAccountAssignment operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAccountAssignmentResult deleteAccountAssignment(DeleteAccountAssignmentRequest deleteAccountAssignmentRequest);

    /**
     * <p>
     * Deletes the inline policy from a specified permission set.
     * </p>
     * 
     * @param deleteInlinePolicyFromPermissionSetRequest
     * @return Result of the DeleteInlinePolicyFromPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteInlinePolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInlinePolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInlinePolicyFromPermissionSetResult deleteInlinePolicyFromPermissionSet(
            DeleteInlinePolicyFromPermissionSetRequest deleteInlinePolicyFromPermissionSetRequest);

    /**
     * <p>
     * Disables the attributes-based access control (ABAC) feature for the specified IAM Identity Center instance and
     * deletes all of the attribute mappings that have been configured. Once deleted, any attributes that are received
     * from an identity source and any custom attributes you have previously configured will not be passed. For more
     * information about ABAC, see <a href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a>
     * in the <i>IAM Identity Center User Guide</i>.
     * </p>
     * 
     * @param deleteInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the DeleteInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInstanceAccessControlAttributeConfigurationResult deleteInstanceAccessControlAttributeConfiguration(
            DeleteInstanceAccessControlAttributeConfigurationRequest deleteInstanceAccessControlAttributeConfigurationRequest);

    /**
     * <p>
     * Deletes the specified permission set.
     * </p>
     * 
     * @param deletePermissionSetRequest
     * @return Result of the DeletePermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeletePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePermissionSetResult deletePermissionSet(DeletePermissionSetRequest deletePermissionSetRequest);

    /**
     * <p>
     * Deletes the permissions boundary from a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param deletePermissionsBoundaryFromPermissionSetRequest
     * @return Result of the DeletePermissionsBoundaryFromPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.DeletePermissionsBoundaryFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionsBoundaryFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePermissionsBoundaryFromPermissionSetResult deletePermissionsBoundaryFromPermissionSet(
            DeletePermissionsBoundaryFromPermissionSetRequest deletePermissionsBoundaryFromPermissionSetRequest);

    /**
     * <p>
     * Describes the status of the assignment creation request.
     * </p>
     * 
     * @param describeAccountAssignmentCreationStatusRequest
     * @return Result of the DescribeAccountAssignmentCreationStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.DescribeAccountAssignmentCreationStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountAssignmentCreationStatusResult describeAccountAssignmentCreationStatus(
            DescribeAccountAssignmentCreationStatusRequest describeAccountAssignmentCreationStatusRequest);

    /**
     * <p>
     * Describes the status of the assignment deletion request.
     * </p>
     * 
     * @param describeAccountAssignmentDeletionStatusRequest
     * @return Result of the DescribeAccountAssignmentDeletionStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.DescribeAccountAssignmentDeletionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountAssignmentDeletionStatusResult describeAccountAssignmentDeletionStatus(
            DescribeAccountAssignmentDeletionStatusRequest describeAccountAssignmentDeletionStatusRequest);

    /**
     * <p>
     * Returns the list of IAM Identity Center identity store attributes that have been configured to work with
     * attributes-based access control (ABAC) for the specified IAM Identity Center instance. This will not return
     * attributes configured and sent by an external identity provider. For more information about ABAC, see <a
     * href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a> in the <i>IAM Identity Center
     * User Guide</i>.
     * </p>
     * 
     * @param describeInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the DescribeInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceAccessControlAttributeConfigurationResult describeInstanceAccessControlAttributeConfiguration(
            DescribeInstanceAccessControlAttributeConfigurationRequest describeInstanceAccessControlAttributeConfigurationRequest);

    /**
     * <p>
     * Gets the details of the permission set.
     * </p>
     * 
     * @param describePermissionSetRequest
     * @return Result of the DescribePermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.DescribePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePermissionSetResult describePermissionSet(DescribePermissionSetRequest describePermissionSetRequest);

    /**
     * <p>
     * Describes the status for the given permission set provisioning request.
     * </p>
     * 
     * @param describePermissionSetProvisioningStatusRequest
     * @return Result of the DescribePermissionSetProvisioningStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.DescribePermissionSetProvisioningStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePermissionSetProvisioningStatusResult describePermissionSetProvisioningStatus(
            DescribePermissionSetProvisioningStatusRequest describePermissionSetProvisioningStatusRequest);

    /**
     * <p>
     * Detaches the specified customer managed policy from the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param detachCustomerManagedPolicyReferenceFromPermissionSetRequest
     * @return Result of the DetachCustomerManagedPolicyReferenceFromPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DetachCustomerManagedPolicyReferenceFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachCustomerManagedPolicyReferenceFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    DetachCustomerManagedPolicyReferenceFromPermissionSetResult detachCustomerManagedPolicyReferenceFromPermissionSet(
            DetachCustomerManagedPolicyReferenceFromPermissionSetRequest detachCustomerManagedPolicyReferenceFromPermissionSetRequest);

    /**
     * <p>
     * Detaches the attached AWS managed policy ARN from the specified permission set.
     * </p>
     * 
     * @param detachManagedPolicyFromPermissionSetRequest
     * @return Result of the DetachManagedPolicyFromPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DetachManagedPolicyFromPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachManagedPolicyFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    DetachManagedPolicyFromPermissionSetResult detachManagedPolicyFromPermissionSet(
            DetachManagedPolicyFromPermissionSetRequest detachManagedPolicyFromPermissionSetRequest);

    /**
     * <p>
     * Obtains the inline policy assigned to the permission set.
     * </p>
     * 
     * @param getInlinePolicyForPermissionSetRequest
     * @return Result of the GetInlinePolicyForPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.GetInlinePolicyForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetInlinePolicyForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetInlinePolicyForPermissionSetResult getInlinePolicyForPermissionSet(GetInlinePolicyForPermissionSetRequest getInlinePolicyForPermissionSetRequest);

    /**
     * <p>
     * Obtains the permissions boundary for a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param getPermissionsBoundaryForPermissionSetRequest
     * @return Result of the GetPermissionsBoundaryForPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.GetPermissionsBoundaryForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetPermissionsBoundaryForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetPermissionsBoundaryForPermissionSetResult getPermissionsBoundaryForPermissionSet(
            GetPermissionsBoundaryForPermissionSetRequest getPermissionsBoundaryForPermissionSetRequest);

    /**
     * <p>
     * Lists the status of the AWS account assignment creation requests for a specified IAM Identity Center instance.
     * </p>
     * 
     * @param listAccountAssignmentCreationStatusRequest
     * @return Result of the ListAccountAssignmentCreationStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListAccountAssignmentCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentCreationStatusResult listAccountAssignmentCreationStatus(
            ListAccountAssignmentCreationStatusRequest listAccountAssignmentCreationStatusRequest);

    /**
     * <p>
     * Lists the status of the AWS account assignment deletion requests for a specified IAM Identity Center instance.
     * </p>
     * 
     * @param listAccountAssignmentDeletionStatusRequest
     * @return Result of the ListAccountAssignmentDeletionStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListAccountAssignmentDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentDeletionStatusResult listAccountAssignmentDeletionStatus(
            ListAccountAssignmentDeletionStatusRequest listAccountAssignmentDeletionStatusRequest);

    /**
     * <p>
     * Lists the assignee of the specified AWS account with the specified permission set.
     * </p>
     * 
     * @param listAccountAssignmentsRequest
     * @return Result of the ListAccountAssignments operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListAccountAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentsResult listAccountAssignments(ListAccountAssignmentsRequest listAccountAssignmentsRequest);

    /**
     * <p>
     * Lists all the AWS accounts where the specified permission set is provisioned.
     * </p>
     * 
     * @param listAccountsForProvisionedPermissionSetRequest
     * @return Result of the ListAccountsForProvisionedPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListAccountsForProvisionedPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountsForProvisionedPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountsForProvisionedPermissionSetResult listAccountsForProvisionedPermissionSet(
            ListAccountsForProvisionedPermissionSetRequest listAccountsForProvisionedPermissionSetRequest);

    /**
     * <p>
     * Lists all customer managed policies attached to a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param listCustomerManagedPolicyReferencesInPermissionSetRequest
     * @return Result of the ListCustomerManagedPolicyReferencesInPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListCustomerManagedPolicyReferencesInPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListCustomerManagedPolicyReferencesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomerManagedPolicyReferencesInPermissionSetResult listCustomerManagedPolicyReferencesInPermissionSet(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest listCustomerManagedPolicyReferencesInPermissionSetRequest);

    /**
     * <p>
     * Lists the IAM Identity Center instances that the caller has access to.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListInstances" target="_top">AWS API
     *      Documentation</a>
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists the AWS managed policy that is attached to a specified permission set.
     * </p>
     * 
     * @param listManagedPoliciesInPermissionSetRequest
     * @return Result of the ListManagedPoliciesInPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListManagedPoliciesInPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListManagedPoliciesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    ListManagedPoliciesInPermissionSetResult listManagedPoliciesInPermissionSet(
            ListManagedPoliciesInPermissionSetRequest listManagedPoliciesInPermissionSetRequest);

    /**
     * <p>
     * Lists the status of the permission set provisioning requests for a specified IAM Identity Center instance.
     * </p>
     * 
     * @param listPermissionSetProvisioningStatusRequest
     * @return Result of the ListPermissionSetProvisioningStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListPermissionSetProvisioningStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListPermissionSetProvisioningStatusResult listPermissionSetProvisioningStatus(
            ListPermissionSetProvisioningStatusRequest listPermissionSetProvisioningStatusRequest);

    /**
     * <p>
     * Lists the <a>PermissionSet</a>s in an IAM Identity Center instance.
     * </p>
     * 
     * @param listPermissionSetsRequest
     * @return Result of the ListPermissionSets operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListPermissionSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListPermissionSetsResult listPermissionSets(ListPermissionSetsRequest listPermissionSetsRequest);

    /**
     * <p>
     * Lists all the permission sets that are provisioned to a specified AWS account.
     * </p>
     * 
     * @param listPermissionSetsProvisionedToAccountRequest
     * @return Result of the ListPermissionSetsProvisionedToAccount operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListPermissionSetsProvisionedToAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSetsProvisionedToAccount"
     *      target="_top">AWS API Documentation</a>
     */
    ListPermissionSetsProvisionedToAccountResult listPermissionSetsProvisionedToAccount(
            ListPermissionSetsProvisionedToAccountRequest listPermissionSetsProvisionedToAccountRequest);

    /**
     * <p>
     * Lists the tags that are attached to a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSSSOAdmin.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * The process by which a specified permission set is provisioned to the specified target.
     * </p>
     * 
     * @param provisionPermissionSetRequest
     * @return Result of the ProvisionPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.ProvisionPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ProvisionPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    ProvisionPermissionSetResult provisionPermissionSet(ProvisionPermissionSetRequest provisionPermissionSetRequest);

    /**
     * <p>
     * Attaches an inline policy to a permission set.
     * </p>
     * <note>
     * <p>
     * If the permission set is already referenced by one or more account assignments, you will need to call
     * <code> <a>ProvisionPermissionSet</a> </code> after this action to apply the corresponding IAM policy updates to
     * all assigned accounts.
     * </p>
     * </note>
     * 
     * @param putInlinePolicyToPermissionSetRequest
     * @return Result of the PutInlinePolicyToPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutInlinePolicyToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutInlinePolicyToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    PutInlinePolicyToPermissionSetResult putInlinePolicyToPermissionSet(PutInlinePolicyToPermissionSetRequest putInlinePolicyToPermissionSetRequest);

    /**
     * <p>
     * Attaches an AWS managed or customer managed policy to the specified <a>PermissionSet</a> as a permissions
     * boundary.
     * </p>
     * 
     * @param putPermissionsBoundaryToPermissionSetRequest
     * @return Result of the PutPermissionsBoundaryToPermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutPermissionsBoundaryToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutPermissionsBoundaryToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    PutPermissionsBoundaryToPermissionSetResult putPermissionsBoundaryToPermissionSet(
            PutPermissionsBoundaryToPermissionSetRequest putPermissionsBoundaryToPermissionSetRequest);

    /**
     * <p>
     * Associates a set of tags with a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Disassociates a set of tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the IAM Identity Center identity store attributes that you can use with the IAM Identity Center instance
     * for attributes-based access control (ABAC). When using an external identity provider as an identity source, you
     * can pass attributes through the SAML assertion as an alternative to configuring attributes from the IAM Identity
     * Center identity store. If a SAML assertion passes any of these attributes, IAM Identity Center replaces the
     * attribute value with the value from the IAM Identity Center identity store. For more information about ABAC, see
     * <a href="/singlesignon/latest/userguide/abac.html">Attribute-Based Access Control</a> in the <i>IAM Identity
     * Center User Guide</i>.
     * </p>
     * 
     * @param updateInstanceAccessControlAttributeConfigurationRequest
     * @return Result of the UpdateInstanceAccessControlAttributeConfiguration operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceAccessControlAttributeConfigurationResult updateInstanceAccessControlAttributeConfiguration(
            UpdateInstanceAccessControlAttributeConfigurationRequest updateInstanceAccessControlAttributeConfigurationRequest);

    /**
     * <p>
     * Updates an existing permission set.
     * </p>
     * 
     * @param updatePermissionSetRequest
     * @return Result of the UpdatePermissionSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdatePermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdatePermissionSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePermissionSetResult updatePermissionSet(UpdatePermissionSetRequest updatePermissionSetRequest);

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

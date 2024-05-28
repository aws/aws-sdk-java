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
 * <p>
 * <p>
 * IAM Identity Center (successor to Single Sign-On) helps you securely create, or connect, your workforce identities
 * and manage their access centrally across Amazon Web Services accounts and applications. IAM Identity Center is the
 * recommended approach for workforce authentication and authorization in Amazon Web Services, for organizations of any
 * size and type.
 * </p>
 * <note>
 * <p>
 * IAM Identity Center uses the <code>sso</code> and <code>identitystore</code> API namespaces.
 * </p>
 * </note>
 * <p>
 * This reference guide provides information on single sign-on operations which could be used for access management of
 * Amazon Web Services accounts. For information about IAM Identity Center features, see the <a
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
 * Amazon Web Services provides SDKs that consist of libraries and sample code for various programming languages and
 * platforms (Java, Ruby, .Net, iOS, Android, and more). The SDKs provide a convenient way to create programmatic access
 * to IAM Identity Center and other Amazon Web Services services. For more information about the Amazon Web Services
 * SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSSOAdminAsync extends AWSSSOAdmin {

    /**
     * <p>
     * Attaches the specified customer managed policy to the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param attachCustomerManagedPolicyReferenceToPermissionSetRequest
     * @return A Java Future containing the result of the AttachCustomerManagedPolicyReferenceToPermissionSet operation
     *         returned by the service.
     * @sample AWSSSOAdminAsync.AttachCustomerManagedPolicyReferenceToPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachCustomerManagedPolicyReferenceToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachCustomerManagedPolicyReferenceToPermissionSetResult> attachCustomerManagedPolicyReferenceToPermissionSetAsync(
            AttachCustomerManagedPolicyReferenceToPermissionSetRequest attachCustomerManagedPolicyReferenceToPermissionSetRequest);

    /**
     * <p>
     * Attaches the specified customer managed policy to the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param attachCustomerManagedPolicyReferenceToPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachCustomerManagedPolicyReferenceToPermissionSet operation
     *         returned by the service.
     * @sample AWSSSOAdminAsyncHandler.AttachCustomerManagedPolicyReferenceToPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/AttachCustomerManagedPolicyReferenceToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachCustomerManagedPolicyReferenceToPermissionSetResult> attachCustomerManagedPolicyReferenceToPermissionSetAsync(
            AttachCustomerManagedPolicyReferenceToPermissionSetRequest attachCustomerManagedPolicyReferenceToPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<AttachCustomerManagedPolicyReferenceToPermissionSetRequest, AttachCustomerManagedPolicyReferenceToPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Attaches an Amazon Web Services managed policy ARN to a permission set.
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
     * Attaches an Amazon Web Services managed policy ARN to a permission set.
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
     * Assigns access to a principal for a specified Amazon Web Services account using a specified permission set.
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
     * @return A Java Future containing the result of the CreateAccountAssignment operation returned by the service.
     * @sample AWSSSOAdminAsync.CreateAccountAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateAccountAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountAssignmentResult> createAccountAssignmentAsync(CreateAccountAssignmentRequest createAccountAssignmentRequest);

    /**
     * <p>
     * Assigns access to a principal for a specified Amazon Web Services account using a specified permission set.
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
     * Creates an application in IAM Identity Center for the given application provider.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSSSOAdminAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application in IAM Identity Center for the given application provider.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Grant application access to a user or group.
     * </p>
     * 
     * @param createApplicationAssignmentRequest
     * @return A Java Future containing the result of the CreateApplicationAssignment operation returned by the service.
     * @sample AWSSSOAdminAsync.CreateApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationAssignmentResult> createApplicationAssignmentAsync(
            CreateApplicationAssignmentRequest createApplicationAssignmentRequest);

    /**
     * <p>
     * Grant application access to a user or group.
     * </p>
     * 
     * @param createApplicationAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplicationAssignment operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreateApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationAssignmentResult> createApplicationAssignmentAsync(
            CreateApplicationAssignmentRequest createApplicationAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResult> asyncHandler);

    /**
     * <p>
     * Creates an instance of IAM Identity Center for a standalone Amazon Web Services account that is not managed by
     * Organizations or a member Amazon Web Services account in an organization. You can create only one instance per
     * account and across all Amazon Web Services Regions.
     * </p>
     * <p>
     * The CreateInstance request is rejected if the following apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The instance is created within the organization management account.
     * </p>
     * </li>
     * <li>
     * <p>
     * An instance already exists in the same account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createInstanceRequest
     * @return A Java Future containing the result of the CreateInstance operation returned by the service.
     * @sample AWSSSOAdminAsync.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest);

    /**
     * <p>
     * Creates an instance of IAM Identity Center for a standalone Amazon Web Services account that is not managed by
     * Organizations or a member Amazon Web Services account in an organization. You can create only one instance per
     * account and across all Amazon Web Services Regions.
     * </p>
     * <p>
     * The CreateInstance request is rejected if the following apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The instance is created within the organization management account.
     * </p>
     * </li>
     * <li>
     * <p>
     * An instance already exists in the same account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstance operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsync.CreateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceAccessControlAttributeConfigurationResult> createInstanceAccessControlAttributeConfigurationAsync(
            CreateInstanceAccessControlAttributeConfigurationRequest createInstanceAccessControlAttributeConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceAccessControlAttributeConfigurationResult> createInstanceAccessControlAttributeConfigurationAsync(
            CreateInstanceAccessControlAttributeConfigurationRequest createInstanceAccessControlAttributeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a permission set within a specified IAM Identity Center instance.
     * </p>
     * <note>
     * <p>
     * To grant users and groups access to Amazon Web Services account resources, use
     * <code> <a>CreateAccountAssignment</a> </code>.
     * </p>
     * </note>
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
     * Creates a permission set within a specified IAM Identity Center instance.
     * </p>
     * <note>
     * <p>
     * To grant users and groups access to Amazon Web Services account resources, use
     * <code> <a>CreateAccountAssignment</a> </code>.
     * </p>
     * </note>
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
     * Creates a connection to a trusted token issuer in an instance of IAM Identity Center. A trusted token issuer
     * enables trusted identity propagation to be used with applications that authenticate outside of Amazon Web
     * Services.
     * </p>
     * <p>
     * This trusted token issuer describes an external identity provider (IdP) that can generate claims or assertions in
     * the form of access tokens for a user. Applications enabled for IAM Identity Center can use these tokens for
     * authentication.
     * </p>
     * 
     * @param createTrustedTokenIssuerRequest
     * @return A Java Future containing the result of the CreateTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsync.CreateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustedTokenIssuerResult> createTrustedTokenIssuerAsync(CreateTrustedTokenIssuerRequest createTrustedTokenIssuerRequest);

    /**
     * <p>
     * Creates a connection to a trusted token issuer in an instance of IAM Identity Center. A trusted token issuer
     * enables trusted identity propagation to be used with applications that authenticate outside of Amazon Web
     * Services.
     * </p>
     * <p>
     * This trusted token issuer describes an external identity provider (IdP) that can generate claims or assertions in
     * the form of access tokens for a user. Applications enabled for IAM Identity Center can use these tokens for
     * authentication.
     * </p>
     * 
     * @param createTrustedTokenIssuerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.CreateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrustedTokenIssuerResult> createTrustedTokenIssuerAsync(CreateTrustedTokenIssuerRequest createTrustedTokenIssuerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrustedTokenIssuerRequest, CreateTrustedTokenIssuerResult> asyncHandler);

    /**
     * <p>
     * Deletes a principal's access from a specified Amazon Web Services account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * After a successful response, call <code>DescribeAccountAssignmentDeletionStatus</code> to describe the status of
     * an assignment deletion request.
     * </p>
     * </note>
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
     * Deletes a principal's access from a specified Amazon Web Services account using a specified permission set.
     * </p>
     * <note>
     * <p>
     * After a successful response, call <code>DescribeAccountAssignmentDeletionStatus</code> to describe the status of
     * an assignment deletion request.
     * </p>
     * </note>
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
     * Deletes the association with the application. The connected service resource still exists.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSSSOAdminAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the association with the application. The connected service resource still exists.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes an IAM Identity Center access scope from an application.
     * </p>
     * 
     * @param deleteApplicationAccessScopeRequest
     * @return A Java Future containing the result of the DeleteApplicationAccessScope operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.DeleteApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationAccessScopeResult> deleteApplicationAccessScopeAsync(
            DeleteApplicationAccessScopeRequest deleteApplicationAccessScopeRequest);

    /**
     * <p>
     * Deletes an IAM Identity Center access scope from an application.
     * </p>
     * 
     * @param deleteApplicationAccessScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationAccessScope operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.DeleteApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationAccessScopeResult> deleteApplicationAccessScopeAsync(
            DeleteApplicationAccessScopeRequest deleteApplicationAccessScopeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationAccessScopeRequest, DeleteApplicationAccessScopeResult> asyncHandler);

    /**
     * <p>
     * Revoke application access to an application by deleting application assignments for a user or group.
     * </p>
     * 
     * @param deleteApplicationAssignmentRequest
     * @return A Java Future containing the result of the DeleteApplicationAssignment operation returned by the service.
     * @sample AWSSSOAdminAsync.DeleteApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationAssignmentResult> deleteApplicationAssignmentAsync(
            DeleteApplicationAssignmentRequest deleteApplicationAssignmentRequest);

    /**
     * <p>
     * Revoke application access to an application by deleting application assignments for a user or group.
     * </p>
     * 
     * @param deleteApplicationAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationAssignment operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationAssignmentResult> deleteApplicationAssignmentAsync(
            DeleteApplicationAssignmentRequest deleteApplicationAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResult> asyncHandler);

    /**
     * <p>
     * Deletes an authentication method from an application.
     * </p>
     * 
     * @param deleteApplicationAuthenticationMethodRequest
     * @return A Java Future containing the result of the DeleteApplicationAuthenticationMethod operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.DeleteApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationAuthenticationMethodResult> deleteApplicationAuthenticationMethodAsync(
            DeleteApplicationAuthenticationMethodRequest deleteApplicationAuthenticationMethodRequest);

    /**
     * <p>
     * Deletes an authentication method from an application.
     * </p>
     * 
     * @param deleteApplicationAuthenticationMethodRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationAuthenticationMethod operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationAuthenticationMethodResult> deleteApplicationAuthenticationMethodAsync(
            DeleteApplicationAuthenticationMethodRequest deleteApplicationAuthenticationMethodRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationAuthenticationMethodRequest, DeleteApplicationAuthenticationMethodResult> asyncHandler);

    /**
     * <p>
     * Deletes a grant from an application.
     * </p>
     * 
     * @param deleteApplicationGrantRequest
     * @return A Java Future containing the result of the DeleteApplicationGrant operation returned by the service.
     * @sample AWSSSOAdminAsync.DeleteApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationGrantResult> deleteApplicationGrantAsync(DeleteApplicationGrantRequest deleteApplicationGrantRequest);

    /**
     * <p>
     * Deletes a grant from an application.
     * </p>
     * 
     * @param deleteApplicationGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationGrant operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationGrant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationGrantResult> deleteApplicationGrantAsync(DeleteApplicationGrantRequest deleteApplicationGrantRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationGrantRequest, DeleteApplicationGrantResult> asyncHandler);

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
     * Deletes the instance of IAM Identity Center. Only the account that owns the instance can call this API. Neither
     * the delegated administrator nor member account can delete the organization instance, but those roles can delete
     * their own instance.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AWSSSOAdminAsync.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes the instance of IAM Identity Center. Only the account that owns the instance can call this API. Neither
     * the delegated administrator nor member account can delete the organization instance, but those roles can delete
     * their own instance.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsync.DeleteInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceAccessControlAttributeConfigurationResult> deleteInstanceAccessControlAttributeConfigurationAsync(
            DeleteInstanceAccessControlAttributeConfigurationRequest deleteInstanceAccessControlAttributeConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceAccessControlAttributeConfigurationResult> deleteInstanceAccessControlAttributeConfigurationAsync(
            DeleteInstanceAccessControlAttributeConfigurationRequest deleteInstanceAccessControlAttributeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResult> asyncHandler);

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
     * Deletes the permissions boundary from a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param deletePermissionsBoundaryFromPermissionSetRequest
     * @return A Java Future containing the result of the DeletePermissionsBoundaryFromPermissionSet operation returned
     *         by the service.
     * @sample AWSSSOAdminAsync.DeletePermissionsBoundaryFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionsBoundaryFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionsBoundaryFromPermissionSetResult> deletePermissionsBoundaryFromPermissionSetAsync(
            DeletePermissionsBoundaryFromPermissionSetRequest deletePermissionsBoundaryFromPermissionSetRequest);

    /**
     * <p>
     * Deletes the permissions boundary from a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param deletePermissionsBoundaryFromPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionsBoundaryFromPermissionSet operation returned
     *         by the service.
     * @sample AWSSSOAdminAsyncHandler.DeletePermissionsBoundaryFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionsBoundaryFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionsBoundaryFromPermissionSetResult> deletePermissionsBoundaryFromPermissionSetAsync(
            DeletePermissionsBoundaryFromPermissionSetRequest deletePermissionsBoundaryFromPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionsBoundaryFromPermissionSetRequest, DeletePermissionsBoundaryFromPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a trusted token issuer configuration from an instance of IAM Identity Center.
     * </p>
     * <note>
     * <p>
     * Deleting this trusted token issuer configuration will cause users to lose access to any applications that are
     * configured to use the trusted token issuer.
     * </p>
     * </note>
     * 
     * @param deleteTrustedTokenIssuerRequest
     * @return A Java Future containing the result of the DeleteTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsync.DeleteTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustedTokenIssuerResult> deleteTrustedTokenIssuerAsync(DeleteTrustedTokenIssuerRequest deleteTrustedTokenIssuerRequest);

    /**
     * <p>
     * Deletes a trusted token issuer configuration from an instance of IAM Identity Center.
     * </p>
     * <note>
     * <p>
     * Deleting this trusted token issuer configuration will cause users to lose access to any applications that are
     * configured to use the trusted token issuer.
     * </p>
     * </note>
     * 
     * @param deleteTrustedTokenIssuerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DeleteTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrustedTokenIssuerResult> deleteTrustedTokenIssuerAsync(DeleteTrustedTokenIssuerRequest deleteTrustedTokenIssuerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrustedTokenIssuerRequest, DeleteTrustedTokenIssuerResult> asyncHandler);

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
     * Retrieves the details of an application associated with an instance of IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AWSSSOAdminAsync.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Retrieves the details of an application associated with an instance of IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a direct assignment of a user or group to an application. If the user doesn’t have a direct assignment
     * to the application, the user may still have access to the application through a group. Therefore, don’t use this
     * API to test access to an application for a user. Instead use <a>ListApplicationAssignmentsForPrincipal</a>.
     * </p>
     * 
     * @param describeApplicationAssignmentRequest
     * @return A Java Future containing the result of the DescribeApplicationAssignment operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.DescribeApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationAssignmentResult> describeApplicationAssignmentAsync(
            DescribeApplicationAssignmentRequest describeApplicationAssignmentRequest);

    /**
     * <p>
     * Retrieves a direct assignment of a user or group to an application. If the user doesn’t have a direct assignment
     * to the application, the user may still have access to the application through a group. Therefore, don’t use this
     * API to test access to an application for a user. Instead use <a>ListApplicationAssignmentsForPrincipal</a>.
     * </p>
     * 
     * @param describeApplicationAssignmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationAssignment operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.DescribeApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationAssignmentResult> describeApplicationAssignmentAsync(
            DescribeApplicationAssignmentRequest describeApplicationAssignmentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationAssignmentRequest, DescribeApplicationAssignmentResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about a provider that can be used to connect an Amazon Web Services managed application or
     * customer managed application to IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationProviderRequest
     * @return A Java Future containing the result of the DescribeApplicationProvider operation returned by the service.
     * @sample AWSSSOAdminAsync.DescribeApplicationProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationProviderResult> describeApplicationProviderAsync(
            DescribeApplicationProviderRequest describeApplicationProviderRequest);

    /**
     * <p>
     * Retrieves details about a provider that can be used to connect an Amazon Web Services managed application or
     * customer managed application to IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationProvider operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeApplicationProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationProviderResult> describeApplicationProviderAsync(
            DescribeApplicationProviderRequest describeApplicationProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationProviderRequest, DescribeApplicationProviderResult> asyncHandler);

    /**
     * <p>
     * Returns the details of an instance of IAM Identity Center. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The instance is in the process of being created. When the instance is ready for
     * use, DescribeInstance returns the status of <code>ACTIVE</code>. While the instance is in the
     * <code>CREATE_IN_PROGRESS</code> state, you can call only DescribeInstance and DeleteInstance operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> - The instance is being deleted. Returns <code>AccessDeniedException</code> after
     * the delete operation completes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The instance is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceRequest
     * @return A Java Future containing the result of the DescribeInstance operation returned by the service.
     * @sample AWSSSOAdminAsync.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest describeInstanceRequest);

    /**
     * <p>
     * Returns the details of an instance of IAM Identity Center. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The instance is in the process of being created. When the instance is ready for
     * use, DescribeInstance returns the status of <code>ACTIVE</code>. While the instance is in the
     * <code>CREATE_IN_PROGRESS</code> state, you can call only DescribeInstance and DeleteInstance operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_IN_PROGRESS</code> - The instance is being deleted. Returns <code>AccessDeniedException</code> after
     * the delete operation completes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The instance is active.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstance operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceResult> describeInstanceAsync(DescribeInstanceRequest describeInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceRequest, DescribeInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsync.DescribeInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAccessControlAttributeConfigurationResult> describeInstanceAccessControlAttributeConfigurationAsync(
            DescribeInstanceAccessControlAttributeConfigurationRequest describeInstanceAccessControlAttributeConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstanceAccessControlAttributeConfigurationResult> describeInstanceAccessControlAttributeConfigurationAsync(
            DescribeInstanceAccessControlAttributeConfigurationRequest describeInstanceAccessControlAttributeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResult> asyncHandler);

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
     * Retrieves details about a trusted token issuer configuration stored in an instance of IAM Identity Center.
     * Details include the name of the trusted token issuer, the issuer URL, and the path of the source attribute and
     * the destination attribute for a trusted token issuer configuration.
     * </p>
     * 
     * @param describeTrustedTokenIssuerRequest
     * @return A Java Future containing the result of the DescribeTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsync.DescribeTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedTokenIssuerResult> describeTrustedTokenIssuerAsync(
            DescribeTrustedTokenIssuerRequest describeTrustedTokenIssuerRequest);

    /**
     * <p>
     * Retrieves details about a trusted token issuer configuration stored in an instance of IAM Identity Center.
     * Details include the name of the trusted token issuer, the issuer URL, and the path of the source attribute and
     * the destination attribute for a trusted token issuer configuration.
     * </p>
     * 
     * @param describeTrustedTokenIssuerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DescribeTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedTokenIssuerResult> describeTrustedTokenIssuerAsync(
            DescribeTrustedTokenIssuerRequest describeTrustedTokenIssuerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedTokenIssuerRequest, DescribeTrustedTokenIssuerResult> asyncHandler);

    /**
     * <p>
     * Detaches the specified customer managed policy from the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param detachCustomerManagedPolicyReferenceFromPermissionSetRequest
     * @return A Java Future containing the result of the DetachCustomerManagedPolicyReferenceFromPermissionSet
     *         operation returned by the service.
     * @sample AWSSSOAdminAsync.DetachCustomerManagedPolicyReferenceFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachCustomerManagedPolicyReferenceFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachCustomerManagedPolicyReferenceFromPermissionSetResult> detachCustomerManagedPolicyReferenceFromPermissionSetAsync(
            DetachCustomerManagedPolicyReferenceFromPermissionSetRequest detachCustomerManagedPolicyReferenceFromPermissionSetRequest);

    /**
     * <p>
     * Detaches the specified customer managed policy from the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param detachCustomerManagedPolicyReferenceFromPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachCustomerManagedPolicyReferenceFromPermissionSet
     *         operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.DetachCustomerManagedPolicyReferenceFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DetachCustomerManagedPolicyReferenceFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachCustomerManagedPolicyReferenceFromPermissionSetResult> detachCustomerManagedPolicyReferenceFromPermissionSetAsync(
            DetachCustomerManagedPolicyReferenceFromPermissionSetRequest detachCustomerManagedPolicyReferenceFromPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<DetachCustomerManagedPolicyReferenceFromPermissionSetRequest, DetachCustomerManagedPolicyReferenceFromPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Detaches the attached Amazon Web Services managed policy ARN from the specified permission set.
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
     * Detaches the attached Amazon Web Services managed policy ARN from the specified permission set.
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
     * Retrieves the authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param getApplicationAccessScopeRequest
     * @return A Java Future containing the result of the GetApplicationAccessScope operation returned by the service.
     * @sample AWSSSOAdminAsync.GetApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationAccessScopeResult> getApplicationAccessScopeAsync(
            GetApplicationAccessScopeRequest getApplicationAccessScopeRequest);

    /**
     * <p>
     * Retrieves the authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param getApplicationAccessScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationAccessScope operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.GetApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationAccessScopeResult> getApplicationAccessScopeAsync(
            GetApplicationAccessScopeRequest getApplicationAccessScopeRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationAccessScopeRequest, GetApplicationAccessScopeResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration of <a>PutApplicationAssignmentConfiguration</a>.
     * </p>
     * 
     * @param getApplicationAssignmentConfigurationRequest
     * @return A Java Future containing the result of the GetApplicationAssignmentConfiguration operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.GetApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationAssignmentConfigurationResult> getApplicationAssignmentConfigurationAsync(
            GetApplicationAssignmentConfigurationRequest getApplicationAssignmentConfigurationRequest);

    /**
     * <p>
     * Retrieves the configuration of <a>PutApplicationAssignmentConfiguration</a>.
     * </p>
     * 
     * @param getApplicationAssignmentConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationAssignmentConfiguration operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.GetApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationAssignmentConfigurationResult> getApplicationAssignmentConfigurationAsync(
            GetApplicationAssignmentConfigurationRequest getApplicationAssignmentConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about an authentication method used by an application.
     * </p>
     * 
     * @param getApplicationAuthenticationMethodRequest
     * @return A Java Future containing the result of the GetApplicationAuthenticationMethod operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.GetApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationAuthenticationMethodResult> getApplicationAuthenticationMethodAsync(
            GetApplicationAuthenticationMethodRequest getApplicationAuthenticationMethodRequest);

    /**
     * <p>
     * Retrieves details about an authentication method used by an application.
     * </p>
     * 
     * @param getApplicationAuthenticationMethodRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationAuthenticationMethod operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.GetApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationAuthenticationMethodResult> getApplicationAuthenticationMethodAsync(
            GetApplicationAuthenticationMethodRequest getApplicationAuthenticationMethodRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationAuthenticationMethodRequest, GetApplicationAuthenticationMethodResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about an application grant.
     * </p>
     * 
     * @param getApplicationGrantRequest
     * @return A Java Future containing the result of the GetApplicationGrant operation returned by the service.
     * @sample AWSSSOAdminAsync.GetApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationGrantResult> getApplicationGrantAsync(GetApplicationGrantRequest getApplicationGrantRequest);

    /**
     * <p>
     * Retrieves details about an application grant.
     * </p>
     * 
     * @param getApplicationGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationGrant operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.GetApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationGrantResult> getApplicationGrantAsync(GetApplicationGrantRequest getApplicationGrantRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationGrantRequest, GetApplicationGrantResult> asyncHandler);

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
     * Obtains the permissions boundary for a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param getPermissionsBoundaryForPermissionSetRequest
     * @return A Java Future containing the result of the GetPermissionsBoundaryForPermissionSet operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.GetPermissionsBoundaryForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetPermissionsBoundaryForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionsBoundaryForPermissionSetResult> getPermissionsBoundaryForPermissionSetAsync(
            GetPermissionsBoundaryForPermissionSetRequest getPermissionsBoundaryForPermissionSetRequest);

    /**
     * <p>
     * Obtains the permissions boundary for a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param getPermissionsBoundaryForPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPermissionsBoundaryForPermissionSet operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.GetPermissionsBoundaryForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetPermissionsBoundaryForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionsBoundaryForPermissionSetResult> getPermissionsBoundaryForPermissionSetAsync(
            GetPermissionsBoundaryForPermissionSetRequest getPermissionsBoundaryForPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetPermissionsBoundaryForPermissionSetRequest, GetPermissionsBoundaryForPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Lists the status of the Amazon Web Services account assignment creation requests for a specified IAM Identity
     * Center instance.
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
     * Lists the status of the Amazon Web Services account assignment creation requests for a specified IAM Identity
     * Center instance.
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
     * Lists the status of the Amazon Web Services account assignment deletion requests for a specified IAM Identity
     * Center instance.
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
     * Lists the status of the Amazon Web Services account assignment deletion requests for a specified IAM Identity
     * Center instance.
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
     * Lists the assignee of the specified Amazon Web Services account with the specified permission set.
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
     * Lists the assignee of the specified Amazon Web Services account with the specified permission set.
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
     * Retrieves a list of the IAM Identity Center associated Amazon Web Services accounts that the principal has access
     * to.
     * </p>
     * 
     * @param listAccountAssignmentsForPrincipalRequest
     * @return A Java Future containing the result of the ListAccountAssignmentsForPrincipal operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.ListAccountAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentsForPrincipalResult> listAccountAssignmentsForPrincipalAsync(
            ListAccountAssignmentsForPrincipalRequest listAccountAssignmentsForPrincipalRequest);

    /**
     * <p>
     * Retrieves a list of the IAM Identity Center associated Amazon Web Services accounts that the principal has access
     * to.
     * </p>
     * 
     * @param listAccountAssignmentsForPrincipalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountAssignmentsForPrincipal operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.ListAccountAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountAssignmentsForPrincipalResult> listAccountAssignmentsForPrincipalAsync(
            ListAccountAssignmentsForPrincipalRequest listAccountAssignmentsForPrincipalRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResult> asyncHandler);

    /**
     * <p>
     * Lists all the Amazon Web Services accounts where the specified permission set is provisioned.
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
     * Lists all the Amazon Web Services accounts where the specified permission set is provisioned.
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
     * Lists the access scopes and authorized targets associated with an application.
     * </p>
     * 
     * @param listApplicationAccessScopesRequest
     * @return A Java Future containing the result of the ListApplicationAccessScopes operation returned by the service.
     * @sample AWSSSOAdminAsync.ListApplicationAccessScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAccessScopes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAccessScopesResult> listApplicationAccessScopesAsync(
            ListApplicationAccessScopesRequest listApplicationAccessScopesRequest);

    /**
     * <p>
     * Lists the access scopes and authorized targets associated with an application.
     * </p>
     * 
     * @param listApplicationAccessScopesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationAccessScopes operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListApplicationAccessScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAccessScopes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAccessScopesResult> listApplicationAccessScopesAsync(
            ListApplicationAccessScopesRequest listApplicationAccessScopesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationAccessScopesRequest, ListApplicationAccessScopesResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon Web Services account users that are assigned to an application.
     * </p>
     * 
     * @param listApplicationAssignmentsRequest
     * @return A Java Future containing the result of the ListApplicationAssignments operation returned by the service.
     * @sample AWSSSOAdminAsync.ListApplicationAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAssignmentsResult> listApplicationAssignmentsAsync(
            ListApplicationAssignmentsRequest listApplicationAssignmentsRequest);

    /**
     * <p>
     * Lists Amazon Web Services account users that are assigned to an application.
     * </p>
     * 
     * @param listApplicationAssignmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationAssignments operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListApplicationAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAssignmentsResult> listApplicationAssignmentsAsync(
            ListApplicationAssignmentsRequest listApplicationAssignmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResult> asyncHandler);

    /**
     * <p>
     * Lists the applications to which a specified principal is assigned.
     * </p>
     * 
     * @param listApplicationAssignmentsForPrincipalRequest
     * @return A Java Future containing the result of the ListApplicationAssignmentsForPrincipal operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.ListApplicationAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAssignmentsForPrincipalResult> listApplicationAssignmentsForPrincipalAsync(
            ListApplicationAssignmentsForPrincipalRequest listApplicationAssignmentsForPrincipalRequest);

    /**
     * <p>
     * Lists the applications to which a specified principal is assigned.
     * </p>
     * 
     * @param listApplicationAssignmentsForPrincipalRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationAssignmentsForPrincipal operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.ListApplicationAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAssignmentsForPrincipalResult> listApplicationAssignmentsForPrincipalAsync(
            ListApplicationAssignmentsForPrincipalRequest listApplicationAssignmentsForPrincipalRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResult> asyncHandler);

    /**
     * <p>
     * Lists all of the authentication methods supported by the specified application.
     * </p>
     * 
     * @param listApplicationAuthenticationMethodsRequest
     * @return A Java Future containing the result of the ListApplicationAuthenticationMethods operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.ListApplicationAuthenticationMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAuthenticationMethods"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAuthenticationMethodsResult> listApplicationAuthenticationMethodsAsync(
            ListApplicationAuthenticationMethodsRequest listApplicationAuthenticationMethodsRequest);

    /**
     * <p>
     * Lists all of the authentication methods supported by the specified application.
     * </p>
     * 
     * @param listApplicationAuthenticationMethodsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationAuthenticationMethods operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.ListApplicationAuthenticationMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAuthenticationMethods"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationAuthenticationMethodsResult> listApplicationAuthenticationMethodsAsync(
            ListApplicationAuthenticationMethodsRequest listApplicationAuthenticationMethodsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationAuthenticationMethodsRequest, ListApplicationAuthenticationMethodsResult> asyncHandler);

    /**
     * <p>
     * List the grants associated with an application.
     * </p>
     * 
     * @param listApplicationGrantsRequest
     * @return A Java Future containing the result of the ListApplicationGrants operation returned by the service.
     * @sample AWSSSOAdminAsync.ListApplicationGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationGrantsResult> listApplicationGrantsAsync(ListApplicationGrantsRequest listApplicationGrantsRequest);

    /**
     * <p>
     * List the grants associated with an application.
     * </p>
     * 
     * @param listApplicationGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationGrants operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListApplicationGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationGrants"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationGrantsResult> listApplicationGrantsAsync(ListApplicationGrantsRequest listApplicationGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationGrantsRequest, ListApplicationGrantsResult> asyncHandler);

    /**
     * <p>
     * Lists the application providers configured in the IAM Identity Center identity store.
     * </p>
     * 
     * @param listApplicationProvidersRequest
     * @return A Java Future containing the result of the ListApplicationProviders operation returned by the service.
     * @sample AWSSSOAdminAsync.ListApplicationProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationProvidersResult> listApplicationProvidersAsync(ListApplicationProvidersRequest listApplicationProvidersRequest);

    /**
     * <p>
     * Lists the application providers configured in the IAM Identity Center identity store.
     * </p>
     * 
     * @param listApplicationProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationProviders operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListApplicationProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationProvidersResult> listApplicationProvidersAsync(ListApplicationProvidersRequest listApplicationProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationProvidersRequest, ListApplicationProvidersResult> asyncHandler);

    /**
     * <p>
     * Lists all applications associated with the instance of IAM Identity Center. When listing applications for an
     * instance in the management account, member accounts must use the <code>applicationAccount</code> parameter to
     * filter the list to only applications created from that account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSSSOAdminAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all applications associated with the instance of IAM Identity Center. When listing applications for an
     * instance in the management account, member accounts must use the <code>applicationAccount</code> parameter to
     * filter the list to only applications created from that account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists all customer managed policies attached to a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param listCustomerManagedPolicyReferencesInPermissionSetRequest
     * @return A Java Future containing the result of the ListCustomerManagedPolicyReferencesInPermissionSet operation
     *         returned by the service.
     * @sample AWSSSOAdminAsync.ListCustomerManagedPolicyReferencesInPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListCustomerManagedPolicyReferencesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomerManagedPolicyReferencesInPermissionSetResult> listCustomerManagedPolicyReferencesInPermissionSetAsync(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest listCustomerManagedPolicyReferencesInPermissionSetRequest);

    /**
     * <p>
     * Lists all customer managed policies attached to a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param listCustomerManagedPolicyReferencesInPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomerManagedPolicyReferencesInPermissionSet operation
     *         returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListCustomerManagedPolicyReferencesInPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListCustomerManagedPolicyReferencesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomerManagedPolicyReferencesInPermissionSetResult> listCustomerManagedPolicyReferencesInPermissionSetAsync(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest listCustomerManagedPolicyReferencesInPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomerManagedPolicyReferencesInPermissionSetRequest, ListCustomerManagedPolicyReferencesInPermissionSetResult> asyncHandler);

    /**
     * <p>
     * Lists the details of the organization and account instances of IAM Identity Center that were created in or
     * visible to the account calling this API.
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
     * Lists the details of the organization and account instances of IAM Identity Center that were created in or
     * visible to the account calling this API.
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
     * Lists the Amazon Web Services managed policy that is attached to a specified permission set.
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
     * Lists the Amazon Web Services managed policy that is attached to a specified permission set.
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
     * Lists the status of the permission set provisioning requests for a specified IAM Identity Center instance.
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
     * Lists the status of the permission set provisioning requests for a specified IAM Identity Center instance.
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
     * Lists the <a>PermissionSet</a>s in an IAM Identity Center instance.
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
     * Lists the <a>PermissionSet</a>s in an IAM Identity Center instance.
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
     * Lists all the permission sets that are provisioned to a specified Amazon Web Services account.
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
     * Lists all the permission sets that are provisioned to a specified Amazon Web Services account.
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
     * Lists all the trusted token issuers configured in an instance of IAM Identity Center.
     * </p>
     * 
     * @param listTrustedTokenIssuersRequest
     * @return A Java Future containing the result of the ListTrustedTokenIssuers operation returned by the service.
     * @sample AWSSSOAdminAsync.ListTrustedTokenIssuers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTrustedTokenIssuers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustedTokenIssuersResult> listTrustedTokenIssuersAsync(ListTrustedTokenIssuersRequest listTrustedTokenIssuersRequest);

    /**
     * <p>
     * Lists all the trusted token issuers configured in an instance of IAM Identity Center.
     * </p>
     * 
     * @param listTrustedTokenIssuersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrustedTokenIssuers operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.ListTrustedTokenIssuers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTrustedTokenIssuers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrustedTokenIssuersResult> listTrustedTokenIssuersAsync(ListTrustedTokenIssuersRequest listTrustedTokenIssuersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrustedTokenIssuersRequest, ListTrustedTokenIssuersResult> asyncHandler);

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
     * Adds or updates the list of authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param putApplicationAccessScopeRequest
     * @return A Java Future containing the result of the PutApplicationAccessScope operation returned by the service.
     * @sample AWSSSOAdminAsync.PutApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationAccessScopeResult> putApplicationAccessScopeAsync(
            PutApplicationAccessScopeRequest putApplicationAccessScopeRequest);

    /**
     * <p>
     * Adds or updates the list of authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param putApplicationAccessScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutApplicationAccessScope operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.PutApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationAccessScopeResult> putApplicationAccessScopeAsync(
            PutApplicationAccessScopeRequest putApplicationAccessScopeRequest,
            com.amazonaws.handlers.AsyncHandler<PutApplicationAccessScopeRequest, PutApplicationAccessScopeResult> asyncHandler);

    /**
     * <p>
     * Configure how users gain access to an application. If <code>AssignmentsRequired</code> is <code>true</code>
     * (default value), users don’t have access to the application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application. If an
     * assignment is created using <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment</a>., the user retains access if <code>AssignmentsRequired</code> is set to
     * <code>true</code>.
     * </p>
     * 
     * @param putApplicationAssignmentConfigurationRequest
     * @return A Java Future containing the result of the PutApplicationAssignmentConfiguration operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.PutApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationAssignmentConfigurationResult> putApplicationAssignmentConfigurationAsync(
            PutApplicationAssignmentConfigurationRequest putApplicationAssignmentConfigurationRequest);

    /**
     * <p>
     * Configure how users gain access to an application. If <code>AssignmentsRequired</code> is <code>true</code>
     * (default value), users don’t have access to the application unless an assignment is created using the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment API</a>. If <code>false</code>, all users have access to the application. If an
     * assignment is created using <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_CreateApplicationAssignment.html"
     * >CreateApplicationAssignment</a>., the user retains access if <code>AssignmentsRequired</code> is set to
     * <code>true</code>.
     * </p>
     * 
     * @param putApplicationAssignmentConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutApplicationAssignmentConfiguration operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.PutApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationAssignmentConfigurationResult> putApplicationAssignmentConfigurationAsync(
            PutApplicationAssignmentConfigurationRequest putApplicationAssignmentConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutApplicationAssignmentConfigurationRequest, PutApplicationAssignmentConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds or updates an authentication method for an application.
     * </p>
     * 
     * @param putApplicationAuthenticationMethodRequest
     * @return A Java Future containing the result of the PutApplicationAuthenticationMethod operation returned by the
     *         service.
     * @sample AWSSSOAdminAsync.PutApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationAuthenticationMethodResult> putApplicationAuthenticationMethodAsync(
            PutApplicationAuthenticationMethodRequest putApplicationAuthenticationMethodRequest);

    /**
     * <p>
     * Adds or updates an authentication method for an application.
     * </p>
     * 
     * @param putApplicationAuthenticationMethodRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutApplicationAuthenticationMethod operation returned by the
     *         service.
     * @sample AWSSSOAdminAsyncHandler.PutApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationAuthenticationMethodResult> putApplicationAuthenticationMethodAsync(
            PutApplicationAuthenticationMethodRequest putApplicationAuthenticationMethodRequest,
            com.amazonaws.handlers.AsyncHandler<PutApplicationAuthenticationMethodRequest, PutApplicationAuthenticationMethodResult> asyncHandler);

    /**
     * <p>
     * Adds a grant to an application.
     * </p>
     * 
     * @param putApplicationGrantRequest
     * @return A Java Future containing the result of the PutApplicationGrant operation returned by the service.
     * @sample AWSSSOAdminAsync.PutApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationGrantResult> putApplicationGrantAsync(PutApplicationGrantRequest putApplicationGrantRequest);

    /**
     * <p>
     * Adds a grant to an application.
     * </p>
     * 
     * @param putApplicationGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutApplicationGrant operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.PutApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutApplicationGrantResult> putApplicationGrantAsync(PutApplicationGrantRequest putApplicationGrantRequest,
            com.amazonaws.handlers.AsyncHandler<PutApplicationGrantRequest, PutApplicationGrantResult> asyncHandler);

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
     * Attaches an Amazon Web Services managed or customer managed policy to the specified <a>PermissionSet</a> as a
     * permissions boundary.
     * </p>
     * 
     * @param putPermissionsBoundaryToPermissionSetRequest
     * @return A Java Future containing the result of the PutPermissionsBoundaryToPermissionSet operation returned by
     *         the service.
     * @sample AWSSSOAdminAsync.PutPermissionsBoundaryToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutPermissionsBoundaryToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionsBoundaryToPermissionSetResult> putPermissionsBoundaryToPermissionSetAsync(
            PutPermissionsBoundaryToPermissionSetRequest putPermissionsBoundaryToPermissionSetRequest);

    /**
     * <p>
     * Attaches an Amazon Web Services managed or customer managed policy to the specified <a>PermissionSet</a> as a
     * permissions boundary.
     * </p>
     * 
     * @param putPermissionsBoundaryToPermissionSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPermissionsBoundaryToPermissionSet operation returned by
     *         the service.
     * @sample AWSSSOAdminAsyncHandler.PutPermissionsBoundaryToPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutPermissionsBoundaryToPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionsBoundaryToPermissionSetResult> putPermissionsBoundaryToPermissionSetAsync(
            PutPermissionsBoundaryToPermissionSetRequest putPermissionsBoundaryToPermissionSetRequest,
            com.amazonaws.handlers.AsyncHandler<PutPermissionsBoundaryToPermissionSetRequest, PutPermissionsBoundaryToPermissionSetResult> asyncHandler);

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
     * Updates application properties.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSSSOAdminAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates application properties.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Update the details for the instance of IAM Identity Center that is owned by the Amazon Web Services account.
     * </p>
     * 
     * @param updateInstanceRequest
     * @return A Java Future containing the result of the UpdateInstance operation returned by the service.
     * @sample AWSSSOAdminAsync.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(UpdateInstanceRequest updateInstanceRequest);

    /**
     * <p>
     * Update the details for the instance of IAM Identity Center that is owned by the Amazon Web Services account.
     * </p>
     * 
     * @param updateInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstance operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(UpdateInstanceRequest updateInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsync.UpdateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceAccessControlAttributeConfigurationResult> updateInstanceAccessControlAttributeConfigurationAsync(
            UpdateInstanceAccessControlAttributeConfigurationRequest updateInstanceAccessControlAttributeConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstanceAccessControlAttributeConfiguration operation
     *         returned by the service.
     * @sample AWSSSOAdminAsyncHandler.UpdateInstanceAccessControlAttributeConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstanceAccessControlAttributeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceAccessControlAttributeConfigurationResult> updateInstanceAccessControlAttributeConfigurationAsync(
            UpdateInstanceAccessControlAttributeConfigurationRequest updateInstanceAccessControlAttributeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResult> asyncHandler);

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

    /**
     * <p>
     * Updates the name of the trusted token issuer, or the path of a source attribute or destination attribute for a
     * trusted token issuer configuration.
     * </p>
     * <note>
     * <p>
     * Updating this trusted token issuer configuration might cause users to lose access to any applications that are
     * configured to use the trusted token issuer.
     * </p>
     * </note>
     * 
     * @param updateTrustedTokenIssuerRequest
     * @return A Java Future containing the result of the UpdateTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsync.UpdateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustedTokenIssuerResult> updateTrustedTokenIssuerAsync(UpdateTrustedTokenIssuerRequest updateTrustedTokenIssuerRequest);

    /**
     * <p>
     * Updates the name of the trusted token issuer, or the path of a source attribute or destination attribute for a
     * trusted token issuer configuration.
     * </p>
     * <note>
     * <p>
     * Updating this trusted token issuer configuration might cause users to lose access to any applications that are
     * configured to use the trusted token issuer.
     * </p>
     * </note>
     * 
     * @param updateTrustedTokenIssuerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrustedTokenIssuer operation returned by the service.
     * @sample AWSSSOAdminAsyncHandler.UpdateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrustedTokenIssuerResult> updateTrustedTokenIssuerAsync(UpdateTrustedTokenIssuerRequest updateTrustedTokenIssuerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrustedTokenIssuerRequest, UpdateTrustedTokenIssuerResult> asyncHandler);

}

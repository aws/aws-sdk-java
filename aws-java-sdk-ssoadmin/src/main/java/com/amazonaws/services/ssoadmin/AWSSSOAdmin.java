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
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @return Result of the AttachManagedPolicyToPermissionSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @return Result of the CreateAccountAssignment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Creates an application in IAM Identity Center for the given application provider.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Grant application access to a user or group.
     * </p>
     * 
     * @param createApplicationAssignmentRequest
     * @return Result of the CreateApplicationAssignment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationAssignmentResult createApplicationAssignment(CreateApplicationAssignmentRequest createApplicationAssignmentRequest);

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
     * @return Result of the CreateInstance operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest);

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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * To grant users and groups access to Amazon Web Services account resources, use
     * <code> <a>CreateAccountAssignment</a> </code>.
     * </p>
     * </note>
     * 
     * @param createPermissionSetRequest
     * @return Result of the CreatePermissionSet operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @return Result of the CreateTrustedTokenIssuer operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.CreateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTrustedTokenIssuerResult createTrustedTokenIssuer(CreateTrustedTokenIssuerRequest createTrustedTokenIssuerRequest);

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
     * @return Result of the DeleteAccountAssignment operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Deletes the association with the application. The connected service resource still exists.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an IAM Identity Center access scope from an application.
     * </p>
     * 
     * @param deleteApplicationAccessScopeRequest
     * @return Result of the DeleteApplicationAccessScope operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationAccessScopeResult deleteApplicationAccessScope(DeleteApplicationAccessScopeRequest deleteApplicationAccessScopeRequest);

    /**
     * <p>
     * Revoke application access to an application by deleting application assignments for a user or group.
     * </p>
     * 
     * @param deleteApplicationAssignmentRequest
     * @return Result of the DeleteApplicationAssignment operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationAssignmentResult deleteApplicationAssignment(DeleteApplicationAssignmentRequest deleteApplicationAssignmentRequest);

    /**
     * <p>
     * Deletes an authentication method from an application.
     * </p>
     * 
     * @param deleteApplicationAuthenticationMethodRequest
     * @return Result of the DeleteApplicationAuthenticationMethod operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationAuthenticationMethodResult deleteApplicationAuthenticationMethod(
            DeleteApplicationAuthenticationMethodRequest deleteApplicationAuthenticationMethodRequest);

    /**
     * <p>
     * Deletes a grant from an application.
     * </p>
     * 
     * @param deleteApplicationGrantRequest
     * @return Result of the DeleteApplicationGrant operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteApplicationGrant"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationGrantResult deleteApplicationGrant(DeleteApplicationGrantRequest deleteApplicationGrantRequest);

    /**
     * <p>
     * Deletes the inline policy from a specified permission set.
     * </p>
     * 
     * @param deleteInlinePolicyFromPermissionSetRequest
     * @return Result of the DeleteInlinePolicyFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Deletes the instance of IAM Identity Center. Only the account that owns the instance can call this API. Neither
     * the delegated administrator nor member account can delete the organization instance, but those roles can delete
     * their own instance.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest);

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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeletePermissionsBoundaryFromPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeletePermissionsBoundaryFromPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePermissionsBoundaryFromPermissionSetResult deletePermissionsBoundaryFromPermissionSet(
            DeletePermissionsBoundaryFromPermissionSetRequest deletePermissionsBoundaryFromPermissionSetRequest);

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
     * @return Result of the DeleteTrustedTokenIssuer operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.DeleteTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DeleteTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteTrustedTokenIssuerResult deleteTrustedTokenIssuer(DeleteTrustedTokenIssuerRequest deleteTrustedTokenIssuerRequest);

    /**
     * <p>
     * Describes the status of the assignment creation request.
     * </p>
     * 
     * @param describeAccountAssignmentCreationStatusRequest
     * @return Result of the DescribeAccountAssignmentCreationStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeAccountAssignmentDeletionStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAccountAssignmentDeletionStatusResult describeAccountAssignmentDeletionStatus(
            DescribeAccountAssignmentDeletionStatusRequest describeAccountAssignmentDeletionStatusRequest);

    /**
     * <p>
     * Retrieves the details of an application associated with an instance of IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeApplicationResult describeApplication(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Retrieves a direct assignment of a user or group to an application. If the user doesn’t have a direct assignment
     * to the application, the user may still have access to the application through a group. Therefore, don’t use this
     * API to test access to an application for a user. Instead use <a>ListApplicationAssignmentsForPrincipal</a>.
     * </p>
     * 
     * @param describeApplicationAssignmentRequest
     * @return Result of the DescribeApplicationAssignment operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeApplicationAssignment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationAssignment"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationAssignmentResult describeApplicationAssignment(DescribeApplicationAssignmentRequest describeApplicationAssignmentRequest);

    /**
     * <p>
     * Retrieves details about a provider that can be used to connect an Amazon Web Services managed application or
     * customer managed application to IAM Identity Center.
     * </p>
     * 
     * @param describeApplicationProviderRequest
     * @return Result of the DescribeApplicationProvider operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeApplicationProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationProvider"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationProviderResult describeApplicationProvider(DescribeApplicationProviderRequest describeApplicationProviderRequest);

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
     * @return Result of the DescribeInstance operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstance" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstanceResult describeInstance(DescribeInstanceRequest describeInstanceRequest);

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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribePermissionSetProvisioningStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribePermissionSetProvisioningStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePermissionSetProvisioningStatusResult describePermissionSetProvisioningStatus(
            DescribePermissionSetProvisioningStatusRequest describePermissionSetProvisioningStatusRequest);

    /**
     * <p>
     * Retrieves details about a trusted token issuer configuration stored in an instance of IAM Identity Center.
     * Details include the name of the trusted token issuer, the issuer URL, and the path of the source attribute and
     * the destination attribute for a trusted token issuer configuration.
     * </p>
     * 
     * @param describeTrustedTokenIssuerRequest
     * @return Result of the DescribeTrustedTokenIssuer operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.DescribeTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrustedTokenIssuerResult describeTrustedTokenIssuer(DescribeTrustedTokenIssuerRequest describeTrustedTokenIssuerRequest);

    /**
     * <p>
     * Detaches the specified customer managed policy from the specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param detachCustomerManagedPolicyReferenceFromPermissionSetRequest
     * @return Result of the DetachCustomerManagedPolicyReferenceFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Detaches the attached Amazon Web Services managed policy ARN from the specified permission set.
     * </p>
     * 
     * @param detachManagedPolicyFromPermissionSetRequest
     * @return Result of the DetachManagedPolicyFromPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Retrieves the authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param getApplicationAccessScopeRequest
     * @return Result of the GetApplicationAccessScope operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationAccessScopeResult getApplicationAccessScope(GetApplicationAccessScopeRequest getApplicationAccessScopeRequest);

    /**
     * <p>
     * Retrieves the configuration of <a>PutApplicationAssignmentConfiguration</a>.
     * </p>
     * 
     * @param getApplicationAssignmentConfigurationRequest
     * @return Result of the GetApplicationAssignmentConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationAssignmentConfigurationResult getApplicationAssignmentConfiguration(
            GetApplicationAssignmentConfigurationRequest getApplicationAssignmentConfigurationRequest);

    /**
     * <p>
     * Retrieves details about an authentication method used by an application.
     * </p>
     * 
     * @param getApplicationAuthenticationMethodRequest
     * @return Result of the GetApplicationAuthenticationMethod operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationAuthenticationMethodResult getApplicationAuthenticationMethod(
            GetApplicationAuthenticationMethodRequest getApplicationAuthenticationMethodRequest);

    /**
     * <p>
     * Retrieves details about an application grant.
     * </p>
     * 
     * @param getApplicationGrantRequest
     * @return Result of the GetApplicationGrant operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    GetApplicationGrantResult getApplicationGrant(GetApplicationGrantRequest getApplicationGrantRequest);

    /**
     * <p>
     * Obtains the inline policy assigned to the permission set.
     * </p>
     * 
     * @param getInlinePolicyForPermissionSetRequest
     * @return Result of the GetInlinePolicyForPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.GetPermissionsBoundaryForPermissionSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetPermissionsBoundaryForPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetPermissionsBoundaryForPermissionSetResult getPermissionsBoundaryForPermissionSet(
            GetPermissionsBoundaryForPermissionSetRequest getPermissionsBoundaryForPermissionSetRequest);

    /**
     * <p>
     * Lists the status of the Amazon Web Services account assignment creation requests for a specified IAM Identity
     * Center instance.
     * </p>
     * 
     * @param listAccountAssignmentCreationStatusRequest
     * @return Result of the ListAccountAssignmentCreationStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignmentCreationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentCreationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentCreationStatusResult listAccountAssignmentCreationStatus(
            ListAccountAssignmentCreationStatusRequest listAccountAssignmentCreationStatusRequest);

    /**
     * <p>
     * Lists the status of the Amazon Web Services account assignment deletion requests for a specified IAM Identity
     * Center instance.
     * </p>
     * 
     * @param listAccountAssignmentDeletionStatusRequest
     * @return Result of the ListAccountAssignmentDeletionStatus operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignmentDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentDeletionStatusResult listAccountAssignmentDeletionStatus(
            ListAccountAssignmentDeletionStatusRequest listAccountAssignmentDeletionStatusRequest);

    /**
     * <p>
     * Lists the assignee of the specified Amazon Web Services account with the specified permission set.
     * </p>
     * 
     * @param listAccountAssignmentsRequest
     * @return Result of the ListAccountAssignments operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentsResult listAccountAssignments(ListAccountAssignmentsRequest listAccountAssignmentsRequest);

    /**
     * <p>
     * Retrieves a list of the IAM Identity Center associated Amazon Web Services accounts that the principal has access
     * to.
     * </p>
     * 
     * @param listAccountAssignmentsForPrincipalRequest
     * @return Result of the ListAccountAssignmentsForPrincipal operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountAssignmentsForPrincipalResult listAccountAssignmentsForPrincipal(
            ListAccountAssignmentsForPrincipalRequest listAccountAssignmentsForPrincipalRequest);

    /**
     * <p>
     * Lists all the Amazon Web Services accounts where the specified permission set is provisioned.
     * </p>
     * 
     * @param listAccountsForProvisionedPermissionSetRequest
     * @return Result of the ListAccountsForProvisionedPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListAccountsForProvisionedPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountsForProvisionedPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountsForProvisionedPermissionSetResult listAccountsForProvisionedPermissionSet(
            ListAccountsForProvisionedPermissionSetRequest listAccountsForProvisionedPermissionSetRequest);

    /**
     * <p>
     * Lists the access scopes and authorized targets associated with an application.
     * </p>
     * 
     * @param listApplicationAccessScopesRequest
     * @return Result of the ListApplicationAccessScopes operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAccessScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAccessScopes"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationAccessScopesResult listApplicationAccessScopes(ListApplicationAccessScopesRequest listApplicationAccessScopesRequest);

    /**
     * <p>
     * Lists Amazon Web Services account users that are assigned to an application.
     * </p>
     * 
     * @param listApplicationAssignmentsRequest
     * @return Result of the ListApplicationAssignments operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAssignments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignments"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationAssignmentsResult listApplicationAssignments(ListApplicationAssignmentsRequest listApplicationAssignmentsRequest);

    /**
     * <p>
     * Lists the applications to which a specified principal is assigned.
     * </p>
     * 
     * @param listApplicationAssignmentsForPrincipalRequest
     * @return Result of the ListApplicationAssignmentsForPrincipal operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAssignmentsForPrincipal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignmentsForPrincipal"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationAssignmentsForPrincipalResult listApplicationAssignmentsForPrincipal(
            ListApplicationAssignmentsForPrincipalRequest listApplicationAssignmentsForPrincipalRequest);

    /**
     * <p>
     * Lists all of the authentication methods supported by the specified application.
     * </p>
     * 
     * @param listApplicationAuthenticationMethodsRequest
     * @return Result of the ListApplicationAuthenticationMethods operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationAuthenticationMethods
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAuthenticationMethods"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationAuthenticationMethodsResult listApplicationAuthenticationMethods(
            ListApplicationAuthenticationMethodsRequest listApplicationAuthenticationMethodsRequest);

    /**
     * <p>
     * List the grants associated with an application.
     * </p>
     * 
     * @param listApplicationGrantsRequest
     * @return Result of the ListApplicationGrants operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationGrants"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationGrantsResult listApplicationGrants(ListApplicationGrantsRequest listApplicationGrantsRequest);

    /**
     * <p>
     * Lists the application providers configured in the IAM Identity Center identity store.
     * </p>
     * 
     * @param listApplicationProvidersRequest
     * @return Result of the ListApplicationProviders operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplicationProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationProviders"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationProvidersResult listApplicationProviders(ListApplicationProvidersRequest listApplicationProvidersRequest);

    /**
     * <p>
     * Lists all applications associated with the instance of IAM Identity Center. When listing applications for an
     * instance in the management account, member accounts must use the <code>applicationAccount</code> parameter to
     * filter the list to only applications created from that account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists all customer managed policies attached to a specified <a>PermissionSet</a>.
     * </p>
     * 
     * @param listCustomerManagedPolicyReferencesInPermissionSetRequest
     * @return Result of the ListCustomerManagedPolicyReferencesInPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListCustomerManagedPolicyReferencesInPermissionSet
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListCustomerManagedPolicyReferencesInPermissionSet"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomerManagedPolicyReferencesInPermissionSetResult listCustomerManagedPolicyReferencesInPermissionSet(
            ListCustomerManagedPolicyReferencesInPermissionSetRequest listCustomerManagedPolicyReferencesInPermissionSetRequest);

    /**
     * <p>
     * Lists the details of the organization and account instances of IAM Identity Center that were created in or
     * visible to the account calling this API.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
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
     * Lists the Amazon Web Services managed policy that is attached to a specified permission set.
     * </p>
     * 
     * @param listManagedPoliciesInPermissionSetRequest
     * @return Result of the ListManagedPoliciesInPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListPermissionSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListPermissionSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListPermissionSetsResult listPermissionSets(ListPermissionSetsRequest listPermissionSetsRequest);

    /**
     * <p>
     * Lists all the permission sets that are provisioned to a specified Amazon Web Services account.
     * </p>
     * 
     * @param listPermissionSetsProvisionedToAccountRequest
     * @return Result of the ListPermissionSetsProvisionedToAccount operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all the trusted token issuers configured in an instance of IAM Identity Center.
     * </p>
     * 
     * @param listTrustedTokenIssuersRequest
     * @return Result of the ListTrustedTokenIssuers operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @sample AWSSSOAdmin.ListTrustedTokenIssuers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTrustedTokenIssuers"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrustedTokenIssuersResult listTrustedTokenIssuers(ListTrustedTokenIssuersRequest listTrustedTokenIssuersRequest);

    /**
     * <p>
     * The process by which a specified permission set is provisioned to the specified target.
     * </p>
     * 
     * @param provisionPermissionSetRequest
     * @return Result of the ProvisionPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Adds or updates the list of authorized targets for an IAM Identity Center access scope for an application.
     * </p>
     * 
     * @param putApplicationAccessScopeRequest
     * @return Result of the PutApplicationAccessScope operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationAccessScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAccessScope"
     *      target="_top">AWS API Documentation</a>
     */
    PutApplicationAccessScopeResult putApplicationAccessScope(PutApplicationAccessScopeRequest putApplicationAccessScopeRequest);

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
     * @return Result of the PutApplicationAssignmentConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationAssignmentConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAssignmentConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutApplicationAssignmentConfigurationResult putApplicationAssignmentConfiguration(
            PutApplicationAssignmentConfigurationRequest putApplicationAssignmentConfigurationRequest);

    /**
     * <p>
     * Adds or updates an authentication method for an application.
     * </p>
     * 
     * @param putApplicationAuthenticationMethodRequest
     * @return Result of the PutApplicationAuthenticationMethod operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationAuthenticationMethod
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationAuthenticationMethod"
     *      target="_top">AWS API Documentation</a>
     */
    PutApplicationAuthenticationMethodResult putApplicationAuthenticationMethod(
            PutApplicationAuthenticationMethodRequest putApplicationAuthenticationMethodRequest);

    /**
     * <p>
     * Adds a grant to an application.
     * </p>
     * 
     * @param putApplicationGrantRequest
     * @return Result of the PutApplicationGrant operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.PutApplicationGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/PutApplicationGrant" target="_top">AWS
     *      API Documentation</a>
     */
    PutApplicationGrantResult putApplicationGrant(PutApplicationGrantRequest putApplicationGrantRequest);

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
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Attaches an Amazon Web Services managed or customer managed policy to the specified <a>PermissionSet</a> as a
     * permissions boundary.
     * </p>
     * 
     * @param putPermissionsBoundaryToPermissionSetRequest
     * @return Result of the PutPermissionsBoundaryToPermissionSet operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ServiceQuotaExceededException
     *         Indicates that the principal has crossed the permitted number of resources that can be created.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * Updates application properties.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Update the details for the instance of IAM Identity Center that is owned by the Amazon Web Services account.
     * </p>
     * 
     * @param updateInstanceRequest
     * @return Result of the UpdateInstance operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateInstanceResult updateInstance(UpdateInstanceRequest updateInstanceRequest);

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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
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
     * @return Result of the UpdateTrustedTokenIssuer operation returned by the service.
     * @throws ThrottlingException
     *         Indicates that the principal has crossed the throttling limits of the API operations.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure with an internal
     *         server.
     * @throws ResourceNotFoundException
     *         Indicates that a requested resource is not found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request failed because it contains a syntax error.
     * @throws ConflictException
     *         Occurs when a conflict with a previous successful write is detected. This generally occurs when the
     *         previous write did not have time to propagate to the host serving the current request. A retry (with
     *         appropriate backoff logic) is the recommended response to this exception.
     * @sample AWSSSOAdmin.UpdateTrustedTokenIssuer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/UpdateTrustedTokenIssuer"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTrustedTokenIssuerResult updateTrustedTokenIssuer(UpdateTrustedTokenIssuerRequest updateTrustedTokenIssuerRequest);

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

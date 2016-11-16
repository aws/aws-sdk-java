/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters;

/**
 * Interface for accessing IAM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.identitymanagement.AbstractAmazonIdentityManagement} instead.
 * </p>
 * <p>
 * <fullname>AWS Identity and Access Management</fullname>
 * <p>
 * AWS Identity and Access Management (IAM) is a web service that you can use to manage users and user permissions under
 * your AWS account. This guide provides descriptions of IAM actions that you can call programmatically. For general
 * information about IAM, see <a href="http://aws.amazon.com/iam/">AWS Identity and Access Management (IAM)</a>. For the
 * user guide for IAM, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/">Using IAM</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
 * Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to IAM and AWS. For
 * example, the SDKs take care of tasks such as cryptographically signing requests (see below), managing errors, and
 * retrying requests automatically. For information about the AWS SDKs, including how to download and install them, see
 * the <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a> page.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to IAM. However, you can also use the IAM Query
 * API to make direct calls to the IAM web service. To learn more about the IAM Query API, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
 * <i>Using IAM</i> guide. IAM supports GET and POST requests for all actions. That is, the API does not require you to
 * use GET for some actions and POST for others. However, GET requests are subject to the limitation size of a URL.
 * Therefore, for operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed using an access key ID and a secret access key. We strongly recommend that you do not use
 * your AWS account access key ID and secret access key for everyday work with IAM. You can use the access key ID and
 * secret access key for an IAM user or you can use the AWS Security Token Service to generate temporary security
 * credentials and use those to sign requests.
 * </p>
 * <p>
 * To sign requests, we recommend that you use <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>. If you have an
 * existing application that uses Signature Version 2, you do not have to update it to use Signature Version 4. However,
 * some operations now require Signature Version 4. The documentation for operations that require version 4 indicate
 * this requirement.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html">AWS Security Credentials</a>.
 * This topic provides general information about the types of credentials used for accessing AWS.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html">IAM Best Practices</a>. This topic
 * presents a list of suggestions for using the IAM service to help secure your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a>.
 * This set of topics walk you through the process of signing a request using an access key ID and secret access key.
 * </p>
 * </li>
 * </ul>
 */
public interface AmazonIdentityManagement {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iam";

    /**
     * Overrides the default endpoint for this client ("iam.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "iam.amazonaws.com") or a full URL, including the protocol (ex:
     * "iam.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "iam.amazonaws.com") or a full URL, including the protocol (ex: "iam.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonIdentityManagement#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM
     * OpenID Connect (OIDC) provider resource.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you add an existing client ID to the provider.
     * </p>
     * 
     * @param addClientIDToOpenIDConnectProviderRequest
     * @return Result of the AddClientIDToOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddClientIDToOpenIDConnectProvider
     */
    AddClientIDToOpenIDConnectProviderResult addClientIDToOpenIDConnectProvider(
            AddClientIDToOpenIDConnectProviderRequest addClientIDToOpenIDConnectProviderRequest);

    /**
     * <p>
     * Adds the specified IAM role to the specified instance profile.
     * </p>
     * <note>
     * <p>
     * The caller of this API must be granted the <code>PassRole</code> permission on the IAM role by a permission
     * policy.
     * </p>
     * </note>
     * <p>
     * For more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For more
     * information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param addRoleToInstanceProfileRequest
     * @return Result of the AddRoleToInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddRoleToInstanceProfile
     */
    AddRoleToInstanceProfileResult addRoleToInstanceProfile(AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest);

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * 
     * @param addUserToGroupRequest
     * @return Result of the AddUserToGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AddUserToGroup
     */
    AddUserToGroupResult addUserToGroup(AddUserToGroupRequest addUserToGroupRequest);

    /**
     * <p>
     * Attaches the specified managed policy to the specified IAM group.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a group. To embed an inline policy in a group, use
     * <a>PutGroupPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachGroupPolicyRequest
     * @return Result of the AttachGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachGroupPolicy
     */
    AttachGroupPolicyResult attachGroupPolicy(AttachGroupPolicyRequest attachGroupPolicyRequest);

    /**
     * <p>
     * Attaches the specified managed policy to the specified IAM role.
     * </p>
     * <p>
     * When you attach a managed policy to a role, the managed policy becomes part of the role's permission (access)
     * policy. You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the
     * same time as the role, using <a>CreateRole</a>. You can update a role's trust policy using
     * <a>UpdateAssumeRolePolicy</a>.
     * </p>
     * <p>
     * Use this API to attach a <i>managed</i> policy to a role. To embed an inline policy in a role, use
     * <a>PutRolePolicy</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachRolePolicyRequest
     * @return Result of the AttachRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachRolePolicy
     */
    AttachRolePolicyResult attachRolePolicy(AttachRolePolicyRequest attachRolePolicyRequest);

    /**
     * <p>
     * Attaches the specified managed policy to the specified user.
     * </p>
     * <p>
     * You use this API to attach a <i>managed</i> policy to a user. To embed an inline policy in a user, use
     * <a>PutUserPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachUserPolicyRequest
     * @return Result of the AttachUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.AttachUserPolicy
     */
    AttachUserPolicyResult attachUserPolicy(AttachUserPolicyRequest attachUserPolicyRequest);

    /**
     * <p>
     * Changes the password of the IAM user who is calling this action. The root account password is not affected by
     * this action.
     * </p>
     * <p>
     * To change the password for a different user, see <a>UpdateLoginProfile</a>. For more information about modifying
     * passwords, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing
     * Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param changePasswordRequest
     * @return Result of the ChangePassword operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidUserTypeException
     *         The request was rejected because the type of user for the transaction was incorrect.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ChangePassword
     */
    ChangePasswordResult changePassword(ChangePasswordRequest changePasswordRequest);

    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default
     * status for new keys is <code>Active</code>.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
     * the request. Because this action works for access keys under the AWS account, you can use this action to manage
     * root credentials even if the AWS account has no associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * To ensure the security of your AWS account, the secret access key is accessible only during key and user
     * creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a
     * secret key is lost, you can delete the access keys for the associated user and then create new keys.
     * </p>
     * </important>
     * 
     * @param createAccessKeyRequest
     * @return Result of the CreateAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateAccessKey
     */
    CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest createAccessKeyRequest);

    /**
     * Simplified method form for invoking the CreateAccessKey operation.
     *
     * @see #createAccessKey(CreateAccessKeyRequest)
     */
    CreateAccessKeyResult createAccessKey();

    /**
     * <p>
     * Creates an alias for your AWS account. For information about using an AWS account alias, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
     * ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createAccountAliasRequest
     * @return Result of the CreateAccountAlias operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateAccountAlias
     */
    CreateAccountAliasResult createAccountAlias(CreateAccountAliasRequest createAccountAliasRequest);

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createGroupRequest
     * @return Result of the CreateGroup operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateGroup
     */
    CreateGroupResult createGroup(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a new instance profile. For information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * For information about the number of instance profiles you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return Result of the CreateInstanceProfile operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateInstanceProfile
     */
    CreateInstanceProfileResult createInstanceProfile(CreateInstanceProfileRequest createInstanceProfileRequest);

    /**
     * <p>
     * Creates a password for the specified user, giving the user the ability to access AWS services through the AWS
     * Management Console. For more information about managing passwords, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing Passwords</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createLoginProfileRequest
     * @return Result of the CreateLoginProfile operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateLoginProfile
     */
    CreateLoginProfileResult createLoginProfile(CreateLoginProfileRequest createLoginProfileRequest);

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that supports <a
     * href="http://openid.net/connect/">OpenID Connect (OIDC)</a>.
     * </p>
     * <p>
     * The OIDC provider that you create with this operation can be used as a principal in a role's trust policy to
     * establish a trust relationship between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the URL of the OIDC identity provider (IdP) to trust, a list
     * of client IDs (also known as audiences) that identify the application or applications that are allowed to
     * authenticate using the OIDC provider, and a list of thumbprints of the server certificate(s) that the IdP uses.
     * You get all of this information from the OIDC IdP that you want to use for access to AWS.
     * </p>
     * <note>
     * <p>
     * Because trust for the OIDC provider is ultimately derived from the IAM provider that this action creates, it is a
     * best practice to limit access to the <a>CreateOpenIDConnectProvider</a> action to highly-privileged users.
     * </p>
     * </note>
     * 
     * @param createOpenIDConnectProviderRequest
     * @return Result of the CreateOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateOpenIDConnectProvider
     */
    CreateOpenIDConnectProviderResult createOpenIDConnectProvider(CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest);

    /**
     * <p>
     * Creates a new managed policy for your AWS account.
     * </p>
     * <p>
     * This operation creates a policy version with a version identifier of <code>v1</code> and sets v1 as the policy's
     * default version. For more information about policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policies in general, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyRequest
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreatePolicy
     */
    CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates a new version of the specified managed policy. To update a managed policy, you create a new policy
     * version. A managed policy can have up to five versions. If the policy has five versions, you must delete an
     * existing version using <a>DeletePolicyVersion</a> before you create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version. The default version is the version that
     * is in effect for the IAM users, groups, and roles to which the policy is attached.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyVersionRequest
     * @return Result of the CreatePolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreatePolicyVersion
     */
    CreatePolicyVersionResult createPolicyVersion(CreatePolicyVersionRequest createPolicyVersionRequest);

    /**
     * <p>
     * Creates a new role for your AWS account. For more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For
     * information about limitations on role names and the number of roles you can create, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createRoleRequest
     * @return Result of the CreateRole operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateRole
     */
    CreateRoleResult createRole(CreateRoleRequest createRoleRequest);

    /**
     * <p>
     * Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.
     * </p>
     * <p>
     * The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust
     * policy to enable federated users who sign-in using the SAML IdP to assume the role. You can create an IAM role
     * that supports Web-based single sign-on (SSO) to the AWS Management Console or one that supports API access to
     * AWS.
     * </p>
     * <p>
     * When you create the SAML provider resource, you upload an a SAML metadata document that you get from your IdP and
     * that includes the issuer's name, expiration information, and keys that can be used to validate the SAML
     * authentication response (assertions) that the IdP sends. You must generate the metadata document using the
     * identity management software that is used as your organization's IdP.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html">Enabling SAML
     * 2.0 Federated Users to Access the AWS Management Console</a> and <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html">About SAML 2.0-based
     * Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createSAMLProviderRequest
     * @return Result of the CreateSAMLProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateSAMLProvider
     */
    CreateSAMLProviderResult createSAMLProvider(CreateSAMLProviderRequest createSAMLProviderRequest);

    /**
     * <p>
     * Creates a new IAM user for your AWS account.
     * </p>
     * <p>
     * For information about limitations on the number of IAM users you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateUser
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use <a>EnableMFADevice</a>
     * to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA
     * devices, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual
     * MFA Device</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can create, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on Entities</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * The seed information contained in the QR code and the Base32 string should be treated like any other secret
     * access information, such as your AWS access keys or your passwords. After you provision your virtual device, you
     * should ensure that the information is destroyed following secure procedures.
     * </p>
     * </important>
     * 
     * @param createVirtualMFADeviceRequest
     * @return Result of the CreateVirtualMFADevice operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.CreateVirtualMFADevice
     */
    CreateVirtualMFADeviceResult createVirtualMFADevice(CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest);

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association with the user name for which it was
     * originally enabled.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual MFA Device</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deactivateMFADeviceRequest
     * @return Result of the DeactivateMFADevice operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeactivateMFADevice
     */
    DeactivateMFADeviceResult deactivateMFADevice(DeactivateMFADeviceRequest deactivateMFADeviceRequest);

    /**
     * <p>
     * Deletes the access key pair associated with the specified IAM user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
     * the request. Because this action works for access keys under the AWS account, you can use this action to manage
     * root credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param deleteAccessKeyRequest
     * @return Result of the DeleteAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccessKey
     */
    DeleteAccessKeyResult deleteAccessKey(DeleteAccessKeyRequest deleteAccessKeyRequest);

    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using an AWS account alias, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using an Alias for Your AWS Account
     * ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @return Result of the DeleteAccountAlias operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccountAlias
     */
    DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest deleteAccountAliasRequest);

    /**
     * <p>
     * Deletes the password policy for the AWS account. There are no parameters.
     * </p>
     * 
     * @param deleteAccountPasswordPolicyRequest
     * @return Result of the DeleteAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteAccountPasswordPolicy
     */
    DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest);

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy operation.
     *
     * @see #deleteAccountPasswordPolicy(DeleteAccountPasswordPolicyRequest)
     */
    DeleteAccountPasswordPolicyResult deleteAccountPasswordPolicy();

    /**
     * <p>
     * Deletes the specified IAM group. The group must not contain any users or have any attached policies.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteGroup
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To detach a managed policy from a group, use
     * <a>DetachGroupPolicy</a>. For more information about policies, refer to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteGroupPolicyRequest
     * @return Result of the DeleteGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteGroupPolicy
     */
    DeleteGroupPolicyResult deleteGroupPolicy(DeleteGroupPolicyRequest deleteGroupPolicyRequest);

    /**
     * <p>
     * Deletes the specified instance profile. The instance profile must not have an associated role.
     * </p>
     * <important>
     * <p>
     * Make sure you do not have any Amazon EC2 instances running with the instance profile you are about to delete.
     * Deleting a role or instance profile that is associated with a running instance will break any applications
     * running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @return Result of the DeleteInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteInstanceProfile
     */
    DeleteInstanceProfileResult deleteInstanceProfile(DeleteInstanceProfileRequest deleteInstanceProfileRequest);

    /**
     * <p>
     * Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services
     * through the AWS Management Console.
     * </p>
     * <important>
     * <p>
     * Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the
     * API. To prevent all user access you must also either make any access keys inactive or delete them. For more
     * information about making keys inactive or deleting them, see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>.
     * </p>
     * </important>
     * 
     * @param deleteLoginProfileRequest
     * @return Result of the DeleteLoginProfile operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteLoginProfile
     */
    DeleteLoginProfileResult deleteLoginProfile(DeleteLoginProfileRequest deleteLoginProfileRequest);

    /**
     * <p>
     * Deletes an OpenID Connect identity provider (IdP) resource object in IAM.
     * </p>
     * <p>
     * Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in
     * their trust policies. Any attempt to assume a role that references a deleted provider fails.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you call the action for a provider that does
     * not exist.
     * </p>
     * 
     * @param deleteOpenIDConnectProviderRequest
     * @return Result of the DeleteOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteOpenIDConnectProvider
     */
    DeleteOpenIDConnectProviderResult deleteOpenIDConnectProvider(DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest);

    /**
     * <p>
     * Deletes the specified managed policy.
     * </p>
     * <p>
     * Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that
     * it is attached to, and you must delete all of the policy's versions. The following steps describe the process for
     * deleting a managed policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Detach the policy from all users, groups, and roles that the policy is attached to, using the
     * <a>DetachUserPolicy</a>, <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a> APIs. To list all the users,
     * groups, and roles that a policy is attached to, use <a>ListEntitiesForPolicy</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete all versions of the policy using <a>DeletePolicyVersion</a>. To list the policy's versions, use
     * <a>ListPolicyVersions</a>. You cannot use <a>DeletePolicyVersion</a> to delete the version that is marked as the
     * default version. You delete the policy's default version in the next step of the process.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete the policy (this automatically deletes the policy's default version) using this API.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeletePolicy
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified version from the specified managed policy.
     * </p>
     * <p>
     * You cannot delete the default version from a policy using this API. To delete the default version from a policy,
     * use <a>DeletePolicy</a>. To find out which version of a policy is marked as the default version, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * For information about versions for managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     * @return Result of the DeletePolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeletePolicyVersion
     */
    DeletePolicyVersionResult deletePolicyVersion(DeletePolicyVersionRequest deletePolicyVersionRequest);

    /**
     * <p>
     * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to
     * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <important>
     * <p>
     * Make sure you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role
     * or instance profile that is associated with a running instance will break any applications running on the
     * instance.
     * </p>
     * </important>
     * 
     * @param deleteRoleRequest
     * @return Result of the DeleteRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRole
     */
    DeleteRoleResult deleteRole(DeleteRoleRequest deleteRoleRequest);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To detach a managed policy from a role, use
     * <a>DetachRolePolicy</a>. For more information about policies, refer to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteRolePolicyRequest
     * @return Result of the DeleteRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteRolePolicy
     */
    DeleteRolePolicyResult deleteRolePolicy(DeleteRolePolicyRequest deleteRolePolicyRequest);

    /**
     * <p>
     * Deletes a SAML provider resource in IAM.
     * </p>
     * <p>
     * Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN
     * as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider
     * resource ARN fails.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param deleteSAMLProviderRequest
     * @return Result of the DeleteSAMLProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteSAMLProvider
     */
    DeleteSAMLProviderResult deleteSAMLProvider(DeleteSAMLProviderRequest deleteSAMLProviderRequest);

    /**
     * <p>
     * Deletes the specified SSH public key.
     * </p>
     * <p>
     * The SSH public key deleted by this action is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param deleteSSHPublicKeyRequest
     * @return Result of the DeleteSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.DeleteSSHPublicKey
     */
    DeleteSSHPublicKeyResult deleteSSHPublicKey(DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest);

    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have
     * implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates,
     * it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We
     * recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command
     * to delete the certificate. For more information, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html"
     * >DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API Reference</i>.
     * </p>
     * </important>
     * 
     * @param deleteServerCertificateRequest
     * @return Result of the DeleteServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteServerCertificate
     */
    DeleteServerCertificateResult deleteServerCertificate(DeleteServerCertificateRequest deleteServerCertificateRequest);

    /**
     * <p>
     * Deletes a signing certificate associated with the specified IAM user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
     * the request. Because this action works for access keys under the AWS account, you can use this action to manage
     * root credentials even if the AWS account has no associated IAM users.
     * </p>
     * 
     * @param deleteSigningCertificateRequest
     * @return Result of the DeleteSigningCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteSigningCertificate
     */
    DeleteSigningCertificateResult deleteSigningCertificate(DeleteSigningCertificateRequest deleteSigningCertificateRequest);

    /**
     * <p>
     * Deletes the specified IAM user. The user must not belong to any groups or have any access keys, signing
     * certificates, or attached policies.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUser
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified IAM user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To detach a managed policy from a user, use
     * <a>DetachUserPolicy</a>. For more information about policies, refer to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteUserPolicyRequest
     * @return Result of the DeleteUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteUserPolicy
     */
    DeleteUserPolicyResult deleteUserPolicy(DeleteUserPolicyRequest deleteUserPolicyRequest);

    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <note>
     * <p>
     * You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA
     * devices, see <a>DeactivateMFADevice</a>.
     * </p>
     * </note>
     * 
     * @param deleteVirtualMFADeviceRequest
     * @return Result of the DeleteVirtualMFADevice operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws DeleteConflictException
     *         The request was rejected because it attempted to delete a resource that has attached subordinate
     *         entities. The error message describes these entities.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DeleteVirtualMFADevice
     */
    DeleteVirtualMFADeviceResult deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest);

    /**
     * <p>
     * Removes the specified managed policy from the specified IAM group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To delete an inline policy, use the
     * <a>DeleteGroupPolicy</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachGroupPolicyRequest
     * @return Result of the DetachGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachGroupPolicy
     */
    DetachGroupPolicyResult detachGroupPolicy(DetachGroupPolicyRequest detachGroupPolicyRequest);

    /**
     * <p>
     * Removes the specified managed policy from the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To delete an inline policy, use the
     * <a>DeleteRolePolicy</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachRolePolicyRequest
     * @return Result of the DetachRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachRolePolicy
     */
    DetachRolePolicyResult detachRolePolicy(DetachRolePolicyRequest detachRolePolicyRequest);

    /**
     * <p>
     * Removes the specified managed policy from the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To delete an inline policy, use the
     * <a>DeleteUserPolicy</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachUserPolicyRequest
     * @return Result of the DetachUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.DetachUserPolicy
     */
    DetachUserPolicyResult detachUserPolicy(DetachUserPolicyRequest detachUserPolicyRequest);

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is
     * required for every subsequent login by the IAM user associated with the device.
     * </p>
     * 
     * @param enableMFADeviceRequest
     * @return Result of the EnableMFADevice operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws InvalidAuthenticationCodeException
     *         The request was rejected because the authentication code was not recognized. The error message describes
     *         the specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.EnableMFADevice
     */
    EnableMFADeviceResult enableMFADevice(EnableMFADeviceRequest enableMFADeviceRequest);

    /**
     * <p>
     * Generates a credential report for the AWS account. For more information about the credential report, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param generateCredentialReportRequest
     * @return Result of the GenerateCredentialReport operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GenerateCredentialReport
     */
    GenerateCredentialReportResult generateCredentialReport(GenerateCredentialReportRequest generateCredentialReportRequest);

    /**
     * Simplified method form for invoking the GenerateCredentialReport operation.
     *
     * @see #generateCredentialReport(GenerateCredentialReportRequest)
     */
    GenerateCredentialReportResult generateCredentialReport();

    /**
     * <p>
     * Retrieves information about when the specified access key was last used. The information includes the date and
     * time of last use, along with the AWS service and region that were specified in the last request made with that
     * key.
     * </p>
     * 
     * @param getAccessKeyLastUsedRequest
     * @return Result of the GetAccessKeyLastUsed operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.GetAccessKeyLastUsed
     */
    GetAccessKeyLastUsedResult getAccessKeyLastUsed(GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest);

    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their
     * relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users,
     * groups, roles, and policies) in your account.
     * </p>
     * <p>
     * You can optionally filter the results using the <code>Filter</code> parameter. You can paginate the results using
     * the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getAccountAuthorizationDetailsRequest
     * @return Result of the GetAccountAuthorizationDetails operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountAuthorizationDetails
     */
    GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest);

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails operation.
     *
     * @see #getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest)
     */
    GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails();

    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more information about using a password policy, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html">Managing an IAM
     * Password Policy</a>.
     * </p>
     * 
     * @param getAccountPasswordPolicyRequest
     * @return Result of the GetAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountPasswordPolicy
     */
    GetAccountPasswordPolicyResult getAccountPasswordPolicy(GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest);

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy operation.
     *
     * @see #getAccountPasswordPolicy(GetAccountPasswordPolicyRequest)
     */
    GetAccountPasswordPolicyResult getAccountPasswordPolicy();

    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the AWS account.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getAccountSummaryRequest
     * @return Result of the GetAccountSummary operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetAccountSummary
     */
    GetAccountSummaryResult getAccountSummary(GetAccountSummaryRequest getAccountSummaryRequest);

    /**
     * Simplified method form for invoking the GetAccountSummary operation.
     *
     * @see #getAccountSummary(GetAccountSummaryRequest)
     */
    GetAccountSummaryResult getAccountSummary();

    /**
     * <p>
     * Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of
     * one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request, and can be evaluated by testing against a value specified in an IAM policy. Use
     * GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call
     * <a>SimulateCustomPolicy</a>. Note that all parameters are shown in unencoded form here for clarity, but must be
     * URL encoded to be included as a part of a real HTML request.
     * </p>
     * 
     * @param getContextKeysForCustomPolicyRequest
     * @return Result of the GetContextKeysForCustomPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetContextKeysForCustomPolicy
     */
    GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest);

    /**
     * <p>
     * Gets a list of all of the context keys referenced in all of the IAM policies attached to the specified IAM
     * entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all
     * of the policies attached to groups that the user is a member of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies, specified as strings. If you want to
     * include <i>only</i> a list of policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted to other users. If you do not want
     * users to see other user's permissions, then consider allowing them to use <a>GetContextKeysForCustomPolicy</a>
     * instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request, and can be evaluated by testing against a value in an IAM policy. Use
     * <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call
     * <a>SimulatePrincipalPolicy</a>.
     * </p>
     * 
     * @param getContextKeysForPrincipalPolicyRequest
     * @return Result of the GetContextKeysForPrincipalPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonIdentityManagement.GetContextKeysForPrincipalPolicy
     */
    GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest);

    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more information about the credential report, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting Credential Reports</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getCredentialReportRequest
     * @return Result of the GetCredentialReport operation returned by the service.
     * @throws CredentialReportNotPresentException
     *         The request was rejected because the credential report does not exist. To generate a credential report,
     *         use <a>GenerateCredentialReport</a>.
     * @throws CredentialReportExpiredException
     *         The request was rejected because the most recent credential report has expired. To generate a new
     *         credential report, use <a>GenerateCredentialReport</a>. For more information about credential report
     *         expiration, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html">Getting
     *         Credential Reports</a> in the <i>IAM User Guide</i>.
     * @throws CredentialReportNotReadyException
     *         The request was rejected because the credential report is still being generated.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetCredentialReport
     */
    GetCredentialReportResult getCredentialReport(GetCredentialReportRequest getCredentialReportRequest);

    /**
     * Simplified method form for invoking the GetCredentialReport operation.
     *
     * @see #getCredentialReport(GetCredentialReportRequest)
     */
    GetCredentialReportResult getCredentialReport();

    /**
     * <p>
     * Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetGroup
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the specified IAM group.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is
     * attached to a group, use <a>GetPolicy</a> to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getGroupPolicyRequest
     * @return Result of the GetGroupPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetGroupPolicy
     */
    GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest getGroupPolicyRequest);

    /**
     * <p>
     * Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and
     * role. For more information about instance profiles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return Result of the GetInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetInstanceProfile
     */
    GetInstanceProfileResult getInstanceProfile(GetInstanceProfileRequest getInstanceProfileRequest);

    /**
     * <p>
     * Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned
     * a password, the action returns a 404 (<code>NoSuchEntity</code>) error.
     * </p>
     * 
     * @param getLoginProfileRequest
     * @return Result of the GetLoginProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetLoginProfile
     */
    GetLoginProfileResult getLoginProfile(GetLoginProfileRequest getLoginProfileRequest);

    /**
     * <p>
     * Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.
     * </p>
     * 
     * @param getOpenIDConnectProviderRequest
     * @return Result of the GetOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetOpenIDConnectProvider
     */
    GetOpenIDConnectProviderResult getOpenIDConnectProvider(GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest);

    /**
     * <p>
     * Retrieves information about the specified managed policy, including the policy's default version and the total
     * number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific
     * users, groups, and roles that the policy is attached to, use the <a>ListEntitiesForPolicy</a> API. This API
     * returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy,
     * use <a>GetPolicyVersion</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve information about an inline policy that is
     * embedded with an IAM user, group, or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetPolicy
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Retrieves information about the specified version of the specified managed policy, including the policy document.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * To list the available versions for a policy, use <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve information about an inline policy that is
     * embedded in a user, group, or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or <a>GetRolePolicy</a>
     * API.
     * </p>
     * <p>
     * For more information about the types of policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyVersionRequest
     * @return Result of the GetPolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetPolicyVersion
     */
    GetPolicyVersionResult getPolicyVersion(GetPolicyVersionRequest getPolicyVersionRequest);

    /**
     * <p>
     * Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy
     * that grants permission to assume the role. For more information about roles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * 
     * @param getRoleRequest
     * @return Result of the GetRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetRole
     */
    GetRoleResult getRole(GetRoleRequest getRoleRequest);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded with the specified IAM role.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached
     * to a role, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about roles, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * 
     * @param getRolePolicyRequest
     * @return Result of the GetRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetRolePolicy
     */
    GetRolePolicyResult getRolePolicy(GetRolePolicyRequest getRolePolicyRequest);

    /**
     * <p>
     * Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created
     * or updated.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param getSAMLProviderRequest
     * @return Result of the GetSAMLProvider operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetSAMLProvider
     */
    GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest getSAMLProviderRequest);

    /**
     * <p>
     * Retrieves the specified SSH public key, including metadata about the key.
     * </p>
     * <p>
     * The SSH public key retrieved by this action is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param getSSHPublicKeyRequest
     * @return Result of the GetSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws UnrecognizedPublicKeyEncodingException
     *         The request was rejected because the public key encoding format is unsupported or unrecognized.
     * @sample AmazonIdentityManagement.GetSSHPublicKey
     */
    GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest getSSHPublicKeyRequest);

    /**
     * <p>
     * Retrieves information about the specified server certificate stored in IAM.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getServerCertificateRequest
     * @return Result of the GetServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetServerCertificate
     */
    GetServerCertificateResult getServerCertificate(GetServerCertificateRequest getServerCertificateRequest);

    /**
     * <p>
     * Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to
     * sign the request to this API.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetUser
     */
    GetUserResult getUser(GetUserRequest getUserRequest);

    /**
     * Simplified method form for invoking the GetUser operation.
     *
     * @see #getUser(GetUserRequest)
     */
    GetUserResult getUser();

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the specified IAM user.
     * </p>
     * <note>
     * <p>
     * Policies returned by this API are URL-encoded compliant with <a href="https://tools.ietf.org/html/rfc3986">RFC
     * 3986</a>. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
     * use Java, you can use the <code>decode</code> method of the <code>java.net.URLDecoder</code> utility class in the
     * Java SDK. Other languages and SDKs provide similar functionality.
     * </p>
     * </note>
     * <p>
     * An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached
     * to a user, use <a>GetPolicy</a> to determine the policy's default version, then use <a>GetPolicyVersion</a> to
     * retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getUserPolicyRequest
     * @return Result of the GetUserPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.GetUserPolicy
     */
    GetUserPolicyResult getUserPolicy(GetUserPolicyRequest getUserPolicyRequest);

    /**
     * <p>
     * Returns information about the access key IDs associated with the specified IAM user. If there are none, the
     * action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * <note>
     * <p>
     * To ensure the security of your AWS account, the secret access key is accessible only during key and user
     * creation.
     * </p>
     * </note>
     * 
     * @param listAccessKeysRequest
     * @return Result of the ListAccessKeys operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAccessKeys
     */
    ListAccessKeysResult listAccessKeys(ListAccessKeysRequest listAccessKeysRequest);

    /**
     * Simplified method form for invoking the ListAccessKeys operation.
     *
     * @see #listAccessKeys(ListAccessKeysRequest)
     */
    ListAccessKeysResult listAccessKeys();

    /**
     * <p>
     * Lists the account alias associated with the AWS account (Note: you can have only one). For information about
     * using an AWS account alias, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listAccountAliasesRequest
     * @return Result of the ListAccountAliases operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAccountAliases
     */
    ListAccountAliasesResult listAccountAliases(ListAccountAliasesRequest listAccountAliasesRequest);

    /**
     * Simplified method form for invoking the ListAccountAliases operation.
     *
     * @see #listAccountAliases(ListAccountAliasesRequest)
     */
    ListAccountAliasesResult listAccountAliases();

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM group.
     * </p>
     * <p>
     * An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the
     * <a>ListGroupPolicies</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified group (or none that match the specified path prefix), the
     * action returns an empty list.
     * </p>
     * 
     * @param listAttachedGroupPoliciesRequest
     * @return Result of the ListAttachedGroupPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedGroupPolicies
     */
    ListAttachedGroupPoliciesResult listAttachedGroupPolicies(ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM role.
     * </p>
     * <p>
     * An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the
     * <a>ListRolePolicies</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified role (or none that match the specified path prefix), the
     * action returns an empty list.
     * </p>
     * 
     * @param listAttachedRolePoliciesRequest
     * @return Result of the ListAttachedRolePolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedRolePolicies
     */
    ListAttachedRolePoliciesResult listAttachedRolePolicies(ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the
     * <a>ListUserPolicies</a> API. For information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. You can use the
     * <code>PathPrefix</code> parameter to limit the list of policies to only those matching the specified path prefix.
     * If there are no policies attached to the specified group (or none that match the specified path prefix), the
     * action returns an empty list.
     * </p>
     * 
     * @param listAttachedUserPoliciesRequest
     * @return Result of the ListAttachedUserPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListAttachedUserPolicies
     */
    ListAttachedUserPoliciesResult listAttachedUserPolicies(ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest);

    /**
     * <p>
     * Lists all IAM users, groups, and roles that the specified managed policy is attached to.
     * </p>
     * <p>
     * You can use the optional <code>EntityFilter</code> parameter to limit the results to a particular type of entity
     * (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set
     * <code>EntityFilter</code> to <code>Role</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listEntitiesForPolicyRequest
     * @return Result of the ListEntitiesForPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListEntitiesForPolicy
     */
    ListEntitiesForPolicyResult listEntitiesForPolicy(ListEntitiesForPolicyRequest listEntitiesForPolicyRequest);

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified IAM group.
     * </p>
     * <p>
     * An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a
     * group, use <a>ListAttachedGroupPolicies</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified group, the action returns an empty list.
     * </p>
     * 
     * @param listGroupPoliciesRequest
     * @return Result of the ListGroupPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroupPolicies
     */
    ListGroupPoliciesResult listGroupPolicies(ListGroupPoliciesRequest listGroupPoliciesRequest);

    /**
     * <p>
     * Lists the IAM groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroups
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * Simplified method form for invoking the ListGroups operation.
     *
     * @see #listGroups(ListGroupsRequest)
     */
    ListGroupsResult listGroups();

    /**
     * <p>
     * Lists the IAM groups that the specified IAM user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsForUserRequest
     * @return Result of the ListGroupsForUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListGroupsForUser
     */
    ListGroupsForUserResult listGroupsForUser(ListGroupsForUserRequest listGroupsForUserRequest);

    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If there are none, the action returns an empty
     * list. For more information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return Result of the ListInstanceProfiles operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListInstanceProfiles
     */
    ListInstanceProfilesResult listInstanceProfiles(ListInstanceProfilesRequest listInstanceProfilesRequest);

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation.
     *
     * @see #listInstanceProfiles(ListInstanceProfilesRequest)
     */
    ListInstanceProfilesResult listInstanceProfiles();

    /**
     * <p>
     * Lists the instance profiles that have the specified associated IAM role. If there are none, the action returns an
     * empty list. For more information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesForRoleRequest
     * @return Result of the ListInstanceProfilesForRole operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListInstanceProfilesForRole
     */
    ListInstanceProfilesForRoleResult listInstanceProfilesForRole(ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest);

    /**
     * <p>
     * Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this action lists all the
     * MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request for this API.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listMFADevicesRequest
     * @return Result of the ListMFADevices operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListMFADevices
     */
    ListMFADevicesResult listMFADevices(ListMFADevicesRequest listMFADevicesRequest);

    /**
     * Simplified method form for invoking the ListMFADevices operation.
     *
     * @see #listMFADevices(ListMFADevicesRequest)
     */
    ListMFADevicesResult listMFADevices();

    /**
     * <p>
     * Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.
     * </p>
     * 
     * @param listOpenIDConnectProvidersRequest
     * @return Result of the ListOpenIDConnectProviders operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListOpenIDConnectProviders
     */
    ListOpenIDConnectProvidersResult listOpenIDConnectProviders(ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest);

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders operation.
     *
     * @see #listOpenIDConnectProviders(ListOpenIDConnectProvidersRequest)
     */
    ListOpenIDConnectProvidersResult listOpenIDConnectProviders();

    /**
     * <p>
     * Lists all the managed policies that are available in your AWS account, including your own customer-defined
     * managed policies and all AWS managed policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the optional <code>OnlyAttached</code>,
     * <code>Scope</code>, and <code>PathPrefix</code> parameters. For example, to list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>. To list only AWS managed policies,
     * set <code>Scope</code> to <code>AWS</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListPolicies
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest);

    /**
     * Simplified method form for invoking the ListPolicies operation.
     *
     * @see #listPolicies(ListPoliciesRequest)
     */
    ListPoliciesResult listPolicies();

    /**
     * <p>
     * Lists information about the versions of the specified managed policy, including the version that is currently set
     * as the policy's default version.
     * </p>
     * <p>
     * For more information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     * @return Result of the ListPolicyVersions operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListPolicyVersions
     */
    ListPolicyVersionsResult listPolicyVersions(ListPolicyVersionsRequest listPolicyVersionsRequest);

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified IAM role.
     * </p>
     * <p>
     * An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a
     * role, use <a>ListAttachedRolePolicies</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified role, the action returns an empty list.
     * </p>
     * 
     * @param listRolePoliciesRequest
     * @return Result of the ListRolePolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListRolePolicies
     */
    ListRolePoliciesResult listRolePolicies(ListRolePoliciesRequest listRolePoliciesRequest);

    /**
     * <p>
     * Lists the IAM roles that have the specified path prefix. If there are none, the action returns an empty list. For
     * more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listRolesRequest
     * @return Result of the ListRoles operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListRoles
     */
    ListRolesResult listRoles(ListRolesRequest listRolesRequest);

    /**
     * Simplified method form for invoking the ListRoles operation.
     *
     * @see #listRoles(ListRolesRequest)
     */
    ListRolesResult listRoles();

    /**
     * <p>
     * Lists the SAML provider resource objects defined in IAM in the account.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param listSAMLProvidersRequest
     * @return Result of the ListSAMLProviders operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListSAMLProviders
     */
    ListSAMLProvidersResult listSAMLProviders(ListSAMLProvidersRequest listSAMLProvidersRequest);

    /**
     * Simplified method form for invoking the ListSAMLProviders operation.
     *
     * @see #listSAMLProviders(ListSAMLProvidersRequest)
     */
    ListSAMLProvidersResult listSAMLProviders();

    /**
     * <p>
     * Returns information about the SSH public keys associated with the specified IAM user. If there are none, the
     * action returns an empty list.
     * </p>
     * <p>
     * The SSH public keys returned by this action are used only for authenticating the IAM user to an AWS CodeCommit
     * repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still paginate the results using the
     * <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listSSHPublicKeysRequest
     * @return Result of the ListSSHPublicKeys operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.ListSSHPublicKeys
     */
    ListSSHPublicKeysResult listSSHPublicKeys(ListSSHPublicKeysRequest listSSHPublicKeysRequest);

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation.
     *
     * @see #listSSHPublicKeys(ListSSHPublicKeysRequest)
     */
    ListSSHPublicKeysResult listSSHPublicKeys();

    /**
     * <p>
     * Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the action
     * returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listServerCertificatesRequest
     * @return Result of the ListServerCertificates operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListServerCertificates
     */
    ListServerCertificatesResult listServerCertificates(ListServerCertificatesRequest listServerCertificatesRequest);

    /**
     * Simplified method form for invoking the ListServerCertificates operation.
     *
     * @see #listServerCertificates(ListServerCertificatesRequest)
     */
    ListServerCertificatesResult listServerCertificates();

    /**
     * <p>
     * Returns information about the signing certificates associated with the specified IAM user. If there are none, the
     * action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing certificates, you can still paginate the results using
     * the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS
     * access key ID used to sign the request for this API. Because this action works for access keys under the AWS
     * account, you can use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param listSigningCertificatesRequest
     * @return Result of the ListSigningCertificates operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListSigningCertificates
     */
    ListSigningCertificatesResult listSigningCertificates(ListSigningCertificatesRequest listSigningCertificatesRequest);

    /**
     * Simplified method form for invoking the ListSigningCertificates operation.
     *
     * @see #listSigningCertificates(ListSigningCertificatesRequest)
     */
    ListSigningCertificatesResult listSigningCertificates();

    /**
     * <p>
     * Lists the names of the inline policies embedded in the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a
     * user, use <a>ListAttachedUserPolicies</a>. For more information about policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters. If there are no
     * inline policies embedded with the specified user, the action returns an empty list.
     * </p>
     * 
     * @param listUserPoliciesRequest
     * @return Result of the ListUserPolicies operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListUserPolicies
     */
    ListUserPoliciesResult listUserPolicies(ListUserPoliciesRequest listUserPoliciesRequest);

    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path prefix is specified, the action returns all
     * users in the AWS account. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ListUsers
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * Simplified method form for invoking the ListUsers operation.
     *
     * @see #listUsers(ListUsersRequest)
     */
    ListUsersResult listUsers();

    /**
     * <p>
     * Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an
     * assignment status, the action returns a list of all virtual MFA devices. Assignment status can be
     * <code>Assigned</code>, <code>Unassigned</code>, or <code>Any</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
     * </p>
     * 
     * @param listVirtualMFADevicesRequest
     * @return Result of the ListVirtualMFADevices operation returned by the service.
     * @sample AmazonIdentityManagement.ListVirtualMFADevices
     */
    ListVirtualMFADevicesResult listVirtualMFADevices(ListVirtualMFADevicesRequest listVirtualMFADevicesRequest);

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation.
     *
     * @see #listVirtualMFADevices(ListVirtualMFADevicesRequest)
     */
    ListVirtualMFADevicesResult listVirtualMFADevices();

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the specified IAM group.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To attach a managed policy to a group, use
     * <a>AttachGroupPolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about
     * policies, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed
     * Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed in a group, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutGroupPolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putGroupPolicyRequest
     * @return Result of the PutGroupPolicy operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutGroupPolicy
     */
    PutGroupPolicyResult putGroupPolicy(PutGroupPolicyRequest putGroupPolicyRequest);

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the specified IAM role.
     * </p>
     * <p>
     * When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions)
     * policy. The role's trust policy is created at the same time as the role, using <a>CreateRole</a>. You can update
     * a role's trust policy using <a>UpdateAssumeRolePolicy</a>. For more information about IAM roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a managed policy to a role, use
     * <a>AttachRolePolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about policies,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed with a role, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutRolePolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putRolePolicyRequest
     * @return Result of the PutRolePolicy operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutRolePolicy
     */
    PutRolePolicyResult putRolePolicy(PutRolePolicyRequest putRolePolicyRequest);

    /**
     * <p>
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     * </p>
     * <p>
     * An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use
     * <a>AttachUserPolicy</a>. To create a new managed policy, use <a>CreatePolicy</a>. For information about policies,
     * see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies
     * and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you can embed in a user, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html">Limitations on IAM Entities</a>
     * in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because policy documents can be large, you should use POST rather than GET when calling
     * <code>PutUserPolicy</code>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putUserPolicyRequest
     * @return Result of the PutUserPolicy operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.PutUserPolicy
     */
    PutUserPolicyResult putUserPolicy(PutUserPolicyRequest putUserPolicyRequest);

    /**
     * <p>
     * Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified
     * IAM OpenID Connect (OIDC) provider resource object.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you try to remove a client ID that does not
     * exist.
     * </p>
     * 
     * @param removeClientIDFromOpenIDConnectProviderRequest
     * @return Result of the RemoveClientIDFromOpenIDConnectProvider operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveClientIDFromOpenIDConnectProvider
     */
    RemoveClientIDFromOpenIDConnectProviderResult removeClientIDFromOpenIDConnectProvider(
            RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest);

    /**
     * <p>
     * Removes the specified IAM role from the specified EC2 instance profile.
     * </p>
     * <important>
     * <p>
     * Make sure you do not have any Amazon EC2 instances running with the role you are about to remove from the
     * instance profile. Removing a role from an instance profile that is associated with a running instance break any
     * applications running on the instance.
     * </p>
     * </important>
     * <p>
     * For more information about IAM roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html">Working with Roles</a>. For more
     * information about instance profiles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html">About Instance Profiles</a>.
     * </p>
     * 
     * @param removeRoleFromInstanceProfileRequest
     * @return Result of the RemoveRoleFromInstanceProfile operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveRoleFromInstanceProfile
     */
    RemoveRoleFromInstanceProfileResult removeRoleFromInstanceProfile(RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest);

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * 
     * @param removeUserFromGroupRequest
     * @return Result of the RemoveUserFromGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.RemoveUserFromGroup
     */
    RemoveUserFromGroupResult removeUserFromGroup(RemoveUserFromGroupRequest removeUserFromGroupRequest);

    /**
     * <p>
     * Synchronizes the specified MFA device with its IAM resource object on the AWS servers.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html">Using a Virtual MFA Device</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param resyncMFADeviceRequest
     * @return Result of the ResyncMFADevice operation returned by the service.
     * @throws InvalidAuthenticationCodeException
     *         The request was rejected because the authentication code was not recognized. The error message describes
     *         the specific error.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.ResyncMFADevice
     */
    ResyncMFADeviceResult resyncMFADevice(ResyncMFADeviceRequest resyncMFADeviceRequest);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's default (operative) version.
     * </p>
     * <p>
     * This action affects all users, groups, and roles that the policy is attached to. To list the users, groups, and
     * roles that the policy is attached to, use the <a>ListEntitiesForPolicy</a> API.
     * </p>
     * <p>
     * For information about managed policies, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and
     * Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     * @return Result of the SetDefaultPolicyVersion operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.SetDefaultPolicyVersion
     */
    SetDefaultPolicyVersionResult setDefaultPolicyVersion(SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest);

    /**
     * <p>
     * Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API actions and
     * AWS resources to determine the policies' effective permissions. The policies are provided as strings.
     * </p>
     * <p>
     * The simulation does not perform the API actions; it only checks the authorization to determine if the simulated
     * policies allow or deny the actions.
     * </p>
     * <p>
     * If you want to simulate existing policies attached to an IAM user, group, or role, use
     * <a>SimulatePrincipalPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get
     * the list of context keys that the policies require for correct simulation, use
     * <a>GetContextKeysForCustomPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use <code>MaxItems</code> and <code>Marker</code> parameters to paginate the
     * results.
     * </p>
     * 
     * @param simulateCustomPolicyRequest
     * @return Result of the SimulateCustomPolicy operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyEvaluationException
     *         The request failed because a provided policy could not be successfully evaluated. An additional detail
     *         message indicates the source of the failure.
     * @sample AmazonIdentityManagement.SimulateCustomPolicy
     */
    SimulateCustomPolicyResult simulateCustomPolicy(SimulateCustomPolicyRequest simulateCustomPolicyRequest);

    /**
     * <p>
     * Simulate how a set of IAM policies attached to an IAM entity works with a list of API actions and AWS resources
     * to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you specify a
     * user, then the simulation also includes all of the policies that are attached to groups that the user belongs to
     * .
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies specified as strings to include in the
     * simulation. If you want to simulate only policies specified as strings, use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * You can also optionally include one resource-based policy to be evaluated with each of the resources included in
     * the simulation.
     * </p>
     * <p>
     * The simulation does not perform the API actions, it only checks the authorization to determine if the simulated
     * policies allow or deny the actions.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted to other users. If you do not want
     * users to see other user's permissions, then consider allowing them to use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that provide details about the context of an API
     * query request. You can use the <code>Condition</code> element of an IAM policy to evaluate context keys. To get
     * the list of context keys that the policies require for correct simulation, use
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use the <code>MaxItems</code> and <code>Marker</code> parameters to paginate the
     * results.
     * </p>
     * 
     * @param simulatePrincipalPolicyRequest
     * @return Result of the SimulatePrincipalPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws PolicyEvaluationException
     *         The request failed because a provided policy could not be successfully evaluated. An additional detail
     *         message indicates the source of the failure.
     * @sample AmazonIdentityManagement.SimulatePrincipalPolicy
     */
    SimulatePrincipalPolicyResult simulatePrincipalPolicy(SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest);

    /**
     * <p>
     * Changes the status of the specified access key from Active to Inactive, or vice versa. This action can be used to
     * disable a user's key as part of a key rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html">Managing Keys and
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccessKeyRequest
     * @return Result of the UpdateAccessKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAccessKey
     */
    UpdateAccessKeyResult updateAccessKey(UpdateAccessKeyRequest updateAccessKeyRequest);

    /**
     * <p>
     * Updates the password policy settings for the AWS account.
     * </p>
     * <note>
     * <p>
     * This action does not support partial updates. No parameters are required, but if you do not specify a parameter,
     * that parameter's value reverts to its default value. See the <b>Request Parameters</b> section for each
     * parameter's default value.
     * </p>
     * </note>
     * <p>
     * For more information about using a password policy, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html">Managing an IAM
     * Password Policy</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccountPasswordPolicyRequest
     * @return Result of the UpdateAccountPasswordPolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAccountPasswordPolicy
     */
    UpdateAccountPasswordPolicyResult updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest);

    /**
     * <p>
     * Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the
     * "role trust policy". For more information about roles, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">Using Roles to Delegate Permissions
     * and Federate Identities</a>.
     * </p>
     * 
     * @param updateAssumeRolePolicyRequest
     * @return Result of the UpdateAssumeRolePolicy operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws MalformedPolicyDocumentException
     *         The request was rejected because the policy document was malformed. The error message describes the
     *         specific error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateAssumeRolePolicy
     */
    UpdateAssumeRolePolicyResult updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest);

    /**
     * <p>
     * Updates the name and/or the path of the specified IAM group.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a group's path or name. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html">Renaming Users and
     * Groups</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change an IAM group name the requester must have appropriate permissions on both the source object and the
     * target object. For example, to change "Managers" to "MGRs", the entity making the request must have permission on
     * both "Managers" and "MGRs", or must have permission on all (*). For more information about permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html">Permissions and Policies</a>.
     * </p>
     * </note>
     * 
     * @param updateGroupRequest
     * @return Result of the UpdateGroup operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateGroup
     */
    UpdateGroupResult updateGroup(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Changes the password for the specified IAM user.
     * </p>
     * <p>
     * IAM users can change their own passwords by calling <a>ChangePassword</a>. For more information about modifying
     * passwords, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html">Managing
     * Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateLoginProfileRequest
     * @return Result of the UpdateLoginProfile operation returned by the service.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws PasswordPolicyViolationException
     *         The request was rejected because the provided password did not meet the requirements imposed by the
     *         account password policy.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateLoginProfile
     */
    UpdateLoginProfileResult updateLoginProfile(UpdateLoginProfileRequest updateLoginProfileRequest);

    /**
     * <p>
     * Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider
     * resource object with a new list of thumbprints.
     * </p>
     * <p>
     * The list that you pass with this action completely replaces the existing list of thumbprints. (The lists are not
     * merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs
     * rarely. However, if the provider's certificate <i>does</i> change, any attempt to assume an IAM role that
     * specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.
     * </p>
     * <note>
     * <p>
     * Because trust for the OIDC provider is ultimately derived from the provider's certificate and is validated by the
     * thumbprint, it is a best practice to limit access to the <code>UpdateOpenIDConnectProviderThumbprint</code>
     * action to highly-privileged users.
     * </p>
     * </note>
     * 
     * @param updateOpenIDConnectProviderThumbprintRequest
     * @return Result of the UpdateOpenIDConnectProviderThumbprint operation returned by the service.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateOpenIDConnectProviderThumbprint
     */
    UpdateOpenIDConnectProviderThumbprintResult updateOpenIDConnectProviderThumbprint(
            UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest);

    /**
     * <p>
     * Updates the metadata document for an existing SAML provider resource object.
     * </p>
     * <note>
     * <p>
     * This operation requires <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature
     * Version 4</a>.
     * </p>
     * </note>
     * 
     * @param updateSAMLProviderRequest
     * @return Result of the UpdateSAMLProvider operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateSAMLProvider
     */
    UpdateSAMLProviderResult updateSAMLProvider(UpdateSAMLProviderRequest updateSAMLProviderRequest);

    /**
     * <p>
     * Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot
     * be used for authentication. This action can be used to disable a user's SSH public key as part of a key rotation
     * work flow.
     * </p>
     * <p>
     * The SSH public key affected by this action is used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param updateSSHPublicKeyRequest
     * @return Result of the UpdateSSHPublicKey operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @sample AmazonIdentityManagement.UpdateSSHPublicKey
     */
    UpdateSSHPublicKeyResult updateSSHPublicKey(UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest);

    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate stored in IAM.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing a server certificate's path or name. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
     * >Renaming a Server Certificate</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change a server certificate name the requester must have appropriate permissions on both the source object and
     * the target object. For example, to change the name from "ProductionCert" to "ProdCert", the entity making the
     * request must have permission on "ProductionCert" and "ProdCert", or must have permission on all (*). For more
     * information about permissions, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     * Management</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServerCertificateRequest
     * @return Result of the UpdateServerCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateServerCertificate
     */
    UpdateServerCertificateResult updateServerCertificate(UpdateServerCertificateRequest updateServerCertificateRequest);

    /**
     * <p>
     * Changes the status of the specified user signing certificate from active to disabled, or vice versa. This action
     * can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * 
     * @param updateSigningCertificateRequest
     * @return Result of the UpdateSigningCertificate operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateSigningCertificate
     */
    UpdateSigningCertificateResult updateSigningCertificate(UpdateSigningCertificateRequest updateSigningCertificateRequest);

    /**
     * <p>
     * Updates the name and/or the path of the specified IAM user.
     * </p>
     * <important>
     * <p>
     * You should understand the implications of changing an IAM user's path or name. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming">Renaming an IAM
     * User</a> and <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html">Renaming an
     * IAM Group</a> in the <i>IAM User Guide</i>.
     * </p>
     * </important> <note>
     * <p>
     * To change a user name the requester must have appropriate permissions on both the source object and the target
     * object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and
     * Robert, or must have permission on all (*). For more information about permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html">Permissions and Policies</a>.
     * </p>
     * </note>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws EntityTemporarilyUnmodifiableException
     *         The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user
     *         name that was deleted and then recreated. The error indicates that the request is likely to succeed if
     *         you try again after waiting several minutes. The error message describes the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UpdateUser
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Uploads an SSH public key and associates it with the specified IAM user.
     * </p>
     * <p>
     * The SSH public key uploaded by this action can be used only for authenticating the associated IAM user to an AWS
     * CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
     * see <a href="http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html">Set up AWS
     * CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit User Guide</i>.
     * </p>
     * 
     * @param uploadSSHPublicKeyRequest
     * @return Result of the UploadSSHPublicKey operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws InvalidPublicKeyException
     *         The request was rejected because the public key is malformed or otherwise invalid.
     * @throws DuplicateSSHPublicKeyException
     *         The request was rejected because the SSH public key is already associated with the specified IAM user.
     * @throws UnrecognizedPublicKeyEncodingException
     *         The request was rejected because the public key encoding format is unsupported or unrecognized.
     * @sample AmazonIdentityManagement.UploadSSHPublicKey
     */
    UploadSSHPublicKeyResult uploadSSHPublicKey(UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest);

    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key
     * certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * For more information about working with server certificates, including a list of AWS services that can use the
     * server certificates that you manage with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html">Working with Server
     * Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about the number of server certificates you can upload, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html">Limitations on IAM Entities and
     * Objects</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Because the body of the public key certificate, private key, and the certificate chain can be large, you should
     * use POST rather than GET when calling <code>UploadServerCertificate</code>. For information about setting up
     * signatures and authorization through the API, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API Requests</a> in
     * the <i>AWS General Reference</i>. For general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html">Calling the API by Making HTTP Query
     * Requests</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param uploadServerCertificateRequest
     * @return Result of the UploadServerCertificate operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedCertificateException
     *         The request was rejected because the certificate was malformed or expired. The error message describes
     *         the specific error.
     * @throws KeyPairMismatchException
     *         The request was rejected because the public key certificate and the private key do not match.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UploadServerCertificate
     */
    UploadServerCertificateResult uploadServerCertificate(UploadServerCertificateRequest uploadServerCertificateRequest);

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509
     * signing certificates to validate requests that are signed with a corresponding private key. When you upload the
     * certificate, its default status is <code>Active</code>.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the IAM user name is determined implicitly based on the AWS
     * access key ID used to sign the request. Because this action works for access keys under the AWS account, you can
     * use this action to manage root credentials even if the AWS account has no associated users.
     * </p>
     * <note>
     * <p>
     * Because the body of a X.509 certificate can be large, you should use POST rather than GET when calling
     * <code>UploadSigningCertificate</code>. For information about setting up signatures and authorization through the
     * API, go to <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html">Signing AWS API
     * Requests</a> in the <i>AWS General Reference</i>. For general information about using the Query API with IAM, go
     * to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html">Making Query Requests</a> in
     * the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * 
     * @param uploadSigningCertificateRequest
     * @return Result of the UploadSigningCertificate operation returned by the service.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error message describes the limit exceeded.
     * @throws EntityAlreadyExistsException
     *         The request was rejected because it attempted to create a resource that already exists.
     * @throws MalformedCertificateException
     *         The request was rejected because the certificate was malformed or expired. The error message describes
     *         the specific error.
     * @throws InvalidCertificateException
     *         The request was rejected because the certificate is invalid.
     * @throws DuplicateCertificateException
     *         The request was rejected because the same certificate is associated with an IAM user in the account.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error message describes
     *         the entity.
     * @throws ServiceFailureException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @sample AmazonIdentityManagement.UploadSigningCertificate
     */
    UploadSigningCertificateResult uploadSigningCertificate(UploadSigningCertificateRequest uploadSigningCertificateRequest);

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

    AmazonIdentityManagementWaiters waiters();

}

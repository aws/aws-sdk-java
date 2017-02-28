/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations;

import javax.annotation.Generated;

import com.amazonaws.services.organizations.model.*;

/**
 * Interface for accessing Organizations asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.organizations.AbstractAWSOrganizationsAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Organizations API Reference</fullname>
 * <p>
 * AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an
 * <i>organization</i> and centrally manage your accounts and their resources.
 * </p>
 * <p>
 * This guide provides descriptions of the Organizations API. For more information about using this service, see the <a
 * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_introduction.html">AWS Organizations User
 * Guide</a>.
 * </p>
 * <p>
 * <b>API Version</b>
 * </p>
 * <p>
 * This version of the Organizations API Reference documents the Organizations API version 2016-11-28.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API directly, you can use one of the AWS SDKs, which consist of libraries and sample
 * code for various programming languages and platforms (Java, Ruby, .NET, iOS, Android, and more). The SDKs provide a
 * convenient way to create programmatic access to AWS Organizations. For example, the SDKs take care of
 * cryptographically signing requests, managing errors, and retrying requests automatically. For more information about
 * the AWS SDKs, including how to download and install them, see <a href="http://aws.amazon.com/tools/">Tools for Amazon
 * Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to Organizations. However, you also can use the
 * Organizations Query API to make direct calls to the Organizations web service. To learn more about the Organizations
 * Query API, see <a href="http://docs.aws.amazon.com/organizations/latest/UserGuide/orgs_query-requests.html">Making
 * Query Requests</a> in the <i>AWS Organizations User Guide</i>. Organizations supports GET and POST requests for all
 * actions. That is, the API does not require you to use GET for some actions and POST for others. However, GET requests
 * are subject to the limitation size of a URL. Therefore, for operations that require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * When you send HTTP requests to AWS, you must sign the requests so that AWS can identify who sent them. You sign
 * requests with your AWS access key, which consists of an access key ID and a secret access key. We strongly recommend
 * that you do not create an access key for your root account. Anyone who has the access key for your root account has
 * unrestricted access to all the resources in your account. Instead, create an access key for an IAM user account that
 * has administrative privileges. As another option, use AWS Security Token Service to generate temporary security
 * credentials, and use those credentials to sign requests.
 * </p>
 * <p>
 * To sign requests, we recommend that you use <a
 * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>. If you have an
 * existing application that uses Signature Version 2, you do not have to update it to use Signature Version 4. However,
 * some operations now require Signature Version 4. The documentation for operations that require version 4 indicate
 * this requirement.
 * </p>
 * <p>
 * When you use the AWS Command Line Interface (AWS CLI) or one of the AWS SDKs to make requests to AWS, these tools
 * automatically sign the requests for you with the access key that you specify when you configure the tools.
 * </p>
 * <p>
 * In this release, each organization can have only one root. In a future release, a single organization will support
 * multiple roots.
 * </p>
 * <p>
 * <b>Support and Feedback for AWS Organizations</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:feedback-awsorganizations@amazon.com">feedback-awsorganizations@amazon.com</a> or post your feedback and
 * questions in our private <a href="https://forums.aws.amazon.com/forum.jspa?forumID=219">AWS Organizations support
 * forum</a>. If you don't have access to the forum, send a request for access to the email address, along with your
 * forum user ID. For more information about the AWS support forums, see <a
 * href="https://forums.aws.amazon.com/help.jspa">Forums Help</a>.
 * </p>
 * <p>
 * <b>Endpoint to Call When Using the CLI or the AWS API</b>
 * </p>
 * <p>
 * For the current release of Organizations, you must specify the <code>us-east-1</code> region for all AWS API and CLI
 * calls. You can do this in the CLI by using these parameters and commands:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the following parameter with each command to specify both the endpoint and its region:
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the default endpoint, but configure your default region with this command:
 * </p>
 * <p>
 * <code>aws configure set default.region us-east-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the following parameter with each command to specify the endpoint:
 * </p>
 * <p>
 * <code>--region us-east-1</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For the various SDKs used to call the APIs, see the documentation for the SDK of interest to learn how to direct the
 * requests to a specific endpoint. For more information, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region">Regions and Endpoints</a> in the <i>AWS
 * General Reference</i>.
 * </p>
 * <p>
 * <b>How examples are presented</b>
 * </p>
 * <p>
 * The JSON returned by the AWS Organizations service as response to your requests is returned as a single long string
 * without line breaks or formatting whitespace. Both line breaks and whitespace are included in the examples in this
 * guide to improve readability. When example input parameters also would result in long strings that would extend
 * beyond the screen, we insert line breaks to enhance readability. You should always submit the input as a single JSON
 * text string.
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Organizations supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by AWS CloudTrail, you can determine which requests were
 * successfully made to Organizations, who made the request, when it was made, and so on. For more about AWS
 * Organizations and its support for AWS CloudTrail, see <a
 * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_cloudtrail-integration.html">Logging AWS
 * Organizations Events with AWS CloudTrail</a> in the <i>AWS Organizations User Guide</i>. To learn more about
 * CloudTrail, including how to turn it on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">AWS CloudTrail
 * User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOrganizationsAsync extends AWSOrganizations {

    /**
     * <p>
     * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.
     * </p>
     * <p>
     * This operation can be called only by the following principals when they also have the relevant IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Invitation to join</b> or <b>Full-control request</b> handshake: only a principal from the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Full-control final confirmation</b> handshake: only a principal from the master account.
     * </p>
     * <p>
     * For more information about invitations, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_accounts_invites.html">Inviting an
     * AWS Account to Join Your Organization</a> in the <i>AWS Organizations User Guide</i>. For more information about
     * full-control requests, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_full-control-mode.html">Migrating to
     * Full-Control Mode in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptHandshakeRequest
     * @return A Java Future containing the result of the AcceptHandshake operation returned by the service.
     * @sample AWSOrganizationsAsync.AcceptHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AcceptHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptHandshakeResult> acceptHandshakeAsync(AcceptHandshakeRequest acceptHandshakeRequest);

    /**
     * <p>
     * Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.
     * </p>
     * <p>
     * This operation can be called only by the following principals when they also have the relevant IAM permissions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Invitation to join</b> or <b>Full-control request</b> handshake: only a principal from the member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Full-control final confirmation</b> handshake: only a principal from the master account.
     * </p>
     * <p>
     * For more information about invitations, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_accounts_invites.html">Inviting an
     * AWS Account to Join Your Organization</a> in the <i>AWS Organizations User Guide</i>. For more information about
     * full-control requests, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_full-control-mode.html">Migrating to
     * Full-Control Mode in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptHandshakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptHandshake operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.AcceptHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AcceptHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptHandshakeResult> acceptHandshakeAsync(AcceptHandshakeRequest acceptHandshakeRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptHandshakeRequest, AcceptHandshakeResult> asyncHandler);

    /**
     * <p>
     * Attaches a policy to a root, an organizational unit, or an individual account. How the policy affects accounts
     * depends on the type of policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Service control policy (SCP)</b> - An SCP specifies what permissions can be delegated to users in affected
     * member accounts. The scope of influence for a policy depends on what you attach the policy to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you attach an SCP to a root, it affects all accounts in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you attach the policy directly to an account, then it affects only that account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SCPs essentially are permission "filters". When you attach one SCP to a higher level root or OU, and you also
     * attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions
     * that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot
     * grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows
     * permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected
     * by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by
     * the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be
     * granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP.
     * </p>
     * <p>
     * AWS Organizations attaches a default SCP named <code>"FullAWSAccess</code> to every root, OU, and account. This
     * default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of
     * the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the
     * permissions that you want to allow in that OU or account.
     * </p>
     * <p>
     * For more information about how OCP permissions work, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies_scps.html">Using Service
     * Control Policies</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param attachPolicyRequest
     * @return A Java Future containing the result of the AttachPolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AttachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest attachPolicyRequest);

    /**
     * <p>
     * Attaches a policy to a root, an organizational unit, or an individual account. How the policy affects accounts
     * depends on the type of policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Service control policy (SCP)</b> - An SCP specifies what permissions can be delegated to users in affected
     * member accounts. The scope of influence for a policy depends on what you attach the policy to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you attach an SCP to a root, it affects all accounts in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you attach the policy directly to an account, then it affects only that account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * SCPs essentially are permission "filters". When you attach one SCP to a higher level root or OU, and you also
     * attach a different SCP to a child OU or to an account, the child policy can further restrict only the permissions
     * that pass through the parent filter and are available to the child. An SCP that is attached to a child cannot
     * grant a permission that is not already granted by the parent. For example, imagine that the parent SCP allows
     * permissions A, B, C, D, and E. The child SCP allows C, D, E, F, and G. The result is that the accounts affected
     * by the child SCP are allowed to use only C, D, and E. They cannot use A or B because they were filtered out by
     * the child OU. They also cannot use F and G because they were filtered out by the parent OU. They cannot be
     * granted back by the child SCP; child SCPs can only filter the permissions they receive from the parent SCP.
     * </p>
     * <p>
     * AWS Organizations attaches a default SCP named <code>"FullAWSAccess</code> to every root, OU, and account. This
     * default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of
     * the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the
     * permissions that you want to allow in that OU or account.
     * </p>
     * <p>
     * For more information about how OCP permissions work, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies_scps.html">Using Service
     * Control Policies</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param attachPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachPolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.AttachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AttachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AttachPolicyResult> attachPolicyAsync(AttachPolicyRequest attachPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachPolicyRequest, AttachPolicyResult> asyncHandler);

    /**
     * <p>
     * Cancels a handshake. Canceling a handshake sets the handshake state to <code>CANCELED</code>.
     * </p>
     * <p>
     * This operation can be called only from the account that originated the handshake. The recipient of the handshake
     * can't cancel it, but can use <a>DeclineHandshake</a> instead. After a handshake is canceled, the recipient can no
     * longer respond to that handshake.
     * </p>
     * 
     * @param cancelHandshakeRequest
     * @return A Java Future containing the result of the CancelHandshake operation returned by the service.
     * @sample AWSOrganizationsAsync.CancelHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CancelHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelHandshakeResult> cancelHandshakeAsync(CancelHandshakeRequest cancelHandshakeRequest);

    /**
     * <p>
     * Cancels a handshake. Canceling a handshake sets the handshake state to <code>CANCELED</code>.
     * </p>
     * <p>
     * This operation can be called only from the account that originated the handshake. The recipient of the handshake
     * can't cancel it, but can use <a>DeclineHandshake</a> instead. After a handshake is canceled, the recipient can no
     * longer respond to that handshake.
     * </p>
     * 
     * @param cancelHandshakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelHandshake operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.CancelHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CancelHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelHandshakeResult> cancelHandshakeAsync(CancelHandshakeRequest cancelHandshakeRequest,
            com.amazonaws.handlers.AsyncHandler<CancelHandshakeRequest, CancelHandshakeResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS account that is automatically a member of the organization whose credentials made the request.
     * This is an asynchronous request that AWS performs in the background. If you want to check the status of the
     * request later, you need the <code>OperationId</code> response element from this operation to provide as a
     * parameter to the <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants administrator permissions to the new account.
     * Principals in the master account can assume the role. AWS Organizations clones the company name and address
     * information for the new account from the organization's master account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_accounts_create.html">Creating an AWS
     * Account in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You cannot remove accounts that are created with this operation from an organization. That also means that you
     * cannot delete an organization that contains an account that is created with this operation.
     * </p>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, the account is created with the <b>IAM User and Role Access
     * to Billing Information</b> switch enabled. This allows IAM users and roles that are granted appropriate
     * permissions to view billing information. If this is disabled, then only the account root user can access billing
     * information. For information about how to disable this for an account, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createAccountRequest
     * @return A Java Future containing the result of the CreateAccount operation returned by the service.
     * @sample AWSOrganizationsAsync.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest createAccountRequest);

    /**
     * <p>
     * Creates an AWS account that is automatically a member of the organization whose credentials made the request.
     * This is an asynchronous request that AWS performs in the background. If you want to check the status of the
     * request later, you need the <code>OperationId</code> response element from this operation to provide as a
     * parameter to the <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants administrator permissions to the new account.
     * Principals in the master account can assume the role. AWS Organizations clones the company name and address
     * information for the new account from the organization's master account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_accounts_create.html">Creating an AWS
     * Account in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <important>
     * <p>
     * You cannot remove accounts that are created with this operation from an organization. That also means that you
     * cannot delete an organization that contains an account that is created with this operation.
     * </p>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, the account is created with the <b>IAM User and Role Access
     * to Billing Information</b> switch enabled. This allows IAM users and roles that are granted appropriate
     * permissions to view billing information. If this is disabled, then only the account root user can access billing
     * information. For information about how to disable this for an account, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccount operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest createAccountRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccountRequest, CreateAccountResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS organization. The account whose user is calling the CreateOrganization operation automatically
     * becomes the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/orgs_getting-started_concepts.html#account">master
     * account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is to become the new organization's master
     * account. The principal must also have the relevant IAM permissions.
     * </p>
     * <p>
     * By default, a new organization is created in full-control mode and service control policies are automatically
     * enabled in the root. If you instead choose to create the organization in billing mode by setting the
     * <code>Mode</code> parameter to <code>BILLING"</code>, then no OCP types are enabled by default.
     * </p>
     * 
     * @param createOrganizationRequest
     * @return A Java Future containing the result of the CreateOrganization operation returned by the service.
     * @sample AWSOrganizationsAsync.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest createOrganizationRequest);

    /**
     * <p>
     * Creates an AWS organization. The account whose user is calling the CreateOrganization operation automatically
     * becomes the <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/orgs_getting-started_concepts.html#account">master
     * account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is to become the new organization's master
     * account. The principal must also have the relevant IAM permissions.
     * </p>
     * <p>
     * By default, a new organization is created in full-control mode and service control policies are automatically
     * enabled in the root. If you instead choose to create the organization in billing mode by setting the
     * <code>Mode</code> parameter to <code>BILLING"</code>, then no OCP types are enabled by default.
     * </p>
     * 
     * @param createOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrganization operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.CreateOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationResult> createOrganizationAsync(CreateOrganizationRequest createOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrganizationRequest, CreateOrganizationResult> asyncHandler);

    /**
     * <p>
     * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables
     * you to organize your accounts to apply organization control policies according to your business requirements. The
     * number of levels deep that you can nest OUs is dependent upon the organization control policy types enabled for
     * that root. For service control policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_ous.html">Managing Organizational
     * Units</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createOrganizationalUnitRequest
     * @return A Java Future containing the result of the CreateOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsync.CreateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationalUnitResult> createOrganizationalUnitAsync(CreateOrganizationalUnitRequest createOrganizationalUnitRequest);

    /**
     * <p>
     * Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables
     * you to organize your accounts to apply organization control policies according to your business requirements. The
     * number of levels deep that you can nest OUs is dependent upon the organization control policy types enabled for
     * that root. For service control policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_ous.html">Managing Organizational
     * Units</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createOrganizationalUnitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.CreateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateOrganizationalUnitResult> createOrganizationalUnitAsync(CreateOrganizationalUnitRequest createOrganizationalUnitRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResult> asyncHandler);

    /**
     * <p>
     * Creates an organization control policy (OCP) of a specified type that you can attach to a root, an organizational
     * unit (OU), or an individual AWS account.
     * </p>
     * <p>
     * For more information about OCPs and their use, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies.html">Managing Organization
     * Control Policies</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createPolicyRequest
     * @return A Java Future containing the result of the CreatePolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates an organization control policy (OCP) of a specified type that you can attach to a root, an organizational
     * unit (OU), or an individual AWS account.
     * </p>
     * <p>
     * For more information about OCPs and their use, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies.html">Managing Organization
     * Control Policies</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param createPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest createPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler);

    /**
     * <p>
     * Declines a handshake request. This sets the handshake state to <code>DECLINED</code> and effectively deactivates
     * the request.
     * </p>
     * <p>
     * This operation can be called only from the account that received the handshake. The originator of the handshake
     * can use <a>CancelHandshake</a> instead. The originator can't reactivate a declined request, but can re-initiate
     * the process with a new handshake request.
     * </p>
     * 
     * @param declineHandshakeRequest
     * @return A Java Future containing the result of the DeclineHandshake operation returned by the service.
     * @sample AWSOrganizationsAsync.DeclineHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeclineHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineHandshakeResult> declineHandshakeAsync(DeclineHandshakeRequest declineHandshakeRequest);

    /**
     * <p>
     * Declines a handshake request. This sets the handshake state to <code>DECLINED</code> and effectively deactivates
     * the request.
     * </p>
     * <p>
     * This operation can be called only from the account that received the handshake. The originator of the handshake
     * can use <a>CancelHandshake</a> instead. The originator can't reactivate a declined request, but can re-initiate
     * the process with a new handshake request.
     * </p>
     * 
     * @param declineHandshakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineHandshake operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DeclineHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeclineHandshake" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineHandshakeResult> declineHandshakeAsync(DeclineHandshakeRequest declineHandshakeRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineHandshakeRequest, DeclineHandshakeResult> asyncHandler);

    /**
     * <p>
     * Deletes the organization. You can delete an organization only by using credentials from the master account. The
     * organization must be empty of member accounts, OUs, and policies.
     * </p>
     * <important>
     * <p>
     * If you create any accounts using Organizations operations or the Organizations console, you can't remove those
     * accounts from the organization, which means that you can't delete the organization.
     * </p>
     * </important>
     * 
     * @param deleteOrganizationRequest
     * @return A Java Future containing the result of the DeleteOrganization operation returned by the service.
     * @sample AWSOrganizationsAsync.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest deleteOrganizationRequest);

    /**
     * <p>
     * Deletes the organization. You can delete an organization only by using credentials from the master account. The
     * organization must be empty of member accounts, OUs, and policies.
     * </p>
     * <important>
     * <p>
     * If you create any accounts using Organizations operations or the Organizations console, you can't remove those
     * accounts from the organization, which means that you can't delete the organization.
     * </p>
     * </important>
     * 
     * @param deleteOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOrganization operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DeleteOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationResult> deleteOrganizationAsync(DeleteOrganizationRequest deleteOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOrganizationRequest, DeleteOrganizationResult> asyncHandler);

    /**
     * <p>
     * Deletes an organizational unit from a root or another OU. You must first remove all accounts and child OUs from
     * the OU that you want to delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deleteOrganizationalUnitRequest
     * @return A Java Future containing the result of the DeleteOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsync.DeleteOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationalUnitResult> deleteOrganizationalUnitAsync(DeleteOrganizationalUnitRequest deleteOrganizationalUnitRequest);

    /**
     * <p>
     * Deletes an organizational unit from a root or another OU. You must first remove all accounts and child OUs from
     * the OU that you want to delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deleteOrganizationalUnitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DeleteOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeleteOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteOrganizationalUnitResult> deleteOrganizationalUnitAsync(DeleteOrganizationalUnitRequest deleteOrganizationalUnitRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the
     * policy from all OUs, roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified policy from your organization. Before you perform this operation, you must first detach the
     * policy from all OUs, roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param deletePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves Organizations-related information about the specified account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeAccountRequest
     * @return A Java Future containing the result of the DescribeAccount operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest describeAccountRequest);

    /**
     * <p>
     * Retrieves Organizations-related information about the specified account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccount operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribeAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountResult> describeAccountAsync(DescribeAccountRequest describeAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountRequest, DescribeAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current status of an asynchronous request to create an account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeCreateAccountStatusRequest
     * @return A Java Future containing the result of the DescribeCreateAccountStatus operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribeCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCreateAccountStatusResult> describeCreateAccountStatusAsync(
            DescribeCreateAccountStatusRequest describeCreateAccountStatusRequest);

    /**
     * <p>
     * Retrieves the current status of an asynchronous request to create an account.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeCreateAccountStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCreateAccountStatus operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribeCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCreateAccountStatusResult> describeCreateAccountStatusAsync(
            DescribeCreateAccountStatusRequest describeCreateAccountStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCreateAccountStatusRequest, DescribeCreateAccountStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the
     * original <a>InviteAccountToOrganization</a> operation that generated the handshake.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeHandshakeRequest
     * @return A Java Future containing the result of the DescribeHandshake operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribeHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeHandshake"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHandshakeResult> describeHandshakeAsync(DescribeHandshakeRequest describeHandshakeRequest);

    /**
     * <p>
     * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the
     * original <a>InviteAccountToOrganization</a> operation that generated the handshake.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeHandshakeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHandshake operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribeHandshake
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeHandshake"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHandshakeResult> describeHandshakeAsync(DescribeHandshakeRequest describeHandshakeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHandshakeRequest, DescribeHandshakeResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the organization that the user's account belongs to.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @return A Java Future containing the result of the DescribeOrganization operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest describeOrganizationRequest);

    /**
     * <p>
     * Retrieves information about the organization that the user's account belongs to.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param describeOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganization operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribeOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationResult> describeOrganizationAsync(DescribeOrganizationRequest describeOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationRequest, DescribeOrganizationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an organizational unit (OU).
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeOrganizationalUnitRequest
     * @return A Java Future containing the result of the DescribeOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribeOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationalUnitResult> describeOrganizationalUnitAsync(
            DescribeOrganizationalUnitRequest describeOrganizationalUnitRequest);

    /**
     * <p>
     * Retrieves information about an organizational unit (OU).
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describeOrganizationalUnitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribeOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationalUnitResult> describeOrganizationalUnitAsync(
            DescribeOrganizationalUnitRequest describeOrganizationalUnitRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationalUnitRequest, DescribeOrganizationalUnitResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an organization control policy (OCP).
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describePolicyRequest
     * @return A Java Future containing the result of the DescribePolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePolicyResult> describePolicyAsync(DescribePolicyRequest describePolicyRequest);

    /**
     * <p>
     * Retrieves information about an organization control policy (OCP).
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param describePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePolicyResult> describePolicyAsync(DescribePolicyRequest describePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePolicyRequest, DescribePolicyResult> asyncHandler);

    /**
     * <p>
     * Detaches an organization control policy (OCP) from a target root, organizational unit, or account. If the policy
     * being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected
     * accounts are immediate.
     * </p>
     * <p>
     * <b>Note:</b> Every root, OU, and account must have at least one SCP attached. If you want to replace the default
     * <code>FullAWSAccess</code> policy with one that limits the permissions that can be delegated, then you must
     * attach the replacement policy before you can remove the default one. This is the authorization strategy of <a
     * href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies_scps.html#orgs_policies_whitelist"
     * >whitelisting</a>. If you instead attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached, and specify <code>"Effect": "Deny"</code> in the second SCP to override the
     * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or any other attached SCP), then you are
     * using the authorization strategy of <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies_scps.html#orgs_policies_blacklist"
     * >blacklisting</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param detachPolicyRequest
     * @return A Java Future containing the result of the DetachPolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DetachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest detachPolicyRequest);

    /**
     * <p>
     * Detaches an organization control policy (OCP) from a target root, organizational unit, or account. If the policy
     * being detached is a service control policy (SCP), the changes to permissions for IAM users and roles in affected
     * accounts are immediate.
     * </p>
     * <p>
     * <b>Note:</b> Every root, OU, and account must have at least one SCP attached. If you want to replace the default
     * <code>FullAWSAccess</code> policy with one that limits the permissions that can be delegated, then you must
     * attach the replacement policy before you can remove the default one. This is the authorization strategy of <a
     * href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies_scps.html#orgs_policies_whitelist"
     * >whitelisting</a>. If you instead attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached, and specify <code>"Effect": "Deny"</code> in the second SCP to override the
     * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or any other attached SCP), then you are
     * using the authorization strategy of <a href=
     * "http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_policies_scps.html#orgs_policies_blacklist"
     * >blacklisting</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param detachPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachPolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DetachPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DetachPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DetachPolicyResult> detachPolicyAsync(DetachPolicyRequest detachPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachPolicyRequest, DetachPolicyResult> asyncHandler);

    /**
     * <p>
     * Disables an organizational control policy (OCP) type in a root. An OCP of a certain type can be attached to
     * entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can
     * attach policies of the specified type to that root or to any OU or account in that root. You can undo this by
     * using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param disablePolicyTypeRequest
     * @return A Java Future containing the result of the DisablePolicyType operation returned by the service.
     * @sample AWSOrganizationsAsync.DisablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisablePolicyType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisablePolicyTypeResult> disablePolicyTypeAsync(DisablePolicyTypeRequest disablePolicyTypeRequest);

    /**
     * <p>
     * Disables an organizational control policy (OCP) type in a root. An OCP of a certain type can be attached to
     * entities in a root only if that type is enabled in the root. After you perform this operation, you no longer can
     * attach policies of the specified type to that root or to any OU or account in that root. You can undo this by
     * using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param disablePolicyTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisablePolicyType operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DisablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisablePolicyType"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisablePolicyTypeResult> disablePolicyTypeAsync(DisablePolicyTypeRequest disablePolicyTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DisablePolicyTypeRequest, DisablePolicyTypeResult> asyncHandler);

    /**
     * <p>
     * Enables full-control mode in an organization. Full-control mode enables the use of organization control policies
     * (OCPs) to restrict the services and actions that can be called in each account. Until you enable full-control
     * mode, you have access only to shared billing, and you can't use any of the advanced account administration
     * features that AWS Organizations supports. For more information about full-control mode, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_full-control-mode.html">Enabling
     * Full-Control Mode in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created explicitly in billing mode, or that were
     * migrated from a Consolidated Billing account family to Organizations. Calling this operation sends a handshake to
     * every account in the organization. The migration can be finalized and the new features enabled only after all
     * administrators approve the switch by accepting the handshake.
     * </p>
     * </important>
     * <p>
     * After all member accounts accept the handshake, you finalize the migration by accepting the handshake that
     * contains <code>"Action": "ENABLE_FULL_CONTROL"</code>. This completes the switch.
     * </p>
     * <p>
     * After you enable full-control mode, the master account in the organization can apply OCPs on all member accounts.
     * These policies can restrict what users and even administrators in those accounts can do. The master account can
     * apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are
     * aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param enableFullControlRequest
     * @return A Java Future containing the result of the EnableFullControl operation returned by the service.
     * @sample AWSOrganizationsAsync.EnableFullControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableFullControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableFullControlResult> enableFullControlAsync(EnableFullControlRequest enableFullControlRequest);

    /**
     * <p>
     * Enables full-control mode in an organization. Full-control mode enables the use of organization control policies
     * (OCPs) to restrict the services and actions that can be called in each account. Until you enable full-control
     * mode, you have access only to shared billing, and you can't use any of the advanced account administration
     * features that AWS Organizations supports. For more information about full-control mode, see <a
     * href="http://docs.aws.amazon.com/Organizations/latest/UserGuide/orgs_manage_full-control-mode.html">Enabling
     * Full-Control Mode in Your Organization</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created explicitly in billing mode, or that were
     * migrated from a Consolidated Billing account family to Organizations. Calling this operation sends a handshake to
     * every account in the organization. The migration can be finalized and the new features enabled only after all
     * administrators approve the switch by accepting the handshake.
     * </p>
     * </important>
     * <p>
     * After all member accounts accept the handshake, you finalize the migration by accepting the handshake that
     * contains <code>"Action": "ENABLE_FULL_CONTROL"</code>. This completes the switch.
     * </p>
     * <p>
     * After you enable full-control mode, the master account in the organization can apply OCPs on all member accounts.
     * These policies can restrict what users and even administrators in those accounts can do. The master account can
     * apply policies that prevent accounts from leaving the organization. Ensure that your account administrators are
     * aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param enableFullControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableFullControl operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.EnableFullControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableFullControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableFullControlResult> enableFullControlAsync(EnableFullControlRequest enableFullControlRequest,
            com.amazonaws.handlers.AsyncHandler<EnableFullControlRequest, EnableFullControlResult> asyncHandler);

    /**
     * <p>
     * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type
     * to the root, any OU, or account in that root. You can undo this by using the <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param enablePolicyTypeRequest
     * @return A Java Future containing the result of the EnablePolicyType operation returned by the service.
     * @sample AWSOrganizationsAsync.EnablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnablePolicyType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnablePolicyTypeResult> enablePolicyTypeAsync(EnablePolicyTypeRequest enablePolicyTypeRequest);

    /**
     * <p>
     * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type
     * to the root, any OU, or account in that root. You can undo this by using the <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param enablePolicyTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnablePolicyType operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.EnablePolicyType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnablePolicyType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnablePolicyTypeResult> enablePolicyTypeAsync(EnablePolicyTypeRequest enablePolicyTypeRequest,
            com.amazonaws.handlers.AsyncHandler<EnablePolicyTypeRequest, EnablePolicyTypeResult> asyncHandler);

    /**
     * <p>
     * Sends an invitation to another account to join your organization as a member account. Organizations sends email
     * on your behalf to the email address that is associated with the other account's owner. The invitation is
     * implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param inviteAccountToOrganizationRequest
     * @return A Java Future containing the result of the InviteAccountToOrganization operation returned by the service.
     * @sample AWSOrganizationsAsync.InviteAccountToOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/InviteAccountToOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InviteAccountToOrganizationResult> inviteAccountToOrganizationAsync(
            InviteAccountToOrganizationRequest inviteAccountToOrganizationRequest);

    /**
     * <p>
     * Sends an invitation to another account to join your organization as a member account. Organizations sends email
     * on your behalf to the email address that is associated with the other account's owner. The invitation is
     * implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param inviteAccountToOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteAccountToOrganization operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.InviteAccountToOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/InviteAccountToOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InviteAccountToOrganizationResult> inviteAccountToOrganizationAsync(
            InviteAccountToOrganizationRequest inviteAccountToOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<InviteAccountToOrganizationRequest, InviteAccountToOrganizationResult> asyncHandler);

    /**
     * <p>
     * Removes a member account from its parent organization. This version of the operation is performed by the account
     * that wants to leave. To remove a member account as a user in the master account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the organization.
     * </p>
     * <important>
     * <p>
     * The master account in an organization in full-control mode can set service control policies (SCPs) that can
     * restrict what administrators of member accounts can do, including preventing them from successfully calling
     * <code>LeaveOrganization</code> and leaving the organization.
     * </p>
     * </important>
     * 
     * @param leaveOrganizationRequest
     * @return A Java Future containing the result of the LeaveOrganization operation returned by the service.
     * @sample AWSOrganizationsAsync.LeaveOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/LeaveOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<LeaveOrganizationResult> leaveOrganizationAsync(LeaveOrganizationRequest leaveOrganizationRequest);

    /**
     * <p>
     * Removes a member account from its parent organization. This version of the operation is performed by the account
     * that wants to leave. To remove a member account as a user in the master account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the organization.
     * </p>
     * <important>
     * <p>
     * The master account in an organization in full-control mode can set service control policies (SCPs) that can
     * restrict what administrators of member accounts can do, including preventing them from successfully calling
     * <code>LeaveOrganization</code> and leaving the organization.
     * </p>
     * </important>
     * 
     * @param leaveOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LeaveOrganization operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.LeaveOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/LeaveOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<LeaveOrganizationResult> leaveOrganizationAsync(LeaveOrganizationRequest leaveOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<LeaveOrganizationRequest, LeaveOrganizationResult> asyncHandler);

    /**
     * <p>
     * Lists all the accounts in the organization. To request only the accounts in a root or OU, use the
     * <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listAccountsRequest
     * @return A Java Future containing the result of the ListAccounts operation returned by the service.
     * @sample AWSOrganizationsAsync.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest listAccountsRequest);

    /**
     * <p>
     * Lists all the accounts in the organization. To request only the accounts in a root or OU, use the
     * <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccounts operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest listAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler);

    /**
     * <p>
     * Lists the accounts in an organization that are contained by the specified target root or organizational unit
     * (OU). If you specify the root, you get a list of all the accounts that are not in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU, and not in any child OUs. To get a list of all accounts in
     * the organization, use the <a>ListAccounts</a> operation.
     * </p>
     * 
     * @param listAccountsForParentRequest
     * @return A Java Future containing the result of the ListAccountsForParent operation returned by the service.
     * @sample AWSOrganizationsAsync.ListAccountsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccountsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsForParentResult> listAccountsForParentAsync(ListAccountsForParentRequest listAccountsForParentRequest);

    /**
     * <p>
     * Lists the accounts in an organization that are contained by the specified target root or organizational unit
     * (OU). If you specify the root, you get a list of all the accounts that are not in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU, and not in any child OUs. To get a list of all accounts in
     * the organization, use the <a>ListAccounts</a> operation.
     * </p>
     * 
     * @param listAccountsForParentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountsForParent operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListAccountsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAccountsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsForParentResult> listAccountsForParentAsync(ListAccountsForParentRequest listAccountsForParentRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountsForParentRequest, ListAccountsForParentResult> asyncHandler);

    /**
     * <p>
     * Lists all of the OUs or accounts that are contained in the specified parent OU or root. This operation, along
     * with <a>ListParents</a> enables you to traverse the tree structure that makes up this root.
     * </p>
     * 
     * @param listChildrenRequest
     * @return A Java Future containing the result of the ListChildren operation returned by the service.
     * @sample AWSOrganizationsAsync.ListChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListChildren" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChildrenResult> listChildrenAsync(ListChildrenRequest listChildrenRequest);

    /**
     * <p>
     * Lists all of the OUs or accounts that are contained in the specified parent OU or root. This operation, along
     * with <a>ListParents</a> enables you to traverse the tree structure that makes up this root.
     * </p>
     * 
     * @param listChildrenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChildren operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListChildren
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListChildren" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChildrenResult> listChildrenAsync(ListChildrenRequest listChildrenRequest,
            com.amazonaws.handlers.AsyncHandler<ListChildrenRequest, ListChildrenResult> asyncHandler);

    /**
     * <p>
     * Lists the account creation requests that match the specified status that is currently being tracked for the
     * organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listCreateAccountStatusRequest
     * @return A Java Future containing the result of the ListCreateAccountStatus operation returned by the service.
     * @sample AWSOrganizationsAsync.ListCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCreateAccountStatusResult> listCreateAccountStatusAsync(ListCreateAccountStatusRequest listCreateAccountStatusRequest);

    /**
     * <p>
     * Lists the account creation requests that match the specified status that is currently being tracked for the
     * organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listCreateAccountStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCreateAccountStatus operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListCreateAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListCreateAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCreateAccountStatusResult> listCreateAccountStatusAsync(ListCreateAccountStatusRequest listCreateAccountStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListCreateAccountStatusRequest, ListCreateAccountStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the current handshakes that are associated with the account of the requesting user.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param listHandshakesForAccountRequest
     * @return A Java Future containing the result of the ListHandshakesForAccount operation returned by the service.
     * @sample AWSOrganizationsAsync.ListHandshakesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHandshakesForAccountResult> listHandshakesForAccountAsync(ListHandshakesForAccountRequest listHandshakesForAccountRequest);

    /**
     * <p>
     * Lists the current handshakes that are associated with the account of the requesting user.
     * </p>
     * <p>
     * This operation can be called from any account in the organization.
     * </p>
     * 
     * @param listHandshakesForAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHandshakesForAccount operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListHandshakesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHandshakesForAccountResult> listHandshakesForAccountAsync(ListHandshakesForAccountRequest listHandshakesForAccountRequest,
            com.amazonaws.handlers.AsyncHandler<ListHandshakesForAccountRequest, ListHandshakesForAccountResult> asyncHandler);

    /**
     * <p>
     * Lists the handshakes that are associated with the organization that the requesting user is part of. The
     * <code>ListHandshakesForOrganization</code> operation returns a list of handshake structures. Each structure
     * contains details and status about a handshake.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listHandshakesForOrganizationRequest
     * @return A Java Future containing the result of the ListHandshakesForOrganization operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.ListHandshakesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHandshakesForOrganizationResult> listHandshakesForOrganizationAsync(
            ListHandshakesForOrganizationRequest listHandshakesForOrganizationRequest);

    /**
     * <p>
     * Lists the handshakes that are associated with the organization that the requesting user is part of. The
     * <code>ListHandshakesForOrganization</code> operation returns a list of handshake structures. Each structure
     * contains details and status about a handshake.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listHandshakesForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHandshakesForOrganization operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.ListHandshakesForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListHandshakesForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHandshakesForOrganizationResult> listHandshakesForOrganizationAsync(
            ListHandshakesForOrganizationRequest listHandshakesForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<ListHandshakesForOrganizationRequest, ListHandshakesForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Lists the organizational units (OUs) in a parent organizational unit or root.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listOrganizationalUnitsForParentRequest
     * @return A Java Future containing the result of the ListOrganizationalUnitsForParent operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.ListOrganizationalUnitsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListOrganizationalUnitsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationalUnitsForParentResult> listOrganizationalUnitsForParentAsync(
            ListOrganizationalUnitsForParentRequest listOrganizationalUnitsForParentRequest);

    /**
     * <p>
     * Lists the organizational units (OUs) in a parent organizational unit or root.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listOrganizationalUnitsForParentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationalUnitsForParent operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.ListOrganizationalUnitsForParent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListOrganizationalUnitsForParent"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationalUnitsForParentResult> listOrganizationalUnitsForParentAsync(
            ListOrganizationalUnitsForParentRequest listOrganizationalUnitsForParentRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationalUnitsForParentRequest, ListOrganizationalUnitsForParentResult> asyncHandler);

    /**
     * <p>
     * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or
     * account. This operation, along with <a>ListChildren</a> enables you to traverse the tree structure that makes up
     * this root.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listParentsRequest
     * @return A Java Future containing the result of the ListParents operation returned by the service.
     * @sample AWSOrganizationsAsync.ListParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListParents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListParentsResult> listParentsAsync(ListParentsRequest listParentsRequest);

    /**
     * <p>
     * Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or
     * account. This operation, along with <a>ListChildren</a> enables you to traverse the tree structure that makes up
     * this root.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listParentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListParents operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListParents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListParents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListParentsResult> listParentsAsync(ListParentsRequest listParentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListParentsRequest, ListParentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of all policies in an organization of a specified type.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AWSOrganizationsAsync.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Retrieves the list of all policies in an organization of a specified type.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account.
     * You must specify the policy type that you want included in the returned list.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listPoliciesForTargetRequest
     * @return A Java Future containing the result of the ListPoliciesForTarget operation returned by the service.
     * @sample AWSOrganizationsAsync.ListPoliciesForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPoliciesForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesForTargetResult> listPoliciesForTargetAsync(ListPoliciesForTargetRequest listPoliciesForTargetRequest);

    /**
     * <p>
     * Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account.
     * You must specify the policy type that you want included in the returned list.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listPoliciesForTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPoliciesForTarget operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListPoliciesForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPoliciesForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesForTargetResult> listPoliciesForTargetAsync(ListPoliciesForTargetRequest listPoliciesForTargetRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesForTargetRequest, ListPoliciesForTargetResult> asyncHandler);

    /**
     * <p>
     * Lists the roots that are defined in the current organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listRootsRequest
     * @return A Java Future containing the result of the ListRoots operation returned by the service.
     * @sample AWSOrganizationsAsync.ListRoots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListRoots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRootsResult> listRootsAsync(ListRootsRequest listRootsRequest);

    /**
     * <p>
     * Lists the roots that are defined in the current organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listRootsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoots operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListRoots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListRoots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRootsResult> listRootsAsync(ListRootsRequest listRootsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRootsRequest, ListRootsResult> asyncHandler);

    /**
     * <p>
     * Lists all the roots, OUs, and accounts to which the specified policy is attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @return A Java Future containing the result of the ListTargetsForPolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.ListTargetsForPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTargetsForPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(ListTargetsForPolicyRequest listTargetsForPolicyRequest);

    /**
     * <p>
     * Lists all the roots, OUs, and accounts to which the specified policy is attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param listTargetsForPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetsForPolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListTargetsForPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTargetsForPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsForPolicyResult> listTargetsForPolicyAsync(ListTargetsForPolicyRequest listTargetsForPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsForPolicyRequest, ListTargetsForPolicyResult> asyncHandler);

    /**
     * <p>
     * Moves an account from its current source parent root or OU to the specified destination parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param moveAccountRequest
     * @return A Java Future containing the result of the MoveAccount operation returned by the service.
     * @sample AWSOrganizationsAsync.MoveAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/MoveAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MoveAccountResult> moveAccountAsync(MoveAccountRequest moveAccountRequest);

    /**
     * <p>
     * Moves an account from its current source parent root or OU to the specified destination parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param moveAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MoveAccount operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.MoveAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/MoveAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MoveAccountResult> moveAccountAsync(MoveAccountRequest moveAccountRequest,
            com.amazonaws.handlers.AsyncHandler<MoveAccountRequest, MoveAccountResult> asyncHandler);

    /**
     * <p>
     * Removes the specified account from the organization.
     * </p>
     * <p>
     * The removed account becomes a stand-alone account that is not a member of any organization. It is no longer
     * subject to any organization control policies (OCPs) and is responsible for its own bill payments. The
     * organization's master account is no longer charged for any expenses accrued by the member account after it is
     * removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account. Member accounts can remove themselves
     * with <a>LeaveOrganization</a> instead.
     * </p>
     * <important>
     * <p>
     * You can remove only existing accounts that were invited to join the organization. You cannot remove accounts that
     * were created by AWS Organizations.
     * </p>
     * </important>
     * 
     * @param removeAccountFromOrganizationRequest
     * @return A Java Future containing the result of the RemoveAccountFromOrganization operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.RemoveAccountFromOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RemoveAccountFromOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAccountFromOrganizationResult> removeAccountFromOrganizationAsync(
            RemoveAccountFromOrganizationRequest removeAccountFromOrganizationRequest);

    /**
     * <p>
     * Removes the specified account from the organization.
     * </p>
     * <p>
     * The removed account becomes a stand-alone account that is not a member of any organization. It is no longer
     * subject to any organization control policies (OCPs) and is responsible for its own bill payments. The
     * organization's master account is no longer charged for any expenses accrued by the member account after it is
     * removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account. Member accounts can remove themselves
     * with <a>LeaveOrganization</a> instead.
     * </p>
     * <important>
     * <p>
     * You can remove only existing accounts that were invited to join the organization. You cannot remove accounts that
     * were created by AWS Organizations.
     * </p>
     * </important>
     * 
     * @param removeAccountFromOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveAccountFromOrganization operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.RemoveAccountFromOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RemoveAccountFromOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveAccountFromOrganizationResult> removeAccountFromOrganizationAsync(
            RemoveAccountFromOrganizationRequest removeAccountFromOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveAccountFromOrganizationRequest, RemoveAccountFromOrganizationResult> asyncHandler);

    /**
     * <p>
     * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain
     * in place, and any attached policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updateOrganizationalUnitRequest
     * @return A Java Future containing the result of the UpdateOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsync.UpdateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationalUnitResult> updateOrganizationalUnitAsync(UpdateOrganizationalUnitRequest updateOrganizationalUnitRequest);

    /**
     * <p>
     * Renames the specified organizational unit (OU). The ID and ARN do not change. The child OUs and accounts remain
     * in place, and any attached policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updateOrganizationalUnitRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationalUnit operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.UpdateOrganizationalUnit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdateOrganizationalUnit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationalUnitResult> updateOrganizationalUnitAsync(UpdateOrganizationalUnitRequest updateOrganizationalUnitRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResult> asyncHandler);

    /**
     * <p>
     * Updates an existing policy with a new name, description, or content. If any parameter is not supplied, that value
     * remains unchanged. Note that you cannot change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updatePolicyRequest
     * @return A Java Future containing the result of the UpdatePolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest updatePolicyRequest);

    /**
     * <p>
     * Updates an existing policy with a new name, description, or content. If any parameter is not supplied, that value
     * remains unchanged. Note that you cannot change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's master account.
     * </p>
     * 
     * @param updatePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdatePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest updatePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResult> asyncHandler);

}

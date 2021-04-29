/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an
 * <i>organization</i> and centrally manage your accounts and their resources.
 * </p>
 * <p>
 * This guide provides descriptions of the Organizations operations. For more information about using this service, see
 * the <a href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html">AWS Organizations User
 * Guide</a>.
 * </p>
 * <p>
 * <b>Support and feedback for AWS Organizations</b>
 * </p>
 * <p>
 * We welcome your feedback. Send your comments to <a
 * href="mailto:feedback-awsorganizations@amazon.com">feedback-awsorganizations@amazon.com</a> or post your feedback and
 * questions in the <a href="http://forums.aws.amazon.com/forum.jspa?forumID=219">AWS Organizations support forum</a>.
 * For more information about the AWS support forums, see <a href="http://forums.aws.amazon.com/help.jspa">Forums
 * Help</a>.
 * </p>
 * <p>
 * <b>Endpoint to call When using the AWS CLI or the AWS SDK</b>
 * </p>
 * <p>
 * For the current release of Organizations, specify the <code>us-east-1</code> region for all AWS API and AWS CLI calls
 * made from the commercial AWS Regions outside of China. If calling from one of the AWS Regions in China, then specify
 * <code>cn-northwest-1</code>. You can do this in the AWS CLI by using these parameters and commands:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the following parameter with each command to specify both the endpoint and its region:
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.us-east-1.amazonaws.com</code> <i>(from commercial AWS Regions outside of
 * China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--endpoint-url https://organizations.cn-northwest-1.amazonaws.com.cn</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the default endpoint, but configure your default region with this command:
 * </p>
 * <p>
 * <code>aws configure set default.region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>aws configure set default.region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the following parameter with each command to specify the endpoint:
 * </p>
 * <p>
 * <code>--region us-east-1</code> <i>(from commercial AWS Regions outside of China)</i>
 * </p>
 * <p>
 * or
 * </p>
 * <p>
 * <code>--region cn-northwest-1</code> <i>(from AWS Regions in China)</i>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Organizations supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by AWS CloudTrail, you can determine which requests the
 * Organizations service received, who made the request and when, and so on. For more about AWS Organizations and its
 * support for AWS CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_incident-response.html#orgs_cloudtrail-integration"
 * >Logging AWS Organizations Events with AWS CloudTrail</a> in the <i>AWS Organizations User Guide</i>. To learn more
 * about AWS CloudTrail, including how to turn it on and find your log files, see the <a
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
     * <b>Invitation to join</b> or <b>Approve all features request</b> handshakes: only a principal from the member
     * account.
     * </p>
     * <p>
     * The user who calls the API for an invitation to join must have the <code>organizations:AcceptHandshake</code>
     * permission. If you enabled all features in the organization, the user must also have the
     * <code>iam:CreateServiceLinkedRole</code> permission so that AWS Organizations can create the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integration_services.html#orgs_integration_service-linked-roles"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Enable all features final confirmation</b> handshake: only a principal from the management account.
     * </p>
     * <p>
     * For more information about invitations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html">Inviting an
     * AWS Account to Join Your Organization</a> in the <i>AWS Organizations User Guide.</i> For more information about
     * requests to enable all features in the organization, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
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
     * <b>Invitation to join</b> or <b>Approve all features request</b> handshakes: only a principal from the member
     * account.
     * </p>
     * <p>
     * The user who calls the API for an invitation to join must have the <code>organizations:AcceptHandshake</code>
     * permission. If you enabled all features in the organization, the user must also have the
     * <code>iam:CreateServiceLinkedRole</code> permission so that AWS Organizations can create the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integration_services.html#orgs_integration_service-linked-roles"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Enable all features final confirmation</b> handshake: only a principal from the management account.
     * </p>
     * <p>
     * For more information about invitations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_invites.html">Inviting an
     * AWS Account to Join Your Organization</a> in the <i>AWS Organizations User Guide.</i> For more information about
     * requests to enable all features in the organization, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
     * </p>
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
     * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects
     * accounts depends on the type of policy. Refer to the <i>AWS Organizations User Guide</i> for information about
     * each policy type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects
     * accounts depends on the type of policy. Refer to the <i>AWS Organizations User Guide</i> for information about
     * each policy type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * <p>
     * After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
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
     * <p>
     * After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
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
     * This is an asynchronous request that AWS performs in the background. Because <code>CreateAccount</code> operates
     * asynchronously, it can return a successful completion message even though account initialization might still be
     * in progress. You might need to wait a few minutes before you can successfully access the account. To check the
     * status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Id</code> member of the <code>CreateAccountStatus</code> response element from this operation to
     * provide as a parameter to the <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with AWS Organizations, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_security_incident-response.html#orgs_cloudtrail-integration"
     * >Logging and monitoring in AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The user who calls the API to create an account must have the <code>organizations:CreateAccount</code>
     * permission. If you enabled all features in the organization, AWS Organizations creates the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants users in the management account administrator
     * permissions in the new member account. Principals in the management account can assume the role. AWS
     * Organizations clones the company name and address information for the new account from the organization's
     * management account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
     * information required for the account to operate as a standalone account, such as a payment method and signing the
     * end user license agreement (EULA) is <i>not</i> automatically collected. If you must remove an account from your
     * organization later, you can do so only after you provide the missing information. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateAccount</code> to create multiple temporary accounts isn't recommended. You can only close an
     * account from the Billing and Cost Management Console, and you must be signed in as the root user. For information
     * on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
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
     * This is an asynchronous request that AWS performs in the background. Because <code>CreateAccount</code> operates
     * asynchronously, it can return a successful completion message even though account initialization might still be
     * in progress. You might need to wait a few minutes before you can successfully access the account. To check the
     * status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Id</code> member of the <code>CreateAccountStatus</code> response element from this operation to
     * provide as a parameter to the <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with AWS Organizations, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_security_incident-response.html#orgs_cloudtrail-integration"
     * >Logging and monitoring in AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The user who calls the API to create an account must have the <code>organizations:CreateAccount</code>
     * permission. If you enabled all features in the organization, AWS Organizations creates the required
     * service-linked role named <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * AWS Organizations preconfigures the new member account with a role (named
     * <code>OrganizationAccountAccessRole</code> by default) that grants users in the management account administrator
     * permissions in the new member account. Principals in the management account can assume the role. AWS
     * Organizations clones the company name and address information for the new account from the organization's
     * management account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
     * information required for the account to operate as a standalone account, such as a payment method and signing the
     * end user license agreement (EULA) is <i>not</i> automatically collected. If you must remove an account from your
     * organization later, you can do so only after you provide the missing information. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateAccount</code> to create multiple temporary accounts isn't recommended. You can only close an
     * account from the Billing and Cost Management Console, and you must be signed in as the root user. For information
     * on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
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
     * This action is available if all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're authorized to create accounts in the AWS GovCloud (US) Region. For more information on the AWS GovCloud
     * (US) Region, see the <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/welcome.html"> <i>AWS
     * GovCloud User Guide</i>.</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * You already have an account in the AWS GovCloud (US) Region that is paired with a management account of an
     * organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call this action from the management account of your organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You have the <code>organizations:CreateGovCloudAccount</code> permission.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS Organizations automatically creates the required service-linked role named
     * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts, but you should also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that AWS CloudTrail is enabled to store logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an S3 bucket for AWS CloudTrail log storage.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/verifying-cloudtrail.html">Verifying AWS CloudTrail
     * Is Enabled</a> in the <i>AWS GovCloud User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * The tags are attached to the commercial account associated with the GovCloud account, rather than the GovCloud
     * account itself. To add tags to the GovCloud account, call the <a>TagResource</a> operation in the GovCloud Region
     * after the new GovCloud account exists.
     * </p>
     * <p>
     * You call this action from the management account of your organization in the commercial Region to create a
     * standalone AWS account in the AWS GovCloud (US) Region. After the account is created, the management account of
     * an organization in the AWS GovCloud (US) Region can invite it to that organization. For more information on
     * inviting standalone accounts in the AWS GovCloud (US) to join an organization, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS Organizations</a>
     * in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * Calling <code>CreateGovCloudAccount</code> is an asynchronous request that AWS performs in the background.
     * Because <code>CreateGovCloudAccount</code> operates asynchronously, it can return a successful completion message
     * even though account initialization might still be in progress. You might need to wait a few minutes before you
     * can successfully access the account. To check the status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to provide as a parameter to the
     * <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html">Monitoring the Activity in
     * Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * When you call the <code>CreateGovCloudAccount</code> action, you create two accounts: a standalone account in the
     * AWS GovCloud (US) Region and an associated account in the commercial Region for billing and support purposes. The
     * account in the commercial Region is automatically a member of the organization whose credentials made the
     * request. Both accounts are associated with the same email address.
     * </p>
     * <p>
     * A role is created in the new account in the commercial Region that allows the management account in the
     * organization in the commercial Region to assume it. An AWS GovCloud (US) account is then created and associated
     * with the commercial account that you just created. A role is also created in the new AWS GovCloud (US) account
     * that can be assumed by the AWS GovCloud (US) account that is associated with the management account of the
     * commercial organization. For more information and to view a diagram that explains how account access works, see
     * <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     * Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
     * information required for the account to operate as a standalone account is <i>not</i> automatically collected.
     * This includes a payment method and signing the end user license agreement (EULA). If you must remove an account
     * from your organization later, you can do so only after you provide the missing information. Follow the steps at
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateGovCloudAccount</code> to create multiple temporary accounts isn't recommended. You can only
     * close an account from the AWS Billing and Cost Management console, and you must be signed in as the root user.
     * For information on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createGovCloudAccountRequest
     * @return A Java Future containing the result of the CreateGovCloudAccount operation returned by the service.
     * @sample AWSOrganizationsAsync.CreateGovCloudAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateGovCloudAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGovCloudAccountResult> createGovCloudAccountAsync(CreateGovCloudAccountRequest createGovCloudAccountRequest);

    /**
     * <p>
     * This action is available if all of the following are true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You're authorized to create accounts in the AWS GovCloud (US) Region. For more information on the AWS GovCloud
     * (US) Region, see the <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/welcome.html"> <i>AWS
     * GovCloud User Guide</i>.</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * You already have an account in the AWS GovCloud (US) Region that is paired with a management account of an
     * organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call this action from the management account of your organization in the commercial Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You have the <code>organizations:CreateGovCloudAccount</code> permission.
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS Organizations automatically creates the required service-linked role named
     * <code>AWSServiceRoleForOrganizations</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs"
     * >AWS Organizations and Service-Linked Roles</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts, but you should also do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Verify that AWS CloudTrail is enabled to store logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create an S3 bucket for AWS CloudTrail log storage.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/verifying-cloudtrail.html">Verifying AWS CloudTrail
     * Is Enabled</a> in the <i>AWS GovCloud User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * The tags are attached to the commercial account associated with the GovCloud account, rather than the GovCloud
     * account itself. To add tags to the GovCloud account, call the <a>TagResource</a> operation in the GovCloud Region
     * after the new GovCloud account exists.
     * </p>
     * <p>
     * You call this action from the management account of your organization in the commercial Region to create a
     * standalone AWS account in the AWS GovCloud (US) Region. After the account is created, the management account of
     * an organization in the AWS GovCloud (US) Region can invite it to that organization. For more information on
     * inviting standalone accounts in the AWS GovCloud (US) to join an organization, see <a
     * href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS Organizations</a>
     * in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * Calling <code>CreateGovCloudAccount</code> is an asynchronous request that AWS performs in the background.
     * Because <code>CreateGovCloudAccount</code> operates asynchronously, it can return a successful completion message
     * even though account initialization might still be in progress. You might need to wait a few minutes before you
     * can successfully access the account. To check the status of the request, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>OperationId</code> response element from this operation to provide as a parameter to the
     * <a>DescribeCreateAccountStatus</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * Check the AWS CloudTrail log for the <code>CreateAccountResult</code> event. For information on using AWS
     * CloudTrail with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_monitoring.html">Monitoring the Activity in
     * Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <p>
     * When you call the <code>CreateGovCloudAccount</code> action, you create two accounts: a standalone account in the
     * AWS GovCloud (US) Region and an associated account in the commercial Region for billing and support purposes. The
     * account in the commercial Region is automatically a member of the organization whose credentials made the
     * request. Both accounts are associated with the same email address.
     * </p>
     * <p>
     * A role is created in the new account in the commercial Region that allows the management account in the
     * organization in the commercial Region to assume it. An AWS GovCloud (US) account is then created and associated
     * with the commercial account that you just created. A role is also created in the new AWS GovCloud (US) account
     * that can be assumed by the AWS GovCloud (US) account that is associated with the management account of the
     * commercial organization. For more information and to view a diagram that explains how account access works, see
     * <a href="http://docs.aws.amazon.com/govcloud-us/latest/UserGuide/govcloud-organizations.html">AWS
     * Organizations</a> in the <i>AWS GovCloud User Guide.</i>
     * </p>
     * <p>
     * For more information about creating accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html">Creating an
     * AWS Account in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
     * information required for the account to operate as a standalone account is <i>not</i> automatically collected.
     * This includes a payment method and signing the end user license agreement (EULA). If you must remove an account
     * from your organization later, you can do so only after you provide the missing information. Follow the steps at
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization as a member account</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that you exceeded your account limits for the organization, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you get an exception that indicates that the operation failed because your organization is still initializing,
     * wait one hour and then try again. If the error persists, contact <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using <code>CreateGovCloudAccount</code> to create multiple temporary accounts isn't recommended. You can only
     * close an account from the AWS Billing and Cost Management console, and you must be signed in as the root user.
     * For information on the requirements and process for closing an account, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html">Closing an AWS
     * Account</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * When you create a member account with this operation, you can choose whether to create the account with the
     * <b>IAM User and Role Access to Billing Information</b> switch enabled. If you enable it, IAM users and roles that
     * have appropriate permissions can view billing information for the account. If you disable it, only the account
     * root user can access billing information. For information about how to disable this switch for an account, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html">Granting Access to Your
     * Billing Information and Tools</a>.
     * </p>
     * </note>
     * 
     * @param createGovCloudAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGovCloudAccount operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.CreateGovCloudAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateGovCloudAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGovCloudAccountResult> createGovCloudAccountAsync(CreateGovCloudAccountRequest createGovCloudAccountRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGovCloudAccountRequest, CreateGovCloudAccountResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS organization. The account whose user is calling the <code>CreateOrganization</code> operation
     * automatically becomes the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >management account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is to become the new organization's
     * management account. The principal must also have the relevant IAM permissions.
     * </p>
     * <p>
     * By default (or if you set the <code>FeatureSet</code> parameter to <code>ALL</code>), the new organization is
     * created with all features enabled and service control policies automatically enabled in the root. If you instead
     * choose to create the organization supporting only the consolidated billing features by setting the
     * <code>FeatureSet</code> parameter to <code>CONSOLIDATED_BILLING"</code>, no policy types are enabled by default,
     * and you can't use organization policies
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
     * Creates an AWS organization. The account whose user is calling the <code>CreateOrganization</code> operation
     * automatically becomes the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >management account</a> of the new organization.
     * </p>
     * <p>
     * This operation must be called using credentials from the account that is to become the new organization's
     * management account. The principal must also have the relevant IAM permissions.
     * </p>
     * <p>
     * By default (or if you set the <code>FeatureSet</code> parameter to <code>ALL</code>), the new organization is
     * created with all features enabled and service control policies automatically enabled in the root. If you instead
     * choose to create the organization supporting only the consolidated billing features by setting the
     * <code>FeatureSet</code> parameter to <code>CONSOLIDATED_BILLING"</code>, no policy types are enabled by default,
     * and you can't use organization policies
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
     * you to organize your accounts to apply policies according to your business requirements. The number of levels
     * deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control
     * policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing Organizational
     * Units</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * you to organize your accounts to apply policies according to your business requirements. The number of levels
     * deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control
     * policies, the limit is five.
     * </p>
     * <p>
     * For more information about OUs, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_ous.html">Managing Organizational
     * Units</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual
     * AWS account.
     * </p>
     * <p>
     * For more information about policies and their use, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html">Managing Organization
     * Policies</a>.
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual
     * AWS account.
     * </p>
     * <p>
     * For more information about policies and their use, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html">Managing Organization
     * Policies</a>.
     * </p>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * can use <a>CancelHandshake</a> instead. The originator can't reactivate a declined request, but can reinitiate
     * the process with a new handshake request.
     * </p>
     * <p>
     * After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
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
     * can use <a>CancelHandshake</a> instead. The originator can't reactivate a declined request, but can reinitiate
     * the process with a new handshake request.
     * </p>
     * <p>
     * After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
     * that, it's deleted.
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
     * Deletes the organization. You can delete an organization only by using credentials from the management account.
     * The organization must be empty of member accounts.
     * </p>
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
     * Deletes the organization. You can delete an organization only by using credentials from the management account.
     * The organization must be empty of member accounts.
     * </p>
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
     * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs
     * from the OU that you want to delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs
     * from the OU that you want to delete.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * policy from all organizational units (OUs), roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * policy from all organizational units (OUs), roots, and accounts.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Removes the specified member AWS account as a delegated administrator for the specified AWS service.
     * </p>
     * <important>
     * <p>
     * Deregistering a delegated administrator can have unintended impacts on the functionality of the enabled AWS
     * service. See the documentation for the enabled service before you deregister a delegated administrator so that
     * you understand any potential impacts.
     * </p>
     * </important>
     * <p>
     * You can run this action only for AWS services that support this feature. For a current list of services that
     * support it, see the column <i>Supports Delegated Administrator</i> in the table at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS Services
     * that you can use with AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param deregisterDelegatedAdministratorRequest
     * @return A Java Future containing the result of the DeregisterDelegatedAdministrator operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.DeregisterDelegatedAdministrator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeregisterDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDelegatedAdministratorResult> deregisterDelegatedAdministratorAsync(
            DeregisterDelegatedAdministratorRequest deregisterDelegatedAdministratorRequest);

    /**
     * <p>
     * Removes the specified member AWS account as a delegated administrator for the specified AWS service.
     * </p>
     * <important>
     * <p>
     * Deregistering a delegated administrator can have unintended impacts on the functionality of the enabled AWS
     * service. See the documentation for the enabled service before you deregister a delegated administrator so that
     * you understand any potential impacts.
     * </p>
     * </important>
     * <p>
     * You can run this action only for AWS services that support this feature. For a current list of services that
     * support it, see the column <i>Supports Delegated Administrator</i> in the table at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS Services
     * that you can use with AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param deregisterDelegatedAdministratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterDelegatedAdministrator operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.DeregisterDelegatedAdministrator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DeregisterDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDelegatedAdministratorResult> deregisterDelegatedAdministratorAsync(
            DeregisterDelegatedAdministratorRequest deregisterDelegatedAdministratorRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResult> asyncHandler);

    /**
     * <p>
     * Retrieves AWS Organizations-related information about the specified account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Retrieves AWS Organizations-related information about the specified account.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Returns the contents of the effective policy for specified policy type and account. The effective policy is the
     * aggregation of any policies of the specified type that the account inherits, plus any policy of that type that is
     * directly attached to the account.
     * </p>
     * <p>
     * This operation applies only to policy types <i>other</i> than service control policies (SCPs).
     * </p>
     * <p>
     * For more information about policy inheritance, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html">How Policy
     * Inheritance Works</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describeEffectivePolicyRequest
     * @return A Java Future containing the result of the DescribeEffectivePolicy operation returned by the service.
     * @sample AWSOrganizationsAsync.DescribeEffectivePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeEffectivePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEffectivePolicyResult> describeEffectivePolicyAsync(DescribeEffectivePolicyRequest describeEffectivePolicyRequest);

    /**
     * <p>
     * Returns the contents of the effective policy for specified policy type and account. The effective policy is the
     * aggregation of any policies of the specified type that the account inherits, plus any policy of that type that is
     * directly attached to the account.
     * </p>
     * <p>
     * This operation applies only to policy types <i>other</i> than service control policies (SCPs).
     * </p>
     * <p>
     * For more information about policy inheritance, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies-inheritance.html">How Policy
     * Inheritance Works</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param describeEffectivePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEffectivePolicy operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DescribeEffectivePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeEffectivePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEffectivePolicyResult> describeEffectivePolicyAsync(DescribeEffectivePolicyRequest describeEffectivePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEffectivePolicyRequest, DescribeEffectivePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a previously requested handshake. The handshake ID comes from the response to the
     * original <a>InviteAccountToOrganization</a> operation that generated the handshake.
     * </p>
     * <p>
     * You can access handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> for
     * only 30 days after they change to that state. They're then deleted and no longer accessible.
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
     * You can access handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> for
     * only 30 days after they change to that state. They're then deleted and no longer accessible.
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
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can disable it separately at the root level
     * with <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the status of policy types for a specified root.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * Even if a policy type is shown as available in the organization, you can disable it separately at the root level
     * with <a>DisablePolicyType</a>. Use <a>ListRoots</a> to see the status of policy types for a specified root.
     * </p>
     * </note>
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
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Retrieves information about a policy.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Retrieves information about a policy.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Detaches a policy from a target root, organizational unit (OU), or account.
     * </p>
     * <important>
     * <p>
     * If the policy being detached is a service control policy (SCP), the changes to permissions for AWS Identity and
     * Access Management (IAM) users and roles in affected accounts are immediate.
     * </p>
     * </important>
     * <p>
     * Every root, OU, and account must have at least one SCP attached. If you want to replace the default
     * <code>FullAWSAccess</code> policy with an SCP that limits the permissions that can be delegated, you must attach
     * the replacement SCP before you can remove the default SCP. This is the authorization strategy of an
     * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/SCP_strategies.html#orgs_policies_allowlist
     * ">allow list</a>". If you instead attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached, and specify <code>"Effect": "Deny"</code> in the second SCP to override the
     * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or any other attached SCP), you're using
     * the authorization strategy of a
     * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/SCP_strategies
     * .html#orgs_policies_denylist">deny list</a>".
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Detaches a policy from a target root, organizational unit (OU), or account.
     * </p>
     * <important>
     * <p>
     * If the policy being detached is a service control policy (SCP), the changes to permissions for AWS Identity and
     * Access Management (IAM) users and roles in affected accounts are immediate.
     * </p>
     * </important>
     * <p>
     * Every root, OU, and account must have at least one SCP attached. If you want to replace the default
     * <code>FullAWSAccess</code> policy with an SCP that limits the permissions that can be delegated, you must attach
     * the replacement SCP before you can remove the default SCP. This is the authorization strategy of an
     * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/SCP_strategies.html#orgs_policies_allowlist
     * ">allow list</a>". If you instead attach a second SCP and leave the <code>FullAWSAccess</code> SCP still
     * attached, and specify <code>"Effect": "Deny"</code> in the second SCP to override the
     * <code>"Effect": "Allow"</code> in the <code>FullAWSAccess</code> policy (or any other attached SCP), you're using
     * the authorization strategy of a
     * "<a href="https://docs.aws.amazon.com/organizations/latest/userguide/SCP_strategies
     * .html#orgs_policies_denylist">deny list</a>".
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Disables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you disable integration, the specified service no longer can create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * <i>new</i> accounts in your organization. This means the service can't perform operations on your behalf on any
     * new accounts in your organization. The service can still perform operations in older accounts until the service
     * completes its clean-up from AWS Organizations.
     * </p>
     * <important>
     * <p>
     * We <b> <i>strongly recommend</i> </b> that you don't use this command to disable integration between AWS
     * Organizations and the specified AWS service. Instead, use the console or commands that are provided by the
     * specified service. This lets the trusted service perform any required initialization when enabling trusted
     * access, such as creating any required resources and any required clean up of resources when disabling trusted
     * access.
     * </p>
     * <p>
     * For information about how to disable trusted service access to your organization using the trusted service, see
     * the <b>Learn more</b> link under the <b>Supports Trusted Access</b> column at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS services
     * that you can use with AWS Organizations</a>. on this page.
     * </p>
     * <p>
     * If you disable access by using this command, it causes the following actions to occur:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The service can no longer create a service-linked role in the accounts in your organization. This means that the
     * service can't perform operations on your behalf on any new accounts in your organization. The service can still
     * perform operations in older accounts until the service completes its clean-up from AWS Organizations.
     * </p>
     * </li>
     * <li>
     * <p>
     * The service can no longer perform tasks in the member accounts in the organization, unless those operations are
     * explicitly permitted by the IAM policies that are attached to your roles. This includes any data aggregation from
     * the member accounts to the management account, or to a delegated administrator account, where relevant.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some services detect this and clean up any remaining data or resources related to the integration, while other
     * services stop accessing the organization but leave any historical data and configuration in place to support a
     * possible re-enabling of the integration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using the other service's console or commands to disable the integration ensures that the other service is aware
     * that it can clean up any resources that are required only for the integration. How the service cleans up its
     * resources in the organization's accounts depends on that service. For more information, see the documentation for
     * the other AWS service.
     * </p>
     * </important>
     * <p>
     * After you perform the <code>DisableAWSServiceAccess</code> operation, the specified service can no longer perform
     * operations in your organization's accounts
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param disableAWSServiceAccessRequest
     * @return A Java Future containing the result of the DisableAWSServiceAccess operation returned by the service.
     * @sample AWSOrganizationsAsync.DisableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableAWSServiceAccessResult> disableAWSServiceAccessAsync(DisableAWSServiceAccessRequest disableAWSServiceAccessRequest);

    /**
     * <p>
     * Disables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you disable integration, the specified service no longer can create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * <i>new</i> accounts in your organization. This means the service can't perform operations on your behalf on any
     * new accounts in your organization. The service can still perform operations in older accounts until the service
     * completes its clean-up from AWS Organizations.
     * </p>
     * <important>
     * <p>
     * We <b> <i>strongly recommend</i> </b> that you don't use this command to disable integration between AWS
     * Organizations and the specified AWS service. Instead, use the console or commands that are provided by the
     * specified service. This lets the trusted service perform any required initialization when enabling trusted
     * access, such as creating any required resources and any required clean up of resources when disabling trusted
     * access.
     * </p>
     * <p>
     * For information about how to disable trusted service access to your organization using the trusted service, see
     * the <b>Learn more</b> link under the <b>Supports Trusted Access</b> column at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS services
     * that you can use with AWS Organizations</a>. on this page.
     * </p>
     * <p>
     * If you disable access by using this command, it causes the following actions to occur:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The service can no longer create a service-linked role in the accounts in your organization. This means that the
     * service can't perform operations on your behalf on any new accounts in your organization. The service can still
     * perform operations in older accounts until the service completes its clean-up from AWS Organizations.
     * </p>
     * </li>
     * <li>
     * <p>
     * The service can no longer perform tasks in the member accounts in the organization, unless those operations are
     * explicitly permitted by the IAM policies that are attached to your roles. This includes any data aggregation from
     * the member accounts to the management account, or to a delegated administrator account, where relevant.
     * </p>
     * </li>
     * <li>
     * <p>
     * Some services detect this and clean up any remaining data or resources related to the integration, while other
     * services stop accessing the organization but leave any historical data and configuration in place to support a
     * possible re-enabling of the integration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using the other service's console or commands to disable the integration ensures that the other service is aware
     * that it can clean up any resources that are required only for the integration. How the service cleans up its
     * resources in the organization's accounts depends on that service. For more information, see the documentation for
     * the other AWS service.
     * </p>
     * </important>
     * <p>
     * After you perform the <code>DisableAWSServiceAccess</code> operation, the specified service can no longer perform
     * operations in your organization's accounts
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param disableAWSServiceAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableAWSServiceAccess operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.DisableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DisableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableAWSServiceAccessResult> disableAWSServiceAccessAsync(DisableAWSServiceAccessRequest disableAWSServiceAccessRequest,
            com.amazonaws.handlers.AsyncHandler<DisableAWSServiceAccessRequest, DisableAWSServiceAccessResult> asyncHandler);

    /**
     * <p>
     * Disables an organizational policy type in a root. A policy of a certain type can be attached to entities in a
     * root only if that type is enabled in the root. After you perform this operation, you no longer can attach
     * policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can
     * undo this by using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. If you disable a policy type for a root, it
     * still appears enabled for the organization if <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features</a> are enabled for the organization. AWS recommends that you first use <a>ListRoots</a> to see the
     * status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * To view the status of available policy types in the organization, use <a>DescribeOrganization</a>.
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
     * Disables an organizational policy type in a root. A policy of a certain type can be attached to entities in a
     * root only if that type is enabled in the root. After you perform this operation, you no longer can attach
     * policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can
     * undo this by using the <a>EnablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. If you disable a policy type for a root, it
     * still appears enabled for the organization if <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features</a> are enabled for the organization. AWS recommends that you first use <a>ListRoots</a> to see the
     * status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * To view the status of available policy types in the organization, use <a>DescribeOrganization</a>.
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
     * Enables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you enable integration, you allow the specified service to create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * all the accounts in your organization. This allows the service to perform operations on your behalf in your
     * organization and its accounts.
     * </p>
     * <important>
     * <p>
     * We recommend that you enable integration between AWS Organizations and the specified AWS service by using the
     * console or commands that are provided by the specified service. Doing so ensures that the service is aware that
     * it can create the resources that are required for the integration. How the service creates those resources in the
     * organization's accounts depends on that service. For more information, see the documentation for the other AWS
     * service.
     * </p>
     * </important>
     * <p>
     * For more information about enabling services to integrate with AWS Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account and only if the organization has <a
     * href
     * ="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">enabled
     * all features</a>.
     * </p>
     * 
     * @param enableAWSServiceAccessRequest
     * @return A Java Future containing the result of the EnableAWSServiceAccess operation returned by the service.
     * @sample AWSOrganizationsAsync.EnableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAWSServiceAccessResult> enableAWSServiceAccessAsync(EnableAWSServiceAccessRequest enableAWSServiceAccessRequest);

    /**
     * <p>
     * Enables the integration of an AWS service (the service that is specified by <code>ServicePrincipal</code>) with
     * AWS Organizations. When you enable integration, you allow the specified service to create a <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html">service-linked role</a> in
     * all the accounts in your organization. This allows the service to perform operations on your behalf in your
     * organization and its accounts.
     * </p>
     * <important>
     * <p>
     * We recommend that you enable integration between AWS Organizations and the specified AWS service by using the
     * console or commands that are provided by the specified service. Doing so ensures that the service is aware that
     * it can create the resources that are required for the integration. How the service creates those resources in the
     * organization's accounts depends on that service. For more information, see the documentation for the other AWS
     * service.
     * </p>
     * </important>
     * <p>
     * For more information about enabling services to integrate with AWS Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account and only if the organization has <a
     * href
     * ="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">enabled
     * all features</a>.
     * </p>
     * 
     * @param enableAWSServiceAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableAWSServiceAccess operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.EnableAWSServiceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAWSServiceAccess"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAWSServiceAccessResult> enableAWSServiceAccessAsync(EnableAWSServiceAccessRequest enableAWSServiceAccessRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAWSServiceAccessRequest, EnableAWSServiceAccessResult> asyncHandler);

    /**
     * <p>
     * Enables all features in an organization. This enables the use of organization policies that can restrict the
     * services and actions that can be called in each account. Until you enable all features, you have access only to
     * consolidated billing, and you can't use any of the advanced account administration features that AWS
     * Organizations supports. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created explicitly with only the consolidated billing
     * features enabled. Calling this operation sends a handshake to every invited account in the organization. The
     * feature set change can be finalized and the additional features enabled only after all administrators in the
     * invited accounts approve the change by accepting the handshake.
     * </p>
     * </important>
     * <p>
     * After you enable all features, you can separately enable or disable individual policy types in a root using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. To see the status of policy types in a root, use
     * <a>ListRoots</a>.
     * </p>
     * <p>
     * After all invited member accounts accept the handshake, you finalize the feature set change by accepting the
     * handshake that contains <code>"Action": "ENABLE_ALL_FEATURES"</code>. This completes the change.
     * </p>
     * <p>
     * After you enable all features in your organization, the management account in the organization can apply policies
     * on all member accounts. These policies can restrict what users and even administrators in those accounts can do.
     * The management account can apply policies that prevent accounts from leaving the organization. Ensure that your
     * account administrators are aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param enableAllFeaturesRequest
     * @return A Java Future containing the result of the EnableAllFeatures operation returned by the service.
     * @sample AWSOrganizationsAsync.EnableAllFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAllFeatures"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAllFeaturesResult> enableAllFeaturesAsync(EnableAllFeaturesRequest enableAllFeaturesRequest);

    /**
     * <p>
     * Enables all features in an organization. This enables the use of organization policies that can restrict the
     * services and actions that can be called in each account. Until you enable all features, you have access only to
     * consolidated billing, and you can't use any of the advanced account administration features that AWS
     * Organizations supports. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     * >Enabling All Features in Your Organization</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <important>
     * <p>
     * This operation is required only for organizations that were created explicitly with only the consolidated billing
     * features enabled. Calling this operation sends a handshake to every invited account in the organization. The
     * feature set change can be finalized and the additional features enabled only after all administrators in the
     * invited accounts approve the change by accepting the handshake.
     * </p>
     * </important>
     * <p>
     * After you enable all features, you can separately enable or disable individual policy types in a root using
     * <a>EnablePolicyType</a> and <a>DisablePolicyType</a>. To see the status of policy types in a root, use
     * <a>ListRoots</a>.
     * </p>
     * <p>
     * After all invited member accounts accept the handshake, you finalize the feature set change by accepting the
     * handshake that contains <code>"Action": "ENABLE_ALL_FEATURES"</code>. This completes the change.
     * </p>
     * <p>
     * After you enable all features in your organization, the management account in the organization can apply policies
     * on all member accounts. These policies can restrict what users and even administrators in those accounts can do.
     * The management account can apply policies that prevent accounts from leaving the organization. Ensure that your
     * account administrators are aware of this.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param enableAllFeaturesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableAllFeatures operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.EnableAllFeatures
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnableAllFeatures"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableAllFeaturesResult> enableAllFeaturesAsync(EnableAllFeaturesRequest enableAllFeaturesRequest,
            com.amazonaws.handlers.AsyncHandler<EnableAllFeaturesRequest, EnableAllFeaturesResult> asyncHandler);

    /**
     * <p>
     * Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type
     * to the root, any organizational unit (OU), or account in that root. You can undo this by using the
     * <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. AWS recommends that you first use
     * <a>ListRoots</a> to see the status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * You can enable a policy type in a root only if that policy type is available in the organization. To view the
     * status of available policy types in the organization, use <a>DescribeOrganization</a>.
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
     * to the root, any organizational unit (OU), or account in that root. You can undo this by using the
     * <a>DisablePolicyType</a> operation.
     * </p>
     * <p>
     * This is an asynchronous request that AWS performs in the background. AWS recommends that you first use
     * <a>ListRoots</a> to see the status of policy types for a specified root, and then use this operation.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * <p>
     * You can enable a policy type in a root only if that policy type is available in the organization. To view the
     * status of available policy types in the organization, use <a>DescribeOrganization</a>.
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
     * Sends an invitation to another account to join your organization as a member account. AWS Organizations sends
     * email on your behalf to the email address that is associated with the other account's owner. The invitation is
     * implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can invite AWS accounts only from the same seller as the management account. For example, if your
     * organization's management account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in
     * India, you can invite only other AISPL accounts to your organization. You can't combine accounts from AISPL and
     * AWS or from any other AWS seller. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/useconsolidatedbilliing-India.html"
     * >Consolidated Billing in India</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you receive an exception that indicates that you exceeded your account limits for the organization or that the
     * operation failed because your organization is still initializing, wait one hour and then try again. If the error
     * persists after an hour, contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Sends an invitation to another account to join your organization as a member account. AWS Organizations sends
     * email on your behalf to the email address that is associated with the other account's owner. The invitation is
     * implemented as a <a>Handshake</a> whose details are in the response.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can invite AWS accounts only from the same seller as the management account. For example, if your
     * organization's management account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in
     * India, you can invite only other AISPL accounts to your organization. You can't combine accounts from AISPL and
     * AWS or from any other AWS seller. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/useconsolidatedbilliing-India.html"
     * >Consolidated Billing in India</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you receive an exception that indicates that you exceeded your account limits for the organization or that the
     * operation failed because your organization is still initializing, wait one hour and then try again. If the error
     * persists after an hour, contact <a href="https://console.aws.amazon.com/support/home#/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * If the request includes tags, then the requester must have the <code>organizations:TagResource</code> permission.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * that wants to leave. To remove a member account as a user in the management account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the organization.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * The management account in an organization with all features enabled can set service control policies (SCPs) that
     * can restrict what administrators of member accounts can do. This includes preventing them from successfully
     * calling <code>LeaveOrganization</code> and leaving the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization as a member account only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required of standalone accounts is <i>not</i> automatically
     * collected. For each account that you want to make standalone, you must perform the following steps. If any of the
     * steps are already completed for this account, that step doesn't appear.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a support plan
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide and verify the required contact information
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide a current payment method
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account
     * isn't attached to an organization. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The account that you want to leave must not be a delegated administrator account for any AWS service enabled for
     * your organization. If the account is a delegated administrator, you must first change the delegated administrator
     * account to another account that is remaining in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization only after you enable IAM user access to billing in your account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * After the account leaves the organization, all tags that were attached to the account object in the organization
     * are deleted. AWS accounts outside of an organization do not support tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newly created account has a waiting period before it can be removed from its organization. If you get an error
     * that indicates that a wait period is required, then try again in a few days.
     * </p>
     * </li>
     * </ul>
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
     * that wants to leave. To remove a member account as a user in the management account, use
     * <a>RemoveAccountFromOrganization</a> instead.
     * </p>
     * <p>
     * This operation can be called only from a member account in the organization.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * The management account in an organization with all features enabled can set service control policies (SCPs) that
     * can restrict what administrators of member accounts can do. This includes preventing them from successfully
     * calling <code>LeaveOrganization</code> and leaving the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization as a member account only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required of standalone accounts is <i>not</i> automatically
     * collected. For each account that you want to make standalone, you must perform the following steps. If any of the
     * steps are already completed for this account, that step doesn't appear.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Choose a support plan
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide and verify the required contact information
     * </p>
     * </li>
     * <li>
     * <p>
     * Provide a current payment method
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the account
     * isn't attached to an organization. Follow the steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The account that you want to leave must not be a delegated administrator account for any AWS service enabled for
     * your organization. If the account is a delegated administrator, you must first change the delegated administrator
     * account to another account that is remaining in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can leave an organization only after you enable IAM user access to billing in your account. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * After the account leaves the organization, all tags that were attached to the account object in the organization
     * are deleted. AWS accounts outside of an organization do not support tags.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newly created account has a waiting period before it can be removed from its organization. If you get an error
     * that indicates that a wait period is required, then try again in a few days.
     * </p>
     * </li>
     * </ul>
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
     * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this
     * list creates the resources that it requires for the integration, it can perform operations on your organization
     * and its accounts.
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * currently work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listAWSServiceAccessForOrganizationRequest
     * @return A Java Future containing the result of the ListAWSServiceAccessForOrganization operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.ListAWSServiceAccessForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAWSServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAWSServiceAccessForOrganizationResult> listAWSServiceAccessForOrganizationAsync(
            ListAWSServiceAccessForOrganizationRequest listAWSServiceAccessForOrganizationRequest);

    /**
     * <p>
     * Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this
     * list creates the resources that it requires for the integration, it can perform operations on your organization
     * and its accounts.
     * </p>
     * <p>
     * For more information about integrating other services with AWS Organizations, including the list of services that
     * currently work with Organizations, see <a
     * href="http://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html">Integrating AWS
     * Organizations with Other AWS Services</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listAWSServiceAccessForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAWSServiceAccessForOrganization operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.ListAWSServiceAccessForOrganization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAWSServiceAccessForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAWSServiceAccessForOrganizationResult> listAWSServiceAccessForOrganizationAsync(
            ListAWSServiceAccessForOrganizationRequest listAWSServiceAccessForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<ListAWSServiceAccessForOrganizationRequest, ListAWSServiceAccessForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational
     * unit (OU), use the <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Lists all the accounts in the organization. To request only the accounts in a specified root or organizational
     * unit (OU), use the <a>ListAccountsForParent</a> operation instead.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * (OU). If you specify the root, you get a list of all the accounts that aren't in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU and not in any child OUs. To get a list of all accounts in the
     * organization, use the <a>ListAccounts</a> operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * (OU). If you specify the root, you get a list of all the accounts that aren't in any OU. If you specify an OU,
     * you get a list of all the accounts in only that OU and not in any child OUs. To get a list of all accounts in the
     * organization, use the <a>ListAccounts</a> operation.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root.
     * This operation, along with <a>ListParents</a> enables you to traverse the tree structure that makes up this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root.
     * This operation, along with <a>ListParents</a> enables you to traverse the tree structure that makes up this root.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Lists the AWS accounts that are designated as delegated administrators in this organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listDelegatedAdministratorsRequest
     * @return A Java Future containing the result of the ListDelegatedAdministrators operation returned by the service.
     * @sample AWSOrganizationsAsync.ListDelegatedAdministrators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedAdministrators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDelegatedAdministratorsResult> listDelegatedAdministratorsAsync(
            ListDelegatedAdministratorsRequest listDelegatedAdministratorsRequest);

    /**
     * <p>
     * Lists the AWS accounts that are designated as delegated administrators in this organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listDelegatedAdministratorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDelegatedAdministrators operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListDelegatedAdministrators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedAdministrators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDelegatedAdministratorsResult> listDelegatedAdministratorsAsync(
            ListDelegatedAdministratorsRequest listDelegatedAdministratorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResult> asyncHandler);

    /**
     * <p>
     * List the AWS services for which the specified account is a delegated administrator.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listDelegatedServicesForAccountRequest
     * @return A Java Future containing the result of the ListDelegatedServicesForAccount operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.ListDelegatedServicesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedServicesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDelegatedServicesForAccountResult> listDelegatedServicesForAccountAsync(
            ListDelegatedServicesForAccountRequest listDelegatedServicesForAccountRequest);

    /**
     * <p>
     * List the AWS services for which the specified account is a delegated administrator.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listDelegatedServicesForAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDelegatedServicesForAccount operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.ListDelegatedServicesForAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListDelegatedServicesForAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDelegatedServicesForAccountResult> listDelegatedServicesForAccountAsync(
            ListDelegatedServicesForAccountRequest listDelegatedServicesForAccountRequest,
            com.amazonaws.handlers.AsyncHandler<ListDelegatedServicesForAccountRequest, ListDelegatedServicesForAccountResult> asyncHandler);

    /**
     * <p>
     * Lists the current handshakes that are associated with the account of the requesting user.
     * </p>
     * <p>
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
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
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
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
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Handshakes that are <code>ACCEPTED</code>, <code>DECLINED</code>, or <code>CANCELED</code> appear in the results
     * of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * <note>
     * <p>
     * In the current release, a child can have only a single parent.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * <note>
     * <p>
     * In the current release, a child can have only a single parent.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * <note>
     * <p>
     * Policy types can be enabled and disabled in roots. This is distinct from whether they're available in the
     * organization. When you enable all features, you make policy types available for use in that organization.
     * Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in
     * an organization, use <a>DescribeOrganization</a>.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * <note>
     * <p>
     * Policy types can be enabled and disabled in roots. This is distinct from whether they're available in the
     * organization. When you enable all features, you make policy types available for use in that organization.
     * Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in
     * an organization, use <a>DescribeOrganization</a>.
     * </p>
     * </note>
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
     * Lists tags that are attached to the specified resource.
     * </p>
     * <p>
     * You can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOrganizationsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags that are attached to the specified resource.
     * </p>
     * <p>
     * You can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists all the roots, organizational units (OUs), and accounts that the specified policy is attached to.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Lists all the roots, organizational units (OUs), and accounts that the specified policy is attached to.
     * </p>
     * <note>
     * <p>
     * Always check the <code>NextToken</code> response parameter for a <code>null</code> value when calling a
     * <code>List*</code> operation. These operations can occasionally return an empty set of results even when there
     * are more results available. The <code>NextToken</code> response parameter value is <code>null</code> <i>only</i>
     * when there are no more results to display.
     * </p>
     * </note>
     * <p>
     * This operation can be called only from the organization's management account or by a member account that is a
     * delegated administrator for an AWS service.
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
     * Moves an account from its current source parent root or organizational unit (OU) to the specified destination
     * parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Moves an account from its current source parent root or organizational unit (OU) to the specified destination
     * parent root or OU.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Enables the specified member account to administer the Organizations features of the specified AWS service. It
     * grants read-only access to AWS Organizations service data. The account still requires IAM permissions to access
     * and administer the AWS service.
     * </p>
     * <p>
     * You can run this action only for AWS services that support this feature. For a current list of services that
     * support it, see the column <i>Supports Delegated Administrator</i> in the table at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS Services
     * that you can use with AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param registerDelegatedAdministratorRequest
     * @return A Java Future containing the result of the RegisterDelegatedAdministrator operation returned by the
     *         service.
     * @sample AWSOrganizationsAsync.RegisterDelegatedAdministrator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RegisterDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDelegatedAdministratorResult> registerDelegatedAdministratorAsync(
            RegisterDelegatedAdministratorRequest registerDelegatedAdministratorRequest);

    /**
     * <p>
     * Enables the specified member account to administer the Organizations features of the specified AWS service. It
     * grants read-only access to AWS Organizations service data. The account still requires IAM permissions to access
     * and administer the AWS service.
     * </p>
     * <p>
     * You can run this action only for AWS services that support this feature. For a current list of services that
     * support it, see the column <i>Supports Delegated Administrator</i> in the table at <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html">AWS Services
     * that you can use with AWS Organizations</a> in the <i>AWS Organizations User Guide.</i>
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param registerDelegatedAdministratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterDelegatedAdministrator operation returned by the
     *         service.
     * @sample AWSOrganizationsAsyncHandler.RegisterDelegatedAdministrator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/RegisterDelegatedAdministrator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterDelegatedAdministratorResult> registerDelegatedAdministratorAsync(
            RegisterDelegatedAdministratorRequest registerDelegatedAdministratorRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResult> asyncHandler);

    /**
     * <p>
     * Removes the specified account from the organization.
     * </p>
     * <p>
     * The removed account becomes a standalone account that isn't a member of any organization. It's no longer subject
     * to any policies and is responsible for its own bill payments. The organization's management account is no longer
     * charged for any expenses accrued by the member account after it's removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account. Member accounts can remove
     * themselves with <a>LeaveOrganization</a> instead.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can remove an account from your organization only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required of standalone accounts is <i>not</i> automatically
     * collected. For an account that you want to make standalone, you must choose a support plan, provide and verify
     * the required contact information, and provide a current payment method. AWS uses the payment method to charge for
     * any billable (not free tier) AWS activity that occurs while the account isn't attached to an organization. To
     * remove an account that doesn't yet have this information, you must sign in as the member account and follow the
     * steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The account that you want to leave must not be a delegated administrator account for any AWS service enabled for
     * your organization. If the account is a delegated administrator, you must first change the delegated administrator
     * account to another account that is remaining in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * After the account leaves the organization, all tags that were attached to the account object in the organization
     * are deleted. AWS accounts outside of an organization do not support tags.
     * </p>
     * </li>
     * </ul>
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
     * The removed account becomes a standalone account that isn't a member of any organization. It's no longer subject
     * to any policies and is responsible for its own bill payments. The organization's management account is no longer
     * charged for any expenses accrued by the member account after it's removed from the organization.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account. Member accounts can remove
     * themselves with <a>LeaveOrganization</a> instead.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You can remove an account from your organization only if the account is configured with the information required
     * to operate as a standalone account. When you create an account in an organization using the AWS Organizations
     * console, API, or CLI commands, the information required of standalone accounts is <i>not</i> automatically
     * collected. For an account that you want to make standalone, you must choose a support plan, provide and verify
     * the required contact information, and provide a current payment method. AWS uses the payment method to charge for
     * any billable (not free tier) AWS activity that occurs while the account isn't attached to an organization. To
     * remove an account that doesn't yet have this information, you must sign in as the member account and follow the
     * steps at <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info"
     * > To leave an organization when all required account information has not yet been provided</a> in the <i>AWS
     * Organizations User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * The account that you want to leave must not be a delegated administrator account for any AWS service enabled for
     * your organization. If the account is a delegated administrator, you must first change the delegated administrator
     * account to another account that is remaining in the organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * After the account leaves the organization, all tags that were attached to the account object in the organization
     * are deleted. AWS accounts outside of an organization do not support tags.
     * </p>
     * </li>
     * </ul>
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
     * Adds one or more tags to the specified resource.
     * </p>
     * <p>
     * Currently, you can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOrganizationsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to the specified resource.
     * </p>
     * <p>
     * Currently, you can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes any tags with the specified keys from the specified resource.
     * </p>
     * <p>
     * You can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOrganizationsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes any tags with the specified keys from the specified resource.
     * </p>
     * <p>
     * You can attach tags to the following resources in AWS Organizations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account
     * </p>
     * </li>
     * <li>
     * <p>
     * Organization root
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU)
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy (any type)
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOrganizationsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Renames the specified organizational unit (OU). The ID and ARN don't change. The child OUs and accounts remain in
     * place, and any attached policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Renames the specified organizational unit (OU). The ID and ARN don't change. The child OUs and accounts remain in
     * place, and any attached policies of the OU remain attached.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Updates an existing policy with a new name, description, or content. If you don't supply any parameter, that
     * value remains unchanged. You can't change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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
     * Updates an existing policy with a new name, description, or content. If you don't supply any parameter, that
     * value remains unchanged. You can't change a policy's type.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
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

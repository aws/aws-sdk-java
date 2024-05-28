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
package com.amazonaws.services.verifiedpermissions;

import javax.annotation.Generated;

import com.amazonaws.services.verifiedpermissions.model.*;

/**
 * Interface for accessing Amazon Verified Permissions asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.verifiedpermissions.AbstractAmazonVerifiedPermissionsAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Verified Permissions is a permissions management service from Amazon Web Services. You can use Verified
 * Permissions to manage permissions for your application, and authorize user access based on those permissions. Using
 * Verified Permissions, application developers can grant access based on information about the users, resources, and
 * requested actions. You can also evaluate additional information like group membership, attributes of the resources,
 * and session context, such as time of request and IP addresses. Verified Permissions manages these permissions by
 * letting you create and store authorization policies for your applications, such as consumer-facing web sites and
 * enterprise business systems.
 * </p>
 * <p>
 * Verified Permissions uses Cedar as the policy language to express your permission requirements. Cedar supports both
 * role-based access control (RBAC) and attribute-based access control (ABAC) authorization models.
 * </p>
 * <p>
 * For more information about configuring, administering, and using Amazon Verified Permissions in your applications,
 * see the <a href="https://docs.aws.amazon.com/verifiedpermissions/latest/userguide/">Amazon Verified Permissions User
 * Guide</a>.
 * </p>
 * <p>
 * For more information about the Cedar policy language, see the <a href="https://docs.cedarpolicy.com/">Cedar Policy
 * Language Guide</a>.
 * </p>
 * <important>
 * <p>
 * When you write Cedar policies that reference principals, resources and actions, you can define the unique identifiers
 * used for each of those elements. We strongly recommend that you follow these best practices:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Use values like universally unique identifiers (UUIDs) for all principal and resource identifiers.</b>
 * </p>
 * <p>
 * For example, if user <code>jane</code> leaves the company, and you later let someone else use the name
 * <code>jane</code>, then that new user automatically gets access to everything granted by policies that still
 * reference <code>User::"jane"</code>. Cedar can’t distinguish between the new user and the old. This applies to both
 * principal and resource identifiers. Always use identifiers that are guaranteed unique and never reused to ensure that
 * you don’t unintentionally grant access because of the presence of an old identifier in a policy.
 * </p>
 * <p>
 * Where you use a UUID for an entity, we recommend that you follow it with the // comment specifier and the ‘friendly’
 * name of your entity. This helps to make your policies easier to understand. For example: principal ==
 * User::"a1b2c3d4-e5f6-a1b2-c3d4-EXAMPLE11111", // alice
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Do not include personally identifying, confidential, or sensitive information as part of the unique identifier for
 * your principals or resources.</b> These identifiers are included in log entries shared in CloudTrail trails.
 * </p>
 * </li>
 * </ul>
 * </important>
 * <p>
 * Several operations return structures that appear similar, but have different purposes. As new functionality is added
 * to the product, the structure used in a parameter of one operation might need to change in a way that wouldn't make
 * sense for the same parameter in a different operation. To help you understand the purpose of each, the following
 * naming convention is used for the structures:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Parameter type structures that end in <code>Detail</code> are used in <code>Get</code> operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parameter type structures that end in <code>Item</code> are used in <code>List</code> operations.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parameter type structures that use neither suffix are used in the mutating (create and update) operations.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonVerifiedPermissionsAsync extends AmazonVerifiedPermissions {

    /**
     * <p>
     * Makes a series of decisions about multiple authorization requests for one principal or resource. Each request
     * contains the equivalent content of an <code>IsAuthorized</code> request: principal, action, resource, and
     * context. Either the <code>principal</code> or the <code>resource</code> parameter must be identical across all
     * requests. For example, Verified Permissions won't evaluate a pair of requests where <code>bob</code> views
     * <code>photo1</code> and <code>alice</code> views <code>photo2</code>. Authorization of <code>bob</code> to view
     * <code>photo1</code> and <code>photo2</code>, or <code>bob</code> and <code>alice</code> to view
     * <code>photo1</code>, are valid batches.
     * </p>
     * <p>
     * The request is evaluated against all policies in the specified policy store that match the entities that you
     * declare. The result of the decisions is a series of <code>Allow</code> or <code>Deny</code> responses, along with
     * the IDs of the policies that produced each decision.
     * </p>
     * <p>
     * The <code>entities</code> of a <code>BatchIsAuthorized</code> API request can contain up to 100 principals and up
     * to 100 resources. The <code>requests</code> of a <code>BatchIsAuthorized</code> API request can contain up to 30
     * requests.
     * </p>
     * <note>
     * <p>
     * The <code>BatchIsAuthorized</code> operation doesn't have its own IAM permission. To authorize this operation for
     * Amazon Web Services principals, include the permission <code>verifiedpermissions:IsAuthorized</code> in their IAM
     * policies.
     * </p>
     * </note>
     * 
     * @param batchIsAuthorizedRequest
     * @return A Java Future containing the result of the BatchIsAuthorized operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.BatchIsAuthorized
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorized"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchIsAuthorizedResult> batchIsAuthorizedAsync(BatchIsAuthorizedRequest batchIsAuthorizedRequest);

    /**
     * <p>
     * Makes a series of decisions about multiple authorization requests for one principal or resource. Each request
     * contains the equivalent content of an <code>IsAuthorized</code> request: principal, action, resource, and
     * context. Either the <code>principal</code> or the <code>resource</code> parameter must be identical across all
     * requests. For example, Verified Permissions won't evaluate a pair of requests where <code>bob</code> views
     * <code>photo1</code> and <code>alice</code> views <code>photo2</code>. Authorization of <code>bob</code> to view
     * <code>photo1</code> and <code>photo2</code>, or <code>bob</code> and <code>alice</code> to view
     * <code>photo1</code>, are valid batches.
     * </p>
     * <p>
     * The request is evaluated against all policies in the specified policy store that match the entities that you
     * declare. The result of the decisions is a series of <code>Allow</code> or <code>Deny</code> responses, along with
     * the IDs of the policies that produced each decision.
     * </p>
     * <p>
     * The <code>entities</code> of a <code>BatchIsAuthorized</code> API request can contain up to 100 principals and up
     * to 100 resources. The <code>requests</code> of a <code>BatchIsAuthorized</code> API request can contain up to 30
     * requests.
     * </p>
     * <note>
     * <p>
     * The <code>BatchIsAuthorized</code> operation doesn't have its own IAM permission. To authorize this operation for
     * Amazon Web Services principals, include the permission <code>verifiedpermissions:IsAuthorized</code> in their IAM
     * policies.
     * </p>
     * </note>
     * 
     * @param batchIsAuthorizedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchIsAuthorized operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.BatchIsAuthorized
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorized"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchIsAuthorizedResult> batchIsAuthorizedAsync(BatchIsAuthorizedRequest batchIsAuthorizedRequest,
            com.amazonaws.handlers.AsyncHandler<BatchIsAuthorizedRequest, BatchIsAuthorizedResult> asyncHandler);

    /**
     * <p>
     * Makes a series of decisions about multiple authorization requests for one token. The principal in this request
     * comes from an external identity source in the form of an identity or access token, formatted as a <a
     * href="https://wikipedia.org/wiki/JSON_Web_Token">JSON web token (JWT)</a>. The information in the parameters can
     * also define additional context that Verified Permissions can include in the evaluations.
     * </p>
     * <p>
     * The request is evaluated against all policies in the specified policy store that match the entities that you
     * provide in the entities declaration and in the token. The result of the decisions is a series of
     * <code>Allow</code> or <code>Deny</code> responses, along with the IDs of the policies that produced each
     * decision.
     * </p>
     * <p>
     * The <code>entities</code> of a <code>BatchIsAuthorizedWithToken</code> API request can contain up to 100
     * resources and up to 99 user groups. The <code>requests</code> of a <code>BatchIsAuthorizedWithToken</code> API
     * request can contain up to 30 requests.
     * </p>
     * <note>
     * <p>
     * The <code>BatchIsAuthorizedWithToken</code> operation doesn't have its own IAM permission. To authorize this
     * operation for Amazon Web Services principals, include the permission
     * <code>verifiedpermissions:IsAuthorizedWithToken</code> in their IAM policies.
     * </p>
     * </note>
     * 
     * @param batchIsAuthorizedWithTokenRequest
     * @return A Java Future containing the result of the BatchIsAuthorizedWithToken operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.BatchIsAuthorizedWithToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorizedWithToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchIsAuthorizedWithTokenResult> batchIsAuthorizedWithTokenAsync(
            BatchIsAuthorizedWithTokenRequest batchIsAuthorizedWithTokenRequest);

    /**
     * <p>
     * Makes a series of decisions about multiple authorization requests for one token. The principal in this request
     * comes from an external identity source in the form of an identity or access token, formatted as a <a
     * href="https://wikipedia.org/wiki/JSON_Web_Token">JSON web token (JWT)</a>. The information in the parameters can
     * also define additional context that Verified Permissions can include in the evaluations.
     * </p>
     * <p>
     * The request is evaluated against all policies in the specified policy store that match the entities that you
     * provide in the entities declaration and in the token. The result of the decisions is a series of
     * <code>Allow</code> or <code>Deny</code> responses, along with the IDs of the policies that produced each
     * decision.
     * </p>
     * <p>
     * The <code>entities</code> of a <code>BatchIsAuthorizedWithToken</code> API request can contain up to 100
     * resources and up to 99 user groups. The <code>requests</code> of a <code>BatchIsAuthorizedWithToken</code> API
     * request can contain up to 30 requests.
     * </p>
     * <note>
     * <p>
     * The <code>BatchIsAuthorizedWithToken</code> operation doesn't have its own IAM permission. To authorize this
     * operation for Amazon Web Services principals, include the permission
     * <code>verifiedpermissions:IsAuthorizedWithToken</code> in their IAM policies.
     * </p>
     * </note>
     * 
     * @param batchIsAuthorizedWithTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchIsAuthorizedWithToken operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.BatchIsAuthorizedWithToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorizedWithToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchIsAuthorizedWithTokenResult> batchIsAuthorizedWithTokenAsync(
            BatchIsAuthorizedWithTokenRequest batchIsAuthorizedWithTokenRequest,
            com.amazonaws.handlers.AsyncHandler<BatchIsAuthorizedWithTokenRequest, BatchIsAuthorizedWithTokenResult> asyncHandler);

    /**
     * <p>
     * Creates a reference to an Amazon Cognito user pool as an external identity provider (IdP).
     * </p>
     * <p>
     * After you create an identity source, you can use the identities provided by the IdP as proxies for the principal
     * in authorization queries that use the <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
     * >IsAuthorizedWithToken</a> operation. These identities take the form of tokens that contain claims about the
     * user, such as IDs, attributes and group memberships. Amazon Cognito provides both identity tokens and access
     * tokens, and Verified Permissions can use either or both. Any combination of identity and access tokens results in
     * the same Cedar principal. Verified Permissions automatically translates the information about the identities into
     * the standard Cedar attributes that can be evaluated by your policies. Because the Amazon Cognito identity and
     * access tokens can contain different information, the tokens you choose to use determine which principal
     * attributes are available to access when evaluating Cedar policies.
     * </p>
     * <important>
     * <p>
     * If you delete a Amazon Cognito user pool or user, tokens from that deleted pool or that deleted user continue to
     * be usable until they expire.
     * </p>
     * </important> <note>
     * <p>
     * To reference a user from this identity source in your Cedar policies, use the following syntax.
     * </p>
     * <p>
     * <i>IdentityType::"&lt;CognitoUserPoolIdentifier&gt;|&lt;CognitoClientId&gt;</i>
     * </p>
     * <p>
     * Where <code>IdentityType</code> is the string that you provide to the <code>PrincipalEntityType</code> parameter
     * for this operation. The <code>CognitoUserPoolId</code> and <code>CognitoClientId</code> are defined by the Amazon
     * Cognito user pool.
     * </p>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createIdentitySourceRequest
     * @return A Java Future containing the result of the CreateIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.CreateIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreateIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentitySourceResult> createIdentitySourceAsync(CreateIdentitySourceRequest createIdentitySourceRequest);

    /**
     * <p>
     * Creates a reference to an Amazon Cognito user pool as an external identity provider (IdP).
     * </p>
     * <p>
     * After you create an identity source, you can use the identities provided by the IdP as proxies for the principal
     * in authorization queries that use the <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
     * >IsAuthorizedWithToken</a> operation. These identities take the form of tokens that contain claims about the
     * user, such as IDs, attributes and group memberships. Amazon Cognito provides both identity tokens and access
     * tokens, and Verified Permissions can use either or both. Any combination of identity and access tokens results in
     * the same Cedar principal. Verified Permissions automatically translates the information about the identities into
     * the standard Cedar attributes that can be evaluated by your policies. Because the Amazon Cognito identity and
     * access tokens can contain different information, the tokens you choose to use determine which principal
     * attributes are available to access when evaluating Cedar policies.
     * </p>
     * <important>
     * <p>
     * If you delete a Amazon Cognito user pool or user, tokens from that deleted pool or that deleted user continue to
     * be usable until they expire.
     * </p>
     * </important> <note>
     * <p>
     * To reference a user from this identity source in your Cedar policies, use the following syntax.
     * </p>
     * <p>
     * <i>IdentityType::"&lt;CognitoUserPoolIdentifier&gt;|&lt;CognitoClientId&gt;</i>
     * </p>
     * <p>
     * Where <code>IdentityType</code> is the string that you provide to the <code>PrincipalEntityType</code> parameter
     * for this operation. The <code>CognitoUserPoolId</code> and <code>CognitoClientId</code> are defined by the Amazon
     * Cognito user pool.
     * </p>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createIdentitySourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.CreateIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreateIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentitySourceResult> createIdentitySourceAsync(CreateIdentitySourceRequest createIdentitySourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIdentitySourceRequest, CreateIdentitySourceResult> asyncHandler);

    /**
     * <p>
     * Creates a Cedar policy and saves it in the specified policy store. You can create either a static policy or a
     * policy linked to a policy template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a static policy, provide the Cedar policy text in the <code>StaticPolicy</code> section of the
     * <code>PolicyDefinition</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a policy that is dynamically linked to a policy template, specify the policy template ID and the
     * principal and resource to associate with this policy in the <code>templateLinked</code> section of the
     * <code>PolicyDefinition</code>. If the policy template is ever updated, any policies linked to the policy template
     * automatically use the updated template.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Creating a policy causes it to be validated against the schema in the policy store. If the policy doesn't pass
     * validation, the operation fails and the policy isn't stored.
     * </p>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createPolicyRequest
     * @return A Java Future containing the result of the CreatePolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates a Cedar policy and saves it in the specified policy store. You can create either a static policy or a
     * policy linked to a policy template.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a static policy, provide the Cedar policy text in the <code>StaticPolicy</code> section of the
     * <code>PolicyDefinition</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a policy that is dynamically linked to a policy template, specify the policy template ID and the
     * principal and resource to associate with this policy in the <code>templateLinked</code> section of the
     * <code>PolicyDefinition</code>. If the policy template is ever updated, any policies linked to the policy template
     * automatically use the updated template.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Creating a policy causes it to be validated against the schema in the policy store. If the policy doesn't pass
     * validation, the operation fails and the policy isn't stored.
     * </p>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(CreatePolicyRequest createPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a policy store. A policy store is a container for policy resources.
     * </p>
     * <note>
     * <p>
     * Although <a href="https://docs.cedarpolicy.com/schema/schema.html#namespace">Cedar supports multiple
     * namespaces</a>, Verified Permissions currently supports only one namespace per policy store.
     * </p>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createPolicyStoreRequest
     * @return A Java Future containing the result of the CreatePolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.CreatePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyStoreResult> createPolicyStoreAsync(CreatePolicyStoreRequest createPolicyStoreRequest);

    /**
     * <p>
     * Creates a policy store. A policy store is a container for policy resources.
     * </p>
     * <note>
     * <p>
     * Although <a href="https://docs.cedarpolicy.com/schema/schema.html#namespace">Cedar supports multiple
     * namespaces</a>, Verified Permissions currently supports only one namespace per policy store.
     * </p>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createPolicyStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.CreatePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyStoreResult> createPolicyStoreAsync(CreatePolicyStoreRequest createPolicyStoreRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyStoreRequest, CreatePolicyStoreResult> asyncHandler);

    /**
     * <p>
     * Creates a policy template. A template can use placeholders for the principal and resource. A template must be
     * instantiated into a policy by associating it with specific principals and resources to use for the placeholders.
     * That instantiated policy can then be considered in authorization decisions. The instantiated policy works
     * identically to any other policy, except that it is dynamically linked to the template. If the template changes,
     * then any policies that are linked to that template are immediately updated as well.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createPolicyTemplateRequest
     * @return A Java Future containing the result of the CreatePolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.CreatePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyTemplateResult> createPolicyTemplateAsync(CreatePolicyTemplateRequest createPolicyTemplateRequest);

    /**
     * <p>
     * Creates a policy template. A template can use placeholders for the principal and resource. A template must be
     * instantiated into a policy by associating it with specific principals and resources to use for the placeholders.
     * That instantiated policy can then be considered in authorization decisions. The instantiated policy works
     * identically to any other policy, except that it is dynamically linked to the template. If the template changes,
     * then any policies that are linked to that template are immediately updated as well.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param createPolicyTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.CreatePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePolicyTemplateResult> createPolicyTemplateAsync(CreatePolicyTemplateRequest createPolicyTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyTemplateRequest, CreatePolicyTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes an identity source that references an identity provider (IdP) such as Amazon Cognito. After you delete
     * the identity source, you can no longer use tokens for identities from that identity source to represent
     * principals in authorization queries made using <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
     * >IsAuthorizedWithToken</a>. operations.
     * </p>
     * 
     * @param deleteIdentitySourceRequest
     * @return A Java Future containing the result of the DeleteIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.DeleteIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeleteIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentitySourceResult> deleteIdentitySourceAsync(DeleteIdentitySourceRequest deleteIdentitySourceRequest);

    /**
     * <p>
     * Deletes an identity source that references an identity provider (IdP) such as Amazon Cognito. After you delete
     * the identity source, you can no longer use tokens for identities from that identity source to represent
     * principals in authorization queries made using <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
     * >IsAuthorizedWithToken</a>. operations.
     * </p>
     * 
     * @param deleteIdentitySourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.DeleteIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeleteIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentitySourceResult> deleteIdentitySourceAsync(DeleteIdentitySourceRequest deleteIdentitySourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentitySourceRequest, DeleteIdentitySourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy from the policy store.
     * </p>
     * <p>
     * This operation is idempotent; if you specify a policy that doesn't exist, the request response returns a
     * successful <code>HTTP 200</code> status code.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified policy from the policy store.
     * </p>
     * <p>
     * This operation is idempotent; if you specify a policy that doesn't exist, the request response returns a
     * successful <code>HTTP 200</code> status code.
     * </p>
     * 
     * @param deletePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy store.
     * </p>
     * <p>
     * This operation is idempotent. If you specify a policy store that does not exist, the request response will still
     * return a successful HTTP 200 status code.
     * </p>
     * 
     * @param deletePolicyStoreRequest
     * @return A Java Future containing the result of the DeletePolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.DeletePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyStoreResult> deletePolicyStoreAsync(DeletePolicyStoreRequest deletePolicyStoreRequest);

    /**
     * <p>
     * Deletes the specified policy store.
     * </p>
     * <p>
     * This operation is idempotent. If you specify a policy store that does not exist, the request response will still
     * return a successful HTTP 200 status code.
     * </p>
     * 
     * @param deletePolicyStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.DeletePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyStoreResult> deletePolicyStoreAsync(DeletePolicyStoreRequest deletePolicyStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyStoreRequest, DeletePolicyStoreResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified policy template from the policy store.
     * </p>
     * <important>
     * <p>
     * This operation also deletes any policies that were created from the specified policy template. Those policies are
     * immediately removed from all future API responses, and are asynchronously deleted from the policy store.
     * </p>
     * </important>
     * 
     * @param deletePolicyTemplateRequest
     * @return A Java Future containing the result of the DeletePolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.DeletePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyTemplateResult> deletePolicyTemplateAsync(DeletePolicyTemplateRequest deletePolicyTemplateRequest);

    /**
     * <p>
     * Deletes the specified policy template from the policy store.
     * </p>
     * <important>
     * <p>
     * This operation also deletes any policies that were created from the specified policy template. Those policies are
     * immediately removed from all future API responses, and are asynchronously deleted from the policy store.
     * </p>
     * </important>
     * 
     * @param deletePolicyTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.DeletePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyTemplateResult> deletePolicyTemplateAsync(DeletePolicyTemplateRequest deletePolicyTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyTemplateRequest, DeletePolicyTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details about the specified identity source.
     * </p>
     * 
     * @param getIdentitySourceRequest
     * @return A Java Future containing the result of the GetIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.GetIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentitySourceResult> getIdentitySourceAsync(GetIdentitySourceRequest getIdentitySourceRequest);

    /**
     * <p>
     * Retrieves the details about the specified identity source.
     * </p>
     * 
     * @param getIdentitySourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.GetIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentitySourceResult> getIdentitySourceAsync(GetIdentitySourceRequest getIdentitySourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentitySourceRequest, GetIdentitySourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Retrieves information about the specified policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves details about a policy store.
     * </p>
     * 
     * @param getPolicyStoreRequest
     * @return A Java Future containing the result of the GetPolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.GetPolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyStoreResult> getPolicyStoreAsync(GetPolicyStoreRequest getPolicyStoreRequest);

    /**
     * <p>
     * Retrieves details about a policy store.
     * </p>
     * 
     * @param getPolicyStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.GetPolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyStoreResult> getPolicyStoreAsync(GetPolicyStoreRequest getPolicyStoreRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyStoreRequest, GetPolicyStoreResult> asyncHandler);

    /**
     * <p>
     * Retrieve the details for the specified policy template in the specified policy store.
     * </p>
     * 
     * @param getPolicyTemplateRequest
     * @return A Java Future containing the result of the GetPolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.GetPolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyTemplateResult> getPolicyTemplateAsync(GetPolicyTemplateRequest getPolicyTemplateRequest);

    /**
     * <p>
     * Retrieve the details for the specified policy template in the specified policy store.
     * </p>
     * 
     * @param getPolicyTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.GetPolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyTemplateResult> getPolicyTemplateAsync(GetPolicyTemplateRequest getPolicyTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyTemplateRequest, GetPolicyTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieve the details for the specified schema in the specified policy store.
     * </p>
     * 
     * @param getSchemaRequest
     * @return A Java Future containing the result of the GetSchema operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest getSchemaRequest);

    /**
     * <p>
     * Retrieve the details for the specified schema in the specified policy store.
     * </p>
     * 
     * @param getSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchema operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest getSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<GetSchemaRequest, GetSchemaResult> asyncHandler);

    /**
     * <p>
     * Makes an authorization decision about a service request described in the parameters. The information in the
     * parameters can also define additional context that Verified Permissions can include in the evaluation. The
     * request is evaluated against all matching policies in the specified policy store. The result of the decision is
     * either <code>Allow</code> or <code>Deny</code>, along with a list of the policies that resulted in the decision.
     * </p>
     * 
     * @param isAuthorizedRequest
     * @return A Java Future containing the result of the IsAuthorized operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.IsAuthorized
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorized"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<IsAuthorizedResult> isAuthorizedAsync(IsAuthorizedRequest isAuthorizedRequest);

    /**
     * <p>
     * Makes an authorization decision about a service request described in the parameters. The information in the
     * parameters can also define additional context that Verified Permissions can include in the evaluation. The
     * request is evaluated against all matching policies in the specified policy store. The result of the decision is
     * either <code>Allow</code> or <code>Deny</code>, along with a list of the policies that resulted in the decision.
     * </p>
     * 
     * @param isAuthorizedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IsAuthorized operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.IsAuthorized
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorized"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<IsAuthorizedResult> isAuthorizedAsync(IsAuthorizedRequest isAuthorizedRequest,
            com.amazonaws.handlers.AsyncHandler<IsAuthorizedRequest, IsAuthorizedResult> asyncHandler);

    /**
     * <p>
     * Makes an authorization decision about a service request described in the parameters. The principal in this
     * request comes from an external identity source in the form of an identity token formatted as a <a
     * href="https://wikipedia.org/wiki/JSON_Web_Token">JSON web token (JWT)</a>. The information in the parameters can
     * also define additional context that Verified Permissions can include in the evaluation. The request is evaluated
     * against all matching policies in the specified policy store. The result of the decision is either
     * <code>Allow</code> or <code>Deny</code>, along with a list of the policies that resulted in the decision.
     * </p>
     * <p>
     * At this time, Verified Permissions accepts tokens from only Amazon Cognito.
     * </p>
     * <p>
     * Verified Permissions validates each token that is specified in a request by checking its expiration date and its
     * signature.
     * </p>
     * <important>
     * <p>
     * If you delete a Amazon Cognito user pool or user, tokens from that deleted pool or that deleted user continue to
     * be usable until they expire.
     * </p>
     * </important>
     * 
     * @param isAuthorizedWithTokenRequest
     * @return A Java Future containing the result of the IsAuthorizedWithToken operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.IsAuthorizedWithToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorizedWithToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<IsAuthorizedWithTokenResult> isAuthorizedWithTokenAsync(IsAuthorizedWithTokenRequest isAuthorizedWithTokenRequest);

    /**
     * <p>
     * Makes an authorization decision about a service request described in the parameters. The principal in this
     * request comes from an external identity source in the form of an identity token formatted as a <a
     * href="https://wikipedia.org/wiki/JSON_Web_Token">JSON web token (JWT)</a>. The information in the parameters can
     * also define additional context that Verified Permissions can include in the evaluation. The request is evaluated
     * against all matching policies in the specified policy store. The result of the decision is either
     * <code>Allow</code> or <code>Deny</code>, along with a list of the policies that resulted in the decision.
     * </p>
     * <p>
     * At this time, Verified Permissions accepts tokens from only Amazon Cognito.
     * </p>
     * <p>
     * Verified Permissions validates each token that is specified in a request by checking its expiration date and its
     * signature.
     * </p>
     * <important>
     * <p>
     * If you delete a Amazon Cognito user pool or user, tokens from that deleted pool or that deleted user continue to
     * be usable until they expire.
     * </p>
     * </important>
     * 
     * @param isAuthorizedWithTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IsAuthorizedWithToken operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.IsAuthorizedWithToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorizedWithToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<IsAuthorizedWithTokenResult> isAuthorizedWithTokenAsync(IsAuthorizedWithTokenRequest isAuthorizedWithTokenRequest,
            com.amazonaws.handlers.AsyncHandler<IsAuthorizedWithTokenRequest, IsAuthorizedWithTokenResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all of the identity sources defined in the specified policy store.
     * </p>
     * 
     * @param listIdentitySourcesRequest
     * @return A Java Future containing the result of the ListIdentitySources operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.ListIdentitySources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListIdentitySources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentitySourcesResult> listIdentitySourcesAsync(ListIdentitySourcesRequest listIdentitySourcesRequest);

    /**
     * <p>
     * Returns a paginated list of all of the identity sources defined in the specified policy store.
     * </p>
     * 
     * @param listIdentitySourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentitySources operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.ListIdentitySources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListIdentitySources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentitySourcesResult> listIdentitySourcesAsync(ListIdentitySourcesRequest listIdentitySourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentitySourcesRequest, ListIdentitySourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all policies stored in the specified policy store.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Returns a paginated list of all policies stored in the specified policy store.
     * </p>
     * 
     * @param listPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all policy stores in the calling Amazon Web Services account.
     * </p>
     * 
     * @param listPolicyStoresRequest
     * @return A Java Future containing the result of the ListPolicyStores operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.ListPolicyStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyStores"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPolicyStoresResult> listPolicyStoresAsync(ListPolicyStoresRequest listPolicyStoresRequest);

    /**
     * <p>
     * Returns a paginated list of all policy stores in the calling Amazon Web Services account.
     * </p>
     * 
     * @param listPolicyStoresRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyStores operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.ListPolicyStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyStores"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPolicyStoresResult> listPolicyStoresAsync(ListPolicyStoresRequest listPolicyStoresRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyStoresRequest, ListPolicyStoresResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of all policy templates in the specified policy store.
     * </p>
     * 
     * @param listPolicyTemplatesRequest
     * @return A Java Future containing the result of the ListPolicyTemplates operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.ListPolicyTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPolicyTemplatesResult> listPolicyTemplatesAsync(ListPolicyTemplatesRequest listPolicyTemplatesRequest);

    /**
     * <p>
     * Returns a paginated list of all policy templates in the specified policy store.
     * </p>
     * 
     * @param listPolicyTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyTemplates operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.ListPolicyTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPolicyTemplatesResult> listPolicyTemplatesAsync(ListPolicyTemplatesRequest listPolicyTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyTemplatesRequest, ListPolicyTemplatesResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the policy schema in the specified policy store. The schema is used to validate any Cedar
     * policies and policy templates submitted to the policy store. Any changes to the schema validate only policies and
     * templates submitted after the schema change. Existing policies and templates are not re-evaluated against the
     * changed schema. If you later update a policy, then it is evaluated against the new schema at that time.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param putSchemaRequest
     * @return A Java Future containing the result of the PutSchema operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.PutSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PutSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSchemaResult> putSchemaAsync(PutSchemaRequest putSchemaRequest);

    /**
     * <p>
     * Creates or updates the policy schema in the specified policy store. The schema is used to validate any Cedar
     * policies and policy templates submitted to the policy store. Any changes to the schema validate only policies and
     * templates submitted after the schema change. Existing policies and templates are not re-evaluated against the
     * changed schema. If you later update a policy, then it is evaluated against the new schema at that time.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param putSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSchema operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.PutSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PutSchema" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutSchemaResult> putSchemaAsync(PutSchemaRequest putSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<PutSchemaRequest, PutSchemaResult> asyncHandler);

    /**
     * <p>
     * Updates the specified identity source to use a new identity provider (IdP) source, or to change the mapping of
     * identities from the IdP to a different principal entity type.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updateIdentitySourceRequest
     * @return A Java Future containing the result of the UpdateIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.UpdateIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentitySourceResult> updateIdentitySourceAsync(UpdateIdentitySourceRequest updateIdentitySourceRequest);

    /**
     * <p>
     * Updates the specified identity source to use a new identity provider (IdP) source, or to change the mapping of
     * identities from the IdP to a different principal entity type.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updateIdentitySourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentitySource operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.UpdateIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentitySourceResult> updateIdentitySourceAsync(UpdateIdentitySourceRequest updateIdentitySourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentitySourceRequest, UpdateIdentitySourceResult> asyncHandler);

    /**
     * <p>
     * Modifies a Cedar static policy in the specified policy store. You can change only certain elements of the <a
     * href=
     * "https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyInput.html#amazonverifiedpermissions-UpdatePolicy-request-UpdatePolicyDefinition"
     * >UpdatePolicyDefinition</a> parameter. You can directly update only static policies. To change a template-linked
     * policy, you must update the template instead, using <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyTemplate.html"
     * >UpdatePolicyTemplate</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If policy validation is enabled in the policy store, then updating a static policy causes Verified Permissions to
     * validate the policy against the schema in the policy store. If the updated static policy doesn't pass validation,
     * the operation fails and the update isn't stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you edit a static policy, you can change only certain elements of a static policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The action referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * A condition clause, such as when and unless.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change these elements of a static policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Changing a policy from a static policy to a template-linked policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Changing the effect of a static policy from permit or forbid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal referenced by a static policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource referenced by a static policy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To update a template-linked policy, you must update the template instead.
     * </p>
     * </li>
     * </ul>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updatePolicyRequest
     * @return A Java Future containing the result of the UpdatePolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest updatePolicyRequest);

    /**
     * <p>
     * Modifies a Cedar static policy in the specified policy store. You can change only certain elements of the <a
     * href=
     * "https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyInput.html#amazonverifiedpermissions-UpdatePolicy-request-UpdatePolicyDefinition"
     * >UpdatePolicyDefinition</a> parameter. You can directly update only static policies. To change a template-linked
     * policy, you must update the template instead, using <a
     * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyTemplate.html"
     * >UpdatePolicyTemplate</a>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If policy validation is enabled in the policy store, then updating a static policy causes Verified Permissions to
     * validate the policy against the schema in the policy store. If the updated static policy doesn't pass validation,
     * the operation fails and the update isn't stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you edit a static policy, you can change only certain elements of a static policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The action referenced by the policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * A condition clause, such as when and unless.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change these elements of a static policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Changing a policy from a static policy to a template-linked policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * Changing the effect of a static policy from permit or forbid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The principal referenced by a static policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource referenced by a static policy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To update a template-linked policy, you must update the template instead.
     * </p>
     * </li>
     * </ul>
     * </note> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updatePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePolicy operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyResult> updatePolicyAsync(UpdatePolicyRequest updatePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyRequest, UpdatePolicyResult> asyncHandler);

    /**
     * <p>
     * Modifies the validation setting for a policy store.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updatePolicyStoreRequest
     * @return A Java Future containing the result of the UpdatePolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.UpdatePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyStoreResult> updatePolicyStoreAsync(UpdatePolicyStoreRequest updatePolicyStoreRequest);

    /**
     * <p>
     * Modifies the validation setting for a policy store.
     * </p>
     * <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updatePolicyStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePolicyStore operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.UpdatePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyStoreResult> updatePolicyStoreAsync(UpdatePolicyStoreRequest updatePolicyStoreRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyStoreRequest, UpdatePolicyStoreResult> asyncHandler);

    /**
     * <p>
     * Updates the specified policy template. You can update only the description and the some elements of the <a href=
     * "https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyTemplate.html#amazonverifiedpermissions-UpdatePolicyTemplate-request-policyBody"
     * >policyBody</a>.
     * </p>
     * <important>
     * <p>
     * Changes you make to the policy template content are immediately (within the constraints of eventual consistency)
     * reflected in authorization decisions that involve all template-linked policies instantiated from this template.
     * </p>
     * </important> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updatePolicyTemplateRequest
     * @return A Java Future containing the result of the UpdatePolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsync.UpdatePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyTemplateResult> updatePolicyTemplateAsync(UpdatePolicyTemplateRequest updatePolicyTemplateRequest);

    /**
     * <p>
     * Updates the specified policy template. You can update only the description and the some elements of the <a href=
     * "https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_UpdatePolicyTemplate.html#amazonverifiedpermissions-UpdatePolicyTemplate-request-policyBody"
     * >policyBody</a>.
     * </p>
     * <important>
     * <p>
     * Changes you make to the policy template content are immediately (within the constraints of eventual consistency)
     * reflected in authorization decisions that involve all template-linked policies instantiated from this template.
     * </p>
     * </important> <note>
     * <p>
     * Verified Permissions is <i> <a href="https://wikipedia.org/wiki/Eventual_consistency">eventually consistent</a>
     * </i>. It can take a few seconds for a new or changed element to propagate through the service and be visible in
     * the results of other Verified Permissions operations.
     * </p>
     * </note>
     * 
     * @param updatePolicyTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePolicyTemplate operation returned by the service.
     * @sample AmazonVerifiedPermissionsAsyncHandler.UpdatePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePolicyTemplateResult> updatePolicyTemplateAsync(UpdatePolicyTemplateRequest updatePolicyTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePolicyTemplateRequest, UpdatePolicyTemplateResult> asyncHandler);

}

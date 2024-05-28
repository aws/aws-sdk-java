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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.verifiedpermissions.model.*;

/**
 * Interface for accessing Amazon Verified Permissions.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.verifiedpermissions.AbstractAmazonVerifiedPermissions} instead.
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
public interface AmazonVerifiedPermissions {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "verifiedpermissions";

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
     * @return Result of the BatchIsAuthorized operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.BatchIsAuthorized
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorized"
     *      target="_top">AWS API Documentation</a>
     */
    BatchIsAuthorizedResult batchIsAuthorized(BatchIsAuthorizedRequest batchIsAuthorizedRequest);

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
     * @return Result of the BatchIsAuthorizedWithToken operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.BatchIsAuthorizedWithToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorizedWithToken"
     *      target="_top">AWS API Documentation</a>
     */
    BatchIsAuthorizedWithTokenResult batchIsAuthorizedWithToken(BatchIsAuthorizedWithTokenRequest batchIsAuthorizedWithTokenRequest);

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
     * @return Result of the CreateIdentitySource operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ServiceQuotaExceededException
     *         The request failed because it would cause a service quota to be exceeded.
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.CreateIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreateIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIdentitySourceResult createIdentitySource(CreateIdentitySourceRequest createIdentitySourceRequest);

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
     * @return Result of the CreatePolicy operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ServiceQuotaExceededException
     *         The request failed because it would cause a service quota to be exceeded.
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.CreatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePolicyResult createPolicy(CreatePolicyRequest createPolicyRequest);

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
     * @return Result of the CreatePolicyStore operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ServiceQuotaExceededException
     *         The request failed because it would cause a service quota to be exceeded.
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.CreatePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePolicyStoreResult createPolicyStore(CreatePolicyStoreRequest createPolicyStoreRequest);

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
     * @return Result of the CreatePolicyTemplate operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ServiceQuotaExceededException
     *         The request failed because it would cause a service quota to be exceeded.
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.CreatePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePolicyTemplateResult createPolicyTemplate(CreatePolicyTemplateRequest createPolicyTemplateRequest);

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
     * @return Result of the DeleteIdentitySource operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.DeleteIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeleteIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdentitySourceResult deleteIdentitySource(DeleteIdentitySourceRequest deleteIdentitySourceRequest);

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
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

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
     * @return Result of the DeletePolicyStore operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.DeletePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePolicyStoreResult deletePolicyStore(DeletePolicyStoreRequest deletePolicyStoreRequest);

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
     * @return Result of the DeletePolicyTemplate operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.DeletePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/DeletePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePolicyTemplateResult deletePolicyTemplate(DeletePolicyTemplateRequest deletePolicyTemplateRequest);

    /**
     * <p>
     * Retrieves the details about the specified identity source.
     * </p>
     * 
     * @param getIdentitySourceRequest
     * @return Result of the GetIdentitySource operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.GetIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdentitySourceResult getIdentitySource(GetIdentitySourceRequest getIdentitySourceRequest);

    /**
     * <p>
     * Retrieves information about the specified policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Retrieves details about a policy store.
     * </p>
     * 
     * @param getPolicyStoreRequest
     * @return Result of the GetPolicyStore operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.GetPolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    GetPolicyStoreResult getPolicyStore(GetPolicyStoreRequest getPolicyStoreRequest);

    /**
     * <p>
     * Retrieve the details for the specified policy template in the specified policy store.
     * </p>
     * 
     * @param getPolicyTemplateRequest
     * @return Result of the GetPolicyTemplate operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.GetPolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetPolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetPolicyTemplateResult getPolicyTemplate(GetPolicyTemplateRequest getPolicyTemplateRequest);

    /**
     * <p>
     * Retrieve the details for the specified schema in the specified policy store.
     * </p>
     * 
     * @param getSchemaRequest
     * @return Result of the GetSchema operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/GetSchema" target="_top">AWS
     *      API Documentation</a>
     */
    GetSchemaResult getSchema(GetSchemaRequest getSchemaRequest);

    /**
     * <p>
     * Makes an authorization decision about a service request described in the parameters. The information in the
     * parameters can also define additional context that Verified Permissions can include in the evaluation. The
     * request is evaluated against all matching policies in the specified policy store. The result of the decision is
     * either <code>Allow</code> or <code>Deny</code>, along with a list of the policies that resulted in the decision.
     * </p>
     * 
     * @param isAuthorizedRequest
     * @return Result of the IsAuthorized operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.IsAuthorized
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorized"
     *      target="_top">AWS API Documentation</a>
     */
    IsAuthorizedResult isAuthorized(IsAuthorizedRequest isAuthorizedRequest);

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
     * @return Result of the IsAuthorizedWithToken operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.IsAuthorizedWithToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorizedWithToken"
     *      target="_top">AWS API Documentation</a>
     */
    IsAuthorizedWithTokenResult isAuthorizedWithToken(IsAuthorizedWithTokenRequest isAuthorizedWithTokenRequest);

    /**
     * <p>
     * Returns a paginated list of all of the identity sources defined in the specified policy store.
     * </p>
     * 
     * @param listIdentitySourcesRequest
     * @return Result of the ListIdentitySources operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.ListIdentitySources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListIdentitySources"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdentitySourcesResult listIdentitySources(ListIdentitySourcesRequest listIdentitySourcesRequest);

    /**
     * <p>
     * Returns a paginated list of all policies stored in the specified policy store.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Returns a paginated list of all policy stores in the calling Amazon Web Services account.
     * </p>
     * 
     * @param listPolicyStoresRequest
     * @return Result of the ListPolicyStores operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.ListPolicyStores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyStores"
     *      target="_top">AWS API Documentation</a>
     */
    ListPolicyStoresResult listPolicyStores(ListPolicyStoresRequest listPolicyStoresRequest);

    /**
     * <p>
     * Returns a paginated list of all policy templates in the specified policy store.
     * </p>
     * 
     * @param listPolicyTemplatesRequest
     * @return Result of the ListPolicyTemplates operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.ListPolicyTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListPolicyTemplatesResult listPolicyTemplates(ListPolicyTemplatesRequest listPolicyTemplatesRequest);

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
     * @return Result of the PutSchema operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ServiceQuotaExceededException
     *         The request failed because it would cause a service quota to be exceeded.
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.PutSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PutSchema" target="_top">AWS
     *      API Documentation</a>
     */
    PutSchemaResult putSchema(PutSchemaRequest putSchemaRequest);

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
     * @return Result of the UpdateIdentitySource operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.UpdateIdentitySource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateIdentitySource"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdentitySourceResult updateIdentitySource(UpdateIdentitySourceRequest updateIdentitySourceRequest);

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
     * @return Result of the UpdatePolicy operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ServiceQuotaExceededException
     *         The request failed because it would cause a service quota to be exceeded.
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.UpdatePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePolicyResult updatePolicy(UpdatePolicyRequest updatePolicyRequest);

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
     * @return Result of the UpdatePolicyStore operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.UpdatePolicyStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyStore"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePolicyStoreResult updatePolicyStore(UpdatePolicyStoreRequest updatePolicyStoreRequest);

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
     * @return Result of the UpdatePolicyTemplate operation returned by the service.
     * @throws ValidationException
     *         The request failed because one or more input parameters don't satisfy their constraint requirements. The
     *         output is provided as a list of fields and a reason for each field that isn't valid.</p>
     *         <p>
     *         The possible reasons include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UnrecognizedEntityType</b>
     *         </p>
     *         <p>
     *         The policy includes an entity type that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnrecognizedActionId</b>
     *         </p>
     *         <p>
     *         The policy includes an action id that isn't found in the schema.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>InvalidActionApplication</b>
     *         </p>
     *         <p>
     *         The policy includes an action that, according to the schema, doesn't support the specified principal and
     *         resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnexpectedType</b>
     *         </p>
     *         <p>
     *         The policy included an operand that isn't a valid type for the specified operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IncompatibleTypes</b>
     *         </p>
     *         <p>
     *         The types of elements included in a <code>set</code>, or the types of expressions used in an
     *         <code>if...then...else</code> clause aren't compatible in this context.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MissingAttribute</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that isn't specified in the schema. Test for
     *         the existence of the attribute first before attempting to access its value. For more information, see the
     *         <a href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnsafeOptionalAttributeAccess</b>
     *         </p>
     *         <p>
     *         The policy attempts to access a record or entity attribute that is optional and isn't guaranteed to be
     *         present. Test for the existence of the attribute first before attempting to access its value. For more
     *         information, see the <a
     *         href="https://docs.cedarpolicy.com/policies/syntax-operators.html#has-presence-of-attribute-test">has
     *         (presence of attribute test) operator</a> in the <i>Cedar Policy Language Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ImpossiblePolicy</b>
     *         </p>
     *         <p>
     *         Cedar has determined that a policy condition always evaluates to false. If the policy is always false, it
     *         can never apply to any query, and so it can never affect an authorization decision.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>WrongNumberArguments</b>
     *         </p>
     *         <p>
     *         The policy references an extension type with the wrong number of arguments.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FunctionArgumentValidationError</b>
     *         </p>
     *         <p>
     *         Cedar couldn't parse the argument passed to an extension type. For example, a string that is to be parsed
     *         as an IPv4 address can contain only digits and the period character.
     *         </p>
     *         </li>
     * @throws ConflictException
     *         The request failed because another request to modify a resource occurred at the same.
     * @throws AccessDeniedException
     *         You don't have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request failed because it references a resource that doesn't exist.
     * @throws ThrottlingException
     *         The request failed because it exceeded a throttling quota.
     * @throws InternalServerException
     *         The request failed because of an internal error. Try your request again later
     * @sample AmazonVerifiedPermissions.UpdatePolicyTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdatePolicyTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePolicyTemplateResult updatePolicyTemplate(UpdatePolicyTemplateRequest updatePolicyTemplateRequest);

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

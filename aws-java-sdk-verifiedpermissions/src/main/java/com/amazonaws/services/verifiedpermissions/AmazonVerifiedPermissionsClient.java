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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.verifiedpermissions.AmazonVerifiedPermissionsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.verifiedpermissions.model.*;

import com.amazonaws.services.verifiedpermissions.model.transform.*;

/**
 * Client for accessing Amazon Verified Permissions. All service calls made using this client are blocking, and will not
 * return until the service call completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonVerifiedPermissionsClient extends AmazonWebServiceClient implements AmazonVerifiedPermissions {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonVerifiedPermissions.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "verifiedpermissions";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.verifiedpermissions.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.verifiedpermissions.model.AmazonVerifiedPermissionsException.class));

    public static AmazonVerifiedPermissionsClientBuilder builder() {
        return AmazonVerifiedPermissionsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Verified Permissions using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonVerifiedPermissionsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Verified Permissions using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonVerifiedPermissionsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("verifiedpermissions.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/verifiedpermissions/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/verifiedpermissions/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public BatchIsAuthorizedResult batchIsAuthorized(BatchIsAuthorizedRequest request) {
        request = beforeClientExecution(request);
        return executeBatchIsAuthorized(request);
    }

    @SdkInternalApi
    final BatchIsAuthorizedResult executeBatchIsAuthorized(BatchIsAuthorizedRequest batchIsAuthorizedRequest) {

        ExecutionContext executionContext = createExecutionContext(batchIsAuthorizedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchIsAuthorizedRequest> request = null;
        Response<BatchIsAuthorizedResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchIsAuthorizedRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchIsAuthorizedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchIsAuthorized");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchIsAuthorizedResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchIsAuthorizedResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public BatchIsAuthorizedWithTokenResult batchIsAuthorizedWithToken(BatchIsAuthorizedWithTokenRequest request) {
        request = beforeClientExecution(request);
        return executeBatchIsAuthorizedWithToken(request);
    }

    @SdkInternalApi
    final BatchIsAuthorizedWithTokenResult executeBatchIsAuthorizedWithToken(BatchIsAuthorizedWithTokenRequest batchIsAuthorizedWithTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(batchIsAuthorizedWithTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchIsAuthorizedWithTokenRequest> request = null;
        Response<BatchIsAuthorizedWithTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchIsAuthorizedWithTokenRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchIsAuthorizedWithTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchIsAuthorizedWithToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchIsAuthorizedWithTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchIsAuthorizedWithTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateIdentitySourceResult createIdentitySource(CreateIdentitySourceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateIdentitySource(request);
    }

    @SdkInternalApi
    final CreateIdentitySourceResult executeCreateIdentitySource(CreateIdentitySourceRequest createIdentitySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(createIdentitySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateIdentitySourceRequest> request = null;
        Response<CreateIdentitySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateIdentitySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createIdentitySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateIdentitySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateIdentitySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateIdentitySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicy(request);
    }

    @SdkInternalApi
    final CreatePolicyResult executeCreatePolicy(CreatePolicyRequest createPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyRequest> request = null;
        Response<CreatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreatePolicyStoreResult createPolicyStore(CreatePolicyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicyStore(request);
    }

    @SdkInternalApi
    final CreatePolicyStoreResult executeCreatePolicyStore(CreatePolicyStoreRequest createPolicyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(createPolicyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyStoreRequest> request = null;
        Response<CreatePolicyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPolicyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePolicyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePolicyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreatePolicyTemplateResult createPolicyTemplate(CreatePolicyTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePolicyTemplate(request);
    }

    @SdkInternalApi
    final CreatePolicyTemplateResult executeCreatePolicyTemplate(CreatePolicyTemplateRequest createPolicyTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createPolicyTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePolicyTemplateRequest> request = null;
        Response<CreatePolicyTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePolicyTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPolicyTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePolicyTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePolicyTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePolicyTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteIdentitySourceResult deleteIdentitySource(DeleteIdentitySourceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteIdentitySource(request);
    }

    @SdkInternalApi
    final DeleteIdentitySourceResult executeDeleteIdentitySource(DeleteIdentitySourceRequest deleteIdentitySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteIdentitySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteIdentitySourceRequest> request = null;
        Response<DeleteIdentitySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteIdentitySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteIdentitySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteIdentitySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteIdentitySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteIdentitySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicy(request);
    }

    @SdkInternalApi
    final DeletePolicyResult executeDeletePolicy(DeletePolicyRequest deletePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyRequest> request = null;
        Response<DeletePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeletePolicyStoreResult deletePolicyStore(DeletePolicyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicyStore(request);
    }

    @SdkInternalApi
    final DeletePolicyStoreResult executeDeletePolicyStore(DeletePolicyStoreRequest deletePolicyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyStoreRequest> request = null;
        Response<DeletePolicyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeletePolicyTemplateResult deletePolicyTemplate(DeletePolicyTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePolicyTemplate(request);
    }

    @SdkInternalApi
    final DeletePolicyTemplateResult executeDeletePolicyTemplate(DeletePolicyTemplateRequest deletePolicyTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePolicyTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePolicyTemplateRequest> request = null;
        Response<DeletePolicyTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePolicyTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePolicyTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePolicyTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePolicyTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePolicyTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetIdentitySourceResult getIdentitySource(GetIdentitySourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetIdentitySource(request);
    }

    @SdkInternalApi
    final GetIdentitySourceResult executeGetIdentitySource(GetIdentitySourceRequest getIdentitySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getIdentitySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetIdentitySourceRequest> request = null;
        Response<GetIdentitySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetIdentitySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getIdentitySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetIdentitySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetIdentitySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetIdentitySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicy(request);
    }

    @SdkInternalApi
    final GetPolicyResult executeGetPolicy(GetPolicyRequest getPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyRequest> request = null;
        Response<GetPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetPolicyStoreResult getPolicyStore(GetPolicyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicyStore(request);
    }

    @SdkInternalApi
    final GetPolicyStoreResult executeGetPolicyStore(GetPolicyStoreRequest getPolicyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyStoreRequest> request = null;
        Response<GetPolicyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetPolicyTemplateResult getPolicyTemplate(GetPolicyTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetPolicyTemplate(request);
    }

    @SdkInternalApi
    final GetPolicyTemplateResult executeGetPolicyTemplate(GetPolicyTemplateRequest getPolicyTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getPolicyTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPolicyTemplateRequest> request = null;
        Response<GetPolicyTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPolicyTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPolicyTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPolicyTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPolicyTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPolicyTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public GetSchemaResult getSchema(GetSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchema(request);
    }

    @SdkInternalApi
    final GetSchemaResult executeGetSchema(GetSchemaRequest getSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(getSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSchemaRequest> request = null;
        Response<GetSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSchemaResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public IsAuthorizedResult isAuthorized(IsAuthorizedRequest request) {
        request = beforeClientExecution(request);
        return executeIsAuthorized(request);
    }

    @SdkInternalApi
    final IsAuthorizedResult executeIsAuthorized(IsAuthorizedRequest isAuthorizedRequest) {

        ExecutionContext executionContext = createExecutionContext(isAuthorizedRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IsAuthorizedRequest> request = null;
        Response<IsAuthorizedResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IsAuthorizedRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(isAuthorizedRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IsAuthorized");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IsAuthorizedResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new IsAuthorizedResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public IsAuthorizedWithTokenResult isAuthorizedWithToken(IsAuthorizedWithTokenRequest request) {
        request = beforeClientExecution(request);
        return executeIsAuthorizedWithToken(request);
    }

    @SdkInternalApi
    final IsAuthorizedWithTokenResult executeIsAuthorizedWithToken(IsAuthorizedWithTokenRequest isAuthorizedWithTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(isAuthorizedWithTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IsAuthorizedWithTokenRequest> request = null;
        Response<IsAuthorizedWithTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IsAuthorizedWithTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(isAuthorizedWithTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "IsAuthorizedWithToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IsAuthorizedWithTokenResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new IsAuthorizedWithTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListIdentitySourcesResult listIdentitySources(ListIdentitySourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListIdentitySources(request);
    }

    @SdkInternalApi
    final ListIdentitySourcesResult executeListIdentitySources(ListIdentitySourcesRequest listIdentitySourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listIdentitySourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListIdentitySourcesRequest> request = null;
        Response<ListIdentitySourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListIdentitySourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listIdentitySourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListIdentitySources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListIdentitySourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListIdentitySourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicies(request);
    }

    @SdkInternalApi
    final ListPoliciesResult executeListPolicies(ListPoliciesRequest listPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPoliciesRequest> request = null;
        Response<ListPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListPolicyStoresResult listPolicyStores(ListPolicyStoresRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicyStores(request);
    }

    @SdkInternalApi
    final ListPolicyStoresResult executeListPolicyStores(ListPolicyStoresRequest listPolicyStoresRequest) {

        ExecutionContext executionContext = createExecutionContext(listPolicyStoresRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyStoresRequest> request = null;
        Response<ListPolicyStoresResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyStoresRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPolicyStoresRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicyStores");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPolicyStoresResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPolicyStoresResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListPolicyTemplatesResult listPolicyTemplates(ListPolicyTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListPolicyTemplates(request);
    }

    @SdkInternalApi
    final ListPolicyTemplatesResult executeListPolicyTemplates(ListPolicyTemplatesRequest listPolicyTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listPolicyTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPolicyTemplatesRequest> request = null;
        Response<ListPolicyTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPolicyTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPolicyTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPolicyTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPolicyTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPolicyTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public PutSchemaResult putSchema(PutSchemaRequest request) {
        request = beforeClientExecution(request);
        return executePutSchema(request);
    }

    @SdkInternalApi
    final PutSchemaResult executePutSchema(PutSchemaRequest putSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(putSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSchemaRequest> request = null;
        Response<PutSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutSchemaResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateIdentitySourceResult updateIdentitySource(UpdateIdentitySourceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateIdentitySource(request);
    }

    @SdkInternalApi
    final UpdateIdentitySourceResult executeUpdateIdentitySource(UpdateIdentitySourceRequest updateIdentitySourceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateIdentitySourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateIdentitySourceRequest> request = null;
        Response<UpdateIdentitySourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateIdentitySourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateIdentitySourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateIdentitySource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateIdentitySourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateIdentitySourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdatePolicyResult updatePolicy(UpdatePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePolicy(request);
    }

    @SdkInternalApi
    final UpdatePolicyResult executeUpdatePolicy(UpdatePolicyRequest updatePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePolicyRequest> request = null;
        Response<UpdatePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdatePolicyStoreResult updatePolicyStore(UpdatePolicyStoreRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePolicyStore(request);
    }

    @SdkInternalApi
    final UpdatePolicyStoreResult executeUpdatePolicyStore(UpdatePolicyStoreRequest updatePolicyStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePolicyStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePolicyStoreRequest> request = null;
        Response<UpdatePolicyStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePolicyStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePolicyStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePolicyStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePolicyStoreResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePolicyStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdatePolicyTemplateResult updatePolicyTemplate(UpdatePolicyTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePolicyTemplate(request);
    }

    @SdkInternalApi
    final UpdatePolicyTemplateResult executeUpdatePolicyTemplate(UpdatePolicyTemplateRequest updatePolicyTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePolicyTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePolicyTemplateRequest> request = null;
        Response<UpdatePolicyTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePolicyTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePolicyTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "VerifiedPermissions");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePolicyTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePolicyTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePolicyTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
